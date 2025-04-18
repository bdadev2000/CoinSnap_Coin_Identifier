package okio;

import e0.q;
import java.util.Arrays;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class Segment {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @NotNull
    public final byte[] data;
    public int limit;

    @Nullable
    public Segment next;
    public boolean owner;
    public int pos;

    @Nullable
    public Segment prev;
    public boolean shared;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i2;
        Segment segment = this.prev;
        if (segment == this) {
            throw new IllegalStateException("cannot compact".toString());
        }
        p0.a.p(segment);
        if (segment.owner) {
            int i3 = this.limit - this.pos;
            Segment segment2 = this.prev;
            p0.a.p(segment2);
            int i4 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            p0.a.p(segment3);
            if (segment3.shared) {
                i2 = 0;
            } else {
                Segment segment4 = this.prev;
                p0.a.p(segment4);
                i2 = segment4.pos;
            }
            if (i3 > i4 + i2) {
                return;
            }
            Segment segment5 = this.prev;
            p0.a.p(segment5);
            writeTo(segment5, i3);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @Nullable
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        p0.a.p(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        p0.a.p(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @NotNull
    public final Segment push(@NotNull Segment segment) {
        p0.a.s(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        p0.a.p(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    @NotNull
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    @NotNull
    public final Segment split(int i2) {
        Segment take;
        if (i2 <= 0 || i2 > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i2 >= 1024) {
            take = sharedCopy();
        } else {
            take = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = take.data;
            int i3 = this.pos;
            q.Q(bArr, 0, bArr2, i3, i3 + i2);
        }
        take.limit = take.pos + i2;
        this.pos += i2;
        Segment segment = this.prev;
        p0.a.p(segment);
        segment.push(take);
        return take;
    }

    @NotNull
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        p0.a.r(copyOf, "copyOf(...)");
        return new Segment(copyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(@NotNull Segment segment, int i2) {
        p0.a.s(segment, "sink");
        if (!segment.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = segment.limit;
        int i4 = i3 + i2;
        if (i4 > 8192) {
            if (segment.shared) {
                throw new IllegalArgumentException();
            }
            int i5 = segment.pos;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = segment.data;
            q.Q(bArr, 0, bArr, i5, i3);
            segment.limit -= segment.pos;
            segment.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = segment.data;
        int i6 = segment.limit;
        int i7 = this.pos;
        q.Q(bArr2, i6, bArr3, i7, i7 + i2);
        segment.limit += i2;
        this.pos += i2;
    }

    public Segment(@NotNull byte[] bArr, int i2, int i3, boolean z2, boolean z3) {
        p0.a.s(bArr, "data");
        this.data = bArr;
        this.pos = i2;
        this.limit = i3;
        this.shared = z2;
        this.owner = z3;
    }
}
