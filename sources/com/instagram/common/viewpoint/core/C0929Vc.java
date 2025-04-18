package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0929Vc implements InterfaceC0737Ns {
    public static byte[] A01;
    public final /* synthetic */ CI A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -55, -36, -51, -51, -52, -39, -52, -53, -58, -54, -45, -48, -54, -46, -58, -48, -56, -55, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43};
    }

    public C0929Vc(CI ci) {
        this.A00 = ci;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ACw(String str) {
        this.A00.A0C.setProgress(100);
        ((VY) this.A00).A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ACy(String str) {
        int i2;
        ((VY) this.A00).A05 = true;
        this.A00.A0B.setUrl(str);
        i2 = this.A00.A00;
        if (i2 > 1) {
            this.A00.A0H(A00(0, 34, 31));
        }
        CI.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADG(int i2) {
        if (((VY) this.A00).A05) {
            this.A00.A0C.setProgress(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADJ(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADL() {
        this.A00.A0A.ABR(14);
    }
}
