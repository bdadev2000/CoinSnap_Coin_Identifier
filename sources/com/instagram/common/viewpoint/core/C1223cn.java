package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1223cn implements InterfaceC01740k {
    public final /* synthetic */ C1045Zs A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1223cn(JSONObject jSONObject, C1045Zs c1045Zs, String str) {
        this.A02 = jSONObject;
        this.A00 = c1045Zs;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01740k
    public final String A6r() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01740k
    public final Collection<String> A7B() {
        return AbstractC01750l.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01740k
    public final EnumC01730j A7c() {
        return AbstractC01750l.A00(this.A02);
    }
}
