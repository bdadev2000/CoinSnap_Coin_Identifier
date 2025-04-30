package com.bytedance.sdk.component.COT.jU;

import com.bytedance.sdk.component.COT.KVG;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class tG<T> extends zp {
    private boolean KS;
    private com.bytedance.sdk.component.COT.HWF lMd;
    private T zp;

    public tG(T t9, com.bytedance.sdk.component.COT.HWF hwf, boolean z8) {
        this.zp = t9;
        this.lMd = hwf;
        this.KS = z8;
    }

    private Map<String, String> lMd() {
        com.bytedance.sdk.component.COT.HWF hwf = this.lMd;
        if (hwf != null) {
            return hwf.COT();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        String yRU = ks.yRU();
        Map<String, List<com.bytedance.sdk.component.COT.KS.KS>> QR = ks.pvr().QR();
        List<com.bytedance.sdk.component.COT.KS.KS> list = QR.get(yRU);
        if (list == null) {
            lMd(ks);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.COT.KS.KS> it = list.iterator();
                while (it.hasNext()) {
                    lMd(it.next());
                }
                list.clear();
                QR.remove(yRU);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void lMd(com.bytedance.sdk.component.COT.KS.KS ks) {
        KVG YW = ks.YW();
        if (YW != null) {
            YW.zp(new com.bytedance.sdk.component.COT.KS.jU().zp(ks, this.zp, lMd(), this.KS));
        }
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "success";
    }
}
