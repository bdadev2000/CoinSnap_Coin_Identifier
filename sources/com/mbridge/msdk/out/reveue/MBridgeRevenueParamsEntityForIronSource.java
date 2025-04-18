package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeRevenueParamsEntityForIronSource extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForIronSource(String str, String str2) {
        super(str, str2);
        setMediationName("IronSource");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setIronSourceImpressionDataString(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setMediationUnitId(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            String f10 = e.f("{", str2, "}");
            try {
                setSourceData(f10, f10);
                JSONObject jSONObject = new JSONObject(f10);
                setNetworkName(jSONObject.optString("adNetwork", ""));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("instanceName", jSONObject.optString("instanceName", ""));
                jSONObject2.put("instanceId", jSONObject.optString("instanceId", ""));
                setNetworkInfo(jSONObject2);
                setAdType(jSONObject.optString(OutOfContextTestingActivity.AD_UNIT_KEY, ""));
                setRevenue(jSONObject.optString("revenue", ""));
                setPrecision(jSONObject.optString("precision", ""));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
