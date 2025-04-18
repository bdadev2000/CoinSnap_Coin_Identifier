package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Wwa extends lG {
    private static final ThreadLocal<StringBuilder> AlY = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.YFl.Sg.Sg.YFl.Wwa.1
        @Override // java.lang.ThreadLocal
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public Wwa() {
        super(com.bytedance.adsdk.YFl.Sg.AlY.tN.PLUS);
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl;
        Object YFl2 = this.YFl.YFl(map);
        if (YFl2 == null || (YFl = this.Sg.YFl(map)) == null) {
            return null;
        }
        if (!(YFl2 instanceof String) && !(YFl instanceof String)) {
            return com.bytedance.adsdk.YFl.Sg.wN.YFl.qsH.YFl((Number) YFl2, (Number) YFl);
        }
        StringBuilder sb2 = AlY.get();
        sb2.append(YFl2);
        sb2.append(YFl);
        String sb3 = sb2.toString();
        sb2.setLength(0);
        return sb3;
    }
}
