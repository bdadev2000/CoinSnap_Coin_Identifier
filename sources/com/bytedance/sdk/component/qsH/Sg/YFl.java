package com.bytedance.sdk.component.qsH.Sg;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    public int AlY;
    public int Sg;
    public int YFl;
    public int tN;

    public YFl(int i10, int i11, int i12, int i13) {
        this.YFl = i10;
        this.Sg = i11;
        this.tN = i12;
        this.AlY = i13;
    }

    public JSONObject YFl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.YFl);
            jSONObject.put("sdk_max_thread_num", this.Sg);
            jSONObject.put("app_thread_num", this.tN);
            jSONObject.put("app_max_thread_num", this.AlY);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
