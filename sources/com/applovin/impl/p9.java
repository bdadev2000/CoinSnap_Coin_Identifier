package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* loaded from: classes.dex */
public class p9 extends m9 {
    public p9(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.m9
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f8896d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f8895c.l(), (this.f8895c.y0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f8896d.addView(kVar, this.f8897e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f8896d);
        } else {
            this.b.setContentView(this.f8896d);
        }
    }
}
