package com.bytedance.sdk.component.adexpress.jU;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class jU {
    public static boolean zp(String str) {
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            if (TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
