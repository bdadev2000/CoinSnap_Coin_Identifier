package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MV implements Animation.AnimationListener {
    public final /* synthetic */ CI A00;

    public MV(CI ci) {
        this.A00 = ci;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i2;
        Handler handler;
        Runnable runnable;
        int i3;
        this.A00.A06();
        i2 = this.A00.A04;
        if (i2 > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i3 = this.A00.A04;
            handler.postDelayed(runnable, i3);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
