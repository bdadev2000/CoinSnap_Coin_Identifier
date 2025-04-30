package com.bytedance.sdk.component.COT.jU;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class COT extends zp {
    private com.bytedance.sdk.component.COT.HWF lMd;
    private byte[] zp;

    public COT(byte[] bArr, com.bytedance.sdk.component.COT.HWF hwf) {
        this.zp = bArr;
        this.lMd = hwf;
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        com.bytedance.sdk.component.COT.KS.HWF pvr = ks.pvr();
        com.bytedance.sdk.component.COT.KS.lMd.zp zp = pvr.zp(ks);
        try {
            ks.ot();
            Bitmap zp2 = zp.zp(this.zp);
            if (zp2 != null) {
                ks.zp(new tG(zp2, this.lMd, false));
                pvr.zp(ks.cz()).zp(ks.COT(), zp2);
                return;
            }
            zp(1002, "decode failed bitmap null", null, ks);
        } catch (Throwable th) {
            zp(1002, "decode failed:" + th.getMessage(), th, ks);
        }
    }

    private void zp(int i9, String str, Throwable th, com.bytedance.sdk.component.COT.KS.KS ks) {
        if (this.lMd == null) {
            ks.zp(new Bj());
        } else {
            ks.zp(new ku(i9, str, th));
        }
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "decode";
    }
}
