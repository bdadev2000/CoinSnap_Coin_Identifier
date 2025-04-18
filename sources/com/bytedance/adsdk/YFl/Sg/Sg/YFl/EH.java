package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EH implements com.bytedance.adsdk.YFl.Sg.Sg.YFl {
    private Number YFl;

    public EH(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.YFl = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.YFl = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.YFl = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.YFl = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public String Sg() {
        return this.YFl.toString();
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        return this.YFl;
    }

    public String toString() {
        return Sg();
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public com.bytedance.adsdk.YFl.Sg.AlY.wN YFl() {
        return com.bytedance.adsdk.YFl.Sg.AlY.vc.NUMBER;
    }
}
