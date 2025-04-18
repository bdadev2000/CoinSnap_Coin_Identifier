package com.bytedance.adsdk.YFl;

import com.bytedance.adsdk.ugeno.tN.YFl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.adsdk.ugeno.tN.YFl {

    /* renamed from: com.bytedance.adsdk.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0056YFl implements YFl.InterfaceC0070YFl {
        private String Sg;
        private com.bytedance.adsdk.YFl.Sg.YFl YFl;

        private C0056YFl(String str) {
            this.Sg = str;
            this.YFl = com.bytedance.adsdk.YFl.Sg.YFl.YFl(str);
        }

        public static C0056YFl YFl(String str) {
            return new C0056YFl(str);
        }

        @Override // com.bytedance.adsdk.ugeno.tN.YFl.InterfaceC0070YFl
        public Object YFl(JSONObject jSONObject) {
            com.bytedance.adsdk.YFl.Sg.YFl yFl = this.YFl;
            if (yFl == null) {
                return this.Sg;
            }
            Object YFl = yFl.YFl(jSONObject);
            if (YFl instanceof String) {
                return YFl;
            }
            if (YFl instanceof com.bytedance.adsdk.YFl.Sg.YFl.YFl) {
                return String.valueOf(DSW.YFl((com.bytedance.adsdk.YFl.Sg.YFl.YFl) YFl));
            }
            return String.valueOf(YFl);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.tN.YFl
    public YFl.InterfaceC0070YFl YFl(String str) {
        return C0056YFl.YFl(str);
    }
}
