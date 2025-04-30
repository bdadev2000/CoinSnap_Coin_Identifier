package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT {
    private int KS;
    private String lMd;
    private String zp;

    public int KS() {
        return this.KS;
    }

    @Nullable
    public JSONObject jU() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.zp);
            jSONObject.put("ft", this.KS);
            jSONObject.put("fu", this.lMd);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void lMd(String str) {
        this.lMd = str;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void zp(int i9) {
        this.KS = i9;
    }
}
