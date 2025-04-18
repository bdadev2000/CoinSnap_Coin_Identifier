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
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.tm;
import com.applovin.impl.up;
import com.applovin.impl.w;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import h.o0;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import n0.p2;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0033a {
    private final k a;

    /* renamed from: b */
    private final t f7504b;

    /* renamed from: c */
    private final Map f7505c;

    /* renamed from: d */
    private final Object f7506d = new Object();

    /* renamed from: e */
    private final Map f7507e = a4.j.r();

    /* renamed from: f */
    private final AtomicReference f7508f = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements ArrayService.DirectDownloadListener {
        final /* synthetic */ com.applovin.impl.sdk.ad.b a;

        /* renamed from: b */
        final /* synthetic */ Uri f7509b;

        /* renamed from: c */
        final /* synthetic */ n9 f7510c;

        /* renamed from: d */
        final /* synthetic */ Context f7511d;

        public a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
            this.a = bVar;
            this.f7509b = uri;
            this.f7510c = n9Var;
            this.f7511d = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            AppLovinAdServiceImpl.this.a.f0().resumeForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.a.f0().pauseForClick();
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.f7504b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.f7504b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.a, this.f7509b, this.f7510c, this.f7511d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ArrayService.DirectDownloadListener {
        final /* synthetic */ com.applovin.impl.adview.a a;

        /* renamed from: b */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f7513b;

        /* renamed from: c */
        final /* synthetic */ AppLovinAdView f7514c;

        /* renamed from: d */
        final /* synthetic */ Uri f7515d;

        public b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.a = aVar;
            this.f7513b = bVar;
            this.f7514c = appLovinAdView;
            this.f7515d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDismissed() {
            if (this.a != null) {
                AppLovinAdServiceImpl.this.a.f0().resumeForClick();
                bc.a(this.a.e(), this.f7513b, this.f7514c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onAppDetailsDisplayed() {
            AppLovinAdServiceImpl.this.a.f0().pauseForClick();
            com.applovin.impl.adview.a aVar = this.a;
            if (aVar != null) {
                aVar.x();
                bc.c(this.a.e(), this.f7513b, this.f7514c);
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            t unused = AppLovinAdServiceImpl.this.f7504b;
            if (t.a()) {
                AppLovinAdServiceImpl.this.f7504b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f7513b, this.f7514c, this.a, this.f7515d);
        }
    }

    /* loaded from: classes.dex */
    public class c implements mb {
        private AppLovinAdLoadListener a;

        public c(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.a = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.a);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.a;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(appLovinAd);
            } else if (!((Boolean) AppLovinAdServiceImpl.this.a.a(oj.D)).booleanValue()) {
            } else {
                throw new IllegalStateException("Unable to notify listener about ad load");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.mb
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            AppLovinAdServiceImpl.this.b(appLovinError, this.a);
            this.a = null;
        }
    }

    /* loaded from: classes.dex */
    public class d implements mb {
        private final com.applovin.impl.h0 a;

        /* renamed from: b */
        private final e f7518b;

        /* renamed from: c */
        private final int f7519c;

        private d(com.applovin.impl.h0 h0Var, e eVar) {
            this.a = h0Var;
            this.f7518b = eVar;
            if (Boolean.parseBoolean(AppLovinAdServiceImpl.this.a.g0().getExtraParameters().get("disable_auto_retries"))) {
                this.f7519c = -1;
            } else {
                this.f7519c = ((Integer) AppLovinAdServiceImpl.this.a.a(oj.G)).intValue();
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.a.g().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.a);
            }
            Collection emptySet = Collections.emptySet();
            synchronized (this.f7518b.a) {
                if (!this.f7518b.f7523d) {
                    emptySet = new HashSet(this.f7518b.f7524e);
                    this.f7518b.f7524e.clear();
                }
                e eVar = this.f7518b;
                eVar.f7522c = 0;
                eVar.f7521b = false;
                eVar.f7523d = false;
            }
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.mb
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            e eVar;
            int i10;
            Collections.emptySet();
            synchronized (this.f7518b.a) {
                AppLovinAdSize f10 = this.a.f();
                int i11 = 0;
                if (a(f10) && (i10 = (eVar = this.f7518b).f7522c) < this.f7519c) {
                    int i12 = i10 + 1;
                    eVar.f7522c = i12;
                    int pow = (int) Math.pow(2.0d, i12);
                    t unused = AppLovinAdServiceImpl.this.f7504b;
                    if (t.a()) {
                        AppLovinAdServiceImpl.this.f7504b.a("AppLovinAdService", "Failed to load ad of zone {" + this.a.e() + "} with size " + f10 + ". Current retry attempt: " + this.f7518b.f7522c + " of " + this.f7519c + ". Retrying again in " + pow + " seconds...");
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new z(this, i11), TimeUnit.SECONDS.toMillis(pow));
                } else {
                    HashSet hashSet = new HashSet(this.f7518b.f7524e);
                    this.f7518b.f7524e.clear();
                    e eVar2 = this.f7518b;
                    eVar2.f7522c = 0;
                    eVar2.f7521b = false;
                    eVar2.f7523d = false;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
                    }
                }
            }
        }

        public /* synthetic */ void a() {
            AppLovinAdServiceImpl.this.a(this.a, this);
        }

        private boolean a(AppLovinAdSize appLovinAdSize) {
            return appLovinAdSize == null ? ((Boolean) AppLovinAdServiceImpl.this.a.a(oj.I)).booleanValue() : AppLovinAdServiceImpl.this.a.c(oj.H).contains(appLovinAdSize.getLabel());
        }

        public /* synthetic */ d(AppLovinAdServiceImpl appLovinAdServiceImpl, com.applovin.impl.h0 h0Var, e eVar, a aVar) {
            this(h0Var, eVar);
        }
    }

    public AppLovinAdServiceImpl(k kVar) {
        this.a = kVar;
        this.f7504b = kVar.L();
        HashMap hashMap = new HashMap(6);
        this.f7505c = hashMap;
        hashMap.put(com.applovin.impl.h0.c(), new e(null));
        hashMap.put(com.applovin.impl.h0.k(), new e(null));
        hashMap.put(com.applovin.impl.h0.j(), new e(null));
        hashMap.put(com.applovin.impl.h0.m(), new e(null));
        hashMap.put(com.applovin.impl.h0.b(), new e(null));
        hashMap.put(com.applovin.impl.h0.h(), new e(null));
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f7507e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        if (this.a.y() != null) {
            this.a.y().a(appLovinBidTokenCollectionListener);
        } else {
            this.a.x().a(appLovinBidTokenCollectionListener);
        }
    }

    public AppLovinAd dequeueAd(com.applovin.impl.h0 h0Var) {
        AppLovinAdImpl a10 = this.a.g().a(h0Var);
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Dequeued ad: " + a10 + " for zone: " + h0Var + "...");
        }
        return a10;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f7508f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f7507e) {
            map = CollectionUtils.map(this.f7507e);
            this.f7507e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        String C;
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (this.a.y() != null) {
            C = this.a.y().h();
        } else {
            C = this.a.x().C();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (StringUtils.isValidString(C) && t.a()) {
            this.f7504b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return C;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.h0.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
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
        com.applovin.impl.w wVar = new com.applovin.impl.w(str2, this.a);
        if (((Boolean) this.a.a(oj.C)).booleanValue()) {
            appLovinAdLoadListener2 = new c(appLovinAdLoadListener);
        } else {
            appLovinAdLoadListener2 = appLovinAdLoadListener;
        }
        if (wVar.c() == w.a.REGULAR) {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Loading next ad for token: " + wVar);
            }
            a(new pm(wVar, appLovinAdLoadListener2, this.a));
            return;
        }
        if (wVar.c() == w.a.AD_RESPONSE_JSON) {
            JSONObject a10 = wVar.a();
            if (a10 != null) {
                c4.c(a10, this.a);
                c4.b(a10, this.a);
                c4.a(a10, this.a);
                com.applovin.impl.sdk.e.b(this.a);
                if (JsonUtils.getJSONArray(a10, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
                    if (t.a()) {
                        this.f7504b.a("AppLovinAdService", "Rendering ad for token: " + wVar);
                    }
                    a(new tm(a10, zp.a(a10, this.a), appLovinAdLoadListener2, this.a));
                    return;
                }
                if (t.a()) {
                    this.f7504b.b("AppLovinAdService", "No ad returned from the server for token: " + wVar);
                }
                c(AppLovinError.NO_FILL, appLovinAdLoadListener);
                return;
            }
            String str3 = "Unable to retrieve ad response JSON from token: " + wVar.b();
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
                a4.j.x("Loading next ad of zone {", str, "}", this.f7504b, "AppLovinAdService");
            }
            a(com.applovin.impl.h0.a(str), appLovinAdLoadListener);
            return;
        }
        throw new IllegalArgumentException("No zone id specified");
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (t.a()) {
            a4.j.x("Loading next incentivized ad of zone {", str, "}", this.f7504b, "AppLovinAdService");
        }
        a(com.applovin.impl.h0.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l10;
        if (!((Boolean) this.a.a(oj.f6753s2)).booleanValue() || (l10 = (Long) this.a.b(qj.M)) == null || System.currentTimeMillis() - l10.longValue() > ((Long) this.a.a(oj.f6760t2)).longValue() || !b()) {
            return;
        }
        a();
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.s> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<com.applovin.impl.s> it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0033a
    public void onAdExpired(h8 h8Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) h8Var;
        com.applovin.impl.h0 adZone = appLovinAdImpl.getAdZone();
        if (t.a()) {
            this.f7504b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.a.g().b(appLovinAdImpl);
        if (!this.a.D0() && ((Boolean) this.a.a(oj.f6737q1)).booleanValue()) {
            e a10 = a(adZone);
            synchronized (a10.a) {
                if (!a10.f7521b) {
                    this.a.L();
                    if (t.a()) {
                        this.a.L().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    a10.f7521b = true;
                    a10.f7523d = true;
                    a(adZone, new d(this, adZone, a10, null));
                } else if (t.a()) {
                    this.f7504b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f7508f.set(jSONObject);
    }

    @NonNull
    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f7505c + AbstractJsonLexerKt.END_OBJ;
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, @Nullable MotionEvent motionEvent, boolean z10, @Nullable Bundle bundle) {
        boolean z11;
        if (bVar == null) {
            if (t.a()) {
                this.f7504b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
            }
        } else {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            if (bundle != null && Boolean.parseBoolean(bundle.getString("install_click"))) {
                z11 = true;
            } else {
                z11 = false;
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z10, z11));
            if (this.a.b0() != null) {
                this.a.b0().b(bVar.d(motionEvent, false, z11), motionEvent);
            }
        }
        if (appLovinAdView != null && uri != null) {
            if (bVar.isDirectDownloadEnabled()) {
                this.a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
                return;
            } else {
                a(bVar, appLovinAdView, aVar, uri);
                return;
            }
        }
        if (t.a()) {
            this.f7504b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, @Nullable Bundle bundle, n9 n9Var, Context context) {
        boolean z10;
        if (bVar == null) {
            if (t.a()) {
                this.f7504b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle != null && Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
            }
        } else {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            if (bundle != null && Boolean.parseBoolean(bundle.getString("install_click"))) {
                z10 = true;
            } else {
                z10 = false;
            }
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z10));
            if (this.a.b0() != null) {
                this.a.b0().b(bVar.d(motionEvent, true, z10), motionEvent);
            }
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.a.l().startDirectInstallOrDownloadProcess(bVar, bundle, new a(bVar, uri, n9Var, context));
        } else {
            a(bVar, uri, n9Var, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.t());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.u());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.v());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j3, List<Long> list, long j10, boolean z10, int i10) {
        if (bVar == null) {
            if (t.a()) {
                this.f7504b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.s> c10 = bVar.c();
        if (c10 != null && !c10.isEmpty()) {
            for (com.applovin.impl.s sVar : c10) {
                String a10 = a(sVar.c(), j3, j10, list, z10, i10);
                String a11 = a(sVar.a(), j3, j10, list, z10, i10);
                if (StringUtils.isValidString(a10)) {
                    a(new com.applovin.impl.s(a10, a11));
                } else if (t.a()) {
                    this.f7504b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
                }
            }
            return;
        }
        if (t.a()) {
            this.f7504b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (t.a()) {
                this.f7504b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.F());
            if (this.a.b0() != null) {
                this.a.b0().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j3, int i10, boolean z10) {
        if (bVar == null) {
            if (t.a()) {
                this.f7504b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.s> n02 = bVar.n0();
        if (n02 != null && !n02.isEmpty()) {
            String l10 = Long.toString(System.currentTimeMillis());
            for (com.applovin.impl.s sVar : n02) {
                if (StringUtils.isValidString(sVar.c())) {
                    String a10 = a(sVar.c(), j3, i10, l10, z10);
                    String a11 = a(sVar.a(), j3, i10, l10, z10);
                    if (a10 != null) {
                        a(new com.applovin.impl.s(a10, a11));
                    } else if (t.a()) {
                        this.f7504b.b("AppLovinAdService", "Failed to parse url: " + sVar.c());
                    }
                } else if (t.a()) {
                    this.f7504b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                }
            }
            return;
        }
        if (t.a()) {
            this.f7504b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
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
            this.f7504b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.h0.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* loaded from: classes.dex */
    public static class e {
        final Object a;

        /* renamed from: b */
        boolean f7521b;

        /* renamed from: c */
        int f7522c;

        /* renamed from: d */
        boolean f7523d;

        /* renamed from: e */
        final Collection f7524e;

        private e() {
            this.a = new Object();
            this.f7524e = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f7521b + ", isReloadingExpiredAd=" + this.f7523d + ", pendingAdListeners=" + this.f7524e + AbstractJsonLexerKt.END_OBJ;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public void a(com.applovin.impl.h0 h0Var, d dVar) {
        AppLovinAdImpl e2 = this.a.g().e(h0Var);
        if (e2 != null && !e2.isExpired()) {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Using pre-loaded ad: " + e2 + " for " + h0Var);
            }
            dVar.adReceived(e2);
            return;
        }
        a(new nm(h0Var, dVar, this.a));
    }

    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new y(0, this, appLovinError, appLovinAdLoadListener));
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th2) {
            this.a.L();
            if (t.a()) {
                this.a.L().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.a.B().a("AppLovinAdService", "buildDeepLinkPlusUrl", th2);
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
        Context k10 = k.k();
        historicalProcessExitReasons = ((ActivityManager) k10.getSystemService("activity")).getHistoricalProcessExitReasons(k10.getPackageName(), 0, 1);
        ApplicationExitInfo d10 = p2.d(historicalProcessExitReasons.get(0));
        reason = d10.getReason();
        if (reason == 10) {
            return true;
        }
        reason2 = d10.getReason();
        return reason2 == 11;
    }

    public /* synthetic */ void a(n9 n9Var) {
        if (n9Var != null) {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Dismissing ad after forwarding click");
            }
            n9Var.f();
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, n9 n9Var, Context context) {
        if (a(uri.getScheme())) {
            a(uri, bVar, (com.applovin.impl.adview.a) null, n9Var);
        } else if (up.b(uri)) {
            a(uri, bVar, (AppLovinAdView) null, (com.applovin.impl.adview.a) null, context, this.a);
        } else {
            up.a(uri, context, this.a);
        }
    }

    private void a(com.applovin.impl.h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (h0Var == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("AppLovinAdService", "Loading next ad of zone {" + h0Var + "}...");
            }
            e a10 = a(h0Var);
            synchronized (a10.a) {
                a10.f7524e.add(appLovinAdLoadListener);
                if (!a10.f7521b) {
                    a10.f7521b = true;
                    a(h0Var, new d(this, h0Var, a10, null));
                } else if (t.a()) {
                    this.f7504b.a("AppLovinAdService", "Already waiting on an ad load...");
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(xl xlVar) {
        if (!this.a.y0()) {
            t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.a.c();
        this.a.l0().a(xlVar, sm.b.CORE);
    }

    private void a(com.applovin.impl.s sVar) {
        if (StringUtils.isValidString(sVar.c())) {
            this.a.Z().e(com.applovin.impl.sdk.network.d.b().d(sVar.c()).a(StringUtils.isValidString(sVar.a()) ? sVar.a() : null).a(sVar.b()).a(false).b(sVar.d()).a());
        } else if (t.a()) {
            this.f7504b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private e a(com.applovin.impl.h0 h0Var) {
        e eVar;
        synchronized (this.f7506d) {
            eVar = (e) this.f7505c.get(h0Var);
            if (eVar == null) {
                eVar = new e(null);
                this.f7505c.put(h0Var, eVar);
            }
        }
        return eVar;
    }

    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new y(this, appLovinAd, appLovinAdLoadListener));
    }

    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th2) {
            t.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th2);
            this.a.B().a("AppLovinAdService", "notifyAdLoadedCallback", th2);
        }
    }

    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th2) {
            t.c("AppLovinAdService", "Unable to notify listener about ad load failure", th2);
            this.a.B().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof mb ? "V2" : ""), th2);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (((Boolean) this.a.a(oj.N)).booleanValue()) {
            context = ar.a(appLovinAdView, this.a);
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
            a(uri, bVar, appLovinAdView, aVar, context2, this.a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j3, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j3)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th2) {
            if (t.a()) {
                this.f7504b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th2);
            }
            this.a.B().a("AppLovinAdService", "buildVideoEndUrl", th2);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (up.a(uri, context, this.a)) {
            bc.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.x();
    }

    private boolean a(String str) {
        String str2 = (String) a4.j.b(this.a, "forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.adview.a aVar, n9 n9Var) {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Forwarding click " + uri);
        }
        bVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = (String) a4.j.b(this.a, "close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (n9Var != null) {
                AppLovinSdkUtils.runOnUiThread(true, new o0(13, this, n9Var));
            } else {
                if (aVar == null || zp.a(bVar.getSize())) {
                    return;
                }
                if (t.a()) {
                    this.f7504b.a("AppLovinAdService", "Closing ad after forwarding click");
                }
                aVar.y();
            }
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri b3 = b(uri, "primaryUrl");
            List a10 = a(uri, "primaryTrackingUrl");
            Uri b10 = b(uri, "fallbackUrl");
            List a11 = a(uri, "fallbackTrackingUrl");
            if (b3 == null && b10 == null) {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(b3, "primary", a10, bVar, appLovinAdView, aVar, context, kVar)) {
                a(b10, "backup", a11, bVar, appLovinAdView, aVar, context, kVar);
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
        boolean a10 = up.a(uri, context, kVar);
        if (a10) {
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
        return a10;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th2) {
                this.a.L();
                if (t.a()) {
                    this.a.L().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.a.B().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th2);
            }
        }
        return arrayList;
    }

    private String a(String str, long j3, long j10, List list, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j3)).appendQueryParameter("vs_ms", Long.toString(j10));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i10 != f.f7660i) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(f.a(i10)));
        }
        return appendQueryParameter.build().toString();
    }

    private void a() {
        if (t.a()) {
            this.f7504b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.a.b(qj.N);
        if (str != null) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, null);
            a(new com.applovin.impl.s(JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_url", null), JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_backup_url", null)));
        } else if (t.a()) {
            this.f7504b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }
}
