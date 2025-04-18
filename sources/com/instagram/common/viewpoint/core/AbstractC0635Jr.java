package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0635Jr implements SX {
    public final C0643Jz A00;
    public final EnumC0851Sc A01;

    public AbstractC0635Jr(C0643Jz c0643Jz, EnumC0851Sc enumC0851Sc) {
        this.A00 = c0643Jz;
        this.A01 = enumC0851Sc;
    }

    @Override // com.instagram.common.viewpoint.core.SX
    public void A3v(Map<SF, EnumC0851Sc> map, Map<SyncModifiableBundle, SP> map2) {
        map.put(this.A00, this.A01);
    }
}
