package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT {
    private String Sg;
    private String YFl;
    private int tN;

    @Nullable
    public JSONObject AlY() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.YFl);
            jSONObject.put("ft", this.tN);
            jSONObject.put("fu", this.Sg);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public int tN() {
        return this.tN;
    }

    public void Sg(String str) {
        this.Sg = str;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void YFl(int i10) {
        this.tN = i10;
    }
}
