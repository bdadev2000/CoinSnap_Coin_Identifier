package com.mbridge.msdk.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g extends b {
    public static g e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b.a(new JSONObject(str));
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("Setting", "parseSetting", e4);
            }
            return null;
        }
    }

    public final String aJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cc", o());
            jSONObject.put("cfc", q());
            jSONObject.put("cfb", aB());
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, Z());
            jSONObject.put("awct", m());
            jSONObject.put("rurl", aG());
            jSONObject.put("ujds", aH());
            jSONObject.put(CampaignEx.JSON_KEY_PLCTB, aa());
            jSONObject.put("tcto", ao());
            jSONObject.put("mv_wildcard", S());
            jSONObject.put("is_startup_crashsystem", I());
            jSONObject.put("sfct", al());
            jSONObject.put("pcrn", W());
            jSONObject.put("adct", i());
            jSONObject.put("atrqt", l());
            jSONObject.put("omsdkjs_url", U());
            jSONObject.put("mcs", Q());
            jSONObject.put("GDPR_area", aE());
            jSONObject.put("alrbs", j());
            jSONObject.put("ct", x());
            jSONObject.put("isDefault", H());
            jSONObject.put("st_net", an());
            jSONObject.put("vtag", av());
            return jSONObject.toString();
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.b("Setting", "toJSON", th);
            }
            return null;
        }
    }
}
