package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.ad.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class m9 {
    final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f5943b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f5944c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f5945d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f5946e;

    public m9(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f5946e = layoutParams;
        this.f5944c = bVar;
        this.a = kVar;
        this.f5943b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f5945d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f5944c.l(), (this.f5944c.y0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.a, dVar.f7606e, dVar.f7605d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f7604c;
        layoutParams.setMargins(i11, dVar.f7603b, i11, 0);
        layoutParams.gravity = i10;
        this.f5945d.addView(gVar, layoutParams);
    }

    public void a(View view) {
        this.f5945d.removeView(view);
    }
}
