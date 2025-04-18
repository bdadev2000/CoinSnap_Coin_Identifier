package com.vungle.ads.internal.util;

import android.os.CountDownTimer;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class a0 extends CountDownTimer {
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j3, b0 b0Var) {
        super(j3, j3);
        this.this$0 = b0Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        Function0 function0;
        boolean z10;
        boolean z11;
        double d10;
        b0 b0Var = this.this$0;
        function0 = b0Var.onFinish;
        function0.invoke();
        z10 = b0Var.repeats;
        if (z10) {
            z11 = b0Var.isCanceled;
            if (!z11) {
                d10 = b0Var.durationSecs;
                b0Var.setNextDurationSecs$vungle_ads_release(d10);
                b0Var.start();
                return;
            }
        }
        b0Var.cancel();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j3) {
        Function0 function0;
        function0 = this.this$0.onTick;
        function0.invoke();
    }
}
