package com.applovin.impl;

import java.util.HashSet;

/* loaded from: classes2.dex */
public class uj {

    /* renamed from: a, reason: collision with root package name */
    private final String f27350a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f27351b;

    /* renamed from: c, reason: collision with root package name */
    public static final uj f27330c = new uj("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final uj d = new uj("com.applovin.sdk.launched_before", Boolean.class);
    public static final uj e = new uj("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: f, reason: collision with root package name */
    public static final uj f27331f = new uj("com.applovin.sdk.install_date", Long.class);

    /* renamed from: g, reason: collision with root package name */
    public static final uj f27332g = new uj("com.applovin.sdk.user_id", String.class);

    /* renamed from: h, reason: collision with root package name */
    public static final uj f27333h = new uj("com.applovin.sdk.compass_id", String.class);

    /* renamed from: i, reason: collision with root package name */
    public static final uj f27334i = new uj("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: j, reason: collision with root package name */
    public static final uj f27335j = new uj("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: k, reason: collision with root package name */
    public static final uj f27336k = new uj("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: l, reason: collision with root package name */
    public static final uj f27337l = new uj("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: m, reason: collision with root package name */
    public static final uj f27338m = new uj("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: n, reason: collision with root package name */
    public static final uj f27339n = new uj("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: o, reason: collision with root package name */
    public static final uj f27340o = new uj("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* renamed from: p, reason: collision with root package name */
    public static final uj f27341p = new uj("IABTCF_CmpSdkID", Object.class);

    /* renamed from: q, reason: collision with root package name */
    public static final uj f27342q = new uj("IABTCF_CmpSdkVersion", Object.class);

    /* renamed from: r, reason: collision with root package name */
    public static final uj f27343r = new uj("IABTCF_gdprApplies", Object.class);

    /* renamed from: s, reason: collision with root package name */
    public static final uj f27344s = new uj("IABTCF_TCString", String.class);

    /* renamed from: t, reason: collision with root package name */
    public static final uj f27345t = new uj("IABTCF_AddtlConsent", String.class);

    /* renamed from: u, reason: collision with root package name */
    public static final uj f27346u = new uj("IABTCF_VendorConsents", String.class);

    /* renamed from: v, reason: collision with root package name */
    public static final uj f27347v = new uj("IABTCF_VendorLegitimateInterests", String.class);
    public static final uj w = new uj("IABTCF_PurposeConsents", String.class);
    public static final uj x = new uj("IABTCF_PurposeLegitimateInterests", String.class);

    /* renamed from: y, reason: collision with root package name */
    public static final uj f27348y = new uj("IABTCF_SpecialFeaturesOptIns", String.class);

    /* renamed from: z, reason: collision with root package name */
    public static final uj f27349z = new uj("com.applovin.sdk.stats", String.class);
    public static final uj A = new uj("com.applovin.sdk.task.stats", HashSet.class);
    public static final uj B = new uj("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final uj C = new uj("com.applovin.sdk.last_video_position", Integer.class);
    public static final uj D = new uj("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final uj E = new uj("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final uj F = new uj("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final uj G = new uj("com.applovin.sdk.persisted_data", String.class);
    public static final uj H = new uj("com.applovin.sdk.mediation_provider", String.class);
    public static final uj I = new uj("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final uj J = new uj("com.applovin.sdk.user_agent", String.class);
    public static final uj K = new uj("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final uj L = new uj("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final uj M = new uj("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final uj N = new uj("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final uj O = new uj("com.applovin.sdk.app_killed_last_ad_data", String.class);

    public uj(String str, Class cls) {
        this.f27350a = str;
        this.f27351b = cls;
    }

    public String a() {
        return this.f27350a;
    }

    public Class b() {
        return this.f27351b;
    }

    public String toString() {
        return "Key{name='" + this.f27350a + "', type=" + this.f27351b + '}';
    }
}
