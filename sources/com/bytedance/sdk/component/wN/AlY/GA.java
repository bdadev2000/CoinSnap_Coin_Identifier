package com.bytedance.sdk.component.wN.AlY;

import com.bytedance.sdk.component.wN.rkt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class GA<T> extends YFl {
    private com.bytedance.sdk.component.wN.vc Sg;
    private T YFl;
    private boolean tN;

    public GA(T t5, com.bytedance.sdk.component.wN.vc vcVar, boolean z10) {
        this.YFl = t5;
        this.Sg = vcVar;
        this.tN = z10;
    }

    private Map<String, String> Sg() {
        com.bytedance.sdk.component.wN.vc vcVar = this.Sg;
        if (vcVar != null) {
            return vcVar.wN();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "success";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
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

    private void Sg(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        rkt NjR = tNVar.NjR();
        if (NjR != null) {
            NjR.YFl(new com.bytedance.sdk.component.wN.tN.AlY().YFl(tNVar, this.YFl, Sg(), this.tN));
        }
    }
}
