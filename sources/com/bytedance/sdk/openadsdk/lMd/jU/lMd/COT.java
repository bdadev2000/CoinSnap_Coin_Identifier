package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT implements KS {
    private long lMd;
    private long zp;

    public void lMd(long j7) {
        this.lMd = j7;
    }

    public void zp(long j7) {
        this.zp = j7;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.jU.lMd.KS
    public void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.zp);
            jSONObject.put("total_duration", this.lMd);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("FeedContinueModel", th.getMessage());
        }
    }
}
