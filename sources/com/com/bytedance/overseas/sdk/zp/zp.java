package com.com.bytedance.overseas.sdk.zp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.Bj;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp extends lMd {
    public zp(Context context, woN won, String str) {
        super(context, won, str);
    }

    @Override // com.com.bytedance.overseas.sdk.zp.lMd
    public boolean lMd() {
        boolean z8;
        com.bytedance.sdk.openadsdk.core.jU.zp(this.lMd, this.KS, 1, null);
        if (this.lMd.fs() != null) {
            HashMap hashMap = new HashMap();
            woN won = this.lMd;
            if (won != null && won.que() == 0) {
                if (this.QR >= 11) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                hashMap.put("dpl_probability_jump", Boolean.valueOf(z8));
            }
            if (zp(this.lMd.fs().zp(), KS(), this.KS, this.lMd, hashMap)) {
                return true;
            }
            if (!this.jU || this.HWF.get()) {
                this.jU = true;
                zp(this.lMd, hashMap);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(this.lMd, this.KS, "open_fallback_url", hashMap);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.jU.zp(this.lMd, this.KS, -1, null);
        }
        return false;
    }

    @Override // com.com.bytedance.overseas.sdk.zp.lMd, com.com.bytedance.overseas.sdk.zp.KS
    public boolean zp() {
        HashMap hashMap;
        if (this.zp == null) {
            return false;
        }
        woN won = this.lMd;
        if (won == null || won.que() != 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("dpl_probability_jump", Boolean.valueOf(this.QR >= 11));
        }
        return zp(this.lMd, this.zp.KS(), KS(), this.KS, hashMap);
    }

    public static boolean zp(woN won, String str, Context context, String str2, Map<String, Object> map) {
        Intent zp;
        if (won != null && won.Rea() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (zp = YhE.zp(context, str)) == null) {
                return false;
            }
            zp.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                zp.addFlags(268435456);
            }
            context.startActivity(zp);
            if (map == null) {
                map = new HashMap<>();
            }
            zp(won, map);
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void zp(woN won, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (won != null && won.que() == 0) {
            map.put("auto_click", Boolean.valueOf(!won.KS()));
        }
        map.put("can_query_install", 0);
    }

    public static boolean zp(String str, Context context, String str2, woN won, Map<String, Object> map) {
        Intent intent = null;
        try {
        } catch (Throwable th) {
            th = th;
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
                zp(won, map);
                map.put("url", str);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str2, "open_url_app", map);
                context.startActivity(intent2);
                Bj.zp().zp(map).zp(won, str2);
                com.bytedance.sdk.openadsdk.lMd.KS.zp("dp_start_act_success", won, str2, map);
                return true;
            } catch (Throwable th2) {
                th = th2;
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
                com.bytedance.sdk.openadsdk.core.jU.zp(won, str2, -4, jSONObject);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.jU.zp(won, str2, -2, null);
        return false;
    }
}
