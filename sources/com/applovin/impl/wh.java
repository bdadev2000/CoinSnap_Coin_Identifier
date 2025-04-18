package com.applovin.impl;

import android.adservices.AdServicesState;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes2.dex */
public abstract class wh {
    public static boolean a(Context context) {
        return z3.a("android.permission.ACCESS_ADSERVICES_AD_ID", context);
    }

    public static boolean b(Context context) {
        return z3.a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION", context);
    }

    public static boolean c(Context context) {
        return z3.a("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE", context);
    }

    public static boolean d(Context context) {
        return z3.a("android.permission.ACCESS_ADSERVICES_TOPICS", context);
    }

    public static boolean e(Context context) {
        boolean isAdServicesStateEnabled;
        if (f(context)) {
            isAdServicesStateEnabled = AdServicesState.isAdServicesStateEnabled();
            if (isAdServicesStateEnabled) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        return z3.c() && !AppLovinSdkUtils.isFireOS(context);
    }
}
