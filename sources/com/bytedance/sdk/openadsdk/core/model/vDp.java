package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vDp {
    private final int KS;
    private final int jU;
    private final int lMd;
    private final int zp;

    public vDp(JSONObject jSONObject) {
        this.zp = jSONObject.optInt("auto_click", 0);
        this.lMd = jSONObject.optInt("close_jump_probability", 0);
        this.KS = jSONObject.optInt("skip_jump_probability", 0);
        this.jU = jSONObject.optInt("hidden_bar", 0);
    }

    public JSONObject COT() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i9 = this.zp;
            if (i9 == 1) {
                jSONObject.put("auto_click", i9);
            }
            int i10 = this.lMd;
            if (i10 > 0 && i10 <= 100) {
                jSONObject.put("close_jump_probability", i10);
            }
            int i11 = this.KS;
            if (i11 > 0 && i11 <= 100) {
                jSONObject.put("skip_jump_probability", i11);
            }
            if (this.jU == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int KS() {
        int i9 = this.KS;
        if (i9 >= 0 && i9 <= 100) {
            return i9;
        }
        return 0;
    }

    public boolean jU() {
        if (this.jU == 1) {
            return true;
        }
        return false;
    }

    public int lMd() {
        int i9 = this.lMd;
        if (i9 >= 0 && i9 <= 100) {
            return i9;
        }
        return 0;
    }

    public int zp() {
        return this.zp;
    }

    public static boolean zp(woN won) {
        if (won == null || !won.Fm() || won.fw() == null) {
            return false;
        }
        return won.fw().jU();
    }
}
