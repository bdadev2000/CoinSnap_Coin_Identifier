package com.bytedance.sdk.openadsdk.eT.YFl;

import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.openadsdk.core.hQ;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc extends com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject> {
    private final hQ YFl;

    public nc(hQ hQVar) {
        this.YFl = hQVar;
    }

    public static void YFl(lG lGVar, hQ hQVar) {
        lGVar.YFl("commonConvert", new nc(hQVar));
    }

    @Override // com.bytedance.sdk.component.YFl.wN
    public JSONObject YFl(JSONObject jSONObject, com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        this.YFl.wN(jSONObject);
        return null;
    }
}
