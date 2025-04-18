package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.adview.t;
import com.applovin.impl.gc;
import com.applovin.impl.ge;
import com.applovin.impl.ie;
import com.applovin.impl.j8;
import com.applovin.impl.jn;
import com.applovin.impl.la;
import com.applovin.impl.lf;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.tm;
import com.applovin.impl.v;
import com.applovin.impl.ve;
import com.applovin.impl.yp;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0096a, v.b {

    /* renamed from: a */
    private final b f25329a;

    /* renamed from: b */
    private final WeakReference f25330b;

    /* renamed from: c */
    private final c f25331c;
    private final com.applovin.impl.mediation.b d;
    private final Object e;

    /* renamed from: f */
    private ie f25332f;

    /* renamed from: g */
    private d f25333g;

    /* renamed from: h */
    private final AtomicBoolean f25334h;

    /* renamed from: i */
    private final AtomicBoolean f25335i;

    /* renamed from: j */
    private boolean f25336j;

    /* renamed from: k */
    private boolean f25337k;

    /* renamed from: l */
    private String f25338l;

    /* renamed from: m */
    private String f25339m;

    /* renamed from: n */
    private WeakReference f25340n;

    /* renamed from: o */
    private WeakReference f25341o;

    /* renamed from: p */
    private WeakReference f25342p;

    /* loaded from: classes.dex */
    public interface b {
        Activity getActivity();
    }

    /* loaded from: classes.dex */
    public class c implements MaxAdListener, MaxRewardedAdListener, MaxAdRevenueListener, a.InterfaceC0085a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str);
            }
            gc.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z2 = MaxFullscreenAdImpl.this.f25337k;
            MaxFullscreenAdImpl.this.f25337k = false;
            final ie ieVar = (ie) maxAd;
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.i
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.c.this.a(maxAd, z2, ieVar, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            ie ieVar = (ie) maxAd;
            MaxFullscreenAdImpl.this.f25337k = false;
            MaxFullscreenAdImpl.this.sdk.f().a(ieVar);
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(ve.V7)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.j0().b(new jn(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new l(0, this, ieVar)), tm.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str);
            }
            gc.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f25337k = false;
            MaxFullscreenAdImpl.this.a(d.IDLE, new j(this, maxAd, 0));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.c();
            MaxFullscreenAdImpl.this.a(d.IDLE, new e() { // from class: com.applovin.impl.mediation.ads.m
                @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                public final void a() {
                    MaxFullscreenAdImpl.c.this.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            ie ieVar;
            synchronized (MaxFullscreenAdImpl.this.e) {
                ieVar = MaxFullscreenAdImpl.this.f25332f;
            }
            MaxFullscreenAdImpl.this.sdk.C().a(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((ie) maxAd);
            if (!MaxFullscreenAdImpl.this.f25334h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(d.READY, new j(this, maxAd, 1));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f25335i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.d();
            }
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + ieVar + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            gc.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) ieVar, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder v2 = android.support.v4.media.d.v("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                v2.append(MaxFullscreenAdImpl.this.requestListener);
                nVar2.a(str2, v2.toString());
            }
            gc.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            gc.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb.append(maxAd);
                sb.append(", reward=");
                sb.append(maxReward);
                sb.append("), listener=");
                t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str);
            }
            gc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }

        public /* synthetic */ c(MaxFullscreenAdImpl maxFullscreenAdImpl, a aVar) {
            this();
        }

        public /* synthetic */ void a(MaxAd maxAd, boolean z2, ie ieVar, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z2 && ieVar.w0() && MaxFullscreenAdImpl.this.sdk.K().d(MaxFullscreenAdImpl.this.adUnitId)) {
                AppLovinSdkUtils.runOnUiThread(true, new k(this, 0));
                return;
            }
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(maxAd);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str);
            }
            gc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        public /* synthetic */ void b(MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f25337k) {
                MaxFullscreenAdImpl.this.d();
                return;
            }
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str);
            }
            gc.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public /* synthetic */ void a(ie ieVar) {
            if (ieVar.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.E().a(la.B, ieVar);
        }

        public /* synthetic */ void a(String str, MaxError maxError) {
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str2);
            }
            gc.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            n nVar = MaxFullscreenAdImpl.this.logger;
            if (n.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                n nVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str);
            }
            gc.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f25337k = true;
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

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, b bVar, String str2, com.applovin.impl.sdk.j jVar, Context context) {
        super(str, maxAdFormat, str2, jVar);
        this.e = new Object();
        this.f25332f = null;
        this.f25333g = d.IDLE;
        this.f25334h = new AtomicBoolean();
        this.f25335i = new AtomicBoolean();
        this.f25340n = new WeakReference(null);
        this.f25341o = new WeakReference(null);
        this.f25342p = new WeakReference(null);
        this.f25329a = bVar;
        this.f25331c = new c(this, null);
        this.d = new com.applovin.impl.mediation.b(jVar);
        this.f25330b = new WeakReference(context);
        jVar.h().a(this);
        n.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(d.DESTROYED, new e() { // from class: com.applovin.impl.mediation.ads.e
            @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
            public final void a() {
                MaxFullscreenAdImpl.this.b();
            }
        });
    }

    public boolean isReady() {
        boolean z2;
        synchronized (this.e) {
            try {
                ie ieVar = this.f25332f;
                z2 = ieVar != null && ieVar.c0() && this.f25333g == d.READY;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            this.sdk.C().c(this.adUnitId);
        }
        return z2;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0096a
    public void onAdExpired(j8 j8Var) {
        if (n.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f25334h.set(true);
        b bVar = this.f25329a;
        Activity activity = bVar != null ? bVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            c();
            this.f25331c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.Q().loadAd(this.adUnitId, null, this.adFormat, d.b.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f25331c);
        }
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        ie ieVar = this.f25332f;
        if (ieVar == null || !ieVar.S().equalsIgnoreCase(str)) {
            return;
        }
        this.f25332f.h(str2);
        gc.b(this.adReviewListener, str2, this.f25332f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        ie ieVar;
        List b2 = this.sdk.l0().b();
        if (this.sdk.l0().d() && b2 != null && (ieVar = this.f25332f) != null && !b2.contains(ieVar.c())) {
            String str3 = "Attempting to show ad from <" + this.f25332f.c() + "> which is not in the list of selected ad networks " + b2;
            n.h(this.tag, str3);
            a(d.IDLE, new f(this, str3, 1));
            return;
        }
        if (activity == null) {
            activity = this.sdk.n0();
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
        if (obj == this.f25329a) {
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

    public void a(ie ieVar) {
        if (this.sdk.f().a(ieVar, this)) {
            if (n.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + ieVar);
            }
            this.f25332f = ieVar;
            return;
        }
        if (n.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(ieVar);
    }

    public /* synthetic */ void b() {
        synchronized (this.e) {
            try {
                if (this.f25332f != null) {
                    if (n.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f25332f + "...");
                    }
                    this.sdk.Q().destroyAd(this.f25332f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.h().b(this);
        this.d.a();
        super.destroy();
    }

    public /* synthetic */ void c(String str) {
        ie ieVar = this.f25332f;
        a((MaxAd) ieVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (n.a()) {
            n nVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(ieVar);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            t.x(sb, this.adListener, nVar, str2);
        }
        gc.a(this.adListener, (MaxAd) ieVar, (MaxError) maxErrorImpl, true);
        this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl, ieVar);
    }

    public void d() {
        Activity activity = (Activity) this.f25340n.get();
        if (activity == null) {
            activity = this.sdk.n0();
        }
        Activity activity2 = activity;
        if (this.f25336j) {
            showAd(this.f25338l, this.f25339m, (ViewGroup) this.f25341o.get(), (Lifecycle) this.f25342p.get(), activity2);
        } else {
            showAd(this.f25338l, this.f25339m, activity2);
        }
    }

    public void loadAd(d.b bVar) {
        if (n.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f25333g == d.DESTROYED) {
            boolean c2 = yp.c(this.sdk);
            this.sdk.E().a(la.L, "attemptingToLoadDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (isReady()) {
            if (n.a()) {
                this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            if (n.a()) {
                n nVar = this.logger;
                String str = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(this.f25332f);
                sb.append("), listener=");
                t.x(sb, this.adListener, nVar, str);
            }
            gc.f(this.adListener, (MaxAd) this.f25332f, true);
            return;
        }
        b bVar2 = this.f25329a;
        a(d.LOADING, new a(bVar2 != null ? bVar2.getActivity() : null, (Context) this.f25330b.get(), bVar));
    }

    /* loaded from: classes.dex */
    public class a implements e {

        /* renamed from: a */
        final /* synthetic */ Activity f25343a;

        /* renamed from: b */
        final /* synthetic */ Context f25344b;

        /* renamed from: c */
        final /* synthetic */ d.b f25345c;

        public a(Activity activity, Context context, d.b bVar) {
            this.f25343a = activity;
            this.f25344b = context;
            this.f25345c = bVar;
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a() {
            Context context = this.f25343a;
            if (context == null && (context = this.f25344b) == null) {
                if (MaxFullscreenAdImpl.this.sdk.n0() != null) {
                    context = MaxFullscreenAdImpl.this.sdk.n0();
                } else {
                    context = com.applovin.impl.sdk.j.l();
                }
            }
            Context context2 = context;
            MediationServiceImpl Q = MaxFullscreenAdImpl.this.sdk.Q();
            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
            Q.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, this.f25345c, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context2, maxFullscreenAdImpl.f25331c);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
        public void a(MaxError maxError) {
            if (((Boolean) MaxFullscreenAdImpl.this.sdk.a(ve.U7)).booleanValue()) {
                n nVar = MaxFullscreenAdImpl.this.logger;
                if (n.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    n nVar2 = maxFullscreenAdImpl.logger;
                    String str = maxFullscreenAdImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                    sb.append(MaxFullscreenAdImpl.this.adUnitId);
                    sb.append(", error=");
                    sb.append(maxError);
                    sb.append("), listener=");
                    t.x(sb, MaxFullscreenAdImpl.this.adListener, nVar2, str);
                }
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                gc.a(maxFullscreenAdImpl2.adListener, maxFullscreenAdImpl2.adUnitId, maxError, true);
            }
        }
    }

    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f25336j = false;
        this.f25340n = new WeakReference(activity);
        this.sdk.Q().showFullscreenAd(this.f25332f, activity, this.f25331c);
    }

    public /* synthetic */ void b(String str) {
        ie ieVar = this.f25332f;
        a((MaxAd) ieVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (n.a()) {
            n nVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(ieVar);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            t.x(sb, this.adListener, nVar, str2);
        }
        gc.a(this.adListener, (MaxAd) ieVar, (MaxError) maxErrorImpl, true);
        this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl, ieVar);
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        ie ieVar;
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(ve.M7)).booleanValue()) {
                n.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                gc.a(this.adListener, (MaxAd) this.f25332f, (MaxError) maxErrorImpl, true);
                this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f25332f);
                return;
            }
            List b2 = this.sdk.l0().b();
            if (this.sdk.l0().d() && b2 != null && (ieVar = this.f25332f) != null && !b2.contains(ieVar.c())) {
                String str3 = "Attempting to show ad from <" + this.f25332f.c() + "> which is not in the list of selected ad networks " + b2;
                n.h(this.tag, str3);
                a(d.IDLE, new f(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.n0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(d.SHOWING, new e() { // from class: com.applovin.impl.mediation.ads.g
                    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e
                    public final void a() {
                        MaxFullscreenAdImpl.this.a(str, str2, activity2, viewGroup, lifecycle);
                    }
                });
                return;
            }
            return;
        }
        n.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (n.a()) {
            n nVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(this.f25332f);
            sb.append(", error=");
            sb.append(maxErrorImpl2);
            sb.append("), listener=");
            t.x(sb, this.adListener, nVar, str4);
        }
        gc.a(this.adListener, (MaxAd) this.f25332f, (MaxError) maxErrorImpl2, true);
        this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f25332f);
    }

    public void c() {
        ie ieVar;
        if (this.f25334h.compareAndSet(true, false)) {
            synchronized (this.e) {
                ieVar = this.f25332f;
                this.f25332f = null;
            }
            this.sdk.Q().destroyAd(ieVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        a(str, str2);
        this.f25336j = true;
        this.f25340n = new WeakReference(activity);
        this.f25341o = new WeakReference(viewGroup);
        this.f25342p = new WeakReference(lifecycle);
        this.sdk.Q().showFullscreenAd(this.f25332f, viewGroup, lifecycle, activity, this.f25331c);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f25333g == d.DESTROYED) {
            boolean c2 = yp.c(this.sdk);
            this.sdk.E().a(la.L, "attemptingToShowDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String r2 = android.support.v4.media.d.r(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            n.h(this.tag, r2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, r2);
            lf lfVar = new lf(this.adUnitId, this.adFormat, str);
            if (n.a()) {
                n nVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(lfVar);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                t.x(sb, this.adListener, nVar, str2);
            }
            gc.a(this.adListener, (MaxAd) lfVar, (MaxError) maxErrorImpl, true);
            if (this.f25332f != null) {
                this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f25332f);
            }
            return false;
        }
        Long l2 = (Long) this.sdk.a(ve.w7);
        Long l3 = (Long) this.sdk.a(ve.p7);
        if (l2.longValue() > 0 && (this.f25332f.getTimeToLiveMillis() < l3.longValue() || this.f25334h.get())) {
            this.f25335i.set(true);
            this.sdk.j0().a(new jn(this.sdk, "handleShowOnLoadTimeoutError", new l(2, this, str)), tm.b.TIMEOUT, l2.longValue());
            return false;
        }
        if (yp.a(com.applovin.impl.sdk.j.l()) != 0 && this.sdk.g0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!yp.c(this.sdk)) {
                if (((Boolean) this.sdk.a(ve.L7)).booleanValue()) {
                    n.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (n.a()) {
                        n nVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb2.append(this.f25332f);
                        sb2.append(", error=");
                        sb2.append(maxErrorImpl2);
                        sb2.append("), listener=");
                        t.x(sb2, this.adListener, nVar2, str3);
                    }
                    gc.a(this.adListener, (MaxAd) this.f25332f, (MaxError) maxErrorImpl2, true);
                    this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f25332f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.C().d() && !this.sdk.C().c()) {
            return true;
        }
        n.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (n.a()) {
            n nVar3 = this.logger;
            String str4 = this.tag;
            StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb3.append(this.f25332f);
            sb3.append(", error=");
            sb3.append(maxErrorImpl3);
            sb3.append("), listener=");
            t.x(sb3, this.adListener, nVar3, str4);
        }
        gc.a(this.adListener, (MaxAd) this.f25332f, (MaxError) maxErrorImpl3, true);
        this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f25332f);
        return false;
    }

    public /* synthetic */ void a(String str) {
        if (this.f25335i.compareAndSet(true, false)) {
            n.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.C().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            lf lfVar = new lf(this.adUnitId, this.adFormat, str);
            if (n.a()) {
                n nVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(lfVar);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                t.x(sb, this.adListener, nVar, str2);
            }
            gc.a(this.adListener, (MaxAd) lfVar, (MaxError) maxErrorImpl, true);
            if (this.f25332f != null) {
                this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f25332f);
            }
        }
    }

    private void a(String str, String str2) {
        this.d.e(this.f25332f);
        this.f25332f.g(str);
        this.f25332f.f(str2);
        this.f25338l = str;
        this.f25339m = str2;
        this.sdk.w().d(this.f25332f);
        if (n.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f25332f + "...");
        }
        a((ge) this.f25332f);
    }

    private void a() {
        ie ieVar;
        synchronized (this.e) {
            ieVar = this.f25332f;
            this.f25332f = null;
        }
        this.sdk.Q().destroyAd(ieVar);
    }

    public void a(d dVar, e eVar) {
        boolean z2;
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1);
        d dVar2 = this.f25333g;
        synchronized (this.e) {
            try {
                d dVar3 = d.IDLE;
                if (dVar2 == dVar3) {
                    if (dVar != d.LOADING && dVar != d.DESTROYED) {
                        if (dVar == d.SHOWING) {
                            n.h(this.tag, "No ad is loading or loaded");
                        } else if (n.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + dVar);
                        }
                        z2 = false;
                    }
                    z2 = true;
                } else {
                    d dVar4 = d.LOADING;
                    if (dVar2 == dVar4) {
                        if (dVar != dVar3) {
                            if (dVar == dVar4) {
                                maxErrorImpl = new MaxErrorImpl(-26, "An ad is already loading");
                                n.h(this.tag, maxErrorImpl.getMessage());
                            } else if (dVar != d.READY) {
                                if (dVar == d.SHOWING) {
                                    n.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (dVar != d.DESTROYED) {
                                    if (n.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                    }
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        d dVar5 = d.READY;
                        if (dVar2 == dVar5) {
                            if (dVar != dVar3) {
                                if (dVar == dVar4) {
                                    n.h(this.tag, "An ad is already loaded");
                                } else if (dVar == dVar5) {
                                    if (n.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (dVar != d.SHOWING && dVar != d.DESTROYED) {
                                    if (n.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                    }
                                }
                                z2 = false;
                            }
                            z2 = true;
                        } else {
                            d dVar6 = d.SHOWING;
                            if (dVar2 == dVar6) {
                                if (dVar != dVar3) {
                                    if (dVar == dVar4) {
                                        maxErrorImpl = new MaxErrorImpl(-27, "Can not load another ad while the ad is showing");
                                        n.h(this.tag, maxErrorImpl.getMessage());
                                    } else if (dVar == dVar5) {
                                        if (n.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (dVar == dVar6) {
                                        n.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (dVar != d.DESTROYED) {
                                        if (n.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + dVar);
                                        }
                                    }
                                }
                                z2 = true;
                            } else if (dVar2 == d.DESTROYED) {
                                n.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (n.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f25333g);
                            }
                            z2 = false;
                        }
                    }
                }
                if (z2) {
                    if (n.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f25333g + " to " + dVar + "...");
                    }
                    this.f25333g = dVar;
                } else if (n.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.f25333g + " to " + dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            eVar.a();
        } else {
            eVar.a(maxErrorImpl);
        }
    }

    public void a(MaxAd maxAd) {
        this.sdk.f().a((ie) maxAd);
        this.d.a();
        a();
        this.sdk.T().a((ge) maxAd);
    }
}
