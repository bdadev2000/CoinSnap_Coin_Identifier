package com.bytedance.sdk.openadsdk.ku.zp;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.zp.jU;
import com.bytedance.sdk.component.zp.woN;
import com.bytedance.sdk.openadsdk.core.RCv;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp extends com.bytedance.sdk.component.zp.jU<JSONObject, JSONObject> {
    private final WeakReference<RCv> zp;

    public zp(RCv rCv) {
        this.zp = new WeakReference<>(rCv);
    }

    public static void zp(woN won, final RCv rCv) {
        won.zp("getNetworkData", new jU.lMd() { // from class: com.bytedance.sdk.openadsdk.ku.zp.zp.1
            @Override // com.bytedance.sdk.component.zp.jU.lMd
            public com.bytedance.sdk.component.zp.jU zp() {
                return new zp(RCv.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.zp.jU
    public void zp(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zp.HWF hwf) throws Exception {
        RCv rCv = this.zp.get();
        if (rCv == null) {
            KS();
        } else {
            rCv.zp(jSONObject, new com.bytedance.sdk.openadsdk.YW.KS() { // from class: com.bytedance.sdk.openadsdk.ku.zp.zp.2
                @Override // com.bytedance.sdk.openadsdk.YW.KS
                public void zp(boolean z8, List<com.bytedance.sdk.openadsdk.core.model.woN> list) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z8) {
                            zp.this.zp((zp) jSONObject2);
                        } else {
                            jSONObject2.put("creatives", RCv.lMd(list));
                            zp.this.zp((zp) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
