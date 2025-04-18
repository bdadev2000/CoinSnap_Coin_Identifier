package com.iab.omid.library.applovin.adsession;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML(CreativeInfo.al),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
