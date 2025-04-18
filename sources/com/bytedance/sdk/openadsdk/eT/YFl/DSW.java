package com.bytedance.sdk.openadsdk.eT.YFl;

import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.openadsdk.core.hQ;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW extends com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject> {
    private final String Sg;
    private final hQ YFl;

    public DSW(hQ hQVar, String str) {
        this.YFl = hQVar;
        this.Sg = str;
    }

    public static void YFl(lG lGVar, hQ hQVar) {
        lGVar.YFl("endcardDynamicCreatives", new DSW(hQVar, "endcardDynamicCreatives"));
        lGVar.YFl("multiOpenCovert", new DSW(hQVar, "multiOpenCovert"));
    }

    @Override // com.bytedance.sdk.component.YFl.wN
    public JSONObject YFl(JSONObject jSONObject, com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.Sg)) {
            return this.YFl.vc(jSONObject);
        }
        if (!"multiOpenCovert".equals(this.Sg)) {
            return null;
        }
        this.YFl.DSW(jSONObject);
        return null;
    }
}
