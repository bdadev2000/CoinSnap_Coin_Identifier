package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.Sco;

/* loaded from: classes.dex */
public class YFl {
    private static String YFl;

    public static String AlY() {
        return Sco.DSW();
    }

    public static String DSW() {
        if (!TextUtils.isEmpty(YFl)) {
            return YFl;
        }
        String YFl2 = com.bytedance.sdk.openadsdk.core.NjR.YFl("sdk_app_sha1", 259200000L);
        YFl = YFl2;
        if (YFl(YFl2)) {
            return YFl;
        }
        String YFl3 = com.bytedance.sdk.component.utils.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl());
        YFl = YFl3;
        if (YFl(YFl3)) {
            String upperCase = YFl.toUpperCase();
            YFl = upperCase;
            com.bytedance.sdk.openadsdk.core.NjR.YFl("sdk_app_sha1", upperCase);
            return YFl;
        }
        return "";
    }

    public static String Sg() {
        return "1371";
    }

    public static String YFl() {
        return "open_news";
    }

    public static String tN() {
        return BuildConfig.VERSION_NAME;
    }

    public static String vc() {
        return com.bytedance.sdk.component.utils.EH.DSW(com.bytedance.sdk.openadsdk.core.lG.YFl());
    }

    public static String wN() {
        return com.bytedance.sdk.openadsdk.core.NjR.Sg().vc();
    }

    public static String YFl(Context context) {
        return com.bytedance.sdk.openadsdk.core.YoT.YFl(context);
    }

    private static boolean YFl(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 20) {
            return false;
        }
        for (String str2 : split) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
