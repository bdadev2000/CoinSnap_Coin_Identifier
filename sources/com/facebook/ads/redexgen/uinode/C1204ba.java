package com.facebook.ads.redexgen.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1204ba implements InterfaceC02300k {
    public final /* synthetic */ C1070Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1204ba(JSONObject jSONObject, C1070Yn c1070Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c1070Yn;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02300k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02300k
    public final Collection<String> A6n() {
        return AbstractC02310l.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02300k
    public final EnumC02290j A7E() {
        return AbstractC02310l.A00(this.A02);
    }
}
