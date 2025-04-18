package com.bytedance.sdk.component.adexpress.AlY;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class DSW {
    public static boolean Sg(String str) {
        return com.bytedance.sdk.component.adexpress.AlY.Sg() && YFl(str);
    }

    public static boolean YFl(String str) {
        if (!TextUtils.equals(str, "fullscreen_interstitial_ad") && !TextUtils.equals(str, "rewarded_video")) {
            return false;
        }
        return true;
    }
}
