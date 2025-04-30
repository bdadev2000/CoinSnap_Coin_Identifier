package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YR implements InterfaceC09667i {
    public final C09647f A00;

    public YR(C09647f c09647f) {
        this.A00 = c09647f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09667i
    public final Map<String, String> A4n() {
        return C09838d.A01(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09667i
    public final Map<String, String> A61() {
        return C8J.A02();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09667i
    public final String A7F() {
        return C8J.A00();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09667i
    public final String A7H() {
        return C6E.A00().A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09667i
    public final boolean A94() {
        return C1278Kp.A00().A03();
    }
}
