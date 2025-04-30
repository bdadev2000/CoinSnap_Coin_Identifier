package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF {
    private List<String> lMd;
    private String zp;

    public HWF(String str) {
        HashMap<String, Object> zp;
        this.zp = "";
        this.lMd = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            zp = new HashMap<>();
        } else {
            zp = zp(str);
        }
        try {
            this.zp = (String) zp.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) zp.get("auto_test_hosts"));
            this.lMd = new ArrayList();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                this.lMd.add(jSONArray.optString(i9));
            }
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("AutoTestModel", e4.getMessage());
        }
    }

    public List<String> lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    private static final HashMap<String, Object> zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
