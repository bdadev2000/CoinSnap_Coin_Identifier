package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class cz implements com.bytedance.adsdk.zp.lMd.lMd.zp {
    private final String zp;

    public cz(String str) {
        this.zp = str;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        return AbstractC2914a.h(new StringBuilder("'"), this.zp, "'");
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
        return com.bytedance.adsdk.zp.lMd.jU.HWF.STRING;
    }
}
