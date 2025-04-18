package org.koin.mp;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class KoinPlatformTimeTools {

    @NotNull
    public static final KoinPlatformTimeTools INSTANCE = new KoinPlatformTimeTools();

    private KoinPlatformTimeTools() {
    }

    public final long getTimeInNanoSeconds() {
        return System.nanoTime();
    }
}
