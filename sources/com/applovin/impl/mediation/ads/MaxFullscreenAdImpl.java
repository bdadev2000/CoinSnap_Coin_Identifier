package com.applovin.impl.mediation.ads;

import Q7.n0;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC0505o;
import com.applovin.impl.C0765v;
import com.applovin.impl.L;
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
import com.applovin.impl.sdk.C0749a;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
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
import com.mbridge.msdk.foundation.entity.o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements C0749a.InterfaceC0033a, C0765v.b {

    /* renamed from: a */
    private final b f8992a;
    private final WeakReference b;

    /* renamed from: c */
    private final com.applovin.impl.mediation.b f8993c;

    /* renamed from: d */
    private final Object f8994d;

    /* renamed from: e */
    private de f8995e;

    /* renamed from: f */
    private d f8996f;

    /* renamed from: g */
    private de f8997g;

    /* renamed from: h */
    private final AtomicBoolean f8998h;

    /* renamed from: i */
    private final AtomicBoolean f8999i;

    /* renamed from: j */
    private boolean f9000j;

    /* renamed from: k */
    private boolean f9001k;
    private WeakReference l;
    protected final c listenerWrapper;
    private WeakReference m;

    /* renamed from: n */
    private WeakReference f9002n;

    /* loaded from: classes.dex */
    public interface b {
        Activity getActivity();
    }

    /* loaded from: classes.dex */
    public class c implements MaxAdListener, MaxRewardedAdListener, MaxAdRevenueListener, a.InterfaceC0023a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z8 = MaxFullscreenAdImpl.this.f9001k;
            MaxFullscreenAdImpl.this.f9001k = false;
            final de deVar = (de) maxAd;
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.k
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.c.this.a(maxAd, z8, deVar, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            de deVar = (de) maxAd;
            MaxFullscreenAdImpl.this.f8997g = deVar;
            MaxFullscreenAdImpl.this.f9001k = false;
            MaxFullscreenAdImpl.this.sdk.f().a(deVar);
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f9001k = false;
            MaxFullscreenAdImpl.this.a(d.IDLE, new j(this, maxAd, 1));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.i
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.c.this.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            de deVar;
            synchronized (MaxFullscreenAdImpl.this.f8994d) {
                deVar = MaxFullscreenAdImpl.this.f8995e;
            }
            MaxFullscreenAdImpl.this.sdk.E().a(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((de) maxAd);
            if (!MaxFullscreenAdImpl.this.f8998h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(d.READY, new j(this, maxAd, 0));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f8999i.compareAndSet(true, false)) {
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
                StringBuilder n2 = o.n("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                n2.append(MaxFullscreenAdImpl.this.requestListener);
                tVar2.a(str2, n2.toString());
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
                StringBuilder sb = new StringBuilder("MaxRewardedAdListener.onRewardedVideoCompleted(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
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
                StringBuilder sb = new StringBuilder("MaxRewardedAdListener.onRewardedVideoStarted(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
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
                StringBuilder sb = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb.append(maxAd);
                sb.append(", reward=");
                sb.append(maxReward);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }

        public /* synthetic */ c(MaxFullscreenAdImpl maxFullscreenAdImpl, a aVar) {
            this();
        }

        public /* synthetic */ void a(MaxAd maxAd, boolean z8, de deVar, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z8 && deVar.r0() && MaxFullscreenAdImpl.this.sdk.M().d(MaxFullscreenAdImpl.this.adUnitId)) {
                AppLovinSdkUtils.runOnUiThread(true, new l(this, 0));
                return;
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(maxAd);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        public /* synthetic */ void b(MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f9001k) {
                MaxFullscreenAdImpl.this.e();
                return;
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public /* synthetic */ void a(String str, MaxError maxError) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str2);
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
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
            }
            bc.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f9001k = true;
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
        this.f8994d = new Object();
        this.f8995e = null;
        this.f8996f = d.IDLE;
        this.f8997g = null;
        this.f8998h = new AtomicBoolean();
        this.f8999i = new AtomicBoolean();
        this.l = new WeakReference(null);
        this.m = new WeakReference(null);
        this.f9002n = new WeakReference(null);
        this.f8992a = bVar;
        this.listenerWrapper = new c(this, null);
        this.f8993c = new com.applovin.impl.mediation.b(kVar);
        this.b = new WeakReference(context);
        kVar.h().a(this);
        t.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(d.DESTROYED, new e() { // from class: com.applovin.impl.mediation.ads.g
            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public final void a() {
                MaxFullscreenAdImpl.this.b();
            }
        });
    }

    public boolean isReady() {
        boolean z8;
        synchronized (this.f8994d) {
            try {
                de deVar = this.f8995e;
                if (deVar != null && deVar.Z() && this.f8996f == d.READY) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z8) {
            this.sdk.E().c(this.adUnitId);
        }
        return z8;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.C0749a.InterfaceC0033a
    public void onAdExpired(h8 h8Var) {
        Activity activity;
        if (t.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f8998h.set(true);
        b bVar = this.f8992a;
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

    @Override // com.applovin.impl.C0765v.b
    public void onCreativeIdGenerated(String str, String str2) {
        de deVar = this.f8995e;
        if (deVar != null && deVar.Q().equalsIgnoreCase(str)) {
            this.f8995e.h(str2);
            bc.b(this.adReviewListener, str2, this.f8995e);
        }
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        List b8 = this.sdk.n0().b();
        if (this.sdk.n0().d() && b8 != null && !b8.contains(this.f8995e.c())) {
            String str3 = "Attempting to show ad from <" + this.f8995e.c() + "> which is not in the list of selected ad networks " + b8;
            t.h(this.tag, str3);
            a(d.IDLE, new com.applovin.impl.mediation.ads.e(this, str3, 1));
            return;
        }
        if (activity == null) {
            activity = this.sdk.p0();
        }
        if (a(activity, str)) {
            a(d.SHOWING, new e() { // from class: com.applovin.impl.mediation.ads.h
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.this.a(str, str2, activity);
                }
            });
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f8992a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    public void a(de deVar) {
        if (this.sdk.f().a(deVar, this)) {
            if (t.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + deVar);
            }
            this.f8995e = deVar;
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(deVar);
    }

    public /* synthetic */ void c() {
        if (this.f8999i.compareAndSet(true, false)) {
            t.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.E().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            gf gfVar = new gf(this.adUnitId, this.adFormat, this.f8995e.getPlacement());
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(gfVar);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                L.w(sb, this.adListener, tVar, str);
            }
            bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
            if (this.f8995e != null) {
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8995e);
            }
        }
    }

    public void d() {
        de deVar;
        if (this.f8998h.compareAndSet(true, false)) {
            synchronized (this.f8994d) {
                deVar = this.f8995e;
                this.f8995e = null;
            }
            this.sdk.S().destroyAd(deVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public void e() {
        Activity activity = (Activity) this.l.get();
        if (activity == null) {
            activity = this.sdk.p0();
        }
        Activity activity2 = activity;
        if (this.f9000j) {
            showAd(this.f8995e.getPlacement(), this.f8995e.e(), (ViewGroup) this.m.get(), (AbstractC0505o) this.f9002n.get(), activity2);
        } else {
            showAd(this.f8995e.getPlacement(), this.f8995e.e(), activity2);
        }
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f8996f == d.DESTROYED) {
            boolean c9 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c9));
            if (c9) {
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
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(this.f8995e);
                sb.append("), listener=");
                L.w(sb, this.adListener, tVar, str);
            }
            bc.f(this.adListener, (MaxAd) this.f8995e, true);
            return;
        }
        b bVar2 = this.f8992a;
        a(d.LOADING, new a(bVar2 != null ? bVar2.getActivity() : null, (Context) this.b.get(), bVar));
    }

    public /* synthetic */ void b() {
        synchronized (this.f8994d) {
            try {
                if (this.f8995e != null) {
                    if (t.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f8995e + "...");
                    }
                    this.sdk.S().destroyAd(this.f8995e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.h().b(this);
        this.f8993c.a();
        super.destroy();
    }

    /* loaded from: classes.dex */
    public class a implements e {

        /* renamed from: a */
        final /* synthetic */ Activity f9003a;
        final /* synthetic */ Context b;

        /* renamed from: c */
        final /* synthetic */ d.b f9004c;

        public a(Activity activity, Context context, d.b bVar) {
            this.f9003a = activity;
            this.b = context;
            this.f9004c = bVar;
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a() {
            Context context = this.f9003a;
            if (context == null && (context = this.b) == null) {
                if (MaxFullscreenAdImpl.this.sdk.p0() != null) {
                    context = MaxFullscreenAdImpl.this.sdk.p0();
                } else {
                    context = com.applovin.impl.sdk.k.k();
                }
            }
            Context context2 = context;
            MediationServiceImpl S8 = MaxFullscreenAdImpl.this.sdk.S();
            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
            S8.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, this.f9004c, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context2, maxFullscreenAdImpl.listenerWrapper);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a(MaxError maxError) {
            if (((Boolean) MaxFullscreenAdImpl.this.sdk.a(qe.f10304L7)).booleanValue()) {
                t tVar = MaxFullscreenAdImpl.this.logger;
                if (t.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    t tVar2 = maxFullscreenAdImpl.logger;
                    String str = maxFullscreenAdImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                    sb.append(MaxFullscreenAdImpl.this.adUnitId);
                    sb.append(", error=");
                    sb.append(maxError);
                    sb.append("), listener=");
                    L.w(sb, MaxFullscreenAdImpl.this.adListener, tVar2, str);
                }
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                bc.a(maxFullscreenAdImpl2.adListener, maxFullscreenAdImpl2.adUnitId, maxError, true);
            }
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final AbstractC0505o abstractC0505o, Activity activity) {
        if (viewGroup != null && abstractC0505o != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(qe.f10289B7)).booleanValue()) {
                t.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                bc.a(this.adListener, (MaxAd) this.f8995e, (MaxError) maxErrorImpl, true);
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8995e);
                return;
            }
            List b8 = this.sdk.n0().b();
            if (this.sdk.n0().d() && b8 != null && !b8.contains(this.f8995e.c())) {
                String str3 = "Attempting to show ad from <" + this.f8995e.c() + "> which is not in the list of selected ad networks " + b8;
                t.h(this.tag, str3);
                a(d.IDLE, new com.applovin.impl.mediation.ads.e(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.p0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(d.SHOWING, new e() { // from class: com.applovin.impl.mediation.ads.f
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        MaxFullscreenAdImpl.this.a(str, str2, activity2, viewGroup, abstractC0505o);
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
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(this.f8995e);
            sb.append(", error=");
            sb.append(maxErrorImpl2);
            sb.append("), listener=");
            L.w(sb, this.adListener, tVar, str4);
        }
        bc.a(this.adListener, (MaxAd) this.f8995e, (MaxError) maxErrorImpl2, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f8995e);
    }

    public /* synthetic */ void a(String str) {
        de deVar = this.f8995e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(deVar);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            L.w(sb, this.adListener, tVar, str2);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    public /* synthetic */ void b(String str) {
        de deVar = this.f8995e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(deVar);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            L.w(sb, this.adListener, tVar, str2);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f9000j = false;
        this.l = new WeakReference(activity);
        this.sdk.S().showFullscreenAd(this.f8995e, activity, this.listenerWrapper);
    }

    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, AbstractC0505o abstractC0505o) {
        a(str, str2);
        this.f9000j = true;
        this.l = new WeakReference(activity);
        this.m = new WeakReference(viewGroup);
        this.f9002n = new WeakReference(abstractC0505o);
        this.sdk.S().showFullscreenAd(this.f8995e, viewGroup, abstractC0505o, activity, this.listenerWrapper);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f8996f == d.DESTROYED) {
            boolean c9 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToShowDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c9));
            if (c9) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String h6 = AbstractC2914a.h(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            t.h(this.tag, h6);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, h6);
            gf gfVar = new gf(this.adUnitId, this.adFormat, str);
            if (t.a()) {
                t tVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(gfVar);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                L.w(sb, this.adListener, tVar, str2);
            }
            bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
            if (this.f8995e != null) {
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8995e);
            }
            return false;
        }
        Long l = (Long) this.sdk.a(qe.f10333o7);
        Long l2 = (Long) this.sdk.a(qe.f10330h7);
        if (l.longValue() > 0 && (this.f8995e.getTimeToLiveMillis() < l2.longValue() || this.f8998h.get())) {
            this.f8999i.set(true);
            this.sdk.l0().a(new kn(this.sdk, "handleShowOnLoadTimeoutError", new l(this, 2)), sm.b.TIMEOUT, l.longValue());
            return false;
        }
        if (zp.a(com.applovin.impl.sdk.k.k()) != 0 && this.sdk.g0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!zp.c(this.sdk)) {
                if (((Boolean) this.sdk.a(qe.f10288A7)).booleanValue()) {
                    t.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (t.a()) {
                        t tVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb2.append(this.f8995e);
                        sb2.append(", error=");
                        sb2.append(maxErrorImpl2);
                        sb2.append("), listener=");
                        L.w(sb2, this.adListener, tVar2, str3);
                    }
                    bc.a(this.adListener, (MaxAd) this.f8995e, (MaxError) maxErrorImpl2, true);
                    this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f8995e);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.E().d() && !this.sdk.E().c()) {
            String str4 = (String) n0.d(this.sdk, "fullscreen_ads_block_showing_if_activity_is_finishing");
            if (((!StringUtils.isValidString(str4) || !Boolean.valueOf(str4).booleanValue()) && !((Boolean) this.sdk.a(qe.f10329g7)).booleanValue()) || activity == null || !activity.isFinishing()) {
                return true;
            }
            t.h(this.tag, "Attempting to show ad when activity is finishing");
            MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing");
            if (t.a()) {
                t tVar3 = this.logger;
                String str5 = this.tag;
                StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb3.append(this.f8995e);
                sb3.append(", error=");
                sb3.append(maxErrorImpl3);
                sb3.append("), listener=");
                L.w(sb3, this.adListener, tVar3, str5);
            }
            bc.a(this.adListener, (MaxAd) this.f8995e, (MaxError) maxErrorImpl3, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f8995e);
            return false;
        }
        t.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        if (((Boolean) this.sdk.a(qe.f10302K7)).booleanValue()) {
            if (this.f8997g != null) {
                HashMap<String, String> hashMap = CollectionUtils.hashMap("source", this.tag);
                hashMap.put("adapter_version", this.f8997g.y());
                hashMap.put("error_message", "Attempting to show ad when another fullscreen ad is already showing");
                this.sdk.B().a(o.b.DISPLAY_ERROR, this.f8997g, hashMap, 0L);
            } else if (t.a()) {
                this.logger.a(this.tag, "Unable to submit error report for previously displayed ad because it doesn't exist");
            }
        }
        MaxErrorImpl maxErrorImpl4 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (t.a()) {
            t tVar4 = this.logger;
            String str6 = this.tag;
            StringBuilder sb4 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb4.append(this.f8995e);
            sb4.append(", error=");
            sb4.append(maxErrorImpl4);
            sb4.append("), listener=");
            L.w(sb4, this.adListener, tVar4, str6);
        }
        bc.a(this.adListener, (MaxAd) this.f8995e, (MaxError) maxErrorImpl4, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl4, this.f8995e);
        return false;
    }

    private void a(String str, String str2) {
        this.f8993c.e(this.f8995e);
        this.f8995e.g(str);
        this.f8995e.f(str2);
        this.sdk.v().d(this.f8995e);
        if (t.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f8995e + "...");
        }
        a((be) this.f8995e);
    }

    private void a() {
        de deVar;
        synchronized (this.f8994d) {
            deVar = this.f8995e;
            this.f8995e = null;
        }
        this.sdk.S().destroyAd(deVar);
    }

    public void a(d dVar, e eVar) {
        boolean z8;
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1);
        d dVar2 = this.f8996f;
        synchronized (this.f8994d) {
            try {
                d dVar3 = d.IDLE;
                if (dVar2 == dVar3) {
                    if (dVar != d.LOADING && dVar != d.DESTROYED) {
                        if (dVar == d.SHOWING) {
                            t.h(this.tag, "No ad is loading or loaded");
                        } else if (t.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + dVar);
                        }
                        z8 = false;
                    }
                    z8 = true;
                } else {
                    d dVar4 = d.LOADING;
                    if (dVar2 == dVar4) {
                        if (dVar != dVar3) {
                            if (dVar == dVar4) {
                                maxErrorImpl = new MaxErrorImpl(-26, "An ad is already loading");
                                t.h(this.tag, maxErrorImpl.getMessage());
                            } else if (dVar != d.READY) {
                                if (dVar == d.SHOWING) {
                                    t.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (dVar != d.DESTROYED) {
                                    if (t.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                    }
                                }
                            }
                            z8 = false;
                        }
                        z8 = true;
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
                                z8 = false;
                            }
                            z8 = true;
                        } else {
                            d dVar6 = d.SHOWING;
                            if (dVar2 == dVar6) {
                                if (dVar != dVar3) {
                                    if (dVar == dVar4) {
                                        maxErrorImpl = new MaxErrorImpl(-27, "Can not load another ad while the ad is showing");
                                        t.h(this.tag, maxErrorImpl.getMessage());
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
                                z8 = true;
                            } else if (dVar2 == d.DESTROYED) {
                                t.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (t.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f8996f);
                            }
                            z8 = false;
                        }
                    }
                }
                if (z8) {
                    if (t.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f8996f + " to " + dVar + "...");
                    }
                    this.f8996f = dVar;
                } else if (t.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.f8996f + " to " + dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            eVar.a();
        } else {
            eVar.a(maxErrorImpl);
        }
    }

    public void a(MaxAd maxAd) {
        this.sdk.f().a((de) maxAd);
        this.f8993c.a();
        a();
        this.sdk.V().a((be) maxAd);
    }
}
