package com.bytedance.sdk.openadsdk.AlY.Sg;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN implements Sg {
    Sg YFl;

    @Override // com.bytedance.sdk.openadsdk.AlY.Sg.Sg
    public void YFl(JSONObject jSONObject, long j3) throws JSONException {
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.YFl(jSONObject, j3);
        }
        if (j3 <= 0) {
            j3 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j3);
    }
}
