package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.settings.jU;
import com.bytedance.sdk.openadsdk.core.settings.rV;
import com.bytedance.sdk.openadsdk.utils.ot;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.vungle.ads.internal.signals.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vDp extends rV {
    static final ArrayList<String> jU = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> COT;
    public boolean KS;

    public vDp(rV.zp zpVar) {
        super("tt_sdk_settings.prop", zpVar);
        this.COT = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jU
    public void zp(JSONObject jSONObject) {
        int optInt;
        jU.zp zp = zp();
        JSONObject COT = dQp.etV().COT();
        JSONObject optJSONObject = jSONObject.optJSONObject("digest");
        this.KS = (optJSONObject == null || COT == null || !optJSONObject.toString().equals(COT.toString())) ? false : true;
        if (optJSONObject != null) {
            zp.zp("digest", optJSONObject.toString());
        } else {
            zp.zp("digest");
        }
        zp.zp("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long optLong = jSONObject.optLong("req_inter_min", 10L) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            if (optLong < 0 || optLong > j.TWENTY_FOUR_HOURS_MILLIS) {
                optLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            zp.zp("req_inter_min", optLong);
        }
        if (jSONObject.has("lp_new_style")) {
            zp.zp("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int optInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (optInt2 < 0 || optInt2 > 100) {
                optInt2 = 30;
            }
            zp.zp("blank_detect_rate", optInt2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject2 != null) {
            if (optJSONObject2.has("duration")) {
                zp.zp("duration", optJSONObject2.optLong("duration") * 1000);
            }
            if (optJSONObject2.has(AppLovinMediationProvider.MAX)) {
                zp.zp(AppLovinMediationProvider.MAX, optJSONObject2.optInt(AppLovinMediationProvider.MAX));
            }
        }
        if (jSONObject.has("vbtt")) {
            zp.zp("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("abtest");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("version")) {
                zp.zp("ab_test_version", optJSONObject3.optString("version"));
            }
            if (optJSONObject3.has("param")) {
                zp.zp("ab_test_param", optJSONObject3.optString("param"));
            }
        } else {
            dQp.etV().QR();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject4 != null && optJSONObject4.has("global_rate")) {
            zp.zp("global_rate", (float) optJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            zp.zp("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            zp.zp("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            zp.zp("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("app_log_url")) {
            zp.zp("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("apm_url")) {
            zp.zp("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("coppa")) {
            int optInt3 = jSONObject.optInt("coppa", -99);
            com.bytedance.sdk.openadsdk.core.ku.lMd().jU(optInt3);
            zp.zp("coppa", optInt3);
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            zp.zp("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            zp.zp("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            zp.zp("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            zp.zp("dc", jSONObject.optString("dc"));
        }
        dQp.etV().zp(jSONObject, zp);
        dQp.etV().lMd(jSONObject, zp);
        if (jSONObject.has("if_both_open")) {
            zp.zp("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            zp.zp("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            zp.zp("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            zp.zp("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject5 != null) {
            if (optJSONObject5.has("force_language")) {
                String optString = optJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(optString) && jU.contains(optString)) {
                    zp.zp("force_language", optString);
                }
            }
            if (optJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                zp.zp("fetch_tpl_timeout_ctrl", optJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (optJSONObject5.has("fetch_tpl_second")) {
                zp.zp("fetch_tpl_second", optJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (optJSONObject5.has("disable_rotate_banner_on_dislike")) {
                zp.zp("disable_rotate_banner_on_dislike", optJSONObject5.optInt("disable_rotate_banner_on_dislike", Integer.MAX_VALUE));
            }
            if (optJSONObject5.has("support_gzip")) {
                zp.zp("support_gzip", optJSONObject5.optBoolean("support_gzip", false));
            }
            if (optJSONObject5.has("aes_key")) {
                zp.zp("aes_key", optJSONObject5.optString("aes_key"));
            }
            if (optJSONObject5.has("support_rtl")) {
                zp.zp("support_rtl", optJSONObject5.optBoolean("support_rtl", false));
            }
            if (optJSONObject5.has("ad_revenue_enable")) {
                zp.zp("ad_revenue_enable", optJSONObject5.optBoolean("ad_revenue_enable", false));
            }
            if (optJSONObject5.has("gecko_hosts")) {
                try {
                    this.COT.clear();
                    JSONArray optJSONArray = optJSONObject5.optJSONArray("gecko_hosts");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                            this.COT.add(optJSONArray.getString(i9));
                        }
                    }
                    this.COT = zp(this.COT);
                    zp.zp("gecko_hosts", optJSONArray.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.lMd("GeckoLog: settings json error ".concat(String.valueOf(th)));
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            zp.zp("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        lMd.zp(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            if (optJSONObject6.has("ad_enable")) {
                zp.zp("privacy_ad_enable", optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("personalized_ad")) {
                zp.zp("privacy_personalized_ad", optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("sladar_enable")) {
                zp.zp("privacy_sladar_enable", optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("app_log_enable")) {
                zp.zp("privacy_app_log_enable", optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("debug_unlock")) {
                zp.zp("privacy_debug_unlock", optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("fields_allowed")) {
                String optString2 = optJSONObject6.optString("fields_allowed", "");
                if (!TextUtils.isEmpty(optString2)) {
                    zp.zp("privacy_fields_allowed", optString2);
                } else {
                    zp.zp("privacy_fields_allowed");
                }
            }
        }
        if (jSONObject.has("video_cache_config")) {
            zp.zp("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int optInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (optInt4 != 0 && optInt4 != 1) {
                optInt4 = 0;
            }
            zp.zp("loadedCallbackOpportunity", optInt4);
        }
        if (jSONObject.has("load_strategy")) {
            int optInt5 = jSONObject.optInt("load_strategy", 0);
            if (optInt5 != 0 && optInt5 != 1) {
                optInt5 = 0;
            }
            zp.zp("load_callback_strategy", optInt5);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int optInt6 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (optInt6 < 0 || optInt6 > 3) {
                optInt6 = 0;
            }
            zp.zp("splash_video_load_strategy", optInt6);
        }
        if (jSONObject.has("support_mem_dynamic")) {
            int optInt7 = jSONObject.optInt("support_mem_dynamic", 0);
            if (optInt7 != 0 && optInt7 != 1) {
                optInt7 = 0;
            }
            zp.zp("support_mem_dynamic", optInt7);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            zp.zp("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (optJSONObject7 != null) {
            if (optJSONObject7.has("bus_con_send_log_type")) {
                zp.zp("bus_con_send_log_type", optJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (optJSONObject7.has("bus_con_sec_type")) {
                zp.zp("bus_con_sec_type", optJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (optJSONObject7.has("bus_con_dislike_report_raw")) {
                zp.zp("bus_con_dislike_report_raw", optJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (optJSONObject7.has("bus_con_adshow_check_enable")) {
                zp.zp("bus_con_adshow_check_enable", optJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (optJSONObject7.has("bus_con_tnc_interval")) {
                zp.zp("bus_con_tnc_interval", optJSONObject7.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (optJSONObject7.has("bus_con_token_thread_count")) {
                zp.zp("bus_con_token_thread_count", optJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (optJSONObject7.has("bus_con_video_keep_screen_on")) {
                zp.zp("bus_con_video_keep_screen_on", optJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (optJSONObject7.has("bus_con_auto_click_delay")) {
                zp.zp("bus_con_auto_click_delay", optJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (optJSONObject7.has("bus_con_express_host")) {
                zp.zp("bus_con_express_host", optJSONObject7.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
            }
            if (optJSONObject7.has("bus_con_check_clz")) {
                zp.zp("bus_con_check_clz", optJSONObject7.optString("bus_con_check_clz", ""));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (optJSONObject8 != null) {
                    if (optJSONObject8.has("perf_con_stats_rate")) {
                        String optString3 = optJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(optString3)) {
                            zp.zp("perf_con_stats_rate", optString3);
                        }
                    }
                    if (optJSONObject8.has("perf_con_applog_send")) {
                        String optString4 = optJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(optString4)) {
                            zp.zp("perf_con_applog_send", optString4);
                        }
                    }
                    if (optJSONObject8.has("perf_con_apm_native")) {
                        zp.zp("perf_con_apm_native", optJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache")) {
                        zp.zp("perf_con_webview_preload_cache", optJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        zp.zp("perf_con_webview_preload_cache_v3", optJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count")) {
                        zp.zp("perf_con_webview_cache_count", optJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        zp.zp("perf_con_webview_cache_count_v3", optJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_stack_size") && (optInt = optJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && optInt <= 0) {
                        zp.zp("perf_con_thread_stack_size", optInt);
                    }
                    if (optJSONObject8.has("perf_con_apm")) {
                        zp.zp("perf_con_apm", optJSONObject8.optInt("perf_con_apm"));
                    }
                    if (optJSONObject8.has("perf_con_use_new_thread_pool")) {
                        zp.zp("perf_con_use_new_thread_pool", optJSONObject8.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_pool_config")) {
                        String optString5 = optJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(optString5)) {
                            zp.zp("perf_con_thread_pool_config", optString5);
                        }
                    }
                    if (optJSONObject8.has("perf_con_is_new_net_thread")) {
                        zp.zp("perf_con_is_new_net_thread", optJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (optJSONObject8.has("perf_con_use_prop")) {
                        ot.zp(optJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (optJSONObject8.has("perf_con_adlog_expire_time")) {
                        zp.zp("perf_con_adlog_expire_time", optJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        zp.zp("perf_con_adlog_turn_off_retry_ad", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        zp.zp("perf_con_adlog_turn_off_retry_stats", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (optJSONObject8.has("perf_con_applog_rate")) {
                        zp.zp("perf_con_applog_rate", optJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (optJSONObject8.has("perf_con_track_url_strategy")) {
                        zp.zp("perf_con_track_url_strategy", optJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (optJSONObject8.has("perf_con_drawable_code")) {
                        zp.zp("perf_con_drawable_code", optJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (optJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        zp.zp("perf_con_close_button_delay_check_time", optJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.tG.zp("SettingsDefaultRepository", th2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", optJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("SettingsDefaultRepository", "coreSettingJson", e4.getMessage());
        }
        zp.zp("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            zp.zp("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        zp.zp();
        dQp.etV().cW();
    }

    public static Set<String> zp(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
