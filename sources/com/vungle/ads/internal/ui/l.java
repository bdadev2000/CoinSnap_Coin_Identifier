package com.vungle.ads.internal.ui;

/* loaded from: classes4.dex */
public final class l implements com.vungle.ads.internal.util.c {
    private final com.vungle.ads.internal.presenter.b bus;
    private final String placementRefId;

    public l(com.vungle.ads.internal.presenter.b bVar, String str) {
        this.bus = bVar;
        this.placementRefId = str;
    }

    @Override // com.vungle.ads.internal.util.c
    public void onLeftApplication() {
        com.vungle.ads.internal.presenter.b bVar = this.bus;
        if (bVar != null) {
            bVar.onNext(com.vungle.ads.internal.presenter.q.OPEN, "adLeftApplication", this.placementRefId);
        }
    }
}
