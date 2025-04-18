package com.adjust.sdk;

import com.vungle.ads.internal.signals.j;

/* loaded from: classes.dex */
public enum BackoffStrategy {
    LONG_WAIT(1, 120000, j.TWENTY_FOUR_HOURS_MILLIS, 0.5d, 1.0d),
    SHORT_WAIT(1, 200, 3600000, 0.5d, 1.0d),
    TEST_WAIT(1, 200, 1000, 0.5d, 1.0d),
    NO_WAIT(100, 1, 1000, 1.0d, 1.0d);

    public double maxRange;
    public long maxWait;
    public long milliSecondMultiplier;
    public double minRange;
    public int minRetries;

    BackoffStrategy(int i10, long j3, long j10, double d10, double d11) {
        this.minRetries = i10;
        this.milliSecondMultiplier = j3;
        this.maxWait = j10;
        this.minRange = d10;
        this.maxRange = d11;
    }
}
