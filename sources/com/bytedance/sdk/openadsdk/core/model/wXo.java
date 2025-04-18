package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wXo {
    private int AlY;
    private String Sg;
    private String YFl;
    private int tN;

    public void Sg(String str) {
        this.Sg = str;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public JSONObject tN() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.YFl)) {
                jSONObject.put("market_dpl", this.YFl);
            }
            if (!TextUtils.isEmpty(this.Sg)) {
                jSONObject.put("market_dpl_auto", this.Sg);
            }
            jSONObject.put("exec_type", this.tN);
            jSONObject.put("oem_vendor_type", this.AlY);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("OemModel", th2.getMessage());
            return null;
        }
    }

    public void Sg(int i10) {
        this.AlY = i10;
    }

    public void YFl(int i10) {
        this.tN = i10;
    }

    public String Sg() {
        if (this.tN == 2) {
            return this.Sg;
        }
        return this.YFl;
    }

    public boolean YFl() {
        return this.AlY == 1;
    }

    public static wXo YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        wXo wxo = new wXo();
        try {
            wxo.YFl(jSONObject.optString("market_dpl", ""));
            wxo.Sg(jSONObject.optString("market_dpl_auto", ""));
            wxo.YFl(jSONObject.optInt("exec_type", 0));
            wxo.Sg(jSONObject.optInt("oem_vendor_type", 0));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("OemModel", th2.getMessage());
        }
        return wxo;
    }
}
