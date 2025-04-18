package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SegmentPool {
    static final long MAX_SIZE = 65536;
    static long byteCount;

    @Nullable
    static Segment next;

    private SegmentPool() {
    }

    public static void recycle(Segment segment) {
        if (segment.next == null && segment.prev == null) {
            if (segment.shared) {
                return;
            }
            synchronized (SegmentPool.class) {
                long j3 = byteCount;
                if (j3 + 8192 > MAX_SIZE) {
                    return;
                }
                byteCount = j3 + 8192;
                segment.next = next;
                segment.limit = 0;
                segment.pos = 0;
                next = segment;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static Segment take() {
        synchronized (SegmentPool.class) {
            Segment segment = next;
            if (segment != null) {
                next = segment.next;
                segment.next = null;
                byteCount -= 8192;
                return segment;
            }
            return new Segment();
        }
    }
}
