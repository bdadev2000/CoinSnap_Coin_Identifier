package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public abstract class CX {
    public static CW A00(int i2, long[] jArr, int[] iArr, long j2) {
        int chunkSamplesRemaining = 8192 / i2;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += IK.A04(i4, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        int originalSampleIndex = 0;
        long[] timestamps = new long[i3];
        int[] flags = new int[i3];
        int i5 = 0;
        int bufferSampleCount = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int rechunkedSampleCount = iArr[i6];
            long j3 = jArr[i6];
            while (rechunkedSampleCount > 0) {
                int min = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j3;
                iArr2[bufferSampleCount] = i2 * min;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i5 * j2;
                flags[bufferSampleCount] = 1;
                j3 += iArr2[bufferSampleCount];
                i5 += min;
                rechunkedSampleCount -= min;
                bufferSampleCount++;
            }
        }
        return new CW(jArr2, iArr2, originalSampleIndex, timestamps, flags, j2 * i5);
    }
}
