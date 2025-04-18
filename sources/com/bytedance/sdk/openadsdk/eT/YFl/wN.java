package com.bytedance.sdk.openadsdk.eT.YFl;

import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN extends com.bytedance.sdk.component.YFl.wN<JSONObject, JSONObject> {
    private final WeakReference<hQ> YFl;

    public wN(hQ hQVar) {
        this.YFl = new WeakReference<>(hQVar);
    }

    public static void YFl(lG lGVar, hQ hQVar) {
        lGVar.YFl("interactiveFinish", new wN(hQVar));
    }

    @Override // com.bytedance.sdk.component.YFl.wN
    public JSONObject YFl(JSONObject jSONObject, com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<hQ> weakReference = this.YFl;
        if (weakReference != null && weakReference.get() != null) {
            hQ hQVar = this.YFl.get();
            Wwa tN = hQVar.tN();
            try {
                boolean z10 = true;
                int i10 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z10 = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int pm = tN != null ? tN.pm() : 0;
                if (optInt >= 0 && pm >= 0) {
                    optInt = Math.min(optInt, pm);
                } else if (optInt < 0) {
                    optInt = pm >= 0 ? pm : 0;
                }
                if (z10) {
                    hQVar.tN(optInt);
                } else {
                    i10 = -1;
                }
                jSONObject2.put("code", i10);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e2) {
                YoT.YFl("InteractiveFinishMethod", e2.getMessage());
            }
        }
        return jSONObject2;
    }
}
