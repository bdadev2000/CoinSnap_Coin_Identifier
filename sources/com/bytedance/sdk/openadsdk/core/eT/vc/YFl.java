package com.bytedance.sdk.openadsdk.core.eT.vc;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private String AlY;
    private String Sg;
    private String YFl;
    private String tN;
    private String wN;

    public String AlY() {
        return this.AlY;
    }

    public String Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public String tN() {
        return this.tN;
    }

    public String wN() {
        return this.wN;
    }

    public YFl AlY(String str) {
        this.AlY = str;
        return this;
    }

    public YFl Sg(String str) {
        this.Sg = str;
        return this;
    }

    public YFl YFl(String str) {
        this.YFl = str;
        return this;
    }

    public YFl tN(String str) {
        this.tN = str;
        return this;
    }

    public YFl wN(String str) {
        this.wN = str;
        return this;
    }

    public JSONObject YFl(YFl yFl) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.YFl);
            jSONObject.put("md5", this.Sg);
            jSONObject.put("url", this.tN);
            if (yFl != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", yFl.YFl());
                jSONObject2.put("md5", yFl.Sg());
                jSONObject2.put("url", yFl.tN());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
