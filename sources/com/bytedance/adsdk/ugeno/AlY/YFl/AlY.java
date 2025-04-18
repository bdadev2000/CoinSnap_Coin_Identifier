package com.bytedance.adsdk.ugeno.AlY.YFl;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import java.util.Map;

/* loaded from: classes.dex */
public class AlY extends YFl {
    public AlY(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, Sg.YFl yFl) {
        super(sg2, str, yFl);
    }

    @Override // com.bytedance.adsdk.ugeno.AlY.YFl.YFl
    public void YFl() {
        Map<String, String> map = this.f10234vc;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f10234vc.get("id");
        if (TextUtils.isEmpty(str)) {
            YFl(this.tN);
            return;
        }
        com.bytedance.adsdk.ugeno.Sg.Sg sg2 = this.tN;
        com.bytedance.adsdk.ugeno.Sg.Sg Sg = sg2.Sg(sg2);
        if (Sg == null) {
            return;
        }
        YFl(Sg.Sg(str));
    }

    private void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        if (sg2 == null) {
            return;
        }
        for (String str : this.f10234vc.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                sg2.YFl(str, this.f10234vc.get(str));
            }
        }
        sg2.Sg();
    }
}
