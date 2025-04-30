package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1801cH {
    public static C1801cH A02 = null;
    public final C1813cT A00;
    public final C1811cR A01;

    public C1801cH(AbstractC1817cY abstractC1817cY, C1811cR c1811cR, C1813cT c1813cT) {
        this.A00 = c1813cT;
        this.A01 = c1811cR;
        abstractC1817cY.A02(new H2(c1811cR));
    }

    public static C1801cH A00(AbstractC1817cY abstractC1817cY, InterfaceC1821cc interfaceC1821cc, HB hb) {
        C1801cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C1813cT c1813cT = new C1813cT();
        return new C1801cH(abstractC1817cY, new C1811cR(interfaceC1821cc, new HL(), hb, c1813cT, new Handler(Looper.getMainLooper())), c1813cT);
    }

    public final void A01(cX cXVar) {
        this.A01.A09(cXVar);
    }

    public final void A02(InterfaceC1815cV interfaceC1815cV) {
        this.A01.A0A(interfaceC1815cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C1819ca c1819ca) {
        this.A00.A02(dspViewableNode, c1819ca);
    }
}
