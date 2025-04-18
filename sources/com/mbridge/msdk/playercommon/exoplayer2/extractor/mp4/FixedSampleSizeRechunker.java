package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* loaded from: classes4.dex */
    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i10;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j3;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i10, long[] jArr, int[] iArr, long j3) {
        int i11 = 8192 / i10;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += Util.ceilDivide(i13, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            long j10 = jArr[i17];
            while (i18 > 0) {
                int min = Math.min(i11, i18);
                jArr2[i15] = j10;
                int i19 = i10 * min;
                iArr2[i15] = i19;
                i16 = Math.max(i16, i19);
                jArr3[i15] = i14 * j3;
                iArr3[i15] = 1;
                j10 += iArr2[i15];
                i14 += min;
                i18 -= min;
                i15++;
            }
        }
        return new Results(jArr2, iArr2, i16, jArr3, iArr3, j3 * i14);
    }
}
