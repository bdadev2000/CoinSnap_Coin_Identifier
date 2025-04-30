package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vwr extends woN {
    private static final ThreadLocal<StringBuilder> jU = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.zp.lMd.lMd.zp.vwr.1
        @Override // java.lang.ThreadLocal
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public vwr() {
        super(com.bytedance.adsdk.zp.lMd.jU.KS.PLUS);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp;
        Object zp2 = this.zp.zp(map);
        if (zp2 == null || (zp = this.lMd.zp(map)) == null) {
            return null;
        }
        if (!(zp2 instanceof String) && !(zp instanceof String)) {
            return com.bytedance.adsdk.zp.lMd.COT.zp.ku.zp((Number) zp2, (Number) zp);
        }
        StringBuilder sb = jU.get();
        sb.append(zp2);
        sb.append(zp);
        String sb2 = sb.toString();
        sb.setLength(0);
        return sb2;
    }
}
