package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.common.AlY;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.YoT;
import com.bytedance.sdk.openadsdk.core.act.YFl;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.tN;
import com.bytedance.sdk.openadsdk.lG.Sg;
import com.bytedance.sdk.openadsdk.utils.Cfr;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Ne;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    private static void YFl(Context context) {
        tN.YFl(context).YFl("uuid", Ne.YFl());
    }

    public static void initAPM() {
        if (AlY.YFl()) {
            return;
        }
        try {
            String AlY = NjR.Sg().AlY();
            if (TextUtils.isEmpty(AlY)) {
                return;
            }
            ApmHelper.initApm(lG.YFl(), new PAGConfig.Builder().appId(AlY).build());
        } catch (Exception unused) {
        }
    }

    public static void initAnimationScale(Context context) {
        try {
            float f10 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f10;
            if (f10 <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    public static void initMemoryData() {
        lG.AlY();
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_privacy", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("sp_global_icon_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl(Sg.YFl, "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_event_net_ad", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_event_net_state", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_event_net_trail", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_event_db_ad", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_event_db_state", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_event_db_trail", "a", 0);
    }

    public static void maybeAsyncInitTask(final Context context) {
        YFl.YFl(context);
        Cfr.YFl();
        GS.YFl(context);
        YFl(context);
        lG.wN();
        String YFl = YoT.YFl(context);
        com.bytedance.sdk.openadsdk.core.NjR.tN.Sg(YFl);
        com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(YFl, true);
        com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.YFl();
        com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().Sg();
        initAnimationScale(context);
        pDU.Sg().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.pDU.tN.YFl();
                com.bytedance.sdk.openadsdk.pDU.tN.YFl("android_act", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.1
                    @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                    public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("act", YFl.Sg(context));
                            jSONObject.put("api_available", YFl.Sg());
                            jSONObject.put("act_signals_callback_available", YFl.tN());
                            jSONObject.put("act_event", YFl.YFl());
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.YoT.YFl("AsyncInitTask", "run: ", th2);
                        }
                        return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("android_act").Sg(jSONObject.toString());
                    }
                });
            }
        }, 10000L);
    }
}
