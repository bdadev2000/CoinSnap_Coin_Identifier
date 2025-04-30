package com.applovin.impl.mediation;

import Q7.n0;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0505o;
import com.applovin.impl.L;
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
import x0.AbstractC2914a;
import y.AbstractC2933a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class g {
    private final com.applovin.impl.sdk.k b;

    /* renamed from: c */
    private final t f9143c;

    /* renamed from: d */
    private final String f9144d;

    /* renamed from: e */
    private final ke f9145e;

    /* renamed from: f */
    private final String f9146f;

    /* renamed from: g */
    private MaxAdapter f9147g;

    /* renamed from: h */
    private String f9148h;

    /* renamed from: i */
    private be f9149i;

    /* renamed from: j */
    private View f9150j;

    /* renamed from: k */
    private MaxNativeAd f9151k;
    private MaxNativeAdView l;
    private ViewGroup m;

    /* renamed from: o */
    private MaxAdapterResponseParameters f9153o;

    /* renamed from: s */
    private final boolean f9157s;

    /* renamed from: a */
    private final Handler f9142a = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final c f9152n = new c(this, null);

    /* renamed from: p */
    private final AtomicBoolean f9154p = new AtomicBoolean(true);

    /* renamed from: q */
    private final AtomicBoolean f9155q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicBoolean f9156r = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public class a implements MaxSignalCollectionListener {

        /* renamed from: a */
        final /* synthetic */ e f9158a;

        public a(e eVar) {
            this.f9158a = eVar;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            g.this.a(str, this.f9158a);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            g.this.a(new MaxErrorImpl(str), this.f9158a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(MaxError maxError);

        void onSignalCollected(String str);
    }

    /* loaded from: classes.dex */
    public class c implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a */
        private MediationServiceImpl.b f9159a;

        private c() {
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
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": adview ad ad failed to load with error: " + maxAdapterError);
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
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": app open ad failed to load with error: " + maxAdapterError);
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
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": interstitial ad failed to load with error " + maxAdapterError);
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
            if (!g.this.f9149i.X()) {
                t unused = g.this.f9143c;
                if (t.a()) {
                    g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": native ad displayed with extra info: ", bundle));
                }
                a("onNativeAdDisplayed", bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": native ad loaded with extra info: ", bundle));
            }
            g.this.f9151k = maxNativeAd;
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
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", this.f9159a, new o(this, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", this.f9159a, new o(this, 4));
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
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", this.f9159a, new o(this, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", this.f9159a, new o(this, 2));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ c(g gVar, a aVar) {
            this();
        }

        public /* synthetic */ void a(de deVar, MaxReward maxReward, Bundle bundle) {
            this.f9159a.a(deVar, maxReward, bundle);
        }

        private void b(String str, Bundle bundle) {
            if (g.this.f9149i.v().compareAndSet(false, true)) {
                a(str, this.f9159a, new n(this, bundle, 9));
            }
        }

        private void c(String str, Bundle bundle) {
            if (!g.this.f9149i.v().get()) {
                g.this.f9156r.set(true);
                a(str, this.f9159a, new n(this, bundle, 0));
                return;
            }
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.b("MediationAdapterWrapper", g.this.f9146f + ": blocking ad loaded callback for " + g.this.f9149i + " since onAdHidden() has been called");
            }
            g.this.b.o().a(g.this.f9149i, str);
        }

        public /* synthetic */ void d(Bundle bundle) {
            this.f9159a.a(g.this.f9149i, bundle);
        }

        public /* synthetic */ void e() {
            this.f9159a.onRewardedVideoStarted(g.this.f9149i);
        }

        public /* synthetic */ void f(Bundle bundle) {
            this.f9159a.a(g.this.f9149i, bundle);
        }

        public /* synthetic */ void g(Bundle bundle) {
            this.f9159a.a(g.this.f9149i, bundle);
        }

        public /* synthetic */ void h(Bundle bundle) {
            this.f9159a.c(g.this.f9149i, bundle);
        }

        public /* synthetic */ void i(Bundle bundle) {
            this.f9159a.e(g.this.f9149i, bundle);
        }

        public /* synthetic */ void j(Bundle bundle) {
            if (g.this.f9155q.compareAndSet(false, true)) {
                this.f9159a.f(g.this.f9149i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": adview ad clicked with extra info: ", bundle));
            }
            a("onAdViewAdClicked", this.f9159a, new n(this, bundle, 6));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f9159a, new o(this, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            if (g.this.f9149i.X()) {
                return;
            }
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": adview ad displayed with extra info: ", bundle));
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f9159a, new n(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": adview ad hidden with extra info: ", bundle));
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": adview ad loaded with extra info: ", bundle));
            }
            g.this.f9150j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": app open ad clicked with extra info: ", bundle));
            }
            a("onAppOpenAdClicked", this.f9159a, new n(this, bundle, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": app open ad displayed with extra info: ", bundle));
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": app open ad hidden with extra info: ", bundle));
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": app open ad loaded with extra info: ", bundle));
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": interstitial ad clicked with extra info: ", bundle));
            }
            a("onInterstitialAdClicked", this.f9159a, new n(this, bundle, 1));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": interstitial ad displayed with extra info: ", bundle));
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": interstitial ad hidden with extra info ", bundle));
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": interstitial ad loaded with extra info: ", bundle));
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f9159a, new n(this, bundle, 5));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded ad clicked with extra info: ", bundle));
            }
            a("onRewardedAdClicked", this.f9159a, new n(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded ad displayed with extra info: ", bundle));
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded ad hidden with extra info: ", bundle));
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded ad loaded with extra info: ", bundle));
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded interstitial ad clicked with extra info: ", bundle));
            }
            a("onRewardedInterstitialAdClicked", this.f9159a, new n(this, bundle, 2));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.k("MediationAdapterWrapper", g.this.f9146f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded interstitial ad displayed with extra info: ", bundle));
            }
            a("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded interstitial ad hidden with extra info: ", bundle));
            }
            b("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            t unused = g.this.f9143c;
            if (t.a()) {
                g.this.f9143c.d("MediationAdapterWrapper", L.h(g.this, new StringBuilder(), ": rewarded interstitial ad loaded with extra info: ", bundle));
            }
            c("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (g.this.f9149i instanceof de) {
                de deVar = (de) g.this.f9149i;
                if (deVar.m0().compareAndSet(false, true)) {
                    t unused = g.this.f9143c;
                    if (t.a()) {
                        g.this.f9143c.d("MediationAdapterWrapper", g.this.f9146f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f9159a, new q(this, deVar, maxReward, bundle, 1));
                }
            }
        }

        public /* synthetic */ void d() {
            this.f9159a.onRewardedVideoCompleted(g.this.f9149i);
        }

        public /* synthetic */ void e(Bundle bundle) {
            this.f9159a.a(g.this.f9149i, bundle);
        }

        public /* synthetic */ void b() {
            this.f9159a.onRewardedVideoCompleted(g.this.f9149i);
        }

        public /* synthetic */ void b(Bundle bundle) {
            this.f9159a.d(g.this.f9149i, bundle);
        }

        public void a(MediationServiceImpl.b bVar) {
            if (bVar != null) {
                this.f9159a = bVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        public /* synthetic */ void c() {
            this.f9159a.onRewardedVideoStarted(g.this.f9149i);
        }

        public /* synthetic */ void c(Bundle bundle) {
            this.f9159a.a(g.this.f9149i, bundle);
        }

        public void a(String str, MaxError maxError) {
            if (g.this.f9149i.v().get()) {
                t unused = g.this.f9143c;
                if (t.a()) {
                    g.this.f9143c.b("MediationAdapterWrapper", g.this.f9146f + ": blocking ad load failed callback for " + g.this.f9149i + " since onAdHidden() has been called");
                }
                g.this.b.o().a(g.this.f9149i, str);
                return;
            }
            a(str, this.f9159a, new p(0, this, maxError));
        }

        public /* synthetic */ void a(MaxError maxError) {
            if (g.this.f9155q.compareAndSet(false, true)) {
                this.f9159a.onAdLoadFailed(g.this.f9148h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (g.this.f9149i.v().get()) {
                t unused = g.this.f9143c;
                if (t.a()) {
                    g.this.f9143c.b("MediationAdapterWrapper", g.this.f9146f + ": blocking ad displayed callback for " + g.this.f9149i + " since onAdHidden() has been called");
                }
                g.this.b.o().a(g.this.f9149i, str);
                return;
            }
            if (g.this.f9149i.t().compareAndSet(false, true)) {
                a(str, this.f9159a, new n(this, bundle, 7));
            }
        }

        public void a(String str, MaxError maxError, Bundle bundle) {
            if (g.this.f9149i.v().get()) {
                t unused = g.this.f9143c;
                if (t.a()) {
                    g.this.f9143c.b("MediationAdapterWrapper", g.this.f9146f + ": blocking ad display failed callback for " + g.this.f9149i + " since onAdHidden() has been called");
                }
                g.this.b.o().a(g.this.f9149i, str);
                return;
            }
            a(str, this.f9159a, new r(this, maxError, bundle, 0));
        }

        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f9159a.a(g.this.f9149i, maxError, bundle);
        }

        public /* synthetic */ void a(Bundle bundle) {
            this.f9159a.a(g.this.f9149i, bundle);
        }

        public /* synthetic */ void a() {
            this.f9159a.onAdCollapsed(g.this.f9149i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            g.this.f9142a.post(new q(this, runnable, maxAdListener, str, 0));
        }

        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                t.c("MediationAdapterWrapper", AbstractC2914a.k("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                g.this.b.B().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", g.this.f9145e.b()));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements MaxAdapter.OnCompletionListener {

        /* renamed from: a */
        private final com.applovin.impl.sdk.k f9160a;
        private final ke b;

        /* renamed from: c */
        private final long f9161c;

        /* renamed from: d */
        private final Runnable f9162d;

        public d(com.applovin.impl.sdk.k kVar, ke keVar, long j7, Runnable runnable) {
            this.f9160a = kVar;
            this.b = keVar;
            this.f9161c = j7;
            this.f9162d = runnable;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new r(this, initializationStatus, str, 1), this.b.h());
        }

        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f9160a.N().a(this.b, SystemClock.elapsedRealtime() - this.f9161c, initializationStatus, str);
            Runnable runnable = this.f9162d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        private final wj f9163a;
        private final b b;

        /* renamed from: c */
        private final AtomicBoolean f9164c = new AtomicBoolean();

        public e(wj wjVar, b bVar) {
            this.f9163a = wjVar;
            this.b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public class f extends xl {

        /* renamed from: h */
        private final WeakReference f9165h;

        public /* synthetic */ f(g gVar, a aVar) {
            this();
        }

        private void b(be beVar) {
            if (beVar != null) {
                this.f12278a.U().a(beVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!g.this.f9155q.get()) {
                if (g.this.f9149i.Y()) {
                    if (t.a()) {
                        this.f12279c.a(this.b, g.this.f9146f + " is timing out, considering JS Tag ad loaded: " + g.this.f9149i);
                    }
                    b(g.this.f9149i);
                    return;
                }
                if (t.a()) {
                    this.f12279c.b(this.b, g.this.f9146f + " is timing out " + g.this.f9149i + "...");
                }
                b(g.this.f9149i);
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
                c cVar = (c) this.f9165h.get();
                if (cVar != null) {
                    cVar.a(this.b, maxErrorImpl);
                }
            }
        }

        private f() {
            super("TaskTimeoutMediatedAd", g.this.b);
            this.f9165h = new WeakReference(g.this.f9152n);
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$g */
    /* loaded from: classes.dex */
    public class C0026g extends xl {

        /* renamed from: h */
        private final e f9167h;

        public /* synthetic */ C0026g(g gVar, e eVar, a aVar) {
            this(eVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f9167h.f9164c.get()) {
                if (t.a()) {
                    this.f12279c.b(this.b, g.this.f9146f + " is timing out " + this.f9167h.f9163a + "...");
                }
                g.this.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + g.this.f9146f + ") timed out"), this.f9167h);
            }
        }

        private C0026g(e eVar) {
            super("TaskTimeoutSignalCollection", g.this.b);
            this.f9167h = eVar;
        }
    }

    public g(ke keVar, MaxAdapter maxAdapter, boolean z8, com.applovin.impl.sdk.k kVar) {
        if (keVar != null) {
            if (maxAdapter != null) {
                if (kVar != null) {
                    this.f9144d = keVar.c();
                    this.f9147g = maxAdapter;
                    this.b = kVar;
                    this.f9143c = kVar.L();
                    this.f9145e = keVar;
                    this.f9146f = maxAdapter.getClass().getSimpleName();
                    this.f9157s = z8;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No adapter specified");
        }
        throw new IllegalArgumentException("No adapter name specified");
    }

    public String toString() {
        return AbstractC2914a.h(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f9146f, "'}");
    }

    public /* synthetic */ void l() {
        a("destroy");
        this.f9147g.onDestroy();
        this.f9147g = null;
        this.f9150j = null;
        this.f9151k = null;
        this.l = null;
        this.m = null;
    }

    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final wj wjVar, final Activity activity, b bVar) {
        if (bVar != null) {
            if (!this.f9154p.get()) {
                t.h("MediationAdapterWrapper", "Mediation adapter '" + this.f9146f + "' is disabled. Signal collection ads with this adapter is disabled.");
                bVar.a(new MaxErrorImpl(AbstractC2914a.h(new StringBuilder("The adapter ("), this.f9146f, ") is disabled")));
                return;
            }
            final e eVar = new e(wjVar, bVar);
            MaxAdapter maxAdapter = this.f9147g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(wjVar, eVar, maxSignalProvider, maxAdapterSignalCollectionParameters, activity);
                    }
                });
                return;
            } else {
                a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, AbstractC2914a.h(new StringBuilder("The adapter ("), this.f9146f, ") does not support signal collection")), eVar);
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    public void c(be beVar, final Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.X()) {
                runnable = new r(this, beVar, activity, 2);
            } else if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i9 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9184c;

                    {
                        this.f9184c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f9184c.d(activity);
                                return;
                            case 1:
                                this.f9184c.a(activity);
                                return;
                            case 2:
                                this.f9184c.b(activity);
                                return;
                            default:
                                this.f9184c.c(activity);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i10 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9184c;

                    {
                        this.f9184c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f9184c.d(activity);
                                return;
                            case 1:
                                this.f9184c.a(activity);
                                return;
                            case 2:
                                this.f9184c.b(activity);
                                return;
                            default:
                                this.f9184c.c(activity);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                final int i11 = 2;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9184c;

                    {
                        this.f9184c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f9184c.d(activity);
                                return;
                            case 1:
                                this.f9184c.a(activity);
                                return;
                            case 2:
                                this.f9184c.b(activity);
                                return;
                            default:
                                this.f9184c.c(activity);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                final int i12 = 3;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.l

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9184c;

                    {
                        this.f9184c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f9184c.d(activity);
                                return;
                            case 1:
                                this.f9184c.a(activity);
                                return;
                            case 2:
                                this.f9184c.b(activity);
                                return;
                            default:
                                this.f9184c.c(activity);
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

    public MaxNativeAd e() {
        return this.f9151k;
    }

    public MaxNativeAdView f() {
        return this.l;
    }

    public String g() {
        return this.f9144d;
    }

    public ViewGroup h() {
        return this.m;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f9147g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f9144d, th);
            this.b.B().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.f9145e.b()));
            a("sdk_version");
            this.b.O().a(this.f9145e.b(), "sdk_version", this.f9149i);
            return null;
        }
    }

    public boolean j() {
        return this.f9155q.get() && this.f9156r.get();
    }

    public boolean k() {
        return this.f9154p.get();
    }

    private boolean b(be beVar, Activity activity) {
        if (beVar != null) {
            if (beVar.z() == null) {
                t.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f9152n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (beVar.z() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != beVar.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f9154p.get()) {
                    String str = "Mediation adapter '" + this.f9146f + "' is disabled. Showing ads with this adapter is disabled.";
                    t.h("MediationAdapterWrapper", str);
                    this.f9152n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(AbstractC2914a.h(new StringBuilder("Mediation adapter '"), this.f9146f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public /* synthetic */ void e(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f9147g).loadNativeAd(maxAdapterResponseParameters, activity, this.f9152n);
    }

    public View d() {
        return this.f9150j;
    }

    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f9147g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, this.f9152n);
    }

    public /* synthetic */ void d(Activity activity) {
        ((MaxInterstitialAdapter) this.f9147g).showInterstitialAd(this.f9153o, activity, this.f9152n);
    }

    public MediationServiceImpl.b c() {
        return this.f9152n.f9159a;
    }

    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f9147g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f9152n);
    }

    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f9147g).showRewardedInterstitialAd(this.f9153o, activity, this.f9152n);
    }

    private void a(Runnable runnable, be beVar) {
        a("show_ad", beVar.getFormat(), new p(4, this, runnable));
    }

    public /* synthetic */ void a(wj wjVar, e eVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity) {
        a(wjVar, eVar);
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(eVar));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.f9144d + " due to: " + th);
            t.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            a(maxErrorImpl, eVar);
            this.b.B().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.f9145e.b()));
            a("collect_signal");
            this.b.O().a(this.f9145e.b(), "collect_signal", this.f9149i);
        }
        if (!eVar.f9164c.get() && wjVar.m() == 0) {
            if (t.a()) {
                this.f9143c.a("MediationAdapterWrapper", "Failing signal collection " + wjVar + " since it has 0 timeout");
            }
            a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, AbstractC2914a.h(new StringBuilder("The adapter ("), this.f9146f, ") has 0 timeout")), eVar);
        }
    }

    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f9147g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f9152n);
    }

    public /* synthetic */ void b(Activity activity) {
        ((MaxRewardedAdapter) this.f9147g).showRewardedAd(this.f9153o, activity, this.f9152n);
    }

    public /* synthetic */ void b(ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f9147g).showRewardedAd(this.f9153o, viewGroup, abstractC0505o, activity, this.f9152n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f9147g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            t.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f9144d, th);
            this.b.B().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.f9145e.b()));
            a("adapter_version");
            this.b.O().a(this.f9145e.b(), "adapter_version", this.f9149i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    public /* synthetic */ void a(be beVar, Runnable runnable) {
        a(this.f9145e, beVar);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.f9144d + " due to: " + th;
            t.h("MediationAdapterWrapper", str);
            this.f9152n.a("load_ad", new MaxErrorImpl(-1, str));
            this.b.B().a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.f9145e.b()));
            a("load_ad");
            this.b.O().a(this.f9145e.b(), "load_ad", this.f9149i);
        }
    }

    public /* synthetic */ void a(be beVar, Activity activity) {
        this.b.G().a((de) beVar, activity, this.f9152n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, be beVar, final Activity activity, MediationServiceImpl.b bVar) {
        Object qVar;
        if (beVar != null) {
            if (!this.f9154p.get()) {
                String str2 = "Mediation adapter '" + this.f9146f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
                t.h("MediationAdapterWrapper", str2);
                bVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
                return;
            }
            this.f9153o = maxAdapterResponseParameters;
            this.f9152n.a(bVar);
            MaxAdFormat H8 = beVar.X() ? beVar.H() : beVar.getFormat();
            if (H8 == MaxAdFormat.INTERSTITIAL) {
                final int i9 = 2;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.j

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9177c;

                    {
                        this.f9177c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f9177c.d(maxAdapterResponseParameters, activity);
                                return;
                            case 1:
                                this.f9177c.e(maxAdapterResponseParameters, activity);
                                return;
                            case 2:
                                this.f9177c.a(maxAdapterResponseParameters, activity);
                                return;
                            case 3:
                                this.f9177c.b(maxAdapterResponseParameters, activity);
                                return;
                            default:
                                this.f9177c.c(maxAdapterResponseParameters, activity);
                                return;
                        }
                    }
                };
            } else if (H8 == MaxAdFormat.APP_OPEN) {
                final int i10 = 3;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.j

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9177c;

                    {
                        this.f9177c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f9177c.d(maxAdapterResponseParameters, activity);
                                return;
                            case 1:
                                this.f9177c.e(maxAdapterResponseParameters, activity);
                                return;
                            case 2:
                                this.f9177c.a(maxAdapterResponseParameters, activity);
                                return;
                            case 3:
                                this.f9177c.b(maxAdapterResponseParameters, activity);
                                return;
                            default:
                                this.f9177c.c(maxAdapterResponseParameters, activity);
                                return;
                        }
                    }
                };
            } else if (H8 == MaxAdFormat.REWARDED) {
                final int i11 = 4;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.j

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9177c;

                    {
                        this.f9177c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f9177c.d(maxAdapterResponseParameters, activity);
                                return;
                            case 1:
                                this.f9177c.e(maxAdapterResponseParameters, activity);
                                return;
                            case 2:
                                this.f9177c.a(maxAdapterResponseParameters, activity);
                                return;
                            case 3:
                                this.f9177c.b(maxAdapterResponseParameters, activity);
                                return;
                            default:
                                this.f9177c.c(maxAdapterResponseParameters, activity);
                                return;
                        }
                    }
                };
            } else if (H8 == MaxAdFormat.REWARDED_INTERSTITIAL) {
                final int i12 = 0;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.j

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9177c;

                    {
                        this.f9177c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.f9177c.d(maxAdapterResponseParameters, activity);
                                return;
                            case 1:
                                this.f9177c.e(maxAdapterResponseParameters, activity);
                                return;
                            case 2:
                                this.f9177c.a(maxAdapterResponseParameters, activity);
                                return;
                            case 3:
                                this.f9177c.b(maxAdapterResponseParameters, activity);
                                return;
                            default:
                                this.f9177c.c(maxAdapterResponseParameters, activity);
                                return;
                        }
                    }
                };
            } else if (H8 == MaxAdFormat.NATIVE) {
                final int i13 = 1;
                qVar = new Runnable(this) { // from class: com.applovin.impl.mediation.j

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9177c;

                    {
                        this.f9177c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.f9177c.d(maxAdapterResponseParameters, activity);
                                return;
                            case 1:
                                this.f9177c.e(maxAdapterResponseParameters, activity);
                                return;
                            case 2:
                                this.f9177c.a(maxAdapterResponseParameters, activity);
                                return;
                            case 3:
                                this.f9177c.b(maxAdapterResponseParameters, activity);
                                return;
                            default:
                                this.f9177c.c(maxAdapterResponseParameters, activity);
                                return;
                        }
                    }
                };
            } else if (H8.isAdViewAd()) {
                qVar = new q(this, maxAdapterResponseParameters, H8, activity, 3);
            } else {
                throw new IllegalStateException("Failed to load " + beVar + ": " + beVar.getFormat() + " (" + beVar.H() + ") is not a supported ad format");
            }
            a("load_ad", H8, new r(this, beVar, qVar, 3));
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
        long m = keVar.m();
        if (m <= 0) {
            if (t.a()) {
                t tVar = this.f9143c;
                StringBuilder sb = new StringBuilder("Non-positive timeout set for ");
                if (beVar != null) {
                    keVar = beVar;
                }
                sb.append(keVar);
                sb.append(", not scheduling a timeout");
                tVar.a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (t.a()) {
            t tVar2 = this.f9143c;
            StringBuilder a6 = AbstractC2933a.a("Setting timeout ", m, "ms for ");
            if (beVar != null) {
                keVar = beVar;
            }
            a6.append(keVar);
            tVar2.a("MediationAdapterWrapper", a6.toString());
        }
        this.b.l0().a(xlVar, sm.b.TIMEOUT, m);
    }

    public void a(String str, be beVar) {
        this.f9148h = str;
        this.f9149i = beVar;
    }

    public void a(be beVar, final ViewGroup viewGroup, final AbstractC0505o abstractC0505o, final Activity activity) {
        Runnable runnable;
        if (b(beVar, activity)) {
            if (beVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i9 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9180c;

                    {
                        this.f9180c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f9180c.a(viewGroup, abstractC0505o, activity);
                                return;
                            default:
                                this.f9180c.b(viewGroup, abstractC0505o, activity);
                                return;
                        }
                    }
                };
            } else if (beVar.getFormat() == MaxAdFormat.REWARDED) {
                final int i10 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.k

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ g f9180c;

                    {
                        this.f9180c = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f9180c.a(viewGroup, abstractC0505o, activity);
                                return;
                            default:
                                this.f9180c.b(viewGroup, abstractC0505o, activity);
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
        b("initialize", new q(this, runnable, maxAdapterInitializationParameters, activity, 4));
    }

    public /* synthetic */ void a(Runnable runnable, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (t.a()) {
            this.f9143c.a("MediationAdapterWrapper", "Initializing " + this.f9146f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.f9145e.r());
        }
        this.f9147g.initialize(maxAdapterInitializationParameters, activity, new d(this.b, this.f9145e, elapsedRealtime, runnable));
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    public void a(ViewGroup viewGroup) {
        this.m = viewGroup;
    }

    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f9147g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f9152n);
    }

    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f9147g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f9152n);
    }

    public /* synthetic */ void a(Activity activity) {
        ((MaxAppOpenAdapter) this.f9147g).showAppOpenAd(this.f9153o, activity, this.f9152n);
    }

    public /* synthetic */ void a(ViewGroup viewGroup, AbstractC0505o abstractC0505o, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f9147g).showInterstitialAd(this.f9153o, viewGroup, abstractC0505o, activity, this.f9152n);
    }

    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.f9144d + " due to: " + th;
            t.h("MediationAdapterWrapper", str);
            this.f9152n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.b.B().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.f9145e.b()));
            a("show_ad");
            this.b.O().a(this.f9145e.b(), "show_ad", this.f9149i);
        }
    }

    public void a() {
        if (this.f9157s) {
            return;
        }
        b("destroy", new o(this, 5));
    }

    public void a(String str, e eVar) {
        if (!eVar.f9164c.compareAndSet(false, true) || eVar.b == null) {
            return;
        }
        eVar.b.onSignalCollected(str);
    }

    public void a(MaxError maxError, e eVar) {
        if (!eVar.f9164c.compareAndSet(false, true) || eVar.b == null) {
            return;
        }
        eVar.b.a(maxError);
    }

    private void a(String str) {
        if (t.a()) {
            this.f9143c.d("MediationAdapterWrapper", n0.l(new StringBuilder("Marking "), this.f9146f, " as disabled due to: ", str));
        }
        this.f9154p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        r rVar = new r(this, str, runnable, 4);
        if (a(str, maxAdFormat)) {
            this.f9142a.post(rVar);
            return;
        }
        if (((Boolean) this.b.a(oj.f9721a0)).booleanValue()) {
            StringBuilder c9 = AbstractC2965e.c(str, ":");
            c9.append(this.f9145e.c());
            this.b.l0().a(new kn(this.b, true, c9.toString(), rVar), this.f9145e);
            return;
        }
        rVar.run();
    }

    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (t.a()) {
                this.f9143c.a("MediationAdapterWrapper", this.f9146f + ": running " + str + "...");
            }
            runnable.run();
            if (t.a()) {
                this.f9143c.a("MediationAdapterWrapper", this.f9146f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Failed operation ", str, " for ");
            n2.append(this.f9144d);
            t.c("MediationAdapterWrapper", n2.toString(), th);
            a("fail_" + str);
            if (str.equals("destroy")) {
                return;
            }
            this.b.O().a(this.f9145e.b(), str, this.f9149i);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("is_wrapper", "true");
            CollectionUtils.putStringIfValid("adapter_class", this.f9145e.b(), hashMap);
            this.b.B().a("MediationAdapterWrapper", str, th, hashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean shouldShowAdsOnUiThread;
        MaxAdapter maxAdapter = this.f9147g;
        if (maxAdapter == null) {
            return this.f9145e.r();
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
        return this.f9145e.r();
    }
}
