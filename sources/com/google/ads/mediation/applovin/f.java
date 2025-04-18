package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static f f11451d;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11452b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11453c = new HashMap();
    public final n a = new n();

    public static f a() {
        if (f11451d == null) {
            f11451d = new f();
        }
        return f11451d;
    }

    public final void b(Context context, String str, e eVar) {
        HashMap hashMap = this.f11452b;
        boolean containsKey = hashMap.containsKey(str);
        HashMap hashMap2 = this.f11453c;
        if (!containsKey) {
            hashMap.put(str, 0);
            hashMap2.put(str, new ArrayList());
        }
        Integer num = 2;
        if (num.equals(hashMap.get(str))) {
            eVar.onInitializeSuccess(str);
            return;
        }
        ((ArrayList) hashMap2.get(str)).add(eVar);
        Integer num2 = 1;
        if (num2.equals(hashMap.get(str))) {
            return;
        }
        hashMap.put(str, 1);
        Log.d("f", String.format("Attempting to initialize SDK with SDK Key: %s", str));
        this.a.getClass();
        if (AppLovinMediationAdapter.appLovinSdkSettings == null) {
            AppLovinMediationAdapter.appLovinSdkSettings = new AppLovinSdkSettings(context);
        }
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(str, AppLovinMediationAdapter.appLovinSdkSettings, context);
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        appLovinSdk.initializeSdk(new d(this, str));
    }

    public final AppLovinSdk c(Context context, Bundle bundle) {
        String str;
        AppLovinSdk appLovinSdk;
        if (bundle != null) {
            str = bundle.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        } else {
            str = null;
        }
        this.a.getClass();
        if (AppLovinMediationAdapter.appLovinSdkSettings == null) {
            AppLovinMediationAdapter.appLovinSdkSettings = new AppLovinSdkSettings(context);
        }
        AppLovinSdkSettings appLovinSdkSettings = AppLovinMediationAdapter.appLovinSdkSettings;
        if (!TextUtils.isEmpty(str)) {
            appLovinSdk = AppLovinSdk.getInstance(str, appLovinSdkSettings, context);
        } else {
            appLovinSdk = AppLovinSdk.getInstance(appLovinSdkSettings, context);
        }
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        return appLovinSdk;
    }
}
