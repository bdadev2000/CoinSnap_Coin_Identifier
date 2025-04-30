package com.bytedance.sdk.component.COT.jU;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class QR extends zp {
    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        List<com.bytedance.sdk.component.COT.KS.KS> list;
        String yRU = ks.yRU();
        Map<String, List<com.bytedance.sdk.component.COT.KS.KS>> QR = ks.pvr().QR();
        synchronized (QR) {
            try {
                list = QR.get(yRU);
                if (list == null) {
                    list = new LinkedList<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (list) {
            try {
                list.add(ks);
                QR.put(yRU, list);
                if (list.size() <= 1) {
                    ks.zp(new jU());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "check_duplicate";
    }
}
