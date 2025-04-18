package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Wwa {
    public static void YFl(Context context, boolean z10, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str, int i10, WebView webView, com.bytedance.sdk.openadsdk.core.widget.vc vcVar) {
        int optInt = jSONObject.optInt("landingStyle");
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("fallback_url");
        try {
            jSONObject.put("is_activity", z10);
        } catch (JSONException unused) {
        }
        boolean z11 = true;
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, 1, jSONObject);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        if (optInt == 0) {
            if (webView != null) {
                webView.loadUrl(optString);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, -1, (JSONObject) null);
            }
        } else if (optInt != 1 && optInt != 8) {
            if (optInt == 2) {
                if (!com.bytedance.sdk.openadsdk.utils.qO.Sg(context, optString, wwa, str)) {
                    com.bytedance.sdk.openadsdk.pDU.YFl.Sg sg2 = new com.bytedance.sdk.openadsdk.pDU.YFl.Sg();
                    sg2.YFl(Sg.YFl.Sg);
                    sg2.YFl(wwa);
                    sg2.Sg(str);
                    sg2.YFl(-1);
                    sg2.YFl(false);
                    sg2.Sg(wwa.ko());
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(sg2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("deeplink_url", optString);
                    hashMap.put("fallback_url", optString2);
                    hashMap.put("jsb_deeplink", 1);
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, "open_fallback_url", hashMap);
                    com.bytedance.sdk.openadsdk.utils.qO.YFl(context, optString2, wwa, Sg.YFl.Sg);
                }
            } else if (optInt == 3) {
                if (mn.Sg(context, optString, wwa, i10, str, false)) {
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, 3, (JSONObject) null);
                } else {
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, -2, (JSONObject) null);
                }
            } else {
                z11 = false;
            }
        } else {
            com.bytedance.sdk.openadsdk.pDU.YFl.Sg sg3 = new com.bytedance.sdk.openadsdk.pDU.YFl.Sg();
            sg3.YFl(Sg.YFl.Sg);
            sg3.YFl(wwa);
            sg3.Sg(str);
            sg3.YFl(-1);
            sg3.YFl(false);
            sg3.Sg(wwa.ko());
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(sg3);
            com.bytedance.sdk.openadsdk.utils.qO.YFl(context, optString, wwa, Sg.YFl.Sg);
        }
        if (vcVar != null && z11) {
            vcVar.YFl();
        }
    }
}
