package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o9 {

    /* renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.j f25815a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f25816b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f25817c;
    final ViewGroup d;
    final FrameLayout.LayoutParams e;

    public o9(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.j jVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.e = layoutParams;
        this.f25817c = bVar;
        this.f25815a = jVar;
        this.f25816b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f25817c.k(), (this.f25817c.z0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i2, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f26561a, dVar.e, dVar.d, i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i3 = dVar.f26563c;
        layoutParams.setMargins(i3, dVar.f26562b, i3, 0);
        layoutParams.gravity = i2;
        this.d.addView(gVar, layoutParams);
    }

    public void a(View view) {
        this.d.removeView(view);
    }
}
