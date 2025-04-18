package com.bytedance.sdk.openadsdk.qO;

import com.applovin.sdk.AppLovinMediationProvider;

/* loaded from: classes.dex */
public enum AlY {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN(AppLovinMediationProvider.UNKNOWN);

    private String qsH;

    AlY(String str) {
        this.qsH = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.qsH;
    }
}
