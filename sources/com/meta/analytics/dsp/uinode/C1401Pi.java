package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Pi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1401Pi {
    public final SparseArray<int[]> A00 = new SparseArray<>();

    public final void A00(int i9, int[] iArr) {
        this.A00.put(i9, iArr);
    }

    public final boolean A01(int i9) {
        return this.A00.indexOfKey(i9) >= 0;
    }

    public final int[] A02(int i9) {
        return this.A00.get(i9);
    }
}
