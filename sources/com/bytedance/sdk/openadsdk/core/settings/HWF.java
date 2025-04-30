package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF {
    public boolean COT;
    public boolean HWF;
    public String KS;
    public boolean jU;
    public static final HWF zp = new HWF(null);
    public static String lMd = "";

    public HWF(String str) {
        this.KS = "https://lf3-cdn-tos.bytegoofy.com/obj/goofy/bytecom/resource/tetrisIAB/3p_monitor.2424fa46.js";
        this.jU = true;
        this.COT = true;
        this.HWF = true;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String optString = optJSONObject.optString("url", "https://lf3-cdn-tos.bytegoofy.com/obj/goofy/bytecom/resource/tetrisIAB/3p_monitor.2424fa46.js");
            if (!TextUtils.isEmpty(optString)) {
                this.KS = optString;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                arrayList.add(optJSONArray.optString(i9));
            }
            this.jU = arrayList.contains("load_finish");
            this.HWF = arrayList.contains("load_fail");
            this.COT = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
