package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.settings.EH;
import com.bytedance.sdk.openadsdk.core.settings.wN;
import com.bytedance.sdk.openadsdk.utils.VOe;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
public class GA extends EH {
    static final ArrayList<String> AlY = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    public boolean tN;
    private Set<String> wN;

    public GA(EH.YFl yFl) {
        super("tt_sdk_settings.prop", yFl);
        this.wN = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.wN
    public void YFl(JSONObject jSONObject) {
        int optInt;
        wN.YFl YFl = YFl();
        JSONObject wN = rkt.JwO().wN();
        JSONObject optJSONObject = jSONObject.optJSONObject("digest");
        this.tN = (optJSONObject == null || wN == null || !optJSONObject.toString().equals(wN.toString())) ? false : true;
        if (optJSONObject != null) {
            YFl.YFl("digest", optJSONObject.toString());
        } else {
            YFl.YFl("digest");
        }
        YFl.YFl("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long optLong = jSONObject.optLong("req_inter_min", 10L) * 60 * 1000;
            if (optLong < 0 || optLong > j.TWENTY_FOUR_HOURS_MILLIS) {
                optLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            YFl.YFl("req_inter_min", optLong);
        }
        if (jSONObject.has("lp_new_style")) {
            YFl.YFl("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int optInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (optInt2 < 0 || optInt2 > 100) {
                optInt2 = 30;
            }
            YFl.YFl("blank_detect_rate", optInt2);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject2 != null) {
            if (optJSONObject2.has("duration")) {
                YFl.YFl("duration", optJSONObject2.optLong("duration") * 1000);
            }
            if (optJSONObject2.has(AppLovinMediationProvider.MAX)) {
                YFl.YFl(AppLovinMediationProvider.MAX, optJSONObject2.optInt(AppLovinMediationProvider.MAX));
            }
        }
        if (jSONObject.has("vbtt")) {
            YFl.YFl("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("abtest");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("version")) {
                YFl.YFl("ab_test_version", optJSONObject3.optString("version"));
            }
            if (optJSONObject3.has("param")) {
                YFl.YFl("ab_test_param", optJSONObject3.optString("param"));
            }
        } else {
            rkt.JwO().DSW();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject4 != null && optJSONObject4.has("global_rate")) {
            YFl.YFl("global_rate", (float) optJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            YFl.YFl("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            YFl.YFl("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            YFl.YFl("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("app_log_url")) {
            YFl.YFl("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("coppa")) {
            int optInt3 = jSONObject.optInt("coppa", -99);
            com.bytedance.sdk.openadsdk.core.NjR.Sg().AlY(optInt3);
            YFl.YFl("coppa", optInt3);
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            YFl.YFl("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            YFl.YFl("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            YFl.YFl("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            YFl.YFl("dc", jSONObject.optString("dc"));
        }
        rkt.JwO().YFl(jSONObject, YFl);
        rkt.JwO().Sg(jSONObject, YFl);
        if (jSONObject.has("if_both_open")) {
            YFl.YFl("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            YFl.YFl("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            YFl.YFl("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            YFl.YFl("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject5 != null) {
            if (optJSONObject5.has("force_language")) {
                String optString = optJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(optString) && AlY.contains(optString)) {
                    YFl.YFl("force_language", optString);
                }
            }
            if (optJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                YFl.YFl("fetch_tpl_timeout_ctrl", optJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (optJSONObject5.has("fetch_tpl_second")) {
                YFl.YFl("fetch_tpl_second", optJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (optJSONObject5.has("support_gzip")) {
                YFl.YFl("support_gzip", optJSONObject5.optBoolean("support_gzip", false));
            }
            if (optJSONObject5.has("aes_key")) {
                YFl.YFl("aes_key", optJSONObject5.optString("aes_key"));
            }
            if (optJSONObject5.has("support_rtl")) {
                YFl.YFl("support_rtl", optJSONObject5.optBoolean("support_rtl", false));
            }
            if (optJSONObject5.has("ad_revenue_enable")) {
                YFl.YFl("ad_revenue_enable", optJSONObject5.optBoolean("ad_revenue_enable", false));
            }
            if (optJSONObject5.has("gecko_hosts")) {
                try {
                    this.wN.clear();
                    JSONArray optJSONArray = optJSONObject5.optJSONArray("gecko_hosts");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            this.wN.add(optJSONArray.getString(i10));
                        }
                    }
                    this.wN = YFl(this.wN);
                    YFl.YFl("gecko_hosts", optJSONArray.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.Sg("GeckoLog: settings json error ".concat(String.valueOf(th2)));
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            YFl.YFl("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        tN.YFl(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            if (optJSONObject6.has("ad_enable")) {
                YFl.YFl("privacy_ad_enable", optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("personalized_ad")) {
                YFl.YFl("privacy_personalized_ad", optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("sladar_enable")) {
                YFl.YFl("privacy_sladar_enable", optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("app_log_enable")) {
                YFl.YFl("privacy_app_log_enable", optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("debug_unlock")) {
                YFl.YFl("privacy_debug_unlock", optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (optJSONObject6.has("fields_allowed")) {
                String optString2 = optJSONObject6.optString("fields_allowed", "");
                if (!TextUtils.isEmpty(optString2)) {
                    YFl.YFl("privacy_fields_allowed", optString2);
                } else {
                    YFl.YFl("privacy_fields_allowed");
                }
            }
        }
        if (jSONObject.has("video_cache_config")) {
            YFl.YFl("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int optInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (optInt4 != 0 && optInt4 != 1) {
                optInt4 = 0;
            }
            YFl.YFl("loadedCallbackOpportunity", optInt4);
        }
        if (jSONObject.has("load_strategy")) {
            int optInt5 = jSONObject.optInt("load_strategy", 0);
            if (optInt5 != 0 && optInt5 != 1) {
                optInt5 = 0;
            }
            YFl.YFl("load_callback_strategy", optInt5);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int optInt6 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (optInt6 < 0 || optInt6 > 3) {
                optInt6 = 0;
            }
            YFl.YFl("splash_video_load_strategy", optInt6);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            YFl.YFl("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (optJSONObject7 != null) {
            if (optJSONObject7.has("bus_con_send_log_type")) {
                YFl.YFl("bus_con_send_log_type", optJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (optJSONObject7.has("bus_con_sec_type")) {
                YFl.YFl("bus_con_sec_type", optJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (optJSONObject7.has("bus_con_dislike_report_raw")) {
                YFl.YFl("bus_con_dislike_report_raw", optJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (optJSONObject7.has("bus_con_adshow_check_enable")) {
                YFl.YFl("bus_con_adshow_check_enable", optJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (optJSONObject7.has("bus_con_tnc_interval")) {
                YFl.YFl("bus_con_tnc_interval", optJSONObject7.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (optJSONObject7.has("bus_con_token_thread_count")) {
                YFl.YFl("bus_con_token_thread_count", optJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (optJSONObject7.has("bus_con_video_keep_screen_on")) {
                YFl.YFl("bus_con_video_keep_screen_on", optJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (optJSONObject7.has("bus_con_auto_click_delay")) {
                YFl.YFl("bus_con_auto_click_delay", optJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (optJSONObject7.has("bus_con_express_host")) {
                YFl.YFl("bus_con_express_host", optJSONObject7.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
            }
            if (optJSONObject7.has("bus_con_rewardedfull_link")) {
                YFl.YFl("bus_con_rewardedfull_link", optJSONObject7.optInt("bus_con_rewardedfull_link", 0));
            }
            if (optJSONObject7.has("bus_con_check_clz")) {
                YFl.YFl("bus_con_check_clz", optJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (optJSONObject7.has("bus_con_url_check")) {
                YFl.YFl("bus_con_url_check", optJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (optJSONObject7.has("bus_con_behavior_count")) {
                YFl.YFl("bus_con_behavior_count", optJSONObject7.optInt("bus_con_behavior_count", 300));
            }
            String str = rkt.YFl;
            if (optJSONObject7.has(str)) {
                YFl.YFl(str, optJSONObject7.optBoolean(str, false));
            }
            String str2 = rkt.Sg;
            if (optJSONObject7.has(str2)) {
                YFl.YFl(str2, optJSONObject7.optInt(str2, 10000));
            }
            String str3 = rkt.tN;
            if (optJSONObject7.has(str3)) {
                YFl.YFl(str3, (float) optJSONObject7.optDouble(str3, 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (optJSONObject8 != null) {
                    if (optJSONObject8.has("perf_con_stats_rate")) {
                        String optString3 = optJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(optString3)) {
                            YFl.YFl("perf_con_stats_rate", optString3);
                        }
                    }
                    if (optJSONObject8.has("perf_con_applog_send")) {
                        String optString4 = optJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(optString4)) {
                            YFl.YFl("perf_con_applog_send", optString4);
                        }
                    }
                    if (optJSONObject8.has("perf_con_apm_native")) {
                        YFl.YFl("perf_con_apm_native", optJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache")) {
                        YFl.YFl("perf_con_webview_preload_cache", optJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        YFl.YFl("perf_con_webview_preload_cache_v3", optJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count")) {
                        YFl.YFl("perf_con_webview_cache_count", optJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        YFl.YFl("perf_con_webview_cache_count_v3", optJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_stack_size") && (optInt = optJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && optInt <= 0) {
                        YFl.YFl("perf_con_thread_stack_size", optInt);
                    }
                    if (optJSONObject8.has("perf_con_use_new_thread_pool")) {
                        YFl.YFl("perf_con_use_new_thread_pool", optJSONObject8.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_pool_config")) {
                        String optString5 = optJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(optString5)) {
                            YFl.YFl("perf_con_thread_pool_config", optString5);
                        }
                    }
                    if (optJSONObject8.has("perf_con_is_new_net_thread")) {
                        YFl.YFl("perf_con_is_new_net_thread", optJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (optJSONObject8.has("perf_con_use_prop")) {
                        VOe.YFl(optJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (optJSONObject8.has("perf_con_adlog_expire_time")) {
                        YFl.YFl("perf_con_adlog_expire_time", optJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        YFl.YFl("perf_con_adlog_turn_off_retry_ad", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        YFl.YFl("perf_con_adlog_turn_off_retry_stats", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (optJSONObject8.has("perf_con_applog_rate")) {
                        YFl.YFl("perf_con_applog_rate", optJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (optJSONObject8.has("perf_con_track_url_strategy")) {
                        YFl.YFl("perf_con_track_url_strategy", optJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (optJSONObject8.has("perf_con_drawable_code")) {
                        YFl.YFl("perf_con_drawable_code", optJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (optJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        YFl.YFl("perf_con_close_button_delay_check_time", optJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (optJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        YFl.YFl("perf_con_drop2rt_skip_label_list", optJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4_get_ad")) {
                        YFl.YFl("perf_con_crypt_V4_get_ad", optJSONObject8.optBoolean("perf_con_crypt_V4_get_ad", false));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4_applog")) {
                        YFl.YFl("perf_con_crypt_V4_applog", optJSONObject8.optBoolean("perf_con_crypt_V4_applog", false));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4")) {
                        YFl.YFl("perf_con_crypt_V4", optJSONObject8.optBoolean("perf_con_crypt_V4", false));
                    }
                }
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.YoT.YFl("SettingsDefaultRepository", th3.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", optJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("SettingsDefaultRepository", "coreSettingJson", e2.getMessage());
        }
        YFl.YFl("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            YFl.YFl("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        YFl.YFl();
        rkt.JwO().Cfr();
        AlY();
    }

    public static Set<String> YFl(Set<String> set) {
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
