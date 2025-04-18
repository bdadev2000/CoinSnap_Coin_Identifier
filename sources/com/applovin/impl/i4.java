package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
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
        j4 a;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f5084b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject != null && (a = j4.a(jSONObject, this.a)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public String f() {
        return b(PglCryptUtils.KEY_MESSAGE);
    }

    public String g() {
        return b(CampaignEx.JSON_KEY_TITLE);
    }

    @Override // com.applovin.impl.h4
    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "title=" + g() + "message=" + f() + "actions=" + e() + "}";
    }
}
