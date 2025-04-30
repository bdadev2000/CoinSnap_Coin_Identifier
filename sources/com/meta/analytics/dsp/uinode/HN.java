package com.meta.analytics.dsp.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HN implements S1 {
    public final C1214Hw A00;
    public final S6 A01;

    public HN(C1214Hw c1214Hw, S6 s62) {
        this.A00 = c1214Hw;
        this.A01 = s62;
    }

    @Override // com.meta.analytics.dsp.uinode.S1
    public void A3Z(Map<InterfaceC1454Rj, S6> map, Map<SyncModifiableBundle, EnumC1464Rt> map2) {
        map.put(this.A00, this.A01);
    }
}
