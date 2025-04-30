package com.applovin.impl;

import com.applovin.impl.uj;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class qe extends oj {

    /* renamed from: A7, reason: collision with root package name */
    public static final oj f10288A7;

    /* renamed from: B7, reason: collision with root package name */
    public static final oj f10289B7;

    /* renamed from: C7, reason: collision with root package name */
    public static final oj f10290C7;

    /* renamed from: D7, reason: collision with root package name */
    public static final oj f10291D7;

    /* renamed from: E7, reason: collision with root package name */
    public static final oj f10292E7;

    /* renamed from: F7, reason: collision with root package name */
    public static final oj f10293F7;

    /* renamed from: G6, reason: collision with root package name */
    public static final oj f10294G6 = oj.a("afi", "");

    /* renamed from: G7, reason: collision with root package name */
    public static final oj f10295G7;

    /* renamed from: H6, reason: collision with root package name */
    public static final oj f10296H6;

    /* renamed from: H7, reason: collision with root package name */
    public static final oj f10297H7;

    /* renamed from: I6, reason: collision with root package name */
    public static final oj f10298I6;
    public static final oj I7;

    /* renamed from: J6, reason: collision with root package name */
    public static final oj f10299J6;

    /* renamed from: J7, reason: collision with root package name */
    public static final oj f10300J7;

    /* renamed from: K6, reason: collision with root package name */
    public static final oj f10301K6;

    /* renamed from: K7, reason: collision with root package name */
    public static final oj f10302K7;

    /* renamed from: L6, reason: collision with root package name */
    public static final oj f10303L6;

    /* renamed from: L7, reason: collision with root package name */
    public static final oj f10304L7;

    /* renamed from: M6, reason: collision with root package name */
    public static final oj f10305M6;

    /* renamed from: M7, reason: collision with root package name */
    public static final oj f10306M7;

    /* renamed from: N6, reason: collision with root package name */
    public static final oj f10307N6;

    /* renamed from: N7, reason: collision with root package name */
    public static final oj f10308N7;

    /* renamed from: O6, reason: collision with root package name */
    public static final oj f10309O6;

    /* renamed from: O7, reason: collision with root package name */
    public static final oj f10310O7;

    /* renamed from: P6, reason: collision with root package name */
    public static final oj f10311P6;

    /* renamed from: P7, reason: collision with root package name */
    public static final oj f10312P7;

    /* renamed from: Q6, reason: collision with root package name */
    public static final oj f10313Q6;

    /* renamed from: R6, reason: collision with root package name */
    public static final oj f10314R6;

    /* renamed from: S6, reason: collision with root package name */
    public static final oj f10315S6;

    /* renamed from: T6, reason: collision with root package name */
    public static final oj f10316T6;

    /* renamed from: U6, reason: collision with root package name */
    public static final oj f10317U6;

    /* renamed from: V6, reason: collision with root package name */
    public static final oj f10318V6;

    /* renamed from: W6, reason: collision with root package name */
    public static final oj f10319W6;

    /* renamed from: X6, reason: collision with root package name */
    public static final oj f10320X6;

    /* renamed from: Y6, reason: collision with root package name */
    public static final oj f10321Y6;

    /* renamed from: Z6, reason: collision with root package name */
    public static final oj f10322Z6;

    /* renamed from: a7, reason: collision with root package name */
    public static final oj f10323a7;

    /* renamed from: b7, reason: collision with root package name */
    public static final oj f10324b7;

    /* renamed from: c7, reason: collision with root package name */
    public static final oj f10325c7;

    /* renamed from: d7, reason: collision with root package name */
    public static final oj f10326d7;

    /* renamed from: e7, reason: collision with root package name */
    public static final oj f10327e7;

    /* renamed from: f7, reason: collision with root package name */
    public static final oj f10328f7;

    /* renamed from: g7, reason: collision with root package name */
    public static final oj f10329g7;

    /* renamed from: h7, reason: collision with root package name */
    public static final oj f10330h7;

    /* renamed from: i7, reason: collision with root package name */
    public static final oj f10331i7;
    public static final oj j7;
    public static final oj k7;
    public static final oj l7;
    public static final oj m7;

    /* renamed from: n7, reason: collision with root package name */
    public static final oj f10332n7;

    /* renamed from: o7, reason: collision with root package name */
    public static final oj f10333o7;
    public static final oj p7;

    /* renamed from: q7, reason: collision with root package name */
    public static final oj f10334q7;

    /* renamed from: r7, reason: collision with root package name */
    public static final oj f10335r7;

    /* renamed from: s7, reason: collision with root package name */
    public static final oj f10336s7;

    /* renamed from: t7, reason: collision with root package name */
    public static final oj f10337t7;

    /* renamed from: u7, reason: collision with root package name */
    public static final oj f10338u7;

    /* renamed from: v7, reason: collision with root package name */
    public static final oj f10339v7;

    /* renamed from: w7, reason: collision with root package name */
    public static final oj f10340w7;

    /* renamed from: x7, reason: collision with root package name */
    public static final oj f10341x7;

    /* renamed from: y7, reason: collision with root package name */
    public static final oj f10342y7;

    /* renamed from: z7, reason: collision with root package name */
    public static final oj f10343z7;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10296H6 = L.d("afi_ms", 5L, timeUnit);
        f10298I6 = oj.a("mediation_endpoint", "https://ms.applovin.com/");
        f10299J6 = oj.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f10301K6 = L.d("fetch_next_ad_retry_delay_ms", 2L, timeUnit);
        f10303L6 = L.d("fetch_next_ad_timeout_ms", 30L, timeUnit);
        f10305M6 = L.d("fetch_mediation_debugger_info_timeout_ms", 7L, timeUnit);
        Boolean bool = Boolean.TRUE;
        f10307N6 = oj.a("auto_init_mediation_debugger", bool);
        f10309O6 = oj.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        f10311P6 = L.d("max_signal_provider_latency_ms", 30L, timeUnit);
        Boolean bool2 = Boolean.FALSE;
        f10313Q6 = oj.a("fix_signal_collection_timeout_signal_providers_count", bool2);
        f10314R6 = L.d("default_adapter_timeout_ms", 10L, timeUnit);
        f10315S6 = L.d("ad_refresh_ms", 30L, timeUnit);
        f10316T6 = L.d("ad_load_failure_refresh_ms", 30L, timeUnit);
        f10317U6 = oj.a("ad_load_failure_refresh_ignore_error_codes", "204");
        f10318V6 = oj.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        f10319W6 = oj.a("refresh_ad_view_timer_responds_to_background", bool);
        f10320X6 = oj.a("refresh_ad_view_timer_responds_to_store_kit", bool);
        f10321Y6 = oj.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        f10322Z6 = oj.a("avrsponse", bool2);
        f10323a7 = oj.a("allow_pause_auto_refresh_immediately", bool2);
        f10324b7 = oj.a("fullscreen_display_delay_ms", 0L);
        f10325c7 = oj.a("susaode", bool2);
        f10326d7 = oj.a("ahdm", 500L);
        f10327e7 = oj.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        f10328f7 = oj.a("ad_view_refresh_precache_request_enabled", bool);
        f10329g7 = oj.a("fabsiaif", bool2);
        f10330h7 = oj.a("famttl_ms", 0L);
        f10331i7 = oj.a("signal_expiration_ms", -1L);
        j7 = oj.a("signal_cache_level", Integer.valueOf(uj.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        k7 = L.d("ad_expiration_ms", 4L, timeUnit2);
        l7 = L.d("native_ad_expiration_ms", 4L, timeUnit2);
        m7 = oj.a("rena", bool);
        f10332n7 = oj.a("fullscreen_ad_displayed_timeout_ms", -1L);
        f10333o7 = oj.a("freast_ms", -1L);
        p7 = oj.a("ad_hidden_timeout_ms", -1L);
        f10334q7 = oj.a("schedule_ad_hidden_on_ad_dismiss", bool2);
        f10335r7 = oj.a("schedule_ad_hidden_on_single_task_app_relaunch", bool2);
        f10336s7 = L.d("ad_hidden_on_ad_dismiss_callback_delay_ms", 1L, timeUnit);
        f10337t7 = oj.a("proe", bool2);
        f10338u7 = oj.a("mute_state", 2);
        f10339v7 = oj.a("saf", "");
        f10340w7 = oj.a("saui", "");
        f10341x7 = oj.a("mra", -1);
        f10342y7 = oj.a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        f10343z7 = oj.a("svadfr", bool2);
        f10288A7 = oj.a("fadiafase", bool);
        f10289B7 = oj.a("fadwvcv", bool);
        f10290C7 = oj.a("bfarud", bool2);
        f10291D7 = oj.a("inacc", Boolean.valueOf(zp.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        f10292E7 = oj.a("pbataipaf", "");
        f10293F7 = L.d("bwt_ms", 30L, timeUnit);
        f10295G7 = L.d("twt_ms", 30L, timeUnit);
        f10297H7 = oj.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        I7 = oj.a("ssasiimp", bool2);
        f10300J7 = oj.a("faomq", bool2);
        f10302K7 = oj.a("sppdater", bool2);
        f10304L7 = oj.a("siflcfbt", bool2);
        f10306M7 = oj.a("uabta", bool2);
        f10308N7 = oj.a("fetch_mediated_ad_gzip", bool);
        f10310O7 = oj.a("max_postback_gzip", bool);
        f10312P7 = oj.a("remove_ad_view_before_destroy", bool);
    }
}
