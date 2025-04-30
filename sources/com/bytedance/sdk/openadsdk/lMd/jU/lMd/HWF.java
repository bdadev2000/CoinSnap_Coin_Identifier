package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF implements KS {
    private int KS = 0;
    private long lMd;
    private long zp;

    public void lMd(long j7) {
        this.lMd = j7;
    }

    public void zp(long j7) {
        this.zp = j7;
    }

    public void zp(int i9) {
        this.KS = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.jU.lMd.KS
    public void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.zp);
            jSONObject.put("buffers_time", this.lMd);
            jSONObject.put("video_backup", this.KS);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("FeedOverModel", th.getMessage());
        }
    }
}
