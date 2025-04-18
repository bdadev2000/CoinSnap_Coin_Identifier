package com.vungle.ads.internal.presenter;

import com.vungle.ads.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class d implements c {
    private final c adPlayCallback;

    public d(c adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.adPlayCallback = adPlayCallback;
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
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.adPlayCallback.onFailure(error);
    }
}
