package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.facebook.internal.ServerProtocol;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.IronSourceDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.i;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.j;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.k;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKSource;
import com.safedk.android.internal.SafeDKSourceMintegral;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.annotations.AdNetworkDependency;
import com.safedk.android.utils.annotations.SDKDependancy;
import com.safedk.android.utils.g;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.BufferedSource;

/* loaded from: classes.dex */
public class CreativeInfoManager {
    private static final String A = "multiAdCreatives";
    private static Map<String, CreativeInfo> B = null;
    private static Map<String, List<CreativeInfo>> D = null;
    private static final String E = "contentHashCodeToCreatives";
    private static Map<Integer, CreativeInfo> F = null;
    private static final String G = "webviewAddressToCreatives";
    private static Map<String, CreativeInfo> H = null;
    private static final String K = "IRONSOURCE_NETWORK";
    private static final String L = "IRONSOURCE_BIDDING";
    private static final String M = "VUNGLE_NETWORK";
    private static final String N = "VUNGLE_BIDDING";
    private static final String O = "UNITY_NETWORK";
    private static final String P = "UNITY_BIDDING";
    private static final String Q = "ADMOB_NETWORK";
    private static final String R = "ADMOB_BIDDING";
    private static final String S = "ADMOB_NATIVE_NETWORK";
    private static final String T = "MINTEGRAL_NETWORK";
    private static final String U = "MINTEGRAL_BIDDING";
    private static final String V = "FYBER_NETWORK";
    private static final String W = "FYBER_BIDDING";
    private static final String X = "INNERACTIVE_BIDDING";
    private static final String Y = "ADCOLONY_NETWORK";
    private static final String Z = "ADCOLONY_BIDDING";

    /* renamed from: a, reason: collision with root package name */
    public static final String f29419a = "mime-type";
    private static final String aA = "TAPJOY_BIDDING";
    private static final String aB = "VERIZON_NETWORK";
    private static final String aC = "VERIZON_BIDDING";
    private static final String aD = "YANDEX_NETWORK";
    private static final String aE = "YANDEX_BIDDING";
    private static final String aF = "LINE_NETWORK";
    private static final String aG = "VERVE_NETWORK";
    private static final String aH = "VERVE_BIDDING";
    private static final String aI = "BIDMACHINE_BIDDING";
    private static final String aJ = "MOLOCO_BIDDING";
    private static boolean aM = false;
    private static final String aa = "AMAZON_NETWORK";
    private static final String ab = "AMAZON_BIDDING";
    private static final String ac = "CHARTBOOST_NETWORK";
    private static final String ad = "CHARTBOOST_BIDDING";
    private static final String ae = "GOOGLE_AD_MANAGER_NETWORK";
    private static final String af = "GOOGLE_AD_MANAGER_BIDDING";
    private static final String ag = "GOOGLE_AD_MANAGER_NATIVE_NETWORK";
    private static final String ah = "INMOBI_NETWORK";
    private static final String ai = "INMOBI_BIDDING";
    private static final String aj = "INMOBI_NATIVE_BIDDING";
    private static final String ak = "MAIO_NETWORK";
    private static final String al = "MAIO_BIDDING";
    private static final String am = "MYTARGET_NETWORK";
    private static final String an = "MYTARGET_BIDDING";
    private static final String ao = "NEND_NETWORK";
    private static final String ap = "NEND_BIDDING";
    private static final String aq = "OGURY_NETWORK";
    private static final String ar = "OGURY_BIDDING";
    private static final String as = "OGURY_PRESAGE";
    private static final String at = "TIKTOK_NETWORK";
    private static final String au = "TIKTOK_BIDDING";
    private static final String av = "SMAATO_NETWORK";
    private static final String aw = "SMAATO_BIDDING";
    private static final String ax = "SNAP_NETWORK";
    private static final String ay = "SNAP_BIDDING";
    private static final String az = "TAPJOY_NETWORK";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29420b = "encoding";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29421c = "mraid://tpat?event";
    public static final String d = "checkpoint.0";
    public static final String e = "video.close";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29422f = "privacyButtonClick";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29423g = "fymraidvideo://";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29424h = "fyMraidVideoAd";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29425i = "fyMraidVideoAdCompleted";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29427k = "APPLOVIN_NETWORK";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29428l = "APPLOVIN_EXCHANGE";

    /* renamed from: m, reason: collision with root package name */
    public static final String f29429m = "APPLOVIN_DIRECTSOLD";

    /* renamed from: n, reason: collision with root package name */
    public static final String f29430n = "CUSTOM_NETWORK";

    /* renamed from: o, reason: collision with root package name */
    public static final String f29431o = "/mediate";

    /* renamed from: q, reason: collision with root package name */
    public static final String f29433q = "@!1:ad_fetch@!";

    /* renamed from: r, reason: collision with root package name */
    public static final String f29434r = ".rayjump.com/openapi/moreoffer";

    /* renamed from: s, reason: collision with root package name */
    public static final String f29435s = "mtgglobals.com/openapi/moreoffer";

    /* renamed from: t, reason: collision with root package name */
    public static final String f29436t = "/multiple_ads";

    /* renamed from: v, reason: collision with root package name */
    private static final String f29438v = "CreativeInfoManager";
    private static final String w = "timestamp";
    private static final String x = "urls";

    /* renamed from: z, reason: collision with root package name */
    private static final String f29440z = "adIdToCreatives";

    /* renamed from: y, reason: collision with root package name */
    private static final List<String> f29439y = new ArrayList();
    private static TreeMap<String, AdNetworkDiscovery> adNetworkDiscoveries = new TreeMap<>();
    private static final Map<String, Set<String>> C = new HashMap();
    private static final Map<String, String> I = new HashMap();
    private static final HashSet<String> J = new HashSet<>();

    /* renamed from: j, reason: collision with root package name */
    public static final Set<String> f29426j = new LinkedHashSetWithItemLimit(10);

    /* renamed from: p, reason: collision with root package name */
    public static final List<String> f29432p = Arrays.asList("ms.applovin.com", "ms.applvn.com", "ms4.applovin.com", "ms4.applvn.com");
    private static AtomicBoolean aK = new AtomicBoolean(false);
    private static final ExecutorService aL = Executors.newFixedThreadPool(2);

    /* renamed from: u, reason: collision with root package name */
    public static boolean f29437u = false;

    private static void init() {
        com.safedk.android.analytics.brandsafety.creatives.discoveries.b bVar = new com.safedk.android.analytics.brandsafety.creatives.discoveries.b();
        adNetworkDiscoveries.put(g.f30053h, bVar);
        adNetworkDiscoveries.put(g.f30053h, bVar);
        com.safedk.android.analytics.brandsafety.creatives.discoveries.c cVar = new com.safedk.android.analytics.brandsafety.creatives.discoveries.c();
        adNetworkDiscoveries.put(g.f30048a, cVar);
        adNetworkDiscoveries.put(g.f30048a, cVar);
    }

    public static int a() {
        return B.size();
    }

    public static void b() {
        Logger.d(f29438v, "getAdNetworkVersions started, adNetworkDiscoveries size is " + adNetworkDiscoveries.size());
        SdksMapping.init();
        Iterator<AdNetworkDiscovery> it = adNetworkDiscoveries.values().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static HashSet<String> c() {
        return J;
    }

    public static void a(String str, WebView webView, String str2) {
        Logger.d(f29438v, "handleMraidEvents started, sdkPackageName = " + str + " , WebView = " + webView + ", url = " + str2);
        if (str2 != null) {
            if (str2.startsWith(f29421c) || str2.startsWith(f29423g)) {
                String a2 = BrandSafetyUtils.a(webView);
                if (str2.endsWith(d) || str2.endsWith(f29424h)) {
                    a(str, a2, false);
                    return;
                }
                if (str2.endsWith(e) || str2.endsWith(f29425i)) {
                    a(str, a2, true);
                } else if (str2.endsWith(f29422f)) {
                    com.safedk.android.analytics.brandsafety.b.a(a2, ImpressionLog.f29265q, new ImpressionLog.a[0]);
                    a(str, a2);
                }
            }
        }
    }

    public static void a(String str, String str2) {
        List<CreativeInfo> a2 = SafeDK.getInstance().y().a(str, str2);
        List<CreativeInfo> a3 = SafeDK.getInstance().z().a(str, str2);
        List<CreativeInfo> a4 = SafeDK.getInstance().A().a(str, str2);
        if (a2 != null && a2.size() > 0) {
            Logger.d(f29438v, "requestNoSamplingUnity calling interstitial requestNoSampling, : address = " + str2);
            d(str, str2);
            return;
        }
        if (a3 != null && a3.size() > 0) {
            Logger.d(f29438v, "requestNoSamplingUnity calling banner requestNoSampling, : address = " + str2);
            a(BrandSafetyUtils.AdType.BANNER, str2);
        } else if (a4 != null && a4.size() > 0) {
            Logger.d(f29438v, "requestNoSamplingUnity calling MREC requestNoSampling, : address = " + str2);
            a(BrandSafetyUtils.AdType.MREC, str2);
        } else {
            Logger.d(f29438v, "requestNoSamplingUnity WebView is not a banner nor an MREC nor an interstitial, : address = " + str2);
        }
    }

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        ArrayList<CreativeInfo> f29492a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        CreativeInfo f29493b;

        private a() {
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map, c.a aVar) {
        if (aM && aK.get()) {
            Logger.d(f29438v, "handle prefetch started, networkName=" + str + ", url=" + str2);
            String b2 = b(str);
            if (b2 == null) {
                Logger.d(f29438v, "handle prefetch sdkPackage is null, skipping");
                return;
            }
            Logger.d(f29438v, "handle prefetch sdkPackage is " + b2);
            if (!g(str2) && !str2.equals(f29433q)) {
                Logger.d(f29438v, "handle prefetch Url is not a mediation url, skipping");
                return;
            }
            com.safedk.android.analytics.brandsafety.creatives.a i2 = i(b2);
            if (i2 != null) {
                Logger.d(f29438v, "handle prefetch sdk " + b2 + " config item SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN is " + i2.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN));
                if (i2.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN)) {
                    Logger.d(f29438v, "handle prefetch calling onAdFetchedImpl sdkPackage=" + b2 + ", url=" + str2 + ", prefetch=" + str3);
                    b(b2, str2, str3, map, aVar, null);
                    return;
                }
                return;
            }
            Logger.d(f29438v, "handle prefetch sdkPackage does not exist");
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        ArrayList<String> f29494a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        long f29495b;

        private b() {
        }
    }

    public static synchronized void d() {
        synchronized (CreativeInfoManager.class) {
            try {
                if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
                    if (!aK.get()) {
                        Logger.d(f29438v, "initCreativeInfoManager started");
                        f();
                        n();
                        boolean isEmpty = adNetworkDiscoveries.isEmpty();
                        init();
                        if (isEmpty) {
                            b();
                        }
                        aK.set(true);
                    } else {
                        Logger.d(f29438v, "initCreativeInfoManager already executed, skipping");
                    }
                }
            } catch (Throwable th) {
                Logger.e(f29438v, "Error initializing CreativeInfoManager ", th);
            }
        }
    }

    private static void n() {
        try {
            B = new PersistentConcurrentHashMap(f29440z);
            D = new PersistentConcurrentHashMap(A);
            F = new PersistentConcurrentHashMap(E);
            H = new PersistentConcurrentHashMap(G);
        } catch (InvalidParameterException e2) {
            Logger.e(f29438v, "Error initializing CreativeInfoManager class, ads caching will not be available", e2);
        }
    }

    public static void e() {
        f();
        adNetworkDiscoveries.put(g.d, new l());
        adNetworkDiscoveries.put(g.f30048a, new com.safedk.android.analytics.brandsafety.creatives.discoveries.c());
        adNetworkDiscoveries.put(g.f30051f, new IronSourceDiscovery());
        adNetworkDiscoveries.put(g.f30061p, new FyberDiscovery());
        adNetworkDiscoveries.put(g.f30054i, new com.safedk.android.analytics.brandsafety.creatives.discoveries.e());
        adNetworkDiscoveries.put(g.f30049b, new com.safedk.android.analytics.brandsafety.creatives.discoveries.a());
        adNetworkDiscoveries.put(g.f30056k, new k());
        adNetworkDiscoveries.put(g.f30066u, new i());
        adNetworkDiscoveries.put(g.f30069z, new com.safedk.android.analytics.brandsafety.creatives.discoveries.f());
        adNetworkDiscoveries.put(g.f30067v, new j());
        adNetworkDiscoveries.put(g.f30053h, new com.safedk.android.analytics.brandsafety.creatives.discoveries.b());
        B = new ConcurrentHashMap();
    }

    public static void f() {
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            J.add("APPLOVIN_NETWORK");
            J.add("APPLOVIN_EXCHANGE");
            J.add("APPLOVIN_DIRECTSOLD");
            J.add(f29430n);
            I.put("APPLOVIN_NETWORK", g.f30048a);
            I.put("APPLOVIN_EXCHANGE", g.f30048a);
            I.put("APPLOVIN_DIRECTSOLD", g.f30048a);
            I.put(K, g.f30051f);
            I.put(L, g.f30051f);
            I.put(M, g.d);
            I.put(N, g.d);
            I.put(O, g.f30056k);
            I.put(P, g.f30056k);
            I.put(Q, g.f30053h);
            I.put(R, g.f30053h);
            I.put(S, g.f30053h);
            I.put(T, g.f30060o);
            I.put(U, g.f30060o);
            I.put(V, g.f30061p);
            I.put(W, g.f30061p);
            I.put(X, g.f30061p);
            I.put(Y, g.f30049b);
            I.put(Z, g.f30049b);
            I.put(ac, g.f30050c);
            I.put(ad, g.f30050c);
            I.put(ae, g.f30053h);
            I.put(af, g.f30053h);
            I.put(ag, g.f30053h);
            I.put(ah, g.f30054i);
            I.put(ai, g.f30054i);
            I.put(aj, g.f30054i);
            I.put(ak, g.f30062q);
            I.put(al, g.f30062q);
            I.put(am, g.f30063r);
            I.put(an, g.f30063r);
            I.put(ao, g.f30064s);
            I.put(ap, g.f30064s);
            I.put(aq, g.f30065t);
            I.put(ar, g.f30065t);
            I.put(as, g.f30065t);
            I.put(at, g.f30066u);
            I.put(au, g.f30066u);
            I.put(av, g.f30067v);
            I.put(aw, g.f30067v);
            I.put(ax, g.w);
            I.put(ay, g.w);
            I.put(az, g.f30055j);
            I.put(aA, g.f30055j);
            I.put(aB, g.x);
            I.put(aC, g.x);
            I.put(aD, g.f30068y);
            I.put(aE, g.f30068y);
            I.put(aF, g.f30069z);
            I.put(aa, g.B);
            I.put(ab, g.B);
            I.put(aB, g.A);
            I.put(aC, g.A);
            I.put(aI, g.C);
            I.put(aJ, g.D);
        }
    }

    public static AdNetworkDiscovery.WebViewResourceMatchingMethod a(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return null;
        }
        return adNetworkDiscovery.b();
    }

    public static String b(String str) {
        String str2 = I.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    public static void a(boolean z2) {
        aM = z2;
        Logger.d(f29438v, "setting active mode to " + z2);
    }

    public static WebResourceResponse onWebViewResponse(String sdkPackageName, WebView webView, String url, WebResourceResponse response) {
        Logger.d(f29438v, "on webView response " + sdkPackageName + ", webview " + webView + ", url " + url);
        if (aM && aK.get()) {
            Logger.d(f29438v, "on webView response " + sdkPackageName + " url " + url + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return a(sdkPackageName, url, response);
        }
        return response;
    }

    public static WebResourceResponse onWebViewResponseWithHeaders(String sdkPackageName, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse response) {
        String a2;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                if (!aM || !aK.get()) {
                    Logger.d(f29438v, "on webView response SafeDK not initialized");
                } else {
                    String uri = webResourceRequest.getUrl().toString();
                    AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(sdkPackageName);
                    Logger.d(f29438v, "on webView response with headers " + sdkPackageName + ", webview " + webView + ", url " + uri + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    if (webResourceRequest != null && webResourceRequest.getRequestHeaders() != null) {
                        if (webResourceRequest != null && webResourceRequest.getRequestHeaders() != null && webResourceRequest.getRequestHeaders().size() > 0 && webResourceRequest.getRequestHeaders().containsKey("Accept")) {
                            Logger.d(f29438v, "web resource request accept header value is " + webResourceRequest.getRequestHeaders().get("Accept"));
                            a(sdkPackageName, webView, uri, webResourceRequest.getRequestHeaders(), (String) null);
                            if (adNetworkDiscovery != null) {
                                AdNetworkDiscovery.WebViewResourceMatchingMethod b2 = adNetworkDiscovery.b();
                                Logger.d(f29438v, "on webView response with headers - webView resource matching method for " + sdkPackageName + " is " + b2.name());
                                if (b2 == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO && (a2 = adNetworkDiscovery.a(uri, uri, new WeakReference<>(webView))) != null) {
                                    a(webView, sdkPackageName, a2);
                                }
                            }
                            if (adNetworkDiscovery != null && adNetworkDiscovery.d().b(AdNetworkConfiguration.SHOULD_SET_CI_AS_VIDEO_AD_ON_VIDEO_RESOURCE_LOAD)) {
                                String str = webResourceRequest.getRequestHeaders().get("Accept");
                                if (com.safedk.android.utils.k.z(uri) || (str != null && str.contains("video"))) {
                                    Logger.d(f29438v, "set active ad as video ad");
                                    f(sdkPackageName, BrandSafetyUtils.a(webView));
                                }
                            }
                        }
                    } else {
                        Logger.d(f29438v, "web resource request is null");
                    }
                }
            } else {
                Logger.d(f29438v, "Android SDK version too low.");
            }
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(f29438v, "Exception in on webView response with headers : ", th);
            } catch (Throwable th2) {
            }
        }
        return response;
    }

    private static void a(WebResourceResponse webResourceResponse, Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list != null && !list.isEmpty()) {
                hashMap.put(str, list.get(0));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(hashMap);
        }
    }

    private static WebResourceResponse a(String str, String str2, WebResourceResponse webResourceResponse) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "follow webview response if needed SafeDK not initialized");
            } else {
                Logger.d(f29438v, "follow webview response if needed for " + str + ", url " + str2);
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Bundle bundle = new Bundle();
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle)) {
                    if (webResourceResponse == null) {
                        URLConnection openConnection = new URL(str2).openConnection();
                        WebResourceResponse webResourceResponse2 = new WebResourceResponse(bundle.getString(f29419a, "text/javascript"), bundle.getString(f29420b, "UTF-8"), new com.safedk.android.internal.f(str, str2, openConnection.getInputStream(), null, false));
                        try {
                            a(webResourceResponse2, openConnection.getHeaderFields());
                            webResourceResponse = webResourceResponse2;
                        } catch (Throwable th) {
                            th = th;
                            webResourceResponse = webResourceResponse2;
                            Logger.d(f29438v, "following webView response failed: " + th.getMessage(), th);
                            return webResourceResponse;
                        }
                    } else if (!(webResourceResponse.getData() instanceof com.safedk.android.internal.f)) {
                        webResourceResponse.setData(new com.safedk.android.internal.f(str, str2, webResourceResponse.getData(), null, false));
                    }
                    Logger.d(f29438v, "following webView response " + str2 + " wrapping input stream in response: " + webResourceResponse + ", mime type: " + webResourceResponse.getMimeType() + ", encoding: " + webResourceResponse.getEncoding());
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return webResourceResponse;
    }

    public static InputStream a(String str, String str2, InputStream inputStream, Map<String, List<String>> map) {
        boolean z2 = false;
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "should follow input stream SafeDK not initialized");
                return inputStream;
            }
            Logger.d(f29438v, "follow input stream if needed for " + str + ", url " + str2 + " ad network discoveries=" + adNetworkDiscoveries.keySet());
            if (a(str, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                onResourceLoaded(str, null, str2);
            }
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            boolean z3 = adNetworkDiscovery != null && adNetworkDiscovery.a(str2);
            Logger.d(f29438v, "should follow input stream? " + (adNetworkDiscovery != null ? Boolean.valueOf(z3) : "null"));
            if (adNetworkDiscovery != null) {
                boolean d2 = adNetworkDiscovery.d(str2);
                boolean a2 = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
                Logger.d(f29438v, "enforce close VIV value for sdk " + str + " is " + a2 + ", is VIV returned " + d2 + " for url " + str2);
                boolean a3 = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
                Logger.d(f29438v, "enforce close value for sdk " + str + " is " + a3 + " for url " + str2);
                if (z3) {
                    Logger.d(f29438v, "following input stream for url " + str2);
                    if (a3 || (a2 && d2)) {
                        z2 = true;
                    }
                    return new com.safedk.android.internal.f(str, str2, inputStream, map, z2);
                }
                return inputStream;
            }
            Logger.d(f29438v, "no discovery class for " + str + " or discovery class does not follow this url.");
            return inputStream;
        } catch (Throwable th) {
            try {
                Logger.e(f29438v, th.getMessage(), th);
                new CrashReporter().caughtException(th);
                return inputStream;
            } catch (Throwable th2) {
                return inputStream;
            }
        }
    }

    @SDKDependancy(packageName = "okio")
    public static BufferedSource a(String str, String str2, BufferedSource bufferedSource, int i2) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "following source stream SafeDK not initialized");
            } else {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2)) {
                    Logger.d(f29438v, "following source stream for url " + str2);
                    bufferedSource = SafeDKSource.create(bufferedSource, i2);
                }
            }
        } catch (Throwable th) {
            Logger.e(f29438v, th.getMessage(), th);
            new CrashReporter().caughtException(th);
        }
        return bufferedSource;
    }

    @AdNetworkDependency(className = "com.mintegral.msdk.thrid.okio.BufferedSource")
    public static com.mintegral.msdk.thrid.okio.BufferedSource a(String str, String str2, com.mintegral.msdk.thrid.okio.BufferedSource bufferedSource, int i2) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "following source stream SafeDK not initialized");
            } else {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2)) {
                    Logger.d(f29438v, "following source stream for url " + str2);
                    bufferedSource = SafeDKSourceMintegral.create(bufferedSource, i2);
                }
            }
        } catch (Throwable th) {
            Logger.e(f29438v, th.getMessage(), th);
            new CrashReporter().caughtException(th);
        }
        return bufferedSource;
    }

    public static OutputStream a(String str, String str2, OutputStream outputStream) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "following output stream SafeDK not initialized");
            } else {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(str2)) {
                    Logger.d(f29438v, "following output stream for url " + str2);
                    outputStream = new com.safedk.android.internal.g(str, str2, outputStream);
                }
            }
        } catch (Throwable th) {
            try {
                Logger.e(f29438v, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
        return outputStream;
    }

    public static FileOutputStream a(String str, String str2, FileOutputStream fileOutputStream) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "following output stream for file SafeDK not initialized");
            } else {
                Logger.d(f29438v, "follow output file stream if needed sdk = " + str + ", path = " + str2 + ", stream " + fileOutputStream);
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(str2)) {
                    Logger.d(f29438v, "following output stream for file path " + str2);
                    fileOutputStream = new com.safedk.android.internal.e(str, str2, fileOutputStream);
                }
            }
        } catch (Throwable th) {
            try {
                Logger.e(f29438v, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
        return fileOutputStream;
    }

    public static boolean c(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return false;
        }
        return adNetworkDiscovery.a();
    }

    public static void viewOnMeasure(String sdkPackageName, View view, int width, int height) {
        AdNetworkDiscovery h2 = h(sdkPackageName);
        if (h2 != null) {
            h2.a(view, width, height);
        }
    }

    public static void onResourceLoaded(final String sdkPackageName, final WebView webView, final String resource) {
        try {
            if ((aM && aK.get()) || f29437u) {
                if (f29437u) {
                    c(sdkPackageName, webView, resource);
                } else {
                    aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.safedk.android.utils.k.b(CreativeInfoManager.f29438v, "on resource loaded executor started " + sdkPackageName + " url: " + resource);
                            CreativeInfoManager.c(sdkPackageName, webView, resource);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            Logger.e(f29438v, th.getMessage(), th);
        }
    }

    public static void b(String str, String str2) {
        Set<String> set = C.get(str);
        if (set == null) {
            set = new HashSet<>();
            C.put(str, set);
        }
        set.add(str2);
    }

    public static List<CreativeInfo> a(WebView webView, String str, String str2) {
        if (!f29437u && (!aM || !aK.get())) {
            return new ArrayList();
        }
        Logger.d(f29438v, "adIdFoundOnResource started with ad id " + str2);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            Logger.d(f29438v, "adIdFoundOnResource - packageName: " + str + " does not corresponds to any ad network");
            return new ArrayList();
        }
        String a2 = BrandSafetyUtils.a(webView);
        List<CreativeInfo> a3 = a(adNetworkDiscovery, str2);
        Logger.d(f29438v, "adIdFoundOnResource - ad id: " + str2 + " ci: " + a3);
        if (adNetworkDiscovery.d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS)) {
            b(str2, a2);
        }
        if (a3.size() == 0) {
            Logger.d(f29438v, "adIdFoundOnResource - ci list is empty, exiting");
            return a3;
        }
        for (CreativeInfo creativeInfo : a3) {
            com.safedk.android.utils.k.b(f29438v, "Ad identified, ci : " + creativeInfo);
            BrandSafetyUtils.AdType K2 = creativeInfo.K();
            creativeInfo.a((Object) webView);
            if (K2 == BrandSafetyUtils.AdType.INTERSTITIAL || K2 == BrandSafetyUtils.AdType.BANNER || K2 == BrandSafetyUtils.AdType.MREC) {
                com.safedk.android.utils.k.b(f29438v, "Ad identified, setting creative in ad finder, adType=" + K2 + ", click url=" + creativeInfo.M());
                a(creativeInfo, CreativeInfo.f29624l, str2);
                creativeInfo.b(F);
            } else if (a2 != null) {
                Logger.d(f29438v, "Linking ad id " + str2 + " to web view " + a2);
                H.put(a2, creativeInfo);
            }
        }
        adNetworkDiscovery.j(str2);
        return a3;
    }

    public static boolean a(String str, com.safedk.android.analytics.brandsafety.e eVar) {
        if (!aM || !aK.get()) {
            return false;
        }
        if (eVar.x() == null) {
            return false;
        }
        Iterator<String> it = C.keySet().iterator();
        while (it.hasNext()) {
            Set<String> set = C.get(it.next());
            if (set != null && set.contains(str)) {
                Iterator<String> it2 = eVar.x().iterator();
                while (it2.hasNext()) {
                    if (set.contains(it2.next())) {
                        Logger.d(f29438v, "should verify matching multiple webViews: found multiple webview addresses for one banner. webViewAddresses: " + set + ", views hierarchy: " + eVar.x());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Set<String> d(String str) {
        if (!aM || !aK.get()) {
            return new HashSet();
        }
        if (str == null) {
            return new HashSet();
        }
        Iterator<String> it = C.keySet().iterator();
        while (it.hasNext()) {
            Set<String> set = C.get(it.next());
            if (set != null && set.contains(str)) {
                Logger.d(f29438v, "getAllWebViewsForBanner: found multiple webviews. webviewAddress= " + str + ", addresses= " + set);
                return set;
            }
        }
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, WebView webView, String str2) {
        String str3;
        String str4;
        String a2;
        try {
            if (f29437u || (aM && aK.get())) {
                String F2 = com.safedk.android.utils.k.F(str2);
                if (webView != null) {
                    String a3 = BrandSafetyUtils.a(webView);
                    Logger.d(f29438v, "Resource loaded. sdk: " + str + ", webView: " + webView + " resource: " + F2);
                    a(str, a3, str2);
                    str3 = a3;
                } else {
                    Logger.d(f29438v, "Resource loaded. sdk: " + str + ", webView: null , resource: " + F2);
                    str3 = null;
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(F2, str3) && (a2 = adNetworkDiscovery.a(F2, F2, new WeakReference<>(webView))) != null) {
                    Logger.d(f29438v, "Resource loaded adId = " + a2 + ", activity = " + com.safedk.android.utils.l.a(webView));
                    List<CreativeInfo> a4 = a(webView, str, a2);
                    if (a4.size() > 0) {
                        str4 = a4.get(0).F();
                        a(str, webView, F2, (Map<String, String>) null, str4);
                    }
                }
                str4 = null;
                a(str, webView, F2, (Map<String, String>) null, str4);
            }
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(f29438v, "resource loaded failed", th);
        }
    }

    public static void a(String str, String str2, String str3) {
        if (aM && aK.get() && !str.equals(g.f30060o)) {
            if (str3.contains(f29434r) || str3.contains(f29435s)) {
                Logger.d(f29438v, "addMintegralDspMultipleAdsDownstreamStruct - started, sdkPackageName= " + str + ", webViewAddress= " + str2 + ", url= " + str3);
                BannerFinder z2 = SafeDK.getInstance().z();
                if (z2 != null) {
                    List<CreativeInfo> a2 = z2.a(str, str2);
                    if (a2 != null && a2.size() > 0) {
                        Logger.d(f29438v, "addMintegralDspMultipleAdsDownstreamStruct - found CIs by webView= " + a2);
                        for (CreativeInfo creativeInfo : a2) {
                            if (creativeInfo.ah()) {
                                Logger.d(f29438v, "addMintegralDspMultipleAdsDownstreamStruct - CI is already multi, not adding /multiple_ads to CI= " + creativeInfo);
                            } else if (creativeInfo.h() != null && creativeInfo.h().contains("/multiple_ads")) {
                                Logger.d(f29438v, "addMintegralDspMultipleAdsDownstreamStruct - already added /multiple_ads to CI= " + creativeInfo);
                            } else {
                                Logger.d(f29438v, "addMintegralDspMultipleAdsDownstreamStruct - adding /multiple_ads to CI= " + creativeInfo);
                                creativeInfo.d("/multiple_ads");
                            }
                        }
                        return;
                    }
                    Logger.d(f29438v, "addMintegralDspMultipleAdsDownstreamStruct - CI list is null or empty. sdkPackageName = " + str + ", webViewAddress = " + str2);
                }
            }
        }
    }

    private static void f(String str, String str2) {
        if (aM && aK.get()) {
            Logger.d(f29438v, "set active ad in ad finder as video ad started, sdkPackageName = " + str + ", webViewAddress = " + str2);
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
            while (it.hasNext()) {
                List<CreativeInfo> a2 = it.next().a(str, str2);
                if (a2 != null && a2.size() > 0) {
                    for (CreativeInfo creativeInfo : a2) {
                        Logger.d(f29438v, "set active ad in ad finder as video ad, ci: " + creativeInfo);
                        creativeInfo.d(true);
                    }
                } else {
                    Logger.d(f29438v, "set active ad in ad finder as video ad, ci list is null or empty. sdkPackageName = " + str + ", webViewAddress = " + str2);
                }
            }
        }
    }

    public static void onWebViewPageFinished(String sdkPackage, WebView webView, String url) {
        Logger.d(f29438v, "WebView page finished, WebView : " + webView.toString() + ", url " + url);
    }

    public static void onMaxAdViewCreated(MaxAdView maxAdView, MaxAdFormat adFormat, String adUnitId) {
        Logger.d(f29438v, "Max ad view created: " + maxAdView + " ad format: " + adFormat + " ad unit id: " + adUnitId);
        if (maxAdView != null && adFormat != null) {
            if (adFormat == MaxAdFormat.BANNER || adFormat == MaxAdFormat.LEADER || adFormat == MaxAdFormat.MREC) {
                BannerFinder.a(adUnitId, maxAdView, adFormat == MaxAdFormat.MREC ? BrandSafetyUtils.AdType.MREC : BrandSafetyUtils.AdType.BANNER);
            }
        }
    }

    public static void a(MaxAdView maxAdView) {
        if (maxAdView != null) {
            String e2 = com.safedk.android.utils.k.e(com.safedk.android.utils.f.L(), maxAdView.toString());
            if (e2 != null) {
                Logger.d(f29438v, "Max ad view destroyed: " + maxAdView + " ad unit id: " + e2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                BannerFinder.a(e2, maxAdView);
            } else {
                Logger.d(f29438v, "Max ad view destroyed: " + maxAdView);
                BannerFinder.a(maxAdView);
            }
        }
    }

    public static void onMaxNativeAdLoaded(final MaxNativeAdView maxAdView, final MaxAd ad2) {
        if (com.safedk.android.utils.k.c()) {
            aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.12
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(MaxNativeAdView.this, ad2);
                }
            });
        } else {
            b(maxAdView, ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (aM && aK.get() && maxAd != null) {
            String adUnitId = maxAd.getAdUnitId();
            Bundle a2 = com.safedk.android.analytics.brandsafety.creatives.discoveries.c.a(maxAd);
            if (a2 != null) {
                String string = a2.getString("eventId");
                String string2 = a2.getString(ServerProtocol.DIALOG_PARAM_SDK_VERSION);
                String string3 = a2.getString("bidResponse");
                Logger.d(f29438v, "Max native ad loaded: " + maxNativeAdView + " ad unit id: " + adUnitId + ", network: " + maxAd.getNetworkName() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                NativeFinder B2 = SafeDK.getInstance().B();
                if (B2 != null && maxNativeAdView != null) {
                    B2.a(string, string2, maxNativeAdView);
                }
                b(string2, string3, maxNativeAdView);
            }
        }
    }

    public static void onMaxNativeAdCreated(MaxNativeAdView maxAdView) {
        NativeFinder B2;
        if (aM && aK.get()) {
            Logger.d(f29438v, "Max native ad created: " + maxAdView);
            if (maxAdView != null && (B2 = SafeDK.getInstance().B()) != null) {
                B2.a(maxAdView);
            }
        }
    }

    private static void a(String str, WebView webView, String str2, Map<String, String> map, String str3) {
        if (aM && aK.get() && str != null) {
            Logger.d(f29438v, "handle resource attachment if necessary started sdk=" + str + ", webview= " + webView + ", resource=" + str2 + ", headers=" + map);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery != null) {
                if (adNetworkDiscovery.k(str2)) {
                    Logger.d(f29438v, "handle resource attachment if necessary. should stop collecting resources.  sdk=" + str + ", webview= " + webView + ", resource=" + str2);
                    SafeDK.getInstance().y().l(str);
                    return;
                }
                AdNetworkDiscovery.WebViewResourceMatchingMethod b2 = adNetworkDiscovery.b();
                Logger.d(f29438v, "handle resource attachment if necessary, matching method for " + str + " is " + b2.name());
                if (webView != null && (b2 == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP || b2 == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO)) {
                    e.a(str, webView, str2, map);
                } else {
                    e.a(str, webView, str2, str3, map);
                }
            }
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map) {
        a(str, str2, str3, map, (String) null);
    }

    public static void a(final String str, final String str2, final String str3, final Map<String, List<String>> map, final String str4) {
        try {
            if ((aM && aK.get()) || f29437u) {
                Logger.d(f29438v, "ad fetched package: " + str + " url: " + str2 + " , content size=" + str3.length());
                if (a(str, AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false)) {
                    Logger.d(f29438v, "ad fetched package: " + str + " searching for VastAdTagUri");
                    f.b(str3);
                }
                if (f29437u) {
                    Logger.d(f29438v, "ad fetched executor service started " + str + " url: " + str2);
                    b(str, str2, str3, map, null, str4);
                } else {
                    aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.13
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(CreativeInfoManager.f29438v, "ad fetched executor service started " + str + " url: " + str2);
                            CreativeInfoManager.b(str, str2, str3, map, null, str4);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            Logger.e(f29438v, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2, String str3, Map<String, List<String>> map, c.a aVar, String str4) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery != null) {
                if (str3.length() > 204800 || str2.endsWith(".gif") || str2.endsWith(".mp4") || str2.endsWith(".jpg") || str2.endsWith(".jpeg")) {
                    Logger.d(f29438v, "ad fetched Impl sdk: " + str + " url: " + str2 + " , content size=" + str3.length());
                } else {
                    com.safedk.android.utils.k.b(f29438v, "ad fetched Impl sdk: " + str + ", originalUrl: " + str2 + " eventId: " + (aVar == null ? "" : aVar.f29548a) + ", value: " + str3);
                }
                long nanoTime = System.nanoTime();
                List<CreativeInfo> a2 = adNetworkDiscovery.a(str2, str3, map, aVar);
                int size = a2 != null ? a2.size() : 0;
                Logger.d(f29438v, "ad network discovery generate info sdk " + str + " took " + ((System.nanoTime() - nanoTime) / 1000000) + " ms, number of CIs: " + size);
                if (size > 0) {
                    for (CreativeInfo creativeInfo : a2) {
                        if (creativeInfo.J()) {
                            Logger.d(f29438v, "ci is empty");
                        } else {
                            if (str4 != null) {
                                creativeInfo.u("isci=(" + str4 + ")");
                            }
                            Logger.d(f29438v, "ci saved id=" + creativeInfo.L() + ", is multi ad? " + creativeInfo.ah() + ", video url=" + creativeInfo.H());
                            if (b(creativeInfo)) {
                                adNetworkDiscovery.i(creativeInfo.L());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            Logger.d(f29438v, "no discovery object found for SDK " + str);
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(f29438v, "Exception in ad fetch: " + th.getMessage(), th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(CreativeInfo creativeInfo) {
        List<CreativeInfo> list = D.get(creativeInfo.L());
        if (list == null) {
            list = new ArrayList<>();
            D.put(creativeInfo.L(), list);
        }
        Logger.d(f29438v, "storing creative info to multi ad CI list: " + creativeInfo);
        list.add(creativeInfo);
    }

    public static boolean b(CreativeInfo creativeInfo) {
        boolean z2 = false;
        if (f29437u || (aM && aK.get())) {
            if (creativeInfo != null && creativeInfo.L() != null) {
                synchronized (B) {
                    if (creativeInfo.ah()) {
                        a(creativeInfo);
                        if (B.containsKey(creativeInfo.L())) {
                        }
                    }
                    boolean a2 = a(creativeInfo.Q(), AdNetworkConfiguration.SHOULD_OVERWRITE_REPEATED_CI_IN_CREATIVE_INFO_MANAGER_LISTS, true);
                    if (B.containsKey(creativeInfo.L()) && !a2 && creativeInfo.ad()) {
                        Logger.d(f29438v, "store Creative Info CI already exists, do not overwrite it. ID: " + creativeInfo.L());
                    } else {
                        B.put(creativeInfo.L(), creativeInfo);
                        Logger.d(f29438v, "store Creative Info CI stored, sdkPackageName = " + creativeInfo.Q() + ", ID: " + creativeInfo.L());
                        if (creativeInfo.a(F)) {
                            Logger.d(f29438v, "store Creative Info storing creative info with hashcode: " + creativeInfo.S() + ", CI: " + creativeInfo);
                        } else {
                            Logger.d(f29438v, "store Creative Info creative info content hashcode is null, cannot store it.");
                        }
                        z2 = true;
                    }
                }
            } else {
                Logger.d(f29438v, "store Creative Info creative info is null or CIs ID is null, cannot store it.");
            }
        }
        return z2;
    }

    public static boolean b(WebView webView, String str, String str2) {
        if (!aM || !aK.get()) {
            return false;
        }
        Logger.d(f29438v, "ad ID found on data loaded started with ad id " + str2);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            Logger.d(f29438v, "ad ID found on data loaded - packageName: " + str + " does not corresponds to any ad network");
            return false;
        }
        String a2 = BrandSafetyUtils.a(webView);
        List<CreativeInfo> a3 = a(adNetworkDiscovery, str2);
        Logger.d(f29438v, "ad ID found on data loaded - ad id: " + str2 + " ci: " + a3);
        if (a3.size() == 0) {
            Logger.d(f29438v, "ad ID found on data loaded - ci list is empty, exiting");
            return false;
        }
        for (CreativeInfo creativeInfo : a3) {
            if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                creativeInfo.b(F);
                creativeInfo.a((Object) webView);
                a(creativeInfo, CreativeInfo.f29624l, str2);
                if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    SafeDKWebAppInterface.a(a2);
                    e.a(a2);
                }
            }
        }
        return true;
    }

    public static void a(final String str, final String str2, final WebView webView, final String str3) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str3);
            if (adNetworkDiscovery != null) {
                adNetworkDiscovery.a(webView);
            }
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "data loaded to webView SafeDK not initialized for package: " + str3 + " and webview: " + webView);
                return;
            }
            if (str2 == null) {
                Logger.d(f29438v, "data loaded to webView is null for package: " + str3 + " and webview: " + webView);
                return;
            }
            final String I2 = com.safedk.android.utils.k.I(str2);
            Logger.d(f29438v, "data loaded to webView " + webView + ", package: " + str3 + ", baseUrl: " + str + ", content size is " + I2.length());
            com.safedk.android.utils.k.b(f29438v, "data loaded to webView: " + webView + ", package: " + str3 + ", value: " + I2);
            aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.14
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdNetworkDiscovery adNetworkDiscovery2 = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str3);
                        if (adNetworkDiscovery2 != null) {
                            String a2 = adNetworkDiscovery2.a(I2, str, new WeakReference<>(webView));
                            Logger.d(CreativeInfoManager.f29438v, "data loaded to webView ad id " + a2);
                            String a3 = BrandSafetyUtils.a(webView);
                            if (a2 != null) {
                                if (CreativeInfoManager.b(webView, str3, a2)) {
                                    adNetworkDiscovery2.j(a2);
                                    return;
                                }
                                return;
                            }
                            int c2 = adNetworkDiscovery2.c(str2);
                            Logger.d(CreativeInfoManager.f29438v, String.format("Trying to match by hashcode: %s .contentHashCodeToCreatives size: %s", Integer.valueOf(c2), Integer.valueOf(CreativeInfoManager.F.size())));
                            if (c2 == 0) {
                                Logger.d(CreativeInfoManager.f29438v, "hashcode 0, with value: " + str2);
                            }
                            for (CreativeInfo creativeInfo : CreativeInfoManager.b(c2)) {
                                Logger.d(CreativeInfoManager.f29438v, "getting Base64 resources");
                                ArrayList<String> i2 = com.safedk.android.utils.k.i(str2);
                                if (i2 != null && i2.size() > 0) {
                                    creativeInfo.b(i2);
                                }
                                creativeInfo.a((Object) webView);
                                if (!adNetworkDiscovery2.d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                                    synchronized (CreativeInfoManager.B) {
                                        CreativeInfoManager.B.remove(creativeInfo.L());
                                    }
                                }
                                if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                                    SafeDKWebAppInterface.a(a3);
                                    e.a(a3);
                                }
                                if (TextUtils.isEmpty(a3)) {
                                    Logger.d(CreativeInfoManager.f29438v, "webView address is empty - can't link creative info to webview");
                                }
                                Logger.d(CreativeInfoManager.f29438v, "linking " + creativeInfo.S() + " to web view " + a3);
                                CreativeInfoManager.H.put(a3, creativeInfo);
                                if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                                    CreativeInfoManager.b(creativeInfo, CreativeInfo.f29622j, creativeInfo.S());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        new CrashReporter().caughtException(th);
                        Logger.d(CreativeInfoManager.f29438v, "Exception in data loaded to webView : ", th);
                    }
                }
            });
        } catch (Throwable th) {
            try {
                Logger.d(f29438v, "Exception in data loaded to webView : ", th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static List<CreativeInfo> a(AdNetworkDiscovery adNetworkDiscovery, String str) {
        CreativeInfo remove;
        if (!f29437u && (!aM || !aK.get())) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (B) {
            if (adNetworkDiscovery.d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                remove = B.get(str);
                if (remove != null) {
                    Logger.d(f29438v, "get CIs by ad id, reset expiration time as network support prefetch reuse. ci id = " + remove.L());
                    remove.ac();
                }
            } else {
                remove = B.remove(str);
            }
        }
        if (remove != null) {
            com.safedk.android.utils.k.b(f29438v, "get CIs by ad id, ci: " + remove);
            if (!remove.ah()) {
                arrayList.add(remove);
            } else {
                List<CreativeInfo> remove2 = D.remove(str);
                if (remove2 != null) {
                    arrayList.addAll(remove2);
                }
            }
        }
        Logger.d(f29438v, "get CIs by ad id, number of CIs: " + arrayList.size() + ", ad id: " + str);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<CreativeInfo> b(int i2) {
        List<CreativeInfo> remove;
        ArrayList arrayList = new ArrayList();
        CreativeInfo remove2 = F.remove(Integer.valueOf(i2));
        if (remove2 != null) {
            arrayList.add(remove2);
            if (remove2.ah() && (remove = D.remove(remove2.L())) != null) {
                arrayList.addAll(remove);
            }
        }
        Logger.d(f29438v, "get CIs by hash code, number of CIs: " + arrayList.size() + ", hash code: " + i2);
        return arrayList;
    }

    public static List<CreativeInfo> e(String str) {
        return D.remove(str);
    }

    public static void b(final String str, final String str2, final String str3) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "File output stream completed SafeDK not initialized");
            } else {
                Logger.d(f29438v, "File output stream completed " + str + " , " + str2);
                aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.15
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                if (adNetworkDiscovery.d().b(AdNetworkConfiguration.FILE_WRITE_AS_NETWORK_READ)) {
                                    CreativeInfoManager.b(str, str2, str3, null, null, null);
                                } else {
                                    adNetworkDiscovery.d(str2, str3);
                                }
                            } else {
                                Logger.d(CreativeInfoManager.f29438v, "no discovery object for SDK " + str);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.f29438v, th.getMessage(), th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            try {
                Logger.e(f29438v, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void c(final String str, final String str2, final String str3) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "handling output stream SafeDK not initialized");
            } else {
                aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.16
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                String e2 = adNetworkDiscovery.e(str2, str3);
                                if (e2 != null) {
                                    for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, e2)) {
                                        if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                                            CreativeInfoManager.a(creativeInfo, CreativeInfo.f29625m, e2);
                                            Logger.d(CreativeInfoManager.f29438v, "set CI in ad finder: " + creativeInfo);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            Logger.d(CreativeInfoManager.f29438v, "no discovery object for SDK " + str);
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.f29438v, th.getMessage(), th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(f29438v, "Exception handling output stream : " + th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static CreativeInfo c(String str, String str2) {
        try {
            if (!aM || !aK.get()) {
                return null;
            }
            CreativeInfo remove = H.remove(str2);
            if (remove != null) {
                if (remove.L() != null && !adNetworkDiscoveries.get(str).d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                    synchronized (B) {
                        B.remove(remove.L());
                    }
                }
                remove.b(F);
                return remove;
            }
            return remove;
        } catch (Throwable th) {
            Logger.e(f29438v, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return null;
        }
    }

    private static void d(final String str, final String str2, final String str3) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "handle shown ad SafeDK not initialized");
            } else {
                aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.17
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                String c2 = adNetworkDiscovery.c(str3, str2);
                                if (c2 != null) {
                                    Logger.d(CreativeInfoManager.f29438v, "handle shown ad - adId = " + c2);
                                    for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, c2)) {
                                        Logger.d(CreativeInfoManager.f29438v, "clickUrl = " + creativeInfo.M());
                                        if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                                            CreativeInfoManager.a(creativeInfo, CreativeInfo.f29624l, c2);
                                            creativeInfo.b(CreativeInfoManager.F);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            Logger.d(CreativeInfoManager.f29438v, "no discovery object for SDK " + str);
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.d(CreativeInfoManager.f29438v, "Exception when handling shown ad : " + th.getMessage(), th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.d(f29438v, "handling shown ad failed", th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final BrandSafetyEvent.AdFormatType adFormatType, final Object obj) {
        try {
            if (aM && aK.get()) {
                aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.18
                    @Override // java.lang.Runnable
                    public void run() {
                        String c2;
                        try {
                            Logger.d(CreativeInfoManager.f29438v, "handling shown ad by api, sdk: " + str + ", message: " + str2 + ", ad format type: " + adFormatType + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null && (c2 = adNetworkDiscovery.c(str2, str2)) != null) {
                                com.safedk.android.utils.k.b(CreativeInfoManager.f29438v, "ad id: " + c2);
                                for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, c2)) {
                                    if (adFormatType == BrandSafetyEvent.AdFormatType.INTER || adFormatType == BrandSafetyEvent.AdFormatType.NATIVE) {
                                        creativeInfo.a(obj);
                                        CreativeInfoManager.a(creativeInfo, CreativeInfo.f29625m, c2);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.d(CreativeInfoManager.f29438v, "handling shown ad by api failed", th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.d(f29438v, "Exception handling shown ad by api :" + th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static List<CreativeInfo> a(String str, Set<String> set) {
        try {
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.e(f29438v, th.getMessage());
        }
        if (!aM || !aK.get()) {
            Logger.d(f29438v, "SafeDK not initialized");
            return null;
        }
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            Pair<String, List<String>> a2 = adNetworkDiscovery.a(set);
            if (a2 != null) {
                String str2 = (String) a2.first;
                List<String> list = (List) a2.second;
                Collections.sort(list);
                Logger.d(f29438v, "adId = " + str2);
                List<CreativeInfo> a3 = a(adNetworkDiscovery, str2);
                for (CreativeInfo creativeInfo : a3) {
                    creativeInfo.a(list);
                    Logger.d(f29438v, "clickUrl = " + creativeInfo.M());
                    if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                        creativeInfo.b(F);
                    }
                }
                return a3;
            }
        } else {
            Logger.d(f29438v, "no discovery object for SDK " + str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(CreativeInfo creativeInfo, String str, int i2) {
        a(creativeInfo, str, i2 + "");
    }

    public static void a(CreativeInfo creativeInfo, String str, String str2) {
        boolean a2;
        if (aM && aK.get()) {
            if (creativeInfo.V() != null) {
                Logger.d(f29438v, "setting creative in ad finder - ci already have matching method. ci: " + creativeInfo);
                return;
            }
            com.safedk.android.utils.k.b(f29438v, "setting creative in ad finder, ci id =" + creativeInfo.L());
            com.safedk.android.analytics.brandsafety.a a3 = SafeDK.getInstance().a(creativeInfo.K());
            if (a3 != null) {
                if (a(creativeInfo.Q(), AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true)) {
                    a2 = a3.a(new o(creativeInfo, str, str2));
                } else {
                    a2 = a3.a(new o(creativeInfo, str, null));
                }
                Logger.d(f29438v, "setting creative in ad finder updating ci " + a2 + ", matching method=" + str + ", ad id=" + creativeInfo.L() + ", ad type=" + creativeInfo.K());
                return;
            }
            Logger.d(f29438v, "setting creative in ad finder - cannot update ad finder");
        }
    }

    public static void d(String str, String str2) {
        if (aM && aK.get()) {
            Logger.d(f29438v, "request to stop take screenshots from current interstitial impression received for package " + str);
            InterstitialFinder y2 = SafeDK.getInstance().y();
            if (y2 == null) {
                Logger.d(f29438v, "interstitial finder is null, exiting");
            } else {
                y2.b(str, str2, false);
            }
        }
    }

    public static void a(BrandSafetyUtils.AdType adType, String str) {
        if (aM && aK.get()) {
            Logger.d(f29438v, "request to stop take screenshots from current " + adType.name() + " impression received");
            BannerFinder bannerFinder = (BannerFinder) SafeDK.getInstance().a(adType);
            if (bannerFinder == null) {
                Logger.d(f29438v, adType.name() + " finder is null, exiting");
            } else {
                bannerFinder.l(str);
            }
        }
    }

    public static void e(String str, String str2) {
        CreativeInfo creativeInfo;
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        synchronized (B) {
            if (adNetworkDiscovery != null) {
                if (adNetworkDiscovery.d().b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                    creativeInfo = B.get(str2);
                    if (creativeInfo != null) {
                        Logger.d(f29438v, "remove CIs by ad id, reset expiration time as network support prefetch reuse. ci id = " + creativeInfo.L());
                        creativeInfo.ac();
                    }
                }
            }
            creativeInfo = B.remove(str2);
        }
        if (creativeInfo != null) {
            creativeInfo.b(F);
            creativeInfo.c(H);
        }
    }

    public static void a(final String str, final Object obj, final Object obj2) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "Media player set data source event SafeDK not initialized");
            } else {
                aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.19
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.f29438v, "Media player set data source event received " + obj + ", video file " + obj2);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                adNetworkDiscovery.b(obj, obj2);
                            } else {
                                Logger.d(CreativeInfoManager.f29438v, "no discovery object found for SDK " + str);
                            }
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.e(CreativeInfoManager.f29438v, th.getMessage());
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(f29438v, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final Object obj) {
        try {
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "media player start SafeDK not initialized");
            } else {
                aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.f29438v, "media player start event " + obj);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                String b2 = adNetworkDiscovery.b(obj);
                                if (b2 != null) {
                                    for (CreativeInfo creativeInfo : CreativeInfoManager.a(adNetworkDiscovery, b2)) {
                                        creativeInfo.a(obj);
                                        Logger.d(CreativeInfoManager.f29438v, "calling set creative in ad finder after media player start called. video url: " + creativeInfo.H());
                                        CreativeInfoManager.a(creativeInfo, CreativeInfo.f29623k, b2);
                                    }
                                    return;
                                }
                                return;
                            }
                            Logger.d(CreativeInfoManager.f29438v, "no discovery object found for SDK " + str);
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.d(CreativeInfoManager.f29438v, "Media player start event error ", th);
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.d(f29438v, "Media player start event error ", th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void b(final String str, final Object obj, final Object obj2) {
        try {
            Logger.d(f29438v, "Ad Object ready");
            if (!aM || !aK.get()) {
                Logger.d(f29438v, "Ad Object ready SafeDK not initialized");
                Logger.printStackTrace(f29438v);
            } else {
                aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(CreativeInfoManager.f29438v, "Executor started " + str + " ad instance: " + obj + ", matching object: " + obj2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        CreativeInfoManager.d(str, obj, obj2);
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(f29438v, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Object obj, Object obj2) {
        try {
            Logger.d(f29438v, "ad object ready impl " + obj);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery != null) {
                CreativeInfo a2 = adNetworkDiscovery.a(obj);
                if (a2 != null) {
                    a2.a(obj2);
                    if (BrandSafetyUtils.AdType.INTERSTITIAL.equals(a2.K()) || BrandSafetyUtils.AdType.NATIVE.equals(a2.K()) || BrandSafetyUtils.AdType.BANNER.equals(a2.K()) || BrandSafetyUtils.AdType.MREC.equals(a2.K())) {
                        Logger.d(f29438v, "calling set creative in ad finder with " + a2);
                        a(a2, CreativeInfo.f29626n, "");
                    }
                    e(str, a2.L());
                    return;
                }
                Logger.d(f29438v, "no CI returned.");
                adNetworkDiscovery.a(obj, obj2);
                return;
            }
            Logger.d(f29438v, "ad object ready impl no discovery object for SDK " + str);
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(f29438v, "ad object ready impl error ", th);
        }
    }

    public static void onVideoCompleted(final String sdkPackageName, final Object source) {
        if (com.safedk.android.utils.k.c()) {
            aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.4
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(sdkPackageName, source);
                }
            });
        } else {
            c(sdkPackageName, source);
        }
    }

    public static void f(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.y() != null) {
            safeDK.y().j(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object obj) {
        if (aM && aK.get()) {
            Logger.d(f29438v, "Video completed event sdk=" + str + ", source " + obj + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK != null && safeDK.y() != null) {
                safeDK.y().a(str, obj);
            }
        }
    }

    public static void a(final String str, final String str2, final boolean z2) {
        if (com.safedk.android.utils.k.c()) {
            aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.5
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(str, str2, z2);
                }
            });
        } else {
            c(str, str2, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2, boolean z2) {
        boolean z3;
        if (aM && aK.get()) {
            Logger.d(f29438v, "Video completed event sdk=" + str + ", view address=" + str2 + ", completed? " + z2);
            boolean z4 = false;
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK == null) {
                z3 = false;
            } else {
                Iterator<com.safedk.android.analytics.brandsafety.b> it = safeDK.x().values().iterator();
                while (true) {
                    z3 = z4;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        z4 = it.next().a(str, str2, z2) | z3;
                    }
                }
            }
            if (!z3 && !z2) {
                Logger.d(f29438v, "Video completed event added to videoStartViewList, sdk=" + str + ", view address=" + str2);
                f29426j.add(str2);
            }
        }
    }

    public static void onViewClicked(final String sdkPackageName, final View view) {
        Logger.d(f29438v, "View clicked event sdk=" + sdkPackageName + ", view id = " + Integer.toString(view.getId(), 16));
        if (com.safedk.android.utils.k.c()) {
            aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.6
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(sdkPackageName, view);
                }
            });
        } else {
            c(sdkPackageName, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, View view) {
        try {
            Logger.d(f29438v, "View clicked event sdk=" + str + ", view id = " + Integer.toString(view.getId(), 16) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (aM && aK.get()) {
                if (view == null) {
                    Logger.d(f29438v, "View clicked event sdk=" + str + ", view=null, exiting.");
                } else {
                    AdNetworkDiscovery h2 = h(str);
                    if (h2 != null) {
                        h2.d(view);
                    } else {
                        Logger.d(f29438v, "clicked from unsupported SDK: " + str);
                    }
                }
            }
        } catch (Throwable th) {
            Logger.e(f29438v, "View clicked event exception", th);
        }
    }

    public static boolean onViewTouched(final String sdkPackageName, final View view, final MotionEvent motionEvent) {
        Logger.d(f29438v, "View touched event sdk=" + sdkPackageName + ", view id = " + Integer.toString(view.getId(), 16) + ", motion event=" + motionEvent.toString());
        if (!aM || !aK.get()) {
            return false;
        }
        if (view == null) {
            Logger.d(f29438v, "View touched event sdk=" + sdkPackageName + ", view=null, exiting.");
            return false;
        }
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 11) {
            Logger.d(f29438v, "View touched event sdk=" + sdkPackageName + ", motion event=" + motionEvent.getAction() + ". exiting.");
            return false;
        }
        if (com.safedk.android.utils.k.c()) {
            aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.7
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(sdkPackageName, view, motionEvent);
                }
            });
        } else {
            b(sdkPackageName, view, motionEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, View view, MotionEvent motionEvent) {
        try {
            Logger.d(f29438v, "onViewTouchedImpl started, sdkPackageName = " + str + ", view = " + view + ", motionEvent = " + motionEvent + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            AdNetworkDiscovery h2 = h(str);
            if (h2 != null) {
                h2.e(view);
            } else {
                Logger.d(f29438v, "View touched event clicked from unsupported SDK: " + str);
            }
        } catch (Throwable th) {
            Logger.e(f29438v, "View touched event exception", th);
        }
    }

    public static boolean g(String str) {
        return com.safedk.android.utils.k.a(str, f29432p) && str.contains(f29431o);
    }

    public static synchronized void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        synchronized (CreativeInfoManager.class) {
            try {
                if (!aM || !aK.get()) {
                    Logger.d(f29438v, "updating creative info details SafeDK not initialized");
                } else {
                    aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.8
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(CreativeInfoManager.f29438v, "updating creative info details from Max, sdk=" + str + ", placement id=" + str2 + ", creative id=" + str3 + ", ad format=" + str5);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                adNetworkDiscovery.a(str2, str3, str4, str5);
                            } else {
                                Logger.d(CreativeInfoManager.f29438v, "no discovery object for SDK " + str);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.e(f29438v, th.getMessage(), th);
                try {
                    new CrashReporter().caughtException(th);
                } catch (Throwable th2) {
                }
            }
        }
    }

    public static AdNetworkDiscovery h(String str) {
        if (!aM || !aK.get()) {
            return null;
        }
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return null;
        }
        return adNetworkDiscovery;
    }

    public static com.safedk.android.analytics.brandsafety.creatives.a i(String str) {
        if (!aM || !aK.get()) {
            return null;
        }
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            return adNetworkDiscovery.d();
        }
        return null;
    }

    public static boolean a(String str, AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aM && aK.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().b(adNetworkConfiguration);
        }
        return z2;
    }

    public static long a(String str, AdNetworkConfiguration adNetworkConfiguration, long j2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aM && aK.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().e(adNetworkConfiguration);
        }
        return j2;
    }

    public static String a(String str, AdNetworkConfiguration adNetworkConfiguration, String str2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aM && aK.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().c(adNetworkConfiguration);
        }
        return str2;
    }

    public static float a(String str, AdNetworkConfiguration adNetworkConfiguration, float f2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aM && aK.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().d(adNetworkConfiguration);
        }
        return f2;
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, float f2) {
        if (aM && aK.get()) {
            for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
                if (adNetworkDiscovery.d() != null) {
                    adNetworkDiscovery.d().a(adNetworkConfiguration, f2);
                    Logger.d(f29438v, "Config bundle for sdk " + adNetworkDiscovery + " updated config item " + adNetworkDiscovery.h() + " to " + f2);
                }
            }
        }
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, long j2) {
        if (aM && aK.get()) {
            for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
                if (adNetworkDiscovery.d() != null) {
                    adNetworkDiscovery.d().a(adNetworkConfiguration, j2);
                    Logger.d(f29438v, "Config bundle for sdk " + adNetworkDiscovery + " updated config item " + adNetworkDiscovery.h() + " to " + j2);
                }
            }
        }
    }

    public static void g() {
        if (aM && aK.get()) {
            for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
                if (adNetworkDiscovery.d() != null) {
                    Logger.d(f29438v, "Config item SDK " + adNetworkDiscovery.h() + " min image uniformity threshold is " + adNetworkDiscovery.d().d(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE));
                }
            }
        }
    }

    public static void h() {
        if (aM && aK.get()) {
            Logger.d(f29438v, "clear old CIs from ad networks started");
            synchronized (B) {
                com.safedk.android.utils.e.a(B, "CreativeInfoManager:adIdToCreatives", true);
            }
            com.safedk.android.utils.e.a(D, "CreativeInfoManager:multiAdCreatives", true);
            com.safedk.android.utils.e.a(F, "CreativeInfoManager:contentHashCodeToCreatives", true);
            com.safedk.android.utils.e.a(H, "CreativeInfoManager:webviewAddressToCreatives", true);
        }
    }

    public static void onHandleInvocation(String packageName, WebViewBridgeInterface target, String data) {
        if (aM && aK.get()) {
            com.safedk.android.utils.k.b(f29438v, "onHandleInvocation packageName = " + packageName + ", isOnUiThread = " + com.safedk.android.utils.k.c() + " data is: " + data);
            String a2 = BrandSafetyUtils.a(target);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(packageName);
            if (adNetworkDiscovery == null) {
                Logger.d(f29438v, "onHandleInvocation: couldn't find discovery for package: " + packageName);
            } else {
                adNetworkDiscovery.f(data, a2);
            }
        }
    }

    public static void onWebviewInterfaceConstruction(final String packageName, final WebViewBridgeInterface bridge) {
        if (com.safedk.android.utils.k.c()) {
            aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.9
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(packageName, bridge);
                }
            });
        } else {
            b(packageName, bridge);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebViewBridgeInterface webViewBridgeInterface) {
        if (aM && aK.get()) {
            String a2 = BrandSafetyUtils.a(webViewBridgeInterface);
            com.safedk.android.utils.k.b(f29438v, "onWebviewInterfaceConstruction: packageName is: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c() + ", bridge address is: " + a2);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery == null) {
                Logger.d(f29438v, "onWebviewInterfaceConstruction: couldn't find discovery for package: " + str);
            } else {
                adNetworkDiscovery.h(a2);
            }
        }
    }

    public static Set<String> i() {
        return adNetworkDiscoveries.keySet();
    }

    public static boolean j(String str) {
        SafeDK safeDK;
        return (!aM || !aK.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.y() == null || safeDK.y().F.a(str, false) == null) ? false : true;
    }

    public static boolean k(String str) {
        SafeDK safeDK;
        return (!aM || !aK.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.y() == null || safeDK.y().F.e(str) == null) ? false : true;
    }

    public static void a(String str, String str2, BrandSafetyUtils.AdType adType, String str3) {
        if (aM && aK.get()) {
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK != null && safeDK.a(adType) != null) {
                Logger.d(f29438v, "sendMessageToAdInfo: sending message: " + str2 + " to address: " + str);
                safeDK.a(adType).d(str, str2, str3);
            } else {
                Logger.d(f29438v, "sendMessageToAdInfo: NOT sending message: " + str2 + " to address: " + str + "because ad finder not available");
            }
        }
    }

    public static void a(final String str, final int i2) {
        aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.10
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(CreativeInfoManager.f29438v, "ad markup hash code is: " + i2);
                CreativeInfoManager.a(g.f30051f, "gw-ext.mediation.unity3d.com/auction/videoBridge", IronSourceDiscovery.m(str), (Map<String, List<String>>) null);
            }
        });
    }

    public static void onReceiveMessageFromExternal(final String sdkPackage, final Object object, final String data) {
        aL.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.11
            @Override // java.lang.Runnable
            public void run() {
                AdNetworkDiscovery h2 = CreativeInfoManager.h(sdkPackage);
                if (h2 != null) {
                    h2.a(object, data);
                }
            }
        });
    }
}
