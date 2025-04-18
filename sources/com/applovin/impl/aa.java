package com.applovin.impl;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class aa {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f3612b = new HashSet(32);

    /* renamed from: c, reason: collision with root package name */
    private static final Set f3613c = new HashSet(16);

    /* renamed from: d, reason: collision with root package name */
    public static final aa f3614d = a("ad_req");

    /* renamed from: e, reason: collision with root package name */
    public static final aa f3615e = a("ad_imp");

    /* renamed from: f, reason: collision with root package name */
    public static final aa f3616f = a("max_ad_imp");

    /* renamed from: g, reason: collision with root package name */
    public static final aa f3617g = a("ad_session_start");

    /* renamed from: h, reason: collision with root package name */
    public static final aa f3618h = a("ad_imp_session");

    /* renamed from: i, reason: collision with root package name */
    public static final aa f3619i = a("max_ad_imp_session");

    /* renamed from: j, reason: collision with root package name */
    public static final aa f3620j = a("cached_files_expired");

    /* renamed from: k, reason: collision with root package name */
    public static final aa f3621k = a("cache_drop_count");

    /* renamed from: l, reason: collision with root package name */
    public static final aa f3622l = a("sdk_reset_state_count", true);

    /* renamed from: m, reason: collision with root package name */
    public static final aa f3623m = a("ad_response_process_failures", true);

    /* renamed from: n, reason: collision with root package name */
    public static final aa f3624n = a("response_process_failures", true);

    /* renamed from: o, reason: collision with root package name */
    public static final aa f3625o = a("incent_failed_to_display_count", true);

    /* renamed from: p, reason: collision with root package name */
    public static final aa f3626p = a("app_paused_and_resumed");

    /* renamed from: q, reason: collision with root package name */
    public static final aa f3627q = a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: r, reason: collision with root package name */
    public static final aa f3628r = a("ad_shown_outside_app_count");

    /* renamed from: s, reason: collision with root package name */
    public static final aa f3629s = a("med_ad_req");

    /* renamed from: t, reason: collision with root package name */
    public static final aa f3630t = a("med_ad_response_process_failures", true);
    public static final aa u = a("med_waterfall_ad_no_fill", true);

    /* renamed from: v, reason: collision with root package name */
    public static final aa f3631v = a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: w, reason: collision with root package name */
    public static final aa f3632w = a("med_waterfall_ad_invalid_response", true);
    private final String a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private aa(String str) {
        this.a = str;
    }

    private static aa a(String str) {
        return a(str, false);
    }

    public String b() {
        return this.a;
    }

    private static aa a(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            Set set = f3612b;
            if (!set.contains(str)) {
                set.add(str);
                aa aaVar = new aa(str);
                if (z10) {
                    f3613c.add(aaVar);
                }
                return aaVar;
            }
            throw new IllegalArgumentException(vd.e.e("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }

    public static Set a() {
        return f3613c;
    }
}
