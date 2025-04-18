package org.koin.core.time;

import d0.k;
import org.jetbrains.annotations.NotNull;
import org.koin.mp.KoinPlatformTimeTools;
import q0.a;

/* loaded from: classes.dex */
public final class MeasureKt {
    public static final double measureDuration(@NotNull a aVar) {
        p0.a.s(aVar, "code");
        long timeInNanoSeconds = KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds();
        aVar.invoke();
        return Double.valueOf((r0.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d).doubleValue();
    }

    @NotNull
    public static final <T> k measureDurationForResult(@NotNull a aVar) {
        p0.a.s(aVar, "code");
        KoinPlatformTimeTools koinPlatformTimeTools = KoinPlatformTimeTools.INSTANCE;
        return new k(aVar.invoke(), Double.valueOf(Double.valueOf((koinPlatformTimeTools.getTimeInNanoSeconds() - koinPlatformTimeTools.getTimeInNanoSeconds()) / 1000000.0d).doubleValue()));
    }

    @NotNull
    public static final <T> k measureTimedValue(@NotNull a aVar) {
        p0.a.s(aVar, "code");
        KoinPlatformTimeTools koinPlatformTimeTools = KoinPlatformTimeTools.INSTANCE;
        return new k(aVar.invoke(), Double.valueOf((koinPlatformTimeTools.getTimeInNanoSeconds() - koinPlatformTimeTools.getTimeInNanoSeconds()) / 1000000.0d));
    }
}
