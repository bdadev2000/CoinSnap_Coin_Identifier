package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.jU;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YW extends rV {
    public YW() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jU
    public void zp(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            jU.zp zp = zp();
            zp.zp("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            zp.zp();
        }
    }
}
