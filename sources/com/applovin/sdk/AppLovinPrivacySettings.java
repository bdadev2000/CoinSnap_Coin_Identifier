package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.a4;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;

/* loaded from: classes4.dex */
public class AppLovinPrivacySettings {
    @Nullable
    public static Boolean getAdditionalConsentStatus(int i2) {
        j jVar = j.f26635v0;
        if (jVar != null) {
            return jVar.k0().a(i2);
        }
        n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    @Nullable
    public static Boolean getPurposeConsentStatus(int i2) {
        j jVar = j.f26635v0;
        if (jVar != null) {
            return jVar.k0().b(i2);
        }
        n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    @Nullable
    public static Boolean getSpecialFeatureOptInStatus(int i2) {
        j jVar = j.f26635v0;
        if (jVar != null) {
            return jVar.k0().c(i2);
        }
        n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    @Nullable
    public static Boolean getTcfVendorConsentStatus(int i2) {
        j jVar = j.f26635v0;
        if (jVar != null) {
            return jVar.k0().d(i2);
        }
        n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static boolean hasUserConsent(Context context) {
        Boolean b2 = a4.b().b(context);
        if (b2 != null) {
            return b2.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSell(Context context) {
        Boolean b2 = a4.a().b(context);
        if (b2 != null) {
            return b2.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        return a4.a().b(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        return a4.b().b(context) != null;
    }

    public static void setDoNotSell(boolean z2, Context context) {
        n.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (a4.a(z2, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z2));
        }
    }

    public static void setHasUserConsent(boolean z2, Context context) {
        n.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (a4.b(z2, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z2), null);
        }
    }
}
