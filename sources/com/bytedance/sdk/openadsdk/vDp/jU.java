package com.bytedance.sdk.openadsdk.vDp;

import com.applovin.sdk.AppLovinMediationProvider;

/* loaded from: classes.dex */
public enum jU {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN(AppLovinMediationProvider.UNKNOWN);

    private String ku;

    jU(String str) {
        this.ku = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.ku;
    }
}
