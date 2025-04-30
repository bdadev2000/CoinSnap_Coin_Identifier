package com.bytedance.sdk.openadsdk.lMd.jU.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class Bj implements KS {
    private final long lMd;
    private final String zp;

    public Bj(String str, long j7) {
        this.zp = str;
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
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("LoadVideoStartModel", th.getMessage());
        }
    }
}
