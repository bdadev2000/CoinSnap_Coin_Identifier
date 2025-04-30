package com.bytedance.sdk.component.ku.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    public int KS;
    public int jU;
    public int lMd;
    public int zp;

    public zp(int i9, int i10, int i11, int i12) {
        this.zp = i9;
        this.lMd = i10;
        this.KS = i11;
        this.jU = i12;
    }

    public JSONObject zp() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.zp);
            jSONObject.put("sdk_max_thread_num", this.lMd);
            jSONObject.put("app_thread_num", this.KS);
            jSONObject.put("app_max_thread_num", this.jU);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
