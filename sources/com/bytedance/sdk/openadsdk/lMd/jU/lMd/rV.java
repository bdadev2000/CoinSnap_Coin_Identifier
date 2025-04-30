package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class rV implements KS {
    private final String COT;
    private final int KS;
    private final int jU;
    private long lMd;
    private long zp;

    public rV(com.bykv.vk.openvk.component.video.api.KS.zp zpVar) {
        this.KS = zpVar.zp();
        this.jU = zpVar.lMd();
        this.COT = zpVar.KS();
    }

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
            jSONObject.put("error_code", this.KS);
            jSONObject.put("extra_error_code", this.jU);
            jSONObject.put("error_message", this.COT);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("PlayErrorModel", th.getMessage());
        }
    }
}
