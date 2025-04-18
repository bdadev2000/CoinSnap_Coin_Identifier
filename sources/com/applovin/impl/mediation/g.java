package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.ge;
import com.applovin.impl.ie;
import com.applovin.impl.jn;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.pe;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.ve;
import com.applovin.impl.yl;
import com.applovin.impl.zj;
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
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: b */
    private final com.applovin.impl.sdk.j f25490b;

    /* renamed from: c */
    private final com.applovin.impl.sdk.n f25491c;
    private final String d;
    private final pe e;

    /* renamed from: f */
    private final String f25492f;

    /* renamed from: g */
    private MaxAdapter f25493g;

    /* renamed from: h */
    private String f25494h;

    /* renamed from: i */
    private ge f25495i;

    /* renamed from: j */
    private View f25496j;

    /* renamed from: k */
    private MaxNativeAd f25497k;

    /* renamed from: l */
    private MaxNativeAdView f25498l;

    /* renamed from: m */
    private ViewGroup f25499m;

    /* renamed from: o */
    private MaxAdapterResponseParameters f25501o;

    /* renamed from: s */
    private final boolean f25505s;

    /* renamed from: a */
    private final Handler f25489a = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    private final d f25500n = new d(this, null);

    /* renamed from: p */
    private final AtomicBoolean f25502p = new AtomicBoolean(true);

    /* renamed from: q */
    private final AtomicBoolean f25503q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicBoolean f25504r = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public class a implements MaxSignalCollectionListener {

        /* renamed from: a */
        final /* synthetic */ zj f25506a;

        /* renamed from: b */
        final /* synthetic */ f f25507b;

        public a(zj zjVar, f fVar) {
            this.f25506a = zjVar;
            this.f25507b = fVar;
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollected(String str) {
            if (this.f25506a.x() && TextUtils.isEmpty(str)) {
                g.this.a(new MaxErrorImpl("Signal is not a valid string"), this.f25507b);
            } else {
                g.this.a(str, this.f25507b);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
        public void onSignalCollectionFailed(String str) {
            g.this.a(new MaxErrorImpl(str), this.f25507b);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f25493g.onDestroy();
            g.this.f25493g = null;
            g.this.f25496j = null;
            g.this.f25497k = null;
            g.this.f25498l = null;
            g.this.f25499m = null;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(MaxError maxError);

        void onSignalCollected(String str);
    }

    /* loaded from: classes3.dex */
    public class d implements MaxInterstitialAdapterListener, MaxAppOpenAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener, MaxAdViewAdapterListener, MaxNativeAdAdapterListener {

        /* renamed from: a */
        private MediationServiceImpl.d f25510a;

        private d() {
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
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": adview ad ad failed to load with error: " + maxAdapterError);
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
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": app open ad failed to load with error: " + maxAdapterError);
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
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": interstitial ad failed to load with error " + maxAdapterError);
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
            if (g.this.f25495i.a0()) {
                return;
            }
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": native ad displayed with extra info: ", bundle));
            }
            a("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": native ad loaded with extra info: ", bundle));
            }
            g.this.f25497k = maxNativeAd;
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
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
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
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward) {
            onUserRewarded(maxReward, null);
        }

        public /* synthetic */ d(g gVar, a aVar) {
            this();
        }

        public /* synthetic */ void a(ie ieVar, MaxReward maxReward, Bundle bundle) {
            this.f25510a.a(ieVar, maxReward, bundle);
        }

        private void b(String str, Bundle bundle) {
            if (g.this.f25495i.w().compareAndSet(false, true)) {
                a(str, this.f25510a, new q(this, bundle, 9));
            }
        }

        private void c(String str, Bundle bundle) {
            if (g.this.f25495i.w().get()) {
                com.applovin.impl.sdk.n unused = g.this.f25491c;
                if (com.applovin.impl.sdk.n.a()) {
                    g.this.f25491c.b("MediationAdapterWrapper", g.this.f25492f + ": blocking ad loaded callback for " + g.this.f25495i + " since onAdHidden() has been called");
                }
                g.this.f25490b.p().a(g.this.f25495i, str);
                return;
            }
            g.this.f25504r.set(true);
            a(str, this.f25510a, new q(this, bundle, 1));
        }

        public /* synthetic */ void d(Bundle bundle) {
            this.f25510a.a(g.this.f25495i, bundle);
        }

        public /* synthetic */ void e(Bundle bundle) {
            this.f25510a.a(g.this.f25495i, bundle);
        }

        public /* synthetic */ void f(Bundle bundle) {
            this.f25510a.a(g.this.f25495i, bundle);
        }

        public /* synthetic */ void g(Bundle bundle) {
            this.f25510a.a(g.this.f25495i, bundle);
        }

        public /* synthetic */ void h(Bundle bundle) {
            this.f25510a.c(g.this.f25495i, bundle);
        }

        public /* synthetic */ void i(Bundle bundle) {
            this.f25510a.c(g.this.f25495i, bundle);
        }

        public /* synthetic */ void j(Bundle bundle) {
            this.f25510a.e(g.this.f25495i, bundle);
        }

        public /* synthetic */ void k(Bundle bundle) {
            if (g.this.f25503q.compareAndSet(false, true)) {
                this.f25510a.f(g.this.f25495i, bundle);
            }
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": adview ad clicked with extra info: ", bundle));
            }
            a("onAdViewAdClicked", this.f25510a, new q(this, bundle, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", g.this.f25492f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f25510a, new r(this, 0));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            a("onAdViewAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            if (g.this.f25495i.a0()) {
                return;
            }
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": adview ad displayed with extra info: ", bundle));
            }
            a("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", g.this.f25492f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f25510a, new q(this, bundle, 10));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": adview ad hidden with extra info: ", bundle));
            }
            b("onAdViewAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": adview ad loaded with extra info: ", bundle));
            }
            g.this.f25496j = view;
            c("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": app open ad clicked with extra info: ", bundle));
            }
            a("onAppOpenAdClicked", this.f25510a, new q(this, bundle, 5));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": app open ad display failed with error: " + maxAdapterError);
            }
            a("onAppOpenAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": app open ad displayed with extra info: ", bundle));
            }
            a("onAppOpenAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": app open ad hidden with extra info: ", bundle));
            }
            b("onAppOpenAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener
        public void onAppOpenAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": app open ad loaded with extra info: ", bundle));
            }
            c("onAppOpenAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": interstitial ad clicked with extra info: ", bundle));
            }
            a("onInterstitialAdClicked", this.f25510a, new q(this, bundle, 8));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            a("onInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": interstitial ad displayed with extra info: ", bundle));
            }
            a("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": interstitial ad hidden with extra info ", bundle));
            }
            b("onInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": interstitial ad loaded with extra info: ", bundle));
            }
            c("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", g.this.f25492f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f25510a, new q(this, bundle, 3));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded ad clicked with extra info: ", bundle));
            }
            a("onRewardedAdClicked", this.f25510a, new q(this, bundle, 2));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded ad displayed with extra info: ", bundle));
            }
            a("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded ad hidden with extra info: ", bundle));
            }
            b("onRewardedAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded ad loaded with extra info: ", bundle));
            }
            c("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded interstitial ad clicked with extra info: ", bundle));
            }
            a("onRewardedInterstitialAdClicked", this.f25510a, new q(this, bundle, 4));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.k("MediationAdapterWrapper", g.this.f25492f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdDisplayFailed", maxAdapterError, bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded interstitial ad displayed with extra info: ", bundle));
            }
            a("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded interstitial ad hidden with extra info: ", bundle));
            }
            b("onRewardedInterstitialAdHidden", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.d("MediationAdapterWrapper", com.applovin.impl.adview.t.l(g.this, new StringBuilder(), ": rewarded interstitial ad loaded with extra info: ", bundle));
            }
            c("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(MaxReward maxReward, Bundle bundle) {
            if (g.this.f25495i instanceof ie) {
                ie ieVar = (ie) g.this.f25495i;
                if (ieVar.r0().compareAndSet(false, true)) {
                    com.applovin.impl.sdk.n unused = g.this.f25491c;
                    if (com.applovin.impl.sdk.n.a()) {
                        g.this.f25491c.d("MediationAdapterWrapper", g.this.f25492f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f25510a, new s(this, ieVar, maxReward, bundle, 0));
                }
            }
        }

        public /* synthetic */ void b(Bundle bundle) {
            this.f25510a.d(g.this.f25495i, bundle);
        }

        public void a(MediationServiceImpl.d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.f25510a = dVar;
        }

        public /* synthetic */ void c(Bundle bundle) {
            this.f25510a.a(g.this.f25495i, bundle);
        }

        public void a(String str, MaxError maxError) {
            if (g.this.f25495i.w().get()) {
                com.applovin.impl.sdk.n unused = g.this.f25491c;
                if (com.applovin.impl.sdk.n.a()) {
                    g.this.f25491c.b("MediationAdapterWrapper", g.this.f25492f + ": blocking ad load failed callback for " + g.this.f25495i + " since onAdHidden() has been called");
                }
                g.this.f25490b.p().a(g.this.f25495i, str);
                return;
            }
            a(str, this.f25510a, new t(0, this, maxError));
        }

        public /* synthetic */ void a(MaxError maxError) {
            if (g.this.f25503q.compareAndSet(false, true)) {
                this.f25510a.onAdLoadFailed(g.this.f25494h, maxError);
            }
        }

        private void a(String str, Bundle bundle) {
            if (!g.this.f25495i.w().get()) {
                if (!((Boolean) g.this.f25490b.a(ve.Z7)).booleanValue()) {
                    if (g.this.f25495i.u().compareAndSet(false, true)) {
                        a(str, this.f25510a, new q(this, bundle, 7));
                        return;
                    }
                    return;
                }
                a(str, this.f25510a, new q(this, bundle, 6));
                return;
            }
            com.applovin.impl.sdk.n unused = g.this.f25491c;
            if (com.applovin.impl.sdk.n.a()) {
                g.this.f25491c.b("MediationAdapterWrapper", g.this.f25492f + ": blocking ad displayed callback for " + g.this.f25495i + " since onAdHidden() has been called");
            }
            g.this.f25490b.p().a(g.this.f25495i, str);
        }

        public void a(String str, MaxError maxError, Bundle bundle) {
            if (g.this.f25495i.w().get()) {
                com.applovin.impl.sdk.n unused = g.this.f25491c;
                if (com.applovin.impl.sdk.n.a()) {
                    g.this.f25491c.b("MediationAdapterWrapper", g.this.f25492f + ": blocking ad display failed callback for " + g.this.f25495i + " since onAdHidden() has been called");
                }
                g.this.f25490b.p().a(g.this.f25495i, str);
                return;
            }
            a(str, this.f25510a, new u(this, 0, maxError, bundle));
        }

        public /* synthetic */ void a(MaxError maxError, Bundle bundle) {
            this.f25510a.a(g.this.f25495i, maxError, bundle);
        }

        public /* synthetic */ void a(Bundle bundle) {
            this.f25510a.a(g.this.f25495i, bundle);
        }

        public /* synthetic */ void a() {
            this.f25510a.onAdCollapsed(g.this.f25495i);
        }

        private void a(String str, MaxAdListener maxAdListener, Runnable runnable) {
            g.this.f25489a.post(new s(this, runnable, maxAdListener, str, 1));
        }

        public /* synthetic */ void a(Runnable runnable, MaxAdListener maxAdListener, String str) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("MediationAdapterWrapper", androidx.compose.foundation.text.input.a.l("Failed to forward call (", str, ") to ", maxAdListener != null ? maxAdListener.getClass().getName() : null), th);
                g.this.f25490b.E().a("MediationAdapterWrapper", str, th, CollectionUtils.hashMap("adapter_class", g.this.e.b()));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class e implements MaxAdapter.OnCompletionListener {

        /* renamed from: a */
        private final com.applovin.impl.sdk.j f25512a;

        /* renamed from: b */
        private final pe f25513b;

        /* renamed from: c */
        private final long f25514c;
        private final MaxAdapter.OnCompletionListener d;

        public e(com.applovin.impl.sdk.j jVar, pe peVar, long j2, MaxAdapter.OnCompletionListener onCompletionListener) {
            this.f25512a = jVar;
            this.f25513b = peVar;
            this.f25514c = j2;
            this.d = onCompletionListener;
        }

        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
        public void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new u(this, 1, initializationStatus, str), this.f25513b.h());
        }

        public /* synthetic */ void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
            this.f25512a.L().a(this.f25513b, SystemClock.elapsedRealtime() - this.f25514c, initializationStatus, str);
            MaxAdapter.OnCompletionListener onCompletionListener = this.d;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(initializationStatus, str);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class f {

        /* renamed from: a */
        private final zj f25515a;

        /* renamed from: b */
        private final c f25516b;

        /* renamed from: c */
        private final AtomicBoolean f25517c = new AtomicBoolean();

        public f(zj zjVar, c cVar) {
            this.f25515a = zjVar;
            this.f25516b = cVar;
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$g */
    /* loaded from: classes3.dex */
    public class C0088g extends yl {

        /* renamed from: h */
        private final WeakReference f25518h;

        public /* synthetic */ C0088g(g gVar, a aVar) {
            this();
        }

        private void b(ge geVar) {
            if (geVar != null) {
                this.f28216a.S().a(geVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f25503q.get()) {
                return;
            }
            if (g.this.f25495i.b0()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, g.this.f25492f + " is timing out, considering JS Tag ad loaded: " + g.this.f25495i);
                }
                b(g.this.f25495i);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, g.this.f25492f + " is timing out " + g.this.f25495i + "...");
            }
            b(g.this.f25495i);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-5101, "Adapter timed out");
            d dVar = (d) this.f25518h.get();
            if (dVar != null) {
                dVar.a(this.f28217b, maxErrorImpl);
            }
        }

        private C0088g() {
            super("TaskTimeoutMediatedAd", g.this.f25490b);
            this.f25518h = new WeakReference(g.this.f25500n);
        }
    }

    /* loaded from: classes3.dex */
    public class h extends yl {

        /* renamed from: h */
        private final f f25520h;

        public /* synthetic */ h(g gVar, f fVar, a aVar) {
            this(fVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25520h.f25517c.get()) {
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, g.this.f25492f + " is timing out " + this.f25520h.f25515a + "...");
            }
            g.this.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + g.this.f25492f + ") timed out"), this.f25520h);
        }

        private h(f fVar) {
            super("TaskTimeoutSignalCollection", g.this.f25490b);
            this.f25520h = fVar;
        }
    }

    public g(pe peVar, MaxAdapter maxAdapter, boolean z2, com.applovin.impl.sdk.j jVar) {
        if (peVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.d = peVar.c();
        this.f25493g = maxAdapter;
        this.f25490b = jVar;
        this.f25491c = jVar.J();
        this.e = peVar;
        this.f25492f = maxAdapter.getClass().getSimpleName();
        this.f25505s = z2;
    }

    public ViewGroup h() {
        return this.f25499m;
    }

    public String toString() {
        return android.support.v4.media.d.r(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f25492f, "'}");
    }

    public /* synthetic */ void l() {
        a("destroy");
        b bVar = new b();
        if (((Boolean) this.f25490b.a(ve.b8)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f25499m = viewGroup;
    }

    public void c(ge geVar, final Activity activity) {
        Runnable runnable;
        if (b(geVar, activity)) {
            final int i2 = 2;
            if (geVar.a0()) {
                runnable = new u(this, 2, geVar, activity);
            } else if (geVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i3 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f25542b;

                    {
                        this.f25542b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        Activity activity2 = activity;
                        g gVar = this.f25542b;
                        switch (i4) {
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
            } else if (geVar.getFormat() == MaxAdFormat.APP_OPEN) {
                final int i4 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f25542b;

                    {
                        this.f25542b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i4;
                        Activity activity2 = activity;
                        g gVar = this.f25542b;
                        switch (i42) {
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
            } else if (geVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f25542b;

                    {
                        this.f25542b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i2;
                        Activity activity2 = activity;
                        g gVar = this.f25542b;
                        switch (i42) {
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
            } else if (geVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                final int i5 = 3;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f25542b;

                    {
                        this.f25542b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i5;
                        Activity activity2 = activity;
                        g gVar = this.f25542b;
                        switch (i42) {
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
                throw new IllegalStateException("Failed to show " + geVar + ": " + geVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, geVar);
        }
    }

    public View d() {
        return this.f25496j;
    }

    public MaxNativeAd e() {
        return this.f25497k;
    }

    public MaxNativeAdView f() {
        return this.f25498l;
    }

    public String g() {
        return this.d;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f25493g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.d, th);
            this.f25490b.E().a("MediationAdapterWrapper", "sdk_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("sdk_version");
            this.f25490b.M().a(this.e.b(), "sdk_version", this.f25495i);
            return null;
        }
    }

    public boolean j() {
        return this.f25503q.get() && this.f25504r.get();
    }

    public boolean k() {
        return this.f25502p.get();
    }

    private boolean b(ge geVar, Activity activity) {
        if (geVar != null) {
            if (geVar.A() == null) {
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", "Adapter has been garbage collected");
                this.f25500n.a("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"), (Bundle) null);
                return false;
            }
            if (geVar.A() == this) {
                if (activity == null && MaxAdFormat.APP_OPEN != geVar.getFormat()) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (!this.f25502p.get()) {
                    String str = "Mediation adapter '" + this.f25492f + "' is disabled. Showing ads with this adapter is disabled.";
                    com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
                    this.f25500n.a("ad_show", new MaxErrorImpl(-1, str), (Bundle) null);
                    return false;
                }
                if (j()) {
                    return true;
                }
                throw new IllegalStateException(android.support.v4.media.d.r(new StringBuilder("Mediation adapter '"), this.f25492f, "' does not have an ad loaded. Please load an ad first"));
            }
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f25498l = maxNativeAdView;
    }

    public /* synthetic */ void d(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f25493g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, this.f25500n);
    }

    public /* synthetic */ void e(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MediationAdapterBase) this.f25493g).loadNativeAd(maxAdapterResponseParameters, activity, this.f25500n);
    }

    public void a(String str, ge geVar) {
        this.f25494h = str;
        this.f25495i = geVar;
    }

    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final zj zjVar, final Activity activity, c cVar) {
        if (cVar != null) {
            if (!this.f25502p.get()) {
                com.applovin.impl.sdk.n.h("MediationAdapterWrapper", "Mediation adapter '" + this.f25492f + "' is disabled. Signal collection ads with this adapter is disabled.");
                cVar.a(new MaxErrorImpl(android.support.v4.media.d.r(new StringBuilder("The adapter ("), this.f25492f, ") is disabled")));
                return;
            }
            final f fVar = new f(zjVar, cVar);
            MaxAdapter maxAdapter = this.f25493g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                b("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.a(zjVar, fVar, maxSignalProvider, maxAdapterSignalCollectionParameters, activity);
                    }
                });
                return;
            } else {
                a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, android.support.v4.media.d.r(new StringBuilder("The adapter ("), this.f25492f, ") does not support signal collection")), fVar);
                return;
            }
        }
        throw new IllegalArgumentException("No callback specified");
    }

    public /* synthetic */ void d(Activity activity) {
        ((MaxInterstitialAdapter) this.f25493g).showInterstitialAd(this.f25501o, activity, this.f25500n);
    }

    public MediationServiceImpl.d c() {
        return this.f25500n.f25510a;
    }

    public /* synthetic */ void c(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxRewardedAdapter) this.f25493g).loadRewardedAd(maxAdapterResponseParameters, activity, this.f25500n);
    }

    public /* synthetic */ void c(Activity activity) {
        ((MaxRewardedInterstitialAdapter) this.f25493g).showRewardedInterstitialAd(this.f25501o, activity, this.f25500n);
    }

    public /* synthetic */ void b(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxAppOpenAdapter) this.f25493g).loadAppOpenAd(maxAdapterResponseParameters, activity, this.f25500n);
    }

    private void a(Runnable runnable, ge geVar) {
        a("show_ad", geVar.getFormat(), new t(4, this, runnable));
    }

    public /* synthetic */ void a(zj zjVar, f fVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity) {
        a(zjVar, fVar);
        try {
            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new a(zjVar, fVar));
        } catch (Throwable th) {
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl("Failed signal collection for " + this.d + " due to: " + th);
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", maxErrorImpl.getMessage());
            a(maxErrorImpl, fVar);
            this.f25490b.E().a("MediationAdapterWrapper", "collect_signal", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("collect_signal");
            this.f25490b.M().a(this.e.b(), "collect_signal", this.f25495i);
        }
        if (!fVar.f25517c.get() && zjVar.m() == 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25491c.a("MediationAdapterWrapper", "Failing signal collection " + zjVar + " since it has 0 timeout");
            }
            a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, android.support.v4.media.d.r(new StringBuilder("The adapter ("), this.f25492f, ") has 0 timeout")), fVar);
        }
    }

    public /* synthetic */ void b(Activity activity) {
        ((MaxRewardedAdapter) this.f25493g).showRewardedAd(this.f25501o, activity, this.f25500n);
    }

    public /* synthetic */ void b(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxRewardedAdViewAdapter) this.f25493g).showRewardedAd(this.f25501o, viewGroup, lifecycle, activity, this.f25500n);
    }

    public String b() {
        MaxAdapter maxAdapter = this.f25493g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.d, th);
            this.f25490b.E().a("MediationAdapterWrapper", "adapter_version", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("adapter_version");
            this.f25490b.M().a(this.e.b(), "adapter_version", this.f25495i);
            return null;
        }
    }

    private void b(String str, Runnable runnable) {
        a(str, (MaxAdFormat) null, runnable);
    }

    public /* synthetic */ void a(ge geVar, Runnable runnable) {
        a(this.e, geVar);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start loading ad for " + this.d + " due to: " + th;
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
            this.f25500n.a("load_ad", new MaxErrorImpl(-1, str));
            this.f25490b.E().a("MediationAdapterWrapper", "load_ad", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("load_ad");
            this.f25490b.M().a(this.e.b(), "load_ad", this.f25495i);
        }
    }

    public /* synthetic */ void a(ge geVar, Activity activity) {
        this.f25490b.F().a((ie) geVar, activity, this.f25500n);
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, ge geVar, final Activity activity, MediationServiceImpl.d dVar) {
        Object sVar;
        if (geVar != null) {
            if (this.f25502p.get()) {
                this.f25501o = maxAdapterResponseParameters;
                this.f25500n.a(dVar);
                MaxAdFormat I = geVar.a0() ? geVar.I() : geVar.getFormat();
                final int i2 = 4;
                if (I == MaxAdFormat.INTERSTITIAL) {
                    final int i3 = 0;
                    sVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f25554b;

                        {
                            this.f25554b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            g gVar = this.f25554b;
                            Activity activity2 = activity;
                            MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                            switch (i4) {
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
                } else if (I == MaxAdFormat.APP_OPEN) {
                    final int i4 = 1;
                    sVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f25554b;

                        {
                            this.f25554b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i4;
                            g gVar = this.f25554b;
                            Activity activity2 = activity;
                            MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                            switch (i42) {
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
                } else if (I == MaxAdFormat.REWARDED) {
                    final int i5 = 2;
                    sVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f25554b;

                        {
                            this.f25554b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i5;
                            g gVar = this.f25554b;
                            Activity activity2 = activity;
                            MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                            switch (i42) {
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
                } else if (I == MaxAdFormat.REWARDED_INTERSTITIAL) {
                    final int i6 = 3;
                    sVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f25554b;

                        {
                            this.f25554b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i6;
                            g gVar = this.f25554b;
                            Activity activity2 = activity;
                            MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                            switch (i42) {
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
                } else if (I == MaxAdFormat.NATIVE) {
                    sVar = new Runnable(this) { // from class: com.applovin.impl.mediation.p

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f25554b;

                        {
                            this.f25554b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i2;
                            g gVar = this.f25554b;
                            Activity activity2 = activity;
                            MaxAdapterResponseParameters maxAdapterResponseParameters2 = maxAdapterResponseParameters;
                            switch (i42) {
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
                } else if (I.isAdViewAd()) {
                    sVar = new s(this, maxAdapterResponseParameters, I, activity, 4);
                } else {
                    throw new IllegalStateException("Failed to load " + geVar + ": " + geVar.getFormat() + " (" + geVar.I() + ") is not a supported ad format");
                }
                a("load_ad", I, new u(this, 4, geVar, sVar));
                return;
            }
            String str2 = "Mediation adapter '" + this.f25492f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str2);
            dVar.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    private void a(pe peVar, ge geVar) {
        a(new C0088g(this, null), peVar, geVar);
    }

    private void a(pe peVar, f fVar) {
        a(new h(this, fVar, null), peVar, (ge) null);
    }

    private void a(yl ylVar, pe peVar, ge geVar) {
        long m2 = peVar.m();
        if (m2 <= 0) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f25491c;
                StringBuilder sb = new StringBuilder("Non-positive timeout set for ");
                if (geVar != null) {
                    peVar = geVar;
                }
                sb.append(peVar);
                sb.append(", not scheduling a timeout");
                nVar.a("MediationAdapterWrapper", sb.toString());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.f25491c;
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Setting timeout ", m2, "ms for ");
            if (geVar != null) {
                peVar = geVar;
            }
            r2.append(peVar);
            nVar2.a("MediationAdapterWrapper", r2.toString());
        }
        this.f25490b.j0().a(ylVar, tm.b.TIMEOUT, m2);
    }

    public void a(ge geVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (b(geVar, activity)) {
            if (geVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                final int i2 = 0;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.n

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f25545b;

                    {
                        this.f25545b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        ViewGroup viewGroup2 = viewGroup;
                        g gVar = this.f25545b;
                        Activity activity2 = activity;
                        Lifecycle lifecycle2 = lifecycle;
                        switch (i3) {
                            case 0:
                                gVar.a(viewGroup2, lifecycle2, activity2);
                                return;
                            default:
                                gVar.b(viewGroup2, lifecycle2, activity2);
                                return;
                        }
                    }
                };
            } else if (geVar.getFormat() == MaxAdFormat.REWARDED) {
                final int i3 = 1;
                runnable = new Runnable(this) { // from class: com.applovin.impl.mediation.n

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f25545b;

                    {
                        this.f25545b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        ViewGroup viewGroup2 = viewGroup;
                        g gVar = this.f25545b;
                        Activity activity2 = activity;
                        Lifecycle lifecycle2 = lifecycle;
                        switch (i32) {
                            case 0:
                                gVar.a(viewGroup2, lifecycle2, activity2);
                                return;
                            default:
                                gVar.b(viewGroup2, lifecycle2, activity2);
                                return;
                        }
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + geVar + ": " + geVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, geVar);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        b("initialize", new s(this, onCompletionListener, maxAdapterInitializationParameters, activity, 3));
    }

    public /* synthetic */ void a(MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (com.applovin.impl.sdk.n.a()) {
            this.f25491c.a("MediationAdapterWrapper", "Initializing " + this.f25492f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + this.e.r());
        }
        this.f25493g.initialize(maxAdapterInitializationParameters, activity, new e(this.f25490b, this.e, elapsedRealtime, onCompletionListener));
    }

    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        ((MaxInterstitialAdapter) this.f25493g).loadInterstitialAd(maxAdapterResponseParameters, activity, this.f25500n);
    }

    public /* synthetic */ void a(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        ((MaxAdViewAdapter) this.f25493g).loadAdViewAd(maxAdapterResponseParameters, maxAdFormat, activity, this.f25500n);
    }

    public /* synthetic */ void a(Activity activity) {
        ((MaxAppOpenAdapter) this.f25493g).showAppOpenAd(this.f25501o, activity, this.f25500n);
    }

    public /* synthetic */ void a(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        ((MaxInterstitialAdViewAdapter) this.f25493g).showInterstitialAd(this.f25501o, viewGroup, lifecycle, activity, this.f25500n);
    }

    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = "Failed to start displaying ad for " + this.d + " due to: " + th;
            com.applovin.impl.sdk.n.h("MediationAdapterWrapper", str);
            this.f25500n.a("show_ad", new MaxErrorImpl(-1, str), (Bundle) null);
            this.f25490b.E().a("MediationAdapterWrapper", "show_ad", th, CollectionUtils.hashMap("adapter_class", this.e.b()));
            a("show_ad");
            this.f25490b.M().a(this.e.b(), "show_ad", this.f25495i);
        }
    }

    public void a() {
        if (this.f25505s) {
            return;
        }
        b("destroy", new r(this, 1));
    }

    public void a(String str, f fVar) {
        if (!fVar.f25517c.compareAndSet(false, true) || fVar.f25516b == null) {
            return;
        }
        fVar.f25516b.onSignalCollected(str);
    }

    public void a(MaxError maxError, f fVar) {
        if (!fVar.f25517c.compareAndSet(false, true) || fVar.f25516b == null) {
            return;
        }
        fVar.f25516b.a(maxError);
    }

    private void a(String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25491c.d("MediationAdapterWrapper", "Marking " + this.f25492f + " as disabled due to: " + str);
        }
        this.f25502p.set(false);
    }

    private void a(String str, MaxAdFormat maxAdFormat, Runnable runnable) {
        u uVar = new u(this, 3, str, runnable);
        if (a(str, maxAdFormat)) {
            this.f25489a.post(uVar);
            return;
        }
        StringBuilder B = androidx.compose.foundation.text.input.a.B(str, CertificateUtil.DELIMITER);
        B.append(this.e.c());
        jn jnVar = new jn(this.f25490b, B.toString(), uVar);
        if (((Boolean) this.f25490b.a(sj.f26910d0)).booleanValue()) {
            this.f25490b.j0().a(jnVar, this.e);
        } else {
            this.f25490b.j0().a(jnVar);
        }
    }

    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25491c.a("MediationAdapterWrapper", this.f25492f + ": running " + str + "...");
            }
            runnable.run();
            if (com.applovin.impl.sdk.n.a()) {
                this.f25491c.a("MediationAdapterWrapper", this.f25492f + ": finished " + str + "");
            }
        } catch (Throwable th) {
            StringBuilder v2 = android.support.v4.media.d.v("Failed operation ", str, " for ");
            v2.append(this.d);
            com.applovin.impl.sdk.n.c("MediationAdapterWrapper", v2.toString(), th);
            a("fail_" + str);
            if (!str.equals("destroy")) {
                this.f25490b.M().a(this.e.b(), str, this.f25495i);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("is_wrapper", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            CollectionUtils.putStringIfValid("adapter_class", this.e.b(), hashMap);
            this.f25490b.E().a("MediationAdapterWrapper", str, th, hashMap);
        }
    }

    private boolean a(String str, MaxAdFormat maxAdFormat) {
        Boolean shouldShowAdsOnUiThread;
        MaxAdapter maxAdapter = this.f25493g;
        if (maxAdapter == null) {
            return this.e.r();
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
        return this.e.r();
    }
}
