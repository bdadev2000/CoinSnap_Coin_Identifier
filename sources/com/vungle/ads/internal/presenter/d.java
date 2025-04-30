package com.vungle.ads.internal.presenter;

import com.vungle.ads.o1;

/* loaded from: classes3.dex */
public class d implements c {
    private final c adPlayCallback;

    public d(c cVar) {
        G7.j.e(cVar, "adPlayCallback");
        this.adPlayCallback = cVar;
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdClick(String str) {
        this.adPlayCallback.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        this.adPlayCallback.onAdEnd(str);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdImpression(String str) {
        this.adPlayCallback.onAdImpression(str);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdLeftApplication(String str) {
        this.adPlayCallback.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdRewarded(String str) {
        this.adPlayCallback.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.adPlayCallback.onAdStart(str);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onFailure(o1 o1Var) {
        G7.j.e(o1Var, "error");
        this.adPlayCallback.onFailure(o1Var);
    }
}
