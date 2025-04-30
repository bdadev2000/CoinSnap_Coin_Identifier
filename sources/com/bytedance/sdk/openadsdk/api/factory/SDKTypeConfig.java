package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* loaded from: classes.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory zp;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return zp;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        zp = iSDKTypeFactory;
    }
}
