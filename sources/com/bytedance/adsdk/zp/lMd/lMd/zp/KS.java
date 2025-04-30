package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS extends woN {
    public KS() {
        super(com.bytedance.adsdk.zp.lMd.jU.KS.DOUBLE_BAR);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp.woN
    public String toString() {
        return lMd();
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        boolean z8;
        if (!com.bytedance.adsdk.zp.lMd.COT.lMd.zp(this.zp.zp(map)) && !com.bytedance.adsdk.zp.lMd.COT.lMd.zp(this.lMd.zp(map))) {
            z8 = false;
        } else {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
