package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.38, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass38 extends C02583r {
    public C0443Bl A00;
    public List<QK> A01;

    public AnonymousClass38(C1045Zs c1045Zs) {
        super(c1045Zs);
        this.A00 = new C0443Bl(this, 1, null, null, null);
    }

    public final void A1y(C0833Rk c0833Rk) {
        if (this.A00 != null) {
            this.A00.A0c(c0833Rk);
        }
    }

    public C0443Bl getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
