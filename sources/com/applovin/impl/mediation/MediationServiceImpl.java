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

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final t f5991b;

    /* renamed from: c */
    private final uj f5992c;

    /* renamed from: d */
    private final AtomicReference f5993d = new AtomicReference();

    /* loaded from: classes.dex */
    public class a implements g.b {
        final /* synthetic */ g a;

        /* renamed from: b */
        final /* synthetic */ String f5994b;

        /* renamed from: c */
        final /* synthetic */ long f5995c;

        /* renamed from: d */
        final /* synthetic */ wj f5996d;

        /* renamed from: e */
        final /* synthetic */ MaxAdFormat f5997e;

        /* renamed from: f */
        final /* synthetic */ vj.a f5998f;

        public a(g gVar, String str, long j3, wj wjVar, MaxAdFormat maxAdFormat, vj.a aVar) {
            this.a = gVar;
            this.f5994b = str;
            this.f5995c = j3;
            this.f5996d = wjVar;
            this.f5997e = maxAdFormat;
            this.f5998f = aVar;
        }

        @Override // com.applovin.impl.mediation.g.b
        public void a(MaxError maxError) {
            t unused = MediationServiceImpl.this.f5991b;
            if (t.a()) {
                MediationServiceImpl.this.f5991b.b("MediationService", "Signal collection failed from: " + this.a.g() + " for Ad Unit ID: " + this.f5994b + " with error message: \"" + maxError.getMessage() + "\"");
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.f5995c;
            vj a = vj.a(this.f5996d, this.a, maxError, j3, elapsedRealtime - j3);
            MediationServiceImpl.this.a(a, this.f5996d, this.a);
            this.f5998f.a(a);
            this.a.a();
        }

        @Override // com.applovin.impl.mediation.g.b
        public void onSignalCollected(String str) {
            t unused = MediationServiceImpl.this.f5991b;
            if (t.a()) {
                t tVar = MediationServiceImpl.this.f5991b;
                StringBuilder sb2 = new StringBuilder("Signal collection successful from: ");
                sb2.append(this.a.g());
                sb2.append(" for Ad Unit ID: ");
                tVar.a("MediationService", a4.j.k(sb2, this.f5994b, " with signal: \"", str, "\""));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.f5995c;
            vj a = vj.a(this.f5996d, this.a, str, j3, elapsedRealtime - j3);
            MediationServiceImpl.this.f5992c.a(a, this.f5996d, this.f5994b, this.f5997e);
            this.f5998f.a(a);
            this.a.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0023a {
        private final be a;

        /* renamed from: b */
        private a.InterfaceC0023a f6000b;

        public b(be beVar, a.InterfaceC0023a interfaceC0023a) {
            this.a = beVar;
            this.f6000b = interfaceC0023a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            bc.b(this.f6000b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            String str;
            this.a.a(bundle);
            t unused = MediationServiceImpl.this.f5991b;
            if (t.a()) {
                MediationServiceImpl.this.f5991b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.a, this.f6000b);
            MediationServiceImpl.this.a.F().c(aa.f3616f);
            MediationServiceImpl.this.a.F().c(aa.f3619i);
            if (maxAd.getFormat().isFullscreenAd()) {
                de deVar = (de) maxAd;
                if (!deVar.n0()) {
                    t unused2 = MediationServiceImpl.this.f5991b;
                    if (t.a()) {
                        t tVar = MediationServiceImpl.this.f5991b;
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
                MediationServiceImpl.this.a.o().b(this.a, "DID_DISPLAY");
                MediationServiceImpl.this.a.E().a(this.a);
                bc.c(this.f6000b, maxAd);
                return;
            }
            MediationServiceImpl.this.a.o().b(this.a, "DID_DISPLAY");
            bc.c(this.f6000b, maxAd);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            bc.d(this.f6000b, maxAd);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            long j3;
            this.a.a(bundle);
            MediationServiceImpl.this.a.o().b((be) maxAd, "DID_HIDE");
            if (maxAd instanceof de) {
                j3 = ((de) maxAd).e0();
            } else {
                j3 = 0;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new s(1, this, maxAd), j3);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            this.a.a0();
            MediationServiceImpl.this.a(this.a);
            bc.f(this.f6000b, maxAd);
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
            this.a.a0();
            MediationServiceImpl.this.b(this.a, maxError, this.f6000b);
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
            bc.g(this.f6000b, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            bc.h(this.f6000b, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(a.InterfaceC0023a interfaceC0023a) {
            this.f6000b = interfaceC0023a;
        }

        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.a.E().b(maxAd);
            }
            bc.e(this.f6000b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            MediationServiceImpl.this.a(this.a, this.f6000b);
            bc.a((MaxAdListener) this.f6000b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.a.a(bundle);
            MediationServiceImpl.this.a(this.a, maxError, this.f6000b);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof de)) {
                ((de) maxAd).c0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.a.a(bundle);
            bc.a(this.f6000b, maxAd, maxReward);
            MediationServiceImpl.this.a.l0().a((xl) new gn((de) maxAd, MediationServiceImpl.this.a), sm.b.OTHER);
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f5991b = kVar.L();
        this.f5992c = new uj(kVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, wj wjVar, Context context, vj.a aVar) {
        Activity p02;
        if (wjVar != null) {
            if (context != null) {
                if (aVar != null) {
                    vj b3 = this.f5992c.b(wjVar, str, maxAdFormat);
                    if (b3 != null) {
                        aVar.a(vj.a(b3));
                        return;
                    }
                    g a10 = this.a.O().a(wjVar, wjVar.w());
                    if (a10 != null) {
                        if (context instanceof Activity) {
                            p02 = (Activity) context;
                        } else {
                            p02 = this.a.p0();
                        }
                        Activity activity = p02;
                        MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(wjVar, str, maxAdFormat);
                        if (wjVar.u()) {
                            this.a.N().a(wjVar, activity);
                        }
                        a aVar2 = new a(a10, str, SystemClock.elapsedRealtime(), wjVar, maxAdFormat, aVar);
                        if (wjVar.v()) {
                            if (this.a.N().a(wjVar)) {
                                if (t.a()) {
                                    this.f5991b.a("MediationService", "Collecting signal for now-initialized adapter: " + a10.g());
                                }
                                a10.a(a11, wjVar, activity, aVar2);
                                return;
                            }
                            if (t.a()) {
                                this.f5991b.b("MediationService", "Skip collecting signal for not-initialized adapter: " + a10.g());
                            }
                            aVar.a(vj.a(wjVar, new MaxErrorImpl("Adapter not initialized yet")));
                            return;
                        }
                        if (t.a()) {
                            this.f5991b.a("MediationService", "Collecting signal for adapter: " + a10.g());
                        }
                        a10.a(a11, wjVar, activity, aVar2);
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
            this.f5991b.d("MediationService", "Destroying " + maxAd);
        }
        be beVar = (be) maxAd;
        g z10 = beVar.z();
        if (z10 != null) {
            z10.a();
            beVar.s();
        }
        this.a.h().c(beVar.Q());
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f5993d.getAndSet(null);
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, d.b bVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0023a interfaceC0023a) {
        List<String> list;
        if (!TextUtils.isEmpty(str)) {
            if (context != null) {
                if (interfaceC0023a != null) {
                    if (TextUtils.isEmpty(this.a.Q())) {
                        t.h("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
                    }
                    if (!this.a.y0()) {
                        t.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
                    }
                    if (this.a.C0().get()) {
                        list = this.a.g0().getInitializationAdUnitIds();
                    } else if (this.a.I() != null) {
                        list = this.a.I().getAdUnitIds();
                    } else {
                        list = null;
                    }
                    boolean startsWith = str.startsWith("test_mode");
                    if (list != null && list.size() > 0 && !list.contains(str) && !startsWith) {
                        if (zp.c(this.a)) {
                            String f10 = com.applovin.impl.mediation.ads.e.f("Ad Unit ID ", str, " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow");
                            if (!((Boolean) this.a.a(oj.f6734p6)).booleanValue()) {
                                if (t.a()) {
                                    this.f5991b.b("MediationService", f10);
                                }
                            } else {
                                throw new RuntimeException(f10);
                            }
                        }
                        this.a.B().a(o.b.INTEGRATION_ERROR, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id".concat(str));
                    }
                    this.a.c();
                    if (str.length() != 16 && !startsWith && !this.a.d0().startsWith("05TMD")) {
                        StringBuilder o10 = a4.j.o("Please double-check the ad unit ", str, " for ");
                        o10.append(maxAdFormat.getLabel());
                        o10.append(" : ");
                        o10.append(Log.getStackTraceString(new Throwable("")));
                        t.h("MediationService", o10.toString());
                    }
                    if (this.a.a(maxAdFormat)) {
                        t.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                        bc.a(interfaceC0023a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                        return;
                    }
                    this.a.V0();
                    bc.a((MaxAdRequestListener) interfaceC0023a, str, true);
                    this.a.M().a(str, str2, maxAdFormat, bVar, map, map2, context, interfaceC0023a);
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
                this.f5991b.a("MediationService", "Loading " + beVar + "...");
            }
            this.a.o().b(beVar, "WILL_LOAD");
            g a10 = this.a.O().a(beVar);
            if (a10 != null) {
                MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(beVar);
                this.a.N().a(beVar, activity);
                be a12 = beVar.a(a10);
                a10.a(str, a12);
                a12.b0();
                a10.a(str, a11, a12, activity, new b(a12, interfaceC0023a));
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
            Object a10 = this.a.E().a();
            if (a10 instanceof be) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (be) a10, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, be beVar) {
        a(maxError, beVar, false);
    }

    public void processAdapterInitializationPostback(ke keVar, long j3, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j3));
        a("minit", hashMap, new MaxErrorImpl(str), keVar);
    }

    public void processCallbackAdImpressionPostback(be beVar, a.InterfaceC0023a interfaceC0023a) {
        if (beVar.O().endsWith("cimp")) {
            this.a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) beVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.a.t0().c());
        if (!((Boolean) this.a.a(oj.R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", hashMap, beVar);
    }

    public void processRawAdImpression(be beVar, a.InterfaceC0023a interfaceC0023a) {
        this.a.o().b(beVar, "WILL_DISPLAY");
        if (beVar.O().endsWith("mimp")) {
            this.a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) beVar);
        }
        if (((Boolean) this.a.a(oj.M4)).booleanValue()) {
            this.a.T().a(re.f7356d, se.a(beVar), Long.valueOf(System.currentTimeMillis() - this.a.J()));
        }
        HashMap hashMap = new HashMap(2);
        if (beVar instanceof de) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((de) beVar).i0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.a.t0().c());
        if (!((Boolean) this.a.a(oj.R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", hashMap, beVar);
    }

    public void processViewabilityAdImpressionPostback(ie ieVar, long j3, a.InterfaceC0023a interfaceC0023a) {
        if (ieVar.O().endsWith("vimp")) {
            this.a.o().b(ieVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) ieVar);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j3));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(ieVar.j0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.a.t0().c());
        if (!((Boolean) this.a.a(oj.R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", hashMap, ieVar);
    }

    public void processWaterfallInfoPostback(String str, MaxAdFormat maxAdFormat, MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, long j3, long j10) {
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap hashMap = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), hashMap);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j10), hashMap);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j3), hashMap);
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
        this.f5993d.set(jSONObject);
    }

    public void showFullscreenAd(de deVar, Activity activity, a.InterfaceC0023a interfaceC0023a) {
        if (deVar != null) {
            if (activity == null && MaxAdFormat.APP_OPEN != deVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            }
            this.a.E().a(true);
            g b3 = b(deVar);
            long k02 = deVar.k0();
            if (t.a()) {
                this.f5991b.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + k02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new h(this, deVar, b3, activity, interfaceC0023a, 0), k02);
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    public void b(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, beVar);
        destroyAd(beVar);
        bc.a(maxAdListener, beVar.getAdUnitId(), maxError);
    }

    private void a(de deVar, a.InterfaceC0023a interfaceC0023a) {
        this.a.E().a(false);
        a(deVar, (MaxAdListener) interfaceC0023a);
        if (t.a()) {
            this.f5991b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(deVar, interfaceC0023a);
    }

    private g b(de deVar) {
        g z10 = deVar.z();
        if (z10 != null) {
            return z10;
        }
        this.a.E().a(false);
        if (t.a()) {
            this.f5991b.k("MediationService", "Failed to show " + deVar + ": adapter not found");
        }
        t.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + deVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    public void showFullscreenAd(final de deVar, final ViewGroup viewGroup, final androidx.lifecycle.p pVar, final Activity activity, final a.InterfaceC0023a interfaceC0023a) {
        if (deVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.a.E().a(true);
            final g b3 = b(deVar);
            long k02 = deVar.k0();
            if (t.a()) {
                this.f5991b.d("MediationService", "Showing ad " + deVar.getAdUnitId() + " with delay of " + k02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.i
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(deVar, b3, viewGroup, pVar, activity, interfaceC0023a);
                }
            }, k02);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    public /* synthetic */ void a(de deVar, Long l10, MaxAdListener maxAdListener) {
        if (deVar.t().get()) {
            return;
        }
        String str = "Ad (" + deVar.k() + ") has not been displayed after " + l10 + "ms. Failing ad display...";
        t.h("MediationService", str);
        a(deVar, new MaxErrorImpl(-1, str), maxAdListener);
        this.a.E().b(deVar);
    }

    public /* synthetic */ void a(de deVar, g gVar, Activity activity, a.InterfaceC0023a interfaceC0023a) {
        deVar.a(true);
        a(deVar);
        gVar.c(deVar, activity);
        a(deVar, interfaceC0023a);
    }

    public /* synthetic */ void a(de deVar, g gVar, ViewGroup viewGroup, androidx.lifecycle.p pVar, Activity activity, a.InterfaceC0023a interfaceC0023a) {
        deVar.a(true);
        a(deVar);
        gVar.a(deVar, viewGroup, pVar, activity);
        a(deVar, interfaceC0023a);
    }

    private void a(de deVar, MaxAdListener maxAdListener) {
        Long l10 = (Long) this.a.a(qe.f7202n7);
        if (l10.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new q(this, deVar, l10, maxAdListener), l10.longValue());
    }

    private void a(de deVar) {
        if (deVar.getFormat() == MaxAdFormat.REWARDED || deVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.a.l0().a((xl) new mn(deVar, this.a), sm.b.OTHER);
        }
    }

    public void a(be beVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.a.o().b(beVar, "DID_FAIL_DISPLAY");
        a(maxError, beVar, true);
        if (beVar.t().compareAndSet(false, true)) {
            bc.a(maxAdListener, beVar, maxError);
        }
    }

    public void a(be beVar, a.InterfaceC0023a interfaceC0023a) {
        this.a.o().b(beVar, "DID_CLICKED");
        this.a.o().b(beVar, "DID_CLICK");
        if (beVar.O().endsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
            this.a.o().b(beVar);
            bc.a((MaxAdRevenueListener) interfaceC0023a, (MaxAd) beVar);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.a.t0().c());
        if (!((Boolean) this.a.a(oj.R3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", hashMap, beVar);
    }

    private void a(MaxError maxError, be beVar, boolean z10) {
        a("mierr", Collections.EMPTY_MAP, maxError, beVar, z10);
    }

    private void a(MaxError maxError, be beVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a b3 = this.a.E().b(beVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b3.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b3.b()));
        }
        a("mlerr", hashMap, maxError, beVar);
    }

    public void a(be beVar) {
        this.a.o().b(beVar, "DID_LOAD");
        if (beVar.O().endsWith("load")) {
            this.a.o().b(beVar);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(beVar.F()));
        if (beVar.getFormat().isFullscreenAd()) {
            q.a b3 = this.a.E().b(beVar.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b3.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b3.b()));
        }
        a("load", hashMap, beVar);
    }

    public void a(vj vjVar, wj wjVar, g gVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(vjVar.b()));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.i(), hashMap);
        a("serr", hashMap, vjVar.c(), wjVar);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, boolean z10) {
        this.a.l0().a((xl) new qm(str, list, map, map2, maxError, keVar, this.a, z10), sm.b.OTHER);
    }

    private void a(String str, Map map, ke keVar) {
        a(str, map, (MaxError) null, keVar);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar) {
        a(str, map, maxError, keVar, true);
    }

    private void a(String str, Map map, MaxError maxError, ke keVar, boolean z10) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(keVar.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z10 ? StringUtils.emptyIfNull(keVar.e()) : "");
        if (keVar instanceof be) {
            map2.put("{CREATIVE_ID}", z10 ? StringUtils.emptyIfNull(((be) keVar).getCreativeId()) : "");
        }
        a(str, null, map2, null, maxError, keVar, z10);
    }
}
