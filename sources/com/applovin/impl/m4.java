package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class m4 {
    private static List a(int i9, com.applovin.impl.sdk.k kVar) {
        String a6 = zp.a(i9, com.applovin.impl.sdk.k.k(), kVar);
        if (!TextUtils.isEmpty(a6)) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(a6, null);
            if (jsonObjectFromJsonString != null) {
                JSONArray jSONArray = JsonUtils.getJSONArray(jsonObjectFromJsonString, "states", new JSONArray());
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(h4.a(JsonUtils.getJSONObject(jSONArray, i10, new JSONObject()), kVar));
                }
                return arrayList;
            }
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }

    public static List b(com.applovin.impl.sdk.k kVar) {
        return a(R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, kVar);
    }

    public static List c(com.applovin.impl.sdk.k kVar) {
        return a(R.raw.applovin_consent_flow_unified_cmp, kVar);
    }

    public static List a(com.applovin.impl.sdk.k kVar) {
        return a(R.raw.applovin_consent_flow_privacy_policy, kVar);
    }
}
