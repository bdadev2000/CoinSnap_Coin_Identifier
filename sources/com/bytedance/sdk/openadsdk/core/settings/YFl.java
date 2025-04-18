package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.EH;
import com.bytedance.sdk.openadsdk.core.settings.wN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl extends EH {
    public YFl() {
        super("tt_set_apm.prop", new EH.YFl() { // from class: com.bytedance.sdk.openadsdk.core.settings.YFl.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.EH.YFl
            public void Sg() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.EH.YFl
            public void YFl() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.wN
    public void YFl(JSONObject jSONObject) {
        wN.YFl YFl = YFl();
        if (jSONObject.has("apm_url")) {
            YFl.YFl("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("perf_con");
                if (optJSONObject != null && optJSONObject.has("perf_con_apm")) {
                    YFl.YFl("perf_con_apm", optJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        YFl.YFl();
        AlY();
    }
}
