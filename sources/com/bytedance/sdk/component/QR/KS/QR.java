package com.bytedance.sdk.component.QR.KS;

import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.ku;
import com.bytedance.sdk.component.lMd.zp.tG;
import java.io.IOException;

/* loaded from: classes.dex */
public class QR implements com.bytedance.sdk.component.lMd.zp.ku {
    private int zp;

    public void zp(int i9) {
        this.zp = i9;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.ku
    public dQp zp(ku.zp zpVar) throws IOException {
        IOException iOException;
        tG zp = zpVar.zp();
        if (ku.zp().zp(this.zp).lMd() != null) {
            ku.zp().zp(this.zp).lMd().COT();
        }
        String qr = zp.lMd().toString();
        String zp2 = ku.zp().zp(this.zp).zp(qr);
        if (!qr.equals(zp2)) {
            zp = zp.YW().lMd(zp2).lMd();
        }
        dQp dqp = null;
        try {
            iOException = null;
            dqp = zpVar.zp(zp);
        } catch (Exception e4) {
            iOException = new IOException(e4.getMessage());
            ku.zp().zp(this.zp).zp(zp, e4);
        }
        ku.zp().zp(this.zp).zp(zp, dqp);
        if (iOException == null) {
            return dqp == null ? zpVar.zp(zp) : dqp;
        }
        throw iOException;
    }
}
