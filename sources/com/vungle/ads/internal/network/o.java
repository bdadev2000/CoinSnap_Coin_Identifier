package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.VungleAds$WrapperFramework;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {
    private o() {
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String defaultHeader() {
        String str;
        if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
            str = "VungleAmazon/";
        } else {
            str = "VungleDroid/";
        }
        return str.concat("7.3.2");
    }

    public final String getBASE_URL$vungle_ads_release() {
        return y.access$getBASE_URL$cp();
    }

    public final String getHeaderUa() {
        return y.access$getHeaderUa$cp();
    }

    public final VungleAds$WrapperFramework getWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release() {
        return y.access$getWRAPPER_FRAMEWORK_SELECTED$cp();
    }

    public final void reset$vungle_ads_release() {
        setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(null);
        setHeaderUa(defaultHeader());
    }

    public final void setHeaderUa(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        y.access$setHeaderUa$cp(str);
    }

    public final void setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(VungleAds$WrapperFramework vungleAds$WrapperFramework) {
        y.access$setWRAPPER_FRAMEWORK_SELECTED$cp(vungleAds$WrapperFramework);
    }
}
