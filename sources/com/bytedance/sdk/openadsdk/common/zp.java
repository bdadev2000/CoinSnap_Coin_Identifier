package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.KVG;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.utils.YhE;

/* loaded from: classes.dex */
public class zp {
    private static String zp;

    public static String COT() {
        return com.bytedance.sdk.openadsdk.core.ku.lMd().COT();
    }

    public static String HWF() {
        return KVG.QR(com.bytedance.sdk.openadsdk.core.KVG.zp());
    }

    public static String KS() {
        return BuildConfig.VERSION_NAME;
    }

    public static String QR() {
        try {
            if (!TextUtils.isEmpty(zp)) {
                return zp;
            }
            String zp2 = com.bytedance.sdk.openadsdk.core.ku.zp("sdk_app_sha1", 259200000L);
            zp = zp2;
            if (zp(zp2)) {
                return zp;
            }
            String zp3 = com.bytedance.sdk.component.utils.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp());
            zp = zp3;
            if (!zp(zp3)) {
                return "";
            }
            String upperCase = zp.toUpperCase();
            zp = upperCase;
            com.bytedance.sdk.openadsdk.core.ku.zp("sdk_app_sha1", upperCase);
            return zp;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String jU() {
        return YhE.QR();
    }

    public static String lMd() {
        return "1371";
    }

    public static String zp() {
        return "open_news";
    }

    public static String zp(Context context) {
        return Bj.zp(context);
    }

    private static boolean zp(String str) {
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
