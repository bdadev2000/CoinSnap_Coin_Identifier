package com.vungle.ads.internal.downloader;

/* loaded from: classes3.dex */
public enum m {
    CRITICAL(-2147483647),
    HIGHEST(0),
    HIGH(1),
    LOWEST(Integer.MAX_VALUE);

    private final int priority;

    m(int i9) {
        this.priority = i9;
    }

    public final int getPriority() {
        return this.priority;
    }
}
