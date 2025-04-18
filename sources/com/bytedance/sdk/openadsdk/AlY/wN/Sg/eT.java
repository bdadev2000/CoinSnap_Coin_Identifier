package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT implements tN {
    private final long Sg;
    private final String YFl;

    public eT(String str, long j3) {
        this.YFl = str;
        this.Sg = j3;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN
    public void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.YFl);
            jSONObject.put("preload_size", this.Sg);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("LoadVideoStartModel", th2.getMessage());
        }
    }
}
