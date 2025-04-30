package com.bytedance.sdk.component.adexpress.dynamic.KS;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU {
    public String KS;
    public String jU;
    public String lMd;
    public List<zp> zp;

    /* loaded from: classes.dex */
    public static class zp {
        public JSONObject lMd;
        public int zp;
    }

    public static jU zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jU jUVar = new jU();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    zp zpVar = new zp();
                    zpVar.zp = optJSONObject.optInt("id");
                    zpVar.lMd = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(zpVar);
                }
            }
        } catch (JSONException unused) {
        }
        jUVar.zp = arrayList;
        jUVar.lMd = jSONObject.optString("diff_data");
        jUVar.KS = jSONObject.optString("style_diff");
        jUVar.jU = jSONObject.optString("tag_diff");
        return jUVar;
    }
}
