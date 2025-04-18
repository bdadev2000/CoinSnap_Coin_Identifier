package com.applovin.impl;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class ca {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f23240b = new HashSet(32);

    /* renamed from: c, reason: collision with root package name */
    private static final Set f23241c = new HashSet(16);
    public static final ca d = a("ad_req");
    public static final ca e = a("ad_imp");

    /* renamed from: f, reason: collision with root package name */
    public static final ca f23242f = a("max_ad_imp");

    /* renamed from: g, reason: collision with root package name */
    public static final ca f23243g = a("ad_session_start");

    /* renamed from: h, reason: collision with root package name */
    public static final ca f23244h = a("ad_imp_session");

    /* renamed from: i, reason: collision with root package name */
    public static final ca f23245i = a("max_ad_imp_session");

    /* renamed from: j, reason: collision with root package name */
    public static final ca f23246j = a("cached_files_expired");

    /* renamed from: k, reason: collision with root package name */
    public static final ca f23247k = a("cache_drop_count");

    /* renamed from: l, reason: collision with root package name */
    public static final ca f23248l = a("sdk_reset_state_count", true);

    /* renamed from: m, reason: collision with root package name */
    public static final ca f23249m = a("ad_response_process_failures", true);

    /* renamed from: n, reason: collision with root package name */
    public static final ca f23250n = a("response_process_failures", true);

    /* renamed from: o, reason: collision with root package name */
    public static final ca f23251o = a("incent_failed_to_display_count", true);

    /* renamed from: p, reason: collision with root package name */
    public static final ca f23252p = a("app_paused_and_resumed");

    /* renamed from: q, reason: collision with root package name */
    public static final ca f23253q = a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: r, reason: collision with root package name */
    public static final ca f23254r = a("ad_shown_outside_app_count");

    /* renamed from: s, reason: collision with root package name */
    public static final ca f23255s = a("med_ad_req");

    /* renamed from: t, reason: collision with root package name */
    public static final ca f23256t = a("med_ad_response_process_failures", true);

    /* renamed from: u, reason: collision with root package name */
    public static final ca f23257u = a("med_waterfall_ad_no_fill", true);

    /* renamed from: v, reason: collision with root package name */
    public static final ca f23258v = a("med_waterfall_ad_adapter_load_failed", true);
    public static final ca w = a("med_waterfall_ad_invalid_response", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f23259a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private ca(String str) {
        this.f23259a = str;
    }

    public static Set a() {
        return f23241c;
    }

    public String b() {
        return this.f23259a;
    }

    private static ca a(String str) {
        return a(str, false);
    }

    private static ca a(String str, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            Set set = f23240b;
            if (!set.contains(str)) {
                set.add(str);
                ca caVar = new ca(str);
                if (z2) {
                    f23241c.add(caVar);
                }
                return caVar;
            }
            throw new IllegalArgumentException(androidx.compose.ui.platform.j.b("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }
}
