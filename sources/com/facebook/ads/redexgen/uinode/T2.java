package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T2 implements NS {
    public static byte[] A01;
    public final /* synthetic */ C0928Sx A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43, -58, -48, -56, -55};
    }

    public T2(C0928Sx c0928Sx) {
        this.A00 = c0928Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACT(String str) {
        NK nk;
        NK nk2;
        this.A00.A0Q = false;
        nk = this.A00.A0F;
        nk.setProgress(100);
        nk2 = this.A00.A0F;
        AbstractC0737Lo.A0N(nk2, 8);
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACV(String str) {
        NK nk;
        NJ nj;
        boolean z10;
        int i10;
        this.A00.A0Q = true;
        nk = this.A00.A0F;
        AbstractC0737Lo.A0N(nk, 0);
        nj = this.A00.A0E;
        nj.setUrl(str);
        z10 = this.A00.A0P;
        if (!z10) {
            i10 = this.A00.A02;
            if (i10 > 1) {
                this.A00.A0P = true;
                this.A00.A0j(A00(0, 19, 97));
            }
        }
        C0928Sx.A08(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACn(int i10) {
        boolean z10;
        NK nk;
        z10 = this.A00.A0Q;
        if (z10) {
            nk = this.A00.A0F;
            nk.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACq(String str) {
        NJ nj;
        nj = this.A00.A0E;
        nj.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.NS
    public final void ACs() {
        ((PQ) this.A00).A09.AB0(14);
    }
}
