package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QR implements com.bytedance.adsdk.zp.lMd.lMd.zp {
    private final Object zp;

    public QR(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.zp = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.zp = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase("null")) {
                this.zp = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        Object obj = this.zp;
        if (obj != null) {
            return obj.toString();
        }
        return "NULL";
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.zp + "]";
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public com.bytedance.adsdk.zp.lMd.jU.COT zp() {
        return com.bytedance.adsdk.zp.lMd.jU.HWF.CONSTANT;
    }
}
