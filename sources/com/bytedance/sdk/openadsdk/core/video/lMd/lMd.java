package com.bytedance.sdk.openadsdk.core.video.lMd;

import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    public static void zp(woN won) {
        if (cz.lMd(won)) {
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void zp(woN won, long j7, long j9) {
        if (won != null) {
            if (cz.Bj(won) || cz.lMd(won)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j7);
                    jSONObject.put("unzip_success_time", j9);
                } catch (JSONException e4) {
                    tG.zp("PlayableEvent", "onSuccess json error", e4);
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void zp(woN won, int i9, String str) {
        if (won != null) {
            if (cz.Bj(won) || cz.lMd(won)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i9);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e4) {
                    tG.zp("PlayableEvent", "onFail json error", e4);
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
