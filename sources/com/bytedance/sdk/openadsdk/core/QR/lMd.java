package com.bytedance.sdk.openadsdk.core.QR;

import com.bytedance.sdk.openadsdk.core.QR.KS.zp;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd extends KS {
    private long Bj;
    private long dT;

    public lMd(int i9, int i10, long j7, long j9, zp.EnumC0100zp enumC0100zp, zp.lMd lmd, String str, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list2, String str2) {
        super(i9, i10, enumC0100zp, lmd, str, list, list2, str2);
        this.dT = j7;
        this.Bj = j9;
        this.YW = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.QR.KS
    public JSONObject zp() throws JSONException {
        JSONObject zp = super.zp();
        if (zp != null) {
            zp.put("offset", this.dT);
            zp.put("duration", this.Bj);
        }
        return zp;
    }

    public static lMd zp(JSONObject jSONObject) {
        KS lMd = KS.lMd(jSONObject);
        if (lMd == null) {
            return null;
        }
        return new lMd(lMd.zp, lMd.lMd, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), lMd.KS, lMd.jU, lMd.COT, lMd.HWF, lMd.QR, lMd.ku);
    }
}
