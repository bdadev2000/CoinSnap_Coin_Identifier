package com.applovin.impl.adview;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private e f22811a;

    /* renamed from: b, reason: collision with root package name */
    private int f22812b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e a2 = e.a(aVar, activity);
        this.f22811a = a2;
        addView(a2);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f22811a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f22811a.getLayoutParams();
        removeView(this.f22811a);
        e a2 = e.a(aVar, getContext());
        this.f22811a = a2;
        addView(a2);
        this.f22811a.setLayoutParams(layoutParams);
        this.f22811a.a(this.f22812b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f22812b = i2;
        int i6 = i3 + i2 + i4;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i6;
            layoutParams.width = i6;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i6, i6));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2, i5);
        layoutParams2.setMargins(i4, i4, i4, 0);
        this.f22811a.setLayoutParams(layoutParams2);
        this.f22811a.a(i2);
    }
}
