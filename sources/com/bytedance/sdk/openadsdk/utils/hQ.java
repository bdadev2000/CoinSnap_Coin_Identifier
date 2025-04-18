package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class hQ {
    private static final Map<String, hQ> YFl = new HashMap();
    private SharedPreferences Sg;

    private hQ(String str, Context context) {
        if (context != null) {
            this.Sg = context.getSharedPreferences(str, 0);
        }
    }

    public static hQ YFl(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, hQ> map = YFl;
        hQ hQVar = map.get(str);
        if (hQVar != null) {
            return hQVar;
        }
        hQ hQVar2 = new hQ(str, context);
        map.put(str, hQVar2);
        return hQVar2;
    }

    public String YFl(String str, String str2) {
        try {
            return this.Sg.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void YFl(String str) {
        try {
            this.Sg.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
