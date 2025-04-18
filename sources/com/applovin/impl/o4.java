package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class o4 {
    private static List a(int i2, com.applovin.impl.sdk.j jVar) {
        String a2 = yp.a(i2, com.applovin.impl.sdk.j.l(), jVar);
        if (!TextUtils.isEmpty(a2)) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(a2, null);
            if (jsonObjectFromJsonString != null) {
                JSONArray jSONArray = JsonUtils.getJSONArray(jsonObjectFromJsonString, "states", new JSONArray());
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(j4.a(JsonUtils.getJSONObject(jSONArray, i3, new JSONObject()), jVar));
                }
                return arrayList;
            }
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }

    public static List b(com.applovin.impl.sdk.j jVar) {
        return a(R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, jVar);
    }

    public static List c(com.applovin.impl.sdk.j jVar) {
        return a(R.raw.applovin_consent_flow_unified_cmp, jVar);
    }

    public static List a(com.applovin.impl.sdk.j jVar) {
        return a(R.raw.applovin_consent_flow_privacy_policy, jVar);
    }
}
