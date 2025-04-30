package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT implements KS {
    private String COT;
    private String HWF;
    private long KS;
    private int jU;
    private long lMd;
    private String zp;

    public void KS(String str) {
        this.HWF = str;
    }

    public void lMd(long j7) {
        this.KS = j7;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void lMd(String str) {
        this.COT = str;
    }

    public void zp(long j7) {
        this.lMd = j7;
    }

    public void zp(int i9) {
        this.jU = i9;
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
            jSONObject.put("error_code", this.jU);
            jSONObject.put("error_message", this.COT);
            jSONObject.put("error_message_server", this.HWF);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("LoadVideoErrorModel", th.getMessage());
        }
    }
}
