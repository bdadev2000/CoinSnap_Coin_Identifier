package com.meta.analytics.dsp.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HT implements S1 {
    public final EnumC1464Rt A00;
    public final AnonymousClass74 A01;

    public HT(AnonymousClass74 anonymousClass74, EnumC1464Rt enumC1464Rt) {
        this.A01 = anonymousClass74;
        this.A00 = enumC1464Rt;
    }

    @Override // com.meta.analytics.dsp.uinode.S1
    public void A3Z(Map<InterfaceC1454Rj, S6> map, Map<SyncModifiableBundle, EnumC1464Rt> map2) {
        map2.put(null, this.A00);
    }
}
