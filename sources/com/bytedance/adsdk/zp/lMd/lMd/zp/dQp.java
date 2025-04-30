package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dQp implements com.bytedance.adsdk.zp.lMd.lMd.zp {
    private Number zp;

    public dQp(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.zp = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.zp = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.zp = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.zp = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        return this.zp.toString();
    }

    public String toString() {
        return lMd();
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public com.bytedance.adsdk.zp.lMd.jU.COT zp() {
        return com.bytedance.adsdk.zp.lMd.jU.HWF.NUMBER;
    }
}
