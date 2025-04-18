package com.applovin.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class vc extends FrameLayout implements View.OnClickListener {
    private a a;

    /* loaded from: classes.dex */
    public interface a {
        void a(vc vcVar);
    }

    public vc(xc xcVar, Context context) {
        super(context);
        setOnClickListener(this);
        com.applovin.impl.adview.i iVar = new com.applovin.impl.adview.i(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, xcVar.e());
        iVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        iVar.a(dpToPx);
        addView(iVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, (xcVar.c() * 2) + xcVar.e());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, xcVar.f());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, xcVar.d());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.a(this);
    }

    public void setListener(a aVar) {
        this.a = aVar;
    }
}
