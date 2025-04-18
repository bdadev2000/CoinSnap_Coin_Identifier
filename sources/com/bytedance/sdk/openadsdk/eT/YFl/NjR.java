package com.bytedance.sdk.openadsdk.eT.YFl;

import com.bytedance.sdk.component.YFl.lG;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NjR extends com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.NjR.AlY> YFl;

    public NjR(com.bytedance.sdk.component.NjR.AlY alY) {
        this.YFl = new WeakReference<>(alY);
    }

    public static void YFl(lG lGVar, com.bytedance.sdk.component.NjR.AlY alY) {
        lGVar.YFl("preventTouchEvent", new NjR(alY));
    }

    @Override // com.bytedance.sdk.component.YFl.wN
    public JSONObject YFl(JSONObject jSONObject, com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.NjR.AlY alY = this.YFl.get();
            if (alY != null) {
                alY.setIsPreventTouchEvent(optBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
