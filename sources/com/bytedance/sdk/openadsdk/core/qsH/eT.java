package com.bytedance.sdk.openadsdk.core.qsH;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT {
    public static void YFl(String str, int i10, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.qsH.YFl(i10);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            Wwa.YFl lu = wwa.lu();
            if (lu != null) {
                jSONObject.put("tpl_id", lu.vc());
                if ("Web".equals(str)) {
                    if (lu.pDU()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (wwa.UI() != null) {
                jSONObject.put("tpl_id", wwa.UI().YFl());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl(YFl(str3)).tN(str4).wN(wwa != null ? wwa.ivp() : "").Sg(i10).Sg(jSONObject.toString()).vc(str2));
    }

    private static int YFl(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 8;
            case 4:
                return 2;
            default:
                return 5;
        }
    }
}
