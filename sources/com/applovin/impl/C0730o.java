package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0730o extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f9373a;

    public C0730o(Context context, int i9, int i10) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i10);
        this.f9373a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i9 != -2 && i9 != -1) {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i9);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i9, i9);
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

    public void setColor(int i9) {
        this.f9373a.getIndeterminateDrawable().setColorFilter(i9, PorterDuff.Mode.SRC_IN);
    }
}
