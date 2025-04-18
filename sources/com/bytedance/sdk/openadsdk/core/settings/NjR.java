package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NjR {
    public static final NjR YFl = new NjR("");
    private final HashMap<String, YFl> Sg = new HashMap<>();

    /* loaded from: classes.dex */
    public static class YFl {
        public int AlY;
        public String Sg;
        public final String YFl;
        public int tN;
        public String wN;

        public YFl(JSONObject jSONObject) {
            this.YFl = jSONObject.optString("name");
            this.Sg = jSONObject.optString(MBridgeConstans.APP_ID);
            this.tN = jSONObject.optInt("init_thread", 2);
            this.AlY = jSONObject.optInt("request_after_init", 2);
            this.wN = jSONObject.optString("class_name");
        }
    }

    public NjR(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    YFl yFl = new YFl(optJSONObject);
                    this.Sg.put(yFl.YFl, yFl);
                }
            }
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("MediationInitConfigs", e2.getMessage());
        }
    }
}
