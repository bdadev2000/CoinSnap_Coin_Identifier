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

    /* renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.k f8894a;
    final Activity b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f8895c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f8896d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f8897e;

    public m9(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f8897e = layoutParams;
        this.f8895c = bVar;
        this.f8894a = kVar;
        this.b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f8896d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f8895c.l(), (this.f8895c.y0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i9, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f10754a, dVar.f10757e, dVar.f10756d, i9);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i10 = dVar.f10755c;
        layoutParams.setMargins(i10, dVar.b, i10, 0);
        layoutParams.gravity = i9;
        this.f8896d.addView(gVar, layoutParams);
    }

    public void a(View view) {
        this.f8896d.removeView(view);
    }
}
