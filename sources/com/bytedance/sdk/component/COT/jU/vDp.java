package com.bytedance.sdk.component.COT.jU;

/* loaded from: classes.dex */
public class vDp extends zp {
    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        byte[] zp = ks.pvr().lMd(ks.cz()).zp(ks.dT());
        if (zp == null) {
            ks.zp(new HWF());
        } else {
            ks.zp(new lMd(zp, null));
        }
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "raw_cache";
    }
}
