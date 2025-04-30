package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class l1 {
    public /* synthetic */ l1(G7.f fVar) {
        this();
    }

    public final void deInit$vungle_ads_release() {
        m1.access$getInitializer$cp().deInit$vungle_ads_release();
    }

    public final String getBiddingToken(Context context) {
        G7.j.e(context, "context");
        return m1.access$getVungleInternal$cp().getAvailableBidTokens(context);
    }

    public final String getSdkVersion() {
        return m1.access$getVungleInternal$cp().getSdkVersion();
    }

    public final void init(Context context, String str, InterfaceC2072c0 interfaceC2072c0) {
        G7.j.e(context, "context");
        G7.j.e(str, "appId");
        G7.j.e(interfaceC2072c0, "callback");
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        com.vungle.ads.internal.Z access$getInitializer$cp = m1.access$getInitializer$cp();
        G7.j.d(context, "appContext");
        access$getInitializer$cp.init(str, context, interfaceC2072c0);
    }

    public final boolean isInitialized() {
        return m1.access$getInitializer$cp().isInitialized();
    }

    public final void setIntegrationName(VungleAds$WrapperFramework vungleAds$WrapperFramework, String str) {
        String str2;
        G7.j.e(vungleAds$WrapperFramework, "wrapperFramework");
        G7.j.e(str, "wrapperFrameworkVersion");
        if (vungleAds$WrapperFramework != VungleAds$WrapperFramework.none) {
            com.vungle.ads.internal.network.o oVar = com.vungle.ads.internal.network.y.Companion;
            oVar.setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(vungleAds$WrapperFramework);
            String headerUa = oVar.getHeaderUa();
            if (str.length() > 0) {
                str2 = "/".concat(str);
            } else {
                str2 = "";
            }
            String str3 = vungleAds$WrapperFramework + str2;
            if (new HashSet(O7.g.V(headerUa, new String[]{";"}, 0, 6)).add(str3)) {
                oVar.setHeaderUa(headerUa + ';' + str3);
            }
        } else {
            com.vungle.ads.internal.util.v.Companion.e(m1.TAG, "Wrapper is null or is none");
        }
        if (isInitialized()) {
            com.vungle.ads.internal.util.v.Companion.w(m1.TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }

    private l1() {
    }
}
