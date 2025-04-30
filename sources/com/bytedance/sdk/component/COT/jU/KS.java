package com.bytedance.sdk.component.COT.jU;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class KS extends zp {
    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        if (TextUtils.isEmpty(ks.COT())) {
            com.bytedance.sdk.component.COT.vDp COT = ks.pvr().COT();
            ks.lMd(COT.zp(ks));
            ks.zp(COT.lMd(ks));
        }
        ks.zp(new QR());
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "generate_key";
    }
}
