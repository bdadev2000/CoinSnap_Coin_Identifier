package com.google.ads.mediation.applovin;

import android.content.Context;
import androidx.annotation.NonNull;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;

/* loaded from: classes.dex */
public class AppLovinSdkWrapper {
    public AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        return AppLovinSdk.getInstance(appLovinSdkSettings, context);
    }

    @NonNull
    public AppLovinSdkSettings getSdkSettings(@NonNull Context context) {
        if (AppLovinMediationAdapter.appLovinSdkSettings == null) {
            AppLovinMediationAdapter.appLovinSdkSettings = new AppLovinSdkSettings(context);
        }
        return AppLovinMediationAdapter.appLovinSdkSettings;
    }

    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }

    public AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        return AppLovinSdk.getInstance(str, appLovinSdkSettings, context);
    }
}
