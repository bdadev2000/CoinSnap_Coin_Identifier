package com.bytedance.sdk.openadsdk.ku.zp;

import com.bytedance.sdk.component.zp.woN;
import com.bytedance.sdk.openadsdk.core.RCv;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku extends com.bytedance.sdk.component.zp.COT<JSONObject, JSONObject> {
    private final RCv zp;

    public ku(RCv rCv) {
        this.zp = rCv;
    }

    public static void zp(woN won, RCv rCv) {
        won.zp("commonConvert", new ku(rCv));
    }

    @Override // com.bytedance.sdk.component.zp.COT
    public JSONObject zp(JSONObject jSONObject, com.bytedance.sdk.component.zp.HWF hwf) throws Exception {
        this.zp.jU(jSONObject);
        return null;
    }
}
