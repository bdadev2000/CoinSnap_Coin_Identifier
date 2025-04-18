package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1235cH {
    public static C1235cH A02 = null;
    public final C1247cT A00;
    public final C1245cR A01;

    public C1235cH(AbstractC1251cY abstractC1251cY, C1245cR c1245cR, C1247cT c1247cT) {
        this.A00 = c1247cT;
        this.A01 = c1245cR;
        abstractC1251cY.A02(new H2(c1245cR));
    }

    public static C1235cH A00(AbstractC1251cY abstractC1251cY, InterfaceC1255cc interfaceC1255cc, HB hb2) {
        C1235cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C1247cT c1247cT = new C1247cT();
        return new C1235cH(abstractC1251cY, new C1245cR(interfaceC1255cc, new HL(), hb2, c1247cT, new Handler(Looper.getMainLooper())), c1247cT);
    }

    public final void A01(cX cXVar) {
        this.A01.A09(cXVar);
    }

    public final void A02(InterfaceC1249cV interfaceC1249cV) {
        this.A01.A0A(interfaceC1249cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C1253ca c1253ca) {
        this.A00.A02(dspViewableNode, c1253ca);
    }
}
