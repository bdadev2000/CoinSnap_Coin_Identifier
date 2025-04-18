package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.facebook.internal.security.CertificateUtil;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class BannerFinder extends com.safedk.android.analytics.brandsafety.b {
    protected static final int F = 5;
    protected static final long G = 1000;
    protected static final long H = 500;
    protected static final long K = 10;
    protected LinkedHashSetWithItemLimit<String> L;
    private final Set<String> R;
    protected static final Map<d, e> I = new ConcurrentHashMap();
    protected static final Map<String, List<o>> J = new ConcurrentHashMap();
    private static h N = null;
    private static final Map<String, List<WeakReference<MaxAdView>>> O = new ConcurrentHashMap();
    private static final Map<String, BrandSafetyUtils.AdType> P = new ConcurrentHashMap();
    private static final Map<String, d> Q = new ConcurrentHashMap();
    protected static Map<String, RedirectData> M = null;

    public static Map<String, BrandSafetyUtils.AdType> d() {
        return P;
    }

    public Set<String> e() {
        return this.R;
    }

    public BannerFinder(int maxAttemptsToCaptureImage) {
        super(BrandSafetyUtils.AdType.BANNER, Arrays.asList(BrandSafetyUtils.f29190m, BrandSafetyUtils.f29191n), "BannerFinder", maxAttemptsToCaptureImage);
        this.R = new HashSet();
        this.L = new LinkedHashSetWithItemLimit<>(K);
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BannerFinder(BrandSafetyUtils.AdType adType, List<String> supportedAdFormats, String logTag, int maxAttemptsToCaptureImage) {
        super(adType, supportedAdFormats, logTag, maxAttemptsToCaptureImage);
        this.R = new HashSet();
        this.L = new LinkedHashSetWithItemLimit<>(K);
    }

    private static void f() {
        e eVar;
        M = new PersistentConcurrentHashMap("SafeDKRedirects." + com.safedk.android.utils.k.a(SafeDK.getInstance().l()));
        Logger.d("BannerFinder", "handle saved redirects from previous session, found " + M.size() + " redirects, isOnUiThread = " + com.safedk.android.utils.k.c());
        ArrayList arrayList = new ArrayList();
        for (String str : M.keySet()) {
            RedirectData redirectData = M.get(str);
            if (redirectData != null && (redirectData.f29328a || redirectData.f29329b)) {
                redirectData.a("UnmatchedRedirectWebview=" + str);
                if (redirectData.f29336k == BrandSafetyEvent.AdFormatType.MREC) {
                    eVar = new r(redirectData.f29334i, redirectData.f29335j);
                } else {
                    if (redirectData.f29336k == null) {
                        redirectData.f29336k = BrandSafetyEvent.AdFormatType.BANNER;
                        redirectData.a("UnmatchedRedirectFallback=BANNER");
                    }
                    eVar = new e(redirectData.f29334i, redirectData.f29335j);
                }
                eVar.a(E.get(str));
                BrandSafetyEvent a2 = a(eVar, new l(redirectData), true, false, 0L, (String) null);
                a2.c(true);
                a2.a(SafeDK.getInstance().e());
                arrayList.add(a2);
            }
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
            M.clear();
        } else {
            Logger.w("BannerFinder", "handle saved redirects from previous session, cannot report brand safety event");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new e(str, str2, str3, screenShotOrientation, str4, str5);
    }

    protected e a(Activity activity, String str, int i2, String str2, Bundle bundle, String str3) {
        e eVar = new e(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i2, str2, bundle, str3);
        eVar.af = new WeakReference<>(activity);
        return eVar;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o() && SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            Bundle messageData = message.getMessageData();
            if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f29367b.contains(messageData.getString("ad_format"))) {
                Logger.d(this.f29366a, "Revenue event detected : " + messageData);
                string = "revenue_event";
            } else {
                string = messageData.getString("type");
            }
            String string2 = messageData.getString("ad_format");
            String string3 = messageData.getString(BrandSafetyEvent.f29784k);
            String string4 = messageData.getString(BrandSafetyEvent.f29785l);
            String string5 = messageData.getString("id", null);
            if (string5 == null) {
                Logger.d(this.f29366a, "No eventId in data bundle, cannot match");
            }
            String string6 = messageData.getString(BrandSafetyEvent.ad);
            String b2 = CreativeInfoManager.b(string6);
            long currentTimeMillis = System.currentTimeMillis();
            long b3 = com.safedk.android.utils.k.b(currentTimeMillis);
            String str = null;
            if (messageData.containsKey("creative_id")) {
                str = messageData.getString("creative_id");
            }
            if (this.f29367b.contains(string2)) {
                Logger.d(this.f29366a, "Max message received, package: " + b2 + ", ts (seconds): " + b3 + ", message received: " + message.getMessageData() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                d dVar = new d(string4, string3, string5, b2, string6, string2.equals(BrandSafetyUtils.f29190m) ? BrandSafetyUtils.AdType.BANNER : BrandSafetyUtils.AdType.MREC);
                if ("WILL_DISPLAY".equals(string)) {
                    if (b2 != null && g(string6, b2)) {
                        Logger.d(this.f29366a, "WILL_DISPLAY event for package=" + b2 + " banner key=" + dVar + ", slot count=" + this.d);
                        CreativeInfoManager.a(b2, string3, str, string5, string2);
                        a(string5, ImpressionLog.f29254f, new ImpressionLog.a(ImpressionLog.G, BrandSafetyUtils.l(messageData.getString("ad_view"))));
                    }
                    a(string6, b2, str, dVar, messageData, currentTimeMillis);
                    return;
                }
                if ("revenue_event".equals(string)) {
                    if (b2 != null && g(string6, b2)) {
                        Logger.d(this.f29366a, "REVENUE_EVENT event for package=" + b2 + " banner key=" + dVar + ", slot count=" + this.d);
                        a(string5, ImpressionLog.f29259k, new ImpressionLog.a(ImpressionLog.F, messageData.getString("revenue_event")));
                    }
                    a(string6, b2, str, dVar, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    if (g(string6, b2)) {
                        e eVar = I.get(dVar);
                        Logger.d(this.f29366a, "DID_CLICKED event currentActivityBanner = " + eVar);
                        a(string5, ImpressionLog.f29256h, new ImpressionLog.a[0]);
                        if (eVar != null) {
                            String str2 = this.f29366a;
                            StringBuilder append = new StringBuilder().append("DID_CLICKED event for package=");
                            if (b2 != null) {
                                string6 = b2;
                            }
                            Logger.d(str2, append.append(string6).append(", slot count=").append(this.d).toString());
                            d(dVar);
                            return;
                        }
                        Logger.d(this.f29366a, "DID_CLICKED event cannot find banner key " + dVar);
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (b2 != null && g(string6, b2)) {
                        Logger.d(this.f29366a, "WILL_LOAD event for package=" + b2 + " banner key=" + dVar + ", slot count=" + this.d);
                        a(string5, ImpressionLog.d, new ImpressionLog.a(ImpressionLog.I, string6));
                        com.safedk.android.analytics.brandsafety.creatives.e.b(b2, string3);
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (b2 != null && g(string6, b2)) {
                        Logger.d(this.f29366a, "DID_HIDE event for package=" + b2 + " banner key=" + dVar + ", slot count=" + this.d);
                        a(string5, ImpressionLog.f29257i, new ImpressionLog.a[0]);
                        c(dVar);
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (b2 != null && g(string6, b2)) {
                        Logger.d(this.f29366a, "DID_LOAD event for package=" + b2 + " banner key=" + dVar + ", slot count=" + this.d);
                        a(string5, ImpressionLog.e, new ImpressionLog.a(ImpressionLog.I, string6));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (b2 != null && g(string6, b2)) {
                        Logger.d(this.f29366a, "DID_DISPLAY event for package=" + b2 + " banner key=" + dVar + ", slot count=" + this.d);
                        a(string5, ImpressionLog.f29255g, new ImpressionLog.a[0]);
                        a(b2, dVar, str, messageData, currentTimeMillis);
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string) && b2 != null && g(string6, b2)) {
                    Logger.d(this.f29366a, "DID_FAIL_DISPLAY event for package=" + b2 + " banner key=" + dVar + ", slot count=" + this.d);
                    a(string5, ImpressionLog.f29258j, new ImpressionLog.a[0]);
                    a(dVar);
                }
            }
        }
    }

    private void a(d dVar) {
        e eVar = I.get(dVar);
        if (eVar != null) {
            eVar.N = true;
        }
    }

    public boolean i(String str) {
        if (str != null) {
            synchronized (BannerFinder.class) {
                for (e eVar : I.values()) {
                    Logger.d(this.f29366a, "is banner web view address: banner view: " + eVar.K + " given address: " + str + " view hierarchy: " + eVar.f29379m);
                    if ((eVar.K != null && str.equals(eVar.K)) || (eVar.f29379m != null && eVar.f29379m.contains(str))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        String f29174a;

        /* renamed from: b, reason: collision with root package name */
        String f29175b;

        /* renamed from: c, reason: collision with root package name */
        String f29176c;
        d d;
        Bundle e;

        /* renamed from: f, reason: collision with root package name */
        int f29177f = 0;

        /* renamed from: g, reason: collision with root package name */
        ScheduledFuture<?> f29178g;

        public b(String str, String str2, String str3, d dVar, Bundle bundle) {
            Logger.d(BannerFinder.this.f29366a, "web view scanner created, networkName = " + str + ", packageName = " + str2 + ", maxCreativeId = " + str3 + ", adInfoKey = " + dVar + ", applovinData = " + bundle + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            this.f29174a = str;
            this.f29175b = str2;
            this.f29176c = str3;
            this.d = dVar;
            this.e = bundle;
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x03fe A[Catch: Throwable -> 0x01a1, TryCatch #1 {Throwable -> 0x01a1, blocks: (B:3:0x0003, B:5:0x0014, B:7:0x001e, B:12:0x0031, B:15:0x0054, B:17:0x006e, B:18:0x008f, B:20:0x0095, B:23:0x00a3, B:24:0x00c6, B:27:0x00f3, B:29:0x0104, B:31:0x0108, B:32:0x0132, B:34:0x0167, B:36:0x016d, B:40:0x01b3, B:42:0x01b9, B:44:0x020a, B:45:0x0213, B:47:0x024d, B:49:0x0349, B:52:0x0361, B:54:0x0375, B:57:0x03b6, B:59:0x03ba, B:61:0x03c2, B:63:0x03fe, B:64:0x0416, B:68:0x0420, B:70:0x044c, B:72:0x0473, B:74:0x0479, B:75:0x04b6, B:77:0x04bc, B:78:0x04a9, B:80:0x0255, B:82:0x025b, B:84:0x0289, B:85:0x02a3, B:89:0x02c4, B:91:0x02cc, B:93:0x02e6, B:95:0x02ea, B:97:0x02fa, B:99:0x0306, B:100:0x030a, B:101:0x031b, B:112:0x0344, B:114:0x01af, B:103:0x031c, B:104:0x0326, B:106:0x032c, B:108:0x0348), top: B:2:0x0003, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x04bc A[Catch: Throwable -> 0x01a1, TRY_LEAVE, TryCatch #1 {Throwable -> 0x01a1, blocks: (B:3:0x0003, B:5:0x0014, B:7:0x001e, B:12:0x0031, B:15:0x0054, B:17:0x006e, B:18:0x008f, B:20:0x0095, B:23:0x00a3, B:24:0x00c6, B:27:0x00f3, B:29:0x0104, B:31:0x0108, B:32:0x0132, B:34:0x0167, B:36:0x016d, B:40:0x01b3, B:42:0x01b9, B:44:0x020a, B:45:0x0213, B:47:0x024d, B:49:0x0349, B:52:0x0361, B:54:0x0375, B:57:0x03b6, B:59:0x03ba, B:61:0x03c2, B:63:0x03fe, B:64:0x0416, B:68:0x0420, B:70:0x044c, B:72:0x0473, B:74:0x0479, B:75:0x04b6, B:77:0x04bc, B:78:0x04a9, B:80:0x0255, B:82:0x025b, B:84:0x0289, B:85:0x02a3, B:89:0x02c4, B:91:0x02cc, B:93:0x02e6, B:95:0x02ea, B:97:0x02fa, B:99:0x0306, B:100:0x030a, B:101:0x031b, B:112:0x0344, B:114:0x01af, B:103:0x031c, B:104:0x0326, B:106:0x032c, B:108:0x0348), top: B:2:0x0003, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x04a9 A[Catch: Throwable -> 0x01a1, TryCatch #1 {Throwable -> 0x01a1, blocks: (B:3:0x0003, B:5:0x0014, B:7:0x001e, B:12:0x0031, B:15:0x0054, B:17:0x006e, B:18:0x008f, B:20:0x0095, B:23:0x00a3, B:24:0x00c6, B:27:0x00f3, B:29:0x0104, B:31:0x0108, B:32:0x0132, B:34:0x0167, B:36:0x016d, B:40:0x01b3, B:42:0x01b9, B:44:0x020a, B:45:0x0213, B:47:0x024d, B:49:0x0349, B:52:0x0361, B:54:0x0375, B:57:0x03b6, B:59:0x03ba, B:61:0x03c2, B:63:0x03fe, B:64:0x0416, B:68:0x0420, B:70:0x044c, B:72:0x0473, B:74:0x0479, B:75:0x04b6, B:77:0x04bc, B:78:0x04a9, B:80:0x0255, B:82:0x025b, B:84:0x0289, B:85:0x02a3, B:89:0x02c4, B:91:0x02cc, B:93:0x02e6, B:95:0x02ea, B:97:0x02fa, B:99:0x0306, B:100:0x030a, B:101:0x031b, B:112:0x0344, B:114:0x01af, B:103:0x031c, B:104:0x0326, B:106:0x032c, B:108:0x0348), top: B:2:0x0003, inners: #0 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BannerFinder.b.run():void");
        }
    }

    public void a(CreativeInfo creativeInfo) {
        synchronized (BannerFinder.class) {
            for (d dVar : I.keySet()) {
                e eVar = I.get(new d(dVar.f29645a, creativeInfo.F(), creativeInfo.m(), creativeInfo.Q(), dVar.e, creativeInfo.K()));
                if (eVar != null) {
                    if (eVar.l() != null && eVar.l().f29692b != null) {
                        BrandSafetyUtils.d(eVar.l().f29692b);
                        eVar.h().f();
                    }
                    if (eVar.D == null) {
                        eVar.D = UUID.randomUUID().toString();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, WeakReference<View> weakReference) {
        String a2 = BrandSafetyUtils.a(weakReference.get());
        RedirectData redirectData = M.get(a2);
        Logger.d(this.f29366a, "web view scanner - check for pending redirect: " + redirectData + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (redirectData != null) {
            redirectData.a("LateMatchedRedirectWebview=" + a2);
            if (redirectData.f29336k == null) {
                redirectData.f29336k = BrandSafetyUtils.a(this.f29368c);
            }
            if (redirectData.f29329b) {
                eVar.an = true;
            }
            l h2 = eVar.h();
            if (h2 != null) {
                h2.a(redirectData);
                M.remove(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, String str) {
        Logger.d(this.f29366a, "handle web view change - web view change detected from: " + eVar.K + ", to: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        l h2 = eVar.h();
        if (h2 != null && h2.e() != null && !h2.e().ah()) {
            h2.e().ai();
            String h3 = h2.e().h();
            if (h3 != null) {
                h2.e().c(h3 + CreativeInfo.aJ);
            }
        }
        eVar.K = str;
        eVar.g().add(new l(UUID.randomUUID().toString()));
        if (eVar.D == null) {
            eVar.D = UUID.randomUUID().toString();
        }
        eVar.ac = false;
    }

    private void a(String str, String str2, String str3, d dVar, Bundle bundle, long j2) {
        e eVar;
        Q.put(dVar.f29645a, dVar);
        this.R.add(dVar.f29647c);
        Logger.d(this.f29366a, "handle WILL_DISPLAY - eventIds added " + dVar.f29647c);
        if (this.L.contains(dVar.f29647c)) {
            Logger.d(this.f29366a, "handle WILL_DISPLAY - impression with id " + dVar.f29647c + " has already been reported, ignoring. ");
            return;
        }
        Activity a2 = a(bundle);
        Logger.d(this.f29366a, "handle WILL_DISPLAY - adActivity = " + a2);
        Logger.d(this.f29366a, "handle WILL_DISPLAY - image count for " + this.f29368c.name() + " is " + BrandSafetyUtils.b(this.f29368c) + ", # impressions to report(" + this.B.keySet().size());
        if (g(str, str2)) {
            synchronized (BannerFinder.class) {
                eVar = I.get(dVar);
                if (eVar == null) {
                    eVar = a(a2, str2, dVar.f29647c, bundle);
                    I.put(dVar, eVar);
                    Logger.d(this.f29366a, "handle WILL_DISPLAY New activity banner created for " + str2 + ", banner key is " + dVar + ", current activity banners size is " + I.size());
                } else {
                    if (eVar.A == null) {
                        eVar.A = bundle;
                    }
                    if (eVar.B == null || eVar.C == null) {
                        eVar.a(a(a2));
                    }
                }
            }
            eVar.aa = true;
            eVar.ag = true;
            eVar.ai = j2;
            a(eVar, false, "handleWillDisplay");
        } else {
            this.d++;
        }
        b bVar = new b(str, str2, str3, dVar, bundle);
        bVar.f29178g = this.D.scheduleAtFixedRate(bVar, 0L, G, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, List<WeakReference<View>> list) {
        AdNetworkDiscovery h2 = CreativeInfoManager.h(dVar.d);
        if (h2 != null) {
            h2.a(dVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WeakReference<View> d(List<WeakReference<View>> list) {
        WeakReference<View> weakReference = null;
        for (WeakReference<View> weakReference2 : list) {
            Logger.d(this.f29366a, "select monitor view: iterating view is " + weakReference2.get());
            if (weakReference == null) {
                Logger.d(this.f29366a, "select monitor view: setting view " + weakReference2.get());
            } else if (weakReference2.get() instanceof WebView) {
                Logger.d(this.f29366a, "select monitor view: re-setting view " + weakReference2.get());
                weakReference.clear();
            } else {
                Logger.d(this.f29366a, "select monitor view: clearing view " + weakReference2.get());
                weakReference2.clear();
                weakReference2 = weakReference;
            }
            weakReference = weakReference2;
        }
        return weakReference;
    }

    private void a(String str, d dVar, String str2, Bundle bundle, long j2) {
        e eVar;
        this.R.add(dVar.f29647c);
        Logger.d(this.f29366a, "handle DID_DISPLAY - eventIds added " + dVar.f29647c);
        if (this.L.contains(dVar.f29647c)) {
            Logger.d(this.f29366a, "handle DID_DISPLAY - impression with id " + dVar.f29647c + " has already been reported, ignoring. ");
            return;
        }
        Logger.d(this.f29366a, "handle DID_DISPLAY package=" + str + " banner key=" + dVar);
        Activity a2 = a(bundle);
        synchronized (BannerFinder.class) {
            eVar = I.get(dVar);
            if (eVar != null) {
                Logger.d(this.f29366a, "Banner info already exists, package=" + str + " activity banner=" + eVar);
                eVar.f29390z = this.d;
                if (eVar.B == null || eVar.C == null) {
                    eVar.a(a(a2));
                }
            } else {
                b(dVar);
                eVar = a(a2, str, dVar.f29647c, bundle);
                I.put(dVar, eVar);
                Logger.d(this.f29366a, "New activity banner created for " + str + ", banner key is " + dVar + ", current activity banners size is " + I.size());
            }
        }
        eVar.M = str2;
        eVar.aj = j2;
        a(eVar, false, "handleDidDisplay");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, d dVar, WeakReference<View> weakReference) {
        e eVar;
        Logger.d(this.f29366a, "monitor impression started for " + str + ", adInfoKey = " + dVar + ", creativeId = " + str2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (com.safedk.android.utils.k.a((Reference<?>) weakReference) && (eVar = I.get(dVar)) != null) {
            a(str, dVar);
            eVar.M = str2;
            eVar.ah = true;
            eVar.ak = 0.0f;
            if (weakReference.get().getWidth() > 0 && weakReference.get().getHeight() > 0) {
                eVar.ak = weakReference.get().getWidth() / weakReference.get().getHeight();
            }
            a(weakReference, eVar, dVar);
        }
    }

    private void a(WeakReference<View> weakReference, e eVar, d dVar) {
        a aVar = new a(eVar, weakReference, this.e, dVar);
        eVar.am = aVar;
        CreativeInfo i2 = eVar.i();
        if (i2 != null && i2.v() && j(eVar.c())) {
            Logger.d(this.f29366a, "set Impression Handler Task If Needed : task set but not started since the ad is a video ad and the video hasn't finished yet. " + eVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        int U = SafeDK.getInstance().U() * 1000;
        Logger.d(this.f29366a, "start taking screenshots for view: " + weakReference.get().toString() + ", samplingInterval = " + U + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        aVar.d = this.D.scheduleAtFixedRate(aVar, H, U, TimeUnit.MILLISECONDS);
        Logger.d(this.f29366a, "set Impression Handler Task If Needed : task created and started : " + eVar);
    }

    protected boolean j(String str) {
        return false;
    }

    private boolean m(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f29379m != null && eVar.f29379m.contains(str) && eVar.i() != null) {
                    return true;
                }
            }
            return false;
        }
    }

    public void k(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.K != null && eVar.K.equals(str) && eVar.i() == null) {
                    Logger.d(this.f29366a, "handle multiple impressions - reset webview data in: " + eVar);
                    eVar.K = null;
                    eVar.ah = false;
                }
            }
        }
    }

    private void b(d dVar) {
        synchronized (BannerFinder.class) {
            Iterator<Map.Entry<d, e>> it = I.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<d, e> next = it.next();
                d key = next.getKey();
                e value = next.getValue();
                if (key.f29645a.equals(dVar.f29645a) && key.f29646b.equals(dVar.f29646b) && !key.f29647c.equals(dVar.f29647c) && !value.ag) {
                    Logger.d(this.f29366a, "report undetected banner started for AdInfoKey=" + key);
                    a(value, true, "reportUndetectedBannerIfNeeded");
                    it.remove();
                    b(value);
                }
            }
        }
    }

    protected boolean g(String str, String str2) {
        boolean a2 = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        String a3 = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.f29366a, "sdk " + str2 + ": config item SUPPORTS_BANNER_IMPRESSION_TRACKING is " + a2 + ", config item AD_NETWORK_TO_IGNORE is " + a3);
        if (a2 && !str.equals(a3)) {
            return true;
        }
        Logger.d(this.f29366a, "Banners tracking is not supported for this ad network (" + str + ")");
        return false;
    }

    private e a(Activity activity, String str, String str2, Bundle bundle) {
        String lowerCase = BrandSafetyUtils.c().name().toLowerCase();
        this.d++;
        Logger.d(this.f29366a, "slot number incremented to " + this.d + ", eventId is " + str2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        return a(activity, str, this.d, lowerCase, bundle, str2);
    }

    private void a(String str, d dVar) {
        CreativeInfo a2;
        Logger.d(this.f29366a, "pending ci check started, sdkPackageName = " + str + ", adInfoKey = " + dVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (dVar == null) {
            Logger.d(this.f29366a, "pending ci check - no activity key");
            return;
        }
        e eVar = I.get(dVar);
        if (eVar == null) {
            Logger.d(this.f29366a, "pending ci check - no banner info");
            return;
        }
        CreativeInfo i2 = eVar.i();
        if (i2 != null && !i2.ah()) {
            Logger.d(this.f29366a, "pending ci check - CI already exist");
            return;
        }
        if (dVar.f29647c != null) {
            Logger.d(this.f29366a, "pending ci check - activity key : " + dVar);
            AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
            if (h2 != null && !CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false) && (a2 = h2.a((Object) (dVar.f29646b + "_" + dVar.f29647c + "_" + str))) != null) {
                Logger.d(this.f29366a, "pending ci check - discovery class returned a ci: " + a2);
                if (a2.I() == null) {
                    String name = BrandSafetyUtils.a(eVar.A).name();
                    Logger.d(this.f29366a, "pending ci check - set ad format: " + name);
                    a2.p(name);
                }
                if (a2.m() == null) {
                    a2.f(dVar.f29647c);
                }
                Logger.d(this.f29366a, "pending ci check - CI event ID set");
            }
        }
        synchronized (BannerFinder.class) {
            List<o> list = J.get(str);
            if (list != null) {
                Logger.d(this.f29366a, "pending ci check - sdk: " + str + ", no. of pending candidates: " + list.size());
                for (o oVar : list) {
                    Logger.d(this.f29366a, "pending ci check - pending candidate: " + oVar);
                    CreativeInfo creativeInfo = oVar.f29758a;
                    if (a(creativeInfo, eVar)) {
                        Logger.d(this.f29366a, "pending ci check - creative info found by WebView/eventID, CI: " + creativeInfo);
                        b(creativeInfo, eVar);
                        if (creativeInfo.m() == null) {
                            creativeInfo.f(dVar.f29647c);
                            creativeInfo.f(true);
                        }
                        if (a(dVar.f29645a, dVar.e, oVar)) {
                            list.remove(oVar);
                            eVar.e("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + ";" + oVar.f29759b + "|o=" + oVar.f29758a.ae() + ";" + oVar.f29758a.af());
                        } else if (creativeInfo.B()) {
                            Logger.d(this.f29366a, "pending ci check - unreal match and event id set happened, setting ci event id back to null");
                            creativeInfo.f((String) null);
                            creativeInfo.f(false);
                        }
                        return;
                    }
                }
            } else {
                Logger.d(this.f29366a, "pending ci check - there are no pending candidates");
            }
        }
    }

    private void c(d dVar) {
        e eVar = I.get(dVar);
        if (eVar != null) {
            Logger.d(this.f29366a, "handle DID_HIDE, placementId=" + dVar.f29646b);
            eVar.ac = true;
        }
    }

    private void d(d dVar) {
        e eVar = I.get(dVar);
        if (eVar == null) {
            Logger.d(this.f29366a, "handle DID_CLICKED current activity banner is null");
            return;
        }
        if (eVar.D != null && CreativeInfoManager.a(eVar.c(), AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false)) {
            Logger.d(this.f29366a, "handle DID_CLICKED current activity banner multi ad");
            return;
        }
        eVar.a(true);
        if (eVar.e() != null) {
            Logger.d(this.f29366a, "handle DID_CLICKED current activity banner already have click url");
        } else if (N == null) {
            Logger.d(this.f29366a, "handle DID_CLICKED current click url candidate is null");
        } else if (N.f29658a == 0) {
            Logger.d(this.f29366a, "handle DID_CLICKED current click url candidate has zero timestamp");
        } else if (!a(eVar, N.f29659b, N.f29660c)) {
            Logger.d(this.f29366a, "handle DID_CLICKED ad click url is not valid");
        } else if (System.currentTimeMillis() - N.f29658a < 5000) {
            Logger.d(this.f29366a, "handle DID_CLICKED setting click URL to " + N.f29659b);
            eVar.c(N.f29659b);
            N = null;
        } else {
            Logger.d(this.f29366a, "handle DID_CLICKED click url candidate's timestamp is not within the time range");
        }
        a(eVar, false, "handleDidClicked");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f29081a;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(String str) {
        synchronized (BannerFinder.class) {
            Iterator<e> it = I.values().iterator();
            while (it.hasNext()) {
                it.next().ac = true;
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(String str, RedirectDetails redirectDetails, m mVar, boolean z2, boolean z3) {
        Logger.d(this.f29366a, "handle " + redirectDetails.e.name().toLowerCase() + " for " + str + " " + this.f29368c.name() + ", view address: " + redirectDetails.f29340f + ", requested URL: " + redirectDetails.f29341g + ", redirect URL: " + mVar.d + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        RedirectData redirectData = new RedirectData(str, BrandSafetyUtils.a(redirectDetails.d));
        if (redirectDetails.e == RedirectDetails.RedirectType.REDIRECT) {
            String str2 = mVar.f29756f;
            if (TextUtils.isEmpty(str2)) {
                str2 = z2 ? RedirectEvent.f29828h : RedirectEvent.f29829i;
            }
            redirectData.a(redirectDetails.f29341g, mVar.d, str2);
        } else if (redirectDetails.e == RedirectDetails.RedirectType.EXPAND) {
            redirectData.b(redirectDetails.f29341g, mVar.d, mVar.e);
            redirectData.a("expandedWebviewAddress=" + mVar.e);
        }
        if (redirectData.f29328a || redirectData.f29329b) {
            if (redirectDetails.f29343i != null) {
                redirectData.a("prev " + redirectDetails.f29343i);
            }
            if (mVar.f29757g != null) {
                redirectData.a("prev " + mVar.f29757g);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int f2 = SafeDK.getInstance().f();
            synchronized (BannerFinder.class) {
                for (e eVar : I.values()) {
                    Logger.d(this.f29366a, "current banner info view address is: " + eVar.K + " and view hierarchy: " + eVar.f29379m + " and sdk: " + eVar.f29388v + " vs redirect sdk: " + redirectDetails.f29339c + " and view address: " + redirectDetails.f29340f);
                    if (eVar.f29379m != null && eVar.f29379m.contains(redirectDetails.f29340f) && eVar.f29388v != null && eVar.f29388v.equals(str) && eVar.aa) {
                        boolean z4 = false;
                        for (int size = eVar.f29379m.size() - 1; size >= 0; size--) {
                            String str3 = eVar.f29379m.get(size);
                            u a2 = DetectTouchUtils.a(str, str3);
                            long longValue = a2 == null ? 0L : a2.f29770a.longValue();
                            Logger.d(this.f29366a, "handle " + redirectDetails.e.name().toLowerCase() + ", view: " + str3 + ", last touch event time: " + longValue + ", diff: " + (elapsedRealtime - longValue) + ", threshold: " + f2);
                            z4 = longValue != 0 && elapsedRealtime - longValue <= ((long) f2);
                            if (z4) {
                                break;
                            }
                        }
                        redirectData.f29330c = !z4;
                        Logger.d(this.f29366a, "handle " + (redirectData.f29330c ? "auto " : "") + redirectDetails.e.name().toLowerCase() + " for " + str + " " + this.f29368c.name() + ", view address: " + redirectDetails.f29340f + ", requested URL: " + redirectDetails.f29341g + ", redirect URL: " + mVar.d);
                        if (z3) {
                            if (redirectData.f29329b || (redirectData.f29328a && redirectData.f29330c)) {
                                if (redirectData.f29336k == null) {
                                    redirectData.f29336k = BrandSafetyUtils.a(this.f29368c);
                                }
                                if (redirectData.f29329b) {
                                    eVar.an = true;
                                }
                                l h2 = eVar.h();
                                if (h2 != null) {
                                    if (redirectData.f29329b) {
                                        ImpressionLog.a[] aVarArr = new ImpressionLog.a[1];
                                        aVarArr[0] = new ImpressionLog.a(ImpressionLog.F, redirectData.f29330c ? "auto" : "regular");
                                        eVar.a("exp", aVarArr);
                                    } else {
                                        ImpressionLog.a[] aVarArr2 = new ImpressionLog.a[1];
                                        aVarArr2[0] = new ImpressionLog.a(ImpressionLog.H, z2 ? RedirectEvent.f29828h : RedirectEvent.f29829i);
                                        eVar.a(ImpressionLog.x, aVarArr2);
                                    }
                                    h2.a(redirectData);
                                    a(eVar, false, "handleRedirect");
                                    return eVar;
                                }
                            } else {
                                Logger.d(this.f29366a, "skip reporting " + redirectDetails.e.name().toLowerCase() + " for " + str + " " + this.f29368c.name() + ", view address: " + redirectDetails.f29340f + ", requested URL: " + redirectDetails.f29341g + ", redirect URL: " + mVar.d);
                                return null;
                            }
                        } else {
                            a(redirectDetails, mVar, eVar);
                            return eVar;
                        }
                    }
                }
                if (z3) {
                    u a3 = DetectTouchUtils.a(str, redirectDetails.f29340f);
                    long longValue2 = a3 == null ? 0L : a3.f29770a.longValue();
                    Logger.d(this.f29366a, "handle " + redirectDetails.e.name().toLowerCase() + ", last touch event time: " + longValue2 + ", diff: " + (elapsedRealtime - longValue2) + ", threshold: " + f2);
                    redirectData.f29330c = longValue2 == 0 || elapsedRealtime - longValue2 > ((long) f2);
                    if (redirectData.f29329b || (redirectData.f29328a && redirectData.f29330c)) {
                        Logger.d(this.f29366a, "handle " + (redirectData.f29330c ? "auto " : "") + redirectDetails.e.name().toLowerCase() + " for " + str + " " + this.f29368c.name() + ", no banner info found, add to pending, webview: " + redirectDetails.f29340f);
                        M.put(redirectDetails.f29340f, redirectData);
                    } else {
                        Logger.d(this.f29366a, "handle " + (redirectData.f29330c ? "auto " : "") + redirectDetails.e.name().toLowerCase() + " for " + str + " " + this.f29368c.name() + ", no banner info found, don't add to pending, webview: " + redirectDetails.f29340f);
                    }
                } else {
                    a(redirectDetails, mVar, (e) null);
                }
            }
        }
        return null;
    }

    private void a(RedirectDetails redirectDetails, m mVar, e eVar) {
        if (eVar != null) {
            Logger.d(this.f29366a, "add redirect log events to ad info, " + redirectDetails + ", " + mVar);
            if (redirectDetails.f29342h.equals("shouldOverrideUrlLoading")) {
                eVar.a(redirectDetails.f29337a, redirectDetails.f29338b, ImpressionLog.f29270v, new ImpressionLog.a(ImpressionLog.J, "so"), new ImpressionLog.a("url", redirectDetails.f29341g), new ImpressionLog.a(ImpressionLog.L, "cancel"));
            } else {
                Long l2 = redirectDetails.f29337a;
                Long l3 = redirectDetails.f29338b;
                ImpressionLog.a[] aVarArr = new ImpressionLog.a[2];
                aVarArr[0] = new ImpressionLog.a(ImpressionLog.F, redirectDetails.e == RedirectDetails.RedirectType.REDIRECT ? RedirectEvent.f29824b : "expand");
                aVarArr[1] = new ImpressionLog.a("url", redirectDetails.f29341g);
                eVar.a(l2, l3, ImpressionLog.f29269u, aVarArr);
            }
            Long l4 = mVar.f29753a;
            Long l5 = mVar.f29754b;
            ImpressionLog.a[] aVarArr2 = new ImpressionLog.a[2];
            aVarArr2[0] = new ImpressionLog.a(ImpressionLog.F, mVar.f29756f != null ? mVar.f29756f : "normal");
            aVarArr2[1] = new ImpressionLog.a("url", mVar.d);
            eVar.a(l4, l5, ImpressionLog.w, aVarArr2);
            return;
        }
        Logger.d(this.f29366a, "add redirect log events to view address, " + redirectDetails + ", " + mVar);
        if (redirectDetails.f29342h.equals("shouldOverrideUrlLoading")) {
            a(redirectDetails.f29340f, redirectDetails.f29337a, redirectDetails.f29338b, ImpressionLog.f29270v, new ImpressionLog.a(ImpressionLog.J, "so"), new ImpressionLog.a("url", redirectDetails.f29341g), new ImpressionLog.a(ImpressionLog.L, "cancel"));
        } else {
            String str = redirectDetails.f29340f;
            Long l6 = redirectDetails.f29337a;
            Long l7 = redirectDetails.f29338b;
            ImpressionLog.a[] aVarArr3 = new ImpressionLog.a[2];
            aVarArr3[0] = new ImpressionLog.a(ImpressionLog.F, redirectDetails.e == RedirectDetails.RedirectType.REDIRECT ? RedirectEvent.f29824b : "expand");
            aVarArr3[1] = new ImpressionLog.a("url", redirectDetails.f29341g);
            a(str, l6, l7, ImpressionLog.f29269u, aVarArr3);
        }
        String str2 = redirectDetails.f29340f;
        Long l8 = mVar.f29753a;
        Long l9 = mVar.f29754b;
        ImpressionLog.a[] aVarArr4 = new ImpressionLog.a[2];
        aVarArr4[0] = new ImpressionLog.a(ImpressionLog.F, mVar.f29756f != null ? mVar.f29756f : "normal");
        aVarArr4[1] = new ImpressionLog.a("url", mVar.d);
        a(str2, l8, l9, ImpressionLog.w, aVarArr4);
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.K != null && eVar.K.equals(str2) && eVar.f29388v != null && eVar.f29388v.equals(str) && eVar.aa) {
                    return eVar.k();
                }
            }
            List<o> list = J.get(str);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (o oVar : list) {
                    if (oVar.f29758a != null && oVar.f29758a.af() != null && oVar.f29758a.af().equals(str2)) {
                        arrayList.add(oVar.f29758a);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Logger.d(this.f29366a, "get current CIs for webview address: " + str2 + ", found " + arrayList.size() + " pending CIs");
            }
            return arrayList;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.ao != null && eVar.ao.equals(str2) && eVar.f29388v != null && eVar.f29388v.equals(str) && eVar.aa) {
                    arrayList.add(eVar.i());
                }
            }
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> c(String str, String str2) {
        List<CreativeInfo> j2;
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar != null && (j2 = eVar.j()) != null && !j2.isEmpty() && j2.get(0) != null && j2.get(0).L().equals(str2)) {
                    return j2;
                }
            }
            List<o> list = J.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (o oVar : list) {
                    if (oVar.f29758a != null && oVar.f29758a.L().equals(str2)) {
                        arrayList.add(oVar.f29758a);
                    }
                }
                return arrayList;
            }
            return new ArrayList();
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c b(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f29379m != null && eVar.f29379m.contains(str) && eVar.aa) {
                    return eVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(e eVar) {
        try {
            Logger.d(this.f29366a, "clean started, currentActivityBanners size is " + I.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (eVar != null) {
                Logger.d(this.f29366a, "clean, adding to reported impressions map. id =  " + eVar.L);
                synchronized (BannerFinder.class) {
                    this.L.add(eVar.L);
                }
                eVar.ac = true;
                if (eVar.ae != null) {
                    eVar.ae.cancel(false);
                }
                for (l lVar : eVar.g()) {
                    if (lVar.f29740b != null && lVar.f29740b.f29692b != null) {
                        lVar.f29741c = lVar.f29740b.f29692b;
                        Logger.d(this.f29366a, "clean, set last impression screenshot filename to " + lVar.f29740b.f29692b);
                    }
                }
                if (eVar.j().isEmpty()) {
                    com.safedk.android.analytics.brandsafety.creatives.e.a(eVar.f29380n);
                    SafeDKWebAppInterface.a(eVar.K);
                } else {
                    for (CreativeInfo creativeInfo : eVar.j()) {
                        if (creativeInfo != null) {
                            String af = creativeInfo.af();
                            com.safedk.android.analytics.brandsafety.creatives.e.b(af, creativeInfo);
                            com.safedk.android.analytics.brandsafety.creatives.e.a(eVar.f29380n);
                            SafeDKWebAppInterface.a(af);
                        }
                    }
                }
                b((c) eVar);
            }
        } catch (Throwable th) {
            Logger.e(this.f29366a, "Error in clean " + th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e eVar, boolean z2, String str) {
        if (eVar == null) {
            Logger.d(this.f29366a, "reporting event - info is null, cannot report brand safety event");
            return;
        }
        boolean z3 = !eVar.E;
        Logger.d(this.f29366a, "reporting event started, root=" + str + ", info.isClickReported=" + eVar.F + ", info.isClicked()=" + eVar.d() + ", shouldReportImpression=" + z3 + ", eventId=" + eVar.L + ", isMature=" + z2 + ", isOnUiThread=" + com.safedk.android.utils.k.c());
        boolean z4 = !eVar.F && eVar.d();
        long j2 = 0;
        if (eVar.ai > 0 && eVar.aj > 0) {
            j2 = eVar.ai - eVar.aj;
        }
        ArrayList arrayList = new ArrayList();
        if (eVar.j().isEmpty()) {
            Logger.d(this.f29366a, "reporting event, root=" + str + ", isMature=" + z2 + ", info=" + eVar);
            arrayList.add(a(eVar, eVar.h(), z2, eVar.F || z4, j2, (String) null));
            a((c) eVar);
        } else {
            for (l lVar : eVar.g()) {
                if (lVar.e() != null && lVar.e().V() == null) {
                    Logger.d(this.f29366a, "reporting event - don't report CI as it was matched only by eventId and not by webview resources");
                    lVar.a((CreativeInfo) null);
                }
                String str2 = null;
                if (z2 && lVar.f29740b != null && lVar.f29740b.f29691a != null) {
                    str2 = lVar.f29740b.f29691a + "_" + lVar.f29739a;
                    Logger.d(this.f29366a, "reporting event - imageFileIsValid filename = " + BrandSafetyUtils.a(eVar.f29382p, lVar.f29740b.f29691a, eVar.c(), lVar.f29739a, lVar.f29740b.f29694f));
                }
                Logger.d(this.f29366a, "reporting event, root=" + str + ", isMature=" + z2 + ", info=" + eVar + ", uniformity=" + (lVar.f29740b != null ? lVar.f29740b.a(com.safedk.android.internal.d.f29936c) : 0.0f));
                arrayList.add(a(eVar, lVar, z2, eVar.F || z4, j2, str2));
                if (z2 && lVar.e() != null && lVar.f29740b != null) {
                    if (this.B.size() <= SafeDK.getInstance().H()) {
                        Logger.d(this.f29366a, "reporting event waiting to report file " + lVar.f29740b.f29692b);
                        a(eVar, lVar);
                    } else {
                        Logger.d(this.f29366a, "reporting event no open slot for " + this.f29368c + ", " + lVar.f29740b.f29691a);
                        BrandSafetyUtils.d(lVar.f29740b.f29692b);
                    }
                }
            }
        }
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.d(this.f29366a, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z3) {
            eVar.b(true);
        }
        if (z4) {
            eVar.c(true);
            Logger.d(this.f29366a, "reporting event - setIsClickReported set to true");
        }
    }

    private static BrandSafetyEvent a(e eVar, l lVar, boolean z2, boolean z3, long j2, String str) {
        return new BrandSafetyEvent(eVar.c(), eVar.q(), str, z3, eVar.d() ? eVar.e() : null, lVar.e(), eVar.a(), eVar.p(), lVar.f29739a != null ? lVar.f29739a : "", eVar.D, z2, eVar.r(), lVar.f29740b != null ? lVar.f29740b.f29694f : null, lVar.f29740b != null ? lVar.f29740b.f29693c : 0L, lVar.f29740b != null ? lVar.f29740b.a(com.safedk.android.internal.d.f29936c) : 0.0f, lVar.f29740b != null ? lVar.f29740b.e : 0, eVar.ag, eVar.ah, j2, eVar.ak, eVar.al, eVar.T, SafeDK.getInstance().e(), eVar.w(), eVar.M, eVar.N, eVar.P, eVar.Q, b(eVar, lVar).toString(), lVar.d, lVar.e, lVar.f29742f, lVar.f29743g);
    }

    protected void a(CreativeInfo creativeInfo, o oVar) {
        List<o> list;
        String Q2 = creativeInfo.Q();
        Logger.d(this.f29366a, "set CI details - adding as pending, sdk: " + Q2 + " matching info: " + oVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        synchronized (BannerFinder.class) {
            List<o> list2 = J.get(Q2);
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                J.put(Q2, arrayList);
                list = arrayList;
            } else {
                list = list2;
            }
            if (!CreativeInfoManager.a(Q2, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
                for (o oVar2 : list) {
                    if (oVar2.f29758a != null && oVar2.f29758a.equals(creativeInfo)) {
                        Logger.d(this.f29366a, "set CI details - CI already exists in pending list, sdk: " + Q2 + " matching info: " + oVar);
                        return;
                    }
                }
                list.add(oVar);
                creativeInfo.u("apci|ts=" + System.currentTimeMillis() + ";" + oVar.f29759b + "|o=" + oVar.f29758a.ae() + ";" + oVar.f29758a.af());
            } else {
                Logger.d(this.f29366a, "set CI details - NOT adding as pending (config based), sdk: " + Q2 + " matching info: " + oVar);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        try {
            com.safedk.android.utils.k.b(this.f29366a, "set CI details started. matchingInfo = " + oVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            CreativeInfo creativeInfo = oVar.f29758a;
            if (creativeInfo != null) {
                Logger.d(this.f29366a, "set CI details - CI exists in matchingInfo, sdk = " + creativeInfo.Q());
                creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
                synchronized (BannerFinder.class) {
                    Logger.d(this.f29366a, "set CI details - starting to iterate over current activity banners: " + I.keySet());
                    for (d dVar : I.keySet()) {
                        e eVar = I.get(dVar);
                        if (a(creativeInfo, eVar)) {
                            Logger.d(this.f29366a, "set CI details - matched by webView/eventID, CI: " + creativeInfo);
                            if (creativeInfo.m() == null) {
                                Logger.d(this.f29366a, "set CI details - updated creative info eventId to " + dVar.f29647c + ", banner key = " + dVar);
                                creativeInfo.f(dVar.f29647c);
                                creativeInfo.f(true);
                            }
                            if (creativeInfo.I() == null) {
                                String name = BrandSafetyUtils.a(eVar.A).name();
                                Logger.d(this.f29366a, "set CI details - set ad format: " + name);
                                creativeInfo.p(name);
                            }
                            if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false)) {
                                Logger.d(this.f29366a, "set CI details - SDK_USES_PLACEMENT_ID_ARRAY config item is true");
                                if (!creativeInfo.F().equals(dVar.f29646b)) {
                                    Logger.d(this.f29366a, "set CI details - updated creative info placementId to " + dVar.f29646b + ", banner key = " + dVar);
                                    creativeInfo.h(dVar.f29646b);
                                }
                            }
                            if (a(dVar.f29645a, dVar.e, oVar)) {
                                return true;
                            }
                            if (creativeInfo.B()) {
                                Logger.d(this.f29366a, "set CI details - unreal match and event id set happened, setting ci event id back to null");
                                creativeInfo.f(false);
                                creativeInfo.f((String) null);
                            }
                        }
                    }
                    a(creativeInfo, oVar);
                    return true;
                }
            }
        } catch (Throwable th) {
            Logger.e(this.f29366a, "set CI details exception: " + th.getMessage(), th);
        }
        return false;
    }

    private boolean a(CreativeInfo creativeInfo, e eVar) {
        if (eVar == null) {
            Logger.d(this.f29366a, "verify matching - banner info is null");
            return false;
        }
        if (eVar.f29388v == null) {
            Logger.d(this.f29366a, "verify matching - banner info maxSdk is null");
            return false;
        }
        if (creativeInfo == null) {
            Logger.d(this.f29366a, "verify matching - creative info is null");
            return false;
        }
        String Q2 = creativeInfo.Q();
        if (!eVar.f29388v.equals(Q2)) {
            Logger.d(this.f29366a, "verify matching  - sdks does not match, ci sdk is: " + Q2 + " and banner sdk is: " + eVar.f29388v);
            return false;
        }
        Logger.d(this.f29366a, "verify matching - ci sdk is: " + Q2 + ", banner info: " + eVar);
        if (eVar.L != null && creativeInfo.m() != null && !eVar.L.equals(creativeInfo.m())) {
            Logger.d(this.f29366a, "verify matching - incompatible event ID, ci: " + creativeInfo.m() + ", info: " + eVar.L);
            if (!CreativeInfoManager.a(eVar.f29388v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("CiMatchingWithIncompatibleEventId=" + creativeInfo.m());
        }
        return a(creativeInfo.ae(), creativeInfo.af(), eVar);
    }

    private boolean a(String str, String str2, e eVar) {
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str)) {
            Logger.d(this.f29366a, "verify matching object skipped, event ID: " + eVar.L + ", object address: " + str2 + ", object type: " + str);
            return true;
        }
        if (eVar.x() != null && eVar.x().contains(str2)) {
            Logger.d(this.f29366a, "verify matching object done, event ID: " + eVar.L + ", object address: " + str2 + ", views hierarchy: " + eVar.x());
            return true;
        }
        if (CreativeInfoManager.a(str2, eVar)) {
            Logger.d(this.f29366a, "verify matching object done, multiple webviews detected for banner. event ID: " + eVar.L + ", object address: " + str2 + ", views hierarchy: " + eVar.x());
            return true;
        }
        Logger.d(this.f29366a, "verify matching object failed, event ID: " + eVar.L + ", object address: " + str2 + ", views hierarchy: " + eVar.x());
        return false;
    }

    private boolean a(String str, String str2, o oVar) {
        e eVar;
        com.safedk.android.utils.k.b(this.f29366a, "set CI started, adUnitId=" + str + " matchingInfo=" + oVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (oVar == null) {
            Logger.d(this.f29366a, "set CI - no matching info");
            return false;
        }
        CreativeInfo creativeInfo = oVar.f29758a;
        if (creativeInfo != null) {
            d dVar = new d(creativeInfo.i() != null ? creativeInfo.i() : str, creativeInfo.F(), creativeInfo.m(), creativeInfo.Q(), str2, creativeInfo.K());
            Logger.d(this.f29366a, "set CI - activity key: " + dVar);
            synchronized (BannerFinder.class) {
                Iterator<d> it = I.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        eVar = null;
                        break;
                    }
                    d next = it.next();
                    if (dVar.a(next, creativeInfo)) {
                        eVar = I.get(next);
                        break;
                    }
                }
            }
            com.safedk.android.utils.k.b(this.f29366a, "set CI - current activity banner: " + eVar + ", current activity banners: " + I);
            if (eVar != null) {
                if (!eVar.ad && StatsReporter.b().a(creativeInfo, eVar)) {
                    eVar.ad = true;
                }
                CreativeInfo i2 = eVar.i();
                if (i2 != null) {
                    Logger.d(this.f29366a, "set CI - previous CI id: " + i2.L());
                    if (i2.L() != null && i2.L().equals(creativeInfo.L())) {
                        CreativeInfoManager.b(i2);
                        com.safedk.android.utils.k.b(this.f29366a, "set CI - already matched, same ad ID. current match: " + creativeInfo.X() + ", previous match: " + i2.X());
                    }
                }
                boolean z2 = creativeInfo.V() != null;
                creativeInfo.a(oVar.f29759b, oVar.f29760c);
                Logger.d(this.f29366a, "set CI - current banner webview address: " + eVar.K + " is CI set earlier: " + z2);
                Logger.d(this.f29366a, "set CI - current banner: " + eVar);
                Logger.d(this.f29366a, "set CI - current debug info: " + creativeInfo.U());
                eVar.a(creativeInfo);
                if (!z2) {
                    a(eVar.h());
                    eVar.h().f();
                }
                Logger.d(this.f29366a, "set CI - CI is set for activity banner " + dVar + ". CI : " + creativeInfo);
                if (j(eVar.c()) && creativeInfo.v() && eVar.am != null && !eVar.h().f29747k && eVar.am.d != null) {
                    eVar.am.d.cancel(false);
                    eVar.am = null;
                    Logger.d(this.f29366a, "set CI - canceling running impressionHandlerTask (ad is a video ad) " + eVar);
                }
                k(creativeInfo.af());
                if (eVar.K != null && (eVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP || eVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO)) {
                    com.safedk.android.utils.k.b(this.f29366a, "set CI - attach resources to CI, webview address: " + eVar.K + " , ci: " + creativeInfo);
                    com.safedk.android.analytics.brandsafety.creatives.e.b(eVar.K, creativeInfo);
                }
                if (i2 != null && i2.L() != null && i2.L().equals(creativeInfo.L())) {
                    Iterator<String> it2 = i2.q().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        if (!creativeInfo.q().contains(next2)) {
                            Logger.d(this.f29366a, "set CI - added resource URL " + next2 + " to CI");
                            creativeInfo.q().add(next2);
                        }
                    }
                    Iterator<String> it3 = i2.p().iterator();
                    while (it3.hasNext()) {
                        String next3 = it3.next();
                        if (!creativeInfo.p().contains(next3)) {
                            Logger.d(this.f29366a, "set CI - added DSP URL " + next3 + " to CI");
                            creativeInfo.p().add(next3);
                        }
                    }
                }
                b(eVar, creativeInfo);
                a(eVar, false, "setCreativeInfo");
                return true;
            }
            com.safedk.android.utils.k.b(this.f29366a, "set CI - no activity banner, cannot set CI. current activity banners: " + I);
            CreativeInfoManager.b(creativeInfo);
            return false;
        }
        Logger.d(this.f29366a, "set CI - no CI");
        return false;
    }

    private boolean a(c cVar, String str, String str2) {
        if (cVar != null) {
            String c2 = com.safedk.android.utils.k.c(str, "clcode");
            Logger.d(this.f29366a, "check ad click URL validity - clcode: " + c2 + ", view address: " + str2 + ", views hierarchy: " + cVar.x());
            CreativeInfo i2 = cVar.i();
            if ((c2 != null && i2 != null && !i2.L().equals(c2)) || cVar.x() == null || str2 == null || !cVar.x().contains(str2)) {
                Logger.d(this.f29366a, "check ad click URL validity - ad ID or view address does not match. clcode: " + c2 + ", view address: " + str2 + ", views hierarchy: " + cVar.x());
                return false;
            }
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        Logger.d(this.f29366a, "set ad click URL started, sdkPackageName: " + str2 + ", url: " + str + ", view address: " + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        List<CreativeInfo> a2 = a(str2, str3);
        if (a2 != null) {
            Iterator<CreativeInfo> it = a2.iterator();
            while (true) {
                z2 = z4;
                if (!it.hasNext()) {
                    break;
                }
                CreativeInfo next = it.next();
                if (!next.af().equals(str3) || next.ah()) {
                    z4 = z2;
                } else {
                    Logger.d(this.f29366a, "check ad click URL validity - view address: " + str3 + ", updating click_url in pending CIs list. url = " + str + ", adId = " + next.L());
                    next.t(str);
                    z4 = true;
                }
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            synchronized (BannerFinder.class) {
                for (e eVar : I.values()) {
                    if (eVar == null || eVar.c() == null || !SdksMapping.isSameSdkByPackages(eVar.c(), str2) || !a(eVar, str, str3)) {
                        z3 = z2;
                    } else {
                        if (!eVar.d()) {
                            Logger.d(this.f29366a, "set ad click URL - current activity banner is not marked as clicked, setting candidate: " + str);
                            i(str, str3);
                        } else if (eVar.e() == null) {
                            com.safedk.android.utils.k.b(this.f29366a, "set ad click URL - no click URL yet, setting click URL: " + str + ", CI: " + eVar.i());
                            if (eVar.c(str)) {
                                a(eVar, false, "setCurrentAdClickURL");
                            }
                        } else {
                            com.safedk.android.utils.k.b(this.f29366a, "set ad click URL - click URL already set: " + eVar.e() + ", CI: " + eVar.i());
                        }
                        z3 = true;
                    }
                    z2 = z3;
                }
            }
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b(String str, String str2, String str3) {
    }

    public void l(String str) {
        Logger.d(this.f29366a, "stop taking screenshots started, address = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                Logger.d(this.f29366a, "stop taking screenshots - checking banner info address = " + eVar.K);
                if (eVar.K != null && eVar.K.equals(str)) {
                    Logger.d(this.f29366a, "stop taking screenshots - address found. setting requestNoSamplingReceived. banner info address = " + eVar.K);
                    eVar.O = true;
                    for (l lVar : eVar.g()) {
                        if (lVar.e() != null && str != null && str.equals(lVar.e().af())) {
                            a(lVar);
                            if (lVar.f29740b != null && lVar.f29740b.f29692b != null) {
                                Logger.d(this.f29366a, "stop taking screenshots - removing hash and file " + lVar.f29740b.f29692b);
                                BrandSafetyUtils.d(lVar.f29740b.f29692b);
                                lVar.f29740b.f29691a = null;
                            }
                        }
                    }
                    a(eVar, false, "stopTakingScreenshotsForImpression");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i2) {
        boolean b2 = BrandSafetyUtils.b(i2);
        Logger.d(this.f29366a, "should stop sampling, max uniformed pixels count=" + i2 + ", return value=" + b2);
        return b2;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        Logger.d(this.f29366a, "on background started");
        if (I != null) {
            for (e eVar : I.values()) {
                if (eVar.aa && eVar.f29382p == this.f29368c) {
                    eVar.a(ImpressionLog.f29272z, new ImpressionLog.a[0]);
                    a(eVar, false, "onBackground");
                }
            }
        }
        BrandSafetyUtils.g();
    }

    @Override // com.safedk.android.internal.a
    public void h() {
        Logger.d(this.f29366a, "on foreground started");
        if (I != null) {
            for (e eVar : I.values()) {
                if (eVar.aa && eVar.f29382p == this.f29368c) {
                    eVar.a(ImpressionLog.A, new ImpressionLog.a[0]);
                    a(eVar, false, "onForeground");
                }
            }
        }
    }

    private void i(String str, String str2) {
        N = new h(System.currentTimeMillis(), str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r0.get(0).get() == r6) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(java.lang.String r5, com.applovin.mediation.ads.MaxAdView r6, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType r7) {
        /*
            java.lang.Class<com.safedk.android.analytics.brandsafety.BannerFinder> r2 = com.safedk.android.analytics.brandsafety.BannerFinder.class
            monitor-enter(r2)
            if (r5 == 0) goto L87
            if (r6 == 0) goto L87
            java.lang.String r0 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(r6)     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType> r1 = com.safedk.android.analytics.brandsafety.BannerFinder.P     // Catch: java.lang.Throwable -> L97
            r1.put(r0, r7)     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<com.applovin.mediation.ads.MaxAdView>>> r0 = com.safedk.android.analytics.brandsafety.BannerFinder.O     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L97
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L89
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97
            r0.<init>()     // Catch: java.lang.Throwable -> L97
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<com.applovin.mediation.ads.MaxAdView>>> r1 = com.safedk.android.analytics.brandsafety.BannerFinder.O     // Catch: java.lang.Throwable -> L97
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "BannerFinder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "add Max ad view: added adUnitId: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = " to maxAdViews map, isOnUiThread = "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97
            boolean r4 = com.safedk.android.utils.k.c()     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L97
            com.safedk.android.utils.Logger.d(r1, r3)     // Catch: java.lang.Throwable -> L97
        L4a:
            r1 = 0
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L97
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L97
            r0.add(r1, r3)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "BannerFinder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "add Max ad view: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = ", address: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(r6)     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = ", list size: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L97
            com.safedk.android.utils.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L97
        L87:
            monitor-exit(r2)
            return
        L89:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L97
            if (r1 != r6) goto L4a
            goto L87
        L97:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BannerFinder.a(java.lang.String, com.applovin.mediation.ads.MaxAdView, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType):void");
    }

    public static synchronized void a(MaxAdView maxAdView) {
        synchronized (BannerFinder.class) {
            P.remove(BrandSafetyUtils.a(maxAdView));
            Iterator<String> it = O.keySet().iterator();
            while (it.hasNext() && !a(it.next(), maxAdView)) {
            }
        }
    }

    public static synchronized boolean a(String str, MaxAdView maxAdView) {
        boolean z2;
        synchronized (BannerFinder.class) {
            List<WeakReference<MaxAdView>> list = O.get(str);
            if (maxAdView != null && list != null) {
                for (WeakReference<MaxAdView> weakReference : list) {
                    if (weakReference != null && maxAdView == weakReference.get()) {
                        weakReference.clear();
                        list.remove(weakReference);
                        Logger.d("BannerFinder", "remove Max ad view: " + maxAdView + ", address: " + BrandSafetyUtils.a(maxAdView) + ", list size: " + list.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        if (list.isEmpty()) {
                            O.remove(str);
                            Logger.d("BannerFinder", "remove Max ad view: removing adUnitId: " + str + " from maxAdViews");
                        }
                        z2 = true;
                    }
                }
            }
            z2 = false;
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
        a(lVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public void a(l lVar) {
        Logger.d(this.f29366a, "remove impression screenshots started with impression: " + lVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(this.f29366a, "remove impression screenshots started report impression size is: " + (this.C != null ? Integer.valueOf(this.C.size()) : "null"));
        if (lVar != null) {
            String str = lVar.f29741c;
            if (str == null && lVar.f29740b != null) {
                str = lVar.f29740b.f29692b;
            }
            if (str != null) {
                Logger.d(this.f29366a, "Calling remove ad files, filename = " + str);
                BrandSafetyUtils.d(str);
                lVar.f29741c = null;
            } else {
                Logger.d(this.f29366a, "lastActivityImpressionScreenshotFilename is null and image is: " + lVar.f29740b);
            }
        }
        if (this.C != null) {
            this.C.clear();
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        e f29165a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference<View> f29166b;

        /* renamed from: c, reason: collision with root package name */
        int f29167c = 0;
        ScheduledFuture<?> d;
        int e;

        public a(e eVar, WeakReference<View> weakReference, int i2, d dVar) {
            WeakReference<View> a2;
            this.f29166b = weakReference;
            this.f29165a = eVar;
            this.e = i2;
            String a3 = BrandSafetyUtils.a(weakReference.get());
            if (eVar != null) {
                eVar.K = a3;
                l h2 = eVar.h();
                Logger.d(BannerFinder.this.f29366a, "Impression handler task: webviewAddress: " + a3 + ", impression is: " + h2 + " CI is: " + (h2 != null ? h2.e() : null) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if (h2 != null && h2.e() != null) {
                    com.safedk.android.analytics.brandsafety.creatives.e.b(a3, h2.e());
                }
            } else {
                Logger.d(BannerFinder.this.f29366a, "Impression handler task: currentActivityBanner is null with webview address: " + a3);
            }
            AdNetworkDiscovery h3 = CreativeInfoManager.h(eVar.c());
            if (h3 != null && (a2 = h3.a(dVar)) != null && a2.get() != null) {
                this.f29166b = a2;
                Logger.d(BannerFinder.this.f29366a, "Impression handler task - view to take screenshot updated to: " + this.f29166b.get());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f29165a != null) {
                    this.f29167c++;
                    if (com.safedk.android.utils.k.a((Reference<?>) this.f29165a.af)) {
                        if (this.f29167c >= this.e || this.f29165a.ac) {
                            Logger.d(BannerFinder.this.f29366a, "Going to report banner, eventId=" + this.f29165a.L + ", stopTimerAndReport=" + this.f29165a.ac + ", image counter=" + this.f29167c + ", max attempts=" + this.e + ", isImpressionReported=" + this.f29165a.E);
                            if (!this.f29165a.E) {
                                BannerFinder.this.a(this.f29165a, false, "ImpressionHandlerTask");
                            }
                            this.f29166b.clear();
                            this.d.cancel(false);
                            return;
                        }
                        if (!this.f29165a.O) {
                            if (BannerFinder.this.a(this.f29165a) && com.safedk.android.utils.k.a((Reference<?>) this.f29166b)) {
                                a(this.f29165a, this.f29166b.get());
                                if ((this.f29166b.get() instanceof ViewGroup) && CreativeInfoManager.a(this.f29165a.c(), AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false)) {
                                    BannerFinder.this.a((ViewGroup) this.f29166b.get(), this.f29165a);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Logger.d(BannerFinder.this.f29366a, "no creative info yet or request no sampling received, current activity banner = " + this.f29165a);
                        return;
                    }
                    Logger.d(BannerFinder.this.f29366a, "timer task cannot be started: banner activity=" + (!com.safedk.android.utils.k.a((Reference<?>) this.f29165a.af) ? "" : this.f29165a.af.get().getClass().getName()) + ", current activity banner=" + this.f29165a);
                }
            } catch (Throwable th) {
                Logger.e(BannerFinder.this.f29366a, "ImpressionHandlerTask exception: ", th);
            }
        }

        private void a(final e eVar, final View view) {
            if (eVar != null && view != null) {
                try {
                    Logger.d(BannerFinder.this.f29366a, "Taking screenshot, view=" + view + ", event id=" + eVar.L + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    eVar.c();
                    WeakReference<Activity> weakReference = eVar.af;
                    if (com.safedk.android.utils.k.a((Reference<?>) weakReference)) {
                        weakReference.get().runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1
                            @Override // java.lang.Runnable
                            public void run() {
                                final Bitmap a2 = ScreenshotHelper.a(view, SafeDK.getInstance().V());
                                BannerFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.a.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        a.this.a(eVar, a2, a.this.f29167c);
                                    }
                                });
                            }
                        });
                    }
                } catch (Throwable th) {
                    Logger.e(BannerFinder.this.f29366a, "Error while taking screenshot", th);
                    Logger.printStackTrace();
                    new CrashReporter().caughtException(th);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(e eVar, Bitmap bitmap, int i2) {
            if (bitmap != null) {
                String c2 = eVar.c();
                BrandSafetyUtils.a b2 = BrandSafetyUtils.b(c2, bitmap);
                int a2 = b2.a();
                BrandSafetyUtils.ScreenshotValidity b3 = BrandSafetyUtils.b(c2, b2);
                if (b3 == BrandSafetyUtils.ScreenshotValidity.VALID) {
                    String a3 = BrandSafetyUtils.a(bitmap);
                    BrandSafetyUtils.ScreenShotOrientation b4 = BrandSafetyUtils.b(bitmap);
                    l h2 = eVar.h();
                    String a4 = BrandSafetyUtils.a(bitmap, BannerFinder.this.f29368c, a3, c2, h2.f29739a, b4);
                    if (!BannerFinder.this.e(a4, c2, a3)) {
                        Logger.d(BannerFinder.this.f29366a, "process screenshot - image is not valid : " + a4);
                    }
                    Logger.d(BannerFinder.this.f29366a, "process screenshot - screenshot file created, counter = " + i2 + " filename = " + a4 + ", hash = " + a3);
                    long c3 = BrandSafetyUtils.c(a4);
                    Logger.d(BannerFinder.this.f29366a, "process screenshot - hash " + a3 + ", stored file size is " + c3 + " bytes, counter is " + i2 + ", uniform pixel count is " + a2 + " (" + ((a2 / 500.0f) * 100.0f) + "%)");
                    int size = BannerFinder.this.B.size();
                    if (!BannerFinder.this.e(a3, h2.f29739a)) {
                        if (size <= SafeDK.getInstance().H()) {
                            if (h2.f29740b != null && h2.f29740b.f29691a != null && !h2.f29740b.f29691a.equals(a3)) {
                                Logger.d(BannerFinder.this.f29366a, "process screenshot - removing ad file " + h2.f29740b.f29692b);
                                BrandSafetyUtils.d(h2.f29740b.f29692b);
                            }
                            h2.b(ImpressionLog.f29268t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.N));
                            Logger.d(BannerFinder.this.f29366a, "process screenshot - setting data hash = " + a3 + ", file name = " + a4 + ", file size = " + c3 + ", max uniformed pixel count = " + a2 + ", image counter = " + i2);
                            h2.f29740b = new j(a3, a4, c3, a2, i2, b4, false);
                            BannerFinder.this.a(eVar, false, "processScreenshot");
                        } else if (!BannerFinder.this.d(a3, h2.f29739a)) {
                            Logger.d(BannerFinder.this.f29366a, "process screenshot - No open slot for " + a3 + "_" + h2.f29739a);
                            BrandSafetyUtils.d(a4);
                        } else {
                            Logger.d(BannerFinder.this.f29366a, "process screenshot - Image " + a3 + "_" + h2.f29739a + " is already scheduled for upload");
                        }
                    } else {
                        Logger.d(BannerFinder.this.f29366a, "process screenshot - Not saving file for " + a3 + "_" + h2.f29739a);
                        BrandSafetyUtils.d(a4);
                    }
                    if (BannerFinder.this.a(a2)) {
                        if (!TextUtils.isEmpty(a3)) {
                            eVar.d(true);
                            eVar.ac = true;
                        }
                        h2.a(ImpressionLog.f29268t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.O));
                        return;
                    }
                    return;
                }
                Logger.d(BannerFinder.this.f29366a, "process screenshot - screenshot is not valid: " + b3.name() + ", pixel count: " + a2 + ", counter = " + i2 + ", try again...");
            }
        }
    }

    protected boolean a(e eVar) {
        if (eVar != null) {
            if (!SafeDK.getInstance().G()) {
                CreativeInfo i2 = eVar.i();
                if (i2 == null) {
                    Logger.d(this.f29366a, "don't take screenshot, no creative info yet");
                } else {
                    boolean a2 = CreativeInfoManager.a(eVar.f29388v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    if (i2.ah() && !a2) {
                        Logger.d(this.f29366a, "don't take screenshot, multi ad, sdk: " + eVar.f29388v);
                    } else {
                        Logger.d(this.f29366a, "take screenshot, banner ad");
                        return true;
                    }
                }
            } else {
                Logger.d(this.f29366a, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(d dVar, Bundle bundle, String str) {
        e eVar = I.get(dVar);
        if (eVar == null || dVar.f29649g == null) {
            return false;
        }
        d dVar2 = Q.get(dVar.f29645a);
        if (dVar2 != null && !dVar2.equals(dVar)) {
            Logger.d(this.f29366a, "clear CI from banner info - a new banner has loaded instead, not deleting it");
            return false;
        }
        Logger.d(this.f29366a, "clear CI from banner info started with maxCreativeId: " + str + " and webview address: " + dVar.f29649g + " and adInfoKey: " + dVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(this.f29366a, "clear CI from banner info started with impressions size: " + eVar.g().size() + " banner info: " + eVar);
        List<l> g2 = eVar.g();
        for (l lVar : g2) {
            a(lVar);
            if (StatsCollector.c() != null) {
                StatsCollector.c().a(lVar.f29739a);
            }
        }
        g2.clear();
        long j2 = eVar.ai;
        long j3 = eVar.aj;
        e a2 = a(eVar.af.get(), eVar.f29388v, dVar.f29647c, bundle);
        a2.aa = true;
        a2.ag = true;
        a2.ai = j2;
        a2.aj = j3;
        a2.ah = true;
        I.put(dVar, a2);
        Logger.d(this.f29366a, "handle WILL_DISPLAY New activity banner created for " + a2.f29388v + ", banner key is " + dVar + ", current activity banners size is " + I.size());
        dVar.f29650h = null;
        return true;
    }

    private boolean a(String str, WeakReference<MaxAdView> weakReference, d dVar) {
        if (!CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false) || dVar.f29649g == null) {
            return false;
        }
        List<WeakReference<View>> a2 = a((ViewGroup) weakReference.get());
        List<String> c2 = c(a2);
        List<WeakReference<WebView>> b2 = b(a2);
        Logger.d(this.f29366a, "find banner impression - webview is: " + dVar.f29649g + " there are " + b2.size() + " webViews and the views addresses list is: " + c2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (c2.contains(dVar.f29649g) || b2.size() <= 0) {
            return false;
        }
        Logger.d(this.f29366a, "web view scanner - did not find webview address " + dVar.f29649g + " inside the views list, first webview address is: " + BrandSafetyUtils.a(b2.get(0).get()));
        return true;
    }

    protected void a(String str, String str2, d dVar, String str3, List<WeakReference<View>> list, List<String> list2) {
        try {
            List<WeakReference<MaxAdView>> list3 = O.get(dVar.f29645a);
            synchronized (BannerFinder.class) {
                if (list3 != null) {
                    for (WeakReference<MaxAdView> weakReference : list3) {
                        if (weakReference.get() != null) {
                            Logger.d(this.f29366a, "find banner impression - sdk: " + str + ", ad unit id: " + dVar.f29645a + ", max ad view: " + weakReference.get().toString() + ", address: " + BrandSafetyUtils.a(weakReference.get()) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            list2.add(BrandSafetyUtils.a(weakReference.get()));
                            arrayList2.add("h1c1:" + weakReference.get().toString());
                            String l2 = BrandSafetyUtils.l(str3);
                            dVar.f29651i = a(str, weakReference, dVar);
                            a(weakReference.get(), str, l2, str2, dVar, list, arrayList, list2, arrayList2, 1, false, false);
                            Logger.d(this.f29366a, "scan for banner views - viewHierarchy is: " + list2);
                            if (!list.isEmpty()) {
                                Logger.d(this.f29366a, "find banner impression - found views: " + arrayList);
                                com.safedk.android.utils.k.b(this.f29366a, "find banner impression - views hierarchy: " + arrayList2);
                                return;
                            }
                            Logger.d(this.f29366a, "find banner impression - no new views found for top view: " + weakReference.get().toString());
                        } else {
                            Logger.d(this.f29366a, "find banner impression - sdk: " + str + ", ad unit id: " + dVar.f29645a + ", no max ad view found");
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Logger.e(this.f29366a, "Failed while scanning the screen for banners", th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<WeakReference<View>> list, d dVar, long j2) {
        boolean z2;
        Logger.d(this.f29366a, "report completed banners started, views = " + list + ", adInfoKey = " + dVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        final ArrayList arrayList = new ArrayList();
        synchronized (BannerFinder.class) {
            for (Map.Entry<d, e> entry : I.entrySet()) {
                if (entry.getKey().equals(dVar)) {
                    Logger.d(this.f29366a, "report completed banners Skipping banner info of new impression, key=" + entry.getKey());
                } else if (!entry.getKey().f29645a.equals(dVar.f29645a)) {
                    Logger.d(this.f29366a, "report completed banners Skipping banner info of another adUnitId, key=" + entry.getKey());
                } else if (j2 <= entry.getValue().ai) {
                    Logger.d(this.f29366a, "report completed banners Skipping banner info of later impression, key=" + entry.getKey());
                } else {
                    Logger.d(this.f29366a, "report completed banners Check to report banner info, adInfoKey=" + entry.getKey());
                    entry.getKey();
                    e value = entry.getValue();
                    if (value.K != null) {
                        Logger.d(this.f29366a, "report completed banners Looking for completed banners to report, WebView=" + value.K);
                        if (list != null) {
                            Iterator<WeakReference<View>> it = list.iterator();
                            while (it.hasNext()) {
                                String a2 = BrandSafetyUtils.a(it.next().get());
                                if (value.K.equals(a2)) {
                                    Logger.d(this.f29366a, "report completed banners WebView address still active, WebView=" + a2);
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                    }
                    z2 = false;
                    if (!z2 && value.aa) {
                        Logger.d(this.f29366a, "report completed banners executing postponed banner reporting for eventId " + value.L);
                        value.a(ImpressionLog.C, new ImpressionLog.a[0]);
                        value.aa = false;
                        value.U = true;
                        arrayList.add(entry);
                    }
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            this.D.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    for (Map.Entry entry2 : arrayList) {
                        Logger.d(BannerFinder.this.f29366a, "report completed banners starting reporting for eventId " + ((e) entry2.getValue()).L);
                        if (!BannerFinder.this.L.contains(((d) entry2.getKey()).f29647c)) {
                            BannerFinder.this.a((e) entry2.getValue(), true, "reportCompletedBanners");
                            synchronized (BannerFinder.class) {
                                BannerFinder.I.remove(entry2.getKey());
                            }
                            BannerFinder.this.b((e) entry2.getValue());
                        }
                    }
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }

    protected void a(ViewGroup viewGroup, String str, String str2, String str3, d dVar, List<WeakReference<View>> list, List<v> list2, List<String> list3, List<String> list4, int i2, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        if (viewGroup != null) {
            int i3 = i2 + 1;
            int i4 = 0;
            while (i4 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i4);
                String a2 = BrandSafetyUtils.a(childAt);
                list3.add(a2);
                list4.add("h" + i3 + "c" + (i4 + 1) + CertificateUtil.DELIMITER + childAt);
                e eVar = I.get(dVar);
                if (!((eVar != null && eVar.i() == null && eVar.f29379m != null && eVar.f29379m.size() > 0) || !CreativeInfoManager.a(str, AdNetworkConfiguration.AVOID_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false)) || !a(childAt, str, str3, dVar)) {
                    if (TextUtils.isEmpty(str2)) {
                        z4 = true;
                    } else if (str2.equals(a2)) {
                        Logger.d(this.f29366a, "scan for banner views - verified by ad network view address received from Max: " + str2 + ", view: " + childAt + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (z4) {
                        a(viewGroup, str, dVar);
                    }
                    if (z4 && (childAt instanceof WebView)) {
                        a(childAt, str, list, list2, dVar);
                        return;
                    }
                    if (z4 && a(str, childAt)) {
                        a(childAt, str, list, list2, dVar);
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if ((childAt instanceof TextView) && z5) {
                        if (eVar != null && eVar.i() != null && !eVar.E()) {
                            TextView textView = (TextView) childAt;
                            eVar.i().y("text:" + textView.getText().toString());
                            Logger.d(this.f29366a, "scan for banner views - added text " + textView.getText().toString());
                        }
                    } else if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, str, str2, str3, dVar, list, list2, list3, list4, i3, z4, z5);
                    }
                    i4++;
                    z3 = z5;
                    z2 = z4;
                } else {
                    return;
                }
            }
        }
    }

    protected void b(ViewGroup viewGroup, List<v> list, List<String> list2, int i2) {
        if (viewGroup != null) {
            int i3 = i2 + 1;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i5);
                    list2.add("h" + i3 + "c" + (i5 + 1) + CertificateUtil.DELIMITER + childAt);
                    if (childAt instanceof WebView) {
                        list.add(new v(BrandSafetyUtils.a(childAt), childAt.getClass().getName(), childAt.getWidth(), childAt.getHeight()));
                        Logger.d(this.f29366a, "found expanded view: " + childAt + ": width: " + childAt.getWidth() + " height: " + childAt.getHeight() + " sdk: " + childAt.getClass().getName());
                    } else if (childAt instanceof ViewGroup) {
                        b((ViewGroup) childAt, list, list2, i3);
                    }
                    i4 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    protected void a(ViewGroup viewGroup, e eVar) {
        Logger.d(this.f29366a, "collect banner text started. view : " + viewGroup + ", bannerInfo : " + eVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (viewGroup != null) {
            if (eVar.E()) {
                Logger.d(this.f29366a, "collect banner text - ad is a native ad: " + viewGroup + ", child count is: " + viewGroup.getChildCount());
                return;
            }
            Logger.d(this.f29366a, "collect banner text - view is: " + viewGroup + ", child count is: " + viewGroup.getChildCount());
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i3);
                    Logger.d(this.f29366a, "collect banner text - child view " + i3 + " is: " + childAt);
                    if (childAt instanceof TextView) {
                        Logger.d(this.f29366a, "collect banner text - text box found. view " + childAt);
                        if (eVar != null && eVar.i() != null) {
                            TextView textView = (TextView) childAt;
                            eVar.i().y("text:" + textView.getText().toString());
                            Logger.d(this.f29366a, "collect banner text - added text " + textView.getText().toString());
                        }
                    } else if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, eVar);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    protected boolean a(View view, String str, List<WeakReference<View>> list, List<v> list2, d dVar) {
        String a2 = BrandSafetyUtils.a(view);
        Logger.d(this.f29366a, "handle ad view - view is an instance of " + view.getClass().getName() + " : " + a2 + ", class : " + view.getClass().getCanonicalName() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String sdkPackageByClass = SdksMapping.getSdkPackageByClass(view.getClass().getName());
        Logger.d(this.f29366a, "handle ad view - sdk of view: " + sdkPackageByClass + ", sdk: " + str + " and event id: " + dVar.f29647c);
        if ((c(view) || sdkPackageByClass == null || sdkPackageByClass.equals(str)) && !m(a2)) {
            list2.add(new v(a2, view.getClass().getName(), view.getWidth(), view.getHeight()));
            list.add(new WeakReference<>(view));
            Logger.d(this.f29366a, "found view: " + view + ": width: " + view.getWidth() + " height: " + view.getHeight() + " sdk: " + view.getClass().getName());
            if (view instanceof WebView) {
                return true;
            }
        }
        Logger.d(this.f29366a, "view is not a valid instance of web view, or web view already matched, view: " + view);
        return false;
    }

    public static boolean c(View view) {
        return view != null && view.getClass().getName().equals(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f29567o);
    }

    private boolean a(final View view, String str, final String str2, final d dVar) {
        String c2;
        final AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
        if (h2 == null) {
            Logger.d(this.f29366a, "extract ad ID from view - no discovery object for: " + str);
            return false;
        }
        boolean a2 = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
        boolean a3 = CreativeInfoManager.a(str, AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false);
        boolean a4 = CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
        boolean a5 = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
        e eVar = I.get(dVar);
        if (a2) {
            if (eVar != null && eVar.i() == null && eVar.f29379m != null && (c2 = h2.c(view)) != null) {
                Logger.d(this.f29366a, "extract ad ID from view - ad ID extracted from view: " + c2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if (a3 && str2 != null && !str2.equals(c2)) {
                    Logger.d(this.f29366a, "extract ad ID from view - value extracted (" + c2 + ") from widget is not equal to creative ID (" + str2 + ")");
                    return true;
                }
                Logger.d(this.f29366a, "extract ad ID from view - attempting to locate ci by ad ID value " + c2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                CreativeInfo a6 = h2.a((Object) c2);
                if (a6 != null) {
                    Logger.d(this.f29366a, "extract ad ID from view - CI found, ad ID = " + c2 + ", view : " + view.toString() + ", ci : " + a6);
                    a6.a((Object) view);
                    a6.f(dVar.f29647c);
                    a6.h(dVar.f29646b);
                    b(a6, eVar);
                    Logger.d(this.f29366a, "extract ad ID from view - ci placementId set to " + dVar.f29646b + ", event ID : " + dVar.f29647c + " , ad type  = " + a6.K());
                    a(new o(a6, CreativeInfo.f29626n, c2));
                    CreativeInfoManager.e(str, c2);
                } else {
                    Logger.d(this.f29366a, "extract ad ID from view - CI not found, adId = " + c2);
                }
            }
        } else if (a4) {
            final e eVar2 = I.get(dVar);
            final boolean a7 = CreativeInfoManager.a(str, AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
            final String a8 = BrandSafetyUtils.a(view);
            d dVar2 = Q.get(dVar.f29645a);
            final boolean z2 = dVar.f29651i && !dVar.f29649g.equals(a8) && (dVar2 == null || dVar2.equals(dVar));
            if (eVar2 != null && (eVar2.j().isEmpty() || z2)) {
                this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!a7 || eVar2.j().isEmpty() || (z2 && (view instanceof WebView))) {
                                List<CreativeInfo> a9 = h2.a(new WeakReference<>(view), str2, false);
                                if (a9 == null || a9.size() == 0) {
                                    Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - reflect CI not found for max creative Id: " + str2 + " and creative info size is: " + eVar2.j().size());
                                    return;
                                }
                                Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - ad info's webview is: " + dVar.f29649g + " and view address is: " + a8 + " and max creative id: " + str2 + " and banner info CI list size is: " + eVar2.j().size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                                Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - is the view webView? " + (view instanceof WebView) + " and event id is: " + dVar.f29647c);
                                for (CreativeInfo creativeInfo : a9) {
                                    creativeInfo.a((Object) view);
                                    creativeInfo.a(BannerFinder.this.f29368c);
                                    creativeInfo.f(dVar.f29647c);
                                    String F2 = creativeInfo.F();
                                    creativeInfo.h(dVar.f29646b);
                                    if (creativeInfo.L() == null) {
                                        creativeInfo.r(creativeInfo.N());
                                    }
                                    Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - reflect CI found, view : " + view + " did webview replaced? " + z2 + ", ci : " + creativeInfo.X());
                                    Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - current adInfoKey's MatchedCIId is: " + dVar.f29650h);
                                    String o2 = creativeInfo.M() != null ? com.safedk.android.utils.k.o(creativeInfo.M()) : null;
                                    Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - click url is: " + o2);
                                    if (dVar.f29650h != null && creativeInfo.L() != null) {
                                        if (!((!dVar.f29651i || dVar.f29650h.contains(new StringBuilder().append(creativeInfo.L()).append("##").toString()) || (F2 != null && dVar.f29650h.contains(new StringBuilder().append("##").append(F2).toString())) || (o2 != null && dVar.f29650h.contains(new StringBuilder().append("**").append(o2).toString()))) ? false : BannerFinder.this.a(dVar, eVar2.A, str2)) && dVar.f29650h != null && (dVar.f29650h.contains(creativeInfo.L() + "##") || dVar.f29650h.contains("##" + F2) || dVar.f29650h.contains("**" + o2))) {
                                            Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - redundant CI, exiting with event id - " + dVar.f29647c);
                                            return;
                                        }
                                    }
                                    dVar.f29649g = a8;
                                    String str3 = creativeInfo.L() + "##" + F2 + "**" + o2;
                                    if (dVar.f29650h == null || !dVar.f29650h.contains(str3)) {
                                        d dVar3 = dVar;
                                        if (dVar.f29650h != null) {
                                            str3 = dVar.f29650h + ImpressionLog.P + str3;
                                        }
                                        dVar3.f29650h = str3;
                                    }
                                    BannerFinder.this.a(new o(creativeInfo, CreativeInfo.f29626n, null));
                                }
                            }
                        } catch (Throwable th) {
                            Logger.e(BannerFinder.this.f29366a, "extract ad ID from view - exception occurred: " + th.getMessage(), th);
                        }
                    }
                });
            }
        } else if (a5 && eVar != null && eVar.j().isEmpty() && a(str, view) && eVar.E()) {
            com.safedk.android.utils.k.b(this.f29366a, "extract ad ID from view - info :" + eVar + ", ci : " + eVar.j());
            Logger.d(this.f29366a, "extract ad ID from view - attempting to find CI by adInfoKey " + dVar);
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.3
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfo a9 = h2.a((Object) (dVar.f29646b + "_" + dVar.f29647c + "_" + dVar.d));
                    if (a9 != null) {
                        Logger.d(BannerFinder.this.f29366a, "extract ad ID from view -  find CI by key found, adInfoKey : " + dVar + ", creativeInfo : " + a9 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        a9.a((Object) view);
                        a9.a(BannerFinder.this.f29368c);
                        a9.f(dVar.f29647c);
                        a9.h(dVar.f29646b);
                        if (a9.L() == null) {
                            a9.r(a9.N());
                        }
                        Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - reflect ci placement ID set to " + dVar.f29646b + ", event ID : " + dVar.f29647c);
                        BannerFinder.this.a(new o(a9, CreativeInfo.f29626n, null));
                        return;
                    }
                    Logger.d(BannerFinder.this.f29366a, "extract ad ID from view - reflect CI not found");
                }
            });
        }
        return false;
    }

    private void b(CreativeInfo creativeInfo, e eVar) {
        BrandSafetyUtils.AdType adType;
        Logger.d(this.f29366a, "update ad format : started, sdk = " + creativeInfo.Q() + ", initial ad type = " + creativeInfo.I() + " , bannerInfo = " + eVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false)) {
            Logger.d(this.f29366a, "update ad type. bannerInfo.isMrecAd : " + eVar.F());
            if (eVar.F()) {
                Logger.d(this.f29366a, "update ad type. Mrec identified");
                adType = BrandSafetyUtils.AdType.MREC;
            } else {
                Logger.d(this.f29366a, "update ad type. Banner identified");
                adType = BrandSafetyUtils.AdType.BANNER;
            }
            creativeInfo.p(adType.name());
            Logger.d(this.f29366a, "update ad type. ad type set to " + adType.name());
        }
    }

    private void a(ViewGroup viewGroup, String str, d dVar) {
        String a2 = BrandSafetyUtils.a((Class) viewGroup.getClass());
        if (!TextUtils.isEmpty(a2) && !a2.equals(str) && a2.equals(com.safedk.android.utils.g.f30053h)) {
            Logger.d(this.f29366a, "scar-admob ad identified");
            e eVar = I.get(dVar);
            if (eVar != null) {
                eVar.T = true;
            }
        }
    }

    private String a(View view, String str) {
        String a2 = BrandSafetyUtils.a((Class) view.getClass());
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        if (TextUtils.isEmpty(str)) {
            return view.getClass().getName();
        }
        return str;
    }

    public void c(final Activity activity) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BannerFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    BannerFinder.this.d(activity);
                }
            });
        } else {
            d(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        Logger.d(this.f29366a, "start monitoring of redirect/expand, activity: " + activity + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        e a2 = BrandSafetyUtils.a(activity);
        if (a2 != null) {
            a2.ap = activity.toString();
            l h2 = a2.h();
            if (h2 != null && h2.d != null) {
                h2.d.a("redirectActivityName=" + a2.ap);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(String str) {
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.an && eVar.ap != null && eVar.ap.equals(str)) {
                    a(eVar, false, "onActivityDestroyed");
                    return;
                }
            }
        }
    }

    public void a(String str, String str2, String str3, d dVar, Bundle bundle) {
        e eVar;
        Activity a2 = a(bundle);
        if (this.L.contains(dVar.f29647c)) {
            Logger.d(this.f29366a, "handle REVENUE_EVENT - impression with id " + dVar.f29647c + " has already been reported, ignoring. ");
            return;
        }
        if (g(str, str2)) {
            synchronized (BannerFinder.class) {
                eVar = I.get(dVar);
                if (eVar == null) {
                    eVar = a(a2, str2, dVar.f29647c, bundle);
                    I.put(dVar, eVar);
                    Logger.d(this.f29366a, "New activity banner created for " + str2 + ", banner key is " + dVar + ", current activity banners size is " + I.size() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                } else {
                    if (eVar.A == null) {
                        eVar.A = bundle;
                    }
                    if (eVar.B == null || eVar.C == null) {
                        eVar.a(a(a2));
                    }
                }
            }
            if (eVar != null) {
                if (bundle.getString("revenue_event") != null) {
                    eVar.P = bundle.getString("revenue_event");
                } else {
                    eVar.P = "unknown";
                }
                eVar.M = str3;
                a(eVar, false, "handleRevenueEvent");
                Logger.d(this.f29366a, "Revenue event set to " + bundle.getString("revenue_event") + " for eventId " + dVar.f29647c);
                eVar.aa = true;
                return;
            }
            return;
        }
        this.d++;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean c(String str, String str2, String str3) {
        l h2;
        String d = BrandSafetyUtils.d();
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (str2 != null && str2.equals(eVar.K) && (h2 = eVar.h()) != null && h2.d != null && str3 != null && (str3.equals(h2.d.d) || str3.equals(d))) {
                    Logger.d(this.f29366a, "redirect url was loaded to the ad web view: " + str2 + " url: " + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    h2.e().a(true);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2) {
        return false;
    }

    public static String a(MaxNativeAdView maxNativeAdView) {
        String a2 = BrandSafetyUtils.a(maxNativeAdView);
        synchronized (BannerFinder.class) {
            for (e eVar : I.values()) {
                if (eVar.f29379m != null && eVar.f29379m.contains(a2)) {
                    return eVar.f29388v;
                }
            }
            return null;
        }
    }

    public void h(String str, String str2) {
        CreativeInfo i2;
        AdNetworkDiscovery h2;
        WeakReference<View> a2;
        Logger.d(this.f29366a, "set on video completed event has been triggered - started for sdk= " + str + ",   adId= " + str2);
        for (d dVar : I.keySet()) {
            e eVar = I.get(dVar);
            if (eVar != null && (i2 = eVar.i()) != null && !TextUtils.isEmpty(i2.L()) && i2.L().equals(str2)) {
                Logger.d(this.f29366a, "set on video completed event has been triggered - found ci= " + i2);
                eVar.h().f29747k = true;
                eVar.A();
                a aVar = eVar.am;
                if (aVar == null && (h2 = CreativeInfoManager.h(str)) != null && (a2 = h2.a(dVar)) != null && a2.get() != null) {
                    a aVar2 = new a(eVar, a2, this.e, dVar);
                    Logger.d(this.f29366a, "set on video completed event has been triggered - new task created= " + aVar2);
                    aVar = aVar2;
                }
                if (aVar != null) {
                    aVar.d = this.D.scheduleAtFixedRate(aVar, H, SafeDK.getInstance().U() * 1000, TimeUnit.MILLISECONDS);
                } else {
                    Logger.d(this.f29366a, "set on video completed event has been triggered - impression handler is null, could not start future task.");
                }
            }
        }
    }
}
