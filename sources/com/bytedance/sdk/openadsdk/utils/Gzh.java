package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Gzh {
    private static final Map<String, Gzh> zp = new HashMap();
    private SharedPreferences lMd;

    private Gzh(String str, Context context) {
        if (context != null) {
            this.lMd = context.getSharedPreferences(str, 0);
        }
    }

    public static Gzh zp(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, Gzh> map = zp;
        Gzh gzh = map.get(str);
        if (gzh != null) {
            return gzh;
        }
        Gzh gzh2 = new Gzh(str, context);
        map.put(str, gzh2);
        return gzh2;
    }

    public String zp(String str, String str2) {
        try {
            return this.lMd.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void zp(String str) {
        try {
            this.lMd.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
