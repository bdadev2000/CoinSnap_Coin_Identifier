package com.bytedance.sdk.component.COT.jU;

/* loaded from: classes.dex */
public class lMd implements YW {
    private com.bytedance.sdk.component.COT.HWF lMd;
    private byte[] zp;

    public lMd(byte[] bArr, com.bytedance.sdk.component.COT.HWF hwf) {
        this.zp = bArr;
        this.lMd = hwf;
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        YW kuVar;
        int vDp = ks.vDp();
        ks.zp(this.zp.length);
        if (vDp != 2) {
            if (vDp != 3) {
                boolean lMd = com.bytedance.sdk.component.COT.KS.KS.zp.lMd(this.zp);
                if (lMd) {
                    kuVar = new tG(this.zp, this.lMd, lMd);
                } else if (com.bytedance.sdk.component.COT.KS.KS.zp.zp(this.zp)) {
                    kuVar = new COT(this.zp, this.lMd);
                } else {
                    kuVar = new tG(this.zp, this.lMd, lMd);
                }
            } else {
                byte[] bArr = this.zp;
                kuVar = new tG(bArr, this.lMd, com.bytedance.sdk.component.COT.KS.KS.zp.lMd(bArr));
            }
        } else if (com.bytedance.sdk.component.COT.KS.KS.zp.zp(this.zp)) {
            kuVar = new COT(this.zp, this.lMd);
        } else if (this.lMd == null) {
            kuVar = new Bj();
        } else {
            kuVar = new ku(1001, "not image format", null);
        }
        ks.zp(kuVar);
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "image_type";
    }
}
