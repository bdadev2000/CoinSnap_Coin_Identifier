package com.vungle.ads.internal.downloader;

/* loaded from: classes4.dex */
public enum m {
    CRITICAL(-2147483647),
    HIGHEST(0),
    HIGH(1),
    LOWEST(Integer.MAX_VALUE);

    private final int priority;

    m(int i10) {
        this.priority = i10;
    }

    public final int getPriority() {
        return this.priority;
    }
}
