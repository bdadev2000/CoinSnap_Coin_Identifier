package com.bytedance.sdk.openadsdk.core.jU;

import com.bytedance.sdk.component.QR.lMd.jU;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private static JSONObject lMd(String str, long j7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, j7);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void zp(String str, long j7) {
        JSONObject lMd = lMd(str, j7);
        jU lMd2 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
        lMd2.lMd(YhE.jU("/api/ad/union/sdk/stats/"));
        lMd2.jU(lMd.toString());
        lMd2.zp(6);
        lMd2.zp("uploadFrequentEvent");
        lMd2.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.jU.KS.1
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
            }

            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                iOException.getMessage();
            }
        });
    }
}
