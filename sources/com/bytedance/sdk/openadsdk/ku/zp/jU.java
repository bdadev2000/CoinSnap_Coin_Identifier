package com.bytedance.sdk.openadsdk.ku.zp;

import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.zp.woN;
import com.bytedance.sdk.openadsdk.core.RCv;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU extends com.bytedance.sdk.component.zp.COT<JSONObject, JSONObject> {
    private final WeakReference<RCv> zp;

    public jU(RCv rCv) {
        this.zp = new WeakReference<>(rCv);
    }

    public static void zp(woN won, RCv rCv) {
        won.zp("interactiveFinish", new jU(rCv));
    }

    @Override // com.bytedance.sdk.component.zp.COT
    public JSONObject zp(JSONObject jSONObject, com.bytedance.sdk.component.zp.HWF hwf) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<RCv> weakReference = this.zp;
        if (weakReference != null && weakReference.get() != null) {
            RCv rCv = this.zp.get();
            com.bytedance.sdk.openadsdk.core.model.woN KS = rCv.KS();
            try {
                boolean z8 = true;
                int i9 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z8 = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int PI = KS != null ? KS.PI() : 0;
                if (optInt >= 0 && PI >= 0) {
                    optInt = Math.min(optInt, PI);
                } else if (optInt < 0) {
                    optInt = PI >= 0 ? PI : 0;
                }
                if (z8) {
                    rCv.KS(optInt);
                } else {
                    i9 = -1;
                }
                jSONObject2.put("code", i9);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e4) {
                tG.zp("InteractiveFinishMethod", e4.getMessage());
            }
        }
        return jSONObject2;
    }
}
