package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.t;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i {
    private static Context a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Application f3130b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f3131c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f3132d = "default";

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3133e = false;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.runtime.d f3134f;

    /* renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f3137i;

    /* renamed from: n, reason: collision with root package name */
    private static volatile String f3142n;

    /* renamed from: g, reason: collision with root package name */
    private static ConfigManager f3135g = new ConfigManager();

    /* renamed from: h, reason: collision with root package name */
    private static a f3136h = new a();

    /* renamed from: j, reason: collision with root package name */
    private static t f3138j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile String f3139k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Object f3140l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile int f3141m = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f3143o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f3144p = true;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f3145q = true;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f3146r = false;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f3147s = true;

    public static com.apm.insight.runtime.d a() {
        if (f3134f == null) {
            f3134f = com.apm.insight.runtime.i.a(a);
        }
        return f3134f;
    }

    public static a b() {
        return f3136h;
    }

    public static t c() {
        if (f3138j == null) {
            synchronized (i.class) {
                f3138j = new t(a);
            }
        }
        return f3138j;
    }

    public static void d(boolean z10) {
        f3146r = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f3139k == null) {
            synchronized (f3140l) {
                if (f3139k == null) {
                    f3139k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f3139k;
    }

    public static Context g() {
        return a;
    }

    public static Application h() {
        return f3130b;
    }

    public static ConfigManager i() {
        return f3135g;
    }

    public static long j() {
        return f3131c;
    }

    public static String k() {
        return f3132d;
    }

    public static int l() {
        return f3143o;
    }

    public static boolean m() {
        return f3133e;
    }

    public static String n() {
        Object obj = a().a().get("channel");
        return obj == null ? AppLovinMediationProvider.UNKNOWN : String.valueOf(obj);
    }

    public static ConcurrentHashMap<Integer, String> o() {
        return f3137i;
    }

    public static int p() {
        return f3141m;
    }

    public static String q() {
        return f3142n;
    }

    public static boolean r() {
        return f3144p;
    }

    public static boolean s() {
        return f3145q;
    }

    public static boolean t() {
        return f3146r;
    }

    public static boolean u() {
        return f3147s;
    }

    public static String a(long j3, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j3);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(j());
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    public static void b(int i10, String str) {
        f3141m = i10;
        f3142n = str;
    }

    public static void c(boolean z10) {
        f3145q = z10;
    }

    public static boolean d() {
        return i().isDebugMode() && n().contains("local_test");
    }

    public static void e(boolean z10) {
        f3147s = z10;
    }

    public static void a(int i10) {
        f3143o = i10;
    }

    public static void b(boolean z10) {
        f3144p = z10;
    }

    public static void a(int i10, String str) {
        if (f3137i == null) {
            synchronized (i.class) {
                if (f3137i == null) {
                    f3137i = new ConcurrentHashMap<>();
                }
            }
        }
        f3137i.put(Integer.valueOf(i10), str);
    }

    public static void a(Application application) {
        if (application != null) {
            f3130b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f3130b == null) {
            f3131c = System.currentTimeMillis();
            a = context;
            f3130b = application;
            f3139k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f3134f = new com.apm.insight.runtime.d(a, iCommonParams, a());
    }

    public static void a(com.apm.insight.runtime.d dVar) {
        f3134f = dVar;
    }

    public static void a(String str) {
        f3132d = str;
    }

    public static void a(boolean z10) {
        f3133e = z10;
    }
}
