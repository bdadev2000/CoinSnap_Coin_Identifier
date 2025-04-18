package com.bytedance.sdk.component.wN.AlY;

import com.bytedance.sdk.component.wN.rkt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class qsH extends YFl {
    private int Sg;
    private Throwable YFl;
    private String tN;

    public qsH(int i10, String str, Throwable th2) {
        this.Sg = i10;
        this.tN = str;
        this.YFl = th2;
    }

    private void Sg(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        rkt NjR = tNVar.NjR();
        if (NjR != null) {
            NjR.YFl(this.Sg, this.tN, this.YFl);
        }
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "failed";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        tNVar.YFl(new com.bytedance.sdk.component.wN.tN.YFl(this.Sg, this.tN, this.YFl));
        String VOe = tNVar.VOe();
        Map<String, List<com.bytedance.sdk.component.wN.tN.tN>> DSW = tNVar.qO().DSW();
        List<com.bytedance.sdk.component.wN.tN.tN> list = DSW.get(VOe);
        if (list == null) {
            Sg(tNVar);
            return;
        }
        synchronized (list) {
            Iterator<com.bytedance.sdk.component.wN.tN.tN> it = list.iterator();
            while (it.hasNext()) {
                Sg(it.next());
            }
            list.clear();
            DSW.remove(VOe);
        }
    }
}
