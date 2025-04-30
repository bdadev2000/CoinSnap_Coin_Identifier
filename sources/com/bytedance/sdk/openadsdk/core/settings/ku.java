package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku {
    public static final ku zp = new ku("");
    private final HashMap<String, zp> lMd = new HashMap<>();

    /* loaded from: classes.dex */
    public static class zp {
        public String COT;
        public int KS;
        public int jU;
        public String lMd;
        public final String zp;

        public zp(JSONObject jSONObject) {
            this.zp = jSONObject.optString("name");
            this.lMd = jSONObject.optString(MBridgeConstans.APP_ID);
            this.KS = jSONObject.optInt("init_thread", 2);
            this.jU = jSONObject.optInt("request_after_init", 2);
            this.COT = jSONObject.optString("class_name");
        }
    }

    public ku(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    zp zpVar = new zp(optJSONObject);
                    this.lMd.put(zpVar.zp, zpVar);
                }
            }
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("MediationInitConfigs", e4.getMessage());
        }
    }
}
