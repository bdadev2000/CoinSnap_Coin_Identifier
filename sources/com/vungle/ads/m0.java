package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 implements com.vungle.ads.internal.load.a {
    final /* synthetic */ String $adMarkup;
    final /* synthetic */ o0 this$0;

    public m0(o0 o0Var, String str) {
        this.this$0 = o0Var;
        this.$adMarkup = str;
    }

    @Override // com.vungle.ads.internal.load.a
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        o0 o0Var = this.this$0;
        o0Var.onLoadFailure$vungle_ads_release(o0Var, error);
    }

    @Override // com.vungle.ads.internal.load.a
    public void onSuccess(bh.z advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.this$0.onAdLoaded$vungle_ads_release(advertisement);
        o0 o0Var = this.this$0;
        o0Var.onLoadSuccess$vungle_ads_release(o0Var, this.$adMarkup);
    }
}
