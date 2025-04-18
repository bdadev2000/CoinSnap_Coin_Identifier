package com.vungle.ads.internal.platform;

import bh.a0;

/* loaded from: classes4.dex */
public interface d {
    public static final c Companion = c.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    a0 getAdvertisingInfo();

    String getAndroidId();

    String getAppSetId();

    String getCarrierName();

    String getUserAgent();

    void getUserAgentLazy(m0.a aVar);

    float getVolumeLevel();

    boolean isAtLeastMinimumSDK();

    boolean isBatterySaverEnabled();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSoundEnabled();
}
