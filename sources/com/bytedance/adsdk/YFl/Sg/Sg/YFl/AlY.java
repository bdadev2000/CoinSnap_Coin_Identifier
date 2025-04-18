package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY extends lG {
    public AlY() {
        super(com.bytedance.adsdk.YFl.Sg.AlY.tN.EQ);
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl = this.YFl.YFl(map);
        Object YFl2 = this.Sg.YFl(map);
        if (YFl == null && YFl2 == null) {
            return Boolean.TRUE;
        }
        if (YFl == null && YFl2 != null) {
            return Boolean.FALSE;
        }
        if (YFl != null && YFl2 == null) {
            return Boolean.FALSE;
        }
        if ((YFl instanceof Number) && (YFl2 instanceof Number)) {
            return Boolean.valueOf(com.bytedance.adsdk.YFl.Sg.wN.YFl.Sg.YFl((Number) YFl, (Number) YFl2));
        }
        return Boolean.valueOf(YFl.equals(YFl2));
    }
}
