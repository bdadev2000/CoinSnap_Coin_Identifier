package com.bytedance.sdk.component.COT.jU;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class HWF extends zp {
    private byte[] lMd(com.bytedance.sdk.component.COT.KS.KS ks, String str) {
        com.bytedance.sdk.component.COT.KS KS = ks.pvr().KS(ks.cz());
        if (KS == null) {
            return null;
        }
        return KS.zp((com.bytedance.sdk.component.COT.KS) str);
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        byte[] zp;
        String dT = ks.dT();
        if (!ks.FP() && !ks.cz().HWF()) {
            zp = lMd(ks, dT);
        } else {
            zp = zp(ks, dT);
        }
        if (zp == null) {
            ks.zp(new Bj());
        } else {
            ks.zp(new lMd(zp, null));
            ks.pvr().lMd(ks.cz()).zp(dT, zp);
        }
    }

    private byte[] zp(com.bytedance.sdk.component.COT.KS.KS ks, String str) {
        ks.pvr().KS(ks.cz());
        Collection<com.bytedance.sdk.component.COT.KS> KS = ks.pvr().KS();
        if (KS == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.COT.KS> it = KS.iterator();
        while (it.hasNext()) {
            byte[] zp = it.next().zp((com.bytedance.sdk.component.COT.KS) str);
            if (zp != null) {
                return zp;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "disk_cache";
    }
}
