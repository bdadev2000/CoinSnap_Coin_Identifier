package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH implements tN {
    private long Sg;
    private long YFl;
    private int tN;

    public void Sg(long j3) {
        this.Sg = j3;
    }

    public void YFl(long j3) {
        this.YFl = j3;
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
            jSONObject.put("video_start_duration", this.YFl);
            jSONObject.put("video_cache_size", this.Sg);
            jSONObject.put("is_auto_play", this.tN);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("FeedPlayModel", th2.getMessage());
        }
    }
}
