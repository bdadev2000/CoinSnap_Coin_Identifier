package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public class g extends FrameLayout {
    private e a;

    /* renamed from: b, reason: collision with root package name */
    private int f3711b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e a = e.a(aVar, activity);
        this.a = a;
        addView(a);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        removeView(this.a);
        e a = e.a(aVar, getContext());
        this.a = a;
        addView(a);
        this.a.setLayoutParams(layoutParams);
        this.a.a(this.f3711b);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f3711b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.a.setLayoutParams(layoutParams2);
        this.a.a(i10);
    }
}
