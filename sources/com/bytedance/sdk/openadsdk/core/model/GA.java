package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GA {
    private final int AlY;
    private final int Sg;
    private final int YFl;
    private final int tN;

    public GA(JSONObject jSONObject) {
        this.YFl = jSONObject.optInt("auto_click", 0);
        this.Sg = jSONObject.optInt("close_jump_probability", 0);
        this.tN = jSONObject.optInt("skip_jump_probability", 0);
        this.AlY = jSONObject.optInt("hidden_bar", 0);
    }

    public boolean AlY() {
        return this.AlY == 1;
    }

    public int Sg() {
        int i10 = this.Sg;
        if (i10 < 0 || i10 > 100) {
            return 0;
        }
        return i10;
    }

    public int YFl() {
        return this.YFl;
    }

    public int tN() {
        int i10 = this.tN;
        if (i10 < 0 || i10 > 100) {
            return 0;
        }
        return i10;
    }

    public JSONObject wN() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = this.YFl;
            if (i10 == 1) {
                jSONObject.put("auto_click", i10);
            }
            int i11 = this.Sg;
            if (i11 > 0 && i11 <= 100) {
                jSONObject.put("close_jump_probability", i11);
            }
            int i12 = this.tN;
            if (i12 > 0 && i12 <= 100) {
                jSONObject.put("skip_jump_probability", i12);
            }
            if (this.AlY == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean YFl(Wwa wwa) {
        if (wwa == null || !wwa.yn() || wwa.EAq() == null) {
            return false;
        }
        return wwa.EAq().AlY();
    }
}
