package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UZM {
    private String AlY;
    private String Sg;
    private String YFl;
    private String tN;
    private JSONObject wN;

    public String AlY() {
        return this.AlY;
    }

    public String Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public String tN() {
        return this.tN;
    }

    public JSONObject vc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.YFl);
            jSONObject.put("md5", this.Sg);
            jSONObject.put("url", this.tN);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, this.AlY);
            jSONObject.put("custom_components", this.wN);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject wN() {
        return this.wN;
    }

    public static UZM YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        UZM uzm = new UZM();
        uzm.YFl = jSONObject.optString("id");
        uzm.AlY = jSONObject.optString(DataSchemeDataSource.SCHEME_DATA);
        uzm.tN = jSONObject.optString("url");
        uzm.Sg = jSONObject.optString("md5");
        uzm.wN = jSONObject.optJSONObject("custom_components");
        return uzm;
    }
}
