package com.bytedance.sdk.openadsdk.eT.YFl;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.YFl.AlY;
import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.component.YFl.AlY<JSONObject, JSONObject> {
    private final WeakReference<hQ> YFl;

    public YFl(hQ hQVar) {
        this.YFl = new WeakReference<>(hQVar);
    }

    public static void YFl(lG lGVar, final hQ hQVar) {
        lGVar.YFl("getNetworkData", new AlY.Sg() { // from class: com.bytedance.sdk.openadsdk.eT.YFl.YFl.1
            @Override // com.bytedance.sdk.component.YFl.AlY.Sg
            public com.bytedance.sdk.component.YFl.AlY YFl() {
                return new YFl(hQ.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.YFl.AlY
    public void YFl(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        hQ hQVar = this.YFl.get();
        if (hQVar == null) {
            tN();
        } else {
            hQVar.YFl(jSONObject, new com.bytedance.sdk.openadsdk.YoT.tN() { // from class: com.bytedance.sdk.openadsdk.eT.YFl.YFl.2
                @Override // com.bytedance.sdk.openadsdk.YoT.tN
                public void YFl(boolean z10, List<Wwa> list) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (z10) {
                            jSONObject2.put("creatives", hQ.Sg(list));
                            YFl.this.YFl((YFl) jSONObject2);
                        } else {
                            YFl.this.YFl((YFl) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
