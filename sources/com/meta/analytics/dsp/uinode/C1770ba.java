package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1770ba implements InterfaceC07960k {
    public final /* synthetic */ C1636Yn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1770ba(JSONObject jSONObject, C1636Yn c1636Yn, String str) {
        this.A02 = jSONObject;
        this.A00 = c1636Yn;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC07960k
    public final String A6T() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC07960k
    public final Collection<String> A6n() {
        return AbstractC07970l.A03(this.A00, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC07960k
    public final EnumC07950j A7E() {
        return AbstractC07970l.A00(this.A02);
    }
}
