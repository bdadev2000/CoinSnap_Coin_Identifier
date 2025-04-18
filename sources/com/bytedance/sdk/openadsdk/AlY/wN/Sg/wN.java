package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN implements tN {
    private long Sg;
    private long YFl;

    public void Sg(long j3) {
        this.Sg = j3;
    }

    public void YFl(long j3) {
        this.YFl = j3;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN
    public void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.YFl);
            jSONObject.put("total_duration", this.Sg);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("FeedContinueModel", th2.getMessage());
        }
    }
}
