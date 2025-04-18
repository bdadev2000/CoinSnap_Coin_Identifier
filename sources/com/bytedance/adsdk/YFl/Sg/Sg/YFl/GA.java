package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GA extends lG {
    public GA() {
        super(com.bytedance.adsdk.YFl.Sg.AlY.tN.MULTI);
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl;
        Object YFl2 = this.YFl.YFl(map);
        if (YFl2 == null || (YFl = this.Sg.YFl(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.YFl.Sg.wN.YFl.DSW.YFl((Number) YFl2, (Number) YFl);
    }
}
