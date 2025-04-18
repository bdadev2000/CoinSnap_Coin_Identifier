package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.aa;
import com.applovin.impl.adview.k;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.ca;
import com.applovin.impl.e0;
import com.applovin.impl.g0;
import com.applovin.impl.ig;
import com.applovin.impl.kg;
import com.applovin.impl.kn;
import com.applovin.impl.lb;
import com.applovin.impl.lc;
import com.applovin.impl.oj;
import com.applovin.impl.qb;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sm;
import com.applovin.impl.ur;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import h.o0;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber {
    private static final AtomicReference G = new AtomicReference();
    private volatile AppLovinAdLoadListener B;
    private volatile AppLovinAdDisplayListener C;
    private volatile AppLovinAdViewEventListener D;
    private volatile AppLovinAdClickListener E;
    private Context a;

    /* renamed from: b */
    private ViewGroup f3652b;

    /* renamed from: c */
    private com.applovin.impl.sdk.k f3653c;

    /* renamed from: d */
    private AppLovinAdServiceImpl f3654d;

    /* renamed from: f */
    private com.applovin.impl.sdk.t f3655f;

    /* renamed from: g */
    private AppLovinCommunicator f3656g;

    /* renamed from: h */
    private b f3657h;

    /* renamed from: j */
    private AppLovinAdSize f3659j;

    /* renamed from: k */
    private String f3660k;

    /* renamed from: l */
    private o.s f3661l;

    /* renamed from: m */
    private com.applovin.impl.adview.c f3662m;

    /* renamed from: n */
    private e f3663n;

    /* renamed from: o */
    private com.applovin.impl.adview.b f3664o;

    /* renamed from: p */
    private k f3665p;

    /* renamed from: q */
    private Runnable f3666q;

    /* renamed from: r */
    private Runnable f3667r;

    /* renamed from: i */
    private final Map f3658i = a4.j.r();

    /* renamed from: s */
    private volatile com.applovin.impl.sdk.ad.b f3668s = null;

    /* renamed from: t */
    private volatile AppLovinAd f3669t = null;
    private f u = null;

    /* renamed from: v */
    private f f3670v = null;

    /* renamed from: w */
    private final AtomicReference f3671w = new AtomicReference();

    /* renamed from: x */
    private final AtomicBoolean f3672x = new AtomicBoolean();

    /* renamed from: y */
    private volatile boolean f3673y = false;

    /* renamed from: z */
    private volatile boolean f3674z = false;
    private volatile boolean A = false;
    private volatile g0 F = null;

    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar);
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f3664o != null) {
                a.this.f3664o.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0011a c0011a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a */
        /* loaded from: classes.dex */
        public class C0012a implements k.a {
            public C0012a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f3664o.addView(a.this.f3665p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                com.applovin.impl.sdk.t unused = a.this.f3655f;
                if (com.applovin.impl.sdk.t.a()) {
                    a.this.f3655f.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f3668s != null) {
                if (a.this.f3664o != null) {
                    a.this.w();
                    com.applovin.impl.sdk.t unused = a.this.f3655f;
                    if (com.applovin.impl.sdk.t.a()) {
                        a.this.f3655f.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f3668s.getAdIdNumber() + "...");
                    }
                    a.b(a.this.f3664o, a.this.f3668s.getSize());
                    if (a.this.f3665p != null) {
                        ar.c(a.this.f3665p);
                        a.this.f3665p = null;
                    }
                    ca caVar = new ca(a.this.f3658i, a.this.f3653c);
                    if (caVar.c()) {
                        a.this.f3665p = new k(caVar, a.this.a);
                        a.this.f3665p.a(new C0012a());
                    }
                    a.this.f3664o.setAdHtmlLoaded(false);
                    a.this.f3664o.a(a.this.f3668s);
                    if (a.this.f3668s.getSize() != AppLovinAdSize.INTERSTITIAL && !a.this.f3674z) {
                        a.this.f3668s.setHasShown(true);
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.t.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f3668s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                bc.a(a.this.D, a.this.f3668s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
            }
        }

        public /* synthetic */ d(a aVar, C0011a c0011a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements AppLovinAdLoadListener {
        private final a a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar != null) {
                if (kVar != null) {
                    this.a = aVar;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No view specified");
        }

        private a a() {
            return this.a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a a = a();
            if (a != null) {
                a.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.t.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a a = a();
            if (a != null) {
                a.b(i10);
            }
        }
    }

    private void F() {
        com.applovin.impl.adview.b bVar;
        if (this.f3655f != null && com.applovin.impl.sdk.t.a() && com.applovin.impl.sdk.t.a()) {
            this.f3655f.a("AppLovinAdView", "Destroying...");
        }
        if (((Boolean) this.f3653c.a(oj.G1)).booleanValue() && (bVar = this.f3664o) != null) {
            ur.a(bVar);
            f().a(this.f3664o, new n0.h(7));
        } else {
            ur.b(this.f3664o);
        }
        this.f3664o = null;
        this.f3661l = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.D = null;
        this.f3674z = true;
    }

    public static /* synthetic */ void f(a aVar, int i10) {
        aVar.a(i10);
    }

    public /* synthetic */ void u() {
        g().loadUrl("chrome://crash");
    }

    public void w() {
        com.applovin.impl.sdk.ad.b bVar = this.f3668s;
        lc lcVar = new lc();
        lcVar.a().a(bVar).a(k());
        if (!zp.a(bVar.getSize())) {
            lcVar.a().a("Fullscreen Ad Properties").b(bVar);
        }
        lcVar.a(this.f3653c);
        lcVar.a();
        if (com.applovin.impl.sdk.t.a()) {
            this.f3655f.a("AppLovinAdView", lcVar.toString());
        }
    }

    public void A() {
        if (e0.a(this.f3664o)) {
            this.f3653c.F().c(aa.f3628r);
        }
    }

    public void B() {
        if (!this.f3673y) {
            return;
        }
        bc.b(this.C, this.f3668s);
        if (this.f3668s != null && this.f3668s.isOpenMeasurementEnabled() && zp.a(this.f3668s.getSize())) {
            this.f3668s.getAdEventTracker().f();
        }
        if (this.f3664o != null && this.u != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3655f.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
            }
            c();
        } else if (com.applovin.impl.sdk.t.a()) {
            this.f3655f.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
        }
    }

    public void C() {
        this.A = true;
    }

    public void D() {
        this.A = false;
    }

    public void E() {
        if (this.f3673y && !this.f3674z) {
            this.f3674z = true;
        }
    }

    public void G() {
        if (!this.f3673y) {
            return;
        }
        AppLovinAd appLovinAd = (AppLovinAd) this.f3671w.getAndSet(null);
        if (appLovinAd != null) {
            c(appLovinAd);
        }
        this.f3674z = false;
    }

    public void a(g0 g0Var) {
        this.F = g0Var;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    public g0 h() {
        return this.F;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new o(this, 3));
        }
    }

    public void v() {
        if (this.f3653c != null && this.f3663n != null && this.a != null && this.f3673y) {
            this.f3654d.loadNextAd(this.f3660k, this.f3659j, this.f3663n);
        } else {
            com.applovin.impl.sdk.t.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    public void x() {
        if ((this.a instanceof r6) && this.f3668s != null && this.f3668s.R() == b.EnumC0034b.DISMISS) {
            ((r6) this.a).dismiss();
        }
    }

    public void y() {
        if (this.u == null && this.f3670v == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3655f.a("AppLovinAdView", "Ad: " + this.f3668s + " closed.");
            }
            a(this.f3667r);
            bc.b(this.C, this.f3668s);
            this.f3668s = null;
            return;
        }
        a();
    }

    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f3655f.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f3657h;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int applyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int i10 = -1;
        if (label.equals(appLovinAdSize2.getLabel())) {
            applyDimension = -1;
        } else if (appLovinAdSize.getWidth() == -1) {
            applyDimension = displayMetrics.widthPixels;
        } else {
            applyDimension = (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
            if (appLovinAdSize.getHeight() == -1) {
                i10 = displayMetrics.heightPixels;
            } else {
                i10 = (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = i10;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new o(this, 0));
    }

    public /* synthetic */ com.applovin.impl.adview.b o() {
        return new com.applovin.impl.adview.b(this.f3653c, this.a.getApplicationContext());
    }

    public /* synthetic */ void p() {
        this.f3664o.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    public /* synthetic */ void q() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f3652b == null || (bVar = this.f3664o) == null || bVar.getParent() != null) {
            return;
        }
        this.f3652b.addView(this.f3664o);
        b(this.f3664o, this.f3668s.getSize());
        if (this.f3668s.isOpenMeasurementEnabled()) {
            this.f3668s.getAdEventTracker().a((View) this.f3664o);
        }
    }

    public /* synthetic */ void r() {
        if (this.f3664o != null && this.u != null) {
            a();
        }
        F();
    }

    public /* synthetic */ void s() {
        if (this.u != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3655f.a("AppLovinAdView", "Detaching expanded ad: " + this.u.b());
            }
            this.f3670v = this.u;
            this.u = null;
            a(this.f3659j);
        }
    }

    public /* synthetic */ void t() {
        com.applovin.impl.sdk.ad.a b3;
        f fVar = this.f3670v;
        if (fVar == null && this.u == null) {
            return;
        }
        if (fVar != null) {
            b3 = fVar.b();
            this.f3670v.dismiss();
            this.f3670v = null;
        } else {
            b3 = this.u.b();
            this.u.dismiss();
            this.u = null;
        }
        bc.a(this.D, b3, (AppLovinAdView) this.f3652b);
    }

    public com.applovin.impl.adview.b g() {
        return this.f3664o;
    }

    public com.applovin.impl.sdk.ad.b i() {
        return this.f3668s;
    }

    public o.s j() {
        return this.f3661l;
    }

    public AppLovinAdView k() {
        return (AppLovinAdView) this.f3652b;
    }

    public com.applovin.impl.sdk.k l() {
        return this.f3653c;
    }

    public AppLovinAdSize m() {
        return this.f3659j;
    }

    public String n() {
        return this.f3660k;
    }

    private void d() {
        a(new o(this, 4));
    }

    public static qb f() {
        AtomicReference atomicReference = G;
        Object obj = atomicReference.get();
        if (obj == null) {
            synchronized (atomicReference) {
                obj = atomicReference.get();
                if (obj == null) {
                    obj = new qb.d();
                    atomicReference.set(obj);
                }
            }
        }
        if (obj == atomicReference) {
            obj = null;
        }
        return (qb) obj;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public AppLovinAdViewEventListener e() {
        return this.D;
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.B = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.C = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.D = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.E = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f3653c = kVar;
            this.f3654d = kVar.i();
            this.f3655f = kVar.L();
            this.f3656g = AppLovinCommunicator.getInstance(context);
            this.f3659j = appLovinAdSize;
            this.f3660k = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.a = context;
            this.f3652b = appLovinAdView;
            this.f3662m = new com.applovin.impl.adview.c(this, kVar);
            this.f3667r = new c();
            this.f3666q = new d();
            this.f3663n = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new o(this, 2));
    }

    public /* synthetic */ void b(WebView webView) {
        this.f3668s.getAdEventTracker().c(webView);
        k kVar = this.f3665p;
        if (kVar != null && kVar.a()) {
            ig adEventTracker = this.f3668s.getAdEventTracker();
            k kVar2 = this.f3665p;
            adEventTracker.b(webView, Collections.singletonList(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f3668s.getAdEventTracker().a((View) webView);
        }
        this.f3668s.getAdEventTracker().h();
        this.f3668s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            if (((Boolean) this.f3653c.a(oj.G1)).booleanValue()) {
                this.f3664o = (com.applovin.impl.adview.b) f().a(new qb.a() { // from class: com.applovin.impl.adview.q
                    @Override // com.applovin.impl.qb.a
                    public final Object a() {
                        b o10;
                        o10 = a.this.o();
                        return o10;
                    }
                });
            } else {
                this.f3664o = new com.applovin.impl.adview.b(this.f3653c, this.a);
            }
            this.f3664o.a(this.f3662m);
            this.f3664o.setBackgroundColor(0);
            this.f3664o.setWillNotCacheDrawing(false);
            this.f3652b.setBackgroundColor(0);
            this.f3652b.addView(this.f3664o);
            b(this.f3664o, appLovinAdSize);
            if (!this.f3673y) {
                a(this.f3667r);
            }
            a(new o(this, 5));
            this.f3673y = true;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("AppLovinAdView", "Failed to initialize AdWebView", th2);
            this.f3653c.B().a("AppLovinAdView", "initAdWebView", th2);
            this.f3672x.set(true);
        }
    }

    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.u == null && (this.f3668s instanceof com.applovin.impl.sdk.ad.a) && this.f3664o != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f3668s;
            Context context = this.a;
            Activity a = context instanceof Activity ? (Activity) context : ar.a(this.f3664o, this.f3653c);
            if (a != null && !a.isFinishing()) {
                ViewGroup viewGroup = this.f3652b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3664o);
                }
                f fVar = new f(aVar, this.f3664o, a, this.f3653c);
                this.u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.p
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        a.this.a(dialogInterface);
                    }
                });
                this.u.show();
                bc.c(this.D, this.f3668s, (AppLovinAdView) this.f3652b);
                if (this.f3668s.isOpenMeasurementEnabled()) {
                    this.f3668s.getAdEventTracker().a((View) this.u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.t.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri j3 = aVar.j();
            if (j3 != null) {
                this.f3654d.trackAndLaunchClick(aVar, k(), this, j3, motionEvent, this.A, null);
            }
            this.f3664o.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.t.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = e0.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (e0.b(attributeSet)) {
                v();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f3674z) {
                c(appLovinAd);
            } else {
                this.f3671w.set(appLovinAd);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f3655f.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new o0(10, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f3655f.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f3658i.put(str, obj);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            zp.b(appLovinAd, this.f3653c);
            if (this.f3673y) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) zp.a(appLovinAd, this.f3653c);
                if (bVar == null) {
                    com.applovin.impl.sdk.t.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    bc.a(this.C, "Unable to retrieve the loaded ad");
                    return;
                }
                if (bVar == this.f3668s) {
                    com.applovin.impl.sdk.t.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f3653c.a(oj.Y1)).booleanValue()) {
                        if (this.C instanceof lb) {
                            bc.a(this.C, "Attempting to show ad again");
                            return;
                        }
                        throw new IllegalStateException("Attempting to show ad again");
                    }
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f3655f.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                bc.b(this.C, this.f3668s);
                if (this.f3668s != null && this.f3668s.isOpenMeasurementEnabled()) {
                    this.f3668s.getAdEventTracker().f();
                }
                this.f3671w.set(null);
                this.f3669t = null;
                this.f3668s = bVar;
                if (this.f3668s.A0()) {
                    this.f3661l = this.f3653c.w().a(this);
                    this.f3653c.w().b(this.f3668s.A(), this.f3661l);
                }
                if (!this.f3674z && zp.a(this.f3659j)) {
                    this.f3653c.i().trackImpression(bVar);
                }
                if (this.u != null) {
                    c();
                }
                a(this.f3666q);
                return;
            }
            com.applovin.impl.sdk.t.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    public void b(int i10) {
        if (!this.f3674z) {
            a(this.f3667r);
        }
        a(new f0.m(i10, 1, this));
    }

    public void a(WebView webView, String str) {
        if (this.f3668s == null) {
            return;
        }
        a(new u(webView, 2));
        if (!((Boolean) this.f3653c.a(oj.f6710m6)).booleanValue() || (str != null && str.startsWith(this.f3668s.h()))) {
            try {
                if (this.f3668s != this.f3669t) {
                    this.f3669t = this.f3668s;
                    this.f3664o.setAdHtmlLoaded(true);
                    if (this.C != null) {
                        this.f3653c.v().d(this.f3668s);
                        bc.a(this.C, this.f3668s);
                        this.f3664o.a("javascript:al_onAdViewRendered();");
                    }
                    if ((this.f3668s instanceof com.applovin.impl.sdk.ad.a) && this.f3668s.isOpenMeasurementEnabled()) {
                        this.f3653c.l0().a(new kn(this.f3653c, "StartOMSDK", new o0(11, this, webView)), sm.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th2) {
                com.applovin.impl.sdk.t.c("AppLovinAdView", "Exception while notifying ad display listener", th2);
                com.applovin.impl.sdk.k kVar = this.f3653c;
                if (kVar != null) {
                    kVar.B().a("AppLovinAdView", "onAdHtmlLoaded", th2);
                }
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        a(new o0(12, this, motionEvent));
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new o(this, 1));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (appLovinAdView != null) {
            this.f3654d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent, this.A, bundle);
        } else if (com.applovin.impl.sdk.t.a()) {
            this.f3655f.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        bc.a(this.E, bVar);
    }

    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f3672x.compareAndSet(true, false)) {
            a(this.f3659j);
        }
        try {
            if (this.B != null) {
                this.B.adReceived(appLovinAd);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.h("AppLovinAdView", "Exception while running ad load callback: " + th2.getMessage());
            com.applovin.impl.sdk.k kVar = this.f3653c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoaded", th2);
            }
        }
    }

    public /* synthetic */ void a(int i10) {
        try {
            if (this.B != null) {
                this.B.failedToReceiveAd(i10);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.t.c("AppLovinAdView", "Exception while running app load callback", th2);
            com.applovin.impl.sdk.k kVar = this.f3653c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoadFailed", th2);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f3657h = bVar;
    }
}
