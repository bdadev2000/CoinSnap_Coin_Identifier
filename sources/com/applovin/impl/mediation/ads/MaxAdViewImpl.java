package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.t;
import com.applovin.impl.ar;
import com.applovin.impl.br;
import com.applovin.impl.e0;
import com.applovin.impl.gc;
import com.applovin.impl.ge;
import com.applovin.impl.he;
import com.applovin.impl.jn;
import com.applovin.impl.la;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.impl.v;
import com.applovin.impl.ve;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.applovin.impl.zq;
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
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements d.a, br.a, v.b {
    private boolean A;

    /* renamed from: a */
    private final Context f25303a;

    /* renamed from: b */
    private final MaxAdView f25304b;

    /* renamed from: c */
    private final String f25305c;
    private final View d;
    private long e;

    /* renamed from: f */
    private he f25306f;

    /* renamed from: g */
    private String f25307g;

    /* renamed from: h */
    private String f25308h;

    /* renamed from: i */
    private final b f25309i;

    /* renamed from: j */
    private final d f25310j;

    /* renamed from: k */
    private final com.applovin.impl.sdk.d f25311k;

    /* renamed from: l */
    private final ar f25312l;

    /* renamed from: m */
    private final br f25313m;

    /* renamed from: n */
    private final Object f25314n;

    /* renamed from: o */
    private final Object f25315o;

    /* renamed from: p */
    private he f25316p;

    /* renamed from: q */
    private boolean f25317q;

    /* renamed from: r */
    private boolean f25318r;

    /* renamed from: s */
    private final AtomicBoolean f25319s;

    /* renamed from: t */
    private boolean f25320t;

    /* renamed from: u */
    private boolean f25321u;

    /* renamed from: v */
    private boolean f25322v;
    private boolean w;
    private boolean x;

    /* renamed from: y */
    private boolean f25323y;

    /* renamed from: z */
    private boolean f25324z;

    /* loaded from: classes3.dex */
    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            n nVar = MaxAdViewImpl.this.logger;
            if (n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                n nVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                t.x(sb, MaxAdViewImpl.this.adListener, nVar2, str2);
            }
            gc.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.Q().destroyAd(maxAd);
                return;
            }
            he heVar = (he) maxAd;
            heVar.g(MaxAdViewImpl.this.f25307g);
            heVar.f(MaxAdViewImpl.this.f25308h);
            if (heVar.y() == null) {
                MaxAdViewImpl.this.sdk.Q().destroyAd(heVar);
                onAdLoadFailed(heVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (heVar.u0()) {
                long p02 = heVar.p0();
                MaxAdViewImpl.this.sdk.J();
                if (n.a()) {
                    n J = MaxAdViewImpl.this.sdk.J();
                    String str = MaxAdViewImpl.this.tag;
                    StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Scheduling banner ad refresh ", p02, " milliseconds from now for '");
                    r2.append(MaxAdViewImpl.this.adUnitId);
                    r2.append("'...");
                    J.a(str, r2.toString());
                }
                MaxAdViewImpl.this.f25311k.a(p02);
                if (MaxAdViewImpl.this.f25311k.g() || MaxAdViewImpl.this.f25318r) {
                    n nVar2 = MaxAdViewImpl.this.logger;
                    if (n.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f25311k.j();
                }
            }
            n nVar3 = MaxAdViewImpl.this.logger;
            if (n.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                n nVar4 = maxAdViewImpl3.logger;
                String str2 = maxAdViewImpl3.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                t.x(sb, MaxAdViewImpl.this.adListener, nVar4, str2);
            }
            gc.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(heVar);
        }

        public /* synthetic */ b(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0085a {

        /* renamed from: a */
        private boolean f25326a;

        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f25316p)) {
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    t.x(sb, MaxAdViewImpl.this.adListener, nVar2, str);
                }
                gc.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f25316p)) {
                if ((MaxAdViewImpl.this.f25316p.v0() || MaxAdViewImpl.this.f25323y) && this.f25326a) {
                    this.f25326a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    t.x(sb, MaxAdViewImpl.this.adListener, nVar2, str);
                }
                gc.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f25316p)) {
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb.append(maxAd);
                    sb.append(", error=");
                    sb.append(maxError);
                    sb.append("), listener=");
                    t.x(sb, MaxAdViewImpl.this.adListener, nVar2, str);
                }
                gc.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f25316p)) {
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    t.x(sb, MaxAdViewImpl.this.adListener, nVar2, str);
                }
                gc.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f25316p)) {
                if ((MaxAdViewImpl.this.f25316p.v0() || MaxAdViewImpl.this.f25323y) && !MaxAdViewImpl.this.f25311k.g()) {
                    this.f25326a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    t.x(sb, MaxAdViewImpl.this.adListener, nVar2, str);
                }
                gc.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f25316p)) {
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    n nVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    t.x(sb, MaxAdViewImpl.this.adListener, nVar2, str);
                }
                gc.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            n nVar = MaxAdViewImpl.this.logger;
            if (n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                n nVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder v2 = android.support.v4.media.d.v("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                v2.append(MaxAdViewImpl.this.requestListener);
                nVar2.a(str2, v2.toString());
            }
            gc.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            n nVar = MaxAdViewImpl.this.logger;
            if (n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            gc.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            n nVar = MaxAdViewImpl.this.logger;
            if (n.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f25321u) {
                n nVar = MaxAdViewImpl.this.logger;
                if (n.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(ve.j7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            n nVar2 = MaxAdViewImpl.this.logger;
            if (n.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.Q().destroyAd(maxAd);
        }

        public /* synthetic */ d(MaxAdViewImpl maxAdViewImpl, a aVar) {
            this();
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, com.applovin.impl.sdk.j jVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", jVar);
        this.f25305c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.e = Long.MAX_VALUE;
        this.f25314n = new Object();
        this.f25315o = new Object();
        this.f25316p = null;
        this.f25319s = new AtomicBoolean();
        this.f25321u = false;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f25303a = context.getApplicationContext();
        this.f25304b = maxAdView;
        this.d = view;
        this.f25309i = new b();
        this.f25310j = new d();
        this.f25311k = new com.applovin.impl.sdk.d(jVar, this);
        this.f25312l = new ar(maxAdView, jVar);
        this.f25313m = new br(maxAdView, jVar, this);
        jVar.h().a(this);
        if (n.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    private void c(he heVar) {
        int height = this.f25304b.getHeight();
        int width = this.f25304b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f25303a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f25303a, width);
            MaxAdFormat format = heVar.getFormat();
            int height2 = (this.A ? format.getAdaptiveSize(pxToDp2, this.f25304b.getContext()) : format.getSize()).getHeight();
            int min = Math.min(format.getSize().getWidth(), z3.b(this.f25303a).x);
            if (pxToDp < height2 || pxToDp2 < min) {
                StringBuilder u2 = android.support.v4.media.d.u("\n**************************************************\n`MaxAdView` size ", pxToDp2, "x", pxToDp, " dp smaller than required ");
                u2.append(this.A ? "adaptive " : "");
                u2.append("size: ");
                u2.append(min);
                u2.append("x");
                String n2 = androidx.compose.foundation.text.input.a.n(u2, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (n.a()) {
                    this.logger.b("AppLovinSdk", n2);
                }
            }
        }
    }

    public void d(he heVar) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this, heVar, 1));
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        g();
        if (this.f25306f != null) {
            this.sdk.Q().destroyAd(this.f25306f);
        }
        synchronized (this.f25314n) {
            this.f25321u = true;
        }
        this.f25311k.a();
        this.sdk.h().b(this);
        this.sdk.K().c(this.adUnitId, this.f25305c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f25307g;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(ve.j7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.v.b
    public void onCreativeIdGenerated(String str, String str2) {
        he heVar = this.f25316p;
        if (heVar != null && heVar.S().equalsIgnoreCase(str)) {
            this.f25316p.h(str2);
            gc.b(this.adReviewListener, str2, this.f25316p);
            return;
        }
        he heVar2 = this.f25306f;
        if (heVar2 == null || !heVar2.S().equalsIgnoreCase(str)) {
            return;
        }
        this.f25306f.h(str2);
    }

    @Override // com.applovin.impl.br.a
    public void onLogVisibilityImpression() {
        a(this.f25316p, this.f25312l.a(this.f25316p));
    }

    public void onWindowVisibilityChanged(int i2) {
        if (((Boolean) this.sdk.a(ve.g7)).booleanValue() && this.f25311k.h()) {
            if (zq.b(i2)) {
                if (n.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f25311k.d();
            } else {
                if (n.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f25311k.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f25316p != null && n.a()) {
            n nVar = this.logger;
            String str2 = this.tag;
            StringBuilder v2 = android.support.v4.media.d.v("Setting custom data (", str, ") for Ad Unit ID (");
            v2.append(this.adUnitId);
            v2.append(") after an ad has been loaded already.");
            nVar.k(str2, v2.toString());
        }
        yp.b(str, this.tag);
        this.f25308h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f25316p != null && n.a()) {
            n nVar = this.logger;
            String str2 = this.tag;
            StringBuilder v2 = android.support.v4.media.d.v("Setting placement (", str, ") for Ad Unit ID (");
            v2.append(this.adUnitId);
            v2.append(") after an ad has been loaded already.");
            nVar.k(str2, v2.toString());
        }
        this.f25307g = str;
    }

    public void setPublisherBackgroundColor(int i2) {
        this.e = i2;
    }

    public void startAutoRefresh() {
        this.f25318r = false;
        if (!this.f25311k.g()) {
            if (n.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f25311k.m();
        if (n.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f25311k.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f25316p == null) {
            if (this.f25322v || ((Boolean) this.sdk.a(ve.i7)).booleanValue()) {
                this.f25318r = true;
                return;
            } else {
                n.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (n.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f25311k.b() + "ms");
        }
        this.f25311k.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f25304b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        return android.support.v4.media.d.s(sb, a(), '}');
    }

    private void a(View view, he heVar) {
        int t02 = heVar.t0();
        int r02 = heVar.r0();
        int dpToPx = t02 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), t02);
        int dpToPx2 = r02 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), r02) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (n.a()) {
                this.logger.a(this.tag, android.support.v4.media.d.l("Pinning ad view to MAX ad view with width: ", dpToPx, " and height: ", dpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i2 : zq.a(this.f25304b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i2);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void e() {
        this.f25319s.set(false);
        if (this.f25306f != null) {
            h();
            return;
        }
        if (!b()) {
            if (n.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(d.b.REFRESH);
        } else if (this.f25317q) {
            if (n.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(d.b.REFRESH);
        } else {
            if (n.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f25319s.set(true);
        }
    }

    private void f() {
        boolean z2;
        boolean z3;
        synchronized (this.f25315o) {
            try {
                z2 = false;
                this.f25319s.set(false);
                z3 = this.f25306f != null;
                if (!z3) {
                    if (b()) {
                        if (this.f25317q) {
                            if (n.a()) {
                                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                            }
                        } else {
                            if (n.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f25319s.set(true);
                        }
                    } else if (n.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            h();
        } else if (z2) {
            loadAd(d.b.REFRESH);
        }
    }

    private void g() {
        he heVar;
        MaxAdView maxAdView = this.f25304b;
        if (maxAdView != null) {
            e0.a(maxAdView, this.d);
        }
        this.f25313m.b();
        synchronized (this.f25314n) {
            heVar = this.f25316p;
        }
        if (heVar != null) {
            this.sdk.Q().destroyAd(heVar);
        }
    }

    private void h() {
        if (n.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f25306f + "...");
        }
        this.f25309i.onAdLoaded(this.f25306f);
        this.f25306f = null;
    }

    public void loadAd(d.b bVar) {
        if (n.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z2 = this.f25322v || ((Boolean) this.sdk.a(ve.i7)).booleanValue();
        if (z2 && !this.f25311k.g() && this.f25311k.h()) {
            n.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f25311k.b()) + " seconds.");
            return;
        }
        if (!z2) {
            if (n.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, this.f25309i);
        } else if (this.f25306f != null) {
            if (n.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            h();
        } else if (this.f25320t) {
            if (n.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f25319s.set(true);
        } else {
            if (n.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, this.f25309i);
        }
    }

    public /* synthetic */ void b(he heVar) {
        View y2 = heVar.y();
        String str = y2 == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f25304b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (n.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (n.a()) {
                n nVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(heVar);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                t.x(sb, this.adListener, nVar, str2);
            }
            gc.a(this.adListener, (MaxAd) heVar, (MaxError) maxErrorImpl, true);
            this.sdk.Q().processAdDisplayErrorPostbackForUserError(maxErrorImpl, heVar);
            return;
        }
        g();
        a((ge) heVar);
        if (heVar.o0()) {
            this.f25313m.a(heVar);
        }
        maxAdView.setDescendantFocusability(Opcodes.ASM6);
        if (heVar.q0() != Long.MAX_VALUE) {
            this.d.setBackgroundColor((int) heVar.q0());
        } else {
            long j2 = this.e;
            if (j2 != Long.MAX_VALUE) {
                this.d.setBackgroundColor((int) j2);
            } else {
                this.d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(y2);
        a(y2, heVar);
        this.sdk.w().d(heVar);
        c(heVar);
        synchronized (this.f25314n) {
            this.f25316p = heVar;
        }
        if (n.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.Q().processRawAdImpression(heVar, this.f25309i);
        if (StringUtils.isValidString(this.f25316p.getAdReviewCreativeId())) {
            gc.a(this.adReviewListener, this.f25316p.getAdReviewCreativeId(), (MaxAd) this.f25316p, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.c(this, heVar, 0), heVar.s0());
    }

    private void d() {
        if (b()) {
            if (n.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f25320t = true;
            this.sdk.j0().a((yl) new jn(this.sdk, "loadMaxAdForPrecacheRequest", new k(this, 1)), tm.b.MEDIATION);
        }
    }

    public /* synthetic */ void c() {
        if (n.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(d.b.SEQUENTIAL_OR_PRECACHE, this.f25310j);
    }

    public /* synthetic */ void a(he heVar) {
        long a2 = this.f25312l.a(heVar);
        if (!heVar.o0()) {
            a(heVar, a2);
        }
        a(a2);
    }

    private void a(final d.b bVar, final a.InterfaceC0085a interfaceC0085a) {
        if (a()) {
            boolean c2 = yp.c(this.sdk);
            this.sdk.E().a(la.L, "attemptingToLoadDestroyedAdView", (Map) CollectionUtils.hashMap("details", "debug=" + c2));
            if (!c2) {
                n.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                MaxAdViewImpl.this.a(interfaceC0085a, bVar);
            }
        });
    }

    public void b(MaxAd maxAd) {
        boolean compareAndSet;
        this.f25320t = false;
        synchronized (this.f25315o) {
            try {
                compareAndSet = this.f25319s.compareAndSet(true, false);
                if (!compareAndSet) {
                    if (n.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    he heVar = (he) maxAd;
                    this.f25306f = heVar;
                    heVar.g(this.f25307g);
                    this.f25306f.f(this.f25308h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (compareAndSet) {
            if (n.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f25309i.onAdLoaded(maxAd);
        }
    }

    public /* synthetic */ void a(a.InterfaceC0085a interfaceC0085a, d.b bVar) {
        he heVar = this.f25316p;
        if (heVar != null) {
            long a2 = this.f25312l.a(heVar);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f25316p.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(a2));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f25304b.getContext(), this.f25304b.getWidth());
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f25304b.getContext(), this.f25304b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f25311k.g() || this.f25318r));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.w));
        if (n.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0085a + "...");
        }
        this.sdk.Q().loadAd(this.adUnitId, this.f25305c, this.adFormat, bVar, this.localExtraParameters, this.extraParameters, this.f25303a, interfaceC0085a);
    }

    private boolean b() {
        if (this.x) {
            return false;
        }
        return ((Boolean) this.sdk.a(ve.o7)).booleanValue();
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (n.a()) {
                t.v("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f25322v = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (n.a()) {
                t.v("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.w = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (n.a()) {
                t.v("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.x = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (n.a()) {
                t.v("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f25323y = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (n.a()) {
                t.v("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f25324z = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (n.a()) {
                t.v("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            this.A = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    public void a(MaxError maxError) {
        if (a()) {
            if (n.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(ve.c7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.J();
            if (n.a()) {
                this.sdk.J().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f25318r && !this.f25311k.g()) {
            this.f25317q = true;
            this.f25320t = false;
            long longValue = ((Long) this.sdk.a(ve.b7)).longValue();
            if (longValue >= 0) {
                this.sdk.J();
                if (n.a()) {
                    n J = this.sdk.J();
                    String str = this.tag;
                    StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Scheduling failed banner ad refresh ", longValue, " milliseconds from now for '");
                    r2.append(this.adUnitId);
                    r2.append("'...");
                    J.a(str, r2.toString());
                }
                this.f25311k.a(longValue);
                return;
            }
            return;
        }
        if (this.f25320t) {
            if (n.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f25320t = false;
        }
        if (this.f25319s.get()) {
            if (n.a()) {
                n nVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(this.adUnitId);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                t.x(sb, this.adListener, nVar, str2);
            }
            gc.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(he heVar, long j2) {
        if (n.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.Q().processViewabilityAdImpressionPostback(heVar, j2, this.f25309i);
    }

    private void a(long j2) {
        if (yp.a(j2, ((Long) this.sdk.a(ve.n7)).longValue()) && !this.f25324z) {
            if (n.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j2) + ", undesired: " + Long.toBinaryString(j2));
            }
            if (n.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f25317q = true;
            return;
        }
        if (n.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f25317q = false;
        d();
    }

    public void a(MaxAd maxAd) {
        this.f25320t = false;
        if (this.f25319s.compareAndSet(true, false)) {
            if (n.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f25309i.onAdLoaded(maxAd);
            return;
        }
        if (n.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        he heVar = (he) maxAd;
        this.f25306f = heVar;
        heVar.g(this.f25307g);
        this.f25306f.f(this.f25308h);
    }

    public boolean a() {
        boolean z2;
        synchronized (this.f25314n) {
            z2 = this.f25321u;
        }
        return z2;
    }
}
