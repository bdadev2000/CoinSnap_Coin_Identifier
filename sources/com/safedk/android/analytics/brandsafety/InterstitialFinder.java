package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class InterstitialFinder extends com.safedk.android.analytics.brandsafety.b {
    private static final String J = "InterstitialFinder";
    private static final long K = 500;
    private static final long L = 1000;
    private static final int M = 2;
    private static final int N = 3;
    private static final float O = 80.0f;
    public final InterstitialInfoCollection F;
    FullScreenActivitiesCollection G;
    boolean H;
    protected String I;
    private long P;
    private final Map<String, List<o>> Q;
    private String R;
    private final Set<String> S;

    public boolean i(String str) {
        List<n> a2 = this.F.a(str);
        com.safedk.android.utils.k.b(J, "activeImpressionExists current impressions are " + this.F.toString());
        return a2 != null && a2.size() > 0;
    }

    public InterstitialFinder() {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, Arrays.asList(BrandSafetyUtils.f29187j, BrandSafetyUtils.f29188k, BrandSafetyUtils.f29189l), J, 120);
        this.F = new InterstitialInfoCollection();
        this.P = 0L;
        this.Q = new HashMap();
        this.G = new FullScreenActivitiesCollection();
        this.H = false;
        this.I = "";
        this.S = new HashSet(Arrays.asList(CreativeInfo.f29622j, CreativeInfo.f29621i));
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new n(str, str2, str3, screenShotOrientation, str4, str5);
    }

    public void a(final String str, final Object obj) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.1
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.b(str, obj);
                }
            });
        } else {
            b(str, obj);
        }
    }

    public void j(String str) {
        for (n nVar : this.F.a(str)) {
            CreativeInfo i2 = nVar.i();
            if (i2 != null && i2.w()) {
                Logger.d(J, "set on endcard displayed - setting ci endcard detected. ci= " + i2);
                nVar.h().f29749m = true;
                nVar.ap = true;
            } else if (i2 != null && i2.v()) {
                Logger.d(J, "set on endcard displayed - ci is video ad, setting video complete. ci= " + i2);
                c(nVar, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Object obj) {
        List<n> a2;
        Logger.d(J, "on video completed - sdk = " + str + ", source = " + obj);
        if (obj != null) {
            n a3 = this.F.a(BrandSafetyUtils.a(obj), false);
            if (a3 != null) {
                Logger.d(J, "on video completed - sdk = " + str + ", found interstitialInfo : " + a3);
                c(a3, str);
                return;
            }
        }
        if (str != null && (a2 = this.F.a(str)) != null && a2.size() > 0) {
            Iterator<n> it = a2.iterator();
            if (it.hasNext()) {
                n next = it.next();
                Logger.d(J, "on video completed - sdk = " + str + ", found interstitialInfo by sdkPackage : " + next);
                c(next, str);
                return;
            }
        }
        synchronized (this) {
            Iterator<n> it2 = this.F.values().iterator();
            while (it2.hasNext()) {
                c(it2.next(), str);
            }
        }
    }

    private void c(n nVar, String str) {
        if (nVar != null) {
            Logger.d(J, "on video completed - started, sdkPackageName = " + str + ", eventId = " + nVar.L);
            if (nVar.f29388v.equals(str) && !nVar.h().f29747k) {
                a((c) nVar, true);
                nVar.M();
                Logger.d(J, "on video completed - set to true, sdkPackageName = " + str + ", eventId = " + nVar.L);
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2) {
        n a2;
        if (str2 != null && (a2 = this.F.a(str2, false)) != null) {
            Logger.d(J, "on video completed triggered - for view address  : " + str2 + ", sdkPackageName : " + str + ", video completed: " + z2);
            a(a2, z2);
            CreativeInfo i2 = a2.i();
            if (i2 == null) {
                return true;
            }
            Logger.d(J, "on interstitial video event triggered - setting ci ad as video ad.");
            i2.d(true);
            return true;
        }
        List<n> a3 = this.F.a(str);
        for (n nVar : a3) {
            Logger.d(J, "on video completed triggered - sdkPackageName : " + str + ", view address: " + str2 + ", video completed: " + z2);
            a(nVar, z2);
        }
        return !a3.isEmpty();
    }

    private void a(n nVar, boolean z2) {
        Logger.d(J, "set on video completed started, eventId  : " + nVar.L + ", videoCompleted = " + z2);
        if (!nVar.h().f29747k && z2) {
            a((c) nVar, z2);
            CreativeInfo i2 = nVar.i();
            if (i2 != null && !i2.v()) {
                i2.d(true);
            }
            Logger.d(J, "set on video completed started, onVideoCompletedEventHasBeenTriggered set to true ");
            nVar.M();
            return;
        }
        if (!z2) {
            if (!nVar.h().f29748l) {
                nVar.h().f29748l = true;
                Logger.d(J, "set on video completed - impression is set to be a video impression");
            }
            nVar.h().f29747k = false;
            nVar.aa = false;
            nVar.a(ImpressionLog.f29263o, new ImpressionLog.a(ImpressionLog.K, "webview"));
        }
    }

    public void b(String str, String str2, boolean z2) {
        if (str2 != null && this.F.a(str2, false) != null) {
            b(this.F.a(str2, false), z2);
        }
        List<n> a2 = this.F.a(str);
        if (a2 != null) {
            Iterator<n> it = a2.iterator();
            while (it.hasNext()) {
                b(it.next(), z2);
            }
        }
    }

    private void b(n nVar, boolean z2) {
        if (nVar == null) {
            Logger.d(J, "stop taking screenshots for impression. info is null.");
            return;
        }
        Logger.d(J, "stop taking screenshots for impression. starting. address = " + nVar.K);
        if (z2 || this.H) {
            nVar.ae = true;
            a(nVar.h());
            Logger.d(J, "stop taking screenshots for impression. attempting to clear image hash and files");
            j l2 = nVar.l();
            if (l2 != null && l2.f29692b != null) {
                a(nVar, l2);
            } else {
                Logger.d(J, "stop taking screenshots for impression. no active ci or no image taken.");
            }
            e(nVar, "stopTakingScreenshotsForImpression");
            return;
        }
        Logger.d(J, "stop taking screenshots for impression. Request to stop taking screenshots received when no max ad is active. ignoring");
    }

    private void a(n nVar, j jVar) {
        Logger.d(J, "remove file and report event, file: " + jVar.f29692b);
        BrandSafetyUtils.d(jVar.f29692b);
        jVar.f29691a = null;
        jVar.f29692b = null;
        BrandSafetyUtils.d(nVar.b());
        jVar.f29693c = 0L;
        nVar.f29385s = null;
        jVar.d = 0;
        e(nVar, "removeFileAndReportEvent");
    }

    private void a(n nVar, String str, ViewGroup viewGroup, List<WeakReference<WebView>> list, List<String> list2, List<String> list3, int i2) {
        int i3 = i2 + 1;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i5);
                list2.add(BrandSafetyUtils.a(childAt));
                list3.add("h" + i3 + "c" + (i5 + 1) + CertificateUtil.DELIMITER + childAt);
                if (childAt instanceof WebView) {
                    list.add(new WeakReference<>((WebView) childAt));
                    Logger.d(J, "find WebViews in view group - found view: " + childAt + " , parent: " + childAt.getParent().toString());
                } else if (childAt instanceof ViewGroup) {
                    a(nVar, str, (ViewGroup) childAt, list, list2, list3, i3);
                }
                AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
                if (h2 != null) {
                    if (a(str, childAt) && nVar.f29379m != null && nVar.i() == null) {
                        Logger.d(J, "find WebViews in view group - found ad view: " + childAt + " , parent: " + childAt.getParent().toString());
                        String c2 = h2.c(childAt);
                        if (c2 != null) {
                            Logger.d(J, "find WebViews in view group - found adId: " + c2);
                            CreativeInfo a2 = h2.a((Object) c2);
                            if (a2 != null) {
                                Logger.d(J, "find WebViews in view group - found CI for adId " + c2 + " : " + a2);
                                a2.a((Object) childAt);
                                if (nVar.A != null) {
                                    String name = BrandSafetyUtils.a(nVar.A).name();
                                    Logger.d(J, "find WebViews in view group - setting ad format type to " + name);
                                    a2.p(name);
                                    nVar.e("ad_type_upd(fndWVUndrVGroup):" + name);
                                }
                                a(new o(a2, CreativeInfo.f29626n, BrandSafetyUtils.a(childAt)));
                            }
                        }
                    }
                    if (!nVar.V && h2.a(childAt)) {
                        Logger.d(J, "find WebViews in view group - native player identified : " + childAt);
                        nVar.h().f29748l = true;
                        nVar.a(ImpressionLog.f29263o, new ImpressionLog.a(ImpressionLog.K, "native"));
                    }
                    nVar.V = nVar.V || h2.a(childAt);
                }
                i4 = i5 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        String string;
        n d;
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Bundle messageData = message.getMessageData();
            if (messageData.containsKey("revenue_event") && messageData.containsKey("ad_format") && this.f29367b.contains(messageData.getString("ad_format"))) {
                Logger.d(J, "Revenue event detected : " + messageData);
                string = "revenue_event";
            } else {
                string = messageData.getString("type");
            }
            String string2 = messageData.getString("ad_format");
            String string3 = messageData.getString(BrandSafetyEvent.f29784k);
            String string4 = messageData.getString(BrandSafetyEvent.ad);
            String string5 = messageData.getString("dsp_name");
            String b2 = CreativeInfoManager.b(string4);
            long b3 = com.safedk.android.utils.k.b(System.currentTimeMillis());
            String str = null;
            if (messageData.containsKey("creative_id")) {
                str = messageData.getString("creative_id");
            }
            MaxEvent maxEvent = new MaxEvent(string, b3, string2, string4, str, string5);
            p.a().a(maxEvent);
            boolean contains = this.f29367b.contains(string2);
            String a2 = CreativeInfoManager.a(b2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
            if (contains && string4 != null && string4.equals(a2)) {
                Logger.d(J, "full screen type but ad network not supported (" + a2 + ")");
                return;
            }
            String string6 = messageData.getString("id", null);
            if (string6 == null) {
                Logger.d(J, "No eventId in data bundle.");
            }
            if (contains) {
                Logger.d(J, "Max message received, package: " + b2 + ", ts (seconds): " + b3 + ", message received: " + message.getMessageData() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if ("WILL_DISPLAY".equals(string)) {
                    Logger.d(J, "Number of InterstitialInfo objects : " + this.F.size());
                    com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload count: " + this.B.size());
                    e();
                    this.d++;
                    if (b2 != null) {
                        p.a().b(maxEvent);
                        this.H = true;
                        a(string6, ImpressionLog.f29254f, new ImpressionLog.a[0]);
                        BrandSafetyUtils.m(b2);
                        a(b2, new AtomicReference<>(messageData));
                        CreativeInfoManager.a(b2, string3, str, (String) null, string2);
                        a aVar = new a(string3, string6);
                        Logger.d(J, "WILL_DISPLAY event for package: " + b2 + " placement: " + string3 + " ad type: " + string2 + ", event id: " + string6);
                        a(b2, aVar, string6);
                        return;
                    }
                    return;
                }
                if ("revenue_event".equals(string)) {
                    Logger.d(J, "REVENUE_EVENT event for package: " + b2 + " placement: " + string3 + " ad type: " + string2 + ", event id: " + string6);
                    a(string6, ImpressionLog.f29259k, new ImpressionLog.a(ImpressionLog.F, messageData.getString("revenue_event")));
                    a(string6, messageData);
                    return;
                }
                if ("DID_CLICKED".equals(string)) {
                    n d2 = this.F.d(string6);
                    if (d2 != null) {
                        StringBuilder append = new StringBuilder().append("DID_CLICKED event for package: ");
                        if (b2 != null) {
                            string4 = b2;
                        }
                        Logger.d(J, append.append(string4).toString());
                        a(string6, ImpressionLog.f29256h, new ImpressionLog.a[0]);
                        b(d2);
                        if (!TextUtils.isEmpty(d2.e())) {
                            e(d2, "onMessageReceived");
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("WILL_LOAD".equals(string)) {
                    if (b2 != null) {
                        Logger.d(J, "WILL_LOAD event for package: " + b2 + " placement: " + string3);
                        a(string6, ImpressionLog.d, new ImpressionLog.a(ImpressionLog.I, string4));
                        com.safedk.android.analytics.brandsafety.creatives.e.b(b2, string3);
                        CreativeInfoManager.a(b2, string3, str, (String) null, string2);
                        return;
                    }
                    return;
                }
                if ("DID_HIDE".equals(string)) {
                    if (b2 != null) {
                        BrandSafetyUtils.n(b2);
                        Logger.d(J, "DID_HIDE event for package: " + b2 + " placement: " + string3 + ", event id: " + string6);
                        n d3 = this.F.d(string6);
                        if (d3 != null) {
                            a(string6, ImpressionLog.f29257i, new ImpressionLog.a[0]);
                            a(d3, (String) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("DID_LOAD".equals(string)) {
                    if (b2 != null) {
                        Logger.d(J, "DID_LOAD event for package: " + b2 + " placement: " + string3);
                        a(string6, ImpressionLog.e, new ImpressionLog.a(ImpressionLog.I, string4));
                        return;
                    }
                    return;
                }
                if ("DID_DISPLAY".equals(string)) {
                    if (b2 != null) {
                        Logger.d(J, "DID_DISPLAY event for package: " + b2 + " placement: " + string3);
                        a(string6, ImpressionLog.f29255g, new ImpressionLog.a[0]);
                        if (str != null && (d = this.F.d(string6)) != null) {
                            if (d.A != null && d.A.containsKey("id") && d.A.getString("id") != null && d.A.getString("id").equals(string6)) {
                                Logger.d(J, "setting Max creative id to: " + str + " for event id: " + string6);
                                d.M = str;
                                return;
                            } else {
                                Logger.d(J, "cannot update Max creative id. event id check failed.");
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if ("DID_FAIL_DISPLAY".equals(string)) {
                    Logger.d(J, "DID_FAIL_DISPLAY event for package: " + b2 + " placement: " + string3);
                    a(string6, ImpressionLog.f29258j, new ImpressionLog.a[0]);
                    n d4 = this.F.d(string6);
                    if (d4 != null) {
                        d4.N = true;
                    }
                }
            }
        }
    }

    private synchronized void e() {
        ArrayList<String> arrayList = new ArrayList();
        for (n nVar : this.F.values()) {
            if (nVar.N && nVar.B == null) {
                arrayList.add(nVar.L);
                e(nVar, "reportPreviousFailedImpressions");
                b((c) nVar);
            }
        }
        for (String str : arrayList) {
            Logger.d(J, "report previous failed impression, event ID: " + str);
            a(str);
            p(str);
        }
    }

    private void a(String str, a aVar, String str2) {
        Logger.d(J, "match CI started, sdk = " + str + ", interstitial key = " + aVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (aVar.f29305b != null) {
            Logger.d(J, "match CI - interstitial key: " + aVar);
            AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
            if (h2 != null && h2.d() != null && h2.d().a(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, false)) {
                Logger.d(J, "match CI - discovery configuration: " + h2.d());
                String str3 = aVar.f29304a + "_" + aVar.f29305b + "_" + str;
                CreativeInfo a2 = h2.a((Object) str3);
                if (a2 != null) {
                    Logger.d(J, "match CI - discovery class returned a ci: " + a2);
                    if (a2.m() == null) {
                        a2.f(aVar.f29305b);
                    }
                    a2.p(BrandSafetyEvent.AdFormatType.INTER.name());
                    a2.u("ad_type_upd(matchCI):" + BrandSafetyEvent.AdFormatType.INTER.name());
                    a(new o(a2, CreativeInfo.f29626n, str3));
                    return;
                }
                Logger.d(J, "match CI - ci not found");
                return;
            }
            Logger.d(J, "match CI - sdk not configured to allow max events based matching");
        }
    }

    public void a(String str, AtomicReference<Bundle> atomicReference) {
        if (atomicReference != null && atomicReference.get() != null) {
            Logger.d(J, "start ad monitoring - slot = " + this.d + ", max package name = " + str + ", AppLovin data bundle is " + atomicReference.get() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (CreativeInfoManager.h(str) != null) {
                n nVar = new n(str, this.d, atomicReference.get());
                nVar.L = atomicReference.get().getString("id");
                synchronized (this) {
                    this.F.put(nVar.L, nVar);
                }
                Logger.d(J, "start ad monitoring - new interstitial info created : " + nVar);
                f((Activity) null);
                return;
            }
            Logger.d(J, "start ad monitoring - slot = " + this.d + ", max package name = " + str + ", ad network is not supported");
        }
    }

    public void c(final Activity activity) {
        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.3
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(InterstitialFinder.J, "start ad monitoring - activity : " + activity + ", current interstitial infos :" + InterstitialFinder.this.F.toString());
                if (activity != null) {
                    if (!InterstitialFinder.this.F.c(activity.toString())) {
                        synchronized (InterstitialFinder.this.G) {
                            InterstitialFinder.this.G.put(activity.toString(), new WeakReference<>(activity));
                        }
                        if (!InterstitialFinder.this.H) {
                            InterstitialFinder.this.H = true;
                        }
                        Logger.d(InterstitialFinder.J, "start ad monitoring - activity added : " + activity.toString());
                    } else {
                        Logger.d(InterstitialFinder.J, "start ad monitoring - activity null or already registered.");
                    }
                    if (InterstitialFinder.this.m(activity.toString())) {
                        Logger.d(InterstitialFinder.J, "start ad monitoring - sdk: " + InterstitialFinder.this.F.b() + ", activity " + activity + " started but this is not the start of impression. not starting ad monitoring");
                    } else {
                        Logger.d(InterstitialFinder.J, "start ad monitoring calling 'start', activity is " + activity);
                        InterstitialFinder.this.f(activity);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        n b2 = this.F.b(str);
        if (str == null || b2 == null || b2.c() == null) {
            return false;
        }
        Logger.d(J, "instances of same activity - current activity class name = " + b2.p() + ",  current activity address = " + b2.o());
        AdNetworkDiscovery h2 = CreativeInfoManager.h(b2.c());
        if (h2 == null || h2.d() == null || !h2.d().a(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false)) {
            return false;
        }
        Logger.d(J, "instances of same activity - discovery configuration = " + h2.d());
        String str2 = b2.p() + "@" + b2.o();
        Logger.d(J, "instances of same activity - current activity = " + str2);
        if (str.equals(str2)) {
            return false;
        }
        Logger.d(J, "instances of same activity - activityClass " + str2 + " is a different instance of the same activity");
        return true;
    }

    private void b(n nVar) {
        Logger.d(J, "handle DID_CLICKED started , isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar == null) {
            Logger.d(J, "current activity interstitial is null");
            return;
        }
        nVar.a(true);
        if (nVar.e() != null) {
            Logger.d(J, "current activity interstitial already have click url");
            return;
        }
        if (nVar.ai == null) {
            Logger.d(J, "current activity interstitial doesn't have click url candidate");
            return;
        }
        if (nVar.ai.f29658a == 0) {
            Logger.d(J, "current click url candidate has zero timestamp");
            return;
        }
        Logger.d(J, "handle DID_CLICKED checking click url candidate");
        if (System.currentTimeMillis() - nVar.ai.f29658a < 20000) {
            Logger.d(J, "handle DID_CLICKED setting click url");
            nVar.c(nVar.ai.f29659b);
        } else {
            Logger.d(J, "click url candidate's timestamp is not within the time range");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f29081a;
    }

    public n d(Activity activity) {
        if (activity != null) {
            return this.F.b(activity.toString());
        }
        Logger.d(J, "get activity interstitial by activity, activity is null");
        return null;
    }

    public n k(String str) {
        if (str == null) {
            Logger.d(J, "get activity interstitial by package, package is null");
            return null;
        }
        List<n> a2 = this.F.a(str);
        if (a2.size() == 1) {
            Logger.d(J, "get activity interstitial by package, ci found : " + a2.get(0));
            return a2.get(0);
        }
        Logger.d(J, "there are " + a2.size() + " interstitial infos, exisitng");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Activity activity) {
        String str;
        String str2;
        String str3;
        n nVar;
        Set<String> set;
        n nVar2;
        n nVar3;
        WeakReference<Activity> b2;
        if (activity != null) {
            str3 = BrandSafetyUtils.a(activity.toString(), true);
            str2 = BrandSafetyUtils.a(activity.toString(), false);
            str = BrandSafetyUtils.b(activity.getClass());
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        Logger.d(J, "interstitial finder start - activity name = " + activity + ", sdk = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (activity != null) {
            nVar = this.F.b(BrandSafetyUtils.a((Object) activity));
            Logger.d(J, "interstitial finder start - attempt to find by activity address, currentActivityInterstitial = " + nVar);
        } else {
            nVar = this.F.a(true) == 1 ? this.F.get(this.F.keySet().toArray()[0]) : null;
        }
        if (nVar != null && str3 != null && str3.equals(nVar.B)) {
            boolean a2 = CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            j l2 = nVar.l();
            if (!a2 && l2 != null && !TextUtils.isEmpty(l2.f29691a) && a(l2.d, l2.f29693c)) {
                Logger.d(J, "interstitial finder start - Not starting timer on activity " + nVar.ac + " -- impression already logged");
                return;
            } else {
                Logger.d(J, "interstitial finder start - Starting counter from previous value " + nVar.s());
                nVar.I();
                nVar2 = nVar;
            }
        } else {
            Logger.d(J, "interstitial finder start - current activity interstitial = " + nVar);
            if (nVar == null) {
                set = null;
            } else if (str2 != null && nVar.C.equals(str2)) {
                Logger.d(J, "interstitial finder start - current activity interstitial class name = " + nVar.C + ", activity class name = " + str2);
                set = null;
            } else {
                Set<String> set2 = nVar.W;
                if (set2.contains(str3)) {
                    Logger.d(J, "interstitial finder start - Ignoring restart of suspected mediation " + nVar.ac);
                    return;
                } else {
                    if (nVar.B != null) {
                        set2.add(nVar.B);
                    }
                    set = set2;
                }
            }
            List<o> arrayList = new ArrayList<>();
            Logger.d(J, "interstitial finder start - current activity interstitial is " + nVar);
            if (nVar != null && !nVar.E && !nVar.j().isEmpty()) {
                Logger.d(J, "interstitial finder start - current activity interstitial != null : " + nVar);
                List<CreativeInfo> j2 = nVar.j();
                if (!j2.isEmpty()) {
                    for (CreativeInfo creativeInfo : j2) {
                        if (creativeInfo != null) {
                            Logger.d(J, "interstitial finder start - setting current activity interstitials CI: " + creativeInfo);
                            arrayList.add(new o(creativeInfo, creativeInfo.V(), creativeInfo.U()));
                        } else {
                            Logger.d(J, "interstitial finder start - current CI matching method not equal, current CI: " + creativeInfo);
                        }
                    }
                } else {
                    Logger.d(J, "interstitial finder start - current CI is null");
                }
                Logger.d(J, "interstitial finder start - current activity interstitial impression reported? " + nVar.E);
                b(nVar, true);
            }
            Logger.d(J, "interstitial finder start - activity : " + activity + ", activities : " + this.G.a());
            if (this.F.a(true) > 0 && this.G.size() > 0) {
                for (n nVar4 : this.F.c()) {
                    if (activity == null && (b2 = this.G.b(nVar4.f29388v)) != null && b2.get() != null) {
                        Activity activity2 = b2.get();
                        Logger.d(J, "interstitial finder start - activity set to " + activity2);
                        activity = activity2;
                    }
                    if (activity != null) {
                        String b3 = BrandSafetyUtils.b(activity.getClass());
                        Logger.d(J, "interstitial finder start - activity : " + activity + ", activitySdk : " + b3 + ", InterstitialInfo sdk : " + nVar4.f29388v);
                        nVar4.ad = SystemClock.elapsedRealtime();
                        if (nVar4.f29388v != null && b3 != null && b3.equals(nVar4.f29388v)) {
                            a(activity, nVar4);
                            nVar3 = nVar4;
                        } else if (com.safedk.android.utils.g.f30053h.equals(b3) && A.contains(nVar4.f29388v)) {
                            Logger.d(J, "interstitial finder start - maybe scar-admob");
                            nVar3 = nVar;
                        } else {
                            Logger.d(J, "interstitial finder start - activity SDK is not compatible with interstitial SDK");
                        }
                    } else {
                        nVar3 = nVar;
                    }
                    a(nVar4, activity);
                    nVar = nVar3;
                }
            }
            synchronized (this) {
                Logger.d(J, "interstitial finder start - scanning " + this.F.a(false) + " inter infos");
                for (n nVar5 : this.F.values()) {
                    if (nVar5.U) {
                        Logger.d(J, "interstitial finder start - skipping on iterating ad that finished, interstitial info: " + nVar5);
                    } else {
                        Logger.d(J, "interstitial finder start - setting the current activity interstitial to: " + nVar5);
                        if (nVar5.f29388v != null) {
                            Logger.d(J, "interstitial finder start - current Max package name: " + nVar5.f29388v);
                            boolean a3 = CreativeInfoManager.a(nVar5.f29388v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
                            if (activity != null && !BrandSafetyUtils.d(activity.getClass()) && !a3) {
                                Logger.d(J, "interstitial finder start - current foreground activity is not a supported ad activity");
                                return;
                            }
                            if (!a3 && activity != null) {
                                Logger.d(J, "interstitial finder start - checking pending ci for no activity sdk " + nVar5.f29388v);
                                arrayList = a(nVar5.f29388v, nVar5);
                                for (o oVar : arrayList) {
                                    Logger.d(J, "interstitial finder start - found pending ci(s) for no activity sdk, mi : " + oVar);
                                    b(oVar, nVar5);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(this.I)) {
                            nVar5.e(this.I);
                            Logger.d(J, "interstitial finder start - ci_debug_info set to " + this.I);
                        } else {
                            nVar5.L();
                            Logger.d(J, "interstitial finder start - no CI so adding the noCIDebug to CIDebugInfo");
                        }
                        if (nVar5.am != null && nVar5.am.get() != null) {
                            e(nVar5);
                            if (arrayList.isEmpty()) {
                                arrayList = a(str, nVar5);
                            }
                            nVar5.Z = 0L;
                        }
                        if (CreativeInfoManager.a(nVar5.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                            nVar5.ad = SystemClock.elapsedRealtime();
                            Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. sdk = " + nVar5.c());
                            arrayList = a(nVar5.c(), nVar5);
                            Logger.d(J, "interstitial finder inter runs on app activity, checking for pending CIs. found " + arrayList.size() + " items");
                        }
                        for (o oVar2 : arrayList) {
                            if (oVar2 != null && oVar2.f29758a != null) {
                                b(oVar2, nVar5);
                            }
                        }
                        if (set != null) {
                            nVar5.W = set;
                        }
                        nVar = nVar5;
                    }
                }
                nVar2 = nVar;
            }
        }
        Logger.d(J, "interstitial finder start - before timer, time interstitial info event id is: " + (nVar2 != null ? nVar2.L : null));
        if (c(nVar2)) {
            Logger.d(J, "interstitial finder start - starting timer for interstitial info with eventId " + nVar2.w());
            nVar2.ak = this.D.scheduleAtFixedRate(new b(nVar2.L, nVar2.f29388v), K, L, TimeUnit.MILLISECONDS);
        }
    }

    private boolean c(n nVar) {
        ScheduledFuture<?> scheduledFuture = nVar != null ? nVar.ak : null;
        Logger.d(J, "should start timer started, task future = " + scheduledFuture + ", is cancelled = " + (scheduledFuture != null ? Boolean.valueOf(scheduledFuture.isCancelled()) : null));
        if (nVar != null && nVar.am != null) {
            Logger.d(J, "should start timer - inter activity is: " + nVar.am.get());
            Logger.d(J, "should start timer - inter activity CI is: " + nVar.i());
        }
        boolean z2 = nVar != null && (scheduledFuture == null || scheduledFuture.isCancelled()) && !((nVar.am == null || nVar.am.get() == null) && (nVar.i() == null || nVar.i().f() == null));
        Logger.d(J, "should start timer returned: " + z2);
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, n nVar) {
        if (activity != null) {
            String[] strArr = {BrandSafetyUtils.a(activity.toString(), false), BrandSafetyUtils.a(activity.toString(), true)};
            String obj = activity.toString();
            nVar.ac = obj;
            nVar.am = new WeakReference<>(activity);
            nVar.a(strArr);
            synchronized (this.G) {
                this.G.remove((Object) activity.toString());
            }
            Logger.d(J, "interstitial info activity details set : " + activity.getClass() + ", sdk = " + nVar.f29388v + ", activity name = " + obj + ", activities = " + this.G.a() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        Logger.d(J, "cannot set interstitial info activity details, activity is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<o> a(String str, n nVar) {
        ArrayList arrayList = new ArrayList();
        List<o> list = this.Q.get(str);
        com.safedk.android.utils.k.b(J, "pending ci check, number of pending CIs: " + (list != null ? list.size() : 0) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Logger.d(J, "pending ci check, pending object addresses are: " + a(list));
        if (list != null) {
            synchronized (this) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    Logger.d(J, "pending ci check, matching method: " + next.f29759b + ", ci: " + next.f29758a.X());
                    if (a(next.f29758a, nVar) && next.f29758a != null) {
                        nVar.e("pcim|ts=" + System.currentTimeMillis() + "|ls=" + list.size() + ";" + next.f29759b + "|o=" + next.f29758a.ae() + ";" + next.f29758a.af());
                        it.remove();
                        Logger.d(J, "pending ci check, creative info is the pending creative info: " + next);
                        arrayList.add(next);
                    }
                }
            }
            AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
            if (h2 != null && h2.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                list.clear();
            }
        }
        return arrayList;
    }

    private boolean a(CreativeInfo creativeInfo, n nVar) {
        if (creativeInfo == null || nVar == null) {
            return false;
        }
        Logger.d(J, "verify matching - current activity interstitial: " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar.L != null && creativeInfo.m() != null && !nVar.L.equals(creativeInfo.m())) {
            Logger.d(J, "verify matching - incompatible event ID, ci: " + creativeInfo.m() + ", info: " + nVar.L);
            if (!CreativeInfoManager.a(nVar.f29388v, AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false)) {
                return false;
            }
            creativeInfo.u("CiMatchingWithIncompatibleEventId=" + creativeInfo.m());
        }
        AdNetworkDiscovery h2 = CreativeInfoManager.h(creativeInfo.R() == null ? creativeInfo.Q() : creativeInfo.R());
        if (h2 != null) {
            if (h2.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                if (nVar.r() != null) {
                    String string = nVar.r().getString(BrandSafetyEvent.f29784k);
                    String string2 = nVar.r().getString("ad_format");
                    if (creativeInfo.F() == null || (string != null && string.equals(creativeInfo.F()))) {
                        Logger.d(J, "verify matching DIRECT_CREATIVE_INFO, CI placement: " + creativeInfo.F() + ", CI format: " + creativeInfo.I());
                        return true;
                    }
                    Logger.d(J, "verify matching DIRECT_CREATIVE_INFO, verification failed for CI placement: " + creativeInfo.F() + ", CI format: " + creativeInfo.I());
                    nVar.e("verifyMatchingFailed|placement=(" + string + "," + creativeInfo.F() + ")|format=(" + string2 + "," + creativeInfo.F() + ")");
                    return false;
                }
            } else {
                return a(creativeInfo.ae(), creativeInfo.af(), nVar);
            }
        }
        Logger.d(J, "verify matching, no InterstitialInfo or no discovery for " + creativeInfo.Q());
        return false;
    }

    private boolean a(String str, String str2, n nVar) {
        if (nVar == null) {
            return false;
        }
        Logger.d(J, "verify matching object started, event ID: " + nVar.L + ", object address: " + str2 + ", webview address: " + nVar.K + ", object type: " + str + ", currentActivityInterstitial = " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        boolean a2 = CreativeInfoManager.a(nVar.f29388v, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        if (str2 == null || MediaPlayer.class.getCanonicalName().equals(str) || a2) {
            Logger.d(J, "verify matching object skipped, event ID: " + nVar.L + ", object address: " + str2 + ", object type: " + str + ", sdkInterstitialsRunOnAppActivity: " + a2);
            return true;
        }
        if (nVar.x() != null && nVar.x().contains(str2)) {
            Logger.d(J, "verify matching object done, event ID: " + nVar.L + ", object address: " + str2 + ", views hierarchy: " + nVar.x());
            return true;
        }
        Logger.d(J, "verify matching object failed, event ID: " + nVar.L + ", object address: " + str2 + ", views hierarchy: " + nVar.x());
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(final String str) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.4
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.n(str);
                }
            });
        } else {
            n(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        Logger.d(J, "stop timers - canceling timer for interstitials, eventId = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        n d = this.F.d(str);
        if (d != null) {
            if (d.s() == 0) {
                d.ab = null;
            }
            if (this.F.size() < 1 || this.F.a()) {
                this.P = 0L;
            }
            if (d.ak != null) {
                Logger.d(J, "stop timers - calling timer cancel.");
                if (!d.ak.cancel(true)) {
                    Logger.d(J, "stop timers - failed to call timer cancel.");
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> a(String str, String str2) {
        for (n nVar : this.F.values()) {
            if (nVar != null) {
                boolean z2 = nVar.K != null && nVar.K.equals(str2);
                boolean z3 = nVar.f29379m != null && nVar.f29379m.contains(str2);
                if (z2 || z3) {
                    return nVar.k();
                }
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public List<CreativeInfo> c(String str, String str2) {
        List<CreativeInfo> j2;
        synchronized (this) {
            for (n nVar : this.F.values()) {
                if (nVar != null && (j2 = nVar.j()) != null && !j2.isEmpty() && j2.get(0) != null && j2.get(0).L() != null && j2.get(0).L().equals(str2)) {
                    return j2;
                }
            }
            List<o> list = this.Q.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (o oVar : list) {
                    if (oVar.f29758a != null && oVar.f29758a.L() != null && oVar.f29758a.L().equals(str2)) {
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
        for (n nVar : this.F.values()) {
            if (nVar != null && nVar.f29379m != null && nVar.f29379m.contains(str)) {
                return nVar;
            }
        }
        return null;
    }

    public void e(final Activity activity) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.5
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.g(activity);
                }
            });
        } else {
            g(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Activity activity) {
        try {
            Logger.d(J, "interstitial finder stop, activity = " + activity.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            n b2 = this.F.b(activity.toString());
            if (b2 != null) {
                if (b2.ac == null || activity.toString().equals(b2.ac)) {
                    Logger.d(J, "Stopping interstitial finder for activity " + b2.ac);
                    a(b2.L);
                    Logger.d(J, "interstitial finder, viewing time (ms) = " + b2.Z);
                }
            }
        } catch (Throwable th) {
            Logger.e(J, th.getMessage(), th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(final String str) {
        if (com.safedk.android.utils.k.c()) {
            this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.6
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.o(str);
                }
            });
        } else {
            o(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        if (str != null) {
            synchronized (this.G) {
                Logger.d(J, "Activity destroyed activity class: " + str + ", activities: " + this.G.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                this.G.remove((Object) str);
            }
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
            n b2 = this.F.b(str);
            if (b2 != null) {
                if (sdkPackageByClass != null && b2.f29388v != null && !sdkPackageByClass.equals(b2.f29388v)) {
                    Logger.d(J, "Activity destroyed, activity SDK does not fit the WILL_DISPLAY msg: " + sdkPackageByClass);
                    return;
                }
                if (b2.ac != null && !b2.ac.equals(str)) {
                    Logger.d(J, "Activity destroyed, activity address (" + str + " ) does not match the address of the ad's activity (" + b2.ac + ")");
                    return;
                }
                Logger.d(J, "Activity destroyed, calling onAdHidden");
                b2.a(ImpressionLog.C, new ImpressionLog.a[0]);
                a(b2, str);
            }
        }
    }

    public void a(String str, Bundle bundle) {
        n nVar;
        if (this.F.containsKey(str) && (nVar = this.F.get(str)) != null) {
            if (bundle.getString("revenue_event") != null) {
                nVar.P = bundle.getString("revenue_event");
            } else {
                nVar.P = "unknown";
            }
            e(nVar, "handleRevenueEvent");
            Logger.d(J, "Revenue event set to " + bundle.getString("revenue_event") + " for eventId: " + str);
            return;
        }
        Logger.d(J, "Revenue event - no interstitial info found for event " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
    }

    public void a(final n nVar, final String str) {
        Logger.d(J, "Ad hidden started, activityClass=" + (str == null ? "null" : str) + ", interstitial infos=" + this.F.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar != null) {
            if (m(str)) {
                Logger.d(J, "Ad hidden " + nVar.c() + " activity " + str + " unloaded but this is not the end of impression. not calling cleanAndReport");
            } else {
                nVar.U = true;
                this.D.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.7
                    @Override // java.lang.Runnable
                    public void run() {
                        InterstitialFinder.this.d(nVar, str);
                    }
                }, 3L, TimeUnit.SECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(n nVar, String str) {
        if (nVar == null) {
            Logger.d(J, "clean and report - current interstitial info is NULL, SKIPPING");
            return;
        }
        synchronized (this.F) {
            if (nVar.E()) {
                Logger.d(J, "clean and report - already run, SKIPPING");
            } else {
                nVar.f(true);
                try {
                    Logger.d(J, "clean and report started, activity class=" + str + ", eventId = " + nVar.L + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                    if (str == null) {
                        str = nVar.ac;
                        Logger.d(J, "clean and report - activity class set to (curr intractname) " + nVar.ac);
                    }
                    String sdkPackageByClass = SdksMapping.getSdkPackageByClass(str);
                    for (l lVar : nVar.g()) {
                        if (lVar.e() != null) {
                            Logger.d(J, "clean and report - activity SDK = " + sdkPackageByClass + ", CI SDK = " + lVar.e().Q() + ", interstitial activity name=" + nVar.ac);
                            Logger.d(J, "clean and report - currentMaxPackageName = " + nVar.f29388v + ", activitySdk = " + sdkPackageByClass);
                            if (nVar.f29388v != null && !nVar.f29388v.equals(sdkPackageByClass) && !nVar.f29388v.equals(lVar.e().Q()) && !nVar.aj) {
                                Logger.d(J, "clean and report - skip reporting as no related WILL_DISPLAY message received, current Max package name: " + nVar.f29388v + ", activity SDK: " + sdkPackageByClass + ", CI SDK: " + lVar.e().Q());
                                lVar.a((CreativeInfo) null);
                            }
                        }
                        if (lVar.f29740b != null && lVar.f29740b.f29692b != null) {
                            lVar.f29741c = lVar.f29740b.f29692b;
                        } else if (nVar.b() != null) {
                            lVar.f29741c = nVar.b();
                        }
                        Logger.d(J, "clean and report - last impression screenshot filename set to " + lVar.f29741c);
                    }
                    if ((nVar.B == null || !nVar.B.equals(BrandSafetyUtils.a(str, true))) && !CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false)) {
                        Logger.d(J, "clean and report - DID NOT enter unload logic, current interstitial info=" + nVar);
                    } else {
                        for (l lVar2 : nVar.g()) {
                            if (lVar2 != null && lVar2.f29740b != null && lVar2.f29740b.f29692b != null && nVar.b() != null) {
                                if (this.B.size() < SafeDK.getInstance().H()) {
                                    Logger.d(J, "clean and report - image files: " + lVar2.f29740b.f29692b + ", " + nVar.f29386t);
                                    Logger.d(J, "clean and report - waiting to report file: " + nVar.f29386t + ", impression ID: " + lVar2.f29739a);
                                    a(nVar, lVar2);
                                    com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload addAdInfoCollectionForUpload count = " + this.B.size() + " : " + this.B);
                                } else if (!d(nVar.f29385s, lVar2.f29739a)) {
                                    BrandSafetyUtils.d(nVar.f29386t);
                                    nVar.ab = null;
                                    nVar.f29386t = null;
                                }
                                Logger.d(J, "clean and report - hash value: " + lVar2.f29740b.f29691a + " orientation: " + lVar2.f29740b.f29694f);
                                if (lVar2.f29740b.f29691a == null && !nVar.ae) {
                                    Logger.d(J, "clean and report - assigning last captured hash to interstitial: " + nVar.ab);
                                    lVar2.f29740b.f29691a = nVar.ab;
                                    lVar2.f29740b.f29694f = nVar.f29387u;
                                }
                                this.R = lVar2.f29740b.f29691a;
                            }
                            if (!lVar2.b().isEmpty()) {
                                for (String str2 : lVar2.b()) {
                                    Logger.d(J, "clean and report - attach resources to CI for webview/adId: " + str2);
                                    com.safedk.android.analytics.brandsafety.creatives.e.b(str2, lVar2.e());
                                }
                                com.safedk.android.analytics.brandsafety.creatives.e.a(lVar2.b());
                            }
                            com.safedk.android.analytics.brandsafety.creatives.e.a(lVar2.e());
                        }
                        nVar.af = SystemClock.elapsedRealtime();
                        nVar.Z += nVar.af - nVar.ad;
                        Logger.d(J, "clean and report - Viewing time (ms) = " + nVar.Z);
                        if (CreativeInfoManager.h(nVar.f29388v) != null) {
                            Logger.d(J, "clean and report - number of CIs to report: " + nVar.j().size());
                            e(nVar, "onAdHidden");
                        }
                    }
                    if (str != null) {
                        Logger.d(J, "clean and report - removing from activities : " + str);
                        synchronized (this.G) {
                            this.G.remove((Object) str);
                        }
                    }
                    b((c) nVar);
                } catch (Throwable th) {
                    Logger.e(J, "Exception in clean and report : " + th.getMessage(), th);
                } finally {
                    a(nVar.L);
                    p(nVar.L);
                }
            }
        }
    }

    private void p(String str) {
        Logger.d(J, "clearing AppLovin bundle, eventId = " + str);
        this.H = this.F.size() != 0;
        Logger.d(J, "clear variables, maxAdIsActive set to " + this.H);
        if (str != null) {
            synchronized (this) {
                this.F.remove(str);
            }
            Logger.d(J, "clear variables, removing " + str + " from currentInterstitialInfos");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(n nVar, String str) {
        com.safedk.android.utils.k.b(J, "reporting event started, root=" + str + ", info=" + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (nVar == null || !nVar.Y) {
            Logger.d(J, "reporting event - info is not interstitial, don't report info");
            return;
        }
        boolean z2 = !nVar.E;
        boolean z3 = !nVar.F && nVar.d();
        String str2 = null;
        if (nVar.A != null && nVar.A.containsKey("id")) {
            str2 = nVar.A.getString("id");
            Logger.d(J, "reporting event - event ID: " + str2);
        } else {
            Logger.d(J, "reporting event - no event ID");
        }
        ArrayList arrayList = new ArrayList();
        if (nVar.j().isEmpty()) {
            arrayList.add(a(nVar, nVar.h(), z3, str2, (String) null));
            a((c) nVar);
        } else {
            Logger.d(J, "reporting event - number of CIs: " + nVar.j().size());
            synchronized (this) {
                for (l lVar : nVar.g()) {
                    if (lVar.e() != null && !nVar.c().equals(lVar.e().Q())) {
                        Logger.d(J, "reporting event without CI - sdk: " + nVar.c() + ", CI sdk: " + lVar.e().Q() + ", CI actual sdk: " + lVar.e().R());
                        lVar.a((CreativeInfo) null);
                    }
                    Logger.d(J, "reporting event (Check) root = " + str + ", debug info = " + nVar.B());
                    List asList = Arrays.asList(com.safedk.android.utils.g.f30054i, com.safedk.android.utils.g.f30049b, com.safedk.android.utils.g.f30056k);
                    if (!TextUtils.isEmpty(nVar.B()) && str.equals("onAdHidden") && lVar.e() != null && asList.contains(lVar.e().Q()) && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.getString("ad_format") != null && nVar.A.getString("ad_format").equals(BrandSafetyUtils.f29189l)) {
                        lVar.e().u(nVar.B());
                        String maxEvents = p.a().c().toString();
                        com.safedk.android.utils.k.b(J, "reporting event Invalid AppOpen impression detected ciDebugInfo = " + nVar.B() + " , lastMaxEvents = " + maxEvents);
                        lVar.e().u(maxEvents);
                    }
                    String str3 = null;
                    if (lVar.f29740b != null) {
                        Logger.d(J, "reporting event - image uniformity: " + lVar.f29740b.a(1000));
                        if (lVar.f29740b.f29691a != null && !nVar.ae) {
                            str3 = lVar.f29740b.f29691a + "_" + lVar.f29739a;
                        }
                        f(nVar, str3);
                    }
                    arrayList.add(a(nVar, lVar, z3, str2, str3));
                }
            }
        }
        Logger.d(J, "reporting event " + str2 + ", viewingTime = " + nVar.Z);
        if (StatsCollector.c() != null) {
            StatsCollector.c().a(arrayList);
        } else {
            Logger.w(J, "reporting event - stats collector instance is null, cannot report brand safety event");
        }
        if (z2) {
            nVar.b(true);
        }
        if (z3) {
            nVar.c(true);
        }
    }

    private BrandSafetyEvent a(n nVar, l lVar, boolean z2, String str, String str2) {
        return new BrandSafetyEvent(nVar.c(), nVar.f29390z, str2, z2, nVar.d() ? nVar.e() : null, lVar.e(), nVar.a(), nVar.C, lVar.f29739a != null ? lVar.f29739a : "", nVar.D, nVar.Z, nVar.Z > 0, nVar.A, lVar.f29740b != null ? lVar.f29740b.f29694f : null, lVar.f29740b != null ? lVar.f29740b.f29695g : false, lVar.f29740b != null ? lVar.f29740b.f29693c : 0L, lVar.f29740b != null ? lVar.f29740b.a(1000) : 0.0f, nVar.f29389y, SafeDK.getInstance().e(), str, nVar.M, nVar.N, nVar.P, nVar.Q, b(nVar, lVar).toString(), lVar.f29742f, lVar.f29743g, nVar.T);
    }

    private void f(n nVar, String str) {
        Logger.d(J, "add CI debug info started, hashValue " + str + ", info=" + nVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        for (l lVar : nVar.g()) {
            if (lVar.e() != null && lVar.f29740b != null && str != null && lVar.f29740b.f29691a != null && lVar.f29740b.f29694f != null && nVar.n() != null) {
                String a2 = BrandSafetyUtils.a(BrandSafetyUtils.AdType.INTERSTITIAL, lVar.f29740b.f29691a, nVar.c(), nVar.n(), lVar.f29740b.f29694f);
                if (new File(a2).exists()) {
                    if (lVar.e().U() == null || !lVar.e().U().contains("screenshot_datetime")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        lVar.e().u("screenshot_datetime" + ImpressionLog.R + currentTimeMillis);
                        Logger.d(J, "add CI debug info: " + currentTimeMillis);
                    } else {
                        Logger.d(J, "add CI debug info - stats repo is null or already contains this event");
                    }
                } else {
                    Logger.d(J, "add CI debug info - screenshot file path doesn't exist: " + a2);
                }
            } else {
                Logger.d(J, "add CI debug info - no creative info or hash is null");
            }
            if (lVar != null && lVar.e() != null && this.B.size() > 2) {
                synchronized (this.B) {
                    Logger.d(J, "add CI debug info - adding pending images info to ci_debug_info : image_id_pending : " + this.B.keySet());
                    lVar.e().u("image_id_pending : " + this.B.keySet());
                }
            }
        }
    }

    public void a(n nVar) {
        if (nVar != null) {
            Logger.d(J, "take screenshot started - currentActivityInterstitial = " + nVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (nVar.am == null || nVar.am.get() == null) {
                Logger.d(J, "take screenshot started - activity instance is null ");
                return;
            }
            Activity activity = nVar.am.get();
            if (nVar.J()) {
                Logger.d(J, "take screenshot - sdk Interstitials Run On App Activity = " + nVar.aj);
                if (nVar.am != null && nVar.am.get() != null && !BrandSafetyUtils.d(activity.getClass()) && !nVar.aj) {
                    Logger.d(J, "take screenshot - The activity is not supported : " + activity.getClass());
                    return;
                }
                String str = nVar.f29388v;
                Activity d = d(nVar);
                Logger.d(J, "take screenshot - activity = " + d);
                try {
                    Logger.d(J, "take screenshot - Run on UI thread in " + nVar.ac);
                    View K2 = nVar.K();
                    Logger.d(J, "take screenshot - screenshot view: " + K2);
                    int F = nVar.F();
                    if (F > 0 && (K2 instanceof ViewGroup)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new WeakReference(K2));
                        b((ViewGroup) K2, arrayList);
                        Logger.d(J, "take screenshot (for screenshots) - views hierarchy : " + arrayList);
                        if (F < arrayList.size()) {
                            View view = (View) ((WeakReference) arrayList.get(F)).get();
                            Logger.d(J, "take screenshot - get screenshot view, index: " + F + ", view: " + view);
                            K2 = view;
                        } else {
                            nVar.H();
                            Logger.d(J, "take screenshot - reset screenshot view: " + K2);
                        }
                    }
                    CreativeInfo i2 = nVar.i();
                    boolean equals = com.safedk.android.utils.g.f30053h.equals((i2 == null || i2.R() == null) ? nVar.c() : i2.R());
                    if (nVar != null && i2 != null) {
                        Logger.d(J, "take screenshot - is video ad ? " + nVar.h().f29748l + ", is multi ad ? " + i2.ah());
                    }
                    boolean a2 = CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    if (!SafeDK.getInstance().G() && !equals) {
                        if (i2 == null) {
                            Logger.d(J, "don't take screenshot - no creative info yet");
                            return;
                        }
                        if (i2.ah() && !a2) {
                            Logger.d(J, "don't take screenshot - multi ad, sdk: " + str);
                            return;
                        }
                        if (nVar.h().f29748l) {
                            if (a(nVar, K2) || nVar.h().f29747k) {
                                Logger.d(J, "take screenshot - video finished playing");
                                a(nVar, K2, d);
                                return;
                            } else {
                                Logger.d(J, "don't take screenshot - video is currently playing ");
                                return;
                            }
                        }
                        Logger.d(J, "take screenshot - this is not a video ad - take screenshot");
                        a(nVar, K2, d);
                        return;
                    }
                    if (SafeDK.getInstance().G()) {
                        Logger.d(J, "take screenshot - SafeDK Config item 'AlwaysTakeScreenshot' is true");
                        a(nVar, K2, d);
                    } else if (i2 == null) {
                        Logger.d(J, "don't take screenshot - Admob SDK but no ci yet");
                    } else if (i2.ah() && !a2) {
                        Logger.d(J, "don't take screenshot - multi ad, sdk: " + str);
                    } else {
                        Logger.d(J, "take screenshot - Admob SDK");
                        a(nVar, K2, d);
                    }
                } catch (Throwable th) {
                    Logger.e(J, "Failed while taking screenshot", th);
                    new CrashReporter().caughtException(th);
                }
            }
        }
    }

    private boolean a(n nVar, View view) {
        AdNetworkDiscovery h2 = CreativeInfoManager.h(nVar.c());
        if (h2 == null || !nVar.V || !h2.b(view)) {
            return false;
        }
        if (!nVar.h().f29747k) {
            Logger.d(J, "is native video player completed - native video end, info:" + nVar);
            nVar.M();
        }
        return true;
    }

    private Activity d(n nVar) {
        if (nVar.aj) {
            return com.safedk.android.internal.b.getInstance().getForegroundActivity();
        }
        if (nVar.am == null || nVar.am.get() == null) {
            return null;
        }
        return nVar.am.get();
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(o oVar) {
        Logger.d(J, "set CI details started, matchingInfo = " + oVar.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        CreativeInfo creativeInfo = oVar.f29758a;
        if (creativeInfo == null) {
            return false;
        }
        creativeInfo.g(BrandSafetyUtils.ScreenShotOrientation.PORTRAIT.equals(BrandSafetyUtils.c()));
        n nVar = null;
        if (creativeInfo.m() != null) {
            n d = this.F.d(creativeInfo.m());
            Logger.d(J, "set CI details, attempt to locate interstitial info by eventId " + creativeInfo.m() + ", success? " + (d != null));
            nVar = d;
        }
        if (nVar == null && creativeInfo.af() != null) {
            n a2 = this.F.a(creativeInfo.af(), true);
            Logger.d(J, "set CI details, attempt to locate interstitial info by matching object address " + creativeInfo.af() + ", success ? " + (a2 != null));
            nVar = a2;
        }
        if (nVar != null) {
            return a(oVar, nVar);
        }
        List<n> a3 = this.F.a(creativeInfo.Q());
        if (a3.size() > 0) {
            Logger.d(J, "set CI details, attempt to locate interstitial info, list size: " + a3.size());
            Iterator<n> it = this.F.a(creativeInfo.Q()).iterator();
            while (it.hasNext()) {
                if (a(oVar, it.next())) {
                    List<o> list = this.Q.get(creativeInfo.Q());
                    if (list != null) {
                        list.remove(oVar);
                    }
                    return true;
                }
            }
            return false;
        }
        Logger.d(J, "set CI details, failed to locate interstitial info");
        a(oVar, creativeInfo.Q());
        return false;
    }

    private boolean a(o oVar, n nVar) {
        BrandSafetyEvent.AdFormatType a2;
        if (nVar == null) {
            return false;
        }
        CreativeInfo creativeInfo = oVar.f29758a;
        Logger.d(J, "set CI details - ad info sdk: " + nVar.c() + ", CI sdk: " + creativeInfo.Q() + " ad info webview address: " + nVar.K + ", ci matching object address: " + creativeInfo.af());
        if (nVar.A != null) {
            Logger.d(J, "set CI details - CI ad format: " + creativeInfo.I() + ", max ad type: " + nVar.A.getString("ad_format"));
            BrandSafetyEvent.AdFormatType a3 = BrandSafetyUtils.a(nVar.A);
            if ((creativeInfo.I() == null || !creativeInfo.I().equals(a3.name())) && a3 != null) {
                Logger.d(J, "set CI details - updating ad format value to " + a3.name());
                creativeInfo.p(a3.name());
                nVar.e("ad_type_upd(sCrInfoDtls):" + a3.name());
            }
        }
        if (nVar.f29388v != null && (nVar.f29388v.equals(creativeInfo.Q()) || nVar.f29388v.equals(creativeInfo.R()))) {
            if (nVar.U) {
                Logger.d(J, "set CI details - ad is already finished, cannot set creative info");
                return false;
            }
            Logger.d(J, "set CI details - currentMaxPackageName: " + nVar.f29388v);
            if (a(creativeInfo, nVar)) {
                Logger.d(J, "set CI details - setting as current CI for SDK: " + creativeInfo.Q());
                if (nVar.i() != null) {
                    Logger.d(J, "set CI details - replacing CI " + nVar.i());
                }
                if (creativeInfo.I() == null && (a2 = BrandSafetyUtils.a(nVar.A)) != null) {
                    Logger.d(J, "set CI details - Start monitoring ad check, updating ad format value to " + a2.name());
                    creativeInfo.p(a2.name());
                    nVar.e("ad_type_upd(shldStrtMntrngAd):" + a2.name());
                }
                b(creativeInfo, nVar);
                if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false) && creativeInfo.F() != null && nVar.y() != null && creativeInfo.F().contains(nVar.y())) {
                    Logger.d(J, "set CI details - replacing ci placement " + creativeInfo.F() + " with Max placement " + nVar.y());
                    creativeInfo.h(nVar.y());
                }
                try {
                    boolean a4 = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    com.safedk.android.utils.k.b(J, "set CI details - Multi ad detectMultipleAdsByWebview =  " + a4 + ", currentActivityInterstitial.isMultiAd() = " + nVar.f() + ", currentActivityInterstitial.getImpression() != null ?" + (nVar.h() != null) + ", currentActivityInterstitial.getImpression().getCreativeInfo() != null ? " + (nVar.h().e() != null) + ", getImpressionList = " + nVar.g());
                    if (a4 && nVar.f() && nVar.h() != null && nVar.h().e() != null) {
                        Logger.d(J, "set CI details - Multi ad, current impression already has a CI. not calling setCreativeInfo.");
                        return false;
                    }
                } catch (Throwable th) {
                    Logger.d(J, "Exception in set CI details - Multi ad : " + th.getMessage(), th);
                }
                return b(oVar, nVar);
            }
        }
        a(oVar, creativeInfo.Q());
        creativeInfo.u("apci|ts=" + System.currentTimeMillis() + ";" + oVar.f29759b + "|o=" + oVar.f29758a.ae() + ";" + oVar.f29758a.af());
        b(creativeInfo, nVar);
        return false;
    }

    private void b(CreativeInfo creativeInfo, n nVar) {
        if (nVar != null) {
            if (nVar.ak == null || nVar.ak.isCancelled()) {
                Logger.d(J, "start late scanning - task future is: " + nVar.ak + ", is scanning? " + nVar.al + " is ad finished? " + nVar.U);
                if (!nVar.al) {
                    Logger.d(J, "start late scanning - starting timer for InterstitialInfo with event id: " + nVar.w());
                    e(nVar);
                    nVar.Z = 0L;
                    nVar.ak = this.D.scheduleAtFixedRate(new b(nVar.L, nVar.f29388v), K, L, TimeUnit.MILLISECONDS);
                    return;
                }
                Logger.d(J, "start late scanning - avoid recursive call to web view scanning");
                creativeInfo.u("avoidRecWebScan");
            }
        }
    }

    private synchronized void a(o oVar, String str) {
        if (oVar != null) {
            if (oVar.f29758a != null) {
                List<o> list = this.Q.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                    this.Q.put(str, list);
                } else {
                    for (o oVar2 : list) {
                        if (oVar2.f29758a != null && oVar2.f29758a.equals(oVar.f29758a)) {
                            Logger.d(J, "add CI as pending match - already in pending list: " + oVar);
                            break;
                        }
                    }
                    Logger.d(J, "add CI as pending match - number of pending candidates: " + list.size());
                }
                if (!CreativeInfoManager.a(str, AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false)) {
                    Logger.d(J, "adding as pending for SDK: " + oVar.f29758a.Q() + " matching info: " + oVar);
                    list.add(oVar);
                } else {
                    Logger.d(J, "NOT adding as pending (config based), sdk: " + str + " matching info: " + oVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean b(o oVar, n nVar) {
        AdNetworkDiscovery h2;
        boolean z2 = false;
        synchronized (this) {
            Logger.d(J, "set CI started, matching info=" + (oVar == null ? "null" : oVar.toString()) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (oVar == null) {
                Logger.d(J, "set CI, matching info is null");
            } else {
                CreativeInfo creativeInfo = oVar.f29758a;
                if (creativeInfo != null) {
                    Logger.d(J, "set CI, matching info is " + oVar);
                    if (nVar != null) {
                        if (nVar.i() != null && !nVar.i().ah()) {
                            CreativeInfoManager.b(creativeInfo);
                            com.safedk.android.utils.k.b(J, "set CI, already matched! ignore matching attempt CI: " + creativeInfo);
                        } else {
                            creativeInfo.a(oVar.f29759b, oVar.f29760c);
                            Logger.d(J, "set CI: " + creativeInfo);
                            nVar.a(creativeInfo);
                            a(creativeInfo);
                            if (CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false) && (h2 = CreativeInfoManager.h(creativeInfo.Q())) != null) {
                                h2.b(creativeInfo);
                            }
                            if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP && nVar.K != null) {
                                com.safedk.android.analytics.brandsafety.creatives.e.b(nVar.h().a(), creativeInfo);
                            } else {
                                com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo, (String) null);
                            }
                            if (oVar.f29759b.startsWith(CreativeInfo.f29620h)) {
                                nVar.u();
                            }
                            b(nVar, creativeInfo);
                            e(nVar, "setCreativeInfo");
                            if (creativeInfo.v()) {
                                nVar.h().f29747k = false;
                            }
                            if (!nVar.ah && StatsReporter.b().a(creativeInfo, nVar)) {
                                nVar.ah = true;
                            }
                            z2 = true;
                        }
                    }
                }
            }
        }
        return z2;
    }

    private void a(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            List<o> list = this.Q.get(creativeInfo.Q());
            if (list != null) {
                Iterator<o> it = list.iterator();
                while (it.hasNext()) {
                    o next = it.next();
                    if (next.f29758a != null && next.f29758a.m() != null && next.f29758a.m().equals(creativeInfo.m())) {
                        Logger.d(J, "remove pending creative info - removing creative info from pending list: " + creativeInfo);
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, String str3) {
        Logger.d(J, "set ad click URL started, sdk: " + str2 + ", url: " + str + ", view address: " + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str2);
        n a2 = this.F.a(str3, false);
        if (a2 == null && this.F.a(mainSdkPackage).size() == 1) {
            Logger.d(J, "InterstitialInfo not found by address, trying by SdkPackageName " + mainSdkPackage);
            a2 = this.F.a(mainSdkPackage).get(0);
        }
        if (a2 != null && a2.c() != null && SdksMapping.isSameSdkByPackages(a2.c(), mainSdkPackage)) {
            Logger.d(J, "set ad click URL - applying clickUrl candidate logic. url: " + str);
            if (!a2.d()) {
                Logger.d(J, "set ad click URL - current Activity Interstitial is not marked as clicked, setting click URL: " + str);
                b(a2, str);
            } else if (a2.e() == null) {
                Logger.d(J, "set ad click URL - no click URL yet, setting clickUrl: " + str);
                a2.c(str);
            } else {
                Logger.d(J, "set ad click URL - click URL already set: " + a2.e());
            }
            return true;
        }
        Logger.d(J, "set ad click URL skipped, SDK: " + (a2 != null ? a2.c() : "null"));
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b(String str, String str2, String str3) {
        n a2 = this.F.a(str3, false);
        if (a2 != null && a2.d() && str2 != null && str2.equals(a2.c()) && a2.am != null && a2.am.get() != null) {
            String obj = a2.am.get().toString();
            Logger.d(J, "set previous activity click url, click activity: " + obj + ", ad activity: " + a2.ac);
            String a3 = BrandSafetyUtils.a(obj, true);
            if (a3 != null && !a3.equals(a2.B)) {
                Logger.d(J, "set previous activity click url - detected URL for click in previous activity (not yet destroyed), url: " + str);
                if (a2.c(str)) {
                    e(a2, "setPreviousActivityClickUrl");
                }
            }
        }
    }

    private void a(final n nVar, final View view, final Activity activity) {
        try {
            if (nVar == null || activity == null) {
                Logger.d(J, "currentActivityInterstitial or activity are null");
            } else {
                final String c2 = nVar.c();
                Logger.d(J, "taking screenshot on UIThread, view=" + view);
                activity.runOnUiThread(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (CreativeInfoManager.a(c2, AdNetworkConfiguration.SHOULD_COPY_BITMAP_USING_PIXELCOPY, false)) {
                            Logger.d(InterstitialFinder.J, "Taking screenshot - network supports copying bitmap using PixelCopy");
                            ScreenshotHelper.a(activity, nVar, view, SafeDK.getInstance().D());
                            return;
                        }
                        final Bitmap a2 = ScreenshotHelper.a(view, SafeDK.getInstance().D());
                        if (a2 == null) {
                            nVar.G();
                            Logger.d(InterstitialFinder.J, "taking screenshot, black screenshot detected index = " + nVar.F());
                        } else {
                            InterstitialFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.8.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    InterstitialFinder.this.a(nVar, c2, a2);
                                }
                            });
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(J, "taking screenshot taking screenshot exception:", th);
        }
    }

    /* renamed from: com.safedk.android.analytics.brandsafety.InterstitialFinder$9, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass9 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final String f29300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f29301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f29302c;

        AnonymousClass9(n nVar, Bitmap bitmap) {
            this.f29301b = nVar;
            this.f29302c = bitmap;
            this.f29300a = this.f29301b.c();
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialFinder.this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.9.1
                @Override // java.lang.Runnable
                public void run() {
                    InterstitialFinder.this.a(AnonymousClass9.this.f29301b, AnonymousClass9.this.f29300a, AnonymousClass9.this.f29302c);
                }
            });
        }
    }

    public void a(Bitmap bitmap, n nVar, Activity activity) {
        activity.runOnUiThread(new AnonymousClass9(nVar, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(n nVar, String str, Bitmap bitmap) {
        if (bitmap != null) {
            BrandSafetyUtils.a a2 = BrandSafetyUtils.a(str, bitmap);
            int a3 = a2.a();
            BrandSafetyUtils.ScreenshotValidity a4 = BrandSafetyUtils.a(str, a2);
            Logger.d(J, "process screenshot, screenshotValidity = " + a4.name());
            if (a4 == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_BLACK || a4 == BrandSafetyUtils.ScreenshotValidity.UNIFORMITY_VERY_HIGH) {
                nVar.G();
                Logger.d(J, "process screenshot, black/uniform screenshot detected index = " + nVar.F());
                return;
            }
            if (a4 == BrandSafetyUtils.ScreenshotValidity.VALID) {
                String a5 = BrandSafetyUtils.a(bitmap);
                Logger.d(J, "process screenshot found interstitial, hash = " + a5);
                AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
                if (h2 != null && !h2.a(a5, this.R)) {
                    Logger.d(J, "process screenshot skipping file, not valid for " + str);
                    nVar.e("SkippedImageHash=" + a5);
                    return;
                }
                nVar.ag = BrandSafetyUtils.b(bitmap);
                String n2 = nVar.n();
                Logger.d(J, "process screenshot impressionId is " + n2);
                String a6 = BrandSafetyUtils.a(bitmap, BrandSafetyUtils.AdType.INTERSTITIAL, a5, str, n2, nVar.ag);
                Logger.d(J, "process screenshot screenshot file created, filename = " + a6);
                long c2 = BrandSafetyUtils.c(a6);
                float f2 = (a3 / 1000.0f) * 100.0f;
                if (h2 != null && c2 < h2.a(nVar.i())) {
                    Logger.d(J, "process screenshot file size too small " + c2 + " (bytes). This image will not be used");
                    BrandSafetyUtils.d(a6);
                    return;
                }
                Logger.d(J, "process screenshot stored file size is " + c2 + " bytes, counter is " + nVar.f29389y + ", uniform pixel count is " + a3 + " (" + f2 + "%)");
                int size = this.B.size();
                if (!e(a5, n2)) {
                    boolean z2 = false;
                    if (size < SafeDK.getInstance().H()) {
                        Logger.d(J, "process screenshot impressions to report size=" + size + ", max images to store=" + SafeDK.getInstance().H());
                        if (nVar.ab == null) {
                            z2 = true;
                        } else if (!nVar.ab.equals(a5)) {
                            Logger.d(J, "process screenshot removing previous file : " + nVar.f29386t);
                            BrandSafetyUtils.d(nVar.f29386t);
                            z2 = true;
                        }
                        if (z2) {
                            Logger.d(J, "process screenshot keeping file of interstitial " + a5 + ". file size is " + c2 + " (bytes), orientation: " + nVar.ag);
                            BrandSafetyUtils.a(nVar.t(), BrandSafetyUtils.AdType.INTERSTITIAL, a5, str, n2, nVar.ag);
                        }
                    } else if (!d(a5, n2)) {
                        Logger.d(J, "process screenshot no open slot for interstitial " + a5);
                        BrandSafetyUtils.d(a6);
                        a5 = null;
                    } else {
                        Logger.d(J, "process screenshot image " + a5 + "_" + n2 + " is already scheduled for upload");
                    }
                } else {
                    Logger.d(J, "process screenshot not saving file for interstitial " + a5 + "_" + n2);
                    BrandSafetyUtils.d(a6);
                    if (e(a5, n2)) {
                        Logger.d(J, "process screenshot interstitial " + a5 + "_" + n2 + " was already reported");
                    } else {
                        Logger.d(J, "process screenshot waiting to report stored interstitial " + nVar.ab);
                    }
                    if (nVar.ab != null) {
                        if (d(nVar.ab, nVar.n())) {
                            BrandSafetyUtils.d(nVar.f29386t);
                        } else {
                            Logger.d(J, "process screenshot not deleting not best image " + nVar.f29386t);
                        }
                    }
                }
                boolean z3 = false;
                if (a5 != null) {
                    Logger.d(J, "process screenshot setting interstitial info data (previous hash = " + nVar.ab + ", current hash = " + a5 + ")");
                    z3 = (nVar.ab == null || a5.equals(nVar.ab)) ? false : true;
                }
                if (nVar.ag.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED)) {
                    nVar.ag = BrandSafetyUtils.b(bitmap);
                }
                l h3 = nVar.h();
                if (h3 != null) {
                    h3.b(ImpressionLog.f29268t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.N));
                    Logger.d(J, "process screenshot setting image details: " + h3.f29740b);
                    h3.f29740b = new j(a5, a6, c2, a3, nVar.f29389y, nVar.ag, z3);
                    e(nVar, "processScreenshot");
                }
                if (nVar.ab == null) {
                    Logger.d(J, "process screenshot no previous hash to detect animation, keep sampling");
                    nVar.ab = a5;
                    nVar.f29386t = a6;
                    nVar.f29387u = nVar.ag;
                    return;
                }
                boolean z4 = true;
                CreativeInfo i2 = nVar.i();
                if (i2 != null && i2.D()) {
                    if (z3) {
                        Logger.d(J, "process screenshot, shopping collage didn't finished loading");
                        z4 = false;
                    } else {
                        Logger.d(J, "process screenshot, shopping collage finished loading");
                    }
                }
                if (a(a3, c2) && z4) {
                    if (h3 != null) {
                        h3.a(ImpressionLog.f29268t, new ImpressionLog.a(ImpressionLog.F, ImpressionLog.O));
                    }
                    j l2 = nVar.l();
                    if (l2 != null) {
                        l2.f29695g = z3;
                        Logger.d(J, "process screenshot setting interstitial is_animated field to " + z3);
                    }
                    if (!TextUtils.isEmpty(a5)) {
                        if (nVar.ag.equals(BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) && l2 != null) {
                            l2.f29694f = BrandSafetyUtils.b(bitmap);
                        }
                        Logger.d(J, "process screenshot - before reporting, debug info is: " + nVar.B());
                        e(nVar, "processScreenshot");
                        nVar.d(true);
                    }
                    a(nVar.L);
                    return;
                }
                nVar.ab = a5;
                nVar.f29386t = a6;
                nVar.f29387u = nVar.ag;
                return;
            }
            Logger.d(J, "process screenshot is not valid: " + a4.name() + ", pixel count: " + a3 + ", try again...");
            if (nVar.aa && nVar.h().f29747k) {
                Logger.d(J, "process screenshot back from background - reset video completed indication to false");
                nVar.aa = false;
                nVar.h().f29747k = false;
            }
        }
    }

    private String c(View view) {
        return BrandSafetyUtils.b(view.getClass());
    }

    protected String b(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= viewGroup.getChildCount()) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof WebView) {
                int width = childAt.getWidth();
                int height = childAt.getHeight();
                Logger.d(J, "View = " + childAt + ": width = " + width + " height = " + height);
                if (childAt.getVisibility() == 0 && a(width, height)) {
                    String c2 = c(childAt);
                    Logger.d(J, "Found full screen webview of SDK = " + c2);
                    return c2;
                }
            } else if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt);
            }
            i2 = i3 + 1;
        }
    }

    private boolean a(int i2, int i3) {
        return i2 == BrandSafetyUtils.a() && i3 == BrandSafetyUtils.b();
    }

    private boolean a(int i2, long j2) {
        Logger.d(J, "should stop sampling started, maxUniformedPixelsCount=" + i2 + ", fileSize=" + j2 + " (bytes), stopSamplingFileSize=" + SafeDK.getInstance().I());
        boolean z2 = BrandSafetyUtils.a(i2) && j2 > SafeDK.getInstance().I();
        Logger.d(J, "should stop sampling returned " + z2);
        return z2;
    }

    @Override // com.safedk.android.internal.a
    public void g() {
        if (this.F != null) {
            for (n nVar : this.F.values()) {
                if (nVar != null && nVar.Y) {
                    nVar.a(ImpressionLog.f29272z, new ImpressionLog.a[0]);
                    e(nVar, "onBackground");
                }
            }
        }
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        if (this.F != null) {
            for (n nVar : this.F.values()) {
                if (nVar != null) {
                    nVar.a(ImpressionLog.A, new ImpressionLog.a[0]);
                    e(nVar, "onForeground");
                    if (!nVar.h().f29747k) {
                        nVar.aa = true;
                    }
                }
            }
        }
    }

    private void a(List<WeakReference<WebView>> list, n nVar) {
        Iterator<WeakReference<WebView>> it = list.iterator();
        while (it.hasNext()) {
            WebView webView = it.next().get();
            if (webView != null) {
                String a2 = BrandSafetyUtils.a((Class) webView.getClass());
                if (!TextUtils.isEmpty(a2) && !a2.equals(nVar.c()) && a2.equals(com.safedk.android.utils.g.f30053h)) {
                    Logger.d(J, "identify scar-admob - webView is Admob: " + webView + ", current interstitial info: " + nVar);
                    nVar.T = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final n nVar) {
        if (nVar == null || nVar.am == null || nVar.am.get() == null || nVar.al) {
            Logger.d(J, "scan for webViews activity is null, skipping");
            return;
        }
        Activity activity = nVar.am.get();
        Logger.d(J, "scan for webViews started, activity: " + (activity == null ? "null" : activity.toString()) + ", currentActivityInterstitial.resourceMatching: " + nVar.J + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (activity == null || !BrandSafetyUtils.h(activity.getClass().getName())) {
            try {
                if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                    Logger.d(J, "scan for webViews : resourceMatching DEFAULT");
                    if (nVar.i() != null) {
                        View f2 = nVar.i().f();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList2.add(BrandSafetyUtils.a(f2));
                        arrayList3.add("h1c1:" + f2);
                        String c2 = nVar.c() != null ? nVar.c() : "";
                        a(nVar, c2, (ViewGroup) f2, arrayList, arrayList2, arrayList3, 1);
                        Logger.d(J, "scan for webViews resourceMatching DEFAULT found viewHierarchy " + arrayList3);
                        if (nVar.x() != null) {
                            Logger.d(J, "scan for webViews resourceMatching DEFAULT previous ViewsHierarchy size :  " + nVar.x().size() + " , current : " + arrayList2.size());
                            long a2 = CreativeInfoManager.a(c2, AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
                            if (a2 > 0 && nVar.x().size() >= a2 + arrayList2.size()) {
                                Logger.d(J, "scan for webViews resourceMatching DEFAULT End of video detected");
                                a(c2, (Object) f2);
                            }
                        } else {
                            nVar.a(ImpressionLog.f29260l, new ImpressionLog.a(ImpressionLog.G, IntegrityManager.INTEGRITY_TYPE_NONE));
                        }
                        nVar.a(arrayList2);
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                Logger.e(J, "scan for webViews resourceMatching DEFAULT exception : ", th);
                return;
            } finally {
                Logger.d(J, "scan for webViews resourceMatching DEFAULT exit scanning");
                nVar.al = false;
            }
        }
        try {
            nVar.al = true;
            View findViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
            final AdNetworkDiscovery h2 = CreativeInfoManager.h(nVar.c());
            String c3 = nVar.c() != null ? nVar.c() : "";
            if (h2 == null) {
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            if (findViewById != null) {
                arrayList5.add(BrandSafetyUtils.a(findViewById));
                arrayList6.add("h1c1:" + findViewById);
                a(nVar, c3, (ViewGroup) findViewById, arrayList4, arrayList5, arrayList6, 1);
                a(arrayList4, nVar);
                com.safedk.android.utils.k.b(J, "scan for webViews found views hierarchy : " + arrayList6);
            }
            if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP) {
                String L2 = nVar.i() != null ? nVar.i().L() : null;
                Iterator<String> it = arrayList5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (CreativeInfoManager.f29426j.remove(next)) {
                        Logger.d(J, "scan for webViews - video start received for " + next);
                        nVar.h().f29748l = true;
                        break;
                    }
                }
                final WeakReference<WebView> a3 = h2.a((List<WeakReference<WebView>>) arrayList4, L2);
                if (a3 == null || a3.get() == null) {
                    Logger.d(J, "scan for webViews - WebView not found");
                    if (nVar.f29379m == null) {
                        nVar.a(ImpressionLog.f29260l, new ImpressionLog.a(ImpressionLog.G, IntegrityManager.INTEGRITY_TYPE_NONE));
                    }
                    nVar.a(arrayList5);
                } else {
                    nVar.a(arrayList5);
                    nVar.b(arrayList4);
                    final String a4 = BrandSafetyUtils.a(a3.get());
                    if (nVar.K == null) {
                        a(a4, ImpressionLog.f29260l, new ImpressionLog.a(ImpressionLog.G, a4));
                    }
                    SafeDKWebAppInterface.a(a4);
                    com.safedk.android.analytics.brandsafety.creatives.e.a(a4);
                    a((c) nVar);
                    if (nVar.K != null && nVar.K.equals(a4)) {
                        return;
                    }
                    Logger.d(J, "scan for webViews found " + a3.get());
                    boolean a5 = CreativeInfoManager.a(nVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                    Logger.d(J, "scan for webViews, should detect multiple ads by web view change? " + a5);
                    if (a5 && nVar.K != null && !nVar.K.equals(a4)) {
                        g(nVar, a4);
                    }
                    nVar.K = a4;
                    nVar.h().a(a4);
                    Logger.d(J, "scan for webViews address set to " + a4);
                    Iterator<l> it2 = nVar.g().iterator();
                    while (it2.hasNext()) {
                        CreativeInfo e = it2.next().e();
                        Logger.d(J, "scan for webViews - current ci is: " + e);
                        if (e == null) {
                            Logger.d(J, "scan for webViews will check for pending CIs for package " + nVar.c());
                            Iterator<o> it3 = a(nVar.c(), nVar).iterator();
                            while (it3.hasNext()) {
                                b(it3.next(), nVar);
                            }
                        } else if (e.af() == null || arrayList5.contains(e.af())) {
                            Logger.d(J, "scan for webViews attempting to collect resources for " + a4 + ", CI: " + e);
                            com.safedk.android.analytics.brandsafety.creatives.e.b(a4, e);
                        } else {
                            Logger.d(J, "scan for webViews skip resources collection for address: " + a4 + ", CI: " + e);
                        }
                    }
                    if (h2.d() != null && h2.d().a(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false) && nVar.A != null && nVar.A.containsKey("ad_format") && nVar.A.getString("ad_format").equals(BrandSafetyUtils.f29189l)) {
                        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.10
                            @Override // java.lang.Runnable
                            public void run() {
                                if (a3 != null && a3.get() != null) {
                                    List<CreativeInfo> a6 = h2.a(new WeakReference<>((View) a3.get()), (String) null, false);
                                    if (a6 != null) {
                                        for (CreativeInfo creativeInfo : a6) {
                                            com.safedk.android.utils.k.b(InterstitialFinder.J, "scan for webViews ci returned : " + creativeInfo);
                                            if (creativeInfo.m() == null) {
                                                creativeInfo.f(nVar.L);
                                            }
                                            if (nVar.A != null && nVar.A.containsKey("ad_format")) {
                                                String name = BrandSafetyUtils.a(nVar.A).name();
                                                creativeInfo.p(name);
                                                nVar.e("ad_type_upd(scnFrWVs):" + name);
                                                Logger.d(InterstitialFinder.J, "scan for webViews ad_format set to  : " + name);
                                            }
                                            InterstitialFinder.this.a(new o(creativeInfo, CreativeInfo.f29626n, a4));
                                        }
                                        return;
                                    }
                                    Logger.d(InterstitialFinder.J, "scan for webViews ci not found by View");
                                }
                            }
                        });
                    }
                }
            } else if (findViewById != null && nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                WeakReference<WebView> a6 = h2.a((List<WeakReference<WebView>>) arrayList4, (String) null);
                if (a6 == null || a6.get() == null) {
                    Logger.d(J, "scan for webViews (DIRECT_CREATIVE_INFO) - WebView not found");
                } else {
                    String a7 = BrandSafetyUtils.a(a6.get());
                    if (nVar.K == null) {
                        a(a7, ImpressionLog.f29260l, new ImpressionLog.a(ImpressionLog.G, a7));
                    }
                    Logger.d(J, "scan for webViews found (DIRECT_CREATIVE_INFO) " + a7);
                    nVar.K = a7;
                    nVar.h().a(a7);
                    a((c) nVar);
                    CreativeInfo e2 = nVar.h().e();
                    if (e2 != null) {
                        Logger.d(J, "scan for webViews (DIRECT_CREATIVE_INFO) attempting to collect resources for " + a7 + ", CI: " + e2);
                        com.safedk.android.analytics.brandsafety.creatives.e.b(a7, e2);
                    }
                }
            } else if (nVar.J == AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT) {
                if (nVar.f29379m == null) {
                    nVar.a(ImpressionLog.f29260l, new ImpressionLog.a(ImpressionLog.G, IntegrityManager.INTEGRITY_TYPE_NONE));
                }
                nVar.a(arrayList5);
            }
        } catch (Throwable th2) {
            Logger.e(J, "scan for webViews execution: ", th2);
        } finally {
            Logger.d(J, "scan for webViews - exit scanning");
            nVar.al = false;
        }
    }

    private void g(n nVar, String str) {
        Logger.d(J, "handle web view change, web view change detected from: " + nVar.K + ", to: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        l h2 = nVar.h();
        if (h2 != null && h2.e() != null && !h2.e().ah()) {
            h2.e().ai();
            String h3 = h2.e().h();
            if (h3 != null) {
                h2.e().c(h3 + CreativeInfo.aJ);
            }
        }
        nVar.g().add(new l(UUID.randomUUID().toString()));
        Logger.d(J, "handle WebView Change - new Impression info object created. number of impressions in ad : " + nVar.g().size());
        if (nVar.D == null) {
            nVar.D = UUID.randomUUID().toString();
        }
        nVar.ae = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final n nVar, final Activity activity) {
        this.D.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.InterstitialFinder.2
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0128, code lost:
            
                r1 = r3.name();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 443
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.InterstitialFinder.AnonymousClass2.run():void");
            }
        });
    }

    public void b(n nVar, String str) {
        nVar.ai = new h(System.currentTimeMillis(), str);
    }

    public void g(String str, String str2) {
        Logger.d(J, "setCurrentInterstitialDownstreamStruct started");
        List<n> a2 = this.F.a(str);
        if (a2.size() == 1) {
            n nVar = a2.get(0);
            if (nVar != null) {
                List<CreativeInfo> j2 = nVar.j();
                if (!j2.isEmpty() && str2 != null) {
                    for (CreativeInfo creativeInfo : j2) {
                        String h2 = creativeInfo.h();
                        if (h2 != null && !h2.endsWith(str2)) {
                            creativeInfo.c(h2 + RemoteSettings.FORWARD_SLASH_STRING + str2);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        Logger.d(J, "setCurrentInterstitialDownstreamStruct number of Infos for " + str + " is " + a2.size() + ", cannot set downstream struct");
    }

    static void b(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup != null) {
            View view = list.get(0).get();
            long height = view.getHeight() * view.getWidth();
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                long width = childAt.getWidth() * childAt.getHeight();
                if (height > 0 && width > 0 && (((float) width) / ((float) height)) * 100.0f >= O) {
                    list.add(new WeakReference<>(childAt));
                }
                if (childAt instanceof ViewGroup) {
                    b((ViewGroup) childAt, list);
                }
            }
        }
    }

    public void l(String str) {
        List<CreativeInfo> j2;
        Logger.d(J, "setStopCollectingResources started");
        List<n> a2 = this.F.a(str);
        if (a2.size() == 1) {
            n nVar = a2.get(0);
            if (nVar != null && (j2 = nVar.j()) != null && !j2.isEmpty()) {
                for (CreativeInfo creativeInfo : j2) {
                    String h2 = creativeInfo.h();
                    if (h2 != null && h2.contains("non-app")) {
                        creativeInfo.a(true);
                    }
                }
                return;
            }
            return;
        }
        Logger.d(J, "setStopCollectingResources number of Infos for " + str + " is " + a2.size() + ", cannot stop collecting resources");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final String f29308b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29309c;
        private boolean d = true;
        private int e = 0;

        public b(String str, String str2) {
            this.f29308b = str;
            this.f29309c = CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT, false) || CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false);
        }

        private void a(n nVar, long j2) {
            Logger.d(InterstitialFinder.J, "scan for screenshots, info " + nVar.L + ", isCancelled = " + (nVar.ak != null ? Boolean.valueOf(nVar.ak.isCancelled()) : "?") + ", isDone = " + (nVar.ak != null ? Boolean.valueOf(nVar.ak.isDone()) : "?") + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (nVar.i() == null && nVar.am != null && nVar.am.get() != null && CreativeInfoManager.a(BrandSafetyUtils.b(nVar.am.get().getClass()), AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false)) {
                Logger.d(InterstitialFinder.J, "scan for screenshots, info " + nVar.L + " calling tryToFindCI");
                InterstitialFinder.this.a(nVar, nVar.am.get());
            }
            if (nVar.am != null && nVar.am.get() != null) {
                Logger.d(InterstitialFinder.J, "scan for screenshots, activity sdk is " + BrandSafetyUtils.b(nVar.am.get().getClass()));
            }
            if (!nVar.E && nVar.f29389y == 2) {
                InterstitialFinder.this.e(nVar, "scanForScreenshots");
            }
            if (InterstitialFinder.this.P == 0 || j2 - InterstitialFinder.this.P >= 900.0d) {
                InterstitialFinder.this.P = j2;
                if (!nVar.ae) {
                    InterstitialFinder.this.a(nVar);
                } else {
                    Logger.d(InterstitialFinder.J, "scan for screenshots, request to stop taking screenshots has been received, skipping.");
                }
                int i2 = nVar.f29389y + 1;
                nVar.f29389y = i2;
                if (i2 != 120) {
                    InterstitialFinder.this.e(nVar);
                    if (nVar.j().isEmpty()) {
                        Logger.d(InterstitialFinder.J, "scan for screenshots, checking for pending CIs");
                        for (o oVar : InterstitialFinder.this.a(nVar.f29388v, nVar)) {
                            if (oVar != null && oVar.f29758a != null) {
                                Logger.d(InterstitialFinder.J, "scan for screenshots, calling set CI");
                                InterstitialFinder.this.b(oVar, nVar);
                            }
                        }
                        return;
                    }
                    return;
                }
                Logger.d(InterstitialFinder.J, "max number of screenshots threshold reached, stop taking screenshots for event id " + this.f29308b);
                this.d = false;
            }
        }

        private void a(n nVar) {
            String b2;
            String d;
            List<Integer> w = com.safedk.android.internal.d.w();
            if (w.contains(Integer.valueOf(this.e)) && nVar.am != null && nVar.am.get() != null) {
                Logger.d(InterstitialFinder.J, "inject periodic script, cycle: " + this.e);
                String str = nVar.f29388v;
                List<WeakReference<WebView>> b3 = InterstitialFinder.this.b(com.safedk.android.analytics.brandsafety.b.a((ViewGroup) nVar.am.get().getWindow().getDecorView().findViewById(R.id.content)));
                AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
                if (h2 != null) {
                    WeakReference<WebView> a2 = h2.a(b3, (String) null);
                    Logger.d(InterstitialFinder.J, "inject periodic script, webView: " + (a2 != null ? a2.get() : "null"));
                    if (com.safedk.android.utils.k.a((Reference<?>) a2)) {
                        com.safedk.android.analytics.brandsafety.creatives.a i2 = CreativeInfoManager.i(str);
                        String a3 = BrandSafetyUtils.a(a2.get());
                        if (i2.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT) && (d = SafeDKWebAppInterface.d(str, a3)) != null) {
                            SafeDKWebAppInterface.b(str, a2.get(), d);
                        }
                        if (i2.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES) && (b2 = SafeDKWebAppInterface.b(str, a3)) != null) {
                            SafeDKWebAppInterface.b(str, a2.get(), b2);
                        }
                    }
                }
                if (this.e >= w.get(w.size() - 1).intValue()) {
                    Logger.d(InterstitialFinder.J, "inject periodic script, reached last interval: " + this.e);
                    this.f29309c = false;
                }
            }
            this.e++;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f29308b == null) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task, event id is null, skipping.");
                    return;
                }
                n nVar = InterstitialFinder.this.F.get(this.f29308b);
                if (nVar == null) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task, did not find interstitial info for event id: " + this.f29308b);
                    return;
                }
                if (nVar.ap) {
                    Logger.d(InterstitialFinder.J, "interstitial finder task, restart periodic script injection");
                    this.e = 0;
                    this.f29309c = CreativeInfoManager.a(nVar.f29388v, AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT, false) || CreativeInfoManager.a(nVar.f29388v, AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false);
                    nVar.ap = false;
                }
                if (this.d) {
                    a(nVar, currentTimeMillis);
                }
                if (this.f29309c) {
                    a(nVar);
                }
                if (!this.d && !this.f29309c) {
                    InterstitialFinder.this.a(this.f29308b);
                }
            } catch (Throwable th) {
                Logger.e(InterstitialFinder.J, "interstitial finder task execution: ", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f29304a;

        /* renamed from: b, reason: collision with root package name */
        String f29305b;

        public a(String str, String str2) {
            this.f29304a = str;
            this.f29305b = str2;
        }

        public boolean equals(Object o2) {
            if (this == o2) {
                return true;
            }
            if (o2 == null || getClass() != o2.getClass()) {
                return false;
            }
            a aVar = (a) o2;
            boolean equals = this.f29304a.equals(aVar.f29304a);
            return this.f29305b != null ? equals && this.f29305b.equals(aVar.f29305b) : equals;
        }

        public int hashCode() {
            return this.f29305b != null ? this.f29304a.hashCode() * this.f29305b.hashCode() : this.f29304a.hashCode();
        }

        public String toString() {
            return "{placementId=" + this.f29304a + ", eventId=" + this.f29305b + "}";
        }

        public String a() {
            return (this.f29304a != null ? this.f29304a : "") + "_" + (this.f29305b != null ? this.f29305b : "");
        }
    }

    private static View a(ViewGroup viewGroup, String str) {
        Logger.d(J, "find views " + viewGroup.toString());
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Logger.d(J, "find views child " + childAt.toString());
            if (str != null && childAt.getClass().getName().equals(str)) {
                Logger.d(J, "find views found " + str + " : " + childAt.toString());
                return childAt;
            }
            if (childAt instanceof ViewGroup) {
                return a((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CreativeInfo> b(ViewGroup viewGroup, String str) {
        List<CreativeInfo> a2;
        Logger.d(J, "get creative info from ad view started : " + viewGroup.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Logger.d(J, "get creative info from ad view - child " + childAt.toString());
            AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
            if (h2 != null && (a2 = h2.a(new WeakReference<>(childAt), (String) null, false)) != null) {
                for (CreativeInfo creativeInfo : a2) {
                    creativeInfo.a((Object) childAt);
                    creativeInfo.u("ci_source_sdk_class=" + childAt.getClass().getName());
                    Logger.d(J, "get creative info from ad view - ci found, object : " + childAt.toString());
                }
                return a2;
            }
            if (childAt instanceof ViewGroup) {
                return b((ViewGroup) childAt, str);
            }
        }
        return null;
    }

    public static void a(View view, int i2) {
        Logger.d(J, "find views view : " + new String(new char[i2 * 2]).replace("\u0000", "-") + view.getClass().toString() + new StringBuilder().toString());
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void b(l lVar) {
        a(lVar);
        synchronized (this.B) {
            com.safedk.android.utils.k.b(J, "adInfoCollectionForUpload count = " + this.B.size() + " : " + this.B);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.b
    public void a(l lVar) {
        Logger.d(J, "remove impression screenshots started");
        if (lVar != null && lVar.f29741c != null) {
            Logger.d(J, "Calling remove ad files, filename = " + lVar.f29741c);
            BrandSafetyUtils.d(lVar.f29741c);
            lVar.f29741c = null;
        } else {
            Logger.d(J, "no last activity impression screenshot filename");
        }
        this.C.clear();
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n a(String str, RedirectDetails redirectDetails, m mVar, boolean z2, boolean z3) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public boolean c(String str, String str2, String str3) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.b, com.safedk.android.analytics.brandsafety.a
    public void d(String str, String str2, String str3) {
        n a2 = this.F.a(str, false);
        if (a2 != null) {
            if (com.safedk.android.analytics.brandsafety.b.f29364y.equals(str3)) {
                a2.a(str2, true);
            } else {
                a2.e(str2);
            }
            Logger.d(J, "pass message to ad info - message: " + str2 + " has passed to info: " + a2);
            return;
        }
        Logger.d(J, "pass message to ad info - info is null");
    }

    public boolean d() {
        Iterator<n> it = this.F.values().iterator();
        while (it.hasNext()) {
            if (!it.next().U) {
                return true;
            }
        }
        return false;
    }
}
