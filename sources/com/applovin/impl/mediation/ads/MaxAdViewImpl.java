package com.applovin.impl.mediation.ads;

import Q7.n0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.AbstractC0688e0;
import com.applovin.impl.C0765v;
import com.applovin.impl.L;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.br;
import com.applovin.impl.ce;
import com.applovin.impl.cr;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.C0752d;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
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
import com.google.ar.core.ImageMetadata;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import x0.AbstractC2914a;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements C0752d.a, cr.a, C0765v.b {

    /* renamed from: a */
    private final Context f8966a;
    private final MaxAdView b;

    /* renamed from: c */
    private final String f8967c;

    /* renamed from: d */
    private final View f8968d;

    /* renamed from: e */
    private long f8969e;

    /* renamed from: f */
    private ce f8970f;

    /* renamed from: g */
    private String f8971g;

    /* renamed from: h */
    private String f8972h;

    /* renamed from: i */
    private final b f8973i;

    /* renamed from: j */
    private final d f8974j;

    /* renamed from: k */
    private final C0752d f8975k;
    private final br l;
    private final cr m;

    /* renamed from: n */
    private final Object f8976n;

    /* renamed from: o */
    private ce f8977o;

    /* renamed from: p */
    private boolean f8978p;

    /* renamed from: q */
    private boolean f8979q;

    /* renamed from: r */
    private boolean f8980r;

    /* renamed from: s */
    private boolean f8981s;

    /* renamed from: t */
    private boolean f8982t;

    /* renamed from: u */
    private boolean f8983u;

    /* renamed from: v */
    private boolean f8984v;

    /* renamed from: w */
    private boolean f8985w;

    /* renamed from: x */
    private boolean f8986x;

    /* renamed from: y */
    private boolean f8987y;

    /* renamed from: z */
    private boolean f8988z;

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
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                L.w(sb, MaxAdViewImpl.this.adListener, tVar2, str2);
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
            ceVar.g(MaxAdViewImpl.this.f8971g);
            ceVar.f(MaxAdViewImpl.this.f8972h);
            if (ceVar.x() != null) {
                if (ceVar.p0()) {
                    long k02 = ceVar.k0();
                    MaxAdViewImpl.this.sdk.L();
                    if (t.a()) {
                        t L8 = MaxAdViewImpl.this.sdk.L();
                        String str = MaxAdViewImpl.this.tag;
                        StringBuilder a6 = AbstractC2933a.a("Scheduling banner ad refresh ", k02, " milliseconds from now for '");
                        a6.append(MaxAdViewImpl.this.adUnitId);
                        a6.append("'...");
                        L8.a(str, a6.toString());
                    }
                    MaxAdViewImpl.this.f8975k.a(k02);
                    if (MaxAdViewImpl.this.f8975k.g() || MaxAdViewImpl.this.f8979q) {
                        t tVar2 = MaxAdViewImpl.this.logger;
                        if (t.a()) {
                            MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                            maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f8975k.j();
                    }
                }
                t tVar3 = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    t tVar4 = maxAdViewImpl3.logger;
                    String str2 = maxAdViewImpl3.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    L.w(sb, MaxAdViewImpl.this.adListener, tVar4, str2);
                }
                bc.f(MaxAdViewImpl.this.adListener, maxAd, true);
                MaxAdViewImpl.this.d(ceVar);
                return;
            }
            MaxAdViewImpl.this.sdk.S().destroyAd(ceVar);
            onAdLoadFailed(ceVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }

        public /* synthetic */ b(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0023a {

        /* renamed from: a */
        private boolean f8990a;

        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8977o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    L.w(sb, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8977o)) {
                if ((MaxAdViewImpl.this.f8977o.q0() || MaxAdViewImpl.this.f8986x) && this.f8990a) {
                    this.f8990a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    L.w(sb, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f8977o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb.append(maxAd);
                    sb.append(", error=");
                    sb.append(maxError);
                    sb.append("), listener=");
                    L.w(sb, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8977o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    L.w(sb, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8977o)) {
                if ((MaxAdViewImpl.this.f8977o.q0() || MaxAdViewImpl.this.f8986x) && !MaxAdViewImpl.this.f8975k.g()) {
                    this.f8990a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    L.w(sb, MaxAdViewImpl.this.adListener, tVar2, str);
                }
                bc.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f8977o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    L.w(sb, MaxAdViewImpl.this.adListener, tVar2, str);
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
                StringBuilder n2 = o.n("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                n2.append(MaxAdViewImpl.this.requestListener);
                tVar2.a(str2, n2.toString());
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

        public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
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
            if (MaxAdViewImpl.this.f8982t) {
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

        public /* synthetic */ d(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", kVar);
        this.f8967c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f8969e = Long.MAX_VALUE;
        this.f8976n = new Object();
        this.f8977o = null;
        this.f8982t = false;
        if (context != null) {
            this.f8966a = context.getApplicationContext();
            this.b = maxAdView;
            this.f8968d = view;
            this.f8973i = new b();
            this.f8974j = new d();
            this.f8975k = new C0752d(kVar, this);
            this.l = new br(maxAdView, kVar);
            this.m = new cr(maxAdView, kVar, this);
            kVar.h().a(this);
            if (t.a()) {
                this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        e();
        if (this.f8970f != null) {
            this.sdk.S().destroyAd(this.f8970f);
        }
        synchronized (this.f8976n) {
            this.f8982t = true;
        }
        this.f8975k.a();
        this.sdk.h().b(this);
        this.sdk.M().c(this.adUnitId, this.f8967c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f8971g;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.C0752d.a
    public void onAdRefresh() {
        this.f8980r = false;
        if (this.f8970f != null) {
            f();
            return;
        }
        if (b()) {
            if (this.f8978p) {
                if (t.a()) {
                    this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                }
                loadAd(d.b.REFRESH);
                return;
            } else {
                if (t.a()) {
                    this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                }
                this.f8980r = true;
                return;
            }
        }
        if (t.a()) {
            this.logger.a(this.tag, "Refreshing ad from network...");
        }
        loadAd(d.b.REFRESH);
    }

    @Override // com.applovin.impl.C0765v.b
    public void onCreativeIdGenerated(String str, String str2) {
        ce ceVar = this.f8977o;
        if (ceVar != null && ceVar.Q().equalsIgnoreCase(str)) {
            this.f8977o.h(str2);
            bc.b(this.adReviewListener, str2, this.f8977o);
            return;
        }
        ce ceVar2 = this.f8970f;
        if (ceVar2 != null && ceVar2.Q().equalsIgnoreCase(str)) {
            this.f8970f.h(str2);
        }
    }

    @Override // com.applovin.impl.cr.a
    public void onLogVisibilityImpression() {
        a(this.f8977o, this.l.a(this.f8977o));
    }

    public void onWindowVisibilityChanged(int i9) {
        if (((Boolean) this.sdk.a(qe.f10321Y6)).booleanValue() && this.f8975k.h()) {
            if (ar.b(i9)) {
                if (t.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f8975k.d();
            } else {
                if (t.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f8975k.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f8977o != null && t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder n2 = o.n("Setting custom data (", str, ") for Ad Unit ID (");
            n2.append(this.adUnitId);
            n2.append(") after an ad has been loaded already.");
            tVar.k(str2, n2.toString());
        }
        zp.b(str, this.tag);
        this.f8972h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f8977o != null && t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            StringBuilder n2 = o.n("Setting placement (", str, ") for Ad Unit ID (");
            n2.append(this.adUnitId);
            n2.append(") after an ad has been loaded already.");
            tVar.k(str2, n2.toString());
        }
        this.f8971g = str;
    }

    public void setPublisherBackgroundColor(int i9) {
        this.f8969e = i9;
    }

    public void startAutoRefresh() {
        this.f8979q = false;
        if (this.f8975k.g()) {
            this.f8975k.m();
            if (t.a()) {
                this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f8975k.b() + "ms");
                return;
            }
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
        }
    }

    public void stopAutoRefresh() {
        if (this.f8977o != null) {
            if (t.a()) {
                this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f8975k.b() + "ms");
            }
            this.f8975k.j();
            return;
        }
        if (!this.f8983u && !((Boolean) this.sdk.a(qe.f10323a7)).booleanValue()) {
            t.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        } else {
            this.f8979q = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        return n0.n(sb, a(), '}');
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
                this.logger.a(this.tag, AbstractC2914a.c(dpToPx, dpToPx2, "Pinning ad view to MAX ad view with width: ", " and height: ", "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i9 : ar.a(this.b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i9);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void c(ce ceVar) {
        int height = this.b.getHeight();
        int width = this.b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f8966a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f8966a, width);
            MaxAdFormat format = ceVar.getFormat();
            int height2 = (this.f8988z ? format.getAdaptiveSize(pxToDp2, this.b.getContext()) : format.getSize()).getHeight();
            int min = Math.min(format.getSize().getWidth(), x3.b(this.f8966a).x);
            if (pxToDp < height2 || pxToDp2 < min) {
                StringBuilder o3 = n0.o(pxToDp2, pxToDp, "\n**************************************************\n`MaxAdView` size ", "x", " dp smaller than required ");
                o3.append(this.f8988z ? "adaptive " : "");
                o3.append("size: ");
                o3.append(min);
                o3.append("x");
                String g9 = AbstractC2914a.g(o3, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (t.a()) {
                    this.logger.b("AppLovinSdk", g9);
                }
            }
        }
    }

    public void d(ce ceVar) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.d(this, ceVar, 0));
    }

    private void e() {
        ce ceVar;
        MaxAdView maxAdView;
        MaxAdView maxAdView2;
        Boolean bool = (Boolean) this.sdk.a(qe.f10312P7);
        if (bool.booleanValue() && (maxAdView2 = this.b) != null) {
            AbstractC0688e0.a(maxAdView2, this.f8968d);
        }
        this.m.b();
        synchronized (this.f8976n) {
            ceVar = this.f8977o;
        }
        if (ceVar != null) {
            this.sdk.S().destroyAd(ceVar);
        }
        if (bool.booleanValue() || (maxAdView = this.b) == null) {
            return;
        }
        AbstractC0688e0.a(maxAdView, this.f8968d);
    }

    private void f() {
        if (t.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f8970f + "...");
        }
        this.f8973i.onAdLoaded(this.f8970f);
        this.f8970f = null;
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z8 = this.f8983u || ((Boolean) this.sdk.a(qe.f10323a7)).booleanValue();
        if (z8 && !this.f8975k.g() && this.f8975k.h()) {
            t.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f8975k.b()) + " seconds.");
            return;
        }
        if (z8) {
            if (this.f8970f != null) {
                if (t.a()) {
                    this.logger.a(this.tag, "Rendering cached ad");
                }
                f();
                return;
            } else if (this.f8981s) {
                if (t.a()) {
                    this.logger.a(this.tag, "Waiting for precache ad to load to render");
                }
                this.f8980r = true;
                return;
            } else {
                if (t.a()) {
                    this.logger.a(this.tag, "Loading ad...");
                }
                a(bVar, this.f8973i);
                return;
            }
        }
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad...");
        }
        a(bVar, this.f8973i);
    }

    public /* synthetic */ void b(ce ceVar) {
        View x9 = ceVar.x();
        String str = x9 == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.b;
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
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(ceVar);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                L.w(sb, this.adListener, tVar, str2);
            }
            bc.a(this.adListener, (MaxAd) ceVar, (MaxError) maxErrorImpl, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, ceVar);
            return;
        }
        e();
        a((be) ceVar);
        if (ceVar.j0()) {
            this.m.a(ceVar);
        }
        maxAdView.setDescendantFocusability(ImageMetadata.HOT_PIXEL_MODE);
        if (ceVar.l0() != Long.MAX_VALUE) {
            this.f8968d.setBackgroundColor((int) ceVar.l0());
        } else {
            long j7 = this.f8969e;
            if (j7 != Long.MAX_VALUE) {
                this.f8968d.setBackgroundColor((int) j7);
            } else {
                this.f8968d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(x9);
        a(x9, ceVar);
        this.sdk.v().d(ceVar);
        c(ceVar);
        synchronized (this.f8976n) {
            this.f8977o = ceVar;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.S().processRawAdImpression(ceVar, this.f8973i);
        if (StringUtils.isValidString(this.f8977o.getAdReviewCreativeId())) {
            bc.a(this.adReviewListener, this.f8977o.getAdReviewCreativeId(), (MaxAd) this.f8977o, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.d(this, ceVar, 1), ceVar.n0());
    }

    private void d() {
        if (b()) {
            if (t.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f8981s = true;
            this.sdk.l0().a((xl) new kn(this.sdk, "loadMaxAdForPrecacheRequest", new l(this, 1)), sm.b.MEDIATION);
        }
    }

    public /* synthetic */ void a(ce ceVar) {
        long a6 = this.l.a(ceVar);
        if (!ceVar.j0()) {
            a(ceVar, a6);
        }
        a(a6);
    }

    public /* synthetic */ void c() {
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad for pre-cache request...");
        }
        a(d.b.SEQUENTIAL_OR_PRECACHE, this.f8974j);
    }

    private void a(final d.b bVar, final a.InterfaceC0023a interfaceC0023a) {
        if (a()) {
            boolean c9 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAdView", (Map) CollectionUtils.hashMap("details", "debug=" + c9));
            if (!c9) {
                t.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.a(interfaceC0023a, bVar);
            }
        });
    }

    public /* synthetic */ void a(a.InterfaceC0023a interfaceC0023a, d.b bVar) {
        ce ceVar = this.f8977o;
        if (ceVar != null) {
            long a6 = this.l.a(ceVar);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f8977o.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(a6));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getWidth());
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.b.getContext(), this.b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f8975k.g() || this.f8979q));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f8984v));
        if (t.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0023a + "...");
        }
        this.sdk.S().loadAd(this.adUnitId, this.f8967c, this.adFormat, bVar, this.localExtraParameters, this.extraParameters, this.f8966a, interfaceC0023a);
    }

    private boolean b() {
        if (this.f8985w) {
            return false;
        }
        return ((Boolean) this.sdk.a(qe.f10328f7)).booleanValue();
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (t.a()) {
                n0.s("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f8983u = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (t.a()) {
                n0.s("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f8984v = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (t.a()) {
                n0.s("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f8985w = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (t.a()) {
                n0.s("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f8986x = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (t.a()) {
                n0.s("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f8987y = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (t.a()) {
                n0.s("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            this.f8988z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    public void a(MaxError maxError) {
        if (a()) {
            if (t.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(qe.f10317U6).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.L();
            if (t.a()) {
                this.sdk.L().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f8979q && !this.f8975k.g()) {
            this.f8978p = true;
            this.f8981s = false;
            long longValue = ((Long) this.sdk.a(qe.f10316T6)).longValue();
            if (longValue >= 0) {
                this.sdk.L();
                if (t.a()) {
                    t L8 = this.sdk.L();
                    String str = this.tag;
                    StringBuilder a6 = AbstractC2933a.a("Scheduling failed banner ad refresh ", longValue, " milliseconds from now for '");
                    a6.append(this.adUnitId);
                    a6.append("'...");
                    L8.a(str, a6.toString());
                }
                this.f8975k.a(longValue);
                return;
            }
            return;
        }
        if (this.f8981s) {
            if (t.a()) {
                this.logger.a(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
            }
            this.f8981s = false;
        }
        if (this.f8980r) {
            if (t.a()) {
                t tVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("Refresh pre-cache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(this.adUnitId);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                L.w(sb, this.adListener, tVar, str2);
            }
            bc.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(ce ceVar, long j7) {
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.S().processViewabilityAdImpressionPostback(ceVar, j7, this.f8973i);
    }

    private void a(long j7) {
        if (zp.a(j7, ((Long) this.sdk.a(qe.f10327e7)).longValue()) && !this.f8987y) {
            if (t.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j7) + ", undesired: " + Long.toBinaryString(j7));
            }
            if (t.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f8978p = true;
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
        }
        this.f8978p = false;
        d();
    }

    public void a(MaxAd maxAd) {
        this.f8981s = false;
        if (this.f8980r) {
            this.f8980r = false;
            if (t.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f8973i.onAdLoaded(maxAd);
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Saving pre-cache ad...");
        }
        ce ceVar = (ce) maxAd;
        this.f8970f = ceVar;
        ceVar.g(this.f8971g);
        this.f8970f.f(this.f8972h);
    }

    public boolean a() {
        boolean z8;
        synchronized (this.f8976n) {
            z8 = this.f8982t;
        }
        return z8;
    }
}
