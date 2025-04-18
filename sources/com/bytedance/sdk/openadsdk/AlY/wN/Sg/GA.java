package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class GA implements tN {
    public int Sg;
    public long YFl;
    public long tN;

    public void Sg(long j3) {
        this.tN = j3;
    }

    public void YFl(long j3) {
        this.YFl = j3;
    }

    public void YFl(int i10) {
        this.Sg = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN
    public void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.YFl);
            jSONObject.put("buffers_count", this.Sg);
            jSONObject.put("total_duration", this.tN);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("PlayBufferModel", th2.getMessage());
        }
    }
}
