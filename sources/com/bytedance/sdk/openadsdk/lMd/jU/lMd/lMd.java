package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd implements KS {
    private int KS;
    private int jU;
    private long lMd;
    private long zp;

    public void lMd(long j7) {
        this.lMd = j7;
    }

    public void zp(long j7) {
        this.zp = j7;
    }

    public void lMd(int i9) {
        this.jU = i9;
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
            jSONObject.put("buffers_time", this.zp);
            jSONObject.put("total_duration", this.lMd);
            jSONObject.put("vbtt_skip_type", this.KS);
            jSONObject.put("skip_reason", this.jU);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("EndcardSkipModel", th.getMessage());
        }
    }
}
