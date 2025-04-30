package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes3.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* loaded from: classes3.dex */
    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j7) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i9;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j7;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i9, long[] jArr, int[] iArr, long j7) {
        int i10 = 8192 / i9;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += Util.ceilDivide(i12, i10);
        }
        long[] jArr2 = new long[i11];
        int[] iArr2 = new int[i11];
        long[] jArr3 = new long[i11];
        int[] iArr3 = new int[i11];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            long j9 = jArr[i16];
            while (i17 > 0) {
                int min = Math.min(i10, i17);
                jArr2[i14] = j9;
                int i18 = i9 * min;
                iArr2[i14] = i18;
                i15 = Math.max(i15, i18);
                jArr3[i14] = i13 * j7;
                iArr3[i14] = 1;
                j9 += iArr2[i14];
                i13 += min;
                i17 -= min;
                i14++;
            }
        }
        return new Results(jArr2, iArr2, i15, jArr3, iArr3, j7 * i13);
    }
}
