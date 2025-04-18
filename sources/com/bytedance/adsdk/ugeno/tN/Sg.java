package com.bytedance.adsdk.ugeno.tN;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.AlY;
import com.bytedance.adsdk.ugeno.tN.YFl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    public static String YFl(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}")) {
                    YFl tN = AlY.YFl().tN();
                    if (tN == null) {
                        return str;
                    }
                    YFl.InterfaceC0070YFl YFl = tN.YFl(str.substring(2, str.length() - 1));
                    if (YFl == null) {
                        return str;
                    }
                    return (String) YFl.YFl(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
