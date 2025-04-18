package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY implements tN {
    public int AlY = 0;
    public long Sg;
    public long YFl;
    public int tN;

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
            jSONObject.put("total_duration", this.YFl);
            jSONObject.put("buffers_time", this.Sg);
            jSONObject.put("break_reason", this.tN);
            jSONObject.put("video_backup", this.AlY);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("FeedBreakModel", th2.getMessage());
        }
    }
}
