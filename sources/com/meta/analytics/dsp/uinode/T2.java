package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T2 implements NS {
    public static byte[] A01;
    public final /* synthetic */ C1494Sx A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43, -58, -48, -56, -55};
    }

    public T2(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACT(String str) {
        NK nk;
        NK nk2;
        this.A00.A0Q = false;
        nk = this.A00.A0F;
        nk.setProgress(100);
        nk2 = this.A00.A0F;
        AbstractC1303Lo.A0N(nk2, 8);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACV(String str) {
        NK nk;
        NJ nj;
        boolean z8;
        int i9;
        this.A00.A0Q = true;
        nk = this.A00.A0F;
        AbstractC1303Lo.A0N(nk, 0);
        nj = this.A00.A0E;
        nj.setUrl(str);
        z8 = this.A00.A0P;
        if (!z8) {
            i9 = this.A00.A02;
            if (i9 > 1) {
                this.A00.A0P = true;
                this.A00.A0j(A00(0, 19, 97));
            }
        }
        C1494Sx.A08(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACn(int i9) {
        boolean z8;
        NK nk;
        z8 = this.A00.A0Q;
        if (z8) {
            nk = this.A00.A0F;
            nk.setProgress(i9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACq(String str) {
        NJ nj;
        nj = this.A00.A0E;
        nj.setTitle(str);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACs() {
        ((PQ) this.A00).A09.AB0(14);
    }
}
