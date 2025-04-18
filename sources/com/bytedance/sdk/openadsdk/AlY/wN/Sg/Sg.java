package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg implements tN {
    private int AlY;
    private long Sg;
    private long YFl;
    private int tN;

    public void Sg(long j3) {
        this.Sg = j3;
    }

    public void YFl(long j3) {
        this.YFl = j3;
    }

    public void Sg(int i10) {
        this.AlY = i10;
    }

    public void YFl(int i10) {
        this.tN = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN
    public void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.YFl);
            jSONObject.put("total_duration", this.Sg);
            jSONObject.put("vbtt_skip_type", this.tN);
            jSONObject.put("skip_reason", this.AlY);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("EndcardSkipModel", th2.getMessage());
        }
    }
}
