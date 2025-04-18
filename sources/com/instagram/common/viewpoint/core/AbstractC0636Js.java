package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0636Js implements SX {
    public final SP A00;
    public final AnonymousClass79 A01;

    public AbstractC0636Js(AnonymousClass79 anonymousClass79, SP sp) {
        this.A01 = anonymousClass79;
        this.A00 = sp;
    }

    @Override // com.instagram.common.viewpoint.core.SX
    public void A3v(Map<SF, EnumC0851Sc> map, Map<SyncModifiableBundle, SP> map2) {
        map2.put(null, this.A00);
    }
}
