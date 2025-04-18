package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VB implements QT {
    public static byte[] A01;
    public final /* synthetic */ VA A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    public VB(VA va) {
        this.A00 = va;
    }

    public /* synthetic */ VB(VA va, VH vh) {
        this(va);
    }

    @Override // com.instagram.common.viewpoint.core.QT
    public final void ABe() {
        this.A00.A0U(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.QT
    public final void ACA() {
        boolean z2;
        AbstractC1187cD abstractC1187cD;
        MR mr;
        N9 n9;
        J7 j7;
        AbstractC1187cD abstractC1187cD2;
        QV qv;
        QV qv2;
        C1045Zs c1045Zs;
        N9 n92;
        AbstractC1187cD abstractC1187cD3;
        AbstractC1187cD abstractC1187cD4;
        C1045Zs c1045Zs2;
        AbstractC1187cD abstractC1187cD5;
        AbstractC1187cD abstractC1187cD6;
        C1045Zs c1045Zs3;
        z2 = this.A00.A0Z;
        if (!z2) {
            abstractC1187cD = this.A00.A0I;
            if (!TextUtils.isEmpty(abstractC1187cD.A1U())) {
                j7 = this.A00.A0M;
                abstractC1187cD2 = this.A00.A0I;
                String A1U = abstractC1187cD2.A1U();
                O8 o8 = new O8();
                qv = this.A00.A07;
                O8 A03 = o8.A03(qv.getViewabilityChecker());
                qv2 = this.A00.A07;
                j7.AA6(A1U, A03.A02(qv2.getTouchDataRecorder()).A05());
                c1045Zs = this.A00.A0L;
                C0651Kh A00 = C0651Kh.A00(c1045Zs);
                n92 = this.A00.A0R;
                String A83 = n92.A83();
                abstractC1187cD3 = this.A00.A0I;
                A00.A0E(A83, abstractC1187cD3.A1U());
                abstractC1187cD4 = this.A00.A0I;
                C1T A1Q = abstractC1187cD4.A1Q();
                c1045Zs2 = this.A00.A0L;
                C1T.A07(A1Q, c1045Zs2);
                abstractC1187cD5 = this.A00.A0I;
                String A0a = abstractC1187cD5.A0a();
                abstractC1187cD6 = this.A00.A0I;
                C2M.A02(A0a, AbstractC0671Le.A00(abstractC1187cD6.A0c()));
                c1045Zs3 = this.A00.A0L;
                c1045Zs3.A0E().A36();
            }
            mr = this.A00.A0Q;
            n9 = this.A00.A0R;
            mr.A4P(n9.A7Z());
        }
    }

    @Override // com.instagram.common.viewpoint.core.QT
    public final void ACV() {
        MR mr;
        N9 n9;
        mr = this.A00.A0Q;
        n9 = this.A00.A0R;
        mr.A4P(n9.A7M());
    }

    @Override // com.instagram.common.viewpoint.core.QT
    public final void AEC() {
        MR mr;
        mr = this.A00.A0Q;
        mr.ABR(15);
    }
}
