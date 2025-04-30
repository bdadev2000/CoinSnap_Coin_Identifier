package com.bytedance.sdk.component.COT.jU;

import com.bytedance.sdk.component.COT.KVG;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ku extends zp {
    private String KS;
    private int lMd;
    private Throwable zp;

    public ku(int i9, String str, Throwable th) {
        this.lMd = i9;
        this.KS = str;
        this.zp = th;
    }

    private void lMd(com.bytedance.sdk.component.COT.KS.KS ks) {
        KVG YW = ks.YW();
        if (YW != null) {
            YW.zp(this.lMd, this.KS, this.zp);
        }
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        ks.zp(new com.bytedance.sdk.component.COT.KS.zp(this.lMd, this.KS, this.zp));
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

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "failed";
    }
}
