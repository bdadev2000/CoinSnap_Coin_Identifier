package com.bytedance.sdk.openadsdk.core.NjR;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.wN;
import com.bytedance.sdk.openadsdk.core.lG;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private static boolean YFl = false;

    public static String AlY() {
        if (lG.AlY().fIu()) {
            return Sg.Sg().wN();
        }
        return "";
    }

    public static String DSW() {
        if (lG.AlY().fIu()) {
            return Sg.Sg().AlY();
        }
        return null;
    }

    public static void Sg(String str) {
        if (TextUtils.isEmpty(str) || !lG.AlY().fIu()) {
            return;
        }
        Sg.Sg().Sg(str);
    }

    public static void YFl() {
        if (!YFl && lG.AlY().fIu()) {
            Sg.Sg();
            YFl = Sg.Sg().tN();
        }
    }

    public static void tN() {
        if (lG.AlY().fIu()) {
            Sg.Sg().tN("AdShow");
        }
    }

    public static int vc() {
        if (lG.AlY().fIu()) {
            return Sg.Sg().DSW();
        }
        return 6;
    }

    public static long wN() {
        if (lG.AlY().fIu()) {
            return Sg.Sg().vc();
        }
        return 0L;
    }

    public static void Sg() {
        if (lG.AlY().fIu()) {
            Sg.Sg().YFl();
        }
    }

    public static void YFl(String str) {
        if (TextUtils.isEmpty(str) && lG.AlY().fIu()) {
            Sg.Sg().YFl(str);
        }
    }

    public static Map<String, String> YFl(String str, String str2) {
        if (lG.AlY().fIu()) {
            return Sg.Sg().YFl(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void YFl(MotionEvent motionEvent) {
        if (lG.AlY().fIu()) {
            Sg.Sg().YFl(motionEvent);
        }
    }

    public static void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (lG.AlY().fIu()) {
                YFl();
                if (vc() == 0) {
                    jSONObject.put("sec_did", Sg.Sg().AlY());
                    String YFl2 = wN.YFl(jSONObject.toString());
                    Map<String, String> YFl3 = Sg.Sg().YFl("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", YFl2 != null ? YFl2.getBytes() : new byte[0]);
                    if (YFl3 != null && YFl3.size() > 0) {
                        for (String str : YFl3.keySet()) {
                            jSONObject.put(str, YFl3.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", YFl2);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", Sg.Sg().vc());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(vc()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th2) {
            YoT.YFl("SecSdkHelperUtil", th2.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
