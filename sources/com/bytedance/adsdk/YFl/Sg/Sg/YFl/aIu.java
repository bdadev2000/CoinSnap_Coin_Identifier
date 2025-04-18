package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public class aIu implements com.bytedance.adsdk.YFl.Sg.Sg.YFl {
    private final String YFl;

    public aIu(String str) {
        this.YFl = str;
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public String Sg() {
        return e.h(new StringBuilder("'"), this.YFl, "'");
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
        return com.bytedance.adsdk.YFl.Sg.AlY.vc.STRING;
    }
}
