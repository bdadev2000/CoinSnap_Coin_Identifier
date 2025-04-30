package com.vungle.ads.internal.util;

import android.os.CountDownTimer;

/* loaded from: classes3.dex */
public final class A extends CountDownTimer {
    final /* synthetic */ B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(long j7, B b) {
        super(j7, j7);
        this.this$0 = b;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        F7.a aVar;
        boolean z8;
        boolean z9;
        double d2;
        B b = this.this$0;
        aVar = b.onFinish;
        aVar.invoke();
        z8 = b.repeats;
        if (z8) {
            z9 = b.isCanceled;
            if (!z9) {
                d2 = b.durationSecs;
                b.setNextDurationSecs$vungle_ads_release(d2);
                b.start();
                return;
            }
        }
        b.cancel();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j7) {
        F7.a aVar;
        aVar = this.this$0.onTick;
        aVar.invoke();
    }
}
