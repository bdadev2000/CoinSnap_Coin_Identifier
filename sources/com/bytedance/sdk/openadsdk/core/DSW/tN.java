package com.bytedance.sdk.openadsdk.core.DSW;

import com.bytedance.sdk.component.DSW.Sg.AlY;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private static JSONObject Sg(String str, long j3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, j3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void YFl(String str, long j3) {
        JSONObject Sg = Sg(str, j3);
        AlY Sg2 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
        Sg2.Sg(Sco.AlY("/api/ad/union/sdk/stats/"));
        Sg2.AlY(Sg.toString());
        Sg2.YFl(6);
        Sg2.YFl("uploadFrequentEvent");
        Sg2.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.DSW.tN.1
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                iOException.getMessage();
            }
        });
    }
}
