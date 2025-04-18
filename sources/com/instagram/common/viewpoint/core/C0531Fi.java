package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.Fi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0531Fi extends AbstractC1168bu {
    public C0531Fi(C1045Zs c1045Zs, C02081t c02081t) {
        super(c1045Zs, c02081t);
    }

    private C1166bs A00(Runnable runnable) {
        return new C1166bs(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final C1E A0H() {
        C1209cZ successfullyLoadedAdapter = (C1209cZ) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0O() {
        C1209cZ interstitialAdapter = (C1209cZ) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0Q(InterfaceC01780p interfaceC01780p, C8W c8w, C8U c8u, C02091u c02091u) {
        C1209cZ c1209cZ = (C1209cZ) interfaceC01780p;
        C1167bt c1167bt = new C1167bt(this, c02091u, c1209cZ);
        A0G().postDelayed(c1167bt, c8w.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1209cZ.A0A(this.A0B, A00(c1167bt), c02091u, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
