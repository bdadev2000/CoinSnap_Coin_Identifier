package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class MG implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC1064Bi A00;

    public MG(ViewOnClickListenerC1064Bi viewOnClickListenerC1064Bi) {
        this.A00 = viewOnClickListenerC1064Bi;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i9;
        Handler handler;
        Runnable runnable;
        int i10;
        this.A00.A06();
        i9 = this.A00.A04;
        if (i9 > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i10 = this.A00.A04;
            handler.postDelayed(runnable, i10);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
