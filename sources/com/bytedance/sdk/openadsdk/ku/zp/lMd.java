package com.bytedance.sdk.openadsdk.ku.zp;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.component.zp.jU;
import com.bytedance.sdk.component.zp.woN;
import com.bytedance.sdk.openadsdk.core.RCv;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd extends com.bytedance.sdk.component.zp.jU<JSONObject, JSONObject> {
    private final WeakReference<RCv> zp;

    public lMd(RCv rCv) {
        this.zp = new WeakReference<>(rCv);
    }

    public static void zp(woN won, final RCv rCv) {
        won.zp("interstitial_webview_close", new jU.lMd() { // from class: com.bytedance.sdk.openadsdk.ku.zp.lMd.1
            @Override // com.bytedance.sdk.component.zp.jU.lMd
            public com.bytedance.sdk.component.zp.jU zp() {
                return new lMd(RCv.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.zp.jU
    public void zp(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zp.HWF hwf) throws Exception {
        com.bytedance.sdk.openadsdk.core.ku.lMd().woN();
        RCv rCv = this.zp.get();
        if (rCv == null) {
            tG.zp("DoInterstitialWebViewCloseMethod", "invoke error");
            KS();
        } else {
            rCv.QR();
        }
    }
}
