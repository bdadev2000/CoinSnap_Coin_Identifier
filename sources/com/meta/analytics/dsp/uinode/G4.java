package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class G4 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<G5> A09;
    public final boolean A0A;

    public G4(int i9, boolean z8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray<G5> sparseArray) {
        this.A03 = i9;
        this.A0A = z8;
        this.A08 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A07 = i15;
        this.A06 = i16;
        this.A05 = i17;
        this.A09 = sparseArray;
    }

    public final void A00(G4 g42) {
        if (g42 == null) {
            return;
        }
        SparseArray<G5> sparseArray = g42.A09;
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            SparseArray<G5> sparseArray2 = this.A09;
            int i10 = sparseArray.keyAt(i9);
            sparseArray2.put(i10, sparseArray.valueAt(i9));
        }
    }
}
