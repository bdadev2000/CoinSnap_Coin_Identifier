package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc extends lG {
    public vc() {
        super(com.bytedance.adsdk.YFl.Sg.AlY.tN.GT);
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl;
        Object YFl2 = this.YFl.YFl(map);
        if (YFl2 == null || (YFl = this.Sg.YFl(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.YFl.Sg.wN.YFl.tN.YFl(YFl2, (Number) YFl);
    }
}
