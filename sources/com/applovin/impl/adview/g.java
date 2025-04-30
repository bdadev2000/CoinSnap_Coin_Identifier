package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private e f6709a;
    private int b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e a6 = e.a(aVar, activity);
        this.f6709a = a6;
        addView(a6);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f6709a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f6709a.getLayoutParams();
        removeView(this.f6709a);
        e a6 = e.a(aVar, getContext());
        this.f6709a = a6;
        addView(a6);
        this.f6709a.setLayoutParams(layoutParams);
        this.f6709a.a(this.b);
    }

    public void a(int i9, int i10, int i11, int i12) {
        this.b = i9;
        int i13 = i10 + i9 + i11;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i13;
            layoutParams.width = i13;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i9, i9, i12);
        layoutParams2.setMargins(i11, i11, i11, 0);
        this.f6709a.setLayoutParams(layoutParams2);
        this.f6709a.a(i9);
    }
}
