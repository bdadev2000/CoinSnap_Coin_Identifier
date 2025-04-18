package com.safedk.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.g;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.analytics.brandsafety.q;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.DeviceData;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.Api;
import com.safedk.android.utils.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SafeDK {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29035a = "com.safedk";

    /* renamed from: b, reason: collision with root package name */
    private static final String f29036b = "SafeDKMain";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29037c = "SafeDK";
    private static final String d = "https://config.safedk.com/";
    private static final String e = "com.safedk.AppID";

    /* renamed from: f, reason: collision with root package name */
    private static final String f29038f = "com.safedk.ConfigPrefix";

    /* renamed from: g, reason: collision with root package name */
    private static final String f29039g = "com.safedk.APIPrefix";

    /* renamed from: h, reason: collision with root package name */
    private static final String f29040h = "com.safedk.DebugMode";

    /* renamed from: i, reason: collision with root package name */
    private static final String f29041i = "com.safedk.MaximumStatsSetSize";

    /* renamed from: j, reason: collision with root package name */
    private static final String f29042j = "com.safedk.AggregationThreshold";

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f29044l = false;

    /* renamed from: m, reason: collision with root package name */
    private static int f29045m;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f29046n;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f29047p;

    /* renamed from: o, reason: collision with root package name */
    private boolean f29052o;

    /* renamed from: r, reason: collision with root package name */
    private final Context f29053r;

    /* renamed from: v, reason: collision with root package name */
    private DeviceData f29055v;
    private i x;

    /* renamed from: k, reason: collision with root package name */
    private static final List<String> f29043k = Arrays.asList("com.android.vending", "com.amazon.venezia", "com.sec.android.app.samsungapps");

    /* renamed from: q, reason: collision with root package name */
    private static SafeDK f29048q = null;

    /* renamed from: s, reason: collision with root package name */
    private static final d f29049s = new d();

    /* renamed from: t, reason: collision with root package name */
    private static final AtomicBoolean f29050t = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    private static final AtomicBoolean f29051z = new AtomicBoolean(false);
    private static final AtomicBoolean A = new AtomicBoolean(false);
    private static Boolean B = false;
    private static Boolean C = false;
    private static final ExecutorService D = Executors.newSingleThreadExecutor();

    /* renamed from: u, reason: collision with root package name */
    private String f29054u = null;
    private final Map<BrandSafetyUtils.AdType, b> w = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f29056y = new AtomicBoolean(false);

    public static String getSdkKey() {
        return "whCUuQoHTWhy4rLFHSGciHGJMqVS2C2orx7u_9xtyMKWlwQTau575xM2Lr7ztlxkb0NCprdFuRkUuUhoqaTNaH";
    }

    public static boolean a() {
        return f29047p;
    }

    public static boolean b() {
        return f29050t.get();
    }

    private SafeDK(Context context) {
        Logger.d(f29036b, "SafeDK ctor started");
        this.f29053r = context;
        AppLovinBridge.init(context);
        if (c()) {
            Logger.d(f29036b, "Before reading shared prefs");
            this.f29055v = new DeviceData(context, this.x);
        }
    }

    public boolean c() {
        try {
            synchronized (C) {
                if (!C.booleanValue() && f29051z != null && !f29051z.get()) {
                    Logger.d(f29036b, "loading config from prefs");
                    this.x = new i(this.f29053r.getSharedPreferences("SafeDKToggles", 0), false);
                }
                C = true;
            }
        } catch (IllegalStateException e2) {
            Logger.d(f29036b, "IllegalStateException caught during loading of configuration from prefs, device may be locked", e2);
        } catch (Throwable th) {
            Logger.d(f29036b, "Exception during loading of configuration from prefs : " + th.getMessage(), th);
        }
        return C.booleanValue();
    }

    private void aa() {
        Logger.d(f29036b, "init");
        if (!r()) {
            synchronized (this.w) {
                Iterator<b> it = this.w.values().iterator();
                while (it.hasNext()) {
                    it.next().a((String) null);
                }
                this.w.clear();
            }
        }
    }

    private void ab() {
        try {
            ApplicationInfo applicationInfo = this.f29053r.getPackageManager().getApplicationInfo(this.f29053r.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                a(applicationInfo);
                b(applicationInfo);
                c(applicationInfo);
                d(applicationInfo);
            } else {
                Logger.e(f29036b, "SafeDK meta data is missing from manifest file");
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.d(f29036b, "Couldn't get application's meta data");
        }
    }

    private void a(ApplicationInfo applicationInfo) {
        try {
            try {
                PackageInfo packageInfo = this.f29053r.getPackageManager().getPackageInfo(this.f29053r.getPackageName(), 0);
                Logger.d(f29036b, "package is: " + packageInfo.packageName + ", Installer Package Name is " + this.f29053r.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f29047p = f29043k.contains(this.f29053r.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f29046n = (applicationInfo.flags & 2) != 0;
                Uri.Builder appendQueryParameter = new Uri.Builder().appendPath("apps").appendPath("cfg").appendPath(extractAppIdentifier(applicationInfo.metaData)).appendPath(String.valueOf(packageInfo.versionCode)).appendQueryParameter("store", String.valueOf(f29047p));
                if (f29047p) {
                    appendQueryParameter = appendQueryParameter.appendQueryParameter("versionName", packageInfo.versionName);
                }
                String uri = appendQueryParameter.build().toString();
                String extractUrlPrefix = extractUrlPrefix(applicationInfo.metaData);
                if (extractUrlPrefix != null && !extractUrlPrefix.isEmpty()) {
                    Logger.d(f29036b, "apiURL Value from manifest is " + extractUrlPrefix + ". Setting new edge urls");
                    AppLovinBridge.receiveEdgeUrls(extractUrlPrefix, extractUrlPrefix);
                } else {
                    Logger.d(f29036b, "no apiURL Value in manifest");
                }
                f29045m = packageInfo.versionCode;
                String string = applicationInfo.metaData.getString(f29038f);
                if (string == null) {
                    String str = getDefaultConfig() + uri;
                    return;
                }
                if (!string.endsWith(File.separator)) {
                    string = string + File.separator;
                }
                if (uri.startsWith(File.separator)) {
                    uri = uri.substring(1);
                }
                Logger.d(f29036b, "basePrefix != null, configUrl:" + (string + uri));
            } catch (PackageManager.NameNotFoundException e2) {
                Logger.d(f29036b, "Bad URL; won't update toggles");
            }
        } catch (Throwable th) {
            Logger.e(f29036b, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    private static String extractAppIdentifier(Bundle metaData) {
        return metaData.getString(e);
    }

    private static String extractUrlPrefix(Bundle metaData) {
        return metaData.getString(f29039g, "https://edge.safedk.com");
    }

    private static String getDefaultConfig() {
        return d;
    }

    public static String getProguardMD5() {
        return "";
    }

    private void b(ApplicationInfo applicationInfo) {
        boolean z2 = false;
        if (f29049s.y() && (applicationInfo.metaData.getBoolean(f29040h, false) || ag())) {
            z2 = true;
        }
        Logger.setDebugMode(z2);
    }

    public boolean d() {
        try {
            ApplicationInfo applicationInfo = SafeDKApplication.getAppContext().getPackageManager().getApplicationInfo(this.f29053r.getPackageName(), 128);
            if (f29049s.y()) {
                return applicationInfo.metaData.getBoolean(f29040h, false) || ag();
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    private void c(ApplicationInfo applicationInfo) {
        f29049s.a(applicationInfo.metaData.getInt(f29041i, 5000));
    }

    private void d(ApplicationInfo applicationInfo) {
        f29049s.b(applicationInfo.metaData.getInt(f29042j, d.f29936c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (this.x != null) {
            this.f29054u = UUID.randomUUID().toString();
            this.x.a(this.f29054u);
        }
    }

    public static SafeDK a(Context context) {
        Logger.d(f29036b, "start started");
        if (f29048q == null) {
            f29048q = new SafeDK(context);
            f29048q.a(false);
            f29048q.b(true);
        } else {
            Logger.d(f29036b, "SafeDK already started");
        }
        return f29048q;
    }

    public static void a(Application application) {
        if (getInstance() != null && getInstance().o() && Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(com.safedk.android.internal.b.getInstance());
        }
    }

    private void ad() {
        try {
            Logger.d(f29036b, "setIsFirstSession started");
            if (!A.get() && this.x != null) {
                String p2 = this.x.p();
                Logger.d(f29036b, "setIsFirstSession Current safedk version : 5.4.6 , stored version is " + p2);
                if (p2 == null || !a.f29059a.equals(p2)) {
                    Logger.d(f29036b, "setIsFirstSession setting is_first_session to true");
                    this.f29052o = true;
                }
                this.x.c(a.f29059a);
                A.set(true);
                return;
            }
            Logger.d(f29036b, "setIsFirstSession already executed, value is " + this.f29052o);
        } catch (Throwable th) {
            Logger.d(f29036b, "setIsFirstSession Exception : " + th.getMessage(), th);
        }
    }

    public boolean e() {
        return this.f29052o;
    }

    public static SafeDK getInstance() {
        return f29048q;
    }

    public int f() {
        return f29049s.a();
    }

    public int g() {
        return f29049s.b();
    }

    public boolean h() {
        return f29049s.c();
    }

    private void ae() {
        synchronized (this.w) {
            if (!this.w.containsKey(BrandSafetyUtils.AdType.INTERSTITIAL)) {
                this.w.put(BrandSafetyUtils.AdType.INTERSTITIAL, new InterstitialFinder());
            }
            if (!this.w.containsKey(BrandSafetyUtils.AdType.BANNER) && p()) {
                this.w.put(BrandSafetyUtils.AdType.BANNER, new BannerFinder(getInstance().T()));
            }
            if (!this.w.containsKey(BrandSafetyUtils.AdType.MREC) && p()) {
                this.w.put(BrandSafetyUtils.AdType.MREC, new q(getInstance().T()));
            }
            if (!this.w.containsKey(BrandSafetyUtils.AdType.NATIVE)) {
                this.w.put(BrandSafetyUtils.AdType.NATIVE, new NativeFinder(getInstance().T()));
            }
        }
    }

    public void i() {
        f29051z.set(true);
        CreativeInfoManager.g();
        af();
        ad();
        Logger.d(f29036b, "Loading singletons");
        g.a();
        k.a();
        com.safedk.android.analytics.brandsafety.i.a();
        ae();
        this.f29056y.set(true);
    }

    public void j() {
        if (StatsCollector.b()) {
            synchronized (this.w) {
                for (b bVar : this.w.values()) {
                    if (bVar.b() > 0) {
                        bVar.c();
                    }
                }
            }
        }
    }

    public void a(boolean z2, boolean z3) {
        try {
            if (f29049s.y()) {
                Logger.i("SafeDK", "SafeDK Device ID: " + f29048q.f29054u);
                Logger.i("SafeDK", "SafeDK version: " + getVersion());
            }
            Logger.d(f29036b, "configurationDownloadCompleted isOnUiThread = " + com.safedk.android.utils.k.c());
            if (f29048q == null) {
                Logger.d(f29036b, "instance is null, existing");
                return;
            }
            f29048q.b(false);
            if (!f29049s.y()) {
                Logger.d(f29036b, "SafeDK is disabled.");
                Logger.setDebugMode(false);
                com.safedk.android.internal.b.getInstance().clearBackgroundForegroundListeners();
                return;
            }
            ab();
            if (ag()) {
                Logger.setDebugMode(true);
            }
            Logger.d(f29036b, "Configuration download completed, configurationDownloadedSuccessfully=" + z2);
            Logger.d(f29036b, "configurationDownloadCompleted isMaxProcess " + z3);
            Logger.d(f29036b, "configurationDownloadCompleted isActive " + f29049s.y() + ", packageId = " + getInstance().l().getPackageName());
            if (f29049s.y() && z3 && !f29051z.get()) {
                f29051z.set(true);
                CreativeInfoManager.g();
                CreativeInfoManager.d();
                af();
                if (z2) {
                    Logger.d(f29036b, "Will attempt to load events from storage");
                    if (StatsCollector.c() != null) {
                        StatsCollector.c().d();
                    }
                } else {
                    ad();
                }
                ad();
                Logger.d(f29036b, "Loading singletons");
                g.a();
                k.a();
                com.safedk.android.analytics.brandsafety.i.a();
                ae();
            }
            this.f29056y.set(true);
        } catch (Throwable th) {
            Logger.e(f29036b, "Exception handling configuration event", th);
            new CrashReporter().caughtException(th);
        }
    }

    private static void af() {
        if (!f29050t.get()) {
            Logger.d(f29036b, "Starting reporter thread");
            StatsCollector.a(true);
            int A2 = f29049s.A();
            int D2 = f29049s.D();
            StatsReporter.a();
            StatsCollector.c().a(A2, com.safedk.android.internal.b.getInstance().isInBackground(), D2, StatsReporter.b());
            StatsCollector.a(false);
            StatsCollector.b(getInstance().r());
            f29050t.set(true);
            Logger.d(f29036b, "Reporter thread started");
            return;
        }
        Logger.d(f29036b, "Reporter thread already initialized, skipping");
    }

    public void a(Bundle bundle, boolean z2) {
        Logger.d(f29036b, "Updating configuration");
        boolean a2 = f29049s.a(bundle, true);
        if (a2) {
            a(bundle);
        }
        a(a2, z2);
    }

    private void a(Bundle bundle) {
        if (this.x != null) {
            Logger.d(f29036b, "Writing to shared preferences: " + bundle.toString());
            this.x.a(bundle);
        }
    }

    public static int k() {
        return f29045m;
    }

    public Context l() {
        return this.f29053r;
    }

    public boolean m() {
        return f29049s.z() || ag();
    }

    public boolean n() {
        return f29046n;
    }

    public boolean o() {
        return f29049s.y();
    }

    public boolean p() {
        return f29049s.s();
    }

    public boolean q() {
        return f29049s.t();
    }

    public boolean r() {
        return !s() && f29049s.y();
    }

    public boolean s() {
        if (this.x == null) {
            return true;
        }
        return this.x.b();
    }

    private boolean ag() {
        try {
            Set<String> H = f29049s.H();
            if (!H.contains("*")) {
                if (!H.contains(this.f29054u)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            Logger.e(f29036b, "Caught exception", th);
            new CrashReporter().caughtException(th);
            return false;
        }
    }

    public static boolean t() {
        return f29049s.C();
    }

    public List<String> u() {
        return f29049s.u();
    }

    public List<String> v() {
        return f29049s.v();
    }

    public DeviceData w() {
        return this.f29055v;
    }

    public Map<BrandSafetyUtils.AdType, b> x() {
        return this.w;
    }

    public com.safedk.android.analytics.brandsafety.a a(BrandSafetyUtils.AdType adType) {
        return this.w.get(adType);
    }

    public InterstitialFinder y() {
        return (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
    }

    public BannerFinder z() {
        return (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
    }

    public q A() {
        return (q) a(BrandSafetyUtils.AdType.MREC);
    }

    public NativeFinder B() {
        return (NativeFinder) a(BrandSafetyUtils.AdType.NATIVE);
    }

    public int C() {
        return f29049s.d();
    }

    public int D() {
        return f29049s.e();
    }

    public float E() {
        return f29049s.f();
    }

    public float F() {
        return f29049s.g();
    }

    public boolean G() {
        return f29049s.h();
    }

    public int H() {
        return f29049s.i();
    }

    public long I() {
        return f29049s.j();
    }

    public int J() {
        return f29049s.k();
    }

    public int K() {
        return f29049s.l();
    }

    public int L() {
        return f29049s.m();
    }

    public void a(final boolean z2) {
        try {
            D.execute(new Runnable() { // from class: com.safedk.android.SafeDK.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Logger.d(SafeDK.f29036b, "Reading configuration from shared preferences");
                        if (SafeDK.this.x != null) {
                            SafeDK.this.f29054u = SafeDK.this.x.a();
                            if (SafeDK.this.f29054u == null) {
                                SafeDK.this.ac();
                            }
                            Bundle e2 = SafeDK.this.x.e();
                            Logger.d(SafeDK.f29036b, "configurationBundle loaded : " + e2.toString());
                            if (e2 != null && !e2.isEmpty()) {
                                Logger.d(SafeDK.f29036b, "Parsing configuration from shared preferences");
                                SafeDK.f29049s.a(e2, false);
                            } else {
                                Logger.d(SafeDK.f29036b, "Configuration bundle from storage is empty");
                            }
                            SafeDK.this.a(false, z2);
                        }
                    } catch (Throwable th) {
                        Logger.e(SafeDK.f29036b, th.getMessage(), th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f29036b, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    public boolean a(Activity activity) {
        Logger.d(f29036b, "Starting interstitial finder in activity " + activity.getClass().getName());
        InterstitialFinder interstitialFinder = (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
        if (interstitialFinder == null) {
            return false;
        }
        interstitialFinder.c(activity);
        return true;
    }

    public void b(Activity activity) {
        Logger.d(f29036b, "Stopping interstitial finder in activity " + activity.getClass().getName());
        InterstitialFinder interstitialFinder = (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
        if (interstitialFinder != null) {
            interstitialFinder.e(activity);
        }
    }

    public void c(Activity activity) {
        Logger.d(f29036b, "Starting redirect monitoring in activity " + activity.getClass().getName());
        BannerFinder bannerFinder = (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
        if (bannerFinder != null) {
            bannerFinder.c(activity);
        }
    }

    public void a(String str) {
        synchronized (this.w) {
            Iterator<b> it = this.w.values().iterator();
            while (it.hasNext()) {
                it.next().c(str);
            }
        }
    }

    public void d(Activity activity) {
        if (o()) {
            Logger.d(f29036b, "onForegroundActivity " + activity.getClass().getName());
            if (getInstance().c() && this.f29055v == null) {
                Logger.d(f29036b, "Before reading shared prefs");
                this.f29055v = new DeviceData(this.f29053r, this.x);
            }
        }
    }

    public void e(Activity activity) {
        if (o()) {
            Logger.d(f29036b, "onBackgroundActivity " + activity.getClass().getName());
        }
    }

    public String b(String str) {
        JSONObject jSONObject;
        String str2 = null;
        if (this.x != null) {
            Logger.d(f29036b, "getSdkVersion getSdkVersion: " + str);
            JSONObject j2 = this.x.j();
            if (j2 != null) {
                Logger.d(f29036b, "getSdkVersion sdkVersionsJson=" + j2.toString());
            }
            try {
                jSONObject = j2.getJSONObject(str);
            } catch (Throwable th) {
            }
            if (jSONObject == null) {
                Logger.d(f29036b, "getSdkVersion sdkData is null");
            } else {
                Logger.d(f29036b, "getSdkVersion sdkData : " + jSONObject.toString());
                str2 = jSONObject.getString("sdk_version");
                Logger.d(f29036b, "getSdkVersion version : " + str2);
                Logger.d(f29036b, "return sdk version: " + str2);
            }
        }
        return str2;
    }

    public JSONObject M() {
        if (this.x == null) {
            return null;
        }
        return this.x.j();
    }

    @Api
    public String getUserId() {
        return this.f29054u;
    }

    public static String getVersion() {
        return a.f29059a;
    }

    public static boolean N() {
        return a.f29059a.contains("rc");
    }

    private void b(boolean z2) {
        boolean r2 = r();
        Logger.d(f29036b, "notifyMonitorUserActivityUpdate shouldMonitorUser is " + r2);
        CreativeInfoManager.a(r2);
        com.safedk.android.internal.b.setActiveMode(r2);
        com.safedk.android.analytics.brandsafety.i.a(r2);
        if (z2) {
            aa();
        }
    }

    public long O() {
        return f29049s.K();
    }

    public int P() {
        return f29049s.L();
    }

    public ArrayList<String> Q() {
        return f29049s.M();
    }

    public float R() {
        return f29049s.n();
    }

    public float S() {
        return f29049s.o();
    }

    public int T() {
        return f29049s.p();
    }

    public int U() {
        return f29049s.q();
    }

    public int V() {
        return f29049s.r();
    }

    public static boolean W() {
        return B.booleanValue();
    }

    public static void X() {
        Logger.d(f29036b, "setMaxInitialized started");
        B = true;
        if (!b()) {
            af();
        }
        CreativeInfoManager.b();
    }

    public static boolean Y() {
        boolean z2 = f29048q != null && f29049s != null && f29049s.y() && B.booleanValue();
        if (!z2) {
            Logger.d(f29036b, "isSafeDKFullyInitialized returned false , instance = " + f29048q + ",config = " + f29049s + ", config.isActive() = " + f29049s.y() + ", SafeDK.isMaxInitialized = " + B);
        }
        return z2;
    }
}
