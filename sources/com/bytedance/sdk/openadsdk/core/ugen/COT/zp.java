package com.bytedance.sdk.openadsdk.core.ugen.COT;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private String COT;
    private String KS;
    private String jU;
    private String lMd;
    private String zp;

    public String COT() {
        return this.COT;
    }

    public JSONObject HWF() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.zp);
            jSONObject.put("md5", this.lMd);
            jSONObject.put("url", this.KS);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String KS() {
        return this.KS;
    }

    public String jU() {
        return this.jU;
    }

    public String lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public zp COT(String str) {
        this.COT = str;
        return this;
    }

    public zp KS(String str) {
        this.KS = str;
        return this;
    }

    public zp jU(String str) {
        this.jU = str;
        return this;
    }

    public zp lMd(String str) {
        this.lMd = str;
        return this;
    }

    public zp zp(String str) {
        this.zp = str;
        return this;
    }
}
