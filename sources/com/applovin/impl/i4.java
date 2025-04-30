package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i4 extends h4 {
    public i4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public List e() {
        j4 a6;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            if (jSONObject != null && (a6 = j4.a(jSONObject, this.f8051a)) != null) {
                arrayList.add(a6);
            }
        }
        return arrayList;
    }

    public String f() {
        return b("message");
    }

    public String g() {
        return b(CampaignEx.JSON_KEY_TITLE);
    }

    @Override // com.applovin.impl.h4
    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "title=" + g() + "message=" + f() + "actions=" + e() + "}";
    }
}
