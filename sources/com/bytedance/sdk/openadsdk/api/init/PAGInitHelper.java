package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings;
import com.bytedance.sdk.openadsdk.Bj.lMd;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.COT.KS;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.act.zp;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.multipro.jU.jU;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.Lij;
import com.bytedance.sdk.openadsdk.utils.WNy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    public static void initAnimationScale(Context context) {
        try {
            float f9 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f9;
            if (f9 <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    public static void initMemoryData() {
        KVG.jU();
        jU.zp("ttopenadsdk", "a", 0);
        jU.zp("sp_global_file", "a", 0);
        jU.zp("sp_global_privacy", "a", 0);
        jU.zp("sp_global_app_id", "a", 0);
        jU.zp("sp_global_icon_id", "a", 0);
        jU.zp(lMd.zp, "a", 0);
        jU.zp("tpl_fetch_model", "a", 0);
        jU.zp("tt_sp", "a", 0);
        jU.zp("tt_sdk_event_net_ad", "a", 0);
        jU.zp("tt_sdk_event_net_state", "a", 0);
        jU.zp("tt_sdk_event_net_trail", "a", 0);
        jU.zp("tt_sdk_event_db_ad", "a", 0);
        jU.zp("tt_sdk_event_db_state", "a", 0);
        jU.zp("tt_sdk_event_db_trail", "a", 0);
    }

    public static void maybeAsyncInitTask(final Context context) {
        zp.zp(context);
        Lij.zp();
        WNy.zp(context);
        zp(context);
        KVG.COT();
        String zp = Bj.zp(context);
        KS.lMd(zp);
        com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(zp, true);
        com.bytedance.sdk.component.adexpress.zp.lMd.lMd.zp();
        com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().lMd();
        initAnimationScale(context);
        tG.lMd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.dT.KS.zp();
                com.bytedance.sdk.openadsdk.dT.KS.zp("android_act", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.1
                    @Override // com.bytedance.sdk.openadsdk.dT.lMd
                    public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("act", zp.lMd(context));
                            jSONObject.put("api_available", zp.lMd());
                            jSONObject.put("act_signals_callback_available", zp.KS());
                            jSONObject.put("act_event", zp.zp());
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.tG.zp("AsyncInitTask", "run: ", th);
                        }
                        return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("android_act").lMd(jSONObject.toString());
                    }
                });
            }
        }, 10000L);
    }

    private static void zp(Context context) {
        com.bytedance.sdk.openadsdk.core.KS.zp(context).zp("uuid", FP.zp());
    }
}
