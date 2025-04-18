package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class w9 extends m9 {
    public w9(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.m9
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, com.applovin.impl.adview.g gVar2, o oVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f5945d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f5944c.l(), (this.f5944c.E0() ? 3 : 5) | 48, gVar);
        }
        if (gVar2 != null) {
            a(this.f5944c.l(), (this.f5944c.y0() ? 3 : 5) | 48, gVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f5943b, ((Integer) this.a.a(oj.f6804z2)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.a.a(oj.B2)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f5943b, ((Integer) this.a.a(oj.A2)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f5945d.addView(imageView, layoutParams);
        }
        if (oVar != null) {
            this.f5945d.addView(oVar, this.f5946e);
        }
        if (kVar != null) {
            this.f5945d.addView(kVar, new ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f5945d);
        } else {
            this.f5943b.setContentView(this.f5945d);
        }
    }
}
