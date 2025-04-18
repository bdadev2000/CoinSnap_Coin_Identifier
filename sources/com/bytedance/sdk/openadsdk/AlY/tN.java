package com.bytedance.sdk.openadsdk.AlY;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import com.bytedance.sdk.openadsdk.AlY.YFl;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.VOe;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.aIu;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.zB;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    @DungeonFlag
    private static void AlY(final Wwa wwa, final String str, final String str2, final JSONObject jSONObject) {
        if (wwa == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (wwa.GT() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            wwa.qsH(true);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        YFl(new com.bytedance.sdk.component.qsH.qsH("onShow") { // from class: com.bytedance.sdk.openadsdk.AlY.tN.46
            @Override // java.lang.Runnable
            public void run() {
                tN.YFl(currentTimeMillis, wwa, str2, str, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.46.1
                    @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                    public JSONObject YFl() {
                        Object obj;
                        try {
                            VOe.Sg(wwa);
                            String str3 = "none";
                            if (com.bytedance.sdk.openadsdk.core.lG.AlY().uGS()) {
                                str3 = com.bytedance.sdk.openadsdk.core.NjR.YFl.YFl.YFl((Application) com.bytedance.sdk.openadsdk.core.lG.YFl()).YFl(str2, DeviceUtils.YFl(), wwa.kU());
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                AnonymousClass46 anonymousClass46 = AnonymousClass46.this;
                                JSONObject jSONObject3 = jSONObject;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("interaction_method", wwa.lG());
                                    AnonymousClass46 anonymousClass462 = AnonymousClass46.this;
                                    jSONObject.put("real_interaction_method", wwa.rkt());
                                    jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.lG.AlY().GA(String.valueOf(wwa.kU())));
                                    jSONObject.put("au_show", str3);
                                    AnonymousClass46 anonymousClass463 = AnonymousClass46.this;
                                    com.bytedance.sdk.openadsdk.qO.YFl.YFl.YFl(wwa, jSONObject);
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                } else {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("interaction_method", wwa.lG());
                                    jSONObject4.put("real_interaction_method", wwa.rkt());
                                    jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.lG.AlY().GA(String.valueOf(wwa.kU())));
                                    jSONObject4.put("au_show", str3);
                                    com.bytedance.sdk.openadsdk.qO.YFl.YFl.YFl(wwa, jSONObject4);
                                    jSONObject2.put("ad_extra_data", jSONObject4.toString());
                                }
                                jSONObject2.putOpt("log_extra", wwa.uGS());
                                float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wwa.ks()).floatValue();
                                if (floatValue <= 0.0f) {
                                    floatValue = 0.0f;
                                }
                                jSONObject2.putOpt("show_time", Float.valueOf(floatValue));
                                jSONObject2.putOpt("ua_policy", Integer.valueOf(wwa.GS()));
                                String Ga = wwa.Ga();
                                if (!TextUtils.isEmpty(Ga) && !TextUtils.isEmpty(Ga)) {
                                    try {
                                        jSONObject2.put("ttdsp_price", Math.round(Float.parseFloat(Ga) * 100000.0f));
                                    } catch (Throwable th2) {
                                        jSONObject2.put("ttdsp_price", 0);
                                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", th2.getMessage());
                                    }
                                }
                                if (wwa.AfY() != null) {
                                    try {
                                        Object obj2 = wwa.AfY().get(TTAdConstant.SDK_BIDDING_TYPE);
                                        if (obj2 != null && Integer.parseInt(obj2.toString()) == 2 && (obj = wwa.AfY().get(BidResponsed.KEY_PRICE)) != null) {
                                            jSONObject2.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                            return jSONObject2;
                                        }
                                        return jSONObject2;
                                    } catch (Throwable th3) {
                                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", "client bidding price error: ", th3);
                                        return jSONObject2;
                                    }
                                }
                                return jSONObject2;
                            } catch (Exception unused) {
                                return jSONObject2;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!wwa.JwO()) {
                        if (wwa.Pj()) {
                            com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(wwa.RX(), new tN.Sg("show_urls", wwa));
                        } else {
                            tN.YFl(wwa);
                        }
                    }
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        int optInt = jSONObject2.optInt("dynamic_show_type");
                        if (wwa.ynx() == 1 && (optInt == 7 || optInt == 10)) {
                            com.bytedance.sdk.component.utils.DSW.YFl().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.46.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject3.put("auto_click", true);
                                        AnonymousClass46 anonymousClass46 = AnonymousClass46.this;
                                        tN.Sg(wwa, str2, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject3);
                                    } catch (Exception unused) {
                                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().jz());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.NjR.tN.tN();
                }
            }
        });
    }

    public static void Sg(Wwa wwa, String str, final long j3) {
        if (wwa != null && j3 > 0 && j3 < 200000) {
            YFl(System.currentTimeMillis(), wwa, str, "video_click_duration", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.3
                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                public JSONObject YFl() {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j3);
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (Throwable unused) {
                    }
                    return jSONObject2;
                }
            });
        }
    }

    public static void YFl() {
        try {
            Class.forName(tN.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void tN(Wwa wwa, String str, final int i10) {
        YFl(System.currentTimeMillis(), wwa, str, "check_meta_more", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.7
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().yn());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void wN(Wwa wwa, final com.bytedance.sdk.openadsdk.pDU.YFl.YFl yFl, final String str) {
        YFl(System.currentTimeMillis(), wwa, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.28
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.tN());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.AlY());
                    jSONObject2.put("arbi_start_x", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.wN());
                    jSONObject2.put("arbi_start_y", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.vc());
                    jSONObject2.put("click_duration", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.DSW());
                    jSONObject2.put("is_trigger_jump", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.qsH());
                    jSONObject2.put("click_type", String.valueOf(com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.qO()));
                    if (com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.YFl() != -1) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("hit_type", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.YFl());
                        jSONObject3.put("hit_extra", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.Sg());
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th2) {
                    aIu.Sg("TTAD.AdEvent", "onWebBehaviorClick", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Sg(Wwa wwa, String str, final int i10) {
        YFl(System.currentTimeMillis(), wwa, str, "check_meta", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.6
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().yn());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(Wwa wwa, String str, final int i10) {
        YFl(System.currentTimeMillis(), wwa, str, "open_url_h5", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.1
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("preload_status", Integer.valueOf(i10));
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void tN(final Wwa wwa, String str) {
        if (wwa == null || !Wwa.tN(wwa) || wwa.HaH() == null) {
            return;
        }
        YFl(System.currentTimeMillis(), wwa, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.23
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", Wwa.this.HaH().tN());
                    jSONObject2.putOpt("id", Wwa.this.HaH().YFl());
                    jSONObject2.putOpt("md5", Wwa.this.HaH().Sg());
                    if (Wwa.this.BPI() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(Wwa.this.BPI().f23467l));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void wN(Wwa wwa, String str, JSONObject jSONObject) {
        AlY(wwa, "activity_recreate", str, jSONObject);
    }

    /* loaded from: classes.dex */
    public static class YFl {
        public static void YFl(String str, final JSONObject jSONObject, Wwa wwa) {
            String YFl = Sco.YFl(wwa);
            if (YFl == null) {
                return;
            }
            tN.YFl(System.currentTimeMillis(), wwa, YFl.concat("_landingpage"), str, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.YFl.1
                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                public JSONObject YFl() {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.loadEvent error", th2);
                    }
                    return jSONObject2;
                }
            });
        }

        public static void YFl(final int i10, final int i11, Wwa wwa) {
            String YFl = Sco.YFl(wwa);
            if (YFl == null) {
                return;
            }
            tN.YFl(System.currentTimeMillis(), wwa, YFl.concat("_landingpage"), "local_res_hit_rate", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.YFl.2
                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                public JSONObject YFl() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("all_times", i11);
                        jSONObject2.put("hit_times", i10);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                    }
                    return jSONObject;
                }
            });
        }

        public static void YFl(final long j3, final Wwa wwa, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            tN.YFl(System.currentTimeMillis(), wwa, str, "landingpage_init", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.YFl.3
                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                public JSONObject YFl() {
                    int i10;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int YFl = com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(ILoader.this, str2);
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        String str3 = Wwa.Sg;
                        int i11 = 1;
                        if (wwa.iY()) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        jSONObject3.put(str3, i10);
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                        jSONObject2.put("url", wwa.Cqy());
                        jSONObject2.put("channel_name", wwa.DjU());
                        if (TextUtils.isEmpty(wwa.DjU()) || YFl <= 0) {
                            i11 = 0;
                        }
                        jSONObject2.put("interceptor_status", i11);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("resource_count", YFl);
                        jSONObject2.put("resource_info", jSONObject4);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("duration", j3);
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                    }
                    return jSONObject;
                }
            });
        }

        public static void YFl(final int i10, final int i11, final int i12, final int i13, final Wwa wwa, String str, final int i14) {
            if (str == null || TextUtils.isEmpty(wwa.DjU())) {
                return;
            }
            tN.YFl(System.currentTimeMillis(), wwa, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.YFl.4
                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                public JSONObject YFl() {
                    int i15;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("next_url", Wwa.this.Cqy());
                        jSONObject2.put("channel_name", Wwa.this.DjU());
                        if (i10 <= 0) {
                            i15 = 0;
                        } else {
                            i15 = 2;
                        }
                        jSONObject2.put("preload_status", i15);
                        jSONObject2.put("first_page", i14);
                        jSONObject2.put("preload_h5_type", Wwa.this.rnG());
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("channel_response", i10);
                        jSONObject3.put("failResourceCount", i11);
                        jSONObject3.put("successCount", i12);
                        jSONObject3.put("failCount", i13);
                        jSONObject2.put("resource_info", jSONObject3);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Throwable th2) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th2);
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void Sg(final Wwa wwa, String str) {
        YFl(System.currentTimeMillis(), wwa, str, "picture_click", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.12
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", Wwa.this.pq().getNativeAdType());
                    jSONObject.put("interaction_method", Wwa.this.lG());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(final Wwa wwa, String str) {
        YFl(System.currentTimeMillis(), wwa, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.11
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (Wwa.tN(Wwa.this)) {
                        if (Wwa.this.HaH() != null) {
                            jSONObject2.putOpt("url", Wwa.this.HaH().tN());
                            jSONObject2.putOpt("id", Wwa.this.HaH().YFl());
                            jSONObject2.putOpt("md5", Wwa.this.HaH().Sg());
                        }
                        if (Wwa.this.BPI() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", Wwa.this.BPI().f23463h);
                        jSONObject2.putOpt("style_id", Wwa.this.bg());
                        if (Wwa.this.BPI() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Sg(Wwa wwa, String str, String str2, final JSONObject jSONObject) {
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.17
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(final Wwa wwa, String str, final long j3) {
        YFl(System.currentTimeMillis(), wwa, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.22
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (Wwa.tN(Wwa.this)) {
                        if (Wwa.this.HaH() != null) {
                            jSONObject2.putOpt("url", Wwa.this.HaH().tN());
                            jSONObject2.putOpt("id", Wwa.this.HaH().YFl());
                            jSONObject2.putOpt("md5", Wwa.this.HaH().Sg());
                        }
                        if (Wwa.this.BPI() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", Wwa.this.BPI().f23463h);
                        jSONObject2.putOpt("style_id", Wwa.this.bg());
                        if (Wwa.this.BPI() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j3);
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void tN(Wwa wwa, final com.bytedance.sdk.openadsdk.pDU.YFl.YFl yFl, final String str) {
        YFl(System.currentTimeMillis(), wwa, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.26
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.tN());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.AlY());
                    jSONObject2.put("arbi_stay_duration", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.pDU());
                    jSONObject2.put("browsing_percentage", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.EH());
                    jSONObject2.put("out_focus_scene", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.rkt());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th2) {
                    aIu.Sg("TTAD.AdEvent", "onWebBehaviorStay", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Sg(final long j3, final Wwa wwa, String str, final String str2) {
        YFl(System.currentTimeMillis(), wwa, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.21
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("duration", j3);
                    if (Wwa.tN(wwa)) {
                        if (wwa.HaH() != null) {
                            jSONObject2.putOpt("url", wwa.HaH().tN());
                            jSONObject2.putOpt("id", wwa.HaH().YFl());
                            jSONObject2.putOpt("md5", wwa.HaH().Sg());
                        }
                        jSONObject2.putOpt("from", str2);
                        if (wwa.BPI() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.put("url", wwa.BPI().f23463h);
                        jSONObject2.put("style_id", wwa.bg());
                        if (wwa.BPI() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(final Wwa wwa, String str, final long j3, final int i10, final String str2, final String str3) {
        YFl(System.currentTimeMillis(), wwa, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.33
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (Wwa.tN(Wwa.this)) {
                        if (Wwa.this.HaH() != null) {
                            jSONObject2.putOpt("url", Wwa.this.HaH().tN());
                            jSONObject2.putOpt("id", Wwa.this.HaH().YFl());
                            jSONObject2.putOpt("md5", Wwa.this.HaH().Sg());
                        }
                        if (Wwa.this.BPI() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", Wwa.this.BPI().f23463h);
                        jSONObject2.putOpt("style_id", Wwa.this.bg());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject2.putOpt("error_url", str3);
                        }
                        if (Wwa.this.BPI() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject2.put("error_code", i10);
                    jSONObject2.put("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j3);
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void tN(Wwa wwa, final String str, final String str2, final JSONObject jSONObject) {
        if (wwa == null || jSONObject == null) {
            return;
        }
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.34
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void AlY(Wwa wwa, final com.bytedance.sdk.openadsdk.pDU.YFl.YFl yFl, final String str) {
        YFl(System.currentTimeMillis(), wwa, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.27
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.tN());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.AlY());
                    jSONObject2.put("trigger_scroll_x", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.NjR());
                    jSONObject2.put("trigger_scroll_y", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.nc());
                    jSONObject2.put("arbi_offset_y", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.eT());
                    jSONObject2.put("scroll_type", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.YoT());
                    jSONObject2.put("scroll_duration", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.GA());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th2) {
                    aIu.Sg("TTAD.AdEvent", "onWebBehaviorScroll", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void Sg(Wwa wwa, final com.bytedance.sdk.openadsdk.pDU.YFl.YFl yFl, final String str) {
        YFl(System.currentTimeMillis(), wwa, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.25
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.tN());
                    jSONObject2.put("current_url_index", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.AlY());
                    jSONObject2.put("arbi_load_duration", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.Wwa());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th2) {
                    aIu.Sg("TTAD.AdEvent", "onWebBehaviorLoad", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(final Wwa wwa, String str, final long j3, final int i10, final int i11) {
        YFl(System.currentTimeMillis(), wwa, str, "load", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.43
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("interaction_method", Integer.valueOf(Wwa.this.lG()));
                    jSONObject2.put("first_page", i11);
                    jSONObject2.put("preload_h5_type", Wwa.this.rnG());
                    int i12 = i10;
                    if (i12 >= 0) {
                        jSONObject2.putOpt("preload_status", Integer.valueOf(i12));
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", Math.min(j3, TTAdConstant.AD_MAX_EVENT_TIME));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void tN(Wwa wwa, final String str, final JSONObject jSONObject) {
        YFl(System.currentTimeMillis(), wwa, str, Sg.f10490vc, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.36
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (JSONException unused) {
                }
                String str2 = Sg.YFl;
                return jSONObject2;
            }
        });
    }

    public static void AlY(Wwa wwa, String str, JSONObject jSONObject) {
        if (wwa == null) {
            return;
        }
        YFl(wwa, str, -1L, jSONObject);
    }

    public static void Sg(Wwa wwa, String str, String str2, final JSONObject jSONObject, final long j3) {
        if (wwa == null || jSONObject == null) {
            return;
        }
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.32
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j3);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(String str, Wwa wwa, String str2, final Map<String, Object> map) {
        YFl(System.currentTimeMillis(), wwa, str2, str, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.44
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (map != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void Sg(Wwa wwa, final String str, final JSONObject jSONObject) {
        YFl(System.currentTimeMillis(), wwa, str, Sg.wN, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.35
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (JSONException unused) {
                }
                String str2 = Sg.YFl;
                return jSONObject2;
            }
        });
    }

    public static void YFl(long j3, Wwa wwa, String str, String str2, final JSONObject jSONObject, DSW dsw, com.bytedance.sdk.openadsdk.AlY.Sg.YFl yFl) {
        YFl(j3, wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.45
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                return jSONObject;
            }
        });
    }

    public static void Sg(Wwa wwa, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        Sg(wwa, str, "download_app_ad_track", jSONObject);
    }

    @DungeonFlag
    public static void YFl(Wwa wwa, String str, JSONObject jSONObject) {
        AlY(wwa, "show", str, jSONObject);
    }

    public static void YFl(Wwa wwa) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.YoT.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(com.bytedance.sdk.openadsdk.VOe.YFl.YFl(wwa.RX(), true), 1, wwa.zz());
    }

    @DungeonFlag
    public static void YFl(final String str, final Wwa wwa, final String str2, final DSW dsw) {
        if (wwa == null || dsw == null || !dsw.YFl()) {
            return;
        }
        YFl(System.currentTimeMillis(), wwa, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.47
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                int i10;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                    DSW dsw2 = dsw;
                    if (dsw2 != null && dsw2.Sg() != null) {
                        JSONObject Sg = dsw.Sg();
                        if (str2.equals("open_ad")) {
                            if (wwa.Zu()) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            Sg.put("is_icon_only", i10);
                        }
                        jSONObject.put("ad_extra_data", Sg.toString());
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(final Wwa wwa, final String str, final zB zBVar) {
        if (wwa == null) {
            return;
        }
        final long tN = zBVar.tN();
        YFl(System.currentTimeMillis(), wwa, str, "stay_duration", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.2
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                int i10;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", tN);
                    jSONObject.put("click_time", zBVar.YFl);
                    if (str.equals("open_ad")) {
                        if (wwa.Zu()) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        jSONObject.put("is_icon_only", i10);
                    }
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(Wwa wwa, final String str, final int i10, final String str2, final long j3, final boolean z10, final int i11, final long j10) {
        YFl(System.currentTimeMillis(), wwa, str, Sg.AlY, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.4
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j3);
                    jSONObject.put("arbi_trigger_start", z10);
                    jSONObject.put("arbi_convert_count", i11);
                    jSONObject.put("loading_start_timestamp", j10);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(Wwa wwa, String str, final long j3, final boolean z10) {
        YFl(System.currentTimeMillis(), wwa, str, "lp_loading", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.5
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                int i10;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (z10) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    jSONObject.put("if_lp_loading_success", i10);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put("duration", j3);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(Wwa wwa, final String str, final int i10, final String str2) {
        YFl(System.currentTimeMillis(), wwa, str, Sg.YFl, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.8
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(Wwa wwa, final String str, final int i10, final String str2, final float f10) {
        YFl(System.currentTimeMillis(), wwa, str, Sg.Sg, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.9
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f10);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(Wwa wwa, final String str, final int i10, final String str2, final String str3, final int i11) {
        YFl(System.currentTimeMillis(), wwa, str, Sg.tN, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.10
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("index", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i11);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject2;
            }
        });
    }

    @DungeonFlag
    public static void YFl(final String str, final Wwa wwa, final com.bytedance.sdk.openadsdk.core.model.nc ncVar, final String str2, final boolean z10, final Map<String, Object> map, final int i10) {
        final long currentTimeMillis = System.currentTimeMillis();
        YFl(new com.bytedance.sdk.component.qsH.qsH("onClick") { // from class: com.bytedance.sdk.openadsdk.AlY.tN.13
            @Override // java.lang.Runnable
            public void run() {
                Wwa wwa2 = wwa;
                if (wwa2 == null) {
                    return;
                }
                tN.YFl(currentTimeMillis, wwa2, str2, str, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.13.1
                    @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                    public JSONObject YFl() {
                        int i11;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.nc ncVar2 = ncVar;
                            if (ncVar2 != null) {
                                JSONObject YFl2 = ncVar2.YFl();
                                YFl2.put("is_valid", z10);
                                int i12 = i10;
                                if (i12 > 0 && i12 <= 2) {
                                    YFl2.put("user_behavior_type", i12);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            YFl2.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                YFl2.put("interaction_method", wwa.lG());
                                if (str2.equals("open_ad")) {
                                    if (wwa.Zu()) {
                                        i11 = 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    YFl2.put("is_icon_only", i11);
                                }
                                jSONObject.put("ad_extra_data", YFl2.toString());
                            }
                            jSONObject.putOpt("log_extra", wwa.uGS());
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wwa.ks()).floatValue();
                            if (floatValue <= 0.0f) {
                                floatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(floatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(wwa.GS()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.YoT.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl())) && CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(com.bytedance.sdk.openadsdk.VOe.YFl.YFl(wwa.tQ(), true), 2, wwa.zz());
                }
                if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str)) {
                    VOe.tN(wwa);
                }
            }
        });
    }

    public static void YFl(Wwa wwa, String str, String str2, final JSONObject jSONObject) {
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.14
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        if (jSONObject.has("duration")) {
                            jSONObject2.put("duration", jSONObject.get("duration"));
                        }
                    } catch (Exception e2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", e2.getMessage());
                    }
                    return jSONObject2;
                }
                return null;
            }
        });
        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str2)) {
            VOe.tN(wwa);
        }
    }

    public static void YFl(Wwa wwa, String str, final int i10, final long j3) {
        YFl(System.currentTimeMillis(), wwa, str, "video_choose", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.15
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("video_choose", i10);
                    jSONObject2.put("video_choose_duration", j3);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(th2.toString());
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(Wwa wwa, String str, final String str2, final long j3, final int i10, JSONObject jSONObject, final DSW dsw) {
        final JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.16
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                DSW dsw2;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j3);
                    jSONObject3.put("percent", i10);
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (dsw2 = dsw) != null) {
                        dsw2.YFl(jSONObject2);
                    }
                    jSONObject3.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void YFl(Wwa wwa, String str, String str2, final JSONObject jSONObject, final long j3) {
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.18
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                    jSONObject2.put("duration", j3);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(final Wwa wwa, String str, String str2, final Map<String, Object> map) {
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.19
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject2.put("dp_creative_type", wwa.Ja());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void YFl(long j3, Wwa wwa, String str, String str2) {
        YFl(j3, wwa, str, str2, (com.bytedance.sdk.openadsdk.pDU.tN.YFl) null);
    }

    @DungeonFlag
    public static void YFl(final long j3, final Wwa wwa, final String str, final String str2, final com.bytedance.sdk.openadsdk.pDU.tN.YFl yFl) {
        if (wwa == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || YFl(wwa.NW(), str2)) {
            return;
        }
        YFl(new com.bytedance.sdk.component.qsH.qsH(str2) { // from class: com.bytedance.sdk.openadsdk.AlY.tN.20
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl yFl2 = yFl;
                    if (yFl2 != null) {
                        jSONObject = yFl2.YFl();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.putOpt("log_extra", wwa.uGS());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(wwa.GS()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new YFl.C0099YFl(j3, wwa).Sg(str).tN(str2).wN(wwa.zz()).qsH(wwa.kYz()).YFl(wwa.Vmj()).YFl(jSONObject).DSW(wwa.ivp()).YFl((com.bytedance.sdk.openadsdk.AlY.Sg.YFl) null);
            }
        });
    }

    public static void YFl(Wwa wwa, final com.bytedance.sdk.openadsdk.pDU.YFl.YFl yFl, final String str) {
        YFl(System.currentTimeMillis(), wwa, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.24
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.tN());
                    jSONObject2.put("keyword", com.bytedance.sdk.openadsdk.pDU.YFl.YFl.this.lG());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th2) {
                    aIu.Sg("TTAD.AdEvent", "onWebBehaviorKeyword", th2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(final long j3, final Wwa wwa, String str) {
        if (wwa == null || !Wwa.tN(wwa) || wwa.HaH() == null) {
            return;
        }
        YFl(System.currentTimeMillis(), wwa, str, "endcard_close", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.29
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", Wwa.this.HaH().tN());
                    jSONObject2.putOpt("id", Wwa.this.HaH().YFl());
                    jSONObject2.putOpt("md5", Wwa.this.HaH().Sg());
                    if (Wwa.this.BPI() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(Wwa.this.BPI().f23467l));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    jSONObject.put("duration", j3);
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(Wwa wwa, String str, final String str2) {
        YFl(System.currentTimeMillis(), wwa, str, "show_error", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.30
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(Wwa wwa, String str, String str2, final long j3, final JSONObject jSONObject) {
        if (wwa == null || jSONObject == null) {
            return;
        }
        YFl(System.currentTimeMillis(), wwa, str, str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.31
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j3);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", e2.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(String str, long j3) {
        com.bytedance.sdk.openadsdk.core.DSW.tN.YFl(str, j3);
    }

    @DungeonFlag
    public static void YFl(final Wwa wwa, final String str, final String str2, final String str3, final long j3, final long j10, final JSONObject jSONObject, final boolean z10) {
        if (wwa == null || YFl(wwa.NW(), str3)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        YFl(new com.bytedance.sdk.component.qsH.qsH("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.AlY.tN.37
            @Override // java.lang.Runnable
            public void run() {
                JSONArray optJSONArray;
                String Vmj = wwa.Vmj();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String optString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(optString)) {
                            jSONObject2 = new JSONObject(optString);
                        }
                        if (!CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.wN(com.bytedance.sdk.openadsdk.core.lG.YFl()).toString());
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            if (z10) {
                                jSONObject2.put("click_scence", 1);
                            } else if (Ne.Sg(wwa)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (wwa.jqV()) {
                            try {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                }
                                optJSONObject.put("is_new_playable", 1);
                                jSONObject2.put("pag_json_data", optJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put("tag", str2);
                        int optInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z10 && optInt == 2) {
                            Vmj = jSONObject2.optString("app_log_url");
                        }
                        int i10 = 0;
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str3)) {
                            VOe.tN(wwa);
                            float floatValue = Double.valueOf((System.currentTimeMillis() / 1000) - Wwa.Sg(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (floatValue <= 0.0f) {
                                floatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(floatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.YoT.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()))) {
                                if (z10 && optInt == 2) {
                                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (optJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i10 < optJSONArray2.length()) {
                                            arrayList.add(optJSONArray2.optString(i10));
                                            i10++;
                                        }
                                        com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(com.bytedance.sdk.openadsdk.VOe.YFl.YFl(arrayList, true), 2, String.valueOf(j3));
                                    }
                                } else {
                                    Wwa wwa2 = wwa;
                                    if (wwa2 != null) {
                                        com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(com.bytedance.sdk.openadsdk.VOe.YFl.YFl(wwa2.tQ(), true), 2, wwa.zz());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.YoT.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl())) && z10 && optInt == 2 && (optJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i10 < optJSONArray.length()) {
                                arrayList2.add(optJSONArray.optString(i10));
                                i10++;
                            }
                            com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(com.bytedance.sdk.openadsdk.VOe.YFl.YFl(arrayList2, true), 1, String.valueOf(j3));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new YFl.C0099YFl(currentTimeMillis, wwa).AlY(str).Sg(str2).tN(str3).wN(String.valueOf(j3)).vc(String.valueOf(j10)).YFl(Vmj).YFl(jSONObject).qsH(wwa.kYz()).DSW(wwa.ivp()).YFl((com.bytedance.sdk.openadsdk.AlY.Sg.YFl) null);
            }
        });
    }

    public static void YFl(Wwa wwa, String str, final long j3, final JSONObject jSONObject) {
        YFl(System.currentTimeMillis(), wwa, "open_ad", str, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.38
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j10 = j3;
                    if (j10 != -1) {
                        jSONObject2.put("duration", j10);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    } else {
                        jSONObject2.put("ad_extra_data", new JSONObject().toString());
                    }
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", e2.getMessage());
                }
                return jSONObject2;
            }
        });
    }

    public static void YFl(final com.bytedance.sdk.component.qsH.qsH qsh) {
        if (qsh == null) {
            return;
        }
        if (mn.wN()) {
            com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.39
                @Override // java.lang.Runnable
                public void run() {
                    mn.Sg(com.bytedance.sdk.component.qsH.qsH.this, 10);
                }
            });
        } else if (!mn.vc()) {
            mn.Sg(qsh, 10);
        } else {
            qsh.run();
        }
    }

    public static void YFl(final com.bytedance.sdk.openadsdk.pDU.YFl.Sg sg2) {
        if (sg2 == null || sg2.Sg() == null) {
            return;
        }
        final Wwa Sg = sg2.Sg();
        final int ko = Sg.ko();
        if (ko == 2 || ko == 8 || (Sco.AlY(Sg) && Sg.YFl.AlY.equals(sg2.YFl()))) {
            YFl(System.currentTimeMillis(), Sg, sg2.tN(), "open_browser", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.40
                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                public JSONObject YFl() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int AlY = com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.AlY();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("count", Sco.pDU(com.bytedance.sdk.openadsdk.core.lG.YFl()));
                        jSONObject2.put("interceptor", AlY);
                        jSONObject2.put("success", com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.wN());
                        jSONObject2.put("link", com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.YFl());
                        jSONObject2.put("interaction_type", ko);
                        jSONObject2.put("real_interaction_type", com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.DSW());
                        if (com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.AlY() == 9) {
                            jSONObject2.put("is_act_signals_api_available", com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.qsH());
                            jSONObject2.put("is_act_signals_callback", com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.NjR());
                        }
                        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.vc())) {
                            jSONObject2.put("exception_msg", com.bytedance.sdk.openadsdk.pDU.YFl.Sg.this.vc());
                        }
                        if (AlY == 2 || AlY == 5) {
                            jSONObject2.put("meta", Sg.ni().toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (Exception e2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", e2.getMessage());
                    }
                    return jSONObject;
                }
            });
        }
    }

    public static void YFl(Wwa wwa, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        Sg(wwa, str, "open_ad_land_page_links", jSONObject);
    }

    public static void YFl(Wwa wwa, String str, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final int i10, final Map<String, Object> map) {
        YFl(System.currentTimeMillis(), wwa, str, "start_show_plb", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.41
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isSkip", z10);
                    jSONObject2.put("force", z11);
                    jSONObject2.put("isFromLandingPage", z12);
                    jSONObject2.put("finishing", z13);
                    jSONObject2.put("from", i10);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void YFl(final Wwa wwa, final boolean z10, String str, final String str2, final long j3, final String str3, final String str4, final int i10, final String str5) {
        YFl(System.currentTimeMillis(), wwa, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.tN.42
            /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|(2:5|(11:7|(9:42|11|(1:(1:(1:17))(2:29|(1:31)))(2:32|(2:34|(1:36))(2:37|(1:39)))|18|(1:20)|21|22|23|24)|10|11|(0)(0)|18|(0)|21|22|23|24)(11:43|(9:45|11|(0)(0)|18|(0)|21|22|23|24)|10|11|(0)(0)|18|(0)|21|22|23|24))(11:46|(9:48|11|(0)(0)|18|(0)|21|22|23|24)|10|11|(0)(0)|18|(0)|21|22|23|24)|49|50|51|52|22|23|24|(1:(1:53))) */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00ec A[Catch: all -> 0x00fe, TryCatch #2 {all -> 0x00fe, blocks: (B:3:0x000e, B:15:0x0052, B:17:0x005a, B:18:0x00cd, B:20:0x00ec, B:21:0x00f6, B:29:0x0070, B:31:0x0078, B:32:0x008e, B:34:0x0092, B:36:0x009a, B:37:0x00b0, B:39:0x00b8, B:40:0x0025, B:43:0x002f, B:46:0x0039), top: B:2:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x00fe, TryCatch #2 {all -> 0x00fe, blocks: (B:3:0x000e, B:15:0x0052, B:17:0x005a, B:18:0x00cd, B:20:0x00ec, B:21:0x00f6, B:29:0x0070, B:31:0x0078, B:32:0x008e, B:34:0x0092, B:36:0x009a, B:37:0x00b0, B:39:0x00b8, B:40:0x0025, B:43:0x002f, B:46:0x0039), top: B:2:0x000e }] */
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public org.json.JSONObject YFl() {
                /*
                    Method dump skipped, instructions count: 291
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.AlY.tN.AnonymousClass42.YFl():org.json.JSONObject");
            }
        });
    }

    private static boolean YFl(int i10, String str) {
        int Cfr;
        try {
            Set<String> pm = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().pm();
            if ((i10 == 1 && pm != null && pm.contains(str)) || (Cfr = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().Cfr(str)) == 0) {
                return true;
            }
            if (Cfr != 100) {
                return ((int) ((Math.random() * 100.0d) + 1.0d)) > Cfr;
            }
            return false;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdEvent", th2.getMessage());
            return false;
        }
    }
}
