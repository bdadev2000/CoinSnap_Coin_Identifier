package com.bytedance.sdk.openadsdk.eT.YFl;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.YFl.AlY;
import com.bytedance.sdk.component.YFl.lG;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.hQ;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.sdk.component.YFl.AlY<JSONObject, JSONObject> {
    private final WeakReference<hQ> YFl;

    public Sg(hQ hQVar) {
        this.YFl = new WeakReference<>(hQVar);
    }

    public static void YFl(lG lGVar, final hQ hQVar) {
        lGVar.YFl("interstitial_webview_close", new AlY.Sg() { // from class: com.bytedance.sdk.openadsdk.eT.YFl.Sg.1
            @Override // com.bytedance.sdk.component.YFl.AlY.Sg
            public com.bytedance.sdk.component.YFl.AlY YFl() {
                return new Sg(hQ.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.YFl.AlY
    public void YFl(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.YFl.vc vcVar) throws Exception {
        com.bytedance.sdk.openadsdk.core.NjR.Sg().lG();
        hQ hQVar = this.YFl.get();
        if (hQVar == null) {
            YoT.YFl("DoInterstitialWebViewCloseMethod", "invoke error");
            tN();
        } else {
            hQVar.DSW();
        }
    }
}
