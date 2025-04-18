package com.bytedance.sdk.component.wN.AlY;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class vc extends YFl {
    private byte[] Sg(com.bytedance.sdk.component.wN.tN.tN tNVar, String str) {
        com.bytedance.sdk.component.wN.tN tN = tNVar.qO().tN(tNVar.aIu());
        if (tN == null) {
            return null;
        }
        return tN.YFl((com.bytedance.sdk.component.wN.tN) str);
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        byte[] YFl;
        String nc2 = tNVar.nc();
        if (!tNVar.wXo() && !tNVar.aIu().vc()) {
            YFl = Sg(tNVar, nc2);
        } else {
            YFl = YFl(tNVar, nc2);
        }
        if (YFl == null) {
            tNVar.YFl(new eT());
        } else {
            tNVar.YFl(new Sg(YFl, null));
            tNVar.qO().Sg(tNVar.aIu()).YFl(nc2, YFl);
        }
    }

    private byte[] YFl(com.bytedance.sdk.component.wN.tN.tN tNVar, String str) {
        tNVar.qO().tN(tNVar.aIu());
        Collection<com.bytedance.sdk.component.wN.tN> tN = tNVar.qO().tN();
        if (tN == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.wN.tN> it = tN.iterator();
        while (it.hasNext()) {
            byte[] YFl = it.next().YFl((com.bytedance.sdk.component.wN.tN) str);
            if (YFl != null) {
                return YFl;
            }
        }
        return null;
    }
}
