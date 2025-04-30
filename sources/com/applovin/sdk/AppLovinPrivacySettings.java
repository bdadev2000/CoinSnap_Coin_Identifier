package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.y3;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    @Nullable
    public static Boolean getAdditionalConsentStatus(int i9) {
        k kVar = k.f10832A0;
        if (kVar == null) {
            t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return kVar.m0().a(i9);
    }

    @Nullable
    public static Boolean getPurposeConsentStatus(int i9) {
        k kVar = k.f10832A0;
        if (kVar == null) {
            t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return kVar.m0().b(i9);
    }

    @Nullable
    public static Boolean getSpecialFeatureOptInStatus(int i9) {
        k kVar = k.f10832A0;
        if (kVar == null) {
            t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return kVar.m0().c(i9);
    }

    @Nullable
    public static Boolean getTcfVendorConsentStatus(int i9) {
        k kVar = k.f10832A0;
        if (kVar == null) {
            t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
            return null;
        }
        return kVar.m0().d(i9);
    }

    public static boolean hasUserConsent(Context context) {
        Boolean b = y3.b().b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        Boolean b = y3.c().b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        if (y3.c().b(context) != null) {
            return true;
        }
        return false;
    }

    public static boolean isDoNotSell(Context context) {
        Boolean b = y3.a().b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        if (y3.a().b(context) != null) {
            return true;
        }
        return false;
    }

    public static boolean isUserConsentSet(Context context) {
        if (y3.b().b(context) != null) {
            return true;
        }
        return false;
    }

    public static void setDoNotSell(boolean z8, Context context) {
        t.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (y3.a(z8, context)) {
            AppLovinSdk.reinitializeAll(null, null, Boolean.valueOf(z8));
        }
    }

    public static void setHasUserConsent(boolean z8, Context context) {
        t.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (y3.b(z8, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z8), null, null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z8, Context context) {
        t.g("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (y3.c(z8, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z8), null);
        }
    }
}
