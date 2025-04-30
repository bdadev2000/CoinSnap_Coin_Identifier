package com.bytedance.sdk.openadsdk.core.COT;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.COT;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private static boolean zp = false;

    public static int COT() {
        if (KVG.jU().Rh()) {
            return lMd.lMd().HWF();
        }
        return 6;
    }

    public static String HWF() {
        if (KVG.jU().Rh()) {
            return lMd.lMd().jU();
        }
        return null;
    }

    public static void KS() {
        if (KVG.jU().Rh()) {
            lMd.lMd().KS("AdShow");
        }
    }

    public static String jU() {
        if (KVG.jU().Rh()) {
            return lMd.lMd().COT();
        }
        return "";
    }

    public static void lMd(String str) {
        if (TextUtils.isEmpty(str) || !KVG.jU().Rh()) {
            return;
        }
        lMd.lMd().lMd(str);
    }

    public static void zp() {
        if (!zp && KVG.jU().Rh()) {
            lMd.lMd();
            zp = lMd.lMd().KS();
        }
    }

    public static void lMd() {
        if (KVG.jU().Rh()) {
            lMd.lMd().zp();
        }
    }

    public static void zp(String str) {
        if (TextUtils.isEmpty(str) && KVG.jU().Rh()) {
            lMd.lMd().zp(str);
        }
    }

    public static Map<String, String> zp(String str, String str2) {
        if (KVG.jU().Rh()) {
            return lMd.lMd().zp(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void zp(MotionEvent motionEvent) {
        if (KVG.jU().Rh()) {
            lMd.lMd().zp(motionEvent);
        }
    }

    public static void zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (KVG.jU().Rh()) {
                zp();
                if (COT() == 0) {
                    jSONObject.put("sec_did", lMd.lMd().jU());
                    String zp2 = COT.zp(jSONObject.toString());
                    Map<String, String> zp3 = lMd.lMd().zp("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", zp2 != null ? zp2.getBytes() : new byte[0]);
                    if (zp3 != null && zp3.size() > 0) {
                        for (String str : zp3.keySet()) {
                            jSONObject.put(str, zp3.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", zp2);
                        return;
                    }
                    jSONObject.put("pglx", "8");
                    return;
                }
                jSONObject.put("pglx", String.valueOf(COT()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            tG.zp("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
