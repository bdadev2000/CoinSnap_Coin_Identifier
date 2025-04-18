package com.bytedance.sdk.openadsdk.core.GA.tN;

import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    public static void YFl(Wwa wwa) {
        if (Ne.Sg(wwa)) {
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void YFl(Wwa wwa, long j3, long j10) {
        if (wwa != null) {
            if (Ne.tN(wwa) || Ne.Sg(wwa)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j3);
                    jSONObject.put("unzip_success_time", j10);
                } catch (JSONException e2) {
                    YoT.YFl("PlayableEvent", "onSuccess json error", e2);
                }
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void YFl(Wwa wwa, int i10, String str) {
        if (wwa != null) {
            if (Ne.tN(wwa) || Ne.Sg(wwa)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e2) {
                    YoT.YFl("PlayableEvent", "onFail json error", e2);
                }
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
