package com.applovin.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22654b;

    public /* synthetic */ k(View view, int i2) {
        this.f22653a = i2;
        this.f22654b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f22653a;
        View view = this.f22654b;
        switch (i2) {
            case 0:
                b.a((b) view, valueAnimator);
                return;
            case 1:
                MaterialMainContainerBackHelper.a((ClippableRoundedCornerLayout) view, valueAnimator);
                return;
            default:
                DrawerLayoutUtils.a((DrawerLayout) view, valueAnimator);
                return;
        }
    }
}
