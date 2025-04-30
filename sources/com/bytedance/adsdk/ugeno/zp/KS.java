package com.bytedance.adsdk.ugeno.zp;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    public static String zp(String str, JSONObject jSONObject) {
        Object zp;
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject != null) {
                try {
                    if (str.startsWith("${") && str.endsWith("}")) {
                        com.bytedance.adsdk.zp.lMd.zp zp2 = com.bytedance.adsdk.zp.lMd.zp.zp(str.substring(2, str.length() - 1));
                        zp = zp2.zp(jSONObject);
                        Log.d("ELParser", "el: " + str + "; result: " + zp);
                        if (zp instanceof String) {
                            return (String) zp2.zp(jSONObject);
                        }
                        if (zp instanceof com.bytedance.adsdk.zp.lMd.zp.zp) {
                            return String.valueOf(jU.zp((com.bytedance.adsdk.zp.lMd.zp.zp) zp));
                        }
                    } else {
                        return str;
                    }
                } catch (Throwable unused) {
                    return str;
                }
            }
            return String.valueOf(zp);
        }
        return str;
    }
}
