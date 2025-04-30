package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rV extends woN {
    public rV() {
        super(com.bytedance.adsdk.zp.lMd.jU.KS.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp = this.zp.zp(map);
        Object zp2 = this.lMd.zp(map);
        if (zp == null && zp2 == null) {
            return Boolean.FALSE;
        }
        if (zp == null && zp2 != null) {
            return Boolean.TRUE;
        }
        if (zp != null && zp2 == null) {
            return Boolean.TRUE;
        }
        if ((zp instanceof Number) && (zp2 instanceof Number)) {
            return Boolean.valueOf(!com.bytedance.adsdk.zp.lMd.COT.zp.lMd.zp((Number) zp, (Number) zp2));
        }
        return Boolean.valueOf(!zp.equals(zp2));
    }
}
