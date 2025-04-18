package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.JvmStatic;

/* loaded from: classes4.dex */
public final class l3 {
    public static final String TAG = "VungleAds";
    public static final k3 Companion = new k3(null);
    private static com.vungle.ads.internal.c1 vungleInternal = new com.vungle.ads.internal.c1();
    private static com.vungle.ads.internal.y0 initializer = new com.vungle.ads.internal.y0();

    public static final /* synthetic */ com.vungle.ads.internal.y0 access$getInitializer$cp() {
        return initializer;
    }

    public static final /* synthetic */ com.vungle.ads.internal.c1 access$getVungleInternal$cp() {
        return vungleInternal;
    }

    @JvmStatic
    public static final String getBiddingToken(Context context) {
        return Companion.getBiddingToken(context);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    @JvmStatic
    public static final void init(Context context, String str, a1 a1Var) {
        Companion.init(context, str, a1Var);
    }

    @JvmStatic
    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    @JvmStatic
    public static final void setIntegrationName(VungleAds$WrapperFramework vungleAds$WrapperFramework, String str) {
        Companion.setIntegrationName(vungleAds$WrapperFramework, str);
    }
}
