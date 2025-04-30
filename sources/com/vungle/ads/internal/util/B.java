package com.vungle.ads.internal.util;

import android.os.CountDownTimer;

/* loaded from: classes3.dex */
public final class B {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    private final F7.a onFinish;
    private final F7.a onTick;
    private final boolean repeats;
    private long startTimeMillis;
    private CountDownTimer timer;

    public B(double d2, boolean z8, F7.a aVar, F7.a aVar2) {
        G7.j.e(aVar, "onTick");
        G7.j.e(aVar2, "onFinish");
        this.durationSecs = d2;
        this.repeats = z8;
        this.onTick = aVar;
        this.onFinish = aVar2;
        this.nextDurationSecs = d2;
    }

    private final CountDownTimer createCountdown(long j7) {
        return new A(j7, this);
    }

    private final long getDurationMillis() {
        return (long) (this.durationSecs * 1000);
    }

    public static /* synthetic */ void getElapsedMillis$vungle_ads_release$annotations() {
    }

    private final double getElapsedSecs() {
        return getElapsedMillis$vungle_ads_release() / 1000;
    }

    private final long getNextDurationMillis() {
        return (long) (this.nextDurationSecs * 1000);
    }

    public static /* synthetic */ void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTimer$vungle_ads_release$annotations() {
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final long getElapsedMillis$vungle_ads_release() {
        long currentTimeMillis;
        long j7;
        if (this.isPaused) {
            currentTimeMillis = getDurationMillis();
            j7 = getNextDurationMillis();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            j7 = this.startTimeMillis;
        }
        return currentTimeMillis - j7;
    }

    public final double getNextDurationSecs$vungle_ads_release() {
        return this.nextDurationSecs;
    }

    public final long getStartTimeMillis$vungle_ads_release() {
        return this.startTimeMillis;
    }

    public final CountDownTimer getTimer$vungle_ads_release() {
        return this.timer;
    }

    public final void pause() {
        if (this.timer == null) {
            return;
        }
        this.nextDurationSecs -= getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void resume() {
        if (!this.isPaused) {
            return;
        }
        this.isPaused = false;
        start();
    }

    public final void setNextDurationSecs$vungle_ads_release(double d2) {
        this.nextDurationSecs = d2;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j7) {
        this.startTimeMillis = j7;
    }

    public final void setTimer$vungle_ads_release(CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer createCountdown = createCountdown(getNextDurationMillis());
        this.timer = createCountdown;
        if (createCountdown != null) {
            createCountdown.start();
        }
    }

    public /* synthetic */ B(double d2, boolean z8, F7.a aVar, F7.a aVar2, int i9, G7.f fVar) {
        this(d2, z8, (i9 & 4) != 0 ? z.INSTANCE : aVar, aVar2);
    }
}
