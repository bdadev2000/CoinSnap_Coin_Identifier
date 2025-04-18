package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qO implements com.bytedance.adsdk.YFl.Sg.Sg.Sg {
    private com.bytedance.adsdk.YFl.Sg.Sg.YFl Sg;
    private com.bytedance.adsdk.YFl.Sg.Sg.YFl YFl;
    private com.bytedance.adsdk.YFl.Sg.Sg.YFl tN;

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.Sg
    public void Sg(com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl) {
        this.Sg = yFl;
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        Object YFl = this.YFl.YFl(map);
        if (YFl == null) {
            return null;
        }
        if (((Boolean) YFl).booleanValue()) {
            return this.Sg.YFl(map);
        }
        return this.tN.YFl(map);
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.Sg
    public void tN(com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl) {
        this.tN = yFl;
    }

    public String toString() {
        return Sg();
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public String Sg() {
        return this.YFl.Sg() + "?" + this.Sg.Sg() + ":" + this.tN.Sg();
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public com.bytedance.adsdk.YFl.Sg.AlY.wN YFl() {
        return com.bytedance.adsdk.YFl.Sg.AlY.vc.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.Sg
    public void YFl(com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl) {
        this.YFl = yFl;
    }
}
