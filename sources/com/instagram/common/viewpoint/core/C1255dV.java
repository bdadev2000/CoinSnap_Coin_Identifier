package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1255dV {
    public static C1255dV A03 = null;
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C1265df A02;

    public C1255dV(ViewpointQeConfig viewpointQeConfig, AbstractC1271dm abstractC1271dm, C1265df c1265df, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c1265df;
        abstractC1271dm.A02(new I2(c1265df));
    }

    public static C1255dV A00(ViewpointQeConfig viewpointQeConfig, AbstractC1271dm abstractC1271dm, InterfaceC1274dq interfaceC1274dq, IA ia) {
        C1255dV localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        return new C1255dV(viewpointQeConfig, abstractC1271dm, new C1265df(viewpointQeConfig, interfaceC1274dq, new C0630Jm(), ia, viewpointRegistry, new Handler(Looper.getMainLooper())), viewpointRegistry);
    }

    public final void A01(InterfaceC1270dl interfaceC1270dl) {
        this.A02.A0B(interfaceC1270dl);
    }

    public final void A02(InterfaceC1268dj interfaceC1268dj) {
        this.A02.A0C(interfaceC1268dj);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        A04(dspViewableNode, null);
    }

    public final void A04(DspViewableNode dspViewableNode, C1276dt c1276dt) {
        if (this.A00.A00 && c1276dt != null) {
            this.A01.A04(dspViewableNode, c1276dt);
        } else {
            this.A01.A03(dspViewableNode);
        }
    }

    public final void A05(DspViewableNode dspViewableNode, C1276dt c1276dt, Cdo cdo) {
        if (this.A00.A00 && c1276dt != null) {
            this.A01.A05(dspViewableNode, c1276dt, cdo);
        } else {
            this.A01.A06(dspViewableNode, cdo);
        }
    }

    public final void A06(DspViewableNode dspViewableNode, Cdo cdo) {
        A05(dspViewableNode, null, cdo);
    }
}
