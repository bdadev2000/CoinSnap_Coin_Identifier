package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public class o extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f25799a;

    public o(Context context, int i2, int i3) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i3);
        this.f25799a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i2 == -2 || i2 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i2);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setColor(int i2) {
        this.f25799a.getIndeterminateDrawable().setColorFilter(i2, PorterDuff.Mode.SRC_IN);
    }
}
