package com.facebook.appevents;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class FlushStatistics {
    private int numEvents;

    @NotNull
    private FlushResult result = FlushResult.SUCCESS;

    public final int getNumEvents() {
        return this.numEvents;
    }

    @NotNull
    public final FlushResult getResult() {
        return this.result;
    }

    public final void setNumEvents(int i2) {
        this.numEvents = i2;
    }

    public final void setResult(@NotNull FlushResult flushResult) {
        p0.a.s(flushResult, "<set-?>");
        this.result = flushResult;
    }
}
