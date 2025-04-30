package com.bytedance.sdk.openadsdk.lMd.lMd;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS implements lMd {
    lMd zp;

    @Override // com.bytedance.sdk.openadsdk.lMd.lMd.lMd
    public void zp(JSONObject jSONObject, long j7) throws JSONException {
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.zp(jSONObject, j7);
        }
        if (j7 <= 0) {
            j7 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j7);
    }
}
