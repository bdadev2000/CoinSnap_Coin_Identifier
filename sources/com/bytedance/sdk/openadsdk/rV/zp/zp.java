package com.bytedance.sdk.openadsdk.rV.zp;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private final float KS;
    private final int lMd;
    private final int zp;

    public zp(int i9, int i10, float f9) {
        this.zp = i9;
        this.lMd = i10;
        this.KS = f9;
    }

    public static JSONObject zp(zp zpVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zpVar.zp);
        jSONObject.put("height", zpVar.lMd);
        jSONObject.put("alpha", zpVar.KS);
        return jSONObject;
    }
}
