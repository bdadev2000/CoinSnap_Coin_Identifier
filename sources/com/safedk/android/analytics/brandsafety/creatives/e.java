package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebView;
import com.facebook.appevents.AppEventsConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.infos.AdMobCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29576a = "ResourceUrlFilter";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29577b = "attribution.urls";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29578c = "general_exclusion_list";
    public static final String d = "general_inclusion_list";
    public static final String e = "http";

    /* renamed from: g, reason: collision with root package name */
    private static final float f29580g = 1.1f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f29581h = 1.3f;

    /* renamed from: i, reason: collision with root package name */
    private static final String f29582i = "BannerView";

    /* renamed from: j, reason: collision with root package name */
    private static final float f29583j = 6.0f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f29584k = 8.0f;

    /* renamed from: m, reason: collision with root package name */
    private static final int f29586m = 10;

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String[]> f29579f = b();

    /* renamed from: l, reason: collision with root package name */
    private static final LinkedHashSet<String> f29585l = new LinkedHashSet<>();

    /* renamed from: n, reason: collision with root package name */
    private static String f29587n = null;

    /* renamed from: o, reason: collision with root package name */
    private static final ConcurrentHashMap<String, b> f29588o = new ConcurrentHashMap<>();

    /* renamed from: p, reason: collision with root package name */
    private static final ConcurrentHashMap<String, a> f29589p = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, String[]> a() {
        return f29579f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        ConcurrentHashMap<String, Pair<ArrayList<String>, ArrayList<String>>> f29593a;

        /* renamed from: b, reason: collision with root package name */
        CreativeInfo f29594b;

        private b() {
            this.f29593a = new ConcurrentHashMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Set<String> f29590a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        Set<String> f29591b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        Set<String> f29592c = new HashSet();

        a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            synchronized (this.f29590a) {
                sb.append("webviewResources=" + (this.f29590a != null ? this.f29590a.toString() : "null"));
            }
            synchronized (this.f29591b) {
                sb.append(", dspDomains=" + (this.f29591b != null ? this.f29591b.toString() : "null"));
            }
            return sb.toString();
        }
    }

    private static ConcurrentHashMap<String, String[]> b() {
        ConcurrentHashMap<String, String[]> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(g.f30048a, new String[]{".applovin.com", ".applvn.com"});
        concurrentHashMap.put(g.f30051f, new String[]{".supersonicads.com", ".supersonic.com", "streamrail.com", "streamrail.net", "simharif.com", "atom-data.io", "supersonicads-a.akamaihd.net", ".ssacdn.com", ".isprog.com", "unity3d.com", "ironsrc.mobi"});
        concurrentHashMap.put(g.d, new String[]{".vungle.com", ".liftoff.com", ".liftoff.io", ".chinaliftoff.io"});
        concurrentHashMap.put(g.f30056k, new String[]{".unity3d.com"});
        concurrentHashMap.put("com.facebook.ads", new String[]{".facebook.com"});
        concurrentHashMap.put(g.f30053h, new String[]{".doubleclick.net", ".google.com", ".googlesyndication.com", ".googleadservices.com", ".googleapis.com", ".youtube.com", ".googleusercontent.com", ".gstatic.com", ".googlevideo.com"});
        concurrentHashMap.put(g.f30060o, new String[]{"rayjump.com", "mobvista.com", "mintegral.com", "mindworks-creative.com", "mtgglobals.com"});
        concurrentHashMap.put(g.f30049b, new String[]{"adcolony.com", "adccache.cn", "adtilt.com", "admarvel.com"});
        concurrentHashMap.put(f29577b, new String[]{"play.google.com", ".appsflyer.com", ".adjust.com", ".singular.net", ".tenjin.io", ".kochava.com", ".tune.com", ".partytrack.it", ".tapstream.com", ".apsalar.com", ".adj.st", ".singular.com", ".sng.link", ".tenjin.com", ".doubleverify.com", ".onelink.me", ".moatads.com", ".moatpixel.com", ".adsafeprotected.com"});
        concurrentHashMap.put(g.f30061p, new String[]{".inner-active.mobi", ".inner-active.com", "w3.org"});
        concurrentHashMap.put(g.f30054i, new String[]{"inmobicdn.net", "inmobi.com"});
        concurrentHashMap.put(g.f30066u, new String[]{"pangle.io", "byteoversea.com", "tiktokcdn.com", "ipstatp.com", "pglstatp.com", "snssdk.com", "pangolin-sdk-toutiao.com", "toutiao.com", "ibytedtos.com"});
        concurrentHashMap.put(g.f30069z, new String[]{"fivecdm.io", "fivecdm.com", "line.me"});
        concurrentHashMap.put(g.f30067v, new String[]{"smaato.net"});
        concurrentHashMap.put(g.D, new String[]{"adsmoloco.com"});
        concurrentHashMap.put(f29578c, new String[]{"outcome-cdn.supersonicads.com/", "click-haproxy.supersonicads.com/", "supersonicads.com/pixel", "supersonicads.com/endcardclick", "supersonicads.com/videoimpression", "supersonicads.com/isendcardclick", "supersonicads.com/isvideoimpression", "k.isprog.com", "events.isprog.com", ".simharif.com", "csi.gstatic.com/csi", "googleads.g.doubleclick.net/pagead/conversion", ".applovin.com/imp", ".applovin.com/click", ".applovin.com/interact", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.e, ".applvn.com/imp", ".applvn.com/click", ".applvn.com/interact", ".applvn.com/redirect", "event.inner-active.mobi", "events.inner-active.mobi"});
        concurrentHashMap.put(d, new String[]{"gstatic.com", "googleusercontent.com", "tpc.googlesyndication.com", "/simgad/", "pglstatp.com", "ipstatp.com", "pglstatp-toutiao.com", "pstatp.com", "googleadsserving.cn", "ggpht.com", "ibyteimg.com"});
        return concurrentHashMap;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (!a(SdksMapping.getMainSdkPackage(str2), str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        boolean z2;
        String[] strArr;
        if (!str2.startsWith(e)) {
            return false;
        }
        String o2 = k.o(str2);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (!TextUtils.isEmpty(mainSdkPackage) && (strArr = f29579f.get(mainSdkPackage)) != null) {
            for (String str3 : strArr) {
                if (o2.contains(str3)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        String[] strArr2 = f29579f.get(f29577b);
        if (strArr2 != null) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (o2.contains(strArr2[i2])) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        return z2 ? false : true;
    }

    private static void a(String str, String str2, String str3, BrandSafetyUtils.AdType adType, Map<String, String> map, List<CreativeInfo> list, boolean z2) {
        boolean z3 = z2 || a(str, str3, map);
        Logger.d(f29576a, "add resource to CI if needed started - current resource: " + str3 + " for " + str2 + " is resource: " + z3);
        if (z3) {
            if (k.b(str3, (Map<String, String>) null)) {
                if (!str3.startsWith(CreativeInfo.aq)) {
                    str3 = CreativeInfo.aq + str3;
                }
                Logger.d(f29576a, "add resource to CI if needed, video resource found : " + str3);
            }
            for (CreativeInfo creativeInfo : list) {
                if (creativeInfo != null) {
                    if (creativeInfo.l()) {
                        Logger.d(f29576a, "add resource to CI if needed, skip resource " + str3 + " for " + str2);
                    } else {
                        creativeInfo.y(str3);
                        Logger.d(f29576a, "add resource to CI if needed, added resource " + str3 + " to ci for " + str2 + " and ad type: " + adType);
                    }
                }
            }
            return;
        }
        if (a(str, str3)) {
            Logger.d(f29576a, "add resource to CI if needed, WebView resource discarded (should not be added to dsp domains). resource = " + str3);
        }
    }

    private static void a(String str, String str2, String str3, BrandSafetyUtils.AdType adType, Map<String, String> map, boolean z2, boolean z3) {
        a aVar;
        boolean z4 = false;
        boolean z5 = z3 || a(str, str3, map);
        Logger.d(f29576a, "add resource to collection started, current resource: " + str3 + " for " + str2 + " is resource: " + z5);
        if (z5) {
            a aVar2 = f29589p.get(str2);
            synchronized (f29589p) {
                if (aVar2 == null) {
                    a aVar3 = new a();
                    f29589p.put(str2, aVar3);
                    aVar = aVar3;
                } else {
                    aVar = aVar2;
                }
            }
            if (k.b(str3, (Map<String, String>) null)) {
                if (!str3.startsWith(CreativeInfo.aq)) {
                    str3 = CreativeInfo.aq + str3;
                }
                Logger.d(f29576a, "add resource to collection, video resource found : " + str3);
            }
            if (z2) {
                synchronized (aVar.f29592c) {
                    aVar.f29592c.add(str3);
                }
                return;
            }
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
            while (it.hasNext()) {
                List<CreativeInfo> a2 = it.next().a(str, str2);
                if (a2 != null && !a2.isEmpty()) {
                    Iterator<CreativeInfo> it2 = a2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (it2.next().l()) {
                            Logger.d(f29576a, "add resource to collection, CI by webViewAddress " + str2 + " is set to not collect resources");
                            z4 = true;
                            break;
                        }
                    }
                }
            }
            if (!z4) {
                synchronized (aVar.f29590a) {
                    aVar.f29590a.add(str3);
                }
                Logger.d(f29576a, "add resource to collection, added resource " + str3 + " info " + str2 + " and ad type: " + adType);
                return;
            }
            Logger.d(f29576a, "did not add resource to collection, webViewAddress = " + str2 + ", ci stopCollectingResources is true  for at least one CI , resource = " + str3);
            return;
        }
        if (a(str, str3)) {
            Logger.d(f29576a, "add resource to collection, WebView resource discarded (should not be added to dsp domains). resource = " + str3);
        }
    }

    public static void a(String str, String str2, List<String> list, boolean z2) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && SafeDK.W()) {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            Logger.d(f29576a, "handle resources started with package: " + str + " webView: " + str2 + " and resources size: " + list.size());
            List<CreativeInfo> a2 = safeDK.y().a(mainSdkPackage, str2);
            if (a2 != null && !a2.isEmpty()) {
                Logger.d(f29576a, "handle resources collected url found " + a2.size() + " " + BrandSafetyUtils.AdType.INTERSTITIAL + " CIs for webview " + str2);
            }
            BrandSafetyUtils.AdType K = (a2 == null || a2.isEmpty() || a2.get(0) == null) ? null : a2.get(0).K();
            for (String str3 : list) {
                if (a2 != null && !a2.isEmpty()) {
                    a(mainSdkPackage, str2, str3, K, (Map<String, String>) null, a2, z2);
                } else {
                    a(mainSdkPackage, str2, str3, K, (Map<String, String>) null, true, z2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0184, code lost:
    
        if (r11.startsWith("text:") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x018a, code lost:
    
        if (com.safedk.android.utils.a.a(r0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x018c, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.e.f29576a, "handle resource url, sdk " + r0 + " does not support banner monitoring, skipping text resources");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f1, code lost:
    
        r4 = com.safedk.android.internal.b.getInstance().isInterstitialActivity(r10.getContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01fd, code lost:
    
        if (r5 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0203, code lost:
    
        if (r5.isEmpty() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0209, code lost:
    
        if (r5.get(0) == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x020b, code lost:
    
        r3 = r5.get(0).K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x021b, code lost:
    
        if (r11.startsWith("text:") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021f, code lost:
    
        if (r3 == com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType.INTERSTITIAL) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0221, code lost:
    
        if (r4 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0223, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.e.f29576a, "handle resource url, skipping text resource for interstitial " + r0 + " on webview " + r1 + ", resource " + r11 + ", interstitial activity = " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x025b, code lost:
    
        r2 = com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.a(r0, com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT, false);
        r7 = com.safedk.android.analytics.brandsafety.b.a(r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0265, code lost:
    
        if (r2 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0269, code lost:
    
        if (r3 == com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType.INTERSTITIAL) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026b, code lost:
    
        if (r4 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x026f, code lost:
    
        if (r7 != com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType.INTERSTITIAL) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0271, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.e.f29576a, "handle resource url, skipping resource for interstitial that supports resource collection script instead for webview: " + r1 + " and resource: " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0295, code lost:
    
        if (r5 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x029b, code lost:
    
        if (r5.isEmpty() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029d, code lost:
    
        a(r0, r1, r11, r3, r12, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a4, code lost:
    
        a(r0, r1, r11, r3, r12, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r9, android.webkit.WebView r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.e.a(java.lang.String, android.webkit.WebView, java.lang.String, java.util.Map):void");
    }

    public static void a(List<String> list) {
        a remove;
        if (list != null) {
            synchronized (list) {
                for (String str : list) {
                    if (str != null && (remove = f29589p.remove(str)) != null) {
                        Logger.d(f29576a, "clearing for " + str + " succeeded, " + remove.f29590a.size() + " resources removed, " + remove.f29591b.size() + " dsp domains removed");
                    }
                }
            }
        }
    }

    public static void a(String str, CreativeInfo creativeInfo) {
        k.b(f29576a, "attaching resource info to creative info. webview address=" + str + ", ci = " + creativeInfo);
        a aVar = str != null ? f29589p.get(str) : null;
        if (aVar == null) {
            Logger.d(f29576a, "no data for " + str);
            return;
        }
        if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT, false) && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
            synchronized (aVar.f29592c) {
                for (String str2 : aVar.f29592c) {
                    if (str2.startsWith("text:") && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                        Logger.d(f29576a, "skipping text script resource for interstitial " + creativeInfo.Q() + " on webview " + str + ", resource " + str2);
                    } else if (creativeInfo.l()) {
                        Logger.d(f29576a, "skipping resources for CI marked as shouldStopCollectingResources. resource " + str2);
                    } else {
                        Logger.d(f29576a, "attaching script resource info to creative info. resource url = " + str2);
                        creativeInfo.y(str2);
                    }
                }
            }
        } else {
            synchronized (aVar.f29590a) {
                for (String str3 : aVar.f29590a) {
                    if (str3.startsWith("text:") && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                        Logger.d(f29576a, "skipping text webview resource for interstitial " + creativeInfo.Q() + " on webview " + str + ", resource " + str3);
                    } else {
                        Logger.d(f29576a, "attaching webview resource info to creative info. webviewAddress = " + str + ", resource url = " + str3);
                        creativeInfo.y(str3);
                    }
                }
            }
        }
        synchronized (aVar.f29591b) {
            for (String str4 : aVar.f29591b) {
                Logger.d(f29576a, "attaching resource info to creative info. dsp resource url = " + str4);
                creativeInfo.x(str4);
            }
        }
        if (creativeInfo.Q().equals(g.f30060o)) {
            creativeInfo.u("attached_webview_rec_to_ci(" + k.e() + ")");
        }
        AdNetworkDiscovery h2 = CreativeInfoManager.h(creativeInfo.Q());
        AdNetworkDiscovery.WebViewResourceMatchingMethod b2 = h2 != null ? h2.b() : null;
        if (!creativeInfo.ah() && b2 != null && b2 != AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
            Logger.d(f29576a, "attaching resource info to creative info. clearing resource info. webview address=" + str);
            f29589p.remove(str);
        }
    }

    public static void b(String str, CreativeInfo creativeInfo) {
        Set<String> d2 = CreativeInfoManager.d(str);
        d2.add(str);
        Logger.d(f29576a, "attachResourceInfosToCreativeInfo: allAddresses=" + d2);
        Iterator<String> it = d2.iterator();
        while (it.hasNext()) {
            a(it.next(), creativeInfo);
        }
    }

    public static void a(String str) {
        k.b(f29576a, "clearing text resources for webview address=" + str);
        a aVar = f29589p.get(str);
        if (aVar == null || aVar.f29590a == null) {
            Logger.d(f29576a, "clearing text resources: no data for " + str);
            return;
        }
        Logger.d(f29576a, "number of items before clearing text resources is  " + aVar.f29590a.size());
        synchronized (aVar.f29590a) {
            Iterator<String> it = aVar.f29590a.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("text:")) {
                    Logger.d(f29576a, "clearing text resource " + next);
                    it.remove();
                }
            }
        }
        Logger.d(f29576a, "number of items after clearing text resources is  " + aVar.f29590a.size());
    }

    public static void a(String str, WebView webView, String str2, String str3, Map<String, String> map) {
        if (webView == null) {
            Logger.d(f29576a, "handle resource url - webView is null");
            return;
        }
        String a2 = BrandSafetyUtils.a(webView);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        boolean a3 = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        Logger.d(f29576a, "handle resource url " + mainSdkPackage + " on webview " + a2 + ", context: " + webView.getContext() + " resource: " + str2 + " size: " + webView.getWidth() + "," + webView.getHeight() + ", webView id: " + Integer.toHexString(webView.getId()) + ", headers: " + map + ", supportsMrecMonitoring = " + a3 + ", webview = " + webView + ", getMaxAdViewFromChildView : " + k.c(webView) + ", isMrecWebView = " + k.a(webView));
        if (!a3 && (k.b(webView.getWidth(), webView.getHeight()) || k.a(webView))) {
            Logger.d(f29576a, "handle resource url - ignoring url " + str2 + ",  supportsMrecMonitoring = " + a3 + ", webview = " + webView + ", isMrecWebView =  " + k.a(webView) + " , isMrecRatio = " + k.b(webView.getWidth(), webView.getHeight()));
            a((List<String>) Arrays.asList(a2));
            return;
        }
        if (map != null) {
            Logger.d(f29576a, "handle resource url - headers: " + map);
        }
        boolean isInterstitialActivity = com.safedk.android.internal.b.getInstance().isInterstitialActivity(webView.getContext());
        BrandSafetyUtils.AdType a4 = com.safedk.android.analytics.brandsafety.b.a(str, webView);
        if (CreativeInfoManager.a(mainSdkPackage, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT, false) && a4 == BrandSafetyUtils.AdType.INTERSTITIAL) {
            Logger.d(f29576a, "skipping resource for interstitial that supports script resource collection instead for webview: " + a2 + " and resource: " + str2);
            return;
        }
        Logger.d(f29576a, "handle resource url - interstitial activity: " + isInterstitialActivity + " adType: " + a4);
        if (!isInterstitialActivity && (a4 == BrandSafetyUtils.AdType.MREC || a4 == BrandSafetyUtils.AdType.BANNER)) {
            if (!com.safedk.android.utils.a.a(mainSdkPackage)) {
                Logger.d(f29576a, "Sdk " + mainSdkPackage + " does not support banner monitoring, skipping");
                return;
            }
            if (!g.f30056k.equals(mainSdkPackage) || !webView.getContext().toString().contains("UnityPlayerActivity")) {
                if (!g.f30061p.equals(mainSdkPackage) || FyberDiscovery.j().containsKey(Integer.valueOf(webView.getId()))) {
                    Logger.d(f29576a, a2 + " will be added to Webview address list");
                    f29585l.add(a2);
                    boolean a5 = a(webView);
                    Logger.d(f29576a, "webview context: " + webView.getContext() + " size: " + webView.getWidth() + "," + webView.getHeight() + ", interstitial: " + a5);
                    if (!a5) {
                        Logger.d(f29576a, "handle resource url - no interstitial, skipping");
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        b bVar = f29588o.get(mainSdkPackage);
        Logger.d(f29576a, "handle resource url - sdk info is: " + bVar + " and sdkToWebViewInfo keys are: " + f29588o.keySet());
        if (bVar != null) {
            boolean a6 = a(mainSdkPackage, str2, map);
            Logger.d(f29576a, "handle resource url - is resource url? " + a6 + " sdkInfo ci is: " + bVar.f29594b);
            if (bVar.f29594b == null || g.f30061p.equals(mainSdkPackage)) {
                if (g.f30051f.equals(mainSdkPackage) && com.safedk.android.analytics.brandsafety.b.a(g.f30051f, webView) == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    if (str3 == null) {
                        str3 = f29587n;
                    }
                    Logger.d(f29576a, "handle resource url - using placement id as key " + str3);
                } else {
                    str3 = a2;
                }
                if (str3 != null) {
                    Pair<ArrayList<String>, ArrayList<String>> pair = bVar.f29593a.get(str3);
                    if (pair == null) {
                        pair = new Pair<>(new ArrayList(), new ArrayList());
                        bVar.f29593a.put(str3, pair);
                    }
                    if (a6) {
                        Logger.d(f29576a, "handle resource url - storing resource for webview " + str3 + " resource = " + str2);
                        ((ArrayList) pair.second).add(str2);
                        return;
                    } else {
                        if (a(mainSdkPackage, str2)) {
                            Logger.d(f29576a, "handle resource url - WebView resource discarded (should not be added to dsp domains). resource = " + str2);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (a6) {
                if (bVar.f29594b != null && CreativeInfoManager.a(bVar.f29594b.Q(), AdNetworkConfiguration.VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER, false)) {
                    Logger.d(f29576a, "handle resource url - VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER is true");
                    if (bVar.f29594b.af() != null) {
                        if (bVar.f29594b.af().equals(a2)) {
                            Logger.d(f29576a, "handle resource url - matching object address verification passed, adding resource url = " + str2);
                            bVar.f29594b.y(str2);
                            return;
                        } else {
                            Logger.d(f29576a, "handle resource url - matching object address verification failed, not adding resource url = " + str2);
                            return;
                        }
                    }
                    Logger.d(f29576a, "handle resource url - no matching object address, adding. cannot verify for resource = " + str2);
                    bVar.f29594b.y(str2);
                    return;
                }
                Logger.d(f29576a, "handle resource url - adding resource url = " + str2);
                bVar.f29594b.y(str2);
                return;
            }
            if (a(mainSdkPackage, str2)) {
                Logger.d(f29576a, "handle resource url - WebView resource discarded (should not be added to dsp domains). resource = " + str2);
            }
        }
    }

    public static boolean a(String str, String str2, Map<String, String> map) {
        return k.a(str2, map) || c(str, str2);
    }

    private static boolean c(String str, String str2) {
        if (!SdksMapping.getMainSdkPackage(str).equals(g.f30056k)) {
            return false;
        }
        boolean a2 = AdMobCreativeInfo.a(str2);
        if (a2) {
            Logger.d(f29576a, "admob known domain url = " + str2);
            return a2;
        }
        return a2;
    }

    public static void b(String str, String str2) {
        Logger.d(f29576a, "set new url Info data for package " + str);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (g.f30051f.equals(mainSdkPackage)) {
            if (!f29588o.contains(mainSdkPackage)) {
                f29588o.put(mainSdkPackage, new b());
            }
            f29587n = str2;
            Logger.d(f29576a, "updating placement Id to " + str2);
            return;
        }
        f29588o.put(mainSdkPackage, new b());
    }

    public static synchronized void a(CreativeInfo creativeInfo, String str) {
        synchronized (e.class) {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(creativeInfo.Q());
            b bVar = f29588o.get(mainSdkPackage);
            if (bVar != null) {
                bVar.f29594b = creativeInfo;
                Logger.d(f29576a, "handle creative info selected sdk: " + mainSdkPackage + ", info data: " + creativeInfo);
                if (g.f30051f.equals(mainSdkPackage) && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    if (bVar != null && bVar.f29593a != null) {
                        if (creativeInfo.F() != null) {
                            Pair<ArrayList<String>, ArrayList<String>> pair = bVar.f29593a.get(creativeInfo.F());
                            if (pair != null) {
                                a(creativeInfo, creativeInfo.F(), pair);
                            } else {
                                Logger.d(f29576a, "webView resources is null, cannot attach resource url to CI, placement id = " + creativeInfo.F());
                            }
                        } else {
                            Logger.d(f29576a, "IronSource CI without placement. Cannot execute logic to determine if we need to attach resource urls to the CI. CI=" + creativeInfo);
                        }
                    } else {
                        Logger.d(f29576a, "webView to url info list is null for package " + mainSdkPackage + " , cannot add resources to CI. WebView address is " + str + ", ci = " + (creativeInfo == null ? "null" : creativeInfo.toString()));
                    }
                } else if (g.f30061p.equals(mainSdkPackage)) {
                    if (str != null) {
                        Logger.d(f29576a, "handle creative info selected, main sdk package=" + mainSdkPackage + ", webView=" + str + ", ci=" + creativeInfo);
                        a(creativeInfo, str, bVar.f29593a.get(str));
                    } else {
                        Logger.d(f29576a, "handle creative info selecte,d WebView instance is null");
                    }
                } else if (str != null) {
                    Logger.d(f29576a, "handle creative info selected - webView=" + str + " webview key set is: " + bVar.f29593a.keySet());
                    for (String str2 : bVar.f29593a.keySet()) {
                        Pair<ArrayList<String>, ArrayList<String>> pair2 = bVar.f29593a.get(str2);
                        Logger.d(f29576a, "handle creative info selected - current webview: " + str2 + " webview resources are: " + pair2);
                        a(creativeInfo, str2, pair2);
                    }
                }
            }
        }
    }

    private static synchronized void a(CreativeInfo creativeInfo, String str, Pair<ArrayList<String>, ArrayList<String>> pair) {
        synchronized (e.class) {
            k.b(f29576a, "attach resource urls to CI from key " + str + " resource url db " + pair);
            if (pair != null) {
                Logger.d(f29576a, "attach resource urls to CI - first webView resource: " + pair.first);
                Iterator it = ((ArrayList) pair.first).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Logger.d(f29576a, "attach resource urls to CI - adding stored dsp resource: " + str2 + " for address: " + str);
                    creativeInfo.x(str2);
                }
                Logger.d(f29576a, "attach resource urls to CI - second webView resource: " + pair.second);
                Iterator it2 = ((ArrayList) pair.second).iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    Logger.d(f29576a, "attach resource urls to CI - adding stored resource url: " + str3 + " for address: " + str);
                    creativeInfo.y(str3);
                }
            }
        }
    }

    public static void a(l lVar, String str, boolean z2) {
        Set<String> set;
        k.b(f29576a, "attach resource urls to impression webview_resource_urls from key " + str);
        if (lVar != null) {
            try {
                if (lVar.e() == null && str != null) {
                    String str2 = lVar.f29745i;
                    boolean z3 = lVar.f29746j == BrandSafetyUtils.AdType.INTERSTITIAL;
                    synchronized (f29589p) {
                        Logger.d(f29576a, "attach resource urls to impression and clearing resource info. webview address=" + str);
                        a remove = f29589p.remove(str);
                        if (remove != null) {
                            boolean a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT, false);
                            Logger.d(f29576a, "attach resource urls to impression - package is: " + str2 + " ad type: " + lVar.f29746j + " should report script resources? " + a2);
                            if (a2 && z3) {
                                Set<String> set2 = remove.f29592c;
                                Logger.d(f29576a, "attach resource urls to impression - adding from the script resources list");
                                set = set2;
                            } else {
                                Set<String> set3 = remove.f29590a;
                                Logger.d(f29576a, "attach resource urls to impression - adding from the webview resources list");
                                set = set3;
                            }
                            if (remove != null) {
                                Logger.d(f29576a, "attach resource urls to impression webview_resource_urls for webview " + str + ", webview resources : " + (set != null ? Integer.valueOf(set.size()) : AppEventsConstants.EVENT_PARAM_VALUE_NO) + ", dsp urls : " + (remove.f29591b != null ? Integer.valueOf(remove.f29591b.size()) : AppEventsConstants.EVENT_PARAM_VALUE_NO));
                                if (set != null && set.size() > lVar.f29742f.size()) {
                                    synchronized (set) {
                                        int size = lVar.f29742f.size();
                                        for (String str3 : set) {
                                            if (!lVar.f29742f.contains(str3) && (!str3.startsWith("text:") || (str3.startsWith("text:") && z2))) {
                                                synchronized (lVar.f29742f) {
                                                    Logger.d(f29576a, "attach resource - adding url to webView resource list: " + str3);
                                                    lVar.f29742f.add(str3);
                                                }
                                                Logger.d(f29576a, "attach resource urls to impression. webview_resource_urls webview " + str + ", url " + str3);
                                            }
                                        }
                                        Logger.d(f29576a, "attach resource urls to impression: impression size went from: " + size + " to " + lVar.f29742f.size());
                                    }
                                }
                                if (remove.f29591b.size() > lVar.f29743g.size()) {
                                    synchronized (remove.f29591b) {
                                        for (String str4 : remove.f29591b) {
                                            if (!lVar.f29743g.contains(str4) && (!str4.startsWith("text:") || (str4.startsWith("text:") && z2))) {
                                                lVar.f29743g.add(str4);
                                                Logger.d(f29576a, "attach dsp urls to impression. webview_resource_urls webview " + str + ", url " + str4);
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                Logger.e(f29576a, "Exception in attach resource urls to impression : " + th.getMessage(), th);
                return;
            }
        }
        Logger.d(f29576a, "attach resource urls to impression - impression is empty or webview address is null");
    }

    public static synchronized void a(CreativeInfo creativeInfo) {
        synchronized (e.class) {
            Logger.d(f29576a, "handle creative info destroyed - info data to ci " + creativeInfo);
            if (creativeInfo != null && creativeInfo.Q() != null) {
                String mainSdkPackage = SdksMapping.getMainSdkPackage(creativeInfo.Q());
                if (g.f30051f.equals(mainSdkPackage) && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    b bVar = f29588o.get(mainSdkPackage);
                    if (creativeInfo.F() != null) {
                        bVar.f29593a.remove(creativeInfo.F());
                    }
                    bVar.f29594b = null;
                    f29587n = null;
                    Logger.d(f29576a, "removed ci & Info data for placement id: " + creativeInfo.F());
                } else if (g.f30061p.equals(mainSdkPackage)) {
                    c();
                } else {
                    Logger.d(f29576a, "removed Info data: " + f29588o.remove(mainSdkPackage));
                }
            }
        }
    }

    private static synchronized void c() {
        synchronized (e.class) {
            Logger.d(f29576a, "remove WebView urls if needed - WebView address list size=" + f29585l.size() + " , list=" + f29585l);
            while (true) {
                try {
                    if (f29585l.size() > 10) {
                        Iterator<String> it = f29585l.iterator();
                        if (it.hasNext()) {
                            String next = it.next();
                            Logger.d(f29576a, "remove WebView urls if needed - " + next + " will be removed");
                            f29588o.get(g.f30061p).f29593a.remove(next);
                            f29585l.remove(next);
                            Logger.d(f29576a, "remove WebView urls if needed - " + next + " removed, size is " + f29585l.size());
                        } else {
                            Logger.d(f29576a, "Unable to get WebView address for removal, exiting");
                            break;
                        }
                    } else if (f29585l.size() == 0) {
                        f29588o.remove(g.f30061p);
                    }
                } catch (Throwable th) {
                    Logger.e(f29576a, "remove WebView urls if needed exception", th);
                }
            }
        }
    }

    public static boolean a(WebView webView) {
        try {
            float width = webView.getWidth();
            float height = webView.getHeight();
            if (height <= 0.0f) {
                return true;
            }
            float f2 = width / height;
            Logger.d(f29576a, "interstitial webView proportions : " + f2);
            return (((f2 > f29580g ? 1 : (f2 == f29580g ? 0 : -1)) >= 0 && (f2 > f29581h ? 1 : (f2 == f29581h ? 0 : -1)) <= 0) || ((f2 > f29583j ? 1 : (f2 == f29583j ? 0 : -1)) >= 0 && (f2 > f29584k ? 1 : (f2 == f29584k ? 0 : -1)) <= 0)) ? false : true;
        } catch (Throwable th) {
            Logger.d(f29576a, "Exception in interstitial webView proportions : " + th.getMessage(), th);
            return true;
        }
    }
}
