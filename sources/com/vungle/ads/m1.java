package com.vungle.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class m1 {
    public static final String TAG = "VungleAds";
    public static final l1 Companion = new l1(null);
    private static com.vungle.ads.internal.e0 vungleInternal = new com.vungle.ads.internal.e0();
    private static com.vungle.ads.internal.Z initializer = new com.vungle.ads.internal.Z();

    public static final /* synthetic */ com.vungle.ads.internal.Z access$getInitializer$cp() {
        return initializer;
    }

    public static final /* synthetic */ com.vungle.ads.internal.e0 access$getVungleInternal$cp() {
        return vungleInternal;
    }

    public static final String getBiddingToken(Context context) {
        return Companion.getBiddingToken(context);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, InterfaceC2072c0 interfaceC2072c0) {
        Companion.init(context, str, interfaceC2072c0);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final void setIntegrationName(VungleAds$WrapperFramework vungleAds$WrapperFramework, String str) {
        Companion.setIntegrationName(vungleAds$WrapperFramework, str);
    }
}
