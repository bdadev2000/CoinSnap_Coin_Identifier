package com.bytedance.sdk.openadsdk.Wwa.YFl.YFl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AlY.YoT;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl extends AlY {
    public YFl(Context context, Wwa wwa, String str) {
        super(context, wwa, str);
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY
    public boolean Sg() {
        boolean z10;
        com.bytedance.sdk.openadsdk.core.AlY.YFl(this.Sg, this.tN, 1, null);
        if (this.Sg.Bn() != null) {
            HashMap hashMap = new HashMap();
            Wwa wwa = this.Sg;
            if (wwa != null && wwa.Ja() == 0) {
                if (this.f10520vc >= 11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hashMap.put("dpl_probability_jump", Boolean.valueOf(z10));
            }
            if (YFl(this.Sg.Bn().YFl(), tN(), this.tN, this.Sg, hashMap)) {
                return true;
            }
            if (!this.AlY || this.wN.get()) {
                this.AlY = true;
                YFl(this.Sg, hashMap);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.Sg, this.tN, "open_fallback_url", hashMap);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.AlY.YFl(this.Sg, this.tN, -1, null);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY, com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public boolean YFl() {
        HashMap hashMap;
        if (this.YFl == null) {
            return false;
        }
        Wwa wwa = this.Sg;
        if (wwa == null || wwa.Ja() != 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("dpl_probability_jump", Boolean.valueOf(this.f10520vc >= 11));
        }
        return YFl(this.Sg, this.YFl.tN(), tN(), this.tN, hashMap);
    }

    public static boolean YFl(Wwa wwa, String str, Context context, String str2, Map<String, Object> map) {
        Intent YFl;
        if (wwa != null && wwa.dU() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (YFl = Sco.YFl(context, str)) == null) {
                return false;
            }
            YFl.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                YFl.addFlags(268435456);
            }
            context.startActivity(YFl);
            if (map == null) {
                map = new HashMap<>();
            }
            YFl(wwa, map);
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void YFl(Wwa wwa, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (wwa != null && wwa.Ja() == 0) {
            map.put("auto_click", Boolean.valueOf(!wwa.AlY()));
        }
        map.put("can_query_install", 0);
    }

    public static boolean YFl(String str, Context context, String str2, Wwa wwa, Map<String, Object> map) {
        Intent intent = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            try {
                intent2.setData(parse);
                if (!(context instanceof Activity)) {
                    intent2.addFlags(268435456);
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                YFl(wwa, map);
                map.put("url", str);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str2, "open_url_app", map);
                context.startActivity(intent2);
                YoT.YFl().YFl(map).YFl(wwa, str2);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl("dp_start_act_success", wwa, str2, map);
                return true;
            } catch (Throwable th3) {
                th = th3;
                intent = intent2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("exception", th.getMessage());
                    if (intent != null) {
                        jSONObject.put("intent", intent.toString());
                    }
                    jSONObject.put("can_query_install", 0);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, str2, -4, jSONObject);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, str2, -2, null);
        return false;
    }
}
