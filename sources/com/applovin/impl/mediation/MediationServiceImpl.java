package com.applovin.impl.mediation;

import Q7.n0;
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
import androidx.lifecycle.AbstractC0505o;
import com.applovin.impl.aa;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.gn;
import com.applovin.impl.ie;
import com.applovin.impl.ke;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.g;
import com.applovin.impl.mn;
import com.applovin.impl.oj;
import com.applovin.impl.qe;
import com.applovin.impl.qm;
import com.applovin.impl.re;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.q;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.impl.sm;
import com.applovin.impl.uj;
import com.applovin.impl.vj;
import com.applovin.impl.wj;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8948a;
    private final t b;

    /* renamed from: c, reason: collision with root package name */
    private final uj f8949c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f8950d = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements g.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f8951a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8952c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ wj f8953d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f8954e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ vj.a f8955f;

        public a(g gVar, String str, long j7, wj wjVar, MaxAdFormat maxAdFormat, vj.a aVar) {
            this.f8951a = gVar;
            this.b = str;
            this.f8952c = j7;
            this.f8953d = wjVar;
            this.f8954e = maxAdFormat;
            this.f8955f = aVar;
        }

        @Override // com.applovin.impl.mediation.g.b
        public void a(MaxError maxError) {
            t unused = MediationServiceImpl.this.b;
            if (t.a()) {
                MediationServiceImpl.this.b.b("MediationService", "Signal collection failed from: " + this.f8951a.g() + " for Ad Unit ID: " + this.b + " with error message: \"" + maxError.getMessage() + "\"");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = this.f8952c;
            vj a6 = vj.a(this.f8953d, this.f8951a, maxError, j7, elapsedRealtime - j7);
            MediationServiceImpl.this.a(a6, this.f8953d, this.f8951a);
            this.f8955f.a(a6);
            this.f8951a.a();
        }

        @Override // com.applovin.impl.mediation.g.b
        public void onSignalCollected(String str) {
            t unused = MediationServiceImpl.this.b;
            if (t.a()) {
                t tVar = MediationServiceImpl.this.b;
                StringBuilder sb = new StringBuilder("Signal collection successful from: ");
                sb.append(this.f8951a.g());
                sb.append(" for Ad Unit ID: ");
                tVar.a("MediationService", n0.m(sb, this.b, " with signal: \"", str, "\""));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = this.f8952c;
            vj a6 = vj.a(this.f8953d, this.f8951a, str, j7, elapsedRealtime - j7);
            MediationServiceImpl.this.f8949c.a(a6, this.f8953d, this.b, this.f8954e);
            this.f8955f.a(a6);
            this.f8951a.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0023a {

        /* renamed from: a, reason: collision with root package name */
        private final be f8957a;
        private a.InterfaceC0023a b;

        public b(be beVar, a.InterfaceC0023a interfaceC0023a) {
            this.f8957a = beVar;
            this.b = interfaceC0023a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f8957a.a(bundle);
            bc.b(this.b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            String str;
            this.f8957a.a(bundle);
            t unused = MediationServiceImpl.this.b;
            if (t.a()) {
                MediationServiceImpl.this.b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f8957a, this.b);
            MediationServiceImpl.this.f8948a.F().c(aa.f6598f);
            MediationServiceImpl.this.f8948a.F().c(aa.f6601i);
            if (maxAd.getFormat().isFullscreenAd()) {
                de deVar = (de) maxAd;
                if (!deVar.n0()) {
                    t unused2 = MediationServiceImpl.this.b;
                    if (t.a()) {
                        t tVar = MediationServiceImpl.this.b;
                        if (deVar.X()) {
                            str = " for hybrid ad";
                        } else {
                            str = "";
                        }
                        tVar.k("MediationService", "Received ad display callback before attempting show".concat(str));
                        return;
                    }
                    return;
                }
                MediationServiceImpl.this.f8948a.o().b(this.f8957a, "DID_DISPLAY");
                MediationServiceImpl.this.f8948a.E().a(this.f8957a);
                bc.c(this.b, maxAd);
                return;
            }
            MediationServiceImpl.this.f8948a.o().b(this.f8957a, "DID_DISPLAY");
            bc.c(this.b, maxAd);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f8957a.a(bundle);
            bc.d(this.b, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            long j7;
            this.f8957a.a(bundle);
            MediationServiceImpl.this.f8948a.o().b((be) maxAd, "DID_HIDE");
            if (maxAd instanceof de) {
                j7 = ((de) maxAd).e0();
            } else {
                j7 = 0;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new p(1, this, maxAd), j7);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f8957a.a(bundle);
            this.f8957a.a0();
            MediationServiceImpl.this.a(this.f8957a);
            bc.f(this.b, maxAd);
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
            this.f8957a.a0();
            MediationServiceImpl.this.b(this.f8957a, maxError, this.b);
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
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            bc.g(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            bc.h(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(a.InterfaceC0023a interfaceC0023a) {
            this.b = interfaceC0023a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f8948a.E().b(maxAd);
            }
            bc.e(this.b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f8957a.a(bundle);
            MediationServiceImpl.this.a(this.f8957a, this.b);
            bc.a((MaxAdListener) this.b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f8957a.a(bundle);
            MediationServiceImpl.this.a(this.f8957a, maxError, this.b);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof de)) {
                ((de) maxAd).c0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f8957a.a(bundle);
            bc.a(this.b, maxAd, maxReward);
            MediationServiceImpl.this.f8948a.l0().a((xl) new gn((de) maxAd, MediationServiceImpl.this.f8948a), sm.b.OTHER);
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.k kVar) {
        this.f8948a = kVar;
        this.b = kVar.L();
        this.f8949c = new uj(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, wj wjVar, Context context, vj.a aVar) {
        Activity p02;
        if (wjVar != null) {
            if (context != null) {
                if (aVar != null) {
                    vj b8 = this.f8949c.b(wjVar, str, maxAdFormat);
                    if (b8 != null) {
                        aVar.a(vj.a(b8));
                        return;
                    }
                    g a6 = this.f8948a.O().a(wjVar, wjVar.w());
                    if (a6 != null) {
                        if (context instanceof Activity) {
                            p02 = (Activity) context;
                        } else {
                            p02 = this.f8948a.p0();
                        }
                        Activity activity = p02;
                        MaxAdapterParametersImpl a9 = MaxAdapterParametersImpl.a(wjVar, str, maxAdFormat);
                        if (wjVar.u()) {
                            this.f8948a.N().a(wjVar, activity);
                        }
                        a aVar2 = new a(a6, str, SystemClock.elapsedRealtime(), wjVar, maxAdFormat, aVar);
                        if (wjVar.v()) {
                            if (this.f8948a.N().a(wjVar)) {
                                if (t.a()) {
                                    this.b.a("MediationService", "Collecting signal for now-initialized adapter: " + a6.g());
                                }
                                a6.a(a9, wjVar, activity, aVar2);
                                return;
                            }
                            if (t.a()) {
                                this.b.b("MediationService", "Skip collecting signal for not-initialized adapter: " + a6.g());
                            }
                            aVar.a(vj.a(wjVar, new MaxErrorImpl("Adapter not initialized yet")));
                            return;
                        }
                        if (t.a()) {
                            this.b.a("MediationService", "Collecting signal for adapter: " + a6.g());
                        }
                        a6.a(a9, wjVar, activity, aVar2);
                        return;
                    }
                    aVar.a(vj.a(wjVar, new MaxErrorImpl("Could not load adapter")));
                    return;
                }
                throw new IllegalArgumentException("No callback specified");
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public void destroyAd(MaxAd maxAd) {
        if (!(maxAd instanceof be)) {
            return;
        }
        if (t.a()) {
            this.b.d("MediationService", "Destroying " + maxAd);
        }
        be beVar = (be) maxAd;
        g z8 = beVar.z();
        if (z8 != null) {
            z8.a();
            beVar.s();
        }
        this.f8948a.h().c(beVar.Q());
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f8950d.getAndSet(null);
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, d.b bVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0023a interfaceC0023a) {
        List<String> list;
        if (!TextUtils.isEmpty(str)) {
            if (context != null) {
                if (interfaceC0023a != null) {
                    if (TextUtils.isEmpty(this.f8948a.Q())) {
                        t.h("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
                    }
                    if (!this.f8948a.y0()) {
                        t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
                    }
                    if (this.f8948a.C0().get()) {
                        list = this.f8948a.g0().getInitializationAdUnitIds();
                    } else if (this.f8948a.I() != null) {
                        list = this.f8948a.I().getAdUnitIds();
                    } else {
                        list = null;
                    }
                    boolean startsWith = str.startsWith("test_mode");
                    if (list != null && list.size() > 0 && !list.contains(str) && !startsWith) {
                        if (zp.c(this.f8948a)) {
                            String e4 = AbstractC2914a.e("Ad Unit ID ", str, " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow");
                            if (!((Boolean) this.f8948a.a(oj.f9828p6)).booleanValue()) {
                                if (t.a()) {
                                    this.b.b("MediationService", e4);
                                }
                            } else {
                                throw new RuntimeException(e4);
                            }
                        }
                        this.f8948a.B().a(o.b.INTEGRATION_ERROR, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id".concat(str));
                    }
                    this.f8948a.c();
                    if (str.length() != 16 && !startsWith && !this.f8948a.d0().startsWith("05TMD")) {
                        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Please double-check the ad unit ", str, " for ");
                        n2.append(maxAdFormat.getLabel());
                        n2.append(" : ");
                        n2.append(Log.getStackTraceString(new Throwable("")));
                        t.h("MediationService", n2.toString());
                    }
                    if (this.f8948a.a(maxAdFormat)) {
                        t.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                        bc.a(interfaceC0023a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                        return;
                    }
                    this.f8948a.V0();
                    bc.a((MaxAdRequestListener) interfaceC0023a, str, true);
                    this.f8948a.M().a(str, str2, maxAdFormat, bVar, map, map2, context, interfaceC0023a);
                    return;
                }
                throw new IllegalArgumentException("No listener specified");
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No Ad Unit ID specified");
    }

    public void loadThirdPartyMediatedAd(String str, be beVar, Activity activity, a.InterfaceC0023a interfaceC0023a) {
        if (beVar != null) {
            if (t.a()) {
                this.b.a("MediationService", "Loading " + beVar + "...");
            }
            this.f8948a.o().b(beVar, "WILL_LOAD");
            g a6 = this.f8948a.O().a(beVar);
            if (a6 != null) {
                MaxAdapterParametersImpl a9 = MaxAdapterParametersImpl.a(beVar);
                this.f8948a.N().a(beVar, activity);
                be a10 = beVar.a(a6);
                a6.a(str, a10);
                a10.b0();
                a6.a(str, a9, a10, activity, new b(a10, interfaceC0023a));
                return;
            }
            String str2 = "Failed to load " + beVar + ": adapter not loaded";
            t.h("MediationService", str2);
            b(beVar, new MaxErrorImpl(-5001, str2), interfaceC0023a);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, @Nullable Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object a6 = this.f8948a.E().a();
            if (a6 instanceof be) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (be) a6, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, be beVar) {
        a(maxError, beVar, false);
    }

    public void processAdapterInitializationPostback(ke keVar, long j7, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j7));
        a("minit", hashMap, new MaxErrorImpl(str), keVar);
    }

    public void processCallbackAdImpressionPostback(be beVar, a.InterfaceC0023a interfaceC0023a) {
        if (beVar.O().endsWith("cimp")) {
            this.f8948a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) beVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f8948a.t0().c());
        if (!((Boolean) this.f8948a.a(oj.f9666R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", hashMap, beVar);
    }

    public void processRawAdImpression(be beVar, a.InterfaceC0023a interfaceC0023a) {
        this.f8948a.o().b(beVar, "WILL_DISPLAY");
        if (beVar.O().endsWith("mimp")) {
            this.f8948a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) beVar);
        }
        if (((Boolean) this.f8948a.a(oj.f9634M4)).booleanValue()) {
            this.f8948a.T().a(re.f10489d, se.a(beVar), Long.valueOf(System.currentTimeMillis() - this.f8948a.J()));
        }
        HashMap hashMap = new HashMap(2);
        if (beVar instanceof de) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((de) beVar).i0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.f8948a.t0().c());
        if (!((Boolean) this.f8948a.a(oj.f9666R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", hashMap, beVar);
    }

    public void processViewabilityAdImpressionPostback(ie ieVar, long j7, a.InterfaceC0023a interfaceC0023a) {
        if (ieVar.O().endsWith("vimp")) {
            this.f8948a.o().b(ieVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) ieVar);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j7));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(ieVar.j0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.f8948a.t0().c());
        if (!((Boolean) this.f8948a.a(oj.f9666R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", hashMap, ieVar);
    }

    public void processWaterfallInfoPostback(String str, MaxAdFormat maxAdFormat, MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, long j7, long j9) {
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap hashMap = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), hashMap);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j9), hashMap);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j7), hashMap);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), hashMap);
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap hashMap2 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), hashMap2);
            hashMap2.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), hashMap2);
            hashMap2.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                hashMap3.put("error_message", maxErrorImpl.getMessage());
                hashMap3.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                hashMap3.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                hashMap2.put("error_info", hashMap3);
            }
            arrayList.add(hashMap2);
        }
        hashMap.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, hashMap, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f8950d.set(jSONObject);
    }

    public void showFullscreenAd(de deVar, Activity activity, a.InterfaceC0023a interfaceC0023a) {
        if (deVar != null) {
            if (activity == null && MaxAdFormat.APP_OPEN != deVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            }
            this.f8948a.E().a(true);
            g b8 = b(deVar);
            long k02 = deVar.k0();
            if (t.a()) {
                this.b.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + k02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new R2.a(this, deVar, b8, activity, interfaceC0023a, 1), k02);
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, beVar);
        destroyAd(beVar);
        bc.a(maxAdListener, beVar.getAdUnitId(), maxError);
    }

    private void a(de deVar, a.InterfaceC0023a interfaceC0023a) {
        this.f8948a.E().a(false);
        a(deVar, (MaxAdListener) interfaceC0023a);
        if (t.a()) {
            this.b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(deVar, interfaceC0023a);
    }

    private g b(de deVar) {
        g z8 = deVar.z();
        if (z8 != null) {
            return z8;
        }
        this.f8948a.E().a(false);
        if (t.a()) {
            this.b.k("MediationService", "Failed to show " + deVar + ": adapter not found");
        }
        t.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + deVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    public void showFullscreenAd(final de deVar, final ViewGroup viewGroup, final AbstractC0505o abstractC0505o, final Activity activity, final a.InterfaceC0023a interfaceC0023a) {
        if (deVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f8948a.E().a(true);
            final g b8 = b(deVar);
            long k02 = deVar.k0();
            if (t.a()) {
                this.b.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + k02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.h
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(deVar, b8, viewGroup, abstractC0505o, activity, interfaceC0023a);
                }
            }, k02);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, Long l, MaxAdListener maxAdListener) {
        if (deVar.t().get()) {
            return;
        }
        String str = "Ad (" + deVar.k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        t.h("MediationService", str);
        a(deVar, new MaxErrorImpl(-1, str), maxAdListener);
        this.f8948a.E().b(deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, g gVar, Activity activity, a.InterfaceC0023a interfaceC0023a) {
        deVar.a(true);
        a(deVar);
        gVar.c(deVar, activity);
        a(deVar, interfaceC0023a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(de deVar, g gVar, ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity, a.InterfaceC0023a interfaceC0023a) {
        deVar.a(true);
        a(deVar);
        gVar.a(deVar, viewGroup, abstractC0505o, activity);
        a(deVar, interfaceC0023a);
    }

    private void a(de deVar, MaxAdListener maxAdListener) {
        Long l = (Long) this.f8948a.a(qe.f10332n7);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new q(this, deVar, l, maxAdListener), l.longValue());
    }

    private void a(de deVar) {
        if (deVar.getFormat() == MaxAdFormat.REWARDED || deVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f8948a.l0().a((xl) new mn(deVar, this.f8948a), sm.b.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f8948a.o().b(beVar, "DID_FAIL_DISPLAY");
        a(maxError, beVar, true);
        if (beVar.t().compareAndSet(false, true)) {
            bc.a(maxAdListener, beVar, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar, a.InterfaceC0023a interfaceC0023a) {
        this.f8948a.o().b(beVar, "DID_CLICKED");
        this.f8948a.o().b(beVar, "DID_CLICK");
        if (beVar.O().endsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
            this.f8948a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) beVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f8948a.t0().c());
        if (!((Boolean) this.f8948a.a(oj.f9666R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", hashMap, beVar);
    }

    private void a(MaxError maxError, be beVar, boolean z8) {
        a("mierr", Collections.EMPTY_MAP, maxError, beVar, z8);
    }

    private void a(MaxError maxError, be beVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a b8 = this.f8948a.E().b(beVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b8.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b8.b()));
        }
        a("mlerr", hashMap, maxError, beVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(be beVar) {
        this.f8948a.o().b(beVar, "DID_LOAD");
        if (beVar.O().endsWith("load")) {
            this.f8948a.o().b(beVar);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a b8 = this.f8948a.E().b(beVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b8.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b8.b()));
        }
        a("load", hashMap, beVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(vj vjVar, wj wjVar, g gVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(vjVar.b()));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.i(), hashMap);
        a("serr", hashMap, vjVar.c(), wjVar);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, boolean z8) {
        this.f8948a.l0().a((xl) new qm(str, list, map, map2, maxError, keVar, this.f8948a, z8), sm.b.OTHER);
    }

    private void a(String str, Map map, ke keVar) {
        a(str, map, (MaxError) null, keVar);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar) {
        a(str, map, maxError, keVar, true);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar, boolean z8) {
        String str2;
        Map map2 = CollectionUtils.map(map);
        String str3 = "";
        map2.put("{PLACEMENT}", z8 ? StringUtils.emptyIfNull(keVar.getPlacement()) : "");
        if (!z8) {
            str2 = "";
        } else {
            str2 = StringUtils.emptyIfNull(keVar.e());
        }
        map2.put("{CUSTOM_DATA}", str2);
        if (keVar instanceof be) {
            be beVar = (be) keVar;
            if (z8) {
                str3 = StringUtils.emptyIfNull(beVar.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", str3);
        }
        a(str, null, map2, null, maxError, keVar, z8);
    }
}
