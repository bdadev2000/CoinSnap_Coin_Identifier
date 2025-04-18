package com.bytedance.adsdk.ugeno.AlY.YFl;

import com.bytedance.adsdk.ugeno.AlY.Sg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class Sg extends YFl {
    private List<Object> qsH;

    public Sg(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Sg.YFl yFl) {
        super(sg2, str, yFl);
        this.qsH = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.AlY.YFl.YFl
    public void YFl() {
        Map<String, String> map = this.f10234vc;
        if (map == null || map.size() <= 0) {
            return;
        }
        YFl(this.f10234vc.get("name"));
    }

    public void YFl(String str) {
        Iterator<Object> it = this.qsH.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
