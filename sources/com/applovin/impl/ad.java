package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public class ad extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private a f22730a;

    /* loaded from: classes3.dex */
    public interface a {
        void a(ad adVar);
    }

    public ad(cd cdVar, Context context) {
        super(context);
        setOnClickListener(this);
        com.applovin.impl.adview.i iVar = new com.applovin.impl.adview.i(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, cdVar.e());
        iVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        iVar.a(dpToPx);
        addView(iVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, (cdVar.c() * 2) + cdVar.e());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, cdVar.f());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, cdVar.d());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f22730a.a(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setListener(a aVar) {
        this.f22730a = aVar;
    }
}
