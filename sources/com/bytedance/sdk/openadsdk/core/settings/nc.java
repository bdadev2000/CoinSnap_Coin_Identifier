package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.wN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc extends EH {
    public nc() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.wN
    public void YFl(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            wN.YFl YFl = YFl();
            YFl.YFl("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            YFl.YFl();
            AlY();
        }
    }
}
