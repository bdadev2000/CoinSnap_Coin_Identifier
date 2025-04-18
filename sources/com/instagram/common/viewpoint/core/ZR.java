package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class ZR implements SU {
    public final /* synthetic */ C1044Zr A00;
    public final /* synthetic */ K6 A01;

    public ZR(K6 k6, C1044Zr c1044Zr) {
        this.A01 = k6;
        this.A00 = c1044Zr;
    }

    @Override // com.instagram.common.viewpoint.core.SU
    public final Map<String, String> A7L() {
        return this.A01.A0A(C03738q.A00().A01(this.A00, true).A05());
    }
}
