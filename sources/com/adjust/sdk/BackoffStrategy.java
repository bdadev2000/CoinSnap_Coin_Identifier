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

    BackoffStrategy(int i9, long j7, long j9, double d2, double d9) {
        this.minRetries = i9;
        this.milliSecondMultiplier = j7;
        this.maxWait = j9;
        this.minRange = d2;
        this.maxRange = d9;
    }
}
