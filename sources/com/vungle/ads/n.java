package com.vungle.ads;

/* loaded from: classes4.dex */
public enum n {
    ERROR_LOG_LEVEL_OFF(0),
    ERROR_LOG_LEVEL_ERROR(1),
    ERROR_LOG_LEVEL_DEBUG(2);

    public static final m Companion = new m(null);
    private final int level;

    n(int i10) {
        this.level = i10;
    }

    public final int getLevel() {
        return this.level;
    }
}
