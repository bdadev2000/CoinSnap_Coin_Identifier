package com.bytedance.sdk.openadsdk.Wwa.YFl.YFl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.mn;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    public static boolean YFl() {
        return com.bytedance.sdk.openadsdk.aIu.YFl.YFl("deeplink_utils_new", 0) == 1;
    }

    public static boolean YFl(Context context, String str, Wwa wwa, int i10, Map<String, Object> map, boolean z10) {
        String YFl = Sco.YFl(wwa);
        int i11 = 1;
        com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, YFl, 1, null);
        Intent YFl2 = YFl(context, str);
        if (!TextUtils.isEmpty(str) && YFl2 != null) {
            boolean qsH = Sco.qsH(context);
            if (map == null) {
                map = new HashMap<>();
            }
            if (wwa != null && wwa.Ja() == 0) {
                map.put("auto_click", Boolean.valueOf(!wwa.AlY()));
            }
            map.put("can_query_install", Integer.valueOf(qsH ? 1 : 0));
            map.put("url", str);
            if (qsH) {
                Sco.Sg Sg = Sco.Sg(context, YFl2);
                if (Sg.Sg > 0) {
                    try {
                        YFl(context, wwa, map);
                        map.put("matched_count", Integer.valueOf(Sg.Sg));
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
            if (lG.AlY().qsH()) {
                Sco.YFl(wwa, YFl);
            }
            try {
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, YFl, "open_url_app", map);
                context.startActivity(YFl2);
                com.bytedance.sdk.openadsdk.AlY.YoT.YFl().YFl(map).YFl(wwa, YFl);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl("dp_start_act_success", wwa, YFl, map);
                return true;
            } catch (Throwable th3) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("exception", th3.getMessage());
                    jSONObject2.put("intent", YFl2.toString());
                    if (!qsH) {
                        i11 = 0;
                    }
                    jSONObject2.put("can_query_install", i11);
                } catch (Exception unused2) {
                }
                com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, YFl, -4, jSONObject2);
                if (qsH && !lG.AlY().qsH()) {
                    mn.YFl(context, wwa.Cqy(), wwa, i10, YFl, z10);
                }
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
