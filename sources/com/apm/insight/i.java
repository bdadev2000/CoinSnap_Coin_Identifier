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

    /* renamed from: a, reason: collision with root package name */
    private static Context f5816a = null;
    private static Application b = null;

    /* renamed from: c, reason: collision with root package name */
    private static long f5817c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f5818d = "default";

    /* renamed from: e, reason: collision with root package name */
    private static boolean f5819e = false;

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.runtime.d f5820f;

    /* renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f5823i;

    /* renamed from: n, reason: collision with root package name */
    private static volatile String f5826n;

    /* renamed from: g, reason: collision with root package name */
    private static ConfigManager f5821g = new ConfigManager();

    /* renamed from: h, reason: collision with root package name */
    private static a f5822h = new a();

    /* renamed from: j, reason: collision with root package name */
    private static t f5824j = null;

    /* renamed from: k, reason: collision with root package name */
    private static volatile String f5825k = null;
    private static Object l = new Object();
    private static volatile int m = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f5827o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f5828p = true;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f5829q = true;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f5830r = false;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f5831s = true;

    public static com.apm.insight.runtime.d a() {
        if (f5820f == null) {
            f5820f = com.apm.insight.runtime.i.a(f5816a);
        }
        return f5820f;
    }

    public static a b() {
        return f5822h;
    }

    public static t c() {
        if (f5824j == null) {
            synchronized (i.class) {
                f5824j = new t(f5816a);
            }
        }
        return f5824j;
    }

    public static void d(boolean z8) {
        f5830r = z8;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f5825k == null) {
            synchronized (l) {
                try {
                    if (f5825k == null) {
                        f5825k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return f5825k;
    }

    public static Context g() {
        return f5816a;
    }

    public static Application h() {
        return b;
    }

    public static ConfigManager i() {
        return f5821g;
    }

    public static long j() {
        return f5817c;
    }

    public static String k() {
        return f5818d;
    }

    public static int l() {
        return f5827o;
    }

    public static boolean m() {
        return f5819e;
    }

    public static String n() {
        Object obj = a().a().get("channel");
        return obj == null ? AppLovinMediationProvider.UNKNOWN : String.valueOf(obj);
    }

    public static ConcurrentHashMap<Integer, String> o() {
        return f5823i;
    }

    public static int p() {
        return m;
    }

    public static String q() {
        return f5826n;
    }

    public static boolean r() {
        return f5828p;
    }

    public static boolean s() {
        return f5829q;
    }

    public static boolean t() {
        return f5830r;
    }

    public static boolean u() {
        return f5831s;
    }

    public static String a(long j7, CrashType crashType, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        sb.append(j7);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(f());
        sb.append('_');
        sb.append(z8 ? "oom_" : "normal_");
        sb.append(j());
        sb.append('_');
        sb.append(z9 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb.toString();
    }

    public static void b(int i9, String str) {
        m = i9;
        f5826n = str;
    }

    public static void c(boolean z8) {
        f5829q = z8;
    }

    public static boolean d() {
        return i().isDebugMode() && n().contains("local_test");
    }

    public static void e(boolean z8) {
        f5831s = z8;
    }

    public static void a(int i9) {
        f5827o = i9;
    }

    public static void b(boolean z8) {
        f5828p = z8;
    }

    public static void a(int i9, String str) {
        if (f5823i == null) {
            synchronized (i.class) {
                try {
                    if (f5823i == null) {
                        f5823i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        f5823i.put(Integer.valueOf(i9), str);
    }

    public static void a(Application application) {
        if (application != null) {
            b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (b == null) {
            f5817c = System.currentTimeMillis();
            f5816a = context;
            b = application;
            f5825k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f5820f = new com.apm.insight.runtime.d(f5816a, iCommonParams, a());
    }

    public static void a(com.apm.insight.runtime.d dVar) {
        f5820f = dVar;
    }

    public static void a(String str) {
        f5818d = str;
    }

    public static void a(boolean z8) {
        f5819e = z8;
    }
}
