package com.vungle.ads.internal.platform;

import c7.C0615A;

/* loaded from: classes3.dex */
public interface d {
    public static final c Companion = c.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    C0615A getAdvertisingInfo();

    String getAndroidId();

    String getAppSetId();

    String getCarrierName();

    String getUserAgent();

    void getUserAgentLazy(S.a aVar);

    float getVolumeLevel();

    boolean isAtLeastMinimumSDK();

    boolean isBatterySaverEnabled();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSoundEnabled();
}
