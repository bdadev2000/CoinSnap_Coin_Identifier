package com.bytedance.sdk.openadsdk.VOe.YFl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private final int Sg;
    private final int YFl;
    private final float tN;

    public YFl(int i10, int i11, float f10) {
        this.YFl = i10;
        this.Sg = i11;
        this.tN = f10;
    }

    public static JSONObject YFl(YFl yFl) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", yFl.YFl);
        jSONObject.put("height", yFl.Sg);
        jSONObject.put("alpha", yFl.tN);
        return jSONObject;
    }
}
