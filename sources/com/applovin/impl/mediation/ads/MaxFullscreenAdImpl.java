package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.p;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.gf;
import com.applovin.impl.h8;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0033a, v.b {
    private final b a;

    /* renamed from: b */
    private final WeakReference f6036b;

    /* renamed from: c */
    private final com.applovin.impl.mediation.b f6037c;

    /* renamed from: d */
    private final Object f6038d;

    /* renamed from: e */
    private de f6039e;

    /* renamed from: f */
    private d f6040f;

    /* renamed from: g */
    private de f6041g;

    /* renamed from: h */
    private final AtomicBoolean f6042h;

    /* renamed from: i */
    private final AtomicBoolean f6043i;

    /* renamed from: j */
    private boolean f6044j;

    /* renamed from: k */
    private boolean f6045k;

    /* renamed from: l */
    private WeakReference f6046l;
    protected final c listenerWrapper;

    /* renamed from: m */
    private WeakReference f6047m;

    /* renamed from: n */
    private WeakReference f6048n;

    /* loaded from: classes.dex */
    public interface b {
        Activity getActivity();
    }

    /* loaded from: classes.dex */
    public class c implements MaxAdListener, MaxRewardedAdListener, MaxAdRevenueListener, a.InterfaceC0023a {
        private c() {
        }

        public static /* synthetic */ void c(c cVar) {
            cVar.a();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z10 = MaxFullscreenAdImpl.this.f6045k;
            MaxFullscreenAdImpl.this.f6045k = false;
            final de deVar = (de) maxAd;
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.j
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.c.this.a(maxAd, z10, deVar, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            de deVar = (de) maxAd;
            MaxFullscreenAdImpl.this.f6041g = deVar;
            MaxFullscreenAdImpl.this.f6045k = false;
            MaxFullscreenAdImpl.this.sdk.f().a(deVar);
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f6045k = false;
            MaxFullscreenAdImpl.this.a(d.IDLE, new k(this, maxAd, 0));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.l
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.c.this.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            de deVar;
            synchronized (MaxFullscreenAdImpl.this.f6038d) {
                deVar = MaxFullscreenAdImpl.this.f6039e;
            }
            MaxFullscreenAdImpl.this.sdk.E().a(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((de) maxAd);
            int i10 = 1;
            if (!MaxFullscreenAdImpl.this.f6042h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(d.READY, new k(this, maxAd, i10));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f6043i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.e();
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + deVar + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            bc.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) deVar, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder o10 = a4.j.o("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                o10.append(MaxFullscreenAdImpl.this.requestListener);
                tVar2.a(str2, o10.toString());
            }
            bc.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            bc.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onRewardedVideoCompleted(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.g(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onRewardedVideoStarted(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.h(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb2.append(maxAd);
                sb2.append(", reward=");
                sb2.append(maxReward);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }

        public /* synthetic */ c(MaxFullscreenAdImpl maxFullscreenAdImpl, a aVar) {
            this();
        }

        public /* synthetic */ void a(MaxAd maxAd, boolean z10, de deVar, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z10 && deVar.r0() && MaxFullscreenAdImpl.this.sdk.M().d(MaxFullscreenAdImpl.this.adUnitId)) {
                AppLovinSdkUtils.runOnUiThread(true, new m(this, 0));
                return;
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(maxAd);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        public /* synthetic */ void b(MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f6045k) {
                MaxFullscreenAdImpl.this.e();
                return;
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public /* synthetic */ void a(String str, MaxError maxError) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str2);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f6045k = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        default void a(MaxError maxError) {
        }
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, b bVar, String str2, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f6038d = new Object();
        this.f6039e = null;
        this.f6040f = d.IDLE;
        this.f6041g = null;
        this.f6042h = new AtomicBoolean();
        this.f6043i = new AtomicBoolean();
        this.f6046l = new WeakReference(null);
        this.f6047m = new WeakReference(null);
        this.f6048n = new WeakReference(null);
        this.a = bVar;
        this.listenerWrapper = new c(this, null);
        this.f6037c = new com.applovin.impl.mediation.b(kVar);
        this.f6036b = new WeakReference(context);
        kVar.h().a(this);
        t.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public static /* synthetic */ void l(MaxFullscreenAdImpl maxFullscreenAdImpl) {
        maxFullscreenAdImpl.c();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(d.DESTROYED, new e() { // from class: com.applovin.impl.mediation.ads.f
            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public final void a() {
                MaxFullscreenAdImpl.this.b();
            }
        });
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f6038d) {
            de deVar = this.f6039e;
            if (deVar != null && deVar.Z() && this.f6040f == d.READY) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            this.sdk.E().c(this.adUnitId);
        }
        return z10;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0033a
    public void onAdExpired(h8 h8Var) {
        Activity activity;
        if (t.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f6042h.set(true);
        b bVar = this.a;
        if (bVar != null) {
            activity = bVar.getActivity();
        } else {
            activity = null;
        }
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            d();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.S().loadAd(this.adUnitId, null, this.adFormat, d.b.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
        }
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        de deVar = this.f6039e;
        if (deVar != null && deVar.Q().equalsIgnoreCase(str)) {
            this.f6039e.h(str2);
            bc.b(this.adReviewListener, str2, this.f6039e);
        }
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        List b3 = this.sdk.n0().b();
        if (this.sdk.n0().d() && b3 != null && !b3.contains(this.f6039e.c())) {
            String str3 = "Attempting to show ad from <" + this.f6039e.c() + "> which is not in the list of selected ad networks " + b3;
            t.h(this.tag, str3);
            a(d.IDLE, new g(this, str3, 1));
            return;
        }
        if (activity == null) {
            activity = this.sdk.p0();
        }
        if (a(activity, str)) {
            a(d.SHOWING, new e() { // from class: com.applovin.impl.mediation.ads.i
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.this.a(str, str2, activity);
                }
            });
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public void a(de deVar) {
        if (this.sdk.f().a(deVar, this)) {
            if (t.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + deVar);
            }
            this.f6039e = deVar;
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(deVar);
    }

    public /* synthetic */ void c() {
        if (this.f6043i.compareAndSet(true, false)) {
            t.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.E().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            gf gfVar = new gf(this.adUnitId, this.adFormat, this.f6039e.getPlacement());
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(gfVar);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, this.adListener, tVar, str);
            }
            bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
            if (this.f6039e != null) {
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f6039e);
            }
        }
    }

    public void d() {
        de deVar;
        if (this.f6042h.compareAndSet(true, false)) {
            synchronized (this.f6038d) {
                deVar = this.f6039e;
                this.f6039e = null;
            }
            this.sdk.S().destroyAd(deVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public void e() {
        Activity activity = (Activity) this.f6046l.get();
        if (activity == null) {
            activity = this.sdk.p0();
        }
        Activity activity2 = activity;
        if (this.f6044j) {
            showAd(this.f6039e.getPlacement(), this.f6039e.e(), (ViewGroup) this.f6047m.get(), (p) this.f6048n.get(), activity2);
        } else {
            showAd(this.f6039e.getPlacement(), this.f6039e.e(), activity2);
        }
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f6040f == d.DESTROYED) {
            boolean c10 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c10));
            if (c10) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (isReady()) {
            if (t.a()) {
                this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(this.f6039e);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, this.adListener, tVar, str);
            }
            bc.f(this.adListener, (MaxAd) this.f6039e, true);
            return;
        }
        b bVar2 = this.a;
        a(d.LOADING, new a(bVar2 != null ? bVar2.getActivity() : null, (Context) this.f6036b.get(), bVar));
    }

    public /* synthetic */ void b() {
        synchronized (this.f6038d) {
            if (this.f6039e != null) {
                if (t.a()) {
                    this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f6039e + "...");
                }
                this.sdk.S().destroyAd(this.f6039e);
            }
        }
        this.sdk.h().b(this);
        this.f6037c.a();
        super.destroy();
    }

    /* loaded from: classes.dex */
    public class a implements e {
        final /* synthetic */ Activity a;

        /* renamed from: b */
        final /* synthetic */ Context f6049b;

        /* renamed from: c */
        final /* synthetic */ d.b f6050c;

        public a(Activity activity, Context context, d.b bVar) {
            this.a = activity;
            this.f6049b = context;
            this.f6050c = bVar;
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a() {
            Context context = this.a;
            if (context == null && (context = this.f6049b) == null) {
                if (MaxFullscreenAdImpl.this.sdk.p0() != null) {
                    context = MaxFullscreenAdImpl.this.sdk.p0();
                } else {
                    context = com.applovin.impl.sdk.k.k();
                }
            }
            Context context2 = context;
            MediationServiceImpl S = MaxFullscreenAdImpl.this.sdk.S();
            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
            S.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, this.f6050c, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context2, maxFullscreenAdImpl.listenerWrapper);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a(MaxError maxError) {
            if (((Boolean) MaxFullscreenAdImpl.this.sdk.a(qe.L7)).booleanValue()) {
                t tVar = MaxFullscreenAdImpl.this.logger;
                if (t.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    t tVar2 = maxFullscreenAdImpl.logger;
                    String str = maxFullscreenAdImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                    sb2.append(MaxFullscreenAdImpl.this.adUnitId);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.e.u(sb2, MaxFullscreenAdImpl.this.adListener, tVar2, str);
                }
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                bc.a(maxFullscreenAdImpl2.adListener, maxFullscreenAdImpl2.adUnitId, maxError, true);
            }
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final p pVar, Activity activity) {
        if (viewGroup != null && pVar != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(qe.B7)).booleanValue()) {
                t.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                bc.a(this.adListener, (MaxAd) this.f6039e, (MaxError) maxErrorImpl, true);
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f6039e);
                return;
            }
            List b3 = this.sdk.n0().b();
            if (this.sdk.n0().d() && b3 != null && !b3.contains(this.f6039e.c())) {
                String str3 = "Attempting to show ad from <" + this.f6039e.c() + "> which is not in the list of selected ad networks " + b3;
                t.h(this.tag, str3);
                a(d.IDLE, new g(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.p0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(d.SHOWING, new e() { // from class: com.applovin.impl.mediation.ads.h
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        MaxFullscreenAdImpl.this.a(str, str2, activity2, viewGroup, pVar);
                    }
                });
                return;
            }
            return;
        }
        t.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (t.a()) {
            t tVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(this.f6039e);
            sb2.append(", error=");
            sb2.append(maxErrorImpl2);
            sb2.append("), listener=");
            com.applovin.impl.mediation.ads.e.u(sb2, this.adListener, tVar, str4);
        }
        bc.a(this.adListener, (MaxAd) this.f6039e, (MaxError) maxErrorImpl2, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f6039e);
    }

    public /* synthetic */ void a(String str) {
        de deVar = this.f6039e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(deVar);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            com.applovin.impl.mediation.ads.e.u(sb2, this.adListener, tVar, str2);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    public /* synthetic */ void b(String str) {
        de deVar = this.f6039e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(deVar);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            com.applovin.impl.mediation.ads.e.u(sb2, this.adListener, tVar, str2);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f6044j = false;
        this.f6046l = new WeakReference(activity);
        this.sdk.S().showFullscreenAd(this.f6039e, activity, this.listenerWrapper);
    }

    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, p pVar) {
        a(str, str2);
        this.f6044j = true;
        this.f6046l = new WeakReference(activity);
        this.f6047m = new WeakReference(viewGroup);
        this.f6048n = new WeakReference(pVar);
        this.sdk.S().showFullscreenAd(this.f6039e, viewGroup, pVar, activity, this.listenerWrapper);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f6040f == d.DESTROYED) {
            boolean c10 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToShowDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c10));
            if (c10) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String h10 = vd.e.h(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            t.h(this.tag, h10);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, h10);
            gf gfVar = new gf(this.adUnitId, this.adFormat, str);
            if (t.a()) {
                t tVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(gfVar);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb2, this.adListener, tVar, str2);
            }
            bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
            if (this.f6039e != null) {
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f6039e);
            }
            return false;
        }
        Long l10 = (Long) this.sdk.a(qe.f7203o7);
        Long l11 = (Long) this.sdk.a(qe.f7196h7);
        if (l10.longValue() > 0 && (this.f6039e.getTimeToLiveMillis() < l11.longValue() || this.f6042h.get())) {
            this.f6043i.set(true);
            this.sdk.l0().a(new kn(this.sdk, "handleShowOnLoadTimeoutError", new m(this, 2)), sm.b.TIMEOUT, l10.longValue());
            return false;
        }
        if (zp.a(com.applovin.impl.sdk.k.k()) != 0 && this.sdk.g0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!zp.c(this.sdk)) {
                if (((Boolean) this.sdk.a(qe.A7)).booleanValue()) {
                    t.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (t.a()) {
                        t tVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb3.append(this.f6039e);
                        sb3.append(", error=");
                        sb3.append(maxErrorImpl2);
                        sb3.append("), listener=");
                        com.applovin.impl.mediation.ads.e.u(sb3, this.adListener, tVar2, str3);
                    }
                    bc.a(this.adListener, (MaxAd) this.f6039e, (MaxError) maxErrorImpl2, true);
                    this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f6039e);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.E().d() && !this.sdk.E().c()) {
            String str4 = (String) a4.j.b(this.sdk, "fullscreen_ads_block_showing_if_activity_is_finishing");
            if (((!StringUtils.isValidString(str4) || !Boolean.valueOf(str4).booleanValue()) && !((Boolean) this.sdk.a(qe.f7195g7)).booleanValue()) || activity == null || !activity.isFinishing()) {
                return true;
            }
            t.h(this.tag, "Attempting to show ad when activity is finishing");
            MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing");
            if (t.a()) {
                t tVar3 = this.logger;
                String str5 = this.tag;
                StringBuilder sb4 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb4.append(this.f6039e);
                sb4.append(", error=");
                sb4.append(maxErrorImpl3);
                sb4.append("), listener=");
                com.applovin.impl.mediation.ads.e.u(sb4, this.adListener, tVar3, str5);
            }
            bc.a(this.adListener, (MaxAd) this.f6039e, (MaxError) maxErrorImpl3, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f6039e);
            return false;
        }
        t.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        if (((Boolean) this.sdk.a(qe.K7)).booleanValue()) {
            if (this.f6041g != null) {
                HashMap<String, String> hashMap = CollectionUtils.hashMap("source", this.tag);
                hashMap.put("adapter_version", this.f6041g.y());
                hashMap.put("error_message", "Attempting to show ad when another fullscreen ad is already showing");
                this.sdk.B().a(o.b.DISPLAY_ERROR, this.f6041g, hashMap, 0L);
            } else if (t.a()) {
                this.logger.a(this.tag, "Unable to submit error report for previously displayed ad because it doesn't exist");
            }
        }
        MaxErrorImpl maxErrorImpl4 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (t.a()) {
            t tVar4 = this.logger;
            String str6 = this.tag;
            StringBuilder sb5 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb5.append(this.f6039e);
            sb5.append(", error=");
            sb5.append(maxErrorImpl4);
            sb5.append("), listener=");
            com.applovin.impl.mediation.ads.e.u(sb5, this.adListener, tVar4, str6);
        }
        bc.a(this.adListener, (MaxAd) this.f6039e, (MaxError) maxErrorImpl4, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl4, this.f6039e);
        return false;
    }

    private void a(String str, String str2) {
        this.f6037c.e(this.f6039e);
        this.f6039e.g(str);
        this.f6039e.f(str2);
        this.sdk.v().d(this.f6039e);
        if (t.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f6039e + "...");
        }
        a((be) this.f6039e);
    }

    private void a() {
        de deVar;
        synchronized (this.f6038d) {
            deVar = this.f6039e;
            this.f6039e = null;
        }
        this.sdk.S().destroyAd(deVar);
    }

    public void a(d dVar, e eVar) {
        MaxErrorImpl maxErrorImpl;
        boolean z10;
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1);
        d dVar2 = this.f6040f;
        synchronized (this.f6038d) {
            d dVar3 = d.IDLE;
            if (dVar2 == dVar3) {
                if (dVar != d.LOADING && dVar != d.DESTROYED) {
                    if (dVar == d.SHOWING) {
                        t.h(this.tag, "No ad is loading or loaded");
                    } else if (t.a()) {
                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                    }
                    z10 = false;
                }
                z10 = true;
            } else {
                d dVar4 = d.LOADING;
                if (dVar2 == dVar4) {
                    if (dVar != dVar3) {
                        if (dVar == dVar4) {
                            maxErrorImpl = new MaxErrorImpl(-26, "An ad is already loading");
                            t.h(this.tag, maxErrorImpl.getMessage());
                            maxErrorImpl2 = maxErrorImpl;
                            z10 = false;
                        } else if (dVar != d.READY) {
                            if (dVar == d.SHOWING) {
                                t.h(this.tag, "An ad is not ready to be shown yet");
                            } else if (dVar != d.DESTROYED) {
                                if (t.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                }
                            }
                            z10 = false;
                        }
                    }
                    z10 = true;
                } else {
                    d dVar5 = d.READY;
                    if (dVar2 == dVar5) {
                        if (dVar != dVar3) {
                            if (dVar == dVar4) {
                                t.h(this.tag, "An ad is already loaded");
                            } else if (dVar == dVar5) {
                                if (t.a()) {
                                    this.logger.b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (dVar != d.SHOWING && dVar != d.DESTROYED) {
                                if (t.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        d dVar6 = d.SHOWING;
                        if (dVar2 == dVar6) {
                            if (dVar != dVar3) {
                                if (dVar == dVar4) {
                                    maxErrorImpl = new MaxErrorImpl(-27, "Can not load another ad while the ad is showing");
                                    t.h(this.tag, maxErrorImpl.getMessage());
                                    maxErrorImpl2 = maxErrorImpl;
                                } else if (dVar == dVar5) {
                                    if (t.a()) {
                                        this.logger.b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (dVar == dVar6) {
                                    t.h(this.tag, "The ad is already showing, not showing another one");
                                } else if (dVar != d.DESTROYED) {
                                    if (t.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                    }
                                }
                            }
                            z10 = true;
                        } else if (dVar2 == d.DESTROYED) {
                            t.h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (t.a()) {
                            this.logger.b(this.tag, "Unknown state: " + this.f6040f);
                        }
                        z10 = false;
                    }
                }
            }
            if (z10) {
                if (t.a()) {
                    this.logger.a(this.tag, "Transitioning from " + this.f6040f + " to " + dVar + "...");
                }
                this.f6040f = dVar;
            } else if (t.a()) {
                this.logger.k(this.tag, "Not allowed to transition from " + this.f6040f + " to " + dVar);
            }
        }
        if (z10) {
            eVar.a();
        } else {
            eVar.a(maxErrorImpl2);
        }
    }

    public void a(MaxAd maxAd) {
        this.sdk.f().a((de) maxAd);
        this.f6037c.a();
        a();
        this.sdk.V().a((be) maxAd);
    }
}
