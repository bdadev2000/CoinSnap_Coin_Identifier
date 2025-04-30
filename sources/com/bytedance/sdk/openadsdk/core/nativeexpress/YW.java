package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.woN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YW {
    public static void zp(String str, int i9, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.QR.zp(i9);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            woN.zp fRl = won.fRl();
            if (fRl != null) {
                jSONObject.put("tpl_id", fRl.COT());
                if ("Web".equals(str)) {
                    if (fRl.tG()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.dT.KS.zp().zp(com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(zp(str3)).KS(str4).COT(won != null ? won.Gor() : "").lMd(i9).lMd(jSONObject.toString()).HWF(str2));
    }

    private static int zp(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c9 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
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
