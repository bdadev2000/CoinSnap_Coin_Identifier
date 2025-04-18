package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.ke;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sm;
import com.applovin.impl.wj;
import com.applovin.impl.xl;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b */
    private final com.applovin.impl.sdk.k f6189b;

    /* renamed from: c */
    private final t f6190c;

    /* renamed from: d */
    private final String f6191d;

    /* renamed from: e */
    private final ke f6192e;

    /* renamed from: f */
    private final String f6193f;

    /* renamed from: g */
    private MaxAdapter f6194g;

    /* renamed from: h */
    private String f6195h;

    /* renamed from: i */
    private be f6196i;

    /* renamed from: j */
    private View f6197j;

    /* renamed from: k */
    private MaxNativeAd f6198k;

    /* renamed from: l */
    private MaxNativeAdView f6199l;

    /* renamed from: m */
    private ViewGroup f6200m;

    /* renamed from: o */
    private MaxAdapterResponseParameters f6202o;

    /* renamed from: s */
    private final boolean f6206s;
    private final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final c f6201n = new c(this, null);

    /* renamed from: p */
    private final AtomicBoolean f6203p = new AtomicBoolean(true);

    /* renamed from: q */
    private final AtomicBoolean f6204q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicBoolean f6205r = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public class a implements MaxSignalCollectionListener {
        final /* synthetic */ e a;

        public a(e eVar) {
            this.a = eVar;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            g.this.a(str, this.a);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            g.this.a(new MaxErrorImpl(str), this.a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(MaxError maxError);

        void onSignalCollected(String str);
    }

    /* loaded from: classes.dex */
    public class c implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {
        private MediationServiceImpl.b a;

        private c() {
        }

        public /* synthetic */ void a(de deVar, MaxReward maxReward, Bundle bundle) {
            this.a.a(deVar, maxReward, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            onAdViewAdCollapsed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAdViewAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            onAdViewAdExpanded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked() {
            onAppOpenAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onAppOpenAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden() {
            onAppOpenAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            onNativeAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            if (!g.this.f6196i.X()) {
                t unused = g.this.f6190c;
                if (t.a()) {
                    t tVar = g.this.f6190c;
                    com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": native ad displayed with extra info: ", bundle, tVar, "MediationAdapterWrapper");
                }
                a("onNativeAdDisplayed", bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": native ad loaded with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            g.this.f6198k = maxNativeAd;
            c("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", this.a, new o(this, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", this.a, new o(this, 2));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            onRewardedInterstitialAdDisplayFailed(maxAdapterError, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", this.a, new o(this, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", this.a, new o(this, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ c(g gVar, a aVar) {
            this();
        }

        private void b(String str, Bundle bundle) {
            if (g.this.f6196i.v().compareAndSet(false, true)) {
                a(str, this.a, new p(this, bundle, 6));
            }
        }

        private void c(String str, Bundle bundle) {
            if (g.this.f6196i.v().get()) {
                t unused = g.this.f6190c;
                if (t.a()) {
                    g.this.f6190c.b("MediationAdapterWrapper", g.this.f6193f + ": blocking ad loaded callback for " + g.this.f6196i + " since onAdHidden() has been called");
                }
                g.this.f6189b.o().a(g.this.f6196i, str);
                return;
            }
            g.this.f6205r.set(true);
            a(str, this.a, new p(this, bundle, 3));
        }

        public /* synthetic */ void d(Bundle bundle) {
            this.a.a(g.this.f6196i, bundle);
        }

        public /* synthetic */ void e() {
            this.a.onRewardedVideoStarted(g.this.f6196i);
        }

        public /* synthetic */ void f(Bundle bundle) {
            this.a.a(g.this.f6196i, bundle);
        }

        public /* synthetic */ void g(Bundle bundle) {
            this.a.a(g.this.f6196i, bundle);
        }

        public /* synthetic */ void h(Bundle bundle) {
            this.a.c(g.this.f6196i, bundle);
        }

        public /* synthetic */ void i(Bundle bundle) {
            this.a.e(g.this.f6196i, bundle);
        }

        public /* synthetic */ void j(Bundle bundle) {
            if (g.this.f6204q.compareAndSet(false, true)) {
                this.a.f(g.this.f6196i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": adview ad clicked with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onAdViewAdClicked", this.a, new p(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.a, new o(this, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            if (g.this.f6196i.X()) {
                return;
            }
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": adview ad displayed with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.a, new p(this, bundle, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": adview ad hidden with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": adview ad loaded with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            g.this.f6197j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": app open ad clicked with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onAppOpenAdClicked", this.a, new p(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": app open ad displayed with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": app open ad hidden with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": app open ad loaded with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": interstitial ad clicked with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onInterstitialAdClicked", this.a, new p(this, bundle, 5));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": interstitial ad displayed with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": interstitial ad hidden with extra info ", bundle, tVar, "MediationAdapterWrapper");
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": interstitial ad loaded with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.a, new p(this, bundle, 2));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded ad clicked with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onRewardedAdClicked", this.a, new p(this, bundle, 7));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded ad displayed with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded ad hidden with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded ad loaded with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded interstitial ad clicked with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onRewardedInterstitialAdClicked", this.a, new p(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                g.this.f6190c.k("MediationAdapterWrapper", g.this.f6193f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded interstitial ad displayed with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            a("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded interstitial ad hidden with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            b("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.f6190c;
            if (t.a()) {
                t tVar = g.this.f6190c;
                com.applovin.impl.mediation.ads.e.o(g.this, new StringBuilder(), ": rewarded interstitial ad loaded with extra info: ", bundle, tVar, "MediationAdapterWrapper");
            }
            c("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (g.this.f6196i instanceof de) {
                de deVar = (de) g.this.f6196i;
                if (deVar.m0().compareAndSet(false, true)) {
                    t unused = g.this.f6190c;
                    if (t.a()) {
                        g.this.f6190c.d("MediationAdapterWrapper", g.this.f6193f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.a, new q(1, this, deVar, maxReward, bundle));
                }
            }
        }

        public /* synthetic */ void d() {
            this.a.onRewardedVideoCompleted(g.this.f6196i);
        }

        public /* synthetic */ void e(Bundle bundle) {
            this.a.a(g.this.f6196i, bundle);
        }

        public /* synthetic */ void b() {
            this.a.onRewardedVideoCompleted(g.this.f6196i);
        }

        public /* synthetic */ void b(Bundle bundle) {
            this.a.d(g.this.f6196i, bundle);
        }

        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        public /* synthetic */ void c() {
            this.a.onRewardedVideoStarted(g.this.f6196i);
        }

        public void a(String str, MaxError maxError) {
            if (g.this.f6196i.v().get()) {
                t unused = g.this.f6190c;
                if (t.a()) {
                    g.this.f6190c.b("MediationAdapterWrapper", g.this.f6193f + ": blocking ad load failed callback for " + g.this.f6196i + " since onAdHidden() has been called");
                }
                g.this.f6189b.o().a(g.this.f6196i, str);
                return;
            }
            a(str, this.a, new s(0, this, maxError));
        }

        public /* synthetic */ void c(Bundle bundle) {
            this.a.a(g.this.f6196i, bundle);
        }

        public /* synthetic */ void a(MaxError maxError) {
            if (g.this.f6204q.compareAndSet(false, true)) {
                this.a.onAdLoadFailed(g.this.f6195h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (g.this.f6196i.v().get()) {
                t unused = g.this.f6190c;
                if (t.a()) {
                    g.this.f6190c.b("MediationAdapterWrapper", g.this.f6193f + ": blocking ad displayed callback for " + g.this.f6196i + " since onAdHidden() has been called");
                }
                g.this.f6189b.o().a(g.this.f6196i, str);
                return;
            }
            if (g.this.f6196i.t().compareAndSet(false, true)) {
                a(str, this.a, new p(this, bundle, 9));
            }
        }

        public void a(String str, MaxError maxError, Bundle bundle) {
            if (g.this.f6196i.v().get()) {
                t unused = g.this.f6190c;
                if (t.a()) {
                    g.this.f6190c.b("MediationAdapterWrapper", g.this.f6193f + ": blocking ad display failed callback for " + g.this.f6196i + " since onAdHidden() has been called");
                }
                g.this.f6189b.o().a(g.this.f6196i, str);
                return;
            }
            a(str, this.a, new r(0, this, maxError, bundle));
        }

        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.a.a(g.this.f6196i, maxError, bundle);
        }

        public /* synthetic */ void a(Bundle bundle) {
            this.a.a(g.this.f6196i, bundle);
        }

        public /* synthetic */ void a() {
            this.a.onAdCollapsed(g.this.f6196i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            g.this.a.post(new q(0, this, runnable, maxAdListener, str));
        }

        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                t.c("MediationAdapterWrapper", eb.j.l("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th2);
                g.this.f6189b.B().a("MediationAdapterWrapper", str, th2, CollectionUtils.hashMap("adapter_class", g.this.f6192e.b()));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements MaxAdapter.OnCompletionListener {
        private final com.applovin.impl.sdk.k a;

        /* renamed from: b */
        private final ke f6209b;

        /* renamed from: c */
        private final long f6210c;

        /* renamed from: d */
        private final Runnable f6211d;

        public d(com.applovin.impl.sdk.k kVar, ke keVar, long j3, Runnable runnable) {
            this.a = kVar;
            this.f6209b = keVar;
            this.f6210c = j3;
            this.f6211d = runnable;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new r(1, this, initializationStatus, str), this.f6209b.h());
        }

        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.a.N().a(this.f6209b, SystemClock.elapsedRealtime() - this.f6210c, initializationStatus, str);
            Runnable runnable = this.f6211d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        private final wj a;

        /* renamed from: b */
        private final b f6212b;

        /* renamed from: c */
        private final AtomicBoolean f6213c = new AtomicBoolean();

        public e(wj wjVar, b bVar) {
            this.a = wjVar;
            this.f6212b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public class f extends xl {

        /* renamed from: h */
        private final WeakReference f6214h;

        public /* synthetic */ f(g gVar, a aVar) {
            this();
        }

        private void b(be beVar) {
            if (beVar != null) {
                this.a.U().a(beVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!g.this.f6204q.get()) {
                if (g.this.f6196i.Y()) {
                    if (t.a()) {
                        this.f9061c.a(this.f9060b, g.this.f6193f + " is timing out, considering JS Tag ad loaded: " + g.this.f6196i);
                    }
                    b(g.this.f6196i);
                    return;
                }
                if (t.a()) {
                    this.f9061c.b(this.f9060b, g.this.f6193f + " is timing out " + g.this.f6196i + "...");
                }
                b(g.this.f6196i);
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
                c cVar = (c) this.f6214h.get();
                if (cVar != null) {
                    cVar.a(this.f9060b, maxErrorImpl);
                }
            }
        }

        private f() {
            super("TaskTimeoutMediatedAd", g.this.f6189b);
            this.f6214h = new WeakReference(g.this.f6201n);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$g */
    /* loaded from: classes.dex */
    public class C0026g extends xl {

        /* renamed from: h */
        private final e f6216h;

        public /* synthetic */ C0026g(g gVar, e eVar, a aVar) {
            this(eVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f6216h.f6213c.get()) {
                if (t.a()) {
                    this.f9061c.b(this.f9060b, g.this.f6193f + " is timing out " + this.f6216h.a + "...");
                }
                g.this.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + g.this.f6193f + ") timed out"), this.f6216h);
            }
        }

        private C0026g(e eVar) {
            super("TaskTimeoutSignalCollection", g.this.f6189b);
            this.f6216h = eVar;
        }
    }

    public g(ke keVar, MaxAdapter maxAdapter, boolean z10, com.applovin.impl.sdk.k kVar) {
        if (keVar != null) {
            if (maxAdapter != null) {
                if (kVar != null) {
                    this.f6191d = keVar.c();
                    this.f6194g = maxAdapter;
                    this.f6189b = kVar;
                    this.f6190c = kVar.L();
                    this.f6192e = keVar;
                    this.f6193f = maxAdapter.getClass().getSimpleName();
                    this.f6206s = z10;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No adapter specified");
        }
        throw new IllegalArgumentException("No adapter name specified");
    }

    public String toString() {
        return vd.e.h(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f6193f, "'}");
    }

    public /* synthetic */ void l() {
        a("destroy");
        this.f6194g.onDestroy();
        this.f6194g = null;
        this.f6197j = null;
        this.f6198k = null;
        this.f6199l = null;
        this.f6200m = null;
    }

    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final wj wjVar, final Activity activity, b bVar) {
        if (bVar != null) {
            if (!this.f6203p.get()) {
                t.h("MediationAdapterWrapper", "Mediation adapter '" + this.f6193f + "' is disabled. Signal collection ads with this adapter is disabled.");
                bVar.a(new MaxErrorImpl(vd.e.h(new StringBuilder("The adapter ("), this.f6193f, ") is disabled")));
                return;
            }
            final e eVar = new e(wjVar, bVar);
            MaxAdapter maxAdapter = this.f6194g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(wjVar, eVar, maxSignalProvider, maxAdapterSignalCollectionParameters, activity);
                    }
                });
                return;
            } else {
                a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, vd.e.h(new StringBuilder("The adapter ("), this.f6193f, ") does not support signal collection")), eVar);
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    public void c(be beVar, final Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.X()) {
                runnable = new r(4, this, beVar, activity);
            } else if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6239c;

                    {
                        this.f6239c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        Activity activity2 = activity;
                        g gVar = this.f6239c;
                        switch (i11) {
                            case 0:
                                gVar.d(activity2);
                                return;
                            case 1:
                                gVar.a(activity2);
                                return;
                            case 2:
                                gVar.b(activity2);
                                return;
                            default:
                                gVar.c(activity2);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i11 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6239c;

                    {
                        this.f6239c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        Activity activity2 = activity;
                        g gVar = this.f6239c;
                        switch (i112) {
                            case 0:
                                gVar.d(activity2);
                                return;
                            case 1:
                                gVar.a(activity2);
                                return;
                            case 2:
                                gVar.b(activity2);
                                return;
                            default:
                                gVar.c(activity2);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                final int i12 = 2;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6239c;

                    {
                        this.f6239c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        Activity activity2 = activity;
                        g gVar = this.f6239c;
                        switch (i112) {
                            case 0:
                                gVar.d(activity2);
                                return;
                            case 1:
                                gVar.a(activity2);
                                return;
                            case 2:
                                gVar.b(activity2);
                                return;
                            default:
                                gVar.c(activity2);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                final int i13 = 3;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6239c;

                    {
                        this.f6239c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i13;
                        Activity activity2 = activity;
                        g gVar = this.f6239c;
                        switch (i112) {
                            case 0:
                                gVar.d(activity2);
                                return;
                            case 1:
                                gVar.a(activity2);
                                return;
                            case 2:
                                gVar.b(activity2);
                                return;
                            default:
                                gVar.c(activity2);
                                return;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + beVar + ": " + beVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, beVar);
        }
    }

    public String i() {
        MaxAdapter maxAdapter = this.f6194g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th2) {
            t.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f6191d, th2);
            this.f6189b.B().a("MediationAdapterWrapper", "sdk_version", th2, CollectionUtils.hashMap("adapter_class", this.f6192e.b()));
            a("sdk_version");
            this.f6189b.O().a(this.f6192e.b(), "sdk_version", this.f6196i);
            return null;
        }
    }

    public boolean j() {
        return this.f6204q.get() && this.f6205r.get();
    }

    public boolean k() {
        return this.f6203p.get();
    }

    private boolean b(be beVar, Activity activity) {
        if (beVar != null) {
            if (beVar.z() == null) {
                t.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f6201n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (beVar.z() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != beVar.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f6203p.get()) {
                    String str = "Mediation adapter '" + this.f6193f + "' is disabled. Showing ads with this adapter is disabled.";
                    t.h("MediationAdapterWrapper", str);
                    this.f6201n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(vd.e.h(new StringBuilder("Mediation adapter '"), this.f6193f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public View d() {
        return this.f6197j;
    }

    public MaxNativeAd e() {
        return this.f6198k;
    }

    public MaxNativeAdView f() {
        return this.f6199l;
    }

    public String g() {
        return this.f6191d;
    }

    public ViewGroup h() {
        return this.f6200m;
    }

    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f6194g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, this.f6201n);
    }

    public /* synthetic */ void e(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f6194g).loadNativeAd(maxAdapterResponseParameters, activity, this.f6201n);
    }

    public /* synthetic */ void d(Activity activity) {
        ((MaxInterstitialAdapter) this.f6194g).showInterstitialAd(this.f6202o, activity, this.f6201n);
    }

    public static /* synthetic */ String c(g gVar) {
        return gVar.f6193f;
    }

    public MediationServiceImpl.b c() {
        return this.f6201n.a;
    }

    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f6194g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f6201n);
    }

    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f6194g).showRewardedInterstitialAd(this.f6202o, activity, this.f6201n);
    }

    private void a(Runnable runnable, be beVar) {
        a("show_ad", beVar.getFormat(), new s(4, this, runnable));
    }

    public /* synthetic */ void a(wj wjVar, e eVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity) {
        a(wjVar, eVar);
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(eVar));
        } catch (Throwable th2) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f6191d + " due to: " + th2);
            t.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            a(maxErrorImpl, eVar);
            this.f6189b.B().a("MediationAdapterWrapper", "collect_signal", th2, CollectionUtils.hashMap("adapter_class", this.f6192e.b()));
            a("collect_signal");
            this.f6189b.O().a(this.f6192e.b(), "collect_signal", this.f6196i);
        }
        if (!eVar.f6213c.get() && wjVar.m() == 0) {
            if (t.a()) {
                this.f6190c.a("MediationAdapterWrapper", "Failing signal collection " + wjVar + " since it has 0 timeout");
            }
            a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, vd.e.h(new StringBuilder("The adapter ("), this.f6193f, ") has 0 timeout")), eVar);
        }
    }

    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f6194g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f6201n);
    }

    public /* synthetic */ void b(Activity activity) {
        ((MaxRewardedAdapter) this.f6194g).showRewardedAd(this.f6202o, activity, this.f6201n);
    }

    public /* synthetic */ void b(ViewGroup viewGroup, androidx.lifecycle.p pVar, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f6194g).showRewardedAd(this.f6202o, viewGroup, pVar, activity, this.f6201n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f6194g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th2) {
            t.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f6191d, th2);
            this.f6189b.B().a("MediationAdapterWrapper", "adapter_version", th2, CollectionUtils.hashMap("adapter_class", this.f6192e.b()));
            a("adapter_version");
            this.f6189b.O().a(this.f6192e.b(), "adapter_version", this.f6196i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    public /* synthetic */ void a(be beVar, Runnable runnable) {
        a(this.f6192e, beVar);
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start loading ad for " + this.f6191d + " due to: " + th2;
            t.h("MediationAdapterWrapper", str);
            this.f6201n.a("load_ad", new MaxErrorImpl(-1, str));
            this.f6189b.B().a("MediationAdapterWrapper", "load_ad", th2, CollectionUtils.hashMap("adapter_class", this.f6192e.b()));
            a("load_ad");
            this.f6189b.O().a(this.f6192e.b(), "load_ad", this.f6196i);
        }
    }

    public /* synthetic */ void a(be beVar, Activity activity) {
        this.f6189b.G().a((de) beVar, activity, this.f6201n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, be beVar, final Activity activity, MediationServiceImpl.b bVar) {
        Object qVar;
        if (beVar != null) {
            if (!this.f6203p.get()) {
                String str2 = "Mediation adapter '" + this.f6193f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                t.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f6202o = maxAdapterResponseParameters;
            this.f6201n.a(bVar);
            MaxAdFormat H = beVar.X() ? beVar.H() : beVar.getFormat();
            final int i10 = 3;
            if (H == MaxAdFormat.INTERSTITIAL) {
                final int i11 = 0;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6235c;

                    {
                        this.f6235c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        g gVar = this.f6235c;
                        Activity activity2 = activity;
                        MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                        switch (i12) {
                            case 0:
                                gVar.a(maxAdapterResponseParameters2, activity2);
                                return;
                            case 1:
                                gVar.b(maxAdapterResponseParameters2, activity2);
                                return;
                            case 2:
                                gVar.c(maxAdapterResponseParameters2, activity2);
                                return;
                            case 3:
                                gVar.d(maxAdapterResponseParameters2, activity2);
                                return;
                            default:
                                gVar.e(maxAdapterResponseParameters2, activity2);
                                return;
                        }
                    }
                };
            } else if (H == MaxAdFormat.APP_OPEN) {
                final int i12 = 1;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6235c;

                    {
                        this.f6235c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        g gVar = this.f6235c;
                        Activity activity2 = activity;
                        MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                        switch (i122) {
                            case 0:
                                gVar.a(maxAdapterResponseParameters2, activity2);
                                return;
                            case 1:
                                gVar.b(maxAdapterResponseParameters2, activity2);
                                return;
                            case 2:
                                gVar.c(maxAdapterResponseParameters2, activity2);
                                return;
                            case 3:
                                gVar.d(maxAdapterResponseParameters2, activity2);
                                return;
                            default:
                                gVar.e(maxAdapterResponseParameters2, activity2);
                                return;
                        }
                    }
                };
            } else if (H == MaxAdFormat.REWARDED) {
                final int i13 = 2;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6235c;

                    {
                        this.f6235c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i13;
                        g gVar = this.f6235c;
                        Activity activity2 = activity;
                        MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                        switch (i122) {
                            case 0:
                                gVar.a(maxAdapterResponseParameters2, activity2);
                                return;
                            case 1:
                                gVar.b(maxAdapterResponseParameters2, activity2);
                                return;
                            case 2:
                                gVar.c(maxAdapterResponseParameters2, activity2);
                                return;
                            case 3:
                                gVar.d(maxAdapterResponseParameters2, activity2);
                                return;
                            default:
                                gVar.e(maxAdapterResponseParameters2, activity2);
                                return;
                        }
                    }
                };
            } else if (H == MaxAdFormat.REWARDED_INTERSTITIAL) {
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6235c;

                    {
                        this.f6235c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i10;
                        g gVar = this.f6235c;
                        Activity activity2 = activity;
                        MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                        switch (i122) {
                            case 0:
                                gVar.a(maxAdapterResponseParameters2, activity2);
                                return;
                            case 1:
                                gVar.b(maxAdapterResponseParameters2, activity2);
                                return;
                            case 2:
                                gVar.c(maxAdapterResponseParameters2, activity2);
                                return;
                            case 3:
                                gVar.d(maxAdapterResponseParameters2, activity2);
                                return;
                            default:
                                gVar.e(maxAdapterResponseParameters2, activity2);
                                return;
                        }
                    }
                };
            } else if (H == MaxAdFormat.NATIVE) {
                final int i14 = 4;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6235c;

                    {
                        this.f6235c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i14;
                        g gVar = this.f6235c;
                        Activity activity2 = activity;
                        MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                        switch (i122) {
                            case 0:
                                gVar.a(maxAdapterResponseParameters2, activity2);
                                return;
                            case 1:
                                gVar.b(maxAdapterResponseParameters2, activity2);
                                return;
                            case 2:
                                gVar.c(maxAdapterResponseParameters2, activity2);
                                return;
                            case 3:
                                gVar.d(maxAdapterResponseParameters2, activity2);
                                return;
                            default:
                                gVar.e(maxAdapterResponseParameters2, activity2);
                                return;
                        }
                    }
                };
            } else if (H.isAdViewAd()) {
                qVar = new q(3, this, maxAdapterResponseParameters, H, activity);
            } else {
                throw new IllegalStateException("Failed to load " + beVar + ": " + beVar.getFormat() + " (" + beVar.H() + ") is not a supported ad format");
            }
            a("load_ad", H, new r(i10, this, beVar, qVar));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(ke keVar, be beVar) {
        a(new f(this, null), keVar, beVar);
    }

    private void a(ke keVar, e eVar) {
        a(new C0026g(this, eVar, null), keVar, (be) null);
    }

    private void a(xl xlVar, ke keVar, be beVar) {
        long m10 = keVar.m();
        if (m10 <= 0) {
            if (t.a()) {
                t tVar = this.f6190c;
                StringBuilder sb2 = new StringBuilder("Non-positive timeout set for ");
                if (beVar != null) {
                    keVar = beVar;
                }
                sb2.append(keVar);
                sb2.append(", not scheduling a timeout");
                tVar.a("MediationAdapterWrapper", sb2.toString());
                return;
            }
            return;
        }
        if (t.a()) {
            t tVar2 = this.f6190c;
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Setting timeout ", m10, "ms for ");
            if (beVar != null) {
                keVar = beVar;
            }
            o10.append(keVar);
            tVar2.a("MediationAdapterWrapper", o10.toString());
        }
        this.f6189b.l0().a(xlVar, sm.b.TIMEOUT, m10);
    }

    public void a(String str, be beVar) {
        this.f6195h = str;
        this.f6196i = beVar;
    }

    public void a(be beVar, final ViewGroup viewGroup, final androidx.lifecycle.p pVar, final Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i10 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.m

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6242c;

                    {
                        this.f6242c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        ViewGroup viewGroup2 = viewGroup;
                        g gVar = this.f6242c;
                        Activity activity2 = activity;
                        androidx.lifecycle.p pVar2 = pVar;
                        switch (i11) {
                            case 0:
                                gVar.a(viewGroup2, pVar2, activity2);
                                return;
                            default:
                                gVar.b(viewGroup2, pVar2, activity2);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                final int i11 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.m

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f6242c;

                    {
                        this.f6242c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        ViewGroup viewGroup2 = viewGroup;
                        g gVar = this.f6242c;
                        Activity activity2 = activity;
                        androidx.lifecycle.p pVar2 = pVar;
                        switch (i112) {
                            case 0:
                                gVar.a(viewGroup2, pVar2, activity2);
                                return;
                            default:
                                gVar.b(viewGroup2, pVar2, activity2);
                                return;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + beVar + ": " + beVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, beVar);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
        b("initialize", new q(4, this, runnable, maxAdapterInitializationParameters, activity));
    }

    public /* synthetic */ void a(Runnable runnable, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (t.a()) {
            this.f6190c.a("MediationAdapterWrapper", "Initializing " + this.f6193f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f6192e.r());
        }
        this.f6194g.initialize(maxAdapterInitializationParameters, activity, new d(this.f6189b, this.f6192e, elapsedRealtime, runnable));
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f6199l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.f6200m = viewGroup;
    }

    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f6194g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f6201n);
    }

    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f6194g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f6201n);
    }

    public /* synthetic */ void a(Activity activity) {
        ((MaxAppOpenAdapter) this.f6194g).showAppOpenAd(this.f6202o, activity, this.f6201n);
    }

    public /* synthetic */ void a(ViewGroup viewGroup, androidx.lifecycle.p pVar, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f6194g).showInterstitialAd(this.f6202o, viewGroup, pVar, activity, this.f6201n);
    }

    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            String str = "Failed to start displaying ad for " + this.f6191d + " due to: " + th2;
            t.h("MediationAdapterWrapper", str);
            this.f6201n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f6189b.B().a("MediationAdapterWrapper", "show_ad", th2, CollectionUtils.hashMap("adapter_class", this.f6192e.b()));
            a("show_ad");
            this.f6189b.O().a(this.f6192e.b(), "show_ad", this.f6196i);
        }
    }

    public void a() {
        if (this.f6206s) {
            return;
        }
        b("destroy", new o(this, 5));
    }

    public void a(String str, e eVar) {
        if (!eVar.f6213c.compareAndSet(false, true) || eVar.f6212b == null) {
            return;
        }
        eVar.f6212b.onSignalCollected(str);
    }

    public void a(MaxError maxError, e eVar) {
        if (!eVar.f6213c.compareAndSet(false, true) || eVar.f6212b == null) {
            return;
        }
        eVar.f6212b.a(maxError);
    }

    private void a(String str) {
        if (t.a()) {
            this.f6190c.d("MediationAdapterWrapper", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder("Marking "), this.f6193f, " as disabled due to: ", str));
        }
        this.f6203p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        r rVar = new r(2, this, str, runnable);
        if (a(str, maxAdFormat)) {
            this.a.post(rVar);
            return;
        }
        if (((Boolean) this.f6189b.a(oj.f6613a0)).booleanValue()) {
            StringBuilder n10 = eb.j.n(str, ":");
            n10.append(this.f6192e.c());
            this.f6189b.l0().a(new kn(this.f6189b, true, n10.toString(), rVar), this.f6192e);
            return;
        }
        rVar.run();
    }

    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (t.a()) {
                this.f6190c.a("MediationAdapterWrapper", this.f6193f + ": running " + str + "...");
            }
            runnable.run();
            if (t.a()) {
                this.f6190c.a("MediationAdapterWrapper", this.f6193f + ": finished " + str + "");
            }
        } catch (Throwable th2) {
            StringBuilder o10 = a4.j.o("Failed operation ", str, " for ");
            o10.append(this.f6191d);
            t.c("MediationAdapterWrapper", o10.toString(), th2);
            a("fail_" + str);
            if (str.equals("destroy")) {
                return;
            }
            this.f6189b.O().a(this.f6192e.b(), str, this.f6196i);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f6192e.b(), hashMap);
            this.f6189b.B().a("MediationAdapterWrapper", str, th2, hashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean shouldShowAdsOnUiThread;
        MaxAdapter maxAdapter = this.f6194g;
        if (maxAdapter == null) {
            return this.f6192e.r();
        }
        if ("initialize".equals(str)) {
            Boolean shouldInitializeOnUiThread = maxAdapter.shouldInitializeOnUiThread();
            if (shouldInitializeOnUiThread != null) {
                return shouldInitializeOnUiThread.booleanValue();
            }
        } else if ("collect_signal".equals(str)) {
            Boolean shouldCollectSignalsOnUiThread = maxAdapter.shouldCollectSignalsOnUiThread();
            if (shouldCollectSignalsOnUiThread != null) {
                return shouldCollectSignalsOnUiThread.booleanValue();
            }
        } else if ("load_ad".equals(str) && maxAdFormat != null) {
            Boolean shouldLoadAdsOnUiThread = maxAdapter.shouldLoadAdsOnUiThread(maxAdFormat);
            if (shouldLoadAdsOnUiThread != null) {
                return shouldLoadAdsOnUiThread.booleanValue();
            }
        } else if ("show_ad".equals(str) && maxAdFormat != null && (shouldShowAdsOnUiThread = maxAdapter.shouldShowAdsOnUiThread(maxAdFormat)) != null) {
            return shouldShowAdsOnUiThread.booleanValue();
        }
        return this.f6192e.r();
    }
}
