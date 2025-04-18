package com.facebook.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes.dex */
public final class InternalSettings {

    @NotNull
    public static final InternalSettings INSTANCE = new InternalSettings();

    @NotNull
    private static final String UNITY_PREFIX = "Unity.";

    @Nullable
    private static volatile String customUserAgent;

    private InternalSettings() {
    }

    @Nullable
    public static final String getCustomUserAgent() {
        return customUserAgent;
    }

    public static final boolean isUnityApp() {
        String str = customUserAgent;
        return p0.a.g(str == null ? null : Boolean.valueOf(m.q1(str, UNITY_PREFIX, false)), Boolean.TRUE);
    }

    public static /* synthetic */ void isUnityApp$annotations() {
    }

    public static final void setCustomUserAgent(@NotNull String str) {
        p0.a.s(str, "value");
        customUserAgent = str;
    }
}
