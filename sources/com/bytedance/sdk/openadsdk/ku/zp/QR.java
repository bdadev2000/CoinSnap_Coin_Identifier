package com.bytedance.sdk.openadsdk.ku.zp;

import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.component.zp.woN;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QR extends com.bytedance.sdk.component.zp.COT<JSONObject, JSONObject> {
    private WeakReference<SSWebView> zp;

    public QR(SSWebView sSWebView) {
        this.zp = new WeakReference<>(sSWebView);
    }

    public static void zp(woN won, SSWebView sSWebView) {
        won.zp("preventTouchEvent", new QR(sSWebView));
    }

    @Override // com.bytedance.sdk.component.zp.COT
    public JSONObject zp(JSONObject jSONObject, com.bytedance.sdk.component.zp.HWF hwf) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            SSWebView sSWebView = this.zp.get();
            if (sSWebView != null) {
                sSWebView.setIsPreventTouchEvent(optBoolean);
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
