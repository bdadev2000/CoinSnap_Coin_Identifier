package com.bytedance.sdk.openadsdk.core.QR.lMd;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd extends KS implements Comparable<lMd> {
    private final float zp;

    /* loaded from: classes.dex */
    public static class zp {
        private KS.EnumC0101KS KS = KS.EnumC0101KS.TRACKING_URL;
        private boolean jU = false;
        private final float lMd;
        private final String zp;

        public zp(String str, float f9) {
            this.zp = str;
            this.lMd = f9;
        }

        public lMd zp() {
            return new lMd(this.lMd, this.zp, this.KS, Boolean.valueOf(this.jU));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.QR.lMd.KS
    public void h_() {
        super.h_();
    }

    public JSONObject lMd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, KS());
        jSONObject.put("trackingFraction", this.zp);
        return jSONObject;
    }

    public boolean zp(float f9) {
        return this.zp <= f9 && !COT();
    }

    private lMd(float f9, String str, KS.EnumC0101KS enumC0101KS, Boolean bool) {
        super(str, enumC0101KS, bool);
        this.zp = f9;
    }

    @Override // java.lang.Comparable
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public int compareTo(lMd lmd) {
        if (lmd == null) {
            return 1;
        }
        float f9 = this.zp;
        float f10 = lmd.zp;
        if (f9 > f10) {
            return 1;
        }
        return f9 < f10 ? -1 : 0;
    }
}
