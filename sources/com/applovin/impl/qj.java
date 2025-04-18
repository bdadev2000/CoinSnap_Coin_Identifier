package com.applovin.impl;

import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class qj {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f7245b;

    /* renamed from: c, reason: collision with root package name */
    public static final qj f7222c = new qj("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: d, reason: collision with root package name */
    public static final qj f7223d = new qj("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: e, reason: collision with root package name */
    public static final qj f7224e = new qj("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: f, reason: collision with root package name */
    public static final qj f7225f = new qj("com.applovin.sdk.install_date", Long.class);

    /* renamed from: g, reason: collision with root package name */
    public static final qj f7226g = new qj("com.applovin.sdk.user_id", String.class);

    /* renamed from: h, reason: collision with root package name */
    public static final qj f7227h = new qj("com.applovin.sdk.compass_id", String.class);

    /* renamed from: i, reason: collision with root package name */
    public static final qj f7228i = new qj("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: j, reason: collision with root package name */
    public static final qj f7229j = new qj("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: k, reason: collision with root package name */
    public static final qj f7230k = new qj("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: l, reason: collision with root package name */
    public static final qj f7231l = new qj("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: m, reason: collision with root package name */
    public static final qj f7232m = new qj("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: n, reason: collision with root package name */
    public static final qj f7233n = new qj("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: o, reason: collision with root package name */
    public static final qj f7234o = new qj("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* renamed from: p, reason: collision with root package name */
    public static final qj f7235p = new qj("IABTCF_CmpSdkID", Object.class);

    /* renamed from: q, reason: collision with root package name */
    public static final qj f7236q = new qj("IABTCF_CmpSdkVersion", Object.class);

    /* renamed from: r, reason: collision with root package name */
    public static final qj f7237r = new qj("IABTCF_gdprApplies", Object.class);

    /* renamed from: s, reason: collision with root package name */
    public static final qj f7238s = new qj("IABTCF_TCString", String.class);

    /* renamed from: t, reason: collision with root package name */
    public static final qj f7239t = new qj("IABTCF_AddtlConsent", String.class);
    public static final qj u = new qj("IABTCF_VendorConsents", String.class);

    /* renamed from: v, reason: collision with root package name */
    public static final qj f7240v = new qj("IABTCF_VendorLegitimateInterests", String.class);

    /* renamed from: w, reason: collision with root package name */
    public static final qj f7241w = new qj("IABTCF_PurposeConsents", String.class);

    /* renamed from: x, reason: collision with root package name */
    public static final qj f7242x = new qj("IABTCF_PurposeLegitimateInterests", String.class);

    /* renamed from: y, reason: collision with root package name */
    public static final qj f7243y = new qj("IABTCF_SpecialFeaturesOptIns", String.class);

    /* renamed from: z, reason: collision with root package name */
    public static final qj f7244z = new qj("com.applovin.sdk.stats", String.class);
    public static final qj A = new qj("com.applovin.sdk.task.stats", HashSet.class);
    public static final qj B = new qj("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final qj C = new qj("com.applovin.sdk.event_tracking.super_properties", String.class);
    public static final qj D = new qj("com.applovin.sdk.last_video_position", Integer.class);
    public static final qj E = new qj("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final qj F = new qj("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final qj G = new qj("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final qj H = new qj("com.applovin.sdk.persisted_data", String.class);
    public static final qj I = new qj("com.applovin.sdk.mediation_provider", String.class);
    public static final qj J = new qj("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final qj K = new qj("com.applovin.sdk.user_agent", String.class);
    public static final qj L = new qj("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final qj M = new qj("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final qj N = new qj("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final qj O = new qj("com.taboola.api.user_id", String.class);
    public static final qj P = new qj("com.taboola.api.user_id_creation_date", Long.class);

    public qj(String str, Class cls) {
        this.a = str;
        this.f7245b = cls;
    }

    public String a() {
        return this.a;
    }

    public Class b() {
        return this.f7245b;
    }

    public String toString() {
        return "Key{name='" + this.a + "', type=" + this.f7245b + AbstractJsonLexerKt.END_OBJ;
    }
}
