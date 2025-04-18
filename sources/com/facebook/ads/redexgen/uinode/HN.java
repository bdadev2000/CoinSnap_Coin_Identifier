package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HN implements S1 {
    public final C0648Hw A00;
    public final S6 A01;

    public HN(C0648Hw c0648Hw, S6 s62) {
        this.A00 = c0648Hw;
        this.A01 = s62;
    }

    @Override // com.facebook.ads.redexgen.uinode.S1
    public void A3Z(Map<InterfaceC0888Rj, S6> map, Map<SyncModifiableBundle, EnumC0898Rt> map2) {
        map.put(this.A00, this.A01);
    }
}
