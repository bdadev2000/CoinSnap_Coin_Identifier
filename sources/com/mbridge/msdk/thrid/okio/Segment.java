package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Segment {
    static final int SHARE_MINIMUM = 1024;
    static final int SIZE = 8192;
    final byte[] data;
    int limit;
    Segment next;
    boolean owner;
    int pos;
    Segment prev;
    boolean shared;

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i9;
        Segment segment = this.prev;
        if (segment != this) {
            if (!segment.owner) {
                return;
            }
            int i10 = this.limit - this.pos;
            int i11 = 8192 - segment.limit;
            if (segment.shared) {
                i9 = 0;
            } else {
                i9 = segment.pos;
            }
            if (i10 > i11 + i9) {
                return;
            }
            writeTo(segment, i10);
            pop();
            SegmentPool.recycle(this);
            return;
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final Segment pop() {
        Segment segment;
        Segment segment2 = this.next;
        if (segment2 != this) {
            segment = segment2;
        } else {
            segment = null;
        }
        Segment segment3 = this.prev;
        segment3.next = segment2;
        this.next.prev = segment3;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i9) {
        Segment take;
        if (i9 > 0 && i9 <= this.limit - this.pos) {
            if (i9 >= SHARE_MINIMUM) {
                take = sharedCopy();
            } else {
                take = SegmentPool.take();
                System.arraycopy(this.data, this.pos, take.data, 0, i9);
            }
            take.limit = take.pos + i9;
            this.pos += i9;
            this.prev.push(take);
            return take;
        }
        throw new IllegalArgumentException();
    }

    public final Segment unsharedCopy() {
        return new Segment((byte[]) this.data.clone(), this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment segment, int i9) {
        if (segment.owner) {
            int i10 = segment.limit;
            if (i10 + i9 > 8192) {
                if (!segment.shared) {
                    int i11 = segment.pos;
                    if ((i10 + i9) - i11 <= 8192) {
                        byte[] bArr = segment.data;
                        System.arraycopy(bArr, i11, bArr, 0, i10 - i11);
                        segment.limit -= segment.pos;
                        segment.pos = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.data, this.pos, segment.data, segment.limit, i9);
            segment.limit += i9;
            this.pos += i9;
            return;
        }
        throw new IllegalArgumentException();
    }

    public Segment(byte[] bArr, int i9, int i10, boolean z8, boolean z9) {
        this.data = bArr;
        this.pos = i9;
        this.limit = i10;
        this.shared = z8;
        this.owner = z9;
    }
}
