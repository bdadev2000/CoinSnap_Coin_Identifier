package com.bytedance.sdk.component.adexpress.jU;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class HWF {
    public static boolean lMd(String str) {
        if (com.bytedance.sdk.component.adexpress.jU.lMd() && zp(str)) {
            return true;
        }
        return false;
    }

    public static boolean zp(String str) {
        if (!TextUtils.equals(str, "fullscreen_interstitial_ad") && !TextUtils.equals(str, "rewarded_video")) {
            return false;
        }
        return true;
    }
}
