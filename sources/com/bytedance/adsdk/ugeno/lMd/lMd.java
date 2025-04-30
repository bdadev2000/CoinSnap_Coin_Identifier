package com.bytedance.adsdk.ugeno.lMd;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    public static void zp(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
    }

    public static JSONObject zp(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }
}
