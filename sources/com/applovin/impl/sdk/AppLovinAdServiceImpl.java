package com.applovin.impl.sdk;

import Q7.n0;
import T.J0;
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
import com.applovin.impl.C0703h0;
import com.applovin.impl.C0745s;
import com.applovin.impl.C0769w;
import com.applovin.impl.L;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.h8;
import com.applovin.impl.mb;
import com.applovin.impl.n9;
import com.applovin.impl.nm;
import com.applovin.impl.oj;
import com.applovin.impl.pm;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.C0749a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.tm;
import com.applovin.impl.up;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
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
public class AppLovinAdServiceImpl implements AppLovinAdService, C0749a.InterfaceC0033a {

    /* renamed from: a */
    private final k f10642a;
    private final t b;

    /* renamed from: c */
    private final Map f10643c;

    /* renamed from: d */
    private final Object f10644d = new Object();

    /* renamed from: e */
    private final Map f10645e = n0.q();

    /* renamed from: f */
    private final AtomicReference f10646f = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f10647a;
        final /* synthetic */ Uri b;

        /* renamed from: c */
        final /* synthetic */ n9 f10648c;

        /* renamed from: d */
        final /* synthetic */ Context f10649d;

        public a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
            this.f10647a = bVar;
            this.b = uri;
            this.f10648c = n9Var;
            this.f10649d = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            AppLovinAdServiceImpl.this.f10642a.f0().resumeForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f10642a.f0().pauseForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f10647a, this.b, this.f10648c, this.f10649d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ArrayService.DirectDownloadListener {

        /* renamed from: a */
        final /* synthetic */ com.applovin.impl.adview.a f10651a;
        final /* synthetic */ com.applovin.impl.sdk.ad.b b;

        /* renamed from: c */
        final /* synthetic */ AppLovinAdView f10652c;

        /* renamed from: d */
        final /* synthetic */ Uri f10653d;

        public b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.f10651a = aVar;
            this.b = bVar;
            this.f10652c = appLovinAdView;
            this.f10653d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            if (this.f10651a != null) {
                AppLovinAdServiceImpl.this.f10642a.f0().resumeForClick();
                bc.a(this.f10651a.e(), this.b, this.f10652c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.f10642a.f0().pauseForClick();
            com.applovin.impl.adview.a aVar = this.f10651a;
            if (aVar != null) {
                aVar.x();
                bc.c(this.f10651a.e(), this.b, this.f10652c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.b, this.f10652c, this.f10651a, this.f10653d);
        }
    }

    /* loaded from: classes.dex */
    public class c implements mb {

        /* renamed from: a */
        private AppLovinAdLoadListener f10655a;

        public c(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f10655a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f10642a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f10642a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f10642a);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f10655a;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(appLovinAd);
            } else if (!((Boolean) AppLovinAdServiceImpl.this.f10642a.a(oj.f9569D)).booleanValue()) {
            } else {
                throw new IllegalStateException("Unable to notify listener about ad load");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i9) {
            failedToReceiveAdV2(new AppLovinError(i9, ""));
        }

        @Override // com.applovin.impl.mb
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            AppLovinAdServiceImpl.this.b(appLovinError, this.f10655a);
            this.f10655a = null;
        }
    }

    /* loaded from: classes.dex */
    public class d implements mb {

        /* renamed from: a */
        private final C0703h0 f10656a;
        private final e b;

        /* renamed from: c */
        private final int f10657c;

        private d(C0703h0 c0703h0, e eVar) {
            this.f10656a = c0703h0;
            this.b = eVar;
            if (Boolean.parseBoolean(AppLovinAdServiceImpl.this.f10642a.g0().getExtraParameters().get("disable_auto_retries"))) {
                this.f10657c = -1;
            } else {
                this.f10657c = ((Integer) AppLovinAdServiceImpl.this.f10642a.a(oj.f9591G)).intValue();
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f10642a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f10642a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f10642a);
            }
            Collection emptySet = Collections.emptySet();
            synchronized (this.b.f10659a) {
                try {
                    if (!this.b.f10661d) {
                        emptySet = new HashSet(this.b.f10662e);
                        this.b.f10662e.clear();
                    }
                    e eVar = this.b;
                    eVar.f10660c = 0;
                    eVar.b = false;
                    eVar.f10661d = false;
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
        public void failedToReceiveAd(int i9) {
            failedToReceiveAdV2(new AppLovinError(i9, ""));
        }

        @Override // com.applovin.impl.mb
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            e eVar;
            int i9;
            Collections.emptySet();
            synchronized (this.b.f10659a) {
                try {
                    AppLovinAdSize f9 = this.f10656a.f();
                    if (a(f9) && (i9 = (eVar = this.b).f10660c) < this.f10657c) {
                        int i10 = i9 + 1;
                        eVar.f10660c = i10;
                        int pow = (int) Math.pow(2.0d, i10);
                        t unused = AppLovinAdServiceImpl.this.b;
                        if (t.a()) {
                            AppLovinAdServiceImpl.this.b.a("AppLovinAdService", "Failed to load ad of zone {" + this.f10656a.e() + "} with size " + f9 + ". Current retry attempt: " + this.b.f10660c + " of " + this.f10657c + ". Retrying again in " + pow + " seconds...");
                        }
                        AppLovinSdkUtils.runOnUiThreadDelayed(new z(this, 0), TimeUnit.SECONDS.toMillis(pow));
                    } else {
                        HashSet hashSet = new HashSet(this.b.f10662e);
                        this.b.f10662e.clear();
                        e eVar2 = this.b;
                        eVar2.f10660c = 0;
                        eVar2.b = false;
                        eVar2.f10661d = false;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ void a() {
            AppLovinAdServiceImpl.this.a(this.f10656a, this);
        }

        private boolean a(AppLovinAdSize appLovinAdSize) {
            return appLovinAdSize == null ? ((Boolean) AppLovinAdServiceImpl.this.f10642a.a(oj.f9604I)).booleanValue() : AppLovinAdServiceImpl.this.f10642a.c(oj.f9597H).contains(appLovinAdSize.getLabel());
        }

        public /* synthetic */ d(AppLovinAdServiceImpl appLovinAdServiceImpl, C0703h0 c0703h0, e eVar, a aVar) {
            this(c0703h0, eVar);
        }
    }

    public AppLovinAdServiceImpl(k kVar) {
        this.f10642a = kVar;
        this.b = kVar.L();
        HashMap hashMap = new HashMap(6);
        this.f10643c = hashMap;
        hashMap.put(C0703h0.c(), new e(null));
        hashMap.put(C0703h0.k(), new e(null));
        hashMap.put(C0703h0.j(), new e(null));
        hashMap.put(C0703h0.m(), new e(null));
        hashMap.put(C0703h0.b(), new e(null));
        hashMap.put(C0703h0.h(), new e(null));
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f10645e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        if (this.f10642a.y() != null) {
            this.f10642a.y().a(appLovinBidTokenCollectionListener);
        } else {
            this.f10642a.x().a(appLovinBidTokenCollectionListener);
        }
    }

    public AppLovinAd dequeueAd(C0703h0 c0703h0) {
        AppLovinAdImpl a6 = this.f10642a.g().a(c0703h0);
        if (t.a()) {
            this.b.a("AppLovinAdService", "Dequeued ad: " + a6 + " for zone: " + c0703h0 + "...");
        }
        return a6;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f10646f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f10645e) {
            map = CollectionUtils.map(this.f10645e);
            this.f10645e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        String C8;
        if (t.a()) {
            this.b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (this.f10642a.y() != null) {
            C8 = this.f10642a.y().h();
        } else {
            C8 = this.f10642a.x().C();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (StringUtils.isValidString(C8) && t.a()) {
            this.b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return C8;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(C0703h0.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String str2;
        AppLovinAdLoadListener appLovinAdLoadListener2;
        if (str != null) {
            str2 = str.trim();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            t.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        C0769w c0769w = new C0769w(str2, this.f10642a);
        if (((Boolean) this.f10642a.a(oj.f9561C)).booleanValue()) {
            appLovinAdLoadListener2 = new c(appLovinAdLoadListener);
        } else {
            appLovinAdLoadListener2 = appLovinAdLoadListener;
        }
        if (c0769w.c() == C0769w.a.REGULAR) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Loading next ad for token: " + c0769w);
            }
            a(new pm(c0769w, appLovinAdLoadListener2, this.f10642a));
            return;
        }
        if (c0769w.c() == C0769w.a.AD_RESPONSE_JSON) {
            JSONObject a6 = c0769w.a();
            if (a6 != null) {
                c4.c(a6, this.f10642a);
                c4.b(a6, this.f10642a);
                c4.a(a6, this.f10642a);
                C0753e.b(this.f10642a);
                if (JsonUtils.getJSONArray(a6, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
                    if (t.a()) {
                        this.b.a("AppLovinAdService", "Rendering ad for token: " + c0769w);
                    }
                    a(new tm(a6, zp.a(a6, this.f10642a), appLovinAdLoadListener2, this.f10642a));
                    return;
                }
                if (t.a()) {
                    this.b.b("AppLovinAdService", "No ad returned from the server for token: " + c0769w);
                }
                c(AppLovinError.NO_FILL, appLovinAdLoadListener);
                return;
            }
            String str3 = "Unable to retrieve ad response JSON from token: " + c0769w.b();
            AppLovinError appLovinError = new AppLovinError(-8, str3);
            t.h("AppLovinAdService", str3);
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
        t.h("AppLovinAdService", "Invalid token type");
        c(appLovinError2, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!TextUtils.isEmpty(str)) {
            if (t.a()) {
                L.v("Loading next ad of zone {", str, "}", this.b, "AppLovinAdService");
            }
            a(C0703h0.a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (t.a()) {
            L.v("Loading next incentivized ad of zone {", str, "}", this.b, "AppLovinAdService");
        }
        a(C0703h0.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l;
        if (!((Boolean) this.f10642a.a(oj.f9847s2)).booleanValue() || (l = (Long) this.f10642a.b(qj.f10364M)) == null || System.currentTimeMillis() - l.longValue() > ((Long) this.f10642a.a(oj.f9853t2)).longValue() || !b()) {
            return;
        }
        a();
    }

    public void maybeSubmitPersistentPostbacks(List<C0745s> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<C0745s> it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    @Override // com.applovin.impl.sdk.C0749a.InterfaceC0033a
    public void onAdExpired(h8 h8Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) h8Var;
        C0703h0 adZone = appLovinAdImpl.getAdZone();
        if (t.a()) {
            this.b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f10642a.g().b(appLovinAdImpl);
        if (!this.f10642a.D0() && ((Boolean) this.f10642a.a(oj.f9831q1)).booleanValue()) {
            e a6 = a(adZone);
            synchronized (a6.f10659a) {
                try {
                    if (!a6.b) {
                        this.f10642a.L();
                        if (t.a()) {
                            this.f10642a.L().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                        }
                        a6.b = true;
                        a6.f10661d = true;
                        a(adZone, new d(this, adZone, a6, null));
                    } else if (t.a()) {
                        this.b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f10646f.set(jSONObject);
    }

    @NonNull
    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f10643c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, @Nullable MotionEvent motionEvent, boolean z8, @Nullable Bundle bundle) {
        boolean z9;
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
            }
        } else {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            if (bundle != null && Boolean.parseBoolean(bundle.getString("install_click"))) {
                z9 = true;
            } else {
                z9 = false;
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z8, z9));
            if (this.f10642a.b0() != null) {
                this.f10642a.b0().b(bVar.d(motionEvent, false, z9), motionEvent);
            }
        }
        if (appLovinAdView != null && uri != null) {
            if (bVar.isDirectDownloadEnabled()) {
                this.f10642a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
                return;
            } else {
                a(bVar, appLovinAdView, aVar, uri);
                return;
            }
        }
        if (t.a()) {
            this.b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, @Nullable Bundle bundle, n9 n9Var, Context context) {
        boolean z8;
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
            }
        } else {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            if (bundle != null && Boolean.parseBoolean(bundle.getString("install_click"))) {
                z8 = true;
            } else {
                z8 = false;
            }
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z8));
            if (this.f10642a.b0() != null) {
                this.f10642a.b0().b(bVar.d(motionEvent, true, z8), motionEvent);
            }
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.f10642a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new a(bVar, uri, n9Var, context));
        } else {
            a(bVar, uri, n9Var, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.t());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.u());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.v());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j7, List<Long> list, long j9, boolean z8, int i9) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<C0745s> c9 = bVar.c();
        if (c9 != null && !c9.isEmpty()) {
            for (C0745s c0745s : c9) {
                String a6 = a(c0745s.c(), j7, j9, list, z8, i9);
                String a9 = a(c0745s.a(), j7, j9, list, z8, i9);
                if (StringUtils.isValidString(a6)) {
                    a(new C0745s(a6, a9));
                } else if (t.a()) {
                    this.b.b("AppLovinAdService", "Failed to parse url: " + c0745s.c());
                }
            }
            return;
        }
        if (t.a()) {
            this.b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.F());
            if (this.f10642a.b0() != null) {
                this.f10642a.b0().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j7, int i9, boolean z8) {
        if (bVar == null) {
            if (t.a()) {
                this.b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<C0745s> n02 = bVar.n0();
        if (n02 != null && !n02.isEmpty()) {
            String l = Long.toString(System.currentTimeMillis());
            for (C0745s c0745s : n02) {
                if (StringUtils.isValidString(c0745s.c())) {
                    String a6 = a(c0745s.c(), j7, i9, l, z8);
                    String a9 = a(c0745s.a(), j7, i9, l, z8);
                    if (a6 != null) {
                        a(new C0745s(a6, a9));
                    } else if (t.a()) {
                        this.b.b("AppLovinAdService", "Failed to parse url: " + c0745s.c());
                    }
                } else if (t.a()) {
                    this.b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                }
            }
            return;
        }
        if (t.a()) {
            this.b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
        }
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(C0703h0.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        final Object f10659a;
        boolean b;

        /* renamed from: c */
        int f10660c;

        /* renamed from: d */
        boolean f10661d;

        /* renamed from: e */
        final Collection f10662e;

        private e() {
            this.f10659a = new Object();
            this.f10662e = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.b + ", isReloadingExpiredAd=" + this.f10661d + ", pendingAdListeners=" + this.f10662e + '}';
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new y(this, appLovinError, appLovinAdLoadListener));
    }

    public void a(C0703h0 c0703h0, d dVar) {
        AppLovinAdImpl e4 = this.f10642a.g().e(c0703h0);
        if (e4 != null && !e4.isExpired()) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Using pre-loaded ad: " + e4 + " for " + c0703h0);
            }
            dVar.adReceived(e4);
            return;
        }
        a(new nm(c0703h0, dVar, this.f10642a));
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f10642a.L();
            if (t.a()) {
                this.f10642a.L().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f10642a.B().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
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
        Context k6 = k.k();
        historicalProcessExitReasons = ((ActivityManager) k6.getSystemService("activity")).getHistoricalProcessExitReasons(k6.getPackageName(), 0, 1);
        ApplicationExitInfo f9 = J0.f(historicalProcessExitReasons.get(0));
        reason = f9.getReason();
        if (reason == 10) {
            return true;
        }
        reason2 = f9.getReason();
        return reason2 == 11;
    }

    public /* synthetic */ void a(n9 n9Var) {
        if (n9Var != null) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Dismissing ad after forwarding click");
            }
            n9Var.f();
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
        if (a(uri.getScheme())) {
            a(uri, bVar, (com.applovin.impl.adview.a) null, n9Var);
        } else if (up.b(uri)) {
            a(uri, bVar, (AppLovinAdView) null, (com.applovin.impl.adview.a) null, context, this.f10642a);
        } else {
            up.a(uri, context, this.f10642a);
        }
    }

    private void a(C0703h0 c0703h0, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (c0703h0 == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f10642a.L();
            if (t.a()) {
                this.f10642a.L().a("AppLovinAdService", "Loading next ad of zone {" + c0703h0 + "}...");
            }
            e a6 = a(c0703h0);
            synchronized (a6.f10659a) {
                try {
                    a6.f10662e.add(appLovinAdLoadListener);
                    if (!a6.b) {
                        a6.b = true;
                        a(c0703h0, new d(this, c0703h0, a6, null));
                    } else if (t.a()) {
                        this.b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(xl xlVar) {
        if (!this.f10642a.y0()) {
            t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f10642a.c();
        this.f10642a.l0().a(xlVar, sm.b.CORE);
    }

    private void a(C0745s c0745s) {
        if (StringUtils.isValidString(c0745s.c())) {
            this.f10642a.Z().e(com.applovin.impl.sdk.network.d.b().d(c0745s.c()).a(StringUtils.isValidString(c0745s.a()) ? c0745s.a() : null).a(c0745s.b()).a(false).b(c0745s.d()).a());
        } else if (t.a()) {
            this.b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private e a(C0703h0 c0703h0) {
        e eVar;
        synchronized (this.f10644d) {
            try {
                eVar = (e) this.f10643c.get(c0703h0);
                if (eVar == null) {
                    eVar = new e(null);
                    this.f10643c.put(c0703h0, eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new y(this, appLovinAdLoadListener, appLovinAd, 0));
    }

    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            t.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f10642a.B().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            t.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.f10642a.B().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof mb ? "V2" : ""), th);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (((Boolean) this.f10642a.a(oj.f9636N)).booleanValue()) {
            context = ar.a(appLovinAdView, this.f10642a);
            if (context == null) {
                context = appLovinAdView.getContext();
            }
        } else {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (a(uri.getScheme())) {
            a(uri, bVar, aVar, (n9) null);
        } else if (up.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f10642a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j7, int i9, String str2, boolean z8) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i9 < 0 || i9 > 100) {
                i9 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j7)).appendQueryParameter("pv", Integer.toString(i9)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z8)).build().toString();
        } catch (Throwable th) {
            if (t.a()) {
                this.b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f10642a.B().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (up.a(uri, context, this.f10642a)) {
            bc.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.x();
    }

    private boolean a(String str) {
        String str2 = (String) n0.d(this.f10642a, "forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.adview.a aVar, n9 n9Var) {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Forwarding click " + uri);
        }
        bVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = (String) n0.d(this.f10642a, "close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (n9Var != null) {
                AppLovinSdkUtils.runOnUiThread(true, new A4.d(12, this, n9Var));
            } else {
                if (aVar == null || zp.a(bVar.getSize())) {
                    return;
                }
                if (t.a()) {
                    this.b.a("AppLovinAdService", "Closing ad after forwarding click");
                }
                aVar.y();
            }
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri b8 = b(uri, "primaryUrl");
            List a6 = a(uri, "primaryTrackingUrl");
            Uri b9 = b(uri, "fallbackUrl");
            List a9 = a(uri, "fallbackTrackingUrl");
            if (b8 == null && b9 == null) {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(b8, "primary", a6, bVar, appLovinAdView, aVar, context, kVar)) {
                a(b9, "backup", a9, bVar, appLovinAdView, aVar, context, kVar);
            }
            if (aVar != null) {
                aVar.x();
                return;
            }
            return;
        }
        kVar.L();
        if (t.a()) {
            kVar.L().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.L();
        if (t.a()) {
            kVar.L().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean a6 = up.a(uri, context, kVar);
        if (a6) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.a0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                bc.b(aVar.e(), bVar, appLovinAdView);
            }
        } else {
            kVar.L();
            if (t.a()) {
                kVar.L().b("AppLovinAdService", "URL failed to open");
            }
        }
        return a6;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f10642a.L();
                if (t.a()) {
                    this.f10642a.L().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f10642a.B().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j7, long j9, List list, boolean z8, int i9) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j7)).appendQueryParameter("vs_ms", Long.toString(j9));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i9 != C0754f.f10796i) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z8));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C0754f.a(i9)));
        }
        return appendQueryParameter.build().toString();
    }

    private void a() {
        if (t.a()) {
            this.b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f10642a.b(qj.f10365N);
        if (str != null) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, null);
            a(new C0745s(JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_url", null), JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_backup_url", null)));
        } else if (t.a()) {
            this.b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }
}
