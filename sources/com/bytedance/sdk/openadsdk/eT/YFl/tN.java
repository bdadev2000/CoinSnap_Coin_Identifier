package com.bytedance.sdk.openadsdk.eT.YFl;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.YFl.AlY;
import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.openadsdk.core.hQ;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN extends com.bytedance.sdk.component.YFl.AlY<JSONObject, JSONObject> {
    private final WeakReference<hQ> YFl;

    public tN(hQ hQVar) {
        this.YFl = new WeakReference<>(hQVar);
    }

    public static void YFl(lG lGVar, final hQ hQVar) {
        lGVar.YFl("newClickEvent", new AlY.Sg() { // from class: com.bytedance.sdk.openadsdk.eT.YFl.tN.1
            @Override // com.bytedance.sdk.component.YFl.AlY.Sg
            public com.bytedance.sdk.component.YFl.AlY YFl() {
                return new tN(hQ.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.YFl.AlY
    public void YFl(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        hQ hQVar = this.YFl.get();
        if (hQVar == null) {
            tN();
        } else {
            hQVar.AlY(jSONObject);
        }
    }
}
