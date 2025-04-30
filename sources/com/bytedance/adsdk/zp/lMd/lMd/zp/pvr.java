package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pvr implements com.bytedance.adsdk.zp.lMd.lMd.lMd {
    private com.bytedance.adsdk.zp.lMd.lMd.zp KS;
    private com.bytedance.adsdk.zp.lMd.lMd.zp lMd;
    private com.bytedance.adsdk.zp.lMd.lMd.zp zp;

    @Override // com.bytedance.adsdk.zp.lMd.lMd.lMd
    public void KS(com.bytedance.adsdk.zp.lMd.lMd.zp zpVar) {
        this.KS = zpVar;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.lMd
    public void lMd(com.bytedance.adsdk.zp.lMd.lMd.zp zpVar) {
        this.lMd = zpVar;
    }

    public String toString() {
        return lMd();
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        Object zp = this.zp.zp(map);
        if (zp == null) {
            return null;
        }
        if (((Boolean) zp).booleanValue()) {
            return this.lMd.zp(map);
        }
        return this.KS.zp(map);
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        return this.zp.lMd() + "?" + this.lMd.lMd() + ":" + this.KS.lMd();
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public com.bytedance.adsdk.zp.lMd.jU.COT zp() {
        return com.bytedance.adsdk.zp.lMd.jU.HWF.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.lMd
    public void zp(com.bytedance.adsdk.zp.lMd.lMd.zp zpVar) {
        this.zp = zpVar;
    }
}
