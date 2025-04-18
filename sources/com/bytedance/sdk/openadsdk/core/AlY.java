package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY {
    public static void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, str, "convert_track", jSONObject);
    }
}
