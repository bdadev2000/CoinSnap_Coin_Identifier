package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.e4;
import com.applovin.impl.gc;
import com.applovin.impl.h0;
import com.applovin.impl.j8;
import com.applovin.impl.la;
import com.applovin.impl.om;
import com.applovin.impl.p9;
import com.applovin.impl.qm;
import com.applovin.impl.rb;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.tp;
import com.applovin.impl.u0;
import com.applovin.impl.uj;
import com.applovin.impl.um;
import com.applovin.impl.w;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.zq;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0096a {

    /* renamed from: a */
    private final j f26478a;

    /* renamed from: b */
    private final n f26479b;

    /* renamed from: c */
    private final Map f26480c;
    private final Object d = new Object();
    private final Map e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    private final AtomicReference f26481f = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f26482a;

        /* renamed from: b */
        final /* synthetic */ Uri f26483b;

        /* renamed from: c */
        final /* synthetic */ p9 f26484c;
        final /* synthetic */ Context d;

        public a(com.applovin.impl.sdk.ad.b bVar, Uri uri, p9 p9Var, Context context) {
            this.f26482a = bVar;
            this.f26483b = uri;
            this.f26484c = p9Var;
            this.d = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            AppLovinAdServiceImpl.this.f26478a.f0().resumeForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f26478a.f0().pauseForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            n unused = AppLovinAdServiceImpl.this.f26479b;
            if (n.a()) {
                AppLovinAdServiceImpl.this.f26479b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f26482a, this.f26483b, this.f26484c, this.d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ArrayService.DirectDownloadListener {

        /* renamed from: a */
        final /* synthetic */ com.applovin.impl.adview.a f26485a;

        /* renamed from: b */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f26486b;

        /* renamed from: c */
        final /* synthetic */ AppLovinAdView f26487c;
        final /* synthetic */ Uri d;

        public b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.f26485a = aVar;
            this.f26486b = bVar;
            this.f26487c = appLovinAdView;
            this.d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            if (this.f26485a != null) {
                AppLovinAdServiceImpl.this.f26478a.f0().resumeForClick();
                gc.a(this.f26485a.e(), this.f26486b, this.f26487c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f26478a.f0().pauseForClick();
            com.applovin.impl.adview.a aVar = this.f26485a;
            if (aVar != null) {
                aVar.x();
                gc.c(this.f26485a.e(), this.f26486b, this.f26487c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            n unused = AppLovinAdServiceImpl.this.f26479b;
            if (n.a()) {
                AppLovinAdServiceImpl.this.f26479b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f26486b, this.f26487c, this.f26485a, this.d);
        }
    }

    /* loaded from: classes.dex */
    public class c implements rb {

        /* renamed from: a */
        private final h0 f26488a;

        /* renamed from: b */
        private final d f26489b;

        /* renamed from: c */
        private final int f26490c;

        private c(h0 h0Var, d dVar) {
            this.f26488a = h0Var;
            this.f26489b = dVar;
            if (Boolean.parseBoolean(AppLovinAdServiceImpl.this.f26478a.g0().getExtraParameters().get("disable_auto_retries"))) {
                this.f26490c = -1;
            } else {
                this.f26490c = ((Integer) AppLovinAdServiceImpl.this.f26478a.a(sj.x)).intValue();
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f26478a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f26478a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f26478a);
            }
            Collection emptySet = Collections.emptySet();
            synchronized (this.f26489b.f26491a) {
                try {
                    if (!this.f26489b.d) {
                        emptySet = new HashSet(this.f26489b.e);
                        this.f26489b.e.clear();
                    }
                    d dVar = this.f26489b;
                    dVar.f26493c = 0;
                    dVar.f26492b = false;
                    dVar.d = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            failedToReceiveAdV2(new AppLovinError(i2, ""));
        }

        @Override // com.applovin.impl.rb
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            d dVar;
            int i2;
            Collections.emptySet();
            synchronized (this.f26489b.f26491a) {
                try {
                    AppLovinAdSize f2 = this.f26488a.f();
                    if (!a(f2) || (i2 = (dVar = this.f26489b).f26493c) >= this.f26490c) {
                        HashSet hashSet = new HashSet(this.f26489b.e);
                        this.f26489b.e.clear();
                        d dVar2 = this.f26489b;
                        dVar2.f26493c = 0;
                        dVar2.f26492b = false;
                        dVar2.d = false;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
                        }
                    } else {
                        int i3 = i2 + 1;
                        dVar.f26493c = i3;
                        int pow = (int) Math.pow(2.0d, i3);
                        n unused = AppLovinAdServiceImpl.this.f26479b;
                        if (n.a()) {
                            AppLovinAdServiceImpl.this.f26479b.a("AppLovinAdService", "Failed to load ad of zone {" + this.f26488a.e() + "} with size " + f2 + ". Current retry attempt: " + this.f26489b.f26493c + " of " + this.f26490c + ". Retrying again in " + pow + " seconds...");
                        }
                        AppLovinSdkUtils.runOnUiThreadDelayed(new s(this, 0), TimeUnit.SECONDS.toMillis(pow));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ void a() {
            AppLovinAdServiceImpl.this.a(this.f26488a, this);
        }

        private boolean a(AppLovinAdSize appLovinAdSize) {
            return appLovinAdSize == null ? ((Boolean) AppLovinAdServiceImpl.this.f26478a.a(sj.f26962z)).booleanValue() : AppLovinAdServiceImpl.this.f26478a.c(sj.f26960y).contains(appLovinAdSize.getLabel());
        }

        public /* synthetic */ c(AppLovinAdServiceImpl appLovinAdServiceImpl, h0 h0Var, d dVar, a aVar) {
            this(h0Var, dVar);
        }
    }

    public AppLovinAdServiceImpl(j jVar) {
        this.f26478a = jVar;
        this.f26479b = jVar.J();
        HashMap hashMap = new HashMap(6);
        this.f26480c = hashMap;
        hashMap.put(h0.c(), new d(null));
        hashMap.put(h0.k(), new d(null));
        hashMap.put(h0.j(), new d(null));
        hashMap.put(h0.m(), new d(null));
        hashMap.put(h0.b(), new d(null));
        hashMap.put(h0.h(), new d(null));
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f26478a.y().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(h0 h0Var) {
        AppLovinAdImpl a2 = this.f26478a.g().a(h0Var);
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Dequeued ad: " + a2 + " for zone: " + h0Var + "...");
        }
        return a2;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f26481f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.e);
            this.e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String C = this.f26478a.y().C();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (StringUtils.isValidString(C) && n.a()) {
            this.f26479b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return C;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(h0.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            n.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.w wVar = new com.applovin.impl.w(trim, this.f26478a);
        if (wVar.c() == w.a.REGULAR) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Loading next ad for token: " + wVar);
            }
            a(new qm(wVar, appLovinAdLoadListener, this.f26478a));
            return;
        }
        if (wVar.c() != w.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            n.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        JSONObject a2 = wVar.a();
        if (a2 == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            n.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        e4.c(a2, this.f26478a);
        e4.b(a2, this.f26478a);
        e4.a(a2, this.f26478a);
        u0.b(this.f26478a);
        if (JsonUtils.getJSONArray(a2, "ads", new JSONArray()).length() > 0) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Rendering ad for token: " + wVar);
            }
            a(new um(a2, yp.a(a2, this.f26478a), appLovinAdLoadListener, this.f26478a));
            return;
        }
        if (n.a()) {
            this.f26479b.b("AppLovinAdService", "No ad returned from the server for token: " + wVar);
        }
        c(AppLovinError.NO_FILL, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(h0.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(h0.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l2;
        if (((Boolean) this.f26478a.a(sj.u2)).booleanValue() && (l2 = (Long) this.f26478a.b(uj.L)) != null && System.currentTimeMillis() - l2.longValue() <= ((Long) this.f26478a.a(sj.y2)).longValue()) {
            if (((Boolean) this.f26478a.a(sj.x2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.s> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.s> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0096a
    public void onAdExpired(j8 j8Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) j8Var;
        h0 adZone = appLovinAdImpl.getAdZone();
        if (n.a()) {
            this.f26479b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f26478a.g().b(appLovinAdImpl);
        if (this.f26478a.A0() || !((Boolean) this.f26478a.a(sj.s1)).booleanValue()) {
            return;
        }
        d a2 = a(adZone);
        synchronized (a2.f26491a) {
            try {
                if (!a2.f26492b) {
                    this.f26478a.J();
                    if (n.a()) {
                        this.f26478a.J().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    a2.f26492b = true;
                    a2.d = true;
                    a(adZone, new c(this, adZone, a2, null));
                } else if (n.a()) {
                    this.f26479b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f26481f.set(jSONObject);
    }

    @NonNull
    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f26480c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, @Nullable MotionEvent motionEvent, boolean z2, @Nullable Bundle bundle) {
        if (bVar == null) {
            if (n.a()) {
                this.f26479b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            boolean z3 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z2, z3));
            if (this.f26478a.Z() != null) {
                this.f26478a.Z().b(bVar.d(motionEvent, false, z3), motionEvent);
            }
        } else if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
        }
        if (appLovinAdView == null || uri == null) {
            if (n.a()) {
                this.f26479b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (bVar.isDirectDownloadEnabled()) {
            this.f26478a.m().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
        } else {
            a(bVar, appLovinAdView, aVar, uri);
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, @Nullable Bundle bundle, p9 p9Var, Context context) {
        if (bVar == null) {
            if (n.a()) {
                this.f26479b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            boolean z2 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z2));
            if (this.f26478a.Z() != null) {
                this.f26478a.Z().b(bVar.d(motionEvent, true, z2), motionEvent);
            }
        } else if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.f26478a.m().startDirectInstallOrDownloadProcess(bVar, bundle, new a(bVar, uri, p9Var, context));
        } else {
            a(bVar, uri, p9Var, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.s());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.t());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.u());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.v());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.x());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j2, List<Long> list, long j3, boolean z2, int i2) {
        if (bVar == null) {
            if (n.a()) {
                this.f26479b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.s> c2 = bVar.c();
        if (c2 == null || c2.isEmpty()) {
            if (n.a()) {
                this.f26479b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.s sVar : c2) {
            String a2 = a(sVar.c(), j2, j3, list, z2, i2);
            String a3 = a(sVar.a(), j2, j3, list, z2, i2);
            if (StringUtils.isValidString(a2)) {
                a(new com.applovin.impl.s(a2, a3));
            } else if (n.a()) {
                this.f26479b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (n.a()) {
                this.f26479b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.E());
            if (this.f26478a.Z() != null) {
                this.f26478a.Z().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j2, int i2, boolean z2) {
        if (bVar == null) {
            if (n.a()) {
                this.f26479b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.s> o02 = bVar.o0();
        if (o02 == null || o02.isEmpty()) {
            if (n.a()) {
                this.f26479b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String l2 = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.s sVar : o02) {
            if (StringUtils.isValidString(sVar.c())) {
                String a2 = a(sVar.c(), j2, i2, l2, z2);
                String a3 = a(sVar.a(), j2, i2, l2, z2);
                if (a2 != null) {
                    a(new com.applovin.impl.s(a2, a3));
                } else if (n.a()) {
                    this.f26479b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
                }
            } else if (n.a()) {
                this.f26479b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof rb) {
            ((rb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(h0.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final Object f26491a;

        /* renamed from: b */
        boolean f26492b;

        /* renamed from: c */
        int f26493c;
        boolean d;
        final Collection e;

        private d() {
            this.f26491a = new Object();
            this.e = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f26492b + ", isReloadingExpiredAd=" + this.d + ", pendingAdListeners=" + this.e + '}';
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public void a(h0 h0Var, c cVar) {
        AppLovinAdImpl e = this.f26478a.g().e(h0Var);
        if (e != null && !e.isExpired()) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Using pre-loaded ad: " + e + " for " + h0Var);
            }
            cVar.adReceived(e);
            return;
        }
        a(new om(h0Var, cVar, this.f26478a));
    }

    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new r(this, 0, appLovinError, appLovinAdLoadListener));
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f26478a.J();
            if (n.a()) {
                this.f26478a.J().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f26478a.E().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private boolean b() {
        List historicalProcessExitReasons;
        int reason;
        int reason2;
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        Context l2 = j.l();
        historicalProcessExitReasons = ((ActivityManager) l2.getSystemService("activity")).getHistoricalProcessExitReasons(l2.getPackageName(), 0, 1);
        ApplicationExitInfo f2 = androidx.core.view.j.f(historicalProcessExitReasons.get(0));
        reason = f2.getReason();
        if (reason == 10) {
            return true;
        }
        reason2 = f2.getReason();
        return reason2 == 11;
    }

    public /* synthetic */ void a(p9 p9Var) {
        if (p9Var != null) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Dismissing ad after forwarding click");
            }
            p9Var.f();
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, p9 p9Var, Context context) {
        if (a(uri.getScheme())) {
            a(uri, bVar, (com.applovin.impl.adview.a) null, p9Var);
        } else if (tp.b(uri)) {
            a(uri, bVar, (AppLovinAdView) null, (com.applovin.impl.adview.a) null, context, this.f26478a);
        } else {
            tp.a(uri, context, this.f26478a);
        }
    }

    private void a(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (h0Var == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f26478a.J();
            if (n.a()) {
                this.f26478a.J().a("AppLovinAdService", "Loading next ad of zone {" + h0Var + "}...");
            }
            d a2 = a(h0Var);
            synchronized (a2.f26491a) {
                try {
                    a2.e.add(appLovinAdLoadListener);
                    if (!a2.f26492b) {
                        a2.f26492b = true;
                        a(h0Var, new c(this, h0Var, a2, null));
                    } else if (n.a()) {
                        this.f26479b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(yl ylVar) {
        if (!this.f26478a.u0()) {
            n.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f26478a.c();
        this.f26478a.j0().a(ylVar, tm.b.CORE);
    }

    private void a(com.applovin.impl.s sVar) {
        if (StringUtils.isValidString(sVar.c())) {
            this.f26478a.X().e(com.applovin.impl.sdk.network.d.b().d(sVar.c()).a(StringUtils.isValidString(sVar.a()) ? sVar.a() : null).a(sVar.b()).a(false).b(sVar.d()).a());
        } else if (n.a()) {
            this.f26479b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private d a(h0 h0Var) {
        d dVar;
        synchronized (this.d) {
            try {
                dVar = (d) this.f26480c.get(h0Var);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f26480c.put(h0Var, dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new r(this, appLovinAd, appLovinAdLoadListener));
    }

    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            n.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f26478a.E().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            n.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.f26478a.E().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof rb ? "V2" : ""), th);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (((Boolean) this.f26478a.a(sj.F)).booleanValue()) {
            context = zq.a(appLovinAdView, this.f26478a);
            if (context == null) {
                context = appLovinAdView.getContext();
            }
        } else {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (a(uri.getScheme())) {
            a(uri, bVar, aVar, (p9) null);
        } else if (tp.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f26478a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j2, int i2, String str2, boolean z2) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i2 < 0 || i2 > 100) {
                i2 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j2)).appendQueryParameter("pv", Integer.toString(i2)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z2)).build().toString();
        } catch (Throwable th) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f26478a.E().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (tp.a(uri, context, this.f26478a)) {
            gc.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.x();
    }

    private boolean a(String str) {
        String str2 = this.f26478a.g0().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.adview.a aVar, p9 p9Var) {
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Forwarding click " + uri);
        }
        bVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f26478a.g0().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (p9Var != null) {
                AppLovinSdkUtils.runOnUiThread(true, new androidx.core.content.res.a(11, this, p9Var));
            } else {
                if (aVar == null || yp.a(bVar.getSize())) {
                    return;
                }
                if (n.a()) {
                    this.f26479b.a("AppLovinAdService", "Closing ad after forwarding click");
                }
                aVar.z();
            }
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, j jVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri b2 = b(uri, "primaryUrl");
            List a2 = a(uri, "primaryTrackingUrl");
            Uri b3 = b(uri, "fallbackUrl");
            List a3 = a(uri, "fallbackTrackingUrl");
            if (b2 == null && b3 == null) {
                jVar.J();
                if (n.a()) {
                    jVar.J().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(b2, "primary", a2, bVar, appLovinAdView, aVar, context, jVar)) {
                a(b3, "backup", a3, bVar, appLovinAdView, aVar, context, jVar);
            }
            if (aVar != null) {
                aVar.x();
                return;
            }
            return;
        }
        jVar.J();
        if (n.a()) {
            jVar.J().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, j jVar) {
        jVar.J();
        if (n.a()) {
            jVar.J().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean a2 = tp.a(uri, context, jVar);
        if (a2) {
            jVar.J();
            if (n.a()) {
                jVar.J().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jVar.Y().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                gc.b(aVar.e(), bVar, appLovinAdView);
            }
        } else {
            jVar.J();
            if (n.a()) {
                jVar.J().b("AppLovinAdService", "URL failed to open");
            }
        }
        return a2;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f26478a.J();
                if (n.a()) {
                    this.f26478a.J().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f26478a.E().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j2, long j3, List list, boolean z2, int i2) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j2)).appendQueryParameter("vs_ms", Long.toString(j3));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i2 != f.f26614i) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z2));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(f.a(i2)));
        }
        return appendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> tryToStringMap;
        if (n.a()) {
            this.f26479b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f26478a.b(uj.O);
        if (TextUtils.isEmpty(str)) {
            if (n.a()) {
                this.f26479b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            tryToStringMap = null;
        } else {
            tryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f26478a.E().a(la.D, (Map) tryToStringMap);
        String str2 = (String) this.f26478a.b(uj.N);
        if (str2 != null) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l2 = (Long) this.f26478a.b(uj.M);
            if (l2 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l2));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l2));
            }
            a(new com.applovin.impl.s(string, string2));
            return;
        }
        if (n.a()) {
            this.f26479b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }
}
