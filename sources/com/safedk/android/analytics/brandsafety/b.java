package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.applovin.mediation.ads.MaxAdView;
import com.facebook.internal.security.CertificateUtil;
import com.safedk.android.SafeDK;
import com.safedk.android.a.g;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public abstract class b implements a {
    protected static final List<String> A = Arrays.asList(com.safedk.android.utils.g.f30056k);
    protected static final Map<String, ImpressionLog> E = new LimitedConcurrentHashMap(30);

    /* renamed from: f, reason: collision with root package name */
    public static final String f29347f = "ad_format";

    /* renamed from: g, reason: collision with root package name */
    protected static final String f29348g = "type";

    /* renamed from: h, reason: collision with root package name */
    protected static final String f29349h = "WILL_DISPLAY";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f29350i = "WILL_LOAD";

    /* renamed from: j, reason: collision with root package name */
    protected static final String f29351j = "DID_HIDE";

    /* renamed from: k, reason: collision with root package name */
    protected static final String f29352k = "DID_CLICKED";

    /* renamed from: l, reason: collision with root package name */
    protected static final String f29353l = "DID_LOAD";

    /* renamed from: m, reason: collision with root package name */
    protected static final String f29354m = "DID_DISPLAY";

    /* renamed from: n, reason: collision with root package name */
    protected static final String f29355n = "DID_FAIL_DISPLAY";

    /* renamed from: o, reason: collision with root package name */
    protected static final String f29356o = "id";

    /* renamed from: p, reason: collision with root package name */
    protected static final String f29357p = "network_name";

    /* renamed from: q, reason: collision with root package name */
    protected static final String f29358q = "third_party_ad_placement_id";

    /* renamed from: r, reason: collision with root package name */
    protected static final String f29359r = "creative_id";

    /* renamed from: s, reason: collision with root package name */
    protected static final String f29360s = "max_ad_unit_id";

    /* renamed from: t, reason: collision with root package name */
    protected static final String f29361t = "ad_view";

    /* renamed from: u, reason: collision with root package name */
    protected static final String f29362u = "dsp_name";

    /* renamed from: v, reason: collision with root package name */
    public static final int f29363v = 120;
    public static final String w = "revenue_event";
    public static final String x = "unknown";

    /* renamed from: y, reason: collision with root package name */
    public static final String f29364y = "no_CI_report";

    /* renamed from: z, reason: collision with root package name */
    protected static final String f29365z = "_BIDDING";

    /* renamed from: a, reason: collision with root package name */
    protected String f29366a;

    /* renamed from: b, reason: collision with root package name */
    protected List<String> f29367b;

    /* renamed from: c, reason: collision with root package name */
    protected BrandSafetyUtils.AdType f29368c;
    int e;
    protected int d = 0;
    protected final Map<String, c> B = new ConcurrentHashMap();
    protected final Set<String> C = new HashSet();
    protected final ScheduledExecutorService D = Executors.newScheduledThreadPool(1);

    protected abstract c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5);

    /* JADX INFO: Access modifiers changed from: protected */
    public b(BrandSafetyUtils.AdType adType, List<String> list, String str, int i2) {
        this.e = 0;
        this.f29366a = str;
        this.f29368c = adType;
        this.f29367b = list;
        this.e = i2;
        Logger.d(this.f29366a, "ctor started, type: " + this.f29368c + ", supported formats: " + this.f29367b + ", maxAttemptsToCaptureImage = " + i2 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        d();
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        AppLovinBridge.registerToReceiveMaxEvents(this);
        AppLovinBridge.registerToReceiveMaxRevenueEvents(this);
        if (Build.VERSION.SDK_INT >= 21) {
            ((ScheduledThreadPoolExecutor) this.D).setRemoveOnCancelPolicy(true);
            Logger.d(this.f29366a, "ctor thread pool removal policy set");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> b(String str, String str2) {
        return new ArrayList();
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public BrandSafetyUtils.AdType a() {
        return this.f29368c;
    }

    public int b() {
        return this.B.size();
    }

    private void d() {
        List<BrandSafetyUtils.d> c2 = BrandSafetyUtils.c(this.f29368c);
        for (int i2 = 0; i2 < c2.size(); i2++) {
            BrandSafetyUtils.d dVar = c2.get(i2);
            String str = dVar.a() + "_" + dVar.c();
            synchronized (this.B) {
                this.B.put(str, a(dVar.a(), dVar.b(), dVar.c(), dVar.d(), dVar.e(), dVar.f()));
            }
        }
        Logger.d(this.f29366a, "restore impressions for upload - number of loaded impressions to report " + this.B.size() + " " + this.B.keySet());
        if (this.B.size() > 0 && StatsCollector.b()) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(String str, View view) {
        AdNetworkDiscovery h2;
        if (str == null || (h2 = CreativeInfoManager.h(str)) == null) {
            return false;
        }
        return h2.f(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void a(k.b bVar, k.a aVar, String str, String str2) {
        Logger.d(this.f29366a, "handle upload request started, imageToUpload=" + str + ", adInfoCollectionForUpload=" + this.B);
        if (this.B.get(str) != null) {
            Bundle a2 = a(str, bVar, aVar, str2);
            g.a(a2);
            Logger.d(this.f29366a, "handle upload request - attempting to remove the file " + (a2 != null ? a2.getString(c.f29374h) : ""));
            e(str);
        } else {
            Logger.d(this.f29366a, "handle upload request - adInfoCollectionForUpload doesn't contain imageToUpload " + str);
        }
        Logger.d(this.f29366a, "handle upload request - adInfoCollectionForUpload remove key " + str);
        synchronized (this.B) {
            this.B.remove(str);
            Logger.d(this.f29366a, "handle upload request - number of loaded impressions to report " + this.B.size() + " " + this.B.keySet());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void d(String str) {
        Logger.d(this.f29366a, "handle discard request started, imageToDiscard=" + str + ", adInfoCollectionForUpload=" + this.B + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        e(str);
        c cVar = this.B.get(str);
        if (cVar != null) {
            for (l lVar : cVar.g()) {
                if (str.contains(lVar.f29739a)) {
                    b(lVar);
                }
            }
        }
        Logger.d(this.f29366a, "handle discard request - adInfoCollectionForUpload remove key " + str);
        synchronized (this.B) {
            this.B.remove(str);
            Logger.d(this.f29366a, "handle discard request - number of loaded impressions to report " + this.B.size() + " " + this.B.keySet());
        }
    }

    public synchronized void e(String str) {
        Logger.d(this.f29366a, "Cleaning stored impressions: " + str);
        BrandSafetyUtils.a(this.f29368c, str);
        f(str);
    }

    protected void f(String str) {
        Logger.d(this.f29366a, "removal all impression images started, reportedImage = " + str + ", adInfoCollectionForUpload keys = " + this.B.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (str.contains("_")) {
            String str2 = str.split("_")[1];
            Logger.d(this.f29366a, "removal all impression images impressionId = " + str2);
            synchronized (this.B) {
                Iterator<Map.Entry<String, c>> it = this.B.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, c> next = it.next();
                    if (next.getKey().endsWith(str2)) {
                        Logger.d(this.f29366a, "removal all impression images removing " + next.getKey() + " ");
                        it.remove();
                    }
                }
                Logger.d(this.f29366a, "removal all impression images - number of loaded impressions to report " + this.B.size() + " " + this.B.keySet());
            }
        }
        File dir = SafeDK.getInstance().l().getDir("SafeDK_" + this.f29368c, 0);
        Logger.d(this.f29366a, "removal all impression images getting files for dir" + dir.getPath());
        Logger.d(this.f29366a, "removal all impression images files for dir" + dir.getPath() + " : " + com.safedk.android.utils.b.a(dir.getPath()));
    }

    protected String g(String str) {
        String[] split;
        if (str == null || (split = new File(str).getName().replace(".jpg", "").split("_")) == null || split.length < 4) {
            return null;
        }
        return split[0] + "_" + split[2];
    }

    private Bundle a(String str, k.b bVar, k.a aVar, String str2) {
        String str3;
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation;
        String str4;
        g.a a2;
        String str5;
        Bundle bundle = null;
        synchronized (this.B) {
            Logger.d(this.f29366a, "Uploading impression " + str + " to server, timeout=" + SafeDK.getInstance().J() + "ms, adInfoCollectionForUpload = " + this.B + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        }
        c cVar = this.B.get(str);
        if (cVar != null) {
            Iterator<l> it = cVar.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str3 = null;
                    screenShotOrientation = null;
                    str4 = null;
                    break;
                }
                l next = it.next();
                if (next.f29740b != null && str.equals(next.f29740b.f29691a + "_" + next.f29739a)) {
                    str4 = next.f29740b.f29692b;
                    BrandSafetyUtils.ScreenShotOrientation screenShotOrientation2 = next.f29740b.f29694f;
                    if (next.e() != null) {
                        str3 = next.e().I();
                        screenShotOrientation = screenShotOrientation2;
                    } else {
                        str3 = null;
                        screenShotOrientation = screenShotOrientation2;
                    }
                }
            }
            if (str4 != null && new File(str4).exists()) {
                String p2 = BrandSafetyUtils.p(str4);
                Logger.d(this.f29366a, "Uploading impression - ad type " + cVar.f29382p + ", file hash is " + p2 + ", imageToUpload = " + str + ", match ? " + str.startsWith(p2) + ", fingerprint = " + str2);
                if (!str.startsWith(p2)) {
                    Logger.d(this.f29366a, "Uploading impression - fileHash " + p2 + ", imageToUpload = " + str + " does not match, not uploading");
                } else {
                    if (bVar != null) {
                        a2 = new com.safedk.android.a.c(str4, str, SafeDK.getInstance().J(), bVar).a();
                    } else {
                        a2 = aVar != null ? new com.safedk.android.a.a(str4, str, SafeDK.getInstance().J(), aVar).a() : null;
                    }
                    if (a2 != null) {
                        String a3 = a2.a();
                        String c2 = a2.c();
                        if (str3 == null) {
                            BrandSafetyEvent.AdFormatType a4 = BrandSafetyUtils.a(cVar.r());
                            str5 = a4 != null ? a4.name() : null;
                        } else {
                            str5 = str3;
                        }
                        if (str5 == null) {
                            str5 = BrandSafetyUtils.a(this.f29368c).name();
                            Logger.d(this.f29366a, "adFormat set to " + str5);
                        }
                        Logger.d(this.f29366a, "Upload impression image succeeded: " + a3 + ", return code =" + a2.b());
                        if (a3 != null && !a3.isEmpty()) {
                            bundle = new Bundle();
                            try {
                                bundle.putString(k.f29698c, str2);
                                bundle.putString("ad_format_type", str5);
                                bundle.putString(c.f29374h, a3);
                                bundle.putString("image_orientation", screenShotOrientation.name().toLowerCase());
                                bundle.putString(AppLovinBridge.e, "android");
                                bundle.putString("image_id", c2);
                                bundle.putString("package", SafeDK.getInstance().l().getPackageName());
                            } catch (Throwable th) {
                                Logger.e(this.f29366a, th.getMessage(), th);
                                new CrashReporter().caughtException(th);
                            }
                        }
                    } else {
                        Logger.d(this.f29366a, "upload response is null, imageToUpload = " + str);
                        f(str);
                    }
                }
            } else {
                Logger.d(this.f29366a, "Uploading impression - filename " + str4 + "not found, not uploading");
            }
        } else {
            Logger.d(this.f29366a, "impressionInfoToUpload is null");
        }
        return bundle;
    }

    public synchronized void c() {
        Logger.d(this.f29366a, "synchronize impressions and events - impression size is: " + this.B.size() + " and keys: " + this.B.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(this.f29366a, "synchronize impressions and events - BrandSafetyEvents keys " + StatsCollector.c().a(StatsCollector.EventType.BrandSafety).keySet());
        ConcurrentHashMap<String, StatsEvent> a2 = StatsCollector.c().a(StatsCollector.EventType.BrandSafety);
        Iterator<Map.Entry<String, c>> it = this.B.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            c value = next.getValue();
            String key = next.getKey();
            l h2 = value.h();
            if (h2 != null) {
                if (h2.f29740b != null && h2.f29740b.f29692b != null) {
                    Logger.d(this.f29366a, "synchronize impressions and events - deleting file: " + h2.f29740b.f29692b);
                    BrandSafetyUtils.d(h2.f29740b.f29692b);
                }
                BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) a2.get(h2.f29739a);
                if (brandSafetyEvent == null || key == null || !key.equals(brandSafetyEvent.a())) {
                    Logger.d(this.f29366a, "synchronize impressions and events - remove impressionId: " + h2.f29739a + ", impression hash: " + key + ", event hash: " + (brandSafetyEvent != null ? brandSafetyEvent.a() : "null"));
                    it.remove();
                } else if (brandSafetyEvent.a() != null) {
                    Logger.d(this.f29366a, "synchronize impressions and events - clearing image hash value: " + brandSafetyEvent.a());
                    brandSafetyEvent.d();
                }
            }
        }
        Logger.d(this.f29366a, "synchronize impressions and events - number of loaded impressions to report " + this.B.size() + " " + this.B.keySet());
    }

    public static c h(String str) {
        if (str != null) {
            for (b bVar : SafeDK.getInstance().x().values()) {
                synchronized (bVar.B) {
                    Logger.d("AdFinderBase", "get impression ad info by image ID: " + str + ", type: " + bVar.a() + ", keys: " + bVar.B.keySet() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                }
                c cVar = bVar.B.get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public synchronized void a(c cVar, l lVar) {
        if (cVar != null) {
            if (lVar.f29740b != null && lVar.f29740b.f29691a != null && lVar.f29739a != null) {
                Logger.d(this.f29366a, "add info collection for upload " + lVar.f29740b.f29691a + "_" + lVar.f29739a + ", file = " + lVar.f29740b.f29692b);
                this.B.put(lVar.f29740b.f29691a + "_" + lVar.f29739a, cVar);
                Logger.d(this.f29366a, "add info collection for upload - number of loaded impressions to report " + this.B.size() + " " + this.B.keySet());
            }
        }
    }

    public boolean d(String str, String str2) {
        return this.B.containsKey(str + "_" + str2);
    }

    public boolean e(String str, String str2) {
        return this.C.contains(str + "_" + str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e(String str, String str2, String str3) {
        BrandSafetyUtils.a aVar;
        try {
            if (new File(str).exists()) {
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                if (com.safedk.android.utils.k.a(decodeFile.getWidth(), decodeFile.getHeight()) || com.safedk.android.utils.k.b(decodeFile.getWidth(), decodeFile.getHeight())) {
                    BrandSafetyUtils.a b2 = BrandSafetyUtils.b(str2, decodeFile);
                    r0 = BrandSafetyUtils.b(str2, b2) == BrandSafetyUtils.ScreenshotValidity.VALID;
                    aVar = b2;
                } else {
                    BrandSafetyUtils.a a2 = BrandSafetyUtils.a(str2, decodeFile);
                    r0 = BrandSafetyUtils.a(str2, a2) == BrandSafetyUtils.ScreenshotValidity.VALID;
                    aVar = a2;
                }
                Logger.d(this.f29366a, "Image file validation check hashValue = " + str3 + ", dimen h,w: " + decodeFile.getHeight() + "," + decodeFile.getWidth() + ", bitmapScanResult result = " + aVar + ", isValid = " + r0 + ", filename = " + str);
            } else {
                Logger.d(this.f29366a, "Image file validation check file does not exist = " + str);
            }
        } catch (Throwable th) {
            Logger.d(this.f29366a, "Image file validation check exception : " + th.getMessage(), th);
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(List<o> list) {
        if (list == null || list.size() == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < list.size() - 1) {
                sb.append(list.get(i3).f29758a.af()).append(", ");
                i2 = i3 + 1;
            } else {
                sb.append(list.get(list.size() - 1).f29758a.af()).append("]");
                return sb.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String[] a(Activity activity) {
        String str;
        String str2;
        if (activity != null) {
            String obj = activity.toString();
            String a2 = BrandSafetyUtils.a(obj, true);
            str = BrandSafetyUtils.a(obj, false);
            str2 = a2;
        } else {
            str = null;
            str2 = null;
        }
        return new String[]{str, str2};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(c cVar) {
        if (cVar != null) {
            Logger.d(this.f29366a, "attach resource urls to impression - webview_resource_urls before getting WebView resource urls : " + cVar.K + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (cVar.h() != null && cVar.h().e() == null && cVar.g().size() == 1) {
                Logger.d(this.f29366a, "attach resource urls to impression - webview_resource_urls getting WebView resource urls for WebView address: " + cVar.K);
                com.safedk.android.analytics.brandsafety.creatives.e.a(cVar.h(), cVar.K, cVar instanceof n ? false : true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(c cVar, boolean z2) {
        if (cVar == null) {
            Logger.d(this.f29366a, "clearImpressionScreenshotsIfNeeded adInfo is null");
            return;
        }
        if (z2 && !cVar.h().f29747k && !cVar.I) {
            Logger.d(this.f29366a, "Video is marked as completed, clearing any images taken previously");
            for (l lVar : cVar.g()) {
                if (lVar.e() != null && cVar.K != null && cVar.K.equals(lVar.e().af())) {
                    a(lVar);
                }
            }
            cVar.I = true;
            return;
        }
        Logger.d(this.f29366a, "avoid clearing any images taken previously: videoCompleted=" + z2 + " onVideoCompletedEventHasBeenTriggered=" + cVar.h().f29747k + " impressionScreenshotsRemoved=" + cVar.I);
    }

    public synchronized void a(l lVar) {
    }

    public static boolean a(c cVar, CreativeInfo creativeInfo) {
        String a2;
        return CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false) && (a2 = CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null)) != null && a2.contains(cVar.A()) && cVar.z() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(c cVar, CreativeInfo creativeInfo) {
        if (a(cVar, creativeInfo)) {
            Logger.d(this.f29366a, "should Replace Prefetch CreativeId With Max CreativeId, Updating CreativeId from " + cVar.i().N() + " to " + cVar.z());
            cVar.i().i(cVar.z());
        }
    }

    static void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i3);
                    list.add(new WeakReference<>(childAt));
                    if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, list);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<WeakReference<View>> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(viewGroup));
        a(viewGroup, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<WeakReference<WebView>> b(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.k.a((Reference<?>) weakReference) && (weakReference.get() instanceof WebView)) {
                WebView webView = (WebView) weakReference.get();
                arrayList.add(new WeakReference(webView));
                Logger.d(this.f29366a, "getWebViews added WebView address " + webView);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> c(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.k.a((Reference<?>) weakReference)) {
                arrayList.add(BrandSafetyUtils.a(weakReference.get()));
            } else {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    public Activity a(Context context) {
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
            Logger.d(this.f29366a, "getActivity: now context type is: " + context2.getClass().getName());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity a(Bundle bundle) {
        Logger.d("AdFinderBase", "getMaxAdViewActivity: started, isOnUiThread = " + com.safedk.android.utils.k.c());
        String l2 = BrandSafetyUtils.l(bundle.getString(f29361t, null));
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        try {
            Iterator<WeakReference<Activity>> it = com.safedk.android.internal.b.getInstance().getAppActivities().iterator();
            while (it.hasNext()) {
                WeakReference<Activity> next = it.next();
                if (next != null && next.get() != null) {
                    Activity activity = next.get();
                    View findViewById = activity.findViewById(R.id.content);
                    if ((findViewById instanceof ViewGroup) && c(a((ViewGroup) findViewById)).contains(l2)) {
                        Logger.d("AdFinderBase", "getMaxAdViewActivity: found activity with name " + activity.getClass().getName());
                        return activity;
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("AdFinderBase", "getMaxAdViewActivity: exception occurred " + e.getMessage());
        }
        return foregroundActivity;
    }

    void b(Activity activity) {
        String a2 = BrandSafetyUtils.a(com.safedk.android.internal.b.getInstance().getForegroundActivity().getClass().getName(), true);
        String a3 = BrandSafetyUtils.a(activity.getClass().getName(), true);
        if (a3 != null && !a3.equals(a2)) {
            Logger.d(this.f29366a, "compareAdActivityToForeground found ad activity different than foreground, foreground address is: " + a2 + ", and activity address is: " + a3);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void d(String str, String str2, String str3) {
    }

    public static boolean f(String str, String str2) {
        ImpressionLog impressionLog;
        if (str == null || (impressionLog = E.get(str)) == null) {
            return false;
        }
        return impressionLog.a(str2);
    }

    public static void a(String str, Long l2, Long l3, String str2, ImpressionLog.a... aVarArr) {
        if (str != null) {
            synchronized (E) {
                ImpressionLog impressionLog = E.get(str);
                if (impressionLog == null) {
                    impressionLog = new ImpressionLog();
                    E.put(str, impressionLog);
                    Logger.d("AdFinderBase", "add impression log event - key: " + str + ", impression log map size: " + E.size());
                }
                impressionLog.a(l2, l3, str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(String str, String str2, ImpressionLog.a... aVarArr) {
        if (str != null) {
            synchronized (E) {
                ImpressionLog impressionLog = E.get(str);
                if (impressionLog == null) {
                    impressionLog = new ImpressionLog();
                    E.put(str, impressionLog);
                    Logger.d("AdFinderBase", "add impression log event - key: " + str + ", impression log map size: " + E.size());
                }
                impressionLog.a(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(c cVar, String str, ImpressionLog.a... aVarArr) {
        if (cVar != null) {
            if (cVar.K != null) {
                a(cVar.K, str, aVarArr);
                return;
            } else {
                cVar.a(str, aVarArr);
                return;
            }
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void b(String str, String str2, ImpressionLog.a... aVarArr) {
        if (str != null) {
            synchronized (E) {
                ImpressionLog impressionLog = E.get(str);
                if (impressionLog == null) {
                    impressionLog = new ImpressionLog();
                    E.put(str, impressionLog);
                    Logger.d("AdFinderBase", "add cumulative impression log event - key: " + str + ", impression log map size: " + E.size());
                }
                impressionLog.b(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add cumulative impression log event - event id is null, not adding impression log event");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(c cVar) {
        if (cVar != null) {
            synchronized (E) {
                if (cVar.L != null && E.remove(cVar.L) != null) {
                    Logger.d("AdFinderBase", "clear impression log, eventId: " + cVar.L + ", impression log map size: " + E.size());
                }
                if (cVar.x() != null) {
                    for (String str : cVar.x()) {
                        if (E.remove(str) != null) {
                            Logger.d("AdFinderBase", "clear impression log, viewAddress: " + str + ", impression log map size: " + E.size());
                        }
                    }
                } else if (cVar.K != null && E.remove(cVar.K) != null) {
                    Logger.d("AdFinderBase", "clear impression log, viewAddress: " + cVar.K + ", impression log map size: " + E.size());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ImpressionLog b(c cVar, l lVar) {
        ImpressionLog remove;
        ImpressionLog remove2;
        if (cVar == null || lVar == null) {
            return null;
        }
        synchronized (E) {
            if (cVar.L != null && (remove2 = E.remove(cVar.L)) != null) {
                cVar.R.a(remove2);
                Logger.d("AdFinderBase", "collect impression logs - key: " + cVar.L + ", events: " + remove2.a() + ", impression log map size: " + E.size());
            }
            if (!cVar.U) {
                if (cVar.x() != null) {
                    for (String str : cVar.x()) {
                        ImpressionLog remove3 = E.remove(str);
                        if (remove3 != null) {
                            lVar.f29744h.a(remove3);
                            Logger.d("AdFinderBase", "collect impression logs - key: " + str + ", events: " + remove3.a() + ", impression log map size: " + E.size());
                        }
                    }
                } else if (cVar.K != null && (remove = E.remove(cVar.K)) != null) {
                    lVar.f29744h.a(remove);
                    Logger.d("AdFinderBase", "collect impression logs - key: " + cVar.K + ", events: " + remove.a() + ", impression log map size: " + E.size());
                }
            }
        }
        ImpressionLog impressionLog = new ImpressionLog(cVar.R);
        impressionLog.a(lVar.f29744h);
        StringBuilder append = new StringBuilder("collect impression logs, ad info: ").append(cVar.R.a()).append(", impression: ").append(lVar.f29744h.a());
        if (lVar.e() != null) {
            ImpressionLog E2 = lVar.e().E();
            impressionLog.a(E2);
            append.append(", ci: ").append(E2.a());
        }
        Logger.d("AdFinderBase", append.append(", total: ").append(impressionLog.a()).toString());
        return impressionLog;
    }

    public static List<String> a(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent.toString());
        }
        return arrayList;
    }

    public static List<ViewParent> b(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent);
        }
        return arrayList;
    }

    public static void a(ViewGroup viewGroup, List<String> list, List<String> list2, int i2) {
        if (viewGroup != null) {
            int i3 = i2 + 1;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i5);
                    list.add(BrandSafetyUtils.a(childAt));
                    list2.add("h" + i3 + "c" + (i5 + 1) + CertificateUtil.DELIMITER + childAt);
                    a((ViewGroup) childAt, list, list2, i3);
                    i4 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    public static BrandSafetyUtils.AdType a(String str, WebView webView) {
        BrandSafetyUtils.AdType g2;
        if (webView != null) {
            AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
            View view = webView;
            do {
                if (view instanceof View) {
                    View view2 = view;
                    if (com.safedk.android.internal.b.getInstance().isInterstitialActivity(view2.getContext())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view2 + ", INTERSTITIAL activity: " + view2.getContext() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                        return BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    if (com.safedk.android.utils.k.a(view2.getWidth(), view2.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view2 + ", BANNER ratio, isOnUiThread = " + com.safedk.android.utils.k.c());
                        return BrandSafetyUtils.AdType.BANNER;
                    }
                    if (com.safedk.android.utils.k.b(view2.getWidth(), view2.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view2 + ", MREC ratio, isOnUiThread = " + com.safedk.android.utils.k.c());
                        return BrandSafetyUtils.AdType.MREC;
                    }
                    if (view instanceof MaxAdView) {
                        BrandSafetyUtils.AdType adType = BannerFinder.d().get(BrandSafetyUtils.a(view));
                        if (adType != null) {
                            Logger.d("AdFinderBase", "extract ad type from view: " + view2 + ", MaxAdView type: " + adType.name() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            return adType;
                        }
                    } else if (h2 != null && (g2 = h2.g(view2)) != null) {
                        Logger.d("AdFinderBase", "extract ad type from view: " + view2 + ", discovery detected type: " + g2);
                        return g2;
                    }
                }
                Logger.d("AdFinderBase", "extract ad type from view: " + view + ", not detected");
                view = view.getParent();
            } while (view != 0);
        }
        Logger.d("AdFinderBase", "extract ad type from view: failed to extract");
        return null;
    }
}
