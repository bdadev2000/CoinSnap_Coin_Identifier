package com.meta.analytics.dsp.uinode;

import androidx.fragment.app.FragmentTransaction;

/* loaded from: assets/audience_network.dex */
public abstract class CS {
    public static CR A00(int i9, long[] jArr, int[] iArr, long j7) {
        int chunkSamplesRemaining = FragmentTransaction.TRANSIT_EXIT_MASK / i9;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += IF.A04(i11, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[i10];
        int[] iArr2 = new int[i10];
        int originalSampleIndex = 0;
        long[] timestamps = new long[i10];
        int[] flags = new int[i10];
        int i12 = 0;
        int bufferSampleCount = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int rechunkedSampleCount = iArr[i13];
            long j9 = jArr[i13];
            while (rechunkedSampleCount > 0) {
                int min = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j9;
                iArr2[bufferSampleCount] = i9 * min;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i12 * j7;
                flags[bufferSampleCount] = 1;
                j9 += iArr2[bufferSampleCount];
                i12 += min;
                rechunkedSampleCount -= min;
                bufferSampleCount++;
            }
        }
        return new CR(jArr2, iArr2, originalSampleIndex, timestamps, flags, j7 * i12);
    }
}
