package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU {
    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN won, String str, int i9, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i9);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, str, "convert_track", jSONObject);
    }
}
