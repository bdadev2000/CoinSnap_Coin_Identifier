package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class YoT implements tN {
    private long AlY;
    private long Sg;
    private String YFl;
    private long tN;

    public void Sg(long j3) {
        this.tN = j3;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void tN(long j3) {
        this.AlY = j3;
    }

    public void YFl(long j3) {
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
            jSONObject.put("load_time", this.tN);
            jSONObject.put("local_cache", this.AlY);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
