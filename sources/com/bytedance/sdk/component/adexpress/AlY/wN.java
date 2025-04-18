package com.bytedance.sdk.component.adexpress.AlY;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class wN {
    public static boolean YFl(String str) {
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
