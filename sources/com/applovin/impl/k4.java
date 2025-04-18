package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k4 extends j4 {
    public k4(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jVar);
    }

    public List e() {
        l4 a2;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f24589b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject != null && (a2 = l4.a(jSONObject, this.f24588a)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public String f() {
        return b("message");
    }

    public String g() {
        return b("title");
    }

    @Override // com.applovin.impl.j4
    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "title=" + g() + "message=" + f() + "actions=" + e() + "}";
    }
}
