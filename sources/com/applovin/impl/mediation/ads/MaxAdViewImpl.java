package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.br;
import com.applovin.impl.ce;
import com.applovin.impl.cr;
import com.applovin.impl.e0;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements d.a, cr.a, v.b {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdView f6009b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6010c;

    /* renamed from: d, reason: collision with root package name */
    private final View f6011d;

    /* renamed from: e, reason: collision with root package name */
    private long f6012e;

    /* renamed from: f, reason: collision with root package name */
    private ce f6013f;

    /* renamed from: g, reason: collision with root package name */
    private String f6014g;

    /* renamed from: h, reason: collision with root package name */
    private String f6015h;

    /* renamed from: i, reason: collision with root package name */
    private final b f6016i;

    /* renamed from: j, reason: collision with root package name */
    private final d f6017j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.d f6018k;

    /* renamed from: l, reason: collision with root package name */
    private final br f6019l;

    /* renamed from: m, reason: collision with root package name */
    private final cr f6020m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f6021n;

    /* renamed from: o, reason: collision with root package name */
    private ce f6022o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6023p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6024q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6025r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6026s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6027t;
    private boolean u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6028v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6029w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6030x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6031y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6032z;

    /* loaded from: classes.dex */
    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                t tVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                e.u(sb2, MaxAdViewImpl.this.adListener, tVar2, str2);
            }
            bc.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.S().destroyAd(maxAd);
                return;
            }
            ce ceVar = (ce) maxAd;
            ceVar.g(MaxAdViewImpl.this.f6014g);
            ceVar.f(MaxAdViewImpl.this.f6015h);
            if (ceVar.x() != null) {
                if (ceVar.p0()) {
                    long k02 = ceVar.k0();
                    MaxAdViewImpl.this.sdk.L();
                    if (t.a()) {
                        t L = MaxAdViewImpl.this.sdk.L();
                        String str = MaxAdViewImpl.this.tag;
                        StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Scheduling banner ad refresh ", k02, " milliseconds from now for '");
                        o10.append(MaxAdViewImpl.this.adUnitId);
                        o10.append("'...");
                        L.a(str, o10.toString());
                    }
                    MaxAdViewImpl.this.f6018k.a(k02);
                    if (MaxAdViewImpl.this.f6018k.g() || MaxAdViewImpl.this.f6024q) {
                        t tVar2 = MaxAdViewImpl.this.logger;
                        if (t.a()) {
                            MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                            maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f6018k.j();
                    }
                }
                t tVar3 = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    t tVar4 = maxAdViewImpl3.logger;
                    String str2 = maxAdViewImpl3.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e.u(sb2, MaxAdViewImpl.this.adListener, tVar4, str2);
                }
                bc.f(MaxAdViewImpl.this.adListener, maxAd, true);
                MaxAdViewImpl.this.d(ceVar);
                return;
            }
            MaxAdViewImpl.this.sdk.S().destroyAd(ceVar);
            onAdLoadFailed(ceVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    /* loaded from: classes.dex */
    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0023a {
        private boolean a;

        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6022o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e.u(sb2, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6022o)) {
                if ((MaxAdViewImpl.this.f6022o.q0() || MaxAdViewImpl.this.f6030x) && this.a) {
                    this.a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e.u(sb2, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f6022o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(maxAd);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    e.u(sb2, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6022o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e.u(sb2, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6022o)) {
                if ((MaxAdViewImpl.this.f6022o.q0() || MaxAdViewImpl.this.f6030x) && !MaxAdViewImpl.this.f6018k.g()) {
                    this.a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e.u(sb2, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6022o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e.u(sb2, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                t tVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder o10 = a4.j.o("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                o10.append(MaxAdViewImpl.this.requestListener);
                tVar2.a(str2, o10.toString());
            }
            bc.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            bc.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f6027t) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.S().destroyAd(maxAd);
                return;
            }
            t tVar2 = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", kVar);
        this.f6010c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f6012e = Long.MAX_VALUE;
        this.f6021n = new Object();
        this.f6022o = null;
        this.f6027t = false;
        if (context != null) {
            this.a = context.getApplicationContext();
            this.f6009b = maxAdView;
            this.f6011d = view;
            this.f6016i = new b();
            this.f6017j = new d();
            this.f6018k = new com.applovin.impl.sdk.d(kVar, this);
            this.f6019l = new br(maxAdView, kVar);
            this.f6020m = new cr(maxAdView, kVar, this);
            kVar.h().a(this);
            if (t.a()) {
                this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    private void c(ce ceVar) {
        int height = this.f6009b.getHeight();
        int width = this.f6009b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.a, width);
            MaxAdFormat format = ceVar.getFormat();
            int height2 = (this.f6032z ? format.getAdaptiveSize(pxToDp2, this.f6009b.getContext()) : format.getSize()).getHeight();
            int min = Math.min(format.getSize().getWidth(), x3.b(this.a).x);
            if (pxToDp < height2 || pxToDp2 < min) {
                StringBuilder n10 = a4.j.n("\n**************************************************\n`MaxAdView` size ", pxToDp2, "x", pxToDp, " dp smaller than required ");
                n10.append(this.f6032z ? "adaptive " : "");
                n10.append("size: ");
                n10.append(min);
                n10.append("x");
                String g10 = vd.e.g(n10, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (t.a()) {
                    this.logger.b("AppLovinSdk", g10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ce ceVar) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this, ceVar, 1));
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        e();
        if (this.f6013f != null) {
            this.sdk.S().destroyAd(this.f6013f);
        }
        synchronized (this.f6021n) {
            this.f6027t = true;
        }
        this.f6018k.a();
        this.sdk.h().b(this);
        this.sdk.M().c(this.adUnitId, this.f6010c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f6014g;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdRefresh() {
        this.f6025r = false;
        if (this.f6013f != null) {
            f();
            return;
        }
        if (b()) {
            if (this.f6023p) {
                if (t.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                }
                loadAd(d.b.REFRESH);
                return;
            } else {
                if (t.a()) {
                    this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                }
                this.f6025r = true;
                return;
            }
        }
        if (t.a()) {
            this.logger.a(this.tag, "Refreshing ad from network...");
        }
        loadAd(d.b.REFRESH);
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        ce ceVar = this.f6022o;
        if (ceVar != null && ceVar.Q().equalsIgnoreCase(str)) {
            this.f6022o.h(str2);
            bc.b(this.adReviewListener, str2, this.f6022o);
            return;
        }
        ce ceVar2 = this.f6013f;
        if (ceVar2 != null && ceVar2.Q().equalsIgnoreCase(str)) {
            this.f6013f.h(str2);
        }
    }

    @Override // com.applovin.impl.cr.a
    public void onLogVisibilityImpression() {
        a(this.f6022o, this.f6019l.a(this.f6022o));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(qe.Y6)).booleanValue() && this.f6018k.h()) {
            if (ar.b(i10)) {
                if (t.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f6018k.d();
            } else {
                if (t.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f6018k.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f6022o != null && t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder o10 = a4.j.o("Setting custom data (", str, ") for Ad Unit ID (");
            o10.append(this.adUnitId);
            o10.append(") after an ad has been loaded already.");
            tVar.k(str2, o10.toString());
        }
        zp.b(str, this.tag);
        this.f6015h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f6022o != null && t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder o10 = a4.j.o("Setting placement (", str, ") for Ad Unit ID (");
            o10.append(this.adUnitId);
            o10.append(") after an ad has been loaded already.");
            tVar.k(str2, o10.toString());
        }
        this.f6014g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f6012e = i10;
    }

    public void startAutoRefresh() {
        this.f6024q = false;
        if (this.f6018k.g()) {
            this.f6018k.m();
            if (t.a()) {
                this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f6018k.b() + "ms");
                return;
            }
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
        }
    }

    public void stopAutoRefresh() {
        if (this.f6022o != null) {
            if (t.a()) {
                this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f6018k.b() + "ms");
            }
            this.f6018k.j();
            return;
        }
        if (!this.u && !((Boolean) this.sdk.a(qe.f7189a7)).booleanValue()) {
            t.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        } else {
            this.f6024q = true;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f6009b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        return a4.j.l(sb2, a(), AbstractJsonLexerKt.END_OBJ);
    }

    private void a(View view, ce ceVar) {
        int o02 = ceVar.o0();
        int m02 = ceVar.m0();
        int dpToPx = o02 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), o02);
        int dpToPx2 = m02 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), m02) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (t.a()) {
                this.logger.a(this.tag, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Pinning ad view to MAX ad view with width: ", dpToPx, " and height: ", dpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : ar.a(this.f6009b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ce ceVar) {
        View x10 = ceVar.x();
        String str = x10 == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f6009b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (t.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (t.a()) {
                t tVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(ceVar);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                e.u(sb2, this.adListener, tVar, str2);
            }
            bc.a(this.adListener, (MaxAd) ceVar, (MaxError) maxErrorImpl, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, ceVar);
            return;
        }
        e();
        a((be) ceVar);
        if (ceVar.j0()) {
            this.f6020m.a(ceVar);
        }
        maxAdView.setDescendantFocusability(393216);
        int i10 = 0;
        if (ceVar.l0() != Long.MAX_VALUE) {
            this.f6011d.setBackgroundColor((int) ceVar.l0());
        } else {
            long j3 = this.f6012e;
            if (j3 != Long.MAX_VALUE) {
                this.f6011d.setBackgroundColor((int) j3);
            } else {
                this.f6011d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(x10);
        a(x10, ceVar);
        this.sdk.v().d(ceVar);
        c(ceVar);
        synchronized (this.f6021n) {
            this.f6022o = ceVar;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.S().processRawAdImpression(ceVar, this.f6016i);
        if (StringUtils.isValidString(this.f6022o.getAdReviewCreativeId())) {
            bc.a(this.adReviewListener, this.f6022o.getAdReviewCreativeId(), (MaxAd) this.f6022o, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.c(this, ceVar, i10), ceVar.n0());
    }

    private void e() {
        ce ceVar;
        MaxAdView maxAdView;
        MaxAdView maxAdView2;
        Boolean bool = (Boolean) this.sdk.a(qe.P7);
        if (bool.booleanValue() && (maxAdView2 = this.f6009b) != null) {
            e0.a(maxAdView2, this.f6011d);
        }
        this.f6020m.b();
        synchronized (this.f6021n) {
            ceVar = this.f6022o;
        }
        if (ceVar != null) {
            this.sdk.S().destroyAd(ceVar);
        }
        if (bool.booleanValue() || (maxAdView = this.f6009b) == null) {
            return;
        }
        e0.a(maxAdView, this.f6011d);
    }

    private void f() {
        if (t.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f6013f + "...");
        }
        this.f6016i.onAdLoaded(this.f6013f);
        this.f6013f = null;
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.u || ((Boolean) this.sdk.a(qe.f7189a7)).booleanValue();
        if (z10 && !this.f6018k.g() && this.f6018k.h()) {
            t.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f6018k.b()) + " seconds.");
            return;
        }
        if (z10) {
            if (this.f6013f != null) {
                if (t.a()) {
                    this.logger.a(this.tag, "Rendering cached ad");
                }
                f();
                return;
            } else if (this.f6026s) {
                if (t.a()) {
                    this.logger.a(this.tag, "Waiting for precache ad to load to render");
                }
                this.f6025r = true;
                return;
            } else {
                if (t.a()) {
                    this.logger.a(this.tag, "Loading ad...");
                }
                a(bVar, this.f6016i);
                return;
            }
        }
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad...");
        }
        a(bVar, this.f6016i);
    }

    private void d() {
        if (b()) {
            if (t.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f6026s = true;
            this.sdk.l0().a((xl) new kn(this.sdk, "loadMaxAdForPrecacheRequest", new m(this, 1)), sm.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad for pre-cache request...");
        }
        a(d.b.SEQUENTIAL_OR_PRECACHE, this.f6017j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ce ceVar) {
        long a10 = this.f6019l.a(ceVar);
        if (!ceVar.j0()) {
            a(ceVar, a10);
        }
        a(a10);
    }

    private void a(final d.b bVar, final a.InterfaceC0023a interfaceC0023a) {
        if (a()) {
            boolean c10 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAdView", (Map) CollectionUtils.hashMap("details", "debug=" + c10));
            if (!c10) {
                t.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.a(interfaceC0023a, bVar);
            }
        });
    }

    private boolean b() {
        if (this.f6029w) {
            return false;
        }
        return ((Boolean) this.sdk.a(qe.f7194f7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0023a interfaceC0023a, d.b bVar) {
        ce ceVar = this.f6022o;
        if (ceVar != null) {
            long a10 = this.f6019l.a(ceVar);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f6022o.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(a10));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f6009b.getContext(), this.f6009b.getWidth());
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f6009b.getContext(), this.f6009b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f6018k.g() || this.f6024q));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f6028v));
        if (t.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0023a + "...");
        }
        this.sdk.S().loadAd(this.adUnitId, this.f6010c, this.adFormat, bVar, this.localExtraParameters, this.extraParameters, this.a, interfaceC0023a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (t.a()) {
                a4.j.v("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.u = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (t.a()) {
                a4.j.v("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f6028v = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (t.a()) {
                a4.j.v("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f6029w = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (t.a()) {
                a4.j.v("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f6030x = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (t.a()) {
                a4.j.v("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f6031y = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (t.a()) {
                a4.j.v("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            this.f6032z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (t.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(qe.U6).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f6024q && !this.f6018k.g()) {
            this.f6023p = true;
            this.f6026s = false;
            long longValue = ((Long) this.sdk.a(qe.T6)).longValue();
            if (longValue >= 0) {
                this.sdk.L();
                if (t.a()) {
                    t L = this.sdk.L();
                    String str = this.tag;
                    StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Scheduling failed banner ad refresh ", longValue, " milliseconds from now for '");
                    o10.append(this.adUnitId);
                    o10.append("'...");
                    L.a(str, o10.toString());
                }
                this.f6018k.a(longValue);
                return;
            }
            return;
        }
        if (this.f6026s) {
            if (t.a()) {
                this.logger.a(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
            }
            this.f6026s = false;
        }
        if (this.f6025r) {
            if (t.a()) {
                t tVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("Refresh pre-cache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(this.adUnitId);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                e.u(sb2, this.adListener, tVar, str2);
            }
            bc.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(ce ceVar, long j3) {
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.S().processViewabilityAdImpressionPostback(ceVar, j3, this.f6016i);
    }

    private void a(long j3) {
        if (zp.a(j3, ((Long) this.sdk.a(qe.f7193e7)).longValue()) && !this.f6031y) {
            if (t.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j3) + ", undesired: " + Long.toBinaryString(j3));
            }
            if (t.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f6023p = true;
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
        }
        this.f6023p = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f6026s = false;
        if (this.f6025r) {
            this.f6025r = false;
            if (t.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f6016i.onAdLoaded(maxAd);
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Saving pre-cache ad...");
        }
        ce ceVar = (ce) maxAd;
        this.f6013f = ceVar;
        ceVar.g(this.f6014g);
        this.f6013f.f(this.f6015h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f6021n) {
            z10 = this.f6027t;
        }
        return z10;
    }
}
