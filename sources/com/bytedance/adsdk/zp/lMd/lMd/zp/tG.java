package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tG extends woN {
    public tG() {
        super(com.bytedance.adsdk.zp.lMd.jU.KS.MULTI);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp;
        Object zp2 = this.zp.zp(map);
        if (zp2 == null || (zp = this.lMd.zp(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.zp.lMd.COT.zp.QR.zp((Number) zp2, (Number) zp);
    }
}
