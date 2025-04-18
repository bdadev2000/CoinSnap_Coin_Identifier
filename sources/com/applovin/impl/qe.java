package com.applovin.impl;

import com.applovin.impl.uj;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class qe extends oj {
    public static final oj A7;
    public static final oj B7;
    public static final oj C7;
    public static final oj D7;
    public static final oj E7;
    public static final oj F7;
    public static final oj G6 = oj.a("afi", "");
    public static final oj G7;
    public static final oj H6;
    public static final oj H7;
    public static final oj I6;
    public static final oj I7;
    public static final oj J6;
    public static final oj J7;
    public static final oj K6;
    public static final oj K7;
    public static final oj L6;
    public static final oj L7;
    public static final oj M6;
    public static final oj M7;
    public static final oj N6;
    public static final oj N7;
    public static final oj O6;
    public static final oj O7;
    public static final oj P6;
    public static final oj P7;
    public static final oj Q6;
    public static final oj R6;
    public static final oj S6;
    public static final oj T6;
    public static final oj U6;
    public static final oj V6;
    public static final oj W6;
    public static final oj X6;
    public static final oj Y6;
    public static final oj Z6;

    /* renamed from: a7, reason: collision with root package name */
    public static final oj f7189a7;

    /* renamed from: b7, reason: collision with root package name */
    public static final oj f7190b7;

    /* renamed from: c7, reason: collision with root package name */
    public static final oj f7191c7;

    /* renamed from: d7, reason: collision with root package name */
    public static final oj f7192d7;

    /* renamed from: e7, reason: collision with root package name */
    public static final oj f7193e7;

    /* renamed from: f7, reason: collision with root package name */
    public static final oj f7194f7;

    /* renamed from: g7, reason: collision with root package name */
    public static final oj f7195g7;

    /* renamed from: h7, reason: collision with root package name */
    public static final oj f7196h7;

    /* renamed from: i7, reason: collision with root package name */
    public static final oj f7197i7;

    /* renamed from: j7, reason: collision with root package name */
    public static final oj f7198j7;

    /* renamed from: k7, reason: collision with root package name */
    public static final oj f7199k7;

    /* renamed from: l7, reason: collision with root package name */
    public static final oj f7200l7;

    /* renamed from: m7, reason: collision with root package name */
    public static final oj f7201m7;

    /* renamed from: n7, reason: collision with root package name */
    public static final oj f7202n7;

    /* renamed from: o7, reason: collision with root package name */
    public static final oj f7203o7;

    /* renamed from: p7, reason: collision with root package name */
    public static final oj f7204p7;

    /* renamed from: q7, reason: collision with root package name */
    public static final oj f7205q7;

    /* renamed from: r7, reason: collision with root package name */
    public static final oj f7206r7;

    /* renamed from: s7, reason: collision with root package name */
    public static final oj f7207s7;

    /* renamed from: t7, reason: collision with root package name */
    public static final oj f7208t7;

    /* renamed from: u7, reason: collision with root package name */
    public static final oj f7209u7;

    /* renamed from: v7, reason: collision with root package name */
    public static final oj f7210v7;

    /* renamed from: w7, reason: collision with root package name */
    public static final oj f7211w7;

    /* renamed from: x7, reason: collision with root package name */
    public static final oj f7212x7;

    /* renamed from: y7, reason: collision with root package name */
    public static final oj f7213y7;

    /* renamed from: z7, reason: collision with root package name */
    public static final oj f7214z7;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        H6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 5L, "afi_ms");
        I6 = oj.a("mediation_endpoint", "https://ms.applovin.com/");
        J6 = oj.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        K6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 2L, "fetch_next_ad_retry_delay_ms");
        L6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 30L, "fetch_next_ad_timeout_ms");
        M6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 7L, "fetch_mediation_debugger_info_timeout_ms");
        Boolean bool = Boolean.TRUE;
        N6 = oj.a("auto_init_mediation_debugger", bool);
        O6 = oj.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        P6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 30L, "max_signal_provider_latency_ms");
        Boolean bool2 = Boolean.FALSE;
        Q6 = oj.a("fix_signal_collection_timeout_signal_providers_count", bool2);
        R6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 10L, "default_adapter_timeout_ms");
        S6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 30L, "ad_refresh_ms");
        T6 = com.applovin.impl.mediation.ads.e.b(timeUnit, 30L, "ad_load_failure_refresh_ms");
        U6 = oj.a("ad_load_failure_refresh_ignore_error_codes", "204");
        V6 = oj.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        W6 = oj.a("refresh_ad_view_timer_responds_to_background", bool);
        X6 = oj.a("refresh_ad_view_timer_responds_to_store_kit", bool);
        Y6 = oj.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        Z6 = oj.a("avrsponse", bool2);
        f7189a7 = oj.a("allow_pause_auto_refresh_immediately", bool2);
        f7190b7 = oj.a("fullscreen_display_delay_ms", 0L);
        f7191c7 = oj.a("susaode", bool2);
        f7192d7 = oj.a("ahdm", 500L);
        f7193e7 = oj.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        f7194f7 = oj.a("ad_view_refresh_precache_request_enabled", bool);
        f7195g7 = oj.a("fabsiaif", bool2);
        f7196h7 = oj.a("famttl_ms", 0L);
        f7197i7 = oj.a("signal_expiration_ms", -1L);
        f7198j7 = oj.a("signal_cache_level", Integer.valueOf(uj.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        f7199k7 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 4L, "ad_expiration_ms");
        f7200l7 = com.applovin.impl.mediation.ads.e.b(timeUnit2, 4L, "native_ad_expiration_ms");
        f7201m7 = oj.a("rena", bool);
        f7202n7 = oj.a("fullscreen_ad_displayed_timeout_ms", -1L);
        f7203o7 = oj.a("freast_ms", -1L);
        f7204p7 = oj.a("ad_hidden_timeout_ms", -1L);
        f7205q7 = oj.a("schedule_ad_hidden_on_ad_dismiss", bool2);
        f7206r7 = oj.a("schedule_ad_hidden_on_single_task_app_relaunch", bool2);
        f7207s7 = com.applovin.impl.mediation.ads.e.b(timeUnit, 1L, "ad_hidden_on_ad_dismiss_callback_delay_ms");
        f7208t7 = oj.a("proe", bool2);
        f7209u7 = oj.a("mute_state", 2);
        f7210v7 = oj.a("saf", "");
        f7211w7 = oj.a("saui", "");
        f7212x7 = oj.a("mra", -1);
        f7213y7 = oj.a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        f7214z7 = oj.a("svadfr", bool2);
        A7 = oj.a("fadiafase", bool);
        B7 = oj.a("fadwvcv", bool);
        C7 = oj.a("bfarud", bool2);
        D7 = oj.a("inacc", Boolean.valueOf(zp.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        E7 = oj.a("pbataipaf", "");
        F7 = com.applovin.impl.mediation.ads.e.b(timeUnit, 30L, "bwt_ms");
        G7 = com.applovin.impl.mediation.ads.e.b(timeUnit, 30L, "twt_ms");
        H7 = oj.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        I7 = oj.a("ssasiimp", bool2);
        J7 = oj.a("faomq", bool2);
        K7 = oj.a("sppdater", bool2);
        L7 = oj.a("siflcfbt", bool2);
        M7 = oj.a("uabta", bool2);
        N7 = oj.a("fetch_mediated_ad_gzip", bool);
        O7 = oj.a("max_postback_gzip", bool);
        P7 = oj.a("remove_ad_view_before_destroy", bool);
    }
}
