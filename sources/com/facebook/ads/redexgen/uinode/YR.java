package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YR implements InterfaceC04007i {
    public final C03987f A00;

    public YR(C03987f c03987f) {
        this.A00 = c03987f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04007i
    public final Map<String, String> A4n() {
        return C04178d.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04007i
    public final Map<String, String> A61() {
        return C8J.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04007i
    public final String A7F() {
        return C8J.A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04007i
    public final String A7H() {
        return C6E.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04007i
    public final boolean A94() {
        return C0712Kp.A00().A03();
    }
}
