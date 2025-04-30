package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class vDp implements KS {
    private long KS;
    private long jU;
    private long lMd;
    private String zp;

    public void KS(long j7) {
        this.jU = j7;
    }

    public void lMd(long j7) {
        this.KS = j7;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void zp(long j7) {
        this.lMd = j7;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.jU.lMd.KS
    public void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.zp);
            jSONObject.put("preload_size", this.lMd);
            jSONObject.put("load_time", this.KS);
            jSONObject.put("local_cache", this.jU);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
