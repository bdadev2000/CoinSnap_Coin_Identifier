package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class k3 {
    private k3() {
    }

    public /* synthetic */ k3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void deInit$vungle_ads_release() {
        l3.access$getInitializer$cp().deInit$vungle_ads_release();
    }

    @JvmStatic
    public final String getBiddingToken(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return l3.access$getVungleInternal$cp().getAvailableBidTokens(context);
    }

    @JvmStatic
    public final String getSdkVersion() {
        return l3.access$getVungleInternal$cp().getSdkVersion();
    }

    @JvmStatic
    public final void init(Context appContext, String appId, a1 callback) {
        Intrinsics.checkNotNullParameter(appContext, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(appContext instanceof Application)) {
            appContext = appContext.getApplicationContext();
        }
        com.vungle.ads.internal.y0 access$getInitializer$cp = l3.access$getInitializer$cp();
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        access$getInitializer$cp.init(appId, appContext, callback);
    }

    @JvmStatic
    public final boolean isInitialized() {
        return l3.access$getInitializer$cp().isInitialized();
    }

    @JvmStatic
    public final void setIntegrationName(VungleAds$WrapperFramework wrapperFramework, String wrapperFrameworkVersion) {
        boolean z10;
        String str;
        List split$default;
        Intrinsics.checkNotNullParameter(wrapperFramework, "wrapperFramework");
        Intrinsics.checkNotNullParameter(wrapperFrameworkVersion, "wrapperFrameworkVersion");
        if (wrapperFramework != VungleAds$WrapperFramework.none) {
            com.vungle.ads.internal.network.o oVar = com.vungle.ads.internal.network.y.Companion;
            oVar.setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(wrapperFramework);
            String headerUa = oVar.getHeaderUa();
            if (wrapperFrameworkVersion.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                str = "/".concat(wrapperFrameworkVersion);
            } else {
                str = "";
            }
            String str2 = wrapperFramework + str;
            split$default = StringsKt__StringsKt.split$default(headerUa, new String[]{";"}, false, 0, 6, (Object) null);
            if (new HashSet(split$default).add(str2)) {
                oVar.setHeaderUa(headerUa + ';' + str2);
            }
        } else {
            com.vungle.ads.internal.util.v.Companion.e(l3.TAG, "Wrapper is null or is none");
        }
        if (isInitialized()) {
            com.vungle.ads.internal.util.v.Companion.w(l3.TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
