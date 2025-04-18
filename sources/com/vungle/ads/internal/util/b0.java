package com.vungle.ads.internal.util;

import android.os.CountDownTimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    private final Function0<Unit> onFinish;
    private final Function0<Unit> onTick;
    private final boolean repeats;
    private long startTimeMillis;
    private CountDownTimer timer;

    public b0(double d10, boolean z10, Function0<Unit> onTick, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onTick, "onTick");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.durationSecs = d10;
        this.repeats = z10;
        this.onTick = onTick;
        this.onFinish = onFinish;
        this.nextDurationSecs = d10;
    }

    private final CountDownTimer createCountdown(long j3) {
        return new a0(j3, this);
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
        long j3;
        if (this.isPaused) {
            currentTimeMillis = getDurationMillis();
            j3 = getNextDurationMillis();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            j3 = this.startTimeMillis;
        }
        return currentTimeMillis - j3;
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

    public final void setNextDurationSecs$vungle_ads_release(double d10) {
        this.nextDurationSecs = d10;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j3) {
        this.startTimeMillis = j3;
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

    public /* synthetic */ b0(double d10, boolean z10, Function0 function0, Function0 function02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, z10, (i10 & 4) != 0 ? z.INSTANCE : function0, function02);
    }
}
