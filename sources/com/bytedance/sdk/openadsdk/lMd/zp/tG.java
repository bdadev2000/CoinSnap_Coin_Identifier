package com.bytedance.sdk.openadsdk.lMd.zp;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tG implements com.bytedance.sdk.openadsdk.dT.lMd {
    private final boolean lMd;
    private final com.bytedance.sdk.component.HWF.zp.HWF.jU zp;

    public tG(boolean z8, com.bytedance.sdk.component.HWF.zp.HWF.jU jUVar) {
        this.zp = jUVar;
        this.lMd = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.dT.lMd
    @Nullable
    public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
        int i9;
        if (this.zp == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.lMd);
        jSONObject.put("url", this.zp.lMd());
        int jU = this.zp.jU();
        if (jU <= 0) {
            jU = 0;
        }
        jSONObject.put("retry_times", jU);
        jSONObject.put("ad_id", this.zp.HWF());
        jSONObject.put("track_type", this.zp.COT());
        if (this.lMd) {
            if (this.zp.dT()) {
                i9 = 3;
            } else if (this.zp.jU() <= 0) {
                i9 = 1;
            } else {
                i9 = 2;
            }
        } else {
            i9 = 4;
        }
        jSONObject.put("upload_scene", i9);
        String QR = this.zp.QR();
        if (!TextUtils.isEmpty(QR)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : QR.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String YW = this.zp.YW();
        if (!TextUtils.isEmpty(YW)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : YW.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("track_link_result").lMd(jSONObject.toString());
    }
}
