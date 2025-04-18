package com.google.ads.mediation.facebook;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class FacebookAdapterUtils {

    @NotNull
    public static final FacebookAdapterUtils INSTANCE = new FacebookAdapterUtils();

    private FacebookAdapterUtils() {
    }

    @NotNull
    public static final String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    public static /* synthetic */ void getAdapterVersion$annotations() {
    }
}
