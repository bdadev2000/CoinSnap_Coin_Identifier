package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.an;
import com.applovin.impl.ca;
import com.applovin.impl.fi;
import com.applovin.impl.fn;
import com.applovin.impl.gc;
import com.applovin.impl.ge;
import com.applovin.impl.ie;
import com.applovin.impl.iu;
import com.applovin.impl.la;
import com.applovin.impl.ln;
import com.applovin.impl.ma;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.g;
import com.applovin.impl.ne;
import com.applovin.impl.pe;
import com.applovin.impl.rm;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.ve;
import com.applovin.impl.we;
import com.applovin.impl.xe;
import com.applovin.impl.xj;
import com.applovin.impl.yj;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.zj;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f25283a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f25284b;

    /* renamed from: c, reason: collision with root package name */
    private final xj f25285c;
    private final AtomicReference d = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f25286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25287b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f25288c;
        final /* synthetic */ zj d;
        final /* synthetic */ MaxAdFormat e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ yj.a f25289f;

        public a(g gVar, String str, long j2, zj zjVar, MaxAdFormat maxAdFormat, yj.a aVar) {
            this.f25286a = gVar;
            this.f25287b = str;
            this.f25288c = j2;
            this.d = zjVar;
            this.e = maxAdFormat;
            this.f25289f = aVar;
        }

        @Override // com.applovin.impl.mediation.g.c
        public void a(MaxError maxError) {
            com.applovin.impl.sdk.n unused = MediationServiceImpl.this.f25284b;
            if (com.applovin.impl.sdk.n.a()) {
                MediationServiceImpl.this.f25284b.b("MediationService", "Signal collection failed from: " + this.f25286a.g() + " for Ad Unit ID: " + this.f25287b + " with error message: \"" + maxError.getMessage() + "\"");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f25288c;
            yj a2 = yj.a(this.d, this.f25286a, maxError, j2, elapsedRealtime - j2);
            MediationServiceImpl.this.a(a2, this.d, this.f25286a);
            this.f25289f.a(a2);
            this.f25286a.a();
        }

        @Override // com.applovin.impl.mediation.g.c
        public void onSignalCollected(String str) {
            com.applovin.impl.sdk.n unused = MediationServiceImpl.this.f25284b;
            if (com.applovin.impl.sdk.n.a()) {
                MediationServiceImpl.this.f25284b.a("MediationService", "Signal collection successful from: " + this.f25286a.g() + " for Ad Unit ID: " + this.f25287b + " with signal: \"" + str + "\"");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f25288c;
            long j3 = elapsedRealtime - j2;
            yj a2 = yj.a(this.d, this.f25286a, str, j2, j3);
            MediationServiceImpl.this.f25285c.a(a2, this.d, this.f25287b, this.e);
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, this.d.c(), hashMap);
            CollectionUtils.putStringIfValid("adapter_class", this.d.b(), hashMap);
            CollectionUtils.putStringIfValid("adapter_version", this.f25286a.b(), hashMap);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j3), hashMap);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(this.e.getLabel()), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f25287b, hashMap);
            MediationServiceImpl.this.f25283a.E().a(la.f25018p, (Map) hashMap);
            this.f25289f.a(a2);
            this.f25286a.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fi f25291a;

        public b(fi fiVar) {
            this.f25291a = fiVar;
        }

        @Override // com.applovin.impl.mediation.g.c
        public void a(MaxError maxError) {
            this.f25291a.a(maxError);
        }

        @Override // com.applovin.impl.mediation.g.c
        public void onSignalCollected(String str) {
            this.f25291a.b(str);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25293a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f25293a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25293a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25293a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25293a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25293a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25293a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0085a {

        /* renamed from: a, reason: collision with root package name */
        private final ge f25294a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0085a f25295b;

        public d(ge geVar, a.InterfaceC0085a interfaceC0085a) {
            this.f25294a = geVar;
            this.f25295b = interfaceC0085a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f25294a.a(bundle);
            gc.b(this.f25295b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f25294a.a(bundle);
            com.applovin.impl.sdk.n unused = MediationServiceImpl.this.f25284b;
            if (com.applovin.impl.sdk.n.a()) {
                MediationServiceImpl.this.f25284b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f25294a, this.f25295b);
            if (!((Boolean) MediationServiceImpl.this.f25283a.a(ve.Z7)).booleanValue() || this.f25294a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f25283a.j().a(this.f25294a, e.c.SHOW);
                MediationServiceImpl.this.f25283a.D().c(ca.f23242f);
                MediationServiceImpl.this.f25283a.D().c(ca.f23245i);
                if (!maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f25283a.p().b(this.f25294a, "DID_DISPLAY");
                    gc.c(this.f25295b, maxAd);
                    return;
                }
                ie ieVar = (ie) maxAd;
                if (ieVar.s0()) {
                    MediationServiceImpl.this.f25283a.p().b(this.f25294a, "DID_DISPLAY");
                    MediationServiceImpl.this.f25283a.C().a(this.f25294a);
                    gc.c(this.f25295b, maxAd);
                } else {
                    com.applovin.impl.sdk.n unused2 = MediationServiceImpl.this.f25284b;
                    if (com.applovin.impl.sdk.n.a()) {
                        MediationServiceImpl.this.f25284b.k("MediationService", "Received ad display callback before attempting show".concat(ieVar.a0() ? " for hybrid ad" : ""));
                    }
                }
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f25294a.a(bundle);
            gc.d(this.f25295b, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.f25294a.a(bundle);
            MediationServiceImpl.this.f25283a.E().a(la.A, this.f25294a);
            MediationServiceImpl.this.f25283a.j().a(this.f25294a, e.c.HIDE);
            MediationServiceImpl.this.f25283a.p().b((ge) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new t(1, this, maxAd), maxAd instanceof ie ? ((ie) maxAd).j0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f25294a.a(bundle);
            this.f25294a.f0();
            MediationServiceImpl.this.f25283a.j().a(this.f25294a, e.c.LOAD);
            MediationServiceImpl.this.a(this.f25294a);
            gc.f(this.f25295b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f25294a.f0();
            MediationServiceImpl.this.b(this.f25294a, maxError, this.f25295b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(a.InterfaceC0085a interfaceC0085a) {
            this.f25295b = interfaceC0085a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f25283a.C().b(maxAd);
            }
            gc.e(this.f25295b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f25294a.a(bundle);
            MediationServiceImpl.this.f25283a.j().a(this.f25294a, e.c.CLICK);
            MediationServiceImpl.this.a(this.f25294a, this.f25295b);
            gc.a((MaxAdListener) this.f25295b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f25294a.a(bundle);
            MediationServiceImpl.this.a(this.f25294a, maxError, this.f25295b);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof ie)) {
                ((ie) maxAd).h0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f25294a.a(bundle);
            gc.a(this.f25295b, maxAd, maxReward);
            MediationServiceImpl.this.f25283a.j0().a((yl) new fn((ie) maxAd, MediationServiceImpl.this.f25283a), tm.b.OTHER);
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.j jVar) {
        this.f25283a = jVar;
        this.f25284b = jVar.J();
        this.f25285c = new xj(jVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, zj zjVar, Context context, yj.a aVar) {
        if (zjVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        yj b2 = this.f25285c.b(zjVar, str, maxAdFormat);
        if (b2 != null) {
            aVar.a(yj.a(b2));
            return;
        }
        g a2 = this.f25283a.M().a(zjVar, zjVar.A());
        if (a2 == null) {
            aVar.a(yj.a(zjVar, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        if (((Boolean) this.f25283a.a(ve.Y7)).booleanValue()) {
            a(str, maxAdFormat, zjVar, context, aVar, a2);
            return;
        }
        Activity n02 = context instanceof Activity ? (Activity) context : this.f25283a.n0();
        MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(zjVar, str, maxAdFormat);
        if (zjVar.z()) {
            this.f25283a.L().b(zjVar, n02);
        }
        a aVar2 = new a(a2, str, SystemClock.elapsedRealtime(), zjVar, maxAdFormat, aVar);
        if (!zjVar.v()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25284b.a("MediationService", "Collecting signal for adapter: " + a2.g());
            }
            a2.a(a3, zjVar, n02, aVar2);
            return;
        }
        if (this.f25283a.L().b(zjVar)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25284b.a("MediationService", "Collecting signal for now-initialized adapter: " + a2.g());
            }
            a2.a(a3, zjVar, n02, aVar2);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.b("MediationService", "Skip collecting signal for not-initialized adapter: " + a2.g());
        }
        aVar.a(yj.a(zjVar, new MaxErrorImpl("Adapter not initialized yet")));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof ge) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25284b.d("MediationService", "Destroying " + maxAd);
            }
            ge geVar = (ge) maxAd;
            g A = geVar.A();
            if (A != null) {
                A.a();
                geVar.t();
            }
            this.f25283a.h().c(geVar.S());
            this.f25283a.j().a(geVar, e.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.d.getAndSet(null);
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, d.b bVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0085a interfaceC0085a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0085a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f25283a.O())) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
        }
        if (!this.f25283a.u0()) {
            com.applovin.impl.sdk.n.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> initializationAdUnitIds = this.f25283a.z0().get() ? this.f25283a.g0().getInitializationAdUnitIds() : this.f25283a.H() != null ? this.f25283a.H().getAdUnitIds() : null;
        boolean startsWith = str.startsWith("test_mode");
        if (initializationAdUnitIds != null && initializationAdUnitIds.size() > 0 && !initializationAdUnitIds.contains(str) && !startsWith) {
            if (yp.c(this.f25283a)) {
                String A = androidx.compose.foundation.text.input.a.A("Ad Unit ID ", str, " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow");
                if (((Boolean) this.f25283a.a(sj.t6)).booleanValue()) {
                    throw new RuntimeException(A);
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25284b.b("MediationService", A);
                }
            }
            this.f25283a.E().a(la.L, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id".concat(str));
        }
        this.f25283a.c();
        if (str.length() != 16 && !startsWith && !this.f25283a.b0().startsWith("05TMD")) {
            StringBuilder v2 = android.support.v4.media.d.v("Please double-check the ad unit ", str, " for ");
            v2.append(maxAdFormat.getLabel());
            v2.append(" : ");
            v2.append(Log.getStackTraceString(new Throwable("")));
            com.applovin.impl.sdk.n.h("MediationService", v2.toString());
        }
        if (!this.f25283a.a(maxAdFormat)) {
            this.f25283a.S0();
            gc.a((MaxAdRequestListener) interfaceC0085a, str, true);
            this.f25283a.K().a(str, str2, maxAdFormat, bVar, map, map2, context, interfaceC0085a);
        } else {
            com.applovin.impl.sdk.n.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            gc.a(interfaceC0085a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
        }
    }

    public void loadThirdPartyMediatedAd(String str, ge geVar, boolean z2, Activity activity, a.InterfaceC0085a interfaceC0085a) {
        fi fiVar;
        if (geVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.a("MediationService", "Loading " + geVar + "...");
        }
        if (!z2) {
            this.f25283a.E().a(la.f25023u, geVar);
            this.f25283a.p().b(geVar, "WILL_LOAD");
        }
        g a2 = this.f25283a.M().a(geVar);
        if (a2 == null) {
            String str2 = "Failed to load " + geVar + ": adapter not loaded";
            com.applovin.impl.sdk.n.h("MediationService", str2);
            b(geVar, new MaxErrorImpl(-5001, str2), interfaceC0085a);
            return;
        }
        MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(geVar);
        if (geVar.d0()) {
            fiVar = this.f25283a.L().a(geVar, activity);
        } else {
            if (geVar.e0()) {
                this.f25283a.L().b(geVar, activity);
            }
            fiVar = null;
        }
        ge a4 = geVar.a(a2);
        a2.a(str, a4);
        a4.g0();
        if (fiVar == null) {
            a2.a(str, a3, a4, activity, new d(a4, interfaceC0085a));
        } else {
            fiVar.a((fi.a) new i(this, geVar, interfaceC0085a, 0));
            fiVar.a((Runnable) new h(this, a2, str, a3, a4, activity, interfaceC0085a));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, @Nullable Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object a2 = this.f25283a.C().a();
            if (a2 instanceof ge) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (ge) a2, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, ge geVar) {
        a(maxError, geVar, false);
    }

    public void processAdapterInitializationPostback(pe peVar, long j2, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j2));
        a("minit", hashMap, new MaxErrorImpl(str), peVar);
        Map a2 = ma.a(peVar);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), a2);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j2), a2);
        switch (c.f25293a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f25283a.E().a(la.f25016n, a2);
                return;
            case 4:
                this.f25283a.E().a(la.f25017o, a2);
                return;
            case 5:
            case 6:
                this.f25283a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25283a.J().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f25283a.E().a(la.d, "adapterNotInitializedForPostback", a2);
                return;
            default:
                return;
        }
    }

    public void processCallbackAdImpressionPostback(ge geVar, a.InterfaceC0085a interfaceC0085a) {
        if (geVar.Q().endsWith("cimp")) {
            this.f25283a.p().b(geVar);
            gc.a((MaxAdRevenueListener) interfaceC0085a, (MaxAd) geVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f25283a.q0().c());
        if (!((Boolean) this.f25283a.a(sj.Y3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", hashMap, geVar);
        this.f25283a.E().a(la.f25025y, geVar);
    }

    public void processRawAdImpression(ge geVar, a.InterfaceC0085a interfaceC0085a) {
        this.f25283a.p().b(geVar, "WILL_DISPLAY");
        if (geVar.Q().endsWith("mimp")) {
            this.f25283a.p().b(geVar);
            gc.a((MaxAdRevenueListener) interfaceC0085a, (MaxAd) geVar);
        }
        if (((Boolean) this.f25283a.a(sj.Q4)).booleanValue()) {
            this.f25283a.R().a(we.d, xe.a(geVar), Long.valueOf(System.currentTimeMillis() - this.f25283a.I()));
        }
        HashMap hashMap = new HashMap(2);
        if (geVar instanceof ie) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((ie) geVar).n0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.f25283a.q0().c());
        if (!((Boolean) this.f25283a.a(sj.Y3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", hashMap, geVar);
    }

    public void processViewabilityAdImpressionPostback(ne neVar, long j2, a.InterfaceC0085a interfaceC0085a) {
        if (neVar.Q().endsWith("vimp")) {
            this.f25283a.p().b(neVar);
            gc.a((MaxAdRevenueListener) interfaceC0085a, (MaxAd) neVar);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j2));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(neVar.o0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.f25283a.q0().c());
        if (!((Boolean) this.f25283a.a(sj.Y3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", hashMap, neVar);
    }

    public void processWaterfallInfoPostback(String str, MaxAdFormat maxAdFormat, MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, @Nullable MaxError maxError, long j2, long j3) {
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j3), hashMap);
        if (maxError != null) {
            hashMap.putAll(ma.a(maxError));
        }
        this.f25283a.E().a(la.x, (Map) hashMap);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap hashMap2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap2);
        CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), hashMap2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j3), hashMap2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j2), hashMap2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), hashMap2);
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap hashMap3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), hashMap3);
            hashMap3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), hashMap3);
            hashMap3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                hashMap4.put("error_message", maxErrorImpl.getMessage());
                hashMap4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                hashMap4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                hashMap3.put("error_info", hashMap4);
            }
            arrayList.add(hashMap3);
        }
        hashMap2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, hashMap2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.d.set(jSONObject);
    }

    public void showFullscreenAd(ie ieVar, Activity activity, a.InterfaceC0085a interfaceC0085a) {
        if (ieVar != null) {
            if (activity == null && MaxAdFormat.APP_OPEN != ieVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            }
            this.f25283a.C().a(true);
            g b2 = b(ieVar);
            long p02 = ieVar.p0();
            if (com.applovin.impl.sdk.n.a()) {
                this.f25284b.d("MediationService", "Showing ad " + ieVar.getAdUnitId() + " with delay of " + p02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new iu(this, ieVar, b2, activity, interfaceC0085a, 1), p02);
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ge geVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, geVar);
        destroyAd(geVar);
        gc.a(maxAdListener, geVar.getAdUnitId(), maxError);
    }

    private void a(final String str, final MaxAdFormat maxAdFormat, final zj zjVar, Context context, final yj.a aVar, final g gVar) {
        fi fiVar = new fi();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        fiVar.a(new fi.b() { // from class: com.applovin.impl.mediation.j
            @Override // com.applovin.impl.fi.b
            public final void a(boolean z2, Object obj, Object obj2) {
                MediationServiceImpl.this.a(elapsedRealtime, gVar, str, zjVar, maxAdFormat, aVar, z2, (String) obj, (MaxError) obj2);
            }
        });
        an.a(zjVar.m(), fiVar, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + zjVar.c() + ") timed out collecting signal"), "MediationService", this.f25283a);
        b bVar = new b(fiVar);
        Activity n02 = context instanceof Activity ? (Activity) context : this.f25283a.n0();
        MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.a(zjVar, str, maxAdFormat);
        if (zjVar.v()) {
            fi a3 = this.f25283a.L().a(zjVar, n02);
            a3.a((Runnable) new h(this, fiVar, gVar, a2, zjVar, n02, bVar, 2));
            a3.a((fi.a) new i(this, gVar, fiVar, 1));
            return;
        }
        if (zjVar.w()) {
            fi a4 = this.f25283a.L().a(zjVar, n02);
            if (a4.d() && !zjVar.y()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25284b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + gVar.g());
                }
                fiVar.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) a4.a())));
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.a("MediationService", "Collecting signal for adapter: " + gVar.g());
        }
        gVar.a(a2, zjVar, n02, bVar);
    }

    private g b(ie ieVar) {
        g A = ieVar.A();
        if (A != null) {
            return A;
        }
        this.f25283a.C().a(false);
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.k("MediationService", "Failed to show " + ieVar + ": adapter not found");
        }
        com.applovin.impl.sdk.n.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + ieVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    public void showFullscreenAd(ie ieVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.InterfaceC0085a interfaceC0085a) {
        if (ieVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f25283a.C().a(true);
            g b2 = b(ieVar);
            long p02 = ieVar.p0();
            if (com.applovin.impl.sdk.n.a()) {
                this.f25284b.d("MediationService", "Showing ad " + ieVar.getAdUnitId() + " with delay of " + p02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new h(this, ieVar, b2, viewGroup, lifecycle, activity, interfaceC0085a, 0), p02);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void a(ie ieVar, a.InterfaceC0085a interfaceC0085a) {
        this.f25283a.C().a(false);
        a(ieVar, (MaxAdListener) interfaceC0085a);
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(ieVar, interfaceC0085a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j2, g gVar, String str, zj zjVar, MaxAdFormat maxAdFormat, yj.a aVar, boolean z2, String str2, MaxError maxError) {
        yj a2;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        if (z2) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25284b.a("MediationService", "Signal collection successful from: " + gVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
            }
            a2 = yj.a(zjVar, gVar, str2, j2, elapsedRealtime);
            this.f25285c.a(a2, zjVar, str, maxAdFormat);
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, zjVar.c(), hashMap);
            CollectionUtils.putStringIfValid("adapter_class", zjVar.b(), hashMap);
            CollectionUtils.putStringIfValid("adapter_version", gVar.b(), hashMap);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(elapsedRealtime), hashMap);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
            this.f25283a.E().a(la.f25018p, (Map) hashMap);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25284b.b("MediationService", "Signal collection failed from: " + gVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            a2 = yj.a(zjVar, gVar, maxError, j2, elapsedRealtime);
            a(a2, zjVar, gVar);
        }
        aVar.a(a2);
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(fi fiVar, g gVar, MaxAdapterParametersImpl maxAdapterParametersImpl, zj zjVar, Activity activity, g.c cVar) {
        if (fiVar.c()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.a("MediationService", "Collecting signal for now-initialized adapter: " + gVar.g());
        }
        gVar.a(maxAdapterParametersImpl, zjVar, activity, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g gVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, ge geVar, Activity activity, a.InterfaceC0085a interfaceC0085a) {
        gVar.a(str, maxAdapterParametersImpl, geVar, activity, new d(geVar, interfaceC0085a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ie ieVar, Long l2, MaxAdListener maxAdListener) {
        if (ieVar.u().get()) {
            return;
        }
        String str = "Ad (" + ieVar.k() + ") has not been displayed after " + l2 + "ms. Failing ad display...";
        com.applovin.impl.sdk.n.h("MediationService", str);
        a(ieVar, new MaxErrorImpl(-1, str), maxAdListener);
        this.f25283a.C().b(ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ie ieVar, g gVar, Activity activity, a.InterfaceC0085a interfaceC0085a) {
        ieVar.a(true);
        a(ieVar);
        gVar.c(ieVar, activity);
        a(ieVar, interfaceC0085a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ie ieVar, g gVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.InterfaceC0085a interfaceC0085a) {
        ieVar.a(true);
        a(ieVar);
        gVar.a(ieVar, viewGroup, lifecycle, activity);
        a(ieVar, interfaceC0085a);
    }

    private void a(ie ieVar, MaxAdListener maxAdListener) {
        Long l2 = (Long) this.f25283a.a(ve.v7);
        if (l2.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new s(this, ieVar, l2, maxAdListener, 2), l2.longValue());
    }

    private void a(ie ieVar) {
        if (ieVar.getFormat() == MaxAdFormat.REWARDED || ieVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f25283a.j0().a((yl) new ln(ieVar, this.f25283a), tm.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ge geVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f25283a.j().a(geVar, e.c.SHOW_ERROR);
        this.f25283a.p().b(geVar, "DID_FAIL_DISPLAY");
        a(maxError, geVar, true);
        if (geVar.u().compareAndSet(false, true)) {
            gc.a(maxAdListener, geVar, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ge geVar, a.InterfaceC0085a interfaceC0085a) {
        this.f25283a.p().b(geVar, "DID_CLICKED");
        this.f25283a.p().b(geVar, "DID_CLICK");
        if (geVar.Q().endsWith("click")) {
            this.f25283a.p().b(geVar);
            gc.a((MaxAdRevenueListener) interfaceC0085a, (MaxAd) geVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f25283a.q0().c());
        if (!((Boolean) this.f25283a.a(sj.Y3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", hashMap, geVar);
    }

    private void a(MaxError maxError, ge geVar, boolean z2) {
        a("mierr", Collections.EMPTY_MAP, maxError, geVar, z2);
        if (!z2 || geVar == null) {
            return;
        }
        this.f25283a.E().a(la.f25026z, geVar, maxError);
    }

    private void a(MaxError maxError, ge geVar) {
        HashMap hashMap = new HashMap(3);
        long G = geVar.G();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(G));
        if (geVar.getFormat().isFullscreenAd()) {
            m.a b2 = this.f25283a.C().b(geVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
        }
        a("mlerr", hashMap, maxError, geVar);
        Map a2 = ma.a(geVar);
        a2.putAll(ma.a(maxError));
        a2.put("duration_ms", String.valueOf(G));
        this.f25283a.E().a(la.w, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ge geVar) {
        this.f25283a.p().b(geVar, "DID_LOAD");
        if (geVar.Q().endsWith("load")) {
            this.f25283a.p().b(geVar);
        }
        HashMap hashMap = new HashMap(3);
        long G = geVar.G();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(G));
        if (geVar.getFormat().isFullscreenAd()) {
            m.a b2 = this.f25283a.C().b(geVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
        }
        a("load", hashMap, geVar);
        Map a2 = ma.a(geVar);
        a2.put("duration_ms", String.valueOf(G));
        this.f25283a.E().a(la.f25024v, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(yj yjVar, zj zjVar, g gVar) {
        long b2 = yjVar.b();
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(b2));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.i(), hashMap);
        a("serr", hashMap, yjVar.c(), zjVar);
        HashMap hashMap2 = new HashMap();
        CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, zjVar.c(), hashMap2);
        CollectionUtils.putStringIfValid("adapter_class", zjVar.b(), hashMap2);
        CollectionUtils.putStringIfValid("adapter_version", gVar.b(), hashMap2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(b2), hashMap2);
        this.f25283a.E().a(la.f25019q, (Map) hashMap2);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, pe peVar, boolean z2) {
        this.f25283a.j0().a((yl) new rm(str, list, map, map2, maxError, peVar, this.f25283a, z2), tm.b.OTHER);
    }

    private void a(String str, Map map, pe peVar) {
        a(str, map, (MaxError) null, peVar);
    }

    private void a(String str, Map map, MaxError maxError, pe peVar) {
        a(str, map, maxError, peVar, true);
    }

    private void a(String str, Map map, MaxError maxError, pe peVar, boolean z2) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z2 ? StringUtils.emptyIfNull(peVar.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z2 ? StringUtils.emptyIfNull(peVar.e()) : "");
        if (peVar instanceof ge) {
            map2.put("{CREATIVE_ID}", z2 ? StringUtils.emptyIfNull(((ge) peVar).getCreativeId()) : "");
        }
        a(str, null, map2, null, maxError, peVar, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ge geVar, a.InterfaceC0085a interfaceC0085a, String str) {
        String str2 = "Failed to load " + geVar + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.k("MediationService", str2);
        }
        b(geVar, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0085a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g gVar, fi fiVar, String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25284b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + gVar.g());
        }
        fiVar.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, androidx.compose.ui.platform.j.b("Could not initialize adapter: ", str)));
    }
}
