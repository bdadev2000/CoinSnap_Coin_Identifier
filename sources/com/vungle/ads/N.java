package com.vungle.ads;

import c7.C0665z;

/* loaded from: classes3.dex */
public final class N implements com.vungle.ads.internal.load.a {
    final /* synthetic */ String $adMarkup;
    final /* synthetic */ P this$0;

    public N(P p2, String str) {
        this.this$0 = p2;
        this.$adMarkup = str;
    }

    @Override // com.vungle.ads.internal.load.a
    public void onFailure(o1 o1Var) {
        G7.j.e(o1Var, "error");
        P p2 = this.this$0;
        p2.onLoadFailure$vungle_ads_release(p2, o1Var);
    }

    @Override // com.vungle.ads.internal.load.a
    public void onSuccess(C0665z c0665z) {
        G7.j.e(c0665z, "advertisement");
        this.this$0.onAdLoaded$vungle_ads_release(c0665z);
        P p2 = this.this$0;
        p2.onLoadSuccess$vungle_ads_release(p2, this.$adMarkup);
    }
}
