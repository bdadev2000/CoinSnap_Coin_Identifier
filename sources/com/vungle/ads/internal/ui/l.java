package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.util.InterfaceC2110c;

/* loaded from: classes3.dex */
public final class l implements InterfaceC2110c {
    private final com.vungle.ads.internal.presenter.b bus;
    private final String placementRefId;

    public l(com.vungle.ads.internal.presenter.b bVar, String str) {
        this.bus = bVar;
        this.placementRefId = str;
    }

    @Override // com.vungle.ads.internal.util.InterfaceC2110c
    public void onLeftApplication() {
        com.vungle.ads.internal.presenter.b bVar = this.bus;
        if (bVar != null) {
            bVar.onNext(com.vungle.ads.internal.presenter.q.OPEN, "adLeftApplication", this.placementRefId);
        }
    }
}
