package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT extends woN {
    public COT() {
        super(com.bytedance.adsdk.zp.lMd.jU.KS.GT_EQ);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp;
        if (this.zp.zp(map) == null || (zp = this.lMd.zp(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.zp.lMd.COT.zp.jU.zp(r0, (Number) zp)).booleanValue());
    }
}
