package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1069aG implements C6X {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C1204cU> A00;
    public final /* synthetic */ C1068aF A01;

    public C1069aG(C1068aF c1068aF, List<C1204cU> list) {
        this.A01 = c1068aF;
        this.A00 = list;
    }

    private void A00() {
        C03055o c03055o;
        C03055o c03055o2;
        C03055o c03055o3;
        C1045Zs c1045Zs;
        C03055o c03055o4;
        C03055o c03055o5;
        C1045Zs c1045Zs2;
        c03055o = this.A01.A00;
        c03055o.A05(true);
        c03055o2 = this.A01.A00;
        c03055o2.A02();
        c03055o3 = this.A01.A00;
        c03055o3.A03(0);
        Iterator<C1204cU> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                C1204cU next = it.next();
                c1045Zs = this.A01.A01;
                WA A0K = W7.A0K();
                c03055o4 = this.A01.A00;
                W7 w7 = new W7(c1045Zs, next, null, A0K, c03055o4.A01());
                if (w7.A0y() != null && w7.A0y().A0F() != null) {
                    ((AbstractC1163bp) w7.A0y().A0F()).A00(w7);
                }
                c03055o5 = this.A01.A00;
                c1045Zs2 = this.A01.A01;
                c03055o5.A04(new NativeAd(c1045Zs2, w7));
            } else {
                KP.A00(new C1070aH(this));
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABT() {
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.C6X
    public final void ABc() {
        A00();
    }
}
