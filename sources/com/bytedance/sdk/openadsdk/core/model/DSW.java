package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW {
    private List<String> Sg;
    private String YFl;

    public DSW(String str) {
        HashMap<String, Object> YFl;
        this.YFl = "";
        this.Sg = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            YFl = new HashMap<>();
        } else {
            YFl = YFl(str);
        }
        try {
            this.YFl = (String) YFl.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) YFl.get("auto_test_hosts"));
            this.Sg = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.Sg.add(jSONArray.optString(i10));
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AutoTestModel", e2.getMessage());
        }
    }

    public List<String> Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    private static final HashMap<String, Object> YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
