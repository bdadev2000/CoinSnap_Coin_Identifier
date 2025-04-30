package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF extends woN {
    public HWF() {
        super(com.bytedance.adsdk.zp.lMd.jU.KS.GT);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp;
        Object zp2 = this.zp.zp(map);
        if (zp2 == null || (zp = this.lMd.zp(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.zp.lMd.COT.zp.KS.zp(zp2, (Number) zp);
    }
}
