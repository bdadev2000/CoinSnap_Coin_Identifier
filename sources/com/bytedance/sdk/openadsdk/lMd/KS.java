package com.bytedance.sdk.openadsdk.lMd;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.pvr;
import com.bytedance.sdk.openadsdk.lMd.zp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.cW;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {

    /* loaded from: classes.dex */
    public static class zp {
        public static void zp(final String str, final JSONObject jSONObject, final woN won) {
            KS.zp(new com.bytedance.sdk.component.ku.ku("res_hit") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String zp = YhE.zp(won);
                        if (zp == null) {
                            return;
                        }
                        String concat = zp.concat("_landingpage");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        KS.lMd(System.currentTimeMillis(), won, concat, str, jSONObject2);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.loadEvent error", th);
                    }
                }
            });
        }

        public static void zp(final int i9, final int i10, final woN won) {
            KS.zp(new com.bytedance.sdk.component.ku.ku("res_hit") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.zp.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String zp = YhE.zp(won);
                        if (zp == null) {
                            return;
                        }
                        String concat = zp.concat("_landingpage");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("all_times", i10);
                        jSONObject.put("hit_times", i9);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        KS.lMd(System.currentTimeMillis(), won, concat, "local_res_hit_rate", jSONObject2);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                }
            });
        }

        public static void zp(final long j7, final woN won, final String str, final ILoader iLoader, final String str2) {
            KS.zp(new com.bytedance.sdk.component.ku.ku("page_init") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.zp.3
                @Override // java.lang.Runnable
                public void run() {
                    int i9;
                    try {
                        if (str == null) {
                            return;
                        }
                        int zp = com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(iLoader, str2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", won.aax());
                        jSONObject.put("channel_name", won.fVt());
                        if (!TextUtils.isEmpty(won.fVt()) && zp > 0) {
                            i9 = 1;
                            jSONObject.put("interceptor_status", i9);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("resource_count", zp);
                            jSONObject.put("resource_info", jSONObject2);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("ad_extra_data", jSONObject.toString());
                            jSONObject3.put("duration", j7);
                            KS.lMd(System.currentTimeMillis(), won, str, "landingpage_init", jSONObject3);
                        }
                        i9 = 0;
                        jSONObject.put("interceptor_status", i9);
                        JSONObject jSONObject22 = new JSONObject();
                        jSONObject22.put("resource_count", zp);
                        jSONObject.put("resource_info", jSONObject22);
                        JSONObject jSONObject32 = new JSONObject();
                        jSONObject32.put("ad_extra_data", jSONObject.toString());
                        jSONObject32.put("duration", j7);
                        KS.lMd(System.currentTimeMillis(), won, str, "landingpage_init", jSONObject32);
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                }
            });
        }

        public static void zp(final int i9, final int i10, final int i11, final int i12, final woN won, final String str, final int i13) {
            KS.zp(new com.bytedance.sdk.component.ku.ku("resource_detail") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.zp.4
                @Override // java.lang.Runnable
                public void run() {
                    int i14;
                    try {
                        if (str != null && !TextUtils.isEmpty(won.fVt())) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("next_url", won.aax());
                            jSONObject.put("channel_name", won.fVt());
                            if (i9 <= 0) {
                                i14 = 0;
                            } else {
                                i14 = 2;
                            }
                            jSONObject.put("preload_status", i14);
                            jSONObject.put("first_page", i13);
                            jSONObject.put("preload_h5_type", won.ho());
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("channel_response", i9);
                            jSONObject2.put("failResourceCount", i10);
                            jSONObject2.put("successCount", i11);
                            jSONObject2.put("failCount", i12);
                            jSONObject.put("resource_info", jSONObject2);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("ad_extra_data", jSONObject.toString());
                            KS.lMd(System.currentTimeMillis(), won, str, "landing_page_resource_detail", jSONObject3);
                        }
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                    }
                }
            });
        }
    }

    public static void KS(final woN won, final String str) {
        zp(new com.bytedance.sdk.component.ku.ku("pictureClick") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.12
            @Override // java.lang.Runnable
            public void run() {
                if (won == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", won.QUv().getNativeAdType());
                    jSONObject.put("interaction_method", won.dQp());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.lMd(th.toString());
                }
                KS.lMd(System.currentTimeMillis(), won, str, "picture_click", jSONObject2);
            }
        });
    }

    @DungeonFlag
    private static void jU(final woN won, final String str, final String str2, final JSONObject jSONObject) {
        if (won == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (won.Vc() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            won.ku(true);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zp(new com.bytedance.sdk.component.ku.ku("onShow") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                Object obj;
                try {
                    pvr.lMd(won);
                    String str3 = "none";
                    if (com.bytedance.sdk.openadsdk.core.KVG.jU().CZ()) {
                        str3 = com.bytedance.sdk.openadsdk.core.COT.zp.zp.zp((Application) com.bytedance.sdk.openadsdk.core.KVG.zp()).zp(str2, DeviceUtils.zp(), won.FGx());
                    }
                    jSONObject2 = new JSONObject();
                    try {
                        JSONObject jSONObject3 = jSONObject;
                        if (jSONObject3 != null) {
                            jSONObject3.put("interaction_method", won.dQp());
                            jSONObject.put("real_interaction_method", won.rV());
                            jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.KVG.jU().vDp(String.valueOf(won.FGx())));
                            jSONObject.put("au_show", str3);
                            jSONObject2.put("ad_extra_data", jSONObject.toString());
                        } else {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("interaction_method", won.dQp());
                            jSONObject4.put("real_interaction_method", won.rV());
                            jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.KVG.jU().vDp(String.valueOf(won.FGx())));
                            jSONObject4.put("au_show", str3);
                            jSONObject2.put("ad_extra_data", jSONObject4.toString());
                        }
                        jSONObject2.putOpt("log_extra", won.GP());
                        float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - won.Sx()).floatValue();
                        if (floatValue <= 0.0f) {
                            floatValue = 0.0f;
                        }
                        jSONObject2.putOpt("show_time", Float.valueOf(floatValue));
                        jSONObject2.putOpt("ua_policy", Integer.valueOf(won.UPs()));
                        String RCv = won.RCv();
                        if (!TextUtils.isEmpty(RCv) && !TextUtils.isEmpty(RCv)) {
                            try {
                                jSONObject2.put("ttdsp_price", Math.round(Float.parseFloat(RCv) * 100000.0f));
                            } catch (Throwable th) {
                                jSONObject2.put("ttdsp_price", 0);
                                com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", th.getMessage());
                            }
                        }
                        if (won.zpV() != null) {
                            try {
                                Object obj2 = won.zpV().get("sdk_bidding_type");
                                if (obj2 != null && Integer.parseInt(obj2.toString()) == 2 && (obj = won.zpV().get(BidResponsed.KEY_PRICE)) != null) {
                                    jSONObject2.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                }
                            } catch (Throwable th2) {
                                com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", "client bidding price error: ", th2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    jSONObject2 = null;
                }
                new zp.C0124zp(currentTimeMillis, won).lMd(str2).KS(str).HWF(won.fgJ()).zp(won.qtv()).zp(jSONObject2).ku(won.Gor()).zp((com.bytedance.sdk.openadsdk.lMd.lMd.zp) null);
                if ("show".equals(str)) {
                    if (!won.tyQ()) {
                        if (won.slc()) {
                            com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(won.DY(), new KS.lMd("show_urls", won));
                        } else {
                            KS.zp(won);
                        }
                    }
                    JSONObject jSONObject5 = jSONObject;
                    if (jSONObject5 != null) {
                        int optInt = jSONObject5.optInt("dynamic_show_type");
                        if (won.JTQ() == 1 && optInt == 7) {
                            com.bytedance.sdk.component.utils.ku.zp().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KS.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject6 = new JSONObject();
                                    try {
                                        jSONObject6.put("auto_click", true);
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        KS.lMd(won, str2, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject6);
                                    } catch (Exception unused3) {
                                        com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.dQp.etV().VuU());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.COT.KS.KS();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DungeonFlag
    public static void KS(long j7, woN won, String str, String str2) {
        lMd(j7, won, str, str2, new JSONObject());
    }

    public static void lMd(final woN won, final String str, final long j7) {
        if (won == null) {
            return;
        }
        zp(new com.bytedance.sdk.component.ku.ku("adClickShowTimeReport") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("video_click_duration_time", j7);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                long j9 = j7;
                if (j9 > 0 && j9 < 200000) {
                    KS.lMd(System.currentTimeMillis(), won, str, "video_click_duration", jSONObject2);
                }
            }
        });
    }

    public static void zp() {
        try {
            Class.forName(KS.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    @DungeonFlag
    public static void KS(woN won, String str, String str2, JSONObject jSONObject) {
        if (won == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        lMd(System.currentTimeMillis(), won, str, str2, jSONObject);
    }

    public static void lMd(final woN won, final String str) {
        zp(new com.bytedance.sdk.component.ku.ku("onAggShowBack") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.11
            @Override // java.lang.Runnable
            public void run() {
                if (won != null) {
                    KS.KS(System.currentTimeMillis(), won, str, "show_agg_backup");
                }
            }
        });
    }

    public static void zp(woN won, String str, int i9) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("render_type", "h5");
            jSONObject2.putOpt("render_type_2", 0);
            jSONObject2.putOpt("preload_status", Integer.valueOf(i9));
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
        } catch (Exception unused) {
        }
        KS(won, str, "open_url_h5", jSONObject);
    }

    public static void lMd(woN won, String str, String str2, JSONObject jSONObject) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put("ad_extra_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        lMd(System.currentTimeMillis(), won, str, str2, jSONObject2);
    }

    public static void KS(woN won, String str, JSONObject jSONObject) {
        jU(won, "activity_recreate", str, jSONObject);
    }

    public static void jU(woN won, String str) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!woN.KS(won) || won.YC() == null) {
                return;
            }
            jSONObject2.putOpt("url", won.YC().KS());
            jSONObject2.putOpt("id", won.YC().zp());
            jSONObject2.putOpt("md5", won.YC().lMd());
            if (won.eWG() != null) {
                jSONObject2.putOpt("render_type", Integer.valueOf(won.eWG().jU()));
            }
            jSONObject.put("ad_extra_data", jSONObject2.toString());
            lMd(System.currentTimeMillis(), won, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, jSONObject);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DungeonFlag
    public static void lMd(final long j7, final woN won, final String str, final String str2, final JSONObject jSONObject) {
        if (won == null || zp(str2)) {
            return;
        }
        zp(new com.bytedance.sdk.component.ku.ku("sendEvent") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        jSONObject2.putOpt("log_extra", won.GP());
                        jSONObject.putOpt("ua_policy", Integer.valueOf(won.UPs()));
                    }
                } catch (Exception unused) {
                }
                new zp.C0124zp(j7, won).lMd(str).KS(str2).HWF(won.fgJ()).zp(won.qtv()).zp(jSONObject).ku(won.Gor()).zp((com.bytedance.sdk.openadsdk.lMd.lMd.zp) null);
            }
        });
    }

    public static void lMd(woN won, String str, String str2) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("error_msg", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
        } catch (Exception unused) {
        }
        lMd(System.currentTimeMillis(), won, str, "show_error", jSONObject);
    }

    public static void zp(woN won, String str) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (woN.KS(won)) {
                if (won.YC() != null) {
                    jSONObject2.putOpt("url", won.YC().KS());
                    jSONObject2.putOpt("id", won.YC().zp());
                    jSONObject2.putOpt("md5", won.YC().lMd());
                }
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.putOpt("url", won.eWG().vDp());
                jSONObject2.putOpt("style_id", won.mfu());
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.getMessage());
        }
        KS(won, str, "endcard_load_start", jSONObject);
    }

    public static void lMd(woN won, String str, String str2, JSONObject jSONObject, long j7) {
        if (won == null || jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_extra_data", jSONObject.toString());
            jSONObject2.put("duration", j7);
        } catch (Throwable unused) {
        }
        lMd(System.currentTimeMillis(), won, str, str2, jSONObject2);
    }

    public static void lMd(woN won, String str, JSONObject jSONObject) {
        if (won == null) {
            return;
        }
        zp(won, str, -1L, jSONObject);
    }

    public static void lMd() {
        QUv.KS(new com.bytedance.sdk.component.ku.ku("showFailLog") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.dT.KS.zp().zp("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", th.getMessage());
                }
            }
        });
    }

    public static void lMd(woN won, String str, int i9, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i9);
        } catch (JSONException unused) {
        }
        lMd(won, str, "download_app_ad_track", jSONObject);
    }

    public static void zp(woN won, String str, long j7) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (woN.KS(won)) {
                if (won.YC() != null) {
                    jSONObject2.putOpt("url", won.YC().KS());
                    jSONObject2.putOpt("id", won.YC().zp());
                    jSONObject2.putOpt("md5", won.YC().lMd());
                }
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.putOpt("url", won.eWG().vDp());
                jSONObject2.putOpt("style_id", won.mfu());
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", j7);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.getMessage());
        }
        KS(won, str, "endcard_load_finish", jSONObject);
    }

    public static void zp(woN won, String str, long j7, int i9, String str2, String str3) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (woN.KS(won)) {
                if (won.YC() != null) {
                    jSONObject2.putOpt("url", won.YC().KS());
                    jSONObject2.putOpt("id", won.YC().zp());
                    jSONObject2.putOpt("md5", won.YC().lMd());
                }
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.putOpt("url", won.eWG().vDp());
                jSONObject2.putOpt("style_id", won.mfu());
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject2.putOpt("error_url", str3);
                }
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject2.put("error_code", i9);
            jSONObject2.put("error_msg", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", j7);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.getMessage());
        }
        KS(won, str, "endcard_load_fail", jSONObject);
    }

    public static void zp(woN won, String str, long j7, int i9, int i10) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("render_type", "h5");
            jSONObject2.putOpt("render_type_2", 0);
            jSONObject2.putOpt("interaction_method", Integer.valueOf(won.dQp()));
            jSONObject2.put("first_page", i10);
            jSONObject2.put("preload_h5_type", won.ho());
            if (i9 >= 0) {
                jSONObject2.putOpt("preload_status", Integer.valueOf(i9));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", Math.min(j7, TTAdConstant.AD_MAX_EVENT_TIME));
        } catch (Exception unused) {
        }
        KS(won, str, "load", jSONObject);
    }

    public static void zp(String str, woN won, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception unused) {
            }
        }
        lMd(System.currentTimeMillis(), won, str2, str, jSONObject);
    }

    public static void zp(long j7, woN won, String str, String str2, JSONObject jSONObject, QR qr, com.bytedance.sdk.openadsdk.lMd.lMd.zp zpVar) {
        if (won == null || zp(str2)) {
            return;
        }
        new zp.C0124zp(j7, won).HWF(won.fgJ()).ku(won.Gor()).COT(won.GP()).zp(won.qtv()).lMd(str).KS(str2).zp(jSONObject).zp(zpVar);
    }

    @DungeonFlag
    public static void zp(woN won, String str, JSONObject jSONObject) {
        jU(won, "show", str, jSONObject);
    }

    public static void zp(woN won) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.Bj.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(com.bytedance.sdk.openadsdk.rV.zp.zp(won.DY(), true), 1, won.fgJ());
    }

    @DungeonFlag
    public static void zp(final String str, final woN won, final String str2, final QR qr) {
        if (won == null || qr == null || !qr.zp()) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zp(new com.bytedance.sdk.component.ku.ku("adShowTimeReport") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                    QR qr2 = qr;
                    if (qr2 != null && qr2.lMd() != null) {
                        JSONObject lMd = qr.lMd();
                        if (str2.equals("open_ad")) {
                            lMd.put("is_icon_only", won.hG() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", lMd.toString());
                    }
                } catch (Throwable unused) {
                }
                KS.lMd(currentTimeMillis, won, str2, "ad_show_time", jSONObject);
            }
        });
    }

    public static void zp(final woN won, final String str, final cW cWVar) {
        if (won == null) {
            return;
        }
        final long KS = cWVar.KS();
        zp(new com.bytedance.sdk.component.ku.ku("adBackShowTimeReport") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.8
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", KS);
                    jSONObject.put("click_time", cWVar.zp);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", won.hG() ? 1 : 0);
                    }
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                KS.lMd(System.currentTimeMillis(), won, str, "stay_duration", jSONObject2);
            }
        });
    }

    public static void zp(final woN won, final String str, final long j7, final boolean z8) {
        zp(new com.bytedance.sdk.component.ku.ku("onLpLoading") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.10
            @Override // java.lang.Runnable
            public void run() {
                int i9;
                if (won == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (z8) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    jSONObject.put("if_lp_loading_success", i9);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j7);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.lMd(th.toString());
                }
                KS.lMd(System.currentTimeMillis(), won, str, "lp_loading", jSONObject2);
            }
        });
    }

    @DungeonFlag
    public static void zp(final String str, final woN won, final com.bytedance.sdk.openadsdk.core.model.YW yw, final String str2, final boolean z8, final Map<String, Object> map, final int i9) {
        final long currentTimeMillis = System.currentTimeMillis();
        zp(new com.bytedance.sdk.component.ku.ku("onClick") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.13
            @Override // java.lang.Runnable
            public void run() {
                if (won == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.core.model.YW yw2 = yw;
                    if (yw2 != null) {
                        JSONObject zp2 = yw2.zp();
                        zp2.put("is_valid", z8);
                        int i10 = i9;
                        if (i10 > 0 && i10 <= 2) {
                            zp2.put("user_behavior_type", i10);
                        }
                        Map map2 = map;
                        if (map2 != null) {
                            if (map2.containsKey("duration")) {
                                jSONObject.put("duration", map.get("duration"));
                            }
                            for (Map.Entry entry : map.entrySet()) {
                                if (!"duration".equals(entry.getKey())) {
                                    zp2.put((String) entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        zp2.put("interaction_method", won.dQp());
                        if (str2.equals("open_ad")) {
                            zp2.put("is_icon_only", won.hG() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", zp2.toString());
                    }
                    jSONObject.putOpt("log_extra", won.GP());
                    float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - won.Sx()).floatValue();
                    if (floatValue <= 0.0f) {
                        floatValue = 0.0f;
                    }
                    jSONObject.putOpt("show_time", Float.valueOf(floatValue));
                    jSONObject.putOpt("ua_policy", Integer.valueOf(won.UPs()));
                } catch (Exception unused) {
                }
                new zp.C0124zp(currentTimeMillis, won).lMd(str2).KS(str).HWF(won.fgJ()).zp(won.qtv()).zp(jSONObject).ku(won.Gor()).zp((com.bytedance.sdk.openadsdk.lMd.lMd.zp) null);
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.Bj.zp(com.bytedance.sdk.openadsdk.core.KVG.zp())) && CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(com.bytedance.sdk.openadsdk.rV.zp.zp(won.Rh(), true), 2, won.fgJ());
                }
                if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    pvr.KS(won);
                }
            }
        });
    }

    public static void zp(woN won, String str, String str2, JSONObject jSONObject) {
        if (won == null) {
            return;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ad_extra_data", jSONObject.toString());
                if (jSONObject.has("duration")) {
                    jSONObject2.put("duration", jSONObject.get("duration"));
                }
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", e4.getMessage());
            }
            lMd(System.currentTimeMillis(), won, str, str2, jSONObject2);
        } else {
            KS(System.currentTimeMillis(), won, str, str2);
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str2)) {
            pvr.KS(won);
        }
    }

    public static void zp(woN won, String str, int i9, long j7) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("video_choose", i9);
            jSONObject2.put("video_choose_duration", j7);
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.lMd(th.toString());
        }
        lMd(System.currentTimeMillis(), won, str, "video_choose", jSONObject);
    }

    public static void zp(woN won, String str, String str2, long j7, int i9, JSONObject jSONObject, QR qr) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", j7);
            jSONObject2.put("percent", i9);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (("feed_break".equals(str2) || "feed_over".equals(str2)) && qr != null) {
                qr.zp(jSONObject);
            }
            jSONObject2.put("ad_extra_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        lMd(System.currentTimeMillis(), won, str, str2, jSONObject2);
    }

    public static void zp(woN won, String str, String str2, JSONObject jSONObject, long j7) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put("ad_extra_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("duration", j7);
        lMd(System.currentTimeMillis(), won, str, str2, jSONObject2);
    }

    public static void zp(woN won, String str, String str2, Map<String, Object> map) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject2.put("dp_creative_type", won.que());
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (Exception unused) {
        }
        lMd(System.currentTimeMillis(), won, str, str2, jSONObject);
    }

    public static void zp(woN won, String str, String str2) {
        if (won == null) {
            return;
        }
        KS(System.currentTimeMillis(), won, str, str2);
    }

    public static void zp(long j7, woN won, String str, String str2) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("duration", j7);
            if (woN.KS(won)) {
                if (won.YC() != null) {
                    jSONObject2.putOpt("url", won.YC().KS());
                    jSONObject2.putOpt("id", won.YC().zp());
                    jSONObject2.putOpt("md5", won.YC().lMd());
                }
                jSONObject2.putOpt("from", str2);
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 7);
                }
            } else {
                jSONObject2.put("url", won.eWG().vDp());
                jSONObject2.put("style_id", won.mfu());
                if (won.eWG() != null) {
                    jSONObject2.putOpt("render_type", 0);
                }
            }
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.getMessage());
        }
        lMd(System.currentTimeMillis(), won, str, "endcard_feeling_duraion", jSONObject);
    }

    public static void zp(long j7, woN won, String str) {
        if (won == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!woN.KS(won) || won.YC() == null) {
                return;
            }
            jSONObject2.putOpt("url", won.YC().KS());
            jSONObject2.putOpt("id", won.YC().zp());
            jSONObject2.putOpt("md5", won.YC().lMd());
            if (won.eWG() != null) {
                jSONObject2.putOpt("render_type", Integer.valueOf(won.eWG().jU()));
            }
            jSONObject.put("ad_extra_data", jSONObject2.toString());
            jSONObject.put("duration", j7);
            lMd(System.currentTimeMillis(), won, str, "endcard_close", jSONObject);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.lMd(e4.getMessage());
        }
    }

    public static void zp(woN won, String str, String str2, long j7, JSONObject jSONObject) {
        if (won == null || jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", j7);
            jSONObject2.put("ad_extra_data", jSONObject.toString());
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", e4.getMessage());
        }
        lMd(System.currentTimeMillis(), won, str, str2, jSONObject2);
    }

    public static void zp(String str, long j7) {
        com.bytedance.sdk.openadsdk.core.jU.KS.zp(str, j7);
    }

    @DungeonFlag
    public static void zp(final woN won, final String str, final String str2, final String str3, final long j7, final long j9, final JSONObject jSONObject, final boolean z8) {
        if (won == null || zp(str3)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zp(new com.bytedance.sdk.component.ku.ku("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.2
            @Override // java.lang.Runnable
            public void run() {
                JSONArray optJSONArray;
                String qtv = won.qtv();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String optString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(optString)) {
                            jSONObject2 = new JSONObject(optString);
                        }
                        if (!CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.COT(com.bytedance.sdk.openadsdk.core.KVG.zp()).toString());
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            if (z8) {
                                jSONObject2.put("click_scence", 1);
                            } else if (cz.lMd(won)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int optInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z8 && optInt == 2) {
                            qtv = jSONObject2.optString("app_log_url");
                        }
                        int i9 = 0;
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            pvr.KS(won);
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - woN.lMd(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (floatValue <= 0.0f) {
                                floatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(floatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.Bj.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()))) {
                                if (z8 && optInt == 2) {
                                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (optJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i9 < optJSONArray2.length()) {
                                            arrayList.add(optJSONArray2.optString(i9));
                                            i9++;
                                        }
                                        com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(com.bytedance.sdk.openadsdk.rV.zp.zp(arrayList, true), 2, String.valueOf(j7));
                                    }
                                } else {
                                    woN won2 = won;
                                    if (won2 != null) {
                                        com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(com.bytedance.sdk.openadsdk.rV.zp.zp(won2.Rh(), true), 2, won.fgJ());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.Bj.zp(com.bytedance.sdk.openadsdk.core.KVG.zp())) && z8 && optInt == 2 && (optJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i9 < optJSONArray.length()) {
                                arrayList2.add(optJSONArray.optString(i9));
                                i9++;
                            }
                            com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(com.bytedance.sdk.openadsdk.rV.zp.zp(arrayList2, true), 1, String.valueOf(j7));
                        }
                    } catch (Exception unused) {
                    }
                }
                new zp.C0124zp(currentTimeMillis, won).jU(str).lMd(str2).KS(str3).HWF(String.valueOf(j7)).QR(String.valueOf(j9)).zp(qtv).zp(jSONObject).zp((com.bytedance.sdk.openadsdk.lMd.lMd.zp) null);
            }
        });
    }

    public static void zp(final woN won, final String str, final long j7, final JSONObject jSONObject) {
        if (won == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zp(new com.bytedance.sdk.component.ku.ku("onAppOpenAd") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j9 = j7;
                    if (j9 != -1) {
                        jSONObject2.put("duration", j9);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    } else {
                        jSONObject2.put("ad_extra_data", new JSONObject().toString());
                    }
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", e4.getMessage());
                }
                KS.zp(currentTimeMillis, won, "open_ad", str, jSONObject2, (QR) null, (com.bytedance.sdk.openadsdk.lMd.lMd.zp) null);
            }
        });
    }

    public static void zp(final com.bytedance.sdk.component.ku.ku kuVar) {
        if (kuVar == null) {
            return;
        }
        if (QUv.COT()) {
            com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KS.4
                @Override // java.lang.Runnable
                public void run() {
                    QUv.lMd(com.bytedance.sdk.component.ku.ku.this, 10);
                }
            });
        } else if (!QUv.HWF()) {
            QUv.lMd(kuVar, 10);
        } else {
            kuVar.run();
        }
    }

    public static void zp(com.bytedance.sdk.openadsdk.dT.zp.zp zpVar) {
        if (zpVar == null || zpVar.lMd() == null) {
            return;
        }
        woN lMd = zpVar.lMd();
        int oKZ = lMd.oKZ();
        if (oKZ == 2 || oKZ == 8) {
            JSONObject jSONObject = new JSONObject();
            try {
                int jU = zpVar.jU();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("count", YhE.rV(com.bytedance.sdk.openadsdk.core.KVG.zp()));
                jSONObject2.put("interceptor", jU);
                jSONObject2.put("success", zpVar.COT());
                jSONObject2.put("link", zpVar.zp());
                jSONObject2.put("interaction_type", oKZ);
                jSONObject2.put("real_interaction_type", zpVar.QR());
                if (zpVar.jU() == 9) {
                    jSONObject2.put("is_act_signals_api_available", zpVar.ku());
                    jSONObject2.put("is_act_signals_callback", zpVar.YW());
                }
                if (!TextUtils.isEmpty(zpVar.HWF())) {
                    jSONObject2.put("exception_msg", zpVar.HWF());
                }
                if (jU == 2 || jU == 5) {
                    jSONObject2.put("meta", lMd.Eg().toString());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
                lMd(System.currentTimeMillis(), lMd, zpVar.KS(), "open_browser", jSONObject);
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.AdEvent", e4.getMessage());
            }
        }
    }

    public static void zp(woN won, String str, int i9, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i9);
        } catch (JSONException unused) {
        }
        lMd(won, str, "open_ad_land_page_links", jSONObject);
    }

    public static void zp(final woN won, final String str, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final int i9) {
        zp(new com.bytedance.sdk.component.ku.ku("start_show_endcard") { // from class: com.bytedance.sdk.openadsdk.lMd.KS.6
            @Override // java.lang.Runnable
            public void run() {
                if (won == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isSkip", z8);
                    jSONObject2.put("force", z9);
                    jSONObject2.put("isFromLandingPage", z10);
                    jSONObject2.put("finishing", z11);
                    jSONObject2.put("from", i9);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                KS.lMd(System.currentTimeMillis(), won, str, "start_show_endcard", jSONObject);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0005, B:12:0x0034, B:14:0x003a, B:15:0x006b, B:17:0x0082, B:22:0x0050, B:24:0x0056, B:25:0x0014, B:28:0x001e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0005, B:12:0x0034, B:14:0x003a, B:15:0x006b, B:17:0x0082, B:22:0x0050, B:24:0x0056, B:25:0x0014, B:28:0x001e), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN r6, java.lang.String r7, java.lang.String r8, long r9, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14) {
        /*
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            int r0 = r12.hashCode()     // Catch: java.lang.Throwable -> L8c
            r1 = -1606803861(0xffffffffa03a1e6b, float:-1.5764877E-19)
            r2 = 1
            if (r0 == r1) goto L1e
            r1 = 3107(0xc23, float:4.354E-42)
            if (r0 == r1) goto L14
            goto L28
        L14:
            java.lang.String r0 = "ad"
            boolean r0 = r12.equals(r0)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L28
            r0 = r2
            goto L29
        L1e:
            java.lang.String r0 = "endcard"
            boolean r0 = r12.equals(r0)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L28
            r0 = 0
            goto L29
        L28:
            r0 = -1
        L29:
            java.lang.String r1 = "md5"
            java.lang.String r4 = "id"
            java.lang.String r5 = "url"
            if (r0 == 0) goto L50
            if (r0 == r2) goto L34
            goto L6b
        L34:
            com.bytedance.sdk.openadsdk.core.model.woN$zp r0 = r6.fRl()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6b
            java.lang.String r2 = r0.rV()     // Catch: java.lang.Throwable -> L8c
            r3.putOpt(r5, r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = r0.COT()     // Catch: java.lang.Throwable -> L8c
            r3.putOpt(r4, r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = r0.dQp()     // Catch: java.lang.Throwable -> L8c
            r3.putOpt(r1, r0)     // Catch: java.lang.Throwable -> L8c
            goto L6b
        L50:
            com.bytedance.sdk.openadsdk.core.ugen.COT.zp r0 = r6.YC()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6b
            java.lang.String r2 = r0.KS()     // Catch: java.lang.Throwable -> L8c
            r3.putOpt(r5, r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = r0.zp()     // Catch: java.lang.Throwable -> L8c
            r3.putOpt(r4, r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = r0.lMd()     // Catch: java.lang.Throwable -> L8c
            r3.putOpt(r1, r0)     // Catch: java.lang.Throwable -> L8c
        L6b:
            java.lang.String r0 = "status"
            r3.put(r0, r8)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "from"
            r3.put(r0, r11)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r11 = "scene"
            r3.put(r11, r12)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r11 = "fail"
            boolean r8 = r11.equals(r8)     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L8c
            java.lang.String r8 = "error_code"
            r3.put(r8, r13)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = "error_msg"
            r3.put(r8, r14)     // Catch: java.lang.Throwable -> L8c
        L8c:
            java.lang.String r2 = "load_ugen_template"
            r0 = r6
            r1 = r7
            r4 = r9
            zp(r0, r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.lMd.KS.zp(com.bytedance.sdk.openadsdk.core.model.woN, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    private static boolean zp(String str) {
        int QUv = com.bytedance.sdk.openadsdk.core.settings.dQp.etV().QUv(str);
        if (QUv == 0) {
            return true;
        }
        if (QUv != 100) {
            return ((int) ((Math.random() * 100.0d) + 1.0d)) > QUv;
        }
        return false;
    }
}
