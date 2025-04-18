package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class la {
    public static final la A;
    public static final la B;
    public static final la C;
    public static final la D;
    public static final la E;
    public static final la F;
    public static final la G;
    public static final la H;
    public static final la I;
    public static final la J;
    public static final la K;
    public static final la L;
    public static final la M;
    public static final la N;
    public static final la O;
    public static final la P;
    public static final la Q;
    public static final la R;
    public static final la S;
    public static final la T;
    public static final la U;

    /* renamed from: c, reason: collision with root package name */
    private static JSONObject f25007c;
    public static final la d;
    public static final la e;

    /* renamed from: f, reason: collision with root package name */
    public static final la f25008f;

    /* renamed from: g, reason: collision with root package name */
    public static final la f25009g;

    /* renamed from: h, reason: collision with root package name */
    public static final la f25010h;

    /* renamed from: i, reason: collision with root package name */
    public static final la f25011i;

    /* renamed from: j, reason: collision with root package name */
    public static final la f25012j;

    /* renamed from: k, reason: collision with root package name */
    public static final la f25013k;

    /* renamed from: l, reason: collision with root package name */
    public static final la f25014l;

    /* renamed from: m, reason: collision with root package name */
    public static final la f25015m;

    /* renamed from: n, reason: collision with root package name */
    public static final la f25016n;

    /* renamed from: o, reason: collision with root package name */
    public static final la f25017o;

    /* renamed from: p, reason: collision with root package name */
    public static final la f25018p;

    /* renamed from: q, reason: collision with root package name */
    public static final la f25019q;

    /* renamed from: r, reason: collision with root package name */
    public static final la f25020r;

    /* renamed from: s, reason: collision with root package name */
    public static final la f25021s;

    /* renamed from: t, reason: collision with root package name */
    public static final la f25022t;

    /* renamed from: u, reason: collision with root package name */
    public static final la f25023u;

    /* renamed from: v, reason: collision with root package name */
    public static final la f25024v;
    public static final la w;
    public static final la x;

    /* renamed from: y, reason: collision with root package name */
    public static final la f25025y;

    /* renamed from: z, reason: collision with root package name */
    public static final la f25026z;

    /* renamed from: a, reason: collision with root package name */
    private final String f25027a;

    /* renamed from: b, reason: collision with root package name */
    private final b f25028b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25029a;

        static {
            int[] iArr = new int[b.values().length];
            f25029a = iArr;
            try {
                iArr[b.AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25029a[b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25029a[b.USER_SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AD,
        ERROR,
        USER_SESSION
    }

    static {
        b bVar = b.ERROR;
        d = new la("generic", bVar);
        e = new la("sdk_init", b.USER_SESSION);
        b bVar2 = b.AD;
        f25008f = new la("ad_requested", bVar2);
        f25009g = new la("ad_request_success", bVar2);
        f25010h = new la("ad_request_failure", bVar2);
        f25011i = new la("ad_load_success", bVar2);
        f25012j = new la("ad_load_failure", bVar2);
        f25013k = new la("ad_displayed", bVar2);
        f25014l = new la("ad_hidden", bVar2);
        f25015m = new la("adapter_init_started", bVar2);
        f25016n = new la("adapter_init_success", bVar2);
        f25017o = new la("adapter_init_failure", bVar2);
        f25018p = new la("signal_collection_success", bVar2);
        f25019q = new la("signal_collection_failure", bVar2);
        f25020r = new la("mediated_ad_requested", bVar2);
        f25021s = new la("mediated_ad_success", bVar2);
        f25022t = new la("mediated_ad_failure", bVar2);
        f25023u = new la("mediated_ad_load_started", bVar2);
        f25024v = new la("mediated_ad_load_success", bVar2);
        w = new la("mediated_ad_load_failure", bVar2);
        x = new la("waterfall_processing_complete", bVar2);
        f25025y = new la("mediated_ad_displayed", bVar2);
        f25026z = new la("mediated_ad_display_failure", bVar2);
        A = new la("mediated_ad_hidden", bVar2);
        B = new la("mediated_ad_hidden_callback_not_called", bVar2);
        C = new la("anr", bVar);
        D = new la("app_killed_during_ad", bVar);
        E = new la("auto_redirect", bVar);
        F = new la("black_view", bVar);
        G = new la("cache_error", bVar);
        H = new la("caught_exception", bVar);
        I = new la("consent_flow_error", bVar);
        J = new la(AppMeasurement.CRASH_ORIGIN, bVar);
        K = new la("file_error", bVar);
        L = new la("integration_error", bVar);
        M = new la("media_error", bVar);
        N = new la("native_error", bVar);
        O = new la("network_error", bVar);
        P = new la("resource_load_success", bVar);
        Q = new la("task_exception", bVar);
        R = new la("task_latency_alert", bVar);
        S = new la("template_error", bVar);
        T = new la("unexpected_state", bVar);
        U = new la("web_view_error", bVar);
    }

    public la(String str, b bVar) {
        this.f25027a = str;
        this.f25028b = bVar;
    }

    public b a() {
        return this.f25028b;
    }

    public String b() {
        return this.f25027a;
    }

    public double a(com.applovin.impl.sdk.j jVar) {
        if (yp.i(com.applovin.impl.sdk.j.l())) {
            return 100.0d;
        }
        double a2 = a(this.f25027a, jVar);
        if (a2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return a2;
        }
        double a3 = a(this.f25028b, jVar);
        return a3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? a3 : ((Float) jVar.a(sj.N)).floatValue();
    }

    private double a(String str, com.applovin.impl.sdk.j jVar) {
        if (f25007c == null) {
            f25007c = JsonUtils.deserialize((String) jVar.a(sj.J));
        }
        Double d2 = JsonUtils.getDouble(f25007c, str, (Double) null);
        if (d2 != null) {
            return d2.doubleValue();
        }
        return -1.0d;
    }

    private double a(b bVar, com.applovin.impl.sdk.j jVar) {
        float floatValue;
        int i2 = a.f25029a[bVar.ordinal()];
        if (i2 == 1) {
            floatValue = ((Float) jVar.a(sj.K)).floatValue();
        } else if (i2 == 2) {
            floatValue = ((Float) jVar.a(sj.L)).floatValue();
        } else {
            if (i2 != 3) {
                return -1.0d;
            }
            floatValue = ((Float) jVar.a(sj.M)).floatValue();
        }
        return floatValue;
    }
}
