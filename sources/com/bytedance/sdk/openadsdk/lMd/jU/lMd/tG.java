package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class tG implements KS {
    public long KS;
    public int lMd;
    public long zp;

    public void lMd(long j7) {
        this.KS = j7;
    }

    public void zp(long j7) {
        this.zp = j7;
    }

    public void zp(int i9) {
        this.lMd = i9;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.jU.lMd.KS
    public void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.zp);
            jSONObject.put("buffers_count", this.lMd);
            jSONObject.put("total_duration", this.KS);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("PlayBufferModel", th.getMessage());
        }
    }
}
