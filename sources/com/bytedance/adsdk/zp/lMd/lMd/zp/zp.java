package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp extends woN {
    public zp() {
        super(com.bytedance.adsdk.zp.lMd.jU.KS.DIVISION);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp;
        Object zp2 = this.zp.zp(map);
        if (zp2 == null || (zp = this.lMd.zp(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.zp.lMd.COT.zp.zp.zp((Number) zp2, (Number) zp);
    }
}
