package com.bytedance.sdk.component.lMd.zp.zp.zp;

import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.tG;

/* loaded from: classes.dex */
public class jU extends Bj {
    public zp YW;
    public COT ku;

    public jU(Bj.zp zpVar) {
        super(zpVar);
        COT cot = new COT();
        this.ku = cot;
        this.YW = new zp(cot.lMd());
    }

    @Override // com.bytedance.sdk.component.lMd.zp.Bj
    public com.bytedance.sdk.component.lMd.zp.jU zp() {
        return this.ku;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.Bj
    public com.bytedance.sdk.component.lMd.zp.lMd zp(tG tGVar) {
        tGVar.zp(this);
        if (tGVar.lMd() == null || tGVar.lMd().zp() == null || TextUtils.isEmpty(tGVar.lMd().zp().toString())) {
            return null;
        }
        if (zp.zp != null && zp.zp.lMd() && this.YW.COT() && !"setting".equals(tGVar.HWF())) {
            lMd lmd = new lMd(tGVar, this.YW);
            this.YW.KS().add(lmd);
            return lmd;
        }
        lMd lmd2 = new lMd(tGVar, this.ku);
        this.ku.KS().add(lmd2);
        return lmd2;
    }
}
