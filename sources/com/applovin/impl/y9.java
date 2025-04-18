package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes2.dex */
public class y9 extends o9 {
    public y9(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.j jVar) {
        super(bVar, activity, jVar);
    }

    @Override // com.applovin.impl.o9
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, com.applovin.impl.adview.g gVar2, o oVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f25817c.k(), (this.f25817c.G0() ? 3 : 5) | 48, gVar);
        }
        if (gVar2 != null) {
            a(this.f25817c.k(), (this.f25817c.z0() ? 3 : 5) | 48, gVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f25816b, ((Integer) this.f25815a.a(sj.E2)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f25815a.a(sj.G2)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f25816b, ((Integer) this.f25815a.a(sj.F2)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.d.addView(imageView, layoutParams);
        }
        if (oVar != null) {
            this.d.addView(oVar, this.e);
        }
        if (kVar != null) {
            this.d.addView(kVar, new ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        } else {
            this.f25816b.setContentView(this.d);
        }
    }
}
