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
        this.f5945d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f5944c.l(), (this.f5944c.y0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f5945d.addView(kVar, this.f5946e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f5945d);
        } else {
            this.f5943b.setContentView(this.f5945d);
        }
    }
}
