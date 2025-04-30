package com.bytedance.sdk.component.COT.jU;

/* loaded from: classes.dex */
public class jU extends zp {
    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        com.bytedance.sdk.component.COT.lMd cz = ks.cz();
        if (cz != null) {
            if (cz.KS()) {
                ks.zp(new dT());
                return;
            } else if (cz.jU()) {
                ks.zp(new HWF());
                return;
            }
        }
        ks.zp(new Bj());
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "cache_policy";
    }
}
