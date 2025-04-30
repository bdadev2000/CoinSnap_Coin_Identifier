package com.bytedance.adsdk.zp.lMd.lMd.zp;

/* loaded from: classes.dex */
public abstract class woN implements com.bytedance.adsdk.zp.lMd.lMd.zp {
    protected com.bytedance.adsdk.zp.lMd.jU.KS KS;
    protected com.bytedance.adsdk.zp.lMd.lMd.zp lMd;
    protected com.bytedance.adsdk.zp.lMd.lMd.zp zp;

    public woN(com.bytedance.adsdk.zp.lMd.jU.KS ks) {
        this.KS = ks;
    }

    public void lMd(com.bytedance.adsdk.zp.lMd.lMd.zp zpVar) {
        this.lMd = zpVar;
    }

    public String toString() {
        return lMd();
    }

    public void zp(com.bytedance.adsdk.zp.lMd.lMd.zp zpVar) {
        this.zp = zpVar;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        return this.zp.lMd() + this.KS.zp() + this.lMd.lMd();
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public com.bytedance.adsdk.zp.lMd.jU.COT zp() {
        return com.bytedance.adsdk.zp.lMd.jU.HWF.OPERATOR_RESULT;
    }
}
