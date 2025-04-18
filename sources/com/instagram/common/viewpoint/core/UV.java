package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UV implements InterfaceC0737Ns {
    public static byte[] A01;
    public final /* synthetic */ UQ A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, 61, 59, 53, 72, 61, 67, 66, 51, 61, 53, 54};
    }

    public UV(UQ uq) {
        this.A00 = uq;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ACw(String str) {
        C0729Nk c0729Nk;
        C0729Nk c0729Nk2;
        AbstractC1187cD abstractC1187cD;
        C0925Uy c0925Uy;
        AbstractC1187cD abstractC1187cD2;
        C0925Uy c0925Uy2;
        this.A00.A0U = false;
        c0729Nk = this.A00.A0I;
        c0729Nk.setProgress(100);
        c0729Nk2 = this.A00.A0I;
        M3.A0N(c0729Nk2, 8);
        abstractC1187cD = this.A00.A0G;
        if (abstractC1187cD.A1B()) {
            c0925Uy = this.A00.A0J;
            if (c0925Uy != null) {
                abstractC1187cD2 = this.A00.A0G;
                String A0f = abstractC1187cD2.A0f();
                if (!TextUtils.isEmpty(A0f)) {
                    c0925Uy2 = this.A00.A0J;
                    c0925Uy2.loadUrl(A0f);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ACy(String str) {
        C0729Nk c0729Nk;
        C0728Nj c0728Nj;
        boolean z2;
        int i2;
        this.A00.A0U = true;
        c0729Nk = this.A00.A0I;
        M3.A0N(c0729Nk, 0);
        c0728Nj = this.A00.A0H;
        c0728Nj.setUrl(str);
        z2 = this.A00.A0T;
        if (!z2) {
            i2 = this.A00.A01;
            if (i2 > 1) {
                this.A00.A0T = true;
                this.A00.A0f(A00(0, 19, 108));
            }
        }
        UQ.A03(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADG(int i2) {
        boolean z2;
        C0729Nk c0729Nk;
        z2 = this.A00.A0U;
        if (z2) {
            c0729Nk = this.A00.A0I;
            c0729Nk.setProgress(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADJ(String str) {
        C0728Nj c0728Nj;
        c0728Nj = this.A00.A0H;
        c0728Nj.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADL() {
        C0757Om c0757Om;
        c0757Om = this.A00.A0L;
        c0757Om.A0A().ABR(14);
    }
}
