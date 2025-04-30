package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KVG implements com.bytedance.adsdk.zp.lMd.lMd.zp {
    private final com.bytedance.adsdk.zp.lMd.jU.KS zp;

    public KVG(com.bytedance.adsdk.zp.lMd.jU.KS ks) {
        this.zp = ks;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        return this.zp.zp();
    }

    public String toString() {
        return lMd();
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public com.bytedance.adsdk.zp.lMd.jU.COT zp() {
        return this.zp;
    }
}
