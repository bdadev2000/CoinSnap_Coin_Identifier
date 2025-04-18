package com.applovin.impl;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class u9 extends m9 {
    public u9(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.applovin.impl.m9
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.widget.ImageView r17, com.applovin.impl.adview.g r18, final com.applovin.impl.adview.l r19, com.applovin.impl.o r20, android.widget.ProgressBar r21, com.applovin.impl.f3 r22, android.view.View r23, com.applovin.adview.AppLovinAdView r24, com.applovin.impl.adview.k r25, android.widget.ImageView r26, android.view.ViewGroup r27) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.u9.a(android.widget.ImageView, com.applovin.impl.adview.g, com.applovin.impl.adview.l, com.applovin.impl.o, android.widget.ProgressBar, com.applovin.impl.f3, android.view.View, com.applovin.adview.AppLovinAdView, com.applovin.impl.adview.k, android.widget.ImageView, android.view.ViewGroup):void");
    }

    @Override // com.applovin.impl.m9
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        e0.a(this.f5945d, view);
        if (gVar != null) {
            a(this.f5944c.l(), (this.f5944c.y0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.a.a(oj.M2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.a.a(oj.N2)).intValue());
            this.f5945d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.f5945d.addView(kVar, this.f5946e);
        }
    }
}
