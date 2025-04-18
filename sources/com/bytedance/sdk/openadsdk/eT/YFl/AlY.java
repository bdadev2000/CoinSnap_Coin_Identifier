package com.bytedance.sdk.openadsdk.eT.YFl;

import com.bytedance.sdk.component.YFl.lG;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY extends com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject> {
    private JSONObject YFl;

    public AlY(JSONObject jSONObject) {
        this.YFl = jSONObject;
    }

    public static void YFl(lG lGVar, JSONObject jSONObject) {
        lGVar.YFl("getData", new AlY(jSONObject));
    }

    @Override // com.bytedance.sdk.component.YFl.wN
    public JSONObject YFl(JSONObject jSONObject, com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.qsH.YFl.Sg.YFl(this.YFl, jSONObject);
    }
}
