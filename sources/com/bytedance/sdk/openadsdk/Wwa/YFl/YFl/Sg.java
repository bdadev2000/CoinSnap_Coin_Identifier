package com.bytedance.sdk.openadsdk.Wwa.YFl.YFl;

import a4.j;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    public static boolean YFl(Context context, String str, Wwa wwa) {
        String YFl = Sco.YFl(wwa);
        int i10 = 1;
        com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, YFl, 1, null);
        Intent YFl2 = YFl(context, str);
        if (!TextUtils.isEmpty(str) && YFl2 != null) {
            boolean qsH = Sco.qsH(context);
            HashMap q10 = j.q("url", str);
            if (qsH) {
                Sco.Sg Sg = Sco.Sg(context, YFl2);
                if (Sg.Sg > 0) {
                    try {
                        YFl(context, wwa, q10);
                        q10.put("matched_count", Integer.valueOf(Sg.Sg));
                        ComponentName componentName = Sg.YFl;
                        if (componentName != null) {
                            YFl2.setComponent(componentName);
                        }
                    } catch (Throwable th2) {
                        YoT.YFl("DeepLinkUtils", th2.getMessage());
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("intent", YFl2.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, YFl, -3, jSONObject);
                    return false;
                }
            }
            try {
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, YFl, "open_url_app", q10);
                context.startActivity(YFl2);
                com.bytedance.sdk.openadsdk.AlY.YoT.YFl().YFl(q10).YFl(wwa, YFl);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl("dp_start_act_success", wwa, YFl, q10);
                return true;
            } catch (Throwable th3) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("exception", th3.getMessage());
                    jSONObject2.put("intent", YFl2.toString());
                    if (!qsH) {
                        i10 = 0;
                    }
                    jSONObject2.put("can_query_install", i10);
                } catch (Exception unused2) {
                }
                com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, YFl, -4, jSONObject2);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, YFl, -2, wwa.Bn().AlY());
        return false;
    }

    private static Intent YFl(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th2) {
            YoT.YFl("DeepLinkUtils", th2.getMessage());
            return null;
        }
    }

    private static void YFl(Context context, Wwa wwa, Map<String, Object> map) {
        if (wwa != null && wwa.Ja() == 0) {
            map.put("auto_click", Boolean.valueOf(!wwa.AlY()));
        }
        map.put("can_query_install", Integer.valueOf(Sco.qsH(context) ? 1 : 0));
    }
}
