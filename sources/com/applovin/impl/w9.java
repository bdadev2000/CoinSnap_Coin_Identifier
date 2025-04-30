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

    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, com.applovin.impl.adview.g gVar2, C0730o c0730o, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f8896d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f8895c.l(), (this.f8895c.E0() ? 3 : 5) | 48, gVar);
        }
        if (gVar2 != null) {
            a(this.f8895c.l(), (this.f8895c.y0() ? 3 : 5) | 48, gVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f8894a.a(oj.f9896z2)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f8894a.a(oj.f9557B2)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f8894a.a(oj.f9549A2)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f8896d.addView(imageView, layoutParams);
        }
        if (c0730o != null) {
            this.f8896d.addView(c0730o, this.f8897e);
        }
        if (kVar != null) {
            this.f8896d.addView(kVar, new ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f8896d);
        } else {
            this.b.setContentView(this.f8896d);
        }
    }
}
