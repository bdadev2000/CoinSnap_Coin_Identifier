package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH extends lG {
    public qsH() {
        super(com.bytedance.adsdk.YFl.Sg.AlY.tN.LT_EQ);
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl;
        if (this.YFl.YFl(map) == null || (YFl = this.Sg.YFl(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.YFl.Sg.wN.YFl.tN.YFl(r0, (Number) YFl)).booleanValue());
    }
}
