package com.bytedance.sdk.component.adexpress.dynamic.AlY;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY {
    public String AlY;
    public String Sg;
    public List<YFl> YFl;
    public String tN;

    /* loaded from: classes.dex */
    public static class YFl {
        public JSONObject Sg;
        public int YFl;
    }

    public static AlY YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        AlY alY = new AlY();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    YFl yFl = new YFl();
                    yFl.YFl = optJSONObject.optInt("id");
                    yFl.Sg = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(yFl);
                }
            }
        } catch (JSONException unused) {
        }
        alY.YFl = arrayList;
        alY.Sg = jSONObject.optString("diff_data");
        alY.tN = jSONObject.optString("style_diff");
        alY.AlY = jSONObject.optString("tag_diff");
        return alY;
    }
}
