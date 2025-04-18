package com.bytedance.sdk.component.wN.AlY;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DSW extends YFl {
    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        List<com.bytedance.sdk.component.wN.tN.tN> list;
        String VOe = tNVar.VOe();
        Map<String, List<com.bytedance.sdk.component.wN.tN.tN>> DSW = tNVar.qO().DSW();
        synchronized (DSW) {
            list = DSW.get(VOe);
            if (list == null) {
                list = new LinkedList<>();
            }
        }
        synchronized (list) {
            list.add(tNVar);
            DSW.put(VOe, list);
            if (list.size() <= 1) {
                tNVar.YFl(new AlY());
            }
        }
    }
}
