package com.applovin.impl;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class aa {
    private static final Set b = new HashSet(32);

    /* renamed from: c, reason: collision with root package name */
    private static final Set f6595c = new HashSet(16);

    /* renamed from: d, reason: collision with root package name */
    public static final aa f6596d = a("ad_req");

    /* renamed from: e, reason: collision with root package name */
    public static final aa f6597e = a("ad_imp");

    /* renamed from: f, reason: collision with root package name */
    public static final aa f6598f = a("max_ad_imp");

    /* renamed from: g, reason: collision with root package name */
    public static final aa f6599g = a("ad_session_start");

    /* renamed from: h, reason: collision with root package name */
    public static final aa f6600h = a("ad_imp_session");

    /* renamed from: i, reason: collision with root package name */
    public static final aa f6601i = a("max_ad_imp_session");

    /* renamed from: j, reason: collision with root package name */
    public static final aa f6602j = a("cached_files_expired");

    /* renamed from: k, reason: collision with root package name */
    public static final aa f6603k = a("cache_drop_count");
    public static final aa l = a("sdk_reset_state_count", true);
    public static final aa m = a("ad_response_process_failures", true);

    /* renamed from: n, reason: collision with root package name */
    public static final aa f6604n = a("response_process_failures", true);

    /* renamed from: o, reason: collision with root package name */
    public static final aa f6605o = a("incent_failed_to_display_count", true);

    /* renamed from: p, reason: collision with root package name */
    public static final aa f6606p = a("app_paused_and_resumed");

    /* renamed from: q, reason: collision with root package name */
    public static final aa f6607q = a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: r, reason: collision with root package name */
    public static final aa f6608r = a("ad_shown_outside_app_count");

    /* renamed from: s, reason: collision with root package name */
    public static final aa f6609s = a("med_ad_req");

    /* renamed from: t, reason: collision with root package name */
    public static final aa f6610t = a("med_ad_response_process_failures", true);

    /* renamed from: u, reason: collision with root package name */
    public static final aa f6611u = a("med_waterfall_ad_no_fill", true);

    /* renamed from: v, reason: collision with root package name */
    public static final aa f6612v = a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: w, reason: collision with root package name */
    public static final aa f6613w = a("med_waterfall_ad_invalid_response", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f6614a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private aa(String str) {
        this.f6614a = str;
    }

    private static aa a(String str) {
        return a(str, false);
    }

    public String b() {
        return this.f6614a;
    }

    private static aa a(String str, boolean z8) {
        if (!TextUtils.isEmpty(str)) {
            Set set = b;
            if (!set.contains(str)) {
                set.add(str);
                aa aaVar = new aa(str);
                if (z8) {
                    f6595c.add(aaVar);
                }
                return aaVar;
            }
            throw new IllegalArgumentException(AbstractC2914a.d("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }

    public static Set a() {
        return f6595c;
    }
}
