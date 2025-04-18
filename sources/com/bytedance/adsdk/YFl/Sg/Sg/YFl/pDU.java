package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pDU extends lG {
    public pDU() {
        super(com.bytedance.adsdk.YFl.Sg.AlY.tN.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl = this.YFl.YFl(map);
        Object YFl2 = this.Sg.YFl(map);
        if (YFl == null && YFl2 == null) {
            return Boolean.FALSE;
        }
        if (YFl == null && YFl2 != null) {
            return Boolean.TRUE;
        }
        if (YFl != null && YFl2 == null) {
            return Boolean.TRUE;
        }
        if ((YFl instanceof Number) && (YFl2 instanceof Number)) {
            return Boolean.valueOf(!com.bytedance.adsdk.YFl.Sg.wN.YFl.Sg.YFl((Number) YFl, (Number) YFl2));
        }
        return Boolean.valueOf(!YFl.equals(YFl2));
    }
}
