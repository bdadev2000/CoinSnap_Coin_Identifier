package com.meta.analytics.dsp.uinode;

import android.net.Uri;

/* loaded from: assets/audience_network.dex */
public final class FN {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public FN() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public FN(int i9, int[] iArr, Uri[] uriArr, long[] jArr) {
        AbstractC1192Ha.A03(iArr.length == uriArr.length);
        this.A00 = i9;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i9) {
        int i10;
        int i11 = i9 + 1;
        while (true) {
            int[] iArr = this.A01;
            int nextAdIndexToPlay = iArr.length;
            if (i11 >= nextAdIndexToPlay || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
