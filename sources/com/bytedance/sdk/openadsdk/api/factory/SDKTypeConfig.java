package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* loaded from: classes.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory YFl;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return YFl;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        YFl = iSDKTypeFactory;
    }
}
