package com.applovin.impl.adview;

import Q7.n0;
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
import com.applovin.impl.AbstractC0688e0;
import com.applovin.impl.InterfaceC0698g0;
import com.applovin.impl.aa;
import com.applovin.impl.adview.k;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.ca;
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
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import u.C2744m;

/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber {

    /* renamed from: G */
    private static final AtomicReference f6635G = new AtomicReference();

    /* renamed from: B */
    private volatile AppLovinAdLoadListener f6637B;

    /* renamed from: C */
    private volatile AppLovinAdDisplayListener f6638C;

    /* renamed from: D */
    private volatile AppLovinAdViewEventListener f6639D;

    /* renamed from: E */
    private volatile AppLovinAdClickListener f6640E;

    /* renamed from: a */
    private Context f6642a;
    private ViewGroup b;

    /* renamed from: c */
    private com.applovin.impl.sdk.k f6643c;

    /* renamed from: d */
    private AppLovinAdServiceImpl f6644d;

    /* renamed from: f */
    private com.applovin.impl.sdk.t f6645f;

    /* renamed from: g */
    private AppLovinCommunicator f6646g;

    /* renamed from: h */
    private b f6647h;

    /* renamed from: j */
    private AppLovinAdSize f6649j;

    /* renamed from: k */
    private String f6650k;
    private C2744m l;
    private com.applovin.impl.adview.c m;

    /* renamed from: n */
    private e f6651n;

    /* renamed from: o */
    private com.applovin.impl.adview.b f6652o;

    /* renamed from: p */
    private k f6653p;

    /* renamed from: q */
    private Runnable f6654q;

    /* renamed from: r */
    private Runnable f6655r;

    /* renamed from: i */
    private final Map f6648i = n0.q();

    /* renamed from: s */
    private volatile com.applovin.impl.sdk.ad.b f6656s = null;

    /* renamed from: t */
    private volatile AppLovinAd f6657t = null;

    /* renamed from: u */
    private f f6658u = null;

    /* renamed from: v */
    private f f6659v = null;

    /* renamed from: w */
    private final AtomicReference f6660w = new AtomicReference();

    /* renamed from: x */
    private final AtomicBoolean f6661x = new AtomicBoolean();

    /* renamed from: y */
    private volatile boolean f6662y = false;

    /* renamed from: z */
    private volatile boolean f6663z = false;

    /* renamed from: A */
    private volatile boolean f6636A = false;

    /* renamed from: F */
    private volatile InterfaceC0698g0 f6641F = null;

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
            if (a.this.f6652o != null) {
                a.this.f6652o.setVisibility(8);
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
                a.this.f6652o.addView(a.this.f6653p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                com.applovin.impl.sdk.t unused = a.this.f6645f;
                if (com.applovin.impl.sdk.t.a()) {
                    a.this.f6645f.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f6656s != null) {
                if (a.this.f6652o != null) {
                    a.this.w();
                    com.applovin.impl.sdk.t unused = a.this.f6645f;
                    if (com.applovin.impl.sdk.t.a()) {
                        a.this.f6645f.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f6656s.getAdIdNumber() + "...");
                    }
                    a.b(a.this.f6652o, a.this.f6656s.getSize());
                    if (a.this.f6653p != null) {
                        ar.c(a.this.f6653p);
                        a.this.f6653p = null;
                    }
                    ca caVar = new ca(a.this.f6648i, a.this.f6643c);
                    if (caVar.c()) {
                        a.this.f6653p = new k(caVar, a.this.f6642a);
                        a.this.f6653p.a(new C0012a());
                    }
                    a.this.f6652o.setAdHtmlLoaded(false);
                    a.this.f6652o.a(a.this.f6656s);
                    if (a.this.f6656s.getSize() != AppLovinAdSize.INTERSTITIAL && !a.this.f6663z) {
                        a.this.f6656s.setHasShown(true);
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.t.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f6656s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                bc.a(a.this.f6639D, a.this.f6656s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
            }
        }

        public /* synthetic */ d(a aVar, C0011a c0011a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final a f6667a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar != null) {
                if (kVar != null) {
                    this.f6667a = aVar;
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No view specified");
        }

        private a a() {
            return this.f6667a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a a6 = a();
            if (a6 != null) {
                a6.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.t.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i9) {
            a a6 = a();
            if (a6 != null) {
                a6.b(i9);
            }
        }
    }

    private void F() {
        com.applovin.impl.adview.b bVar;
        if (this.f6645f != null && com.applovin.impl.sdk.t.a() && com.applovin.impl.sdk.t.a()) {
            this.f6645f.a("AppLovinAdView", "Destroying...");
        }
        if (((Boolean) this.f6643c.a(oj.f9593G1)).booleanValue() && (bVar = this.f6652o) != null) {
            ur.a(bVar);
            f().a(this.f6652o, new A4.a(22));
        } else {
            ur.b(this.f6652o);
        }
        this.f6652o = null;
        this.l = null;
        this.f6637B = null;
        this.f6638C = null;
        this.f6640E = null;
        this.f6639D = null;
        this.f6663z = true;
    }

    public void w() {
        com.applovin.impl.sdk.ad.b bVar = this.f6656s;
        lc lcVar = new lc();
        lcVar.a().a(bVar).a(k());
        if (!zp.a(bVar.getSize())) {
            lcVar.a().a("Fullscreen Ad Properties").b(bVar);
        }
        lcVar.a(this.f6643c);
        lcVar.a();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6645f.a("AppLovinAdView", lcVar.toString());
        }
    }

    public void A() {
        if (AbstractC0688e0.a(this.f6652o)) {
            this.f6643c.F().c(aa.f6608r);
        }
    }

    public void B() {
        if (!this.f6662y) {
            return;
        }
        bc.b(this.f6638C, this.f6656s);
        if (this.f6656s != null && this.f6656s.isOpenMeasurementEnabled() && zp.a(this.f6656s.getSize())) {
            this.f6656s.getAdEventTracker().f();
        }
        if (this.f6652o != null && this.f6658u != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6645f.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
            }
            c();
        } else if (com.applovin.impl.sdk.t.a()) {
            this.f6645f.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
        }
    }

    public void C() {
        this.f6636A = true;
    }

    public void D() {
        this.f6636A = false;
    }

    public void E() {
        if (this.f6662y && !this.f6663z) {
            this.f6663z = true;
        }
    }

    public void G() {
        if (!this.f6662y) {
            return;
        }
        AppLovinAd appLovinAd = (AppLovinAd) this.f6660w.getAndSet(null);
        if (appLovinAd != null) {
            c(appLovinAd);
        }
        this.f6663z = false;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    public InterfaceC0698g0 h() {
        return this.f6641F;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new o(this, 4));
        }
    }

    public void v() {
        if (this.f6643c != null && this.f6651n != null && this.f6642a != null && this.f6662y) {
            this.f6644d.loadNextAd(this.f6650k, this.f6649j, this.f6651n);
        } else {
            com.applovin.impl.sdk.t.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    public void x() {
        if ((this.f6642a instanceof r6) && this.f6656s != null && this.f6656s.R() == b.EnumC0034b.DISMISS) {
            ((r6) this.f6642a).dismiss();
        }
    }

    public void y() {
        if (this.f6658u == null && this.f6659v == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6645f.a("AppLovinAdView", "Ad: " + this.f6656s + " closed.");
            }
            a(this.f6655r);
            bc.b(this.f6638C, this.f6656s);
            this.f6656s = null;
            return;
        }
        a();
    }

    public void z() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f6645f.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f6647h;
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
        int i9 = -1;
        if (label.equals(appLovinAdSize2.getLabel())) {
            applyDimension = -1;
        } else if (appLovinAdSize.getWidth() == -1) {
            applyDimension = displayMetrics.widthPixels;
        } else {
            applyDimension = (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
            if (appLovinAdSize.getHeight() == -1) {
                i9 = displayMetrics.heightPixels;
            } else {
                i9 = (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = i9;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new o(this, 2));
    }

    public static qb f() {
        AtomicReference atomicReference = f6635G;
        Object obj = atomicReference.get();
        if (obj == null) {
            synchronized (atomicReference) {
                try {
                    obj = atomicReference.get();
                    if (obj == null) {
                        obj = new qb.d();
                        atomicReference.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == atomicReference) {
            obj = null;
        }
        return (qb) obj;
    }

    public /* synthetic */ com.applovin.impl.adview.b o() {
        return new com.applovin.impl.adview.b(this.f6643c, this.f6642a.getApplicationContext());
    }

    public /* synthetic */ void p() {
        this.f6652o.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    public /* synthetic */ void q() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.b == null || (bVar = this.f6652o) == null || bVar.getParent() != null) {
            return;
        }
        this.b.addView(this.f6652o);
        b(this.f6652o, this.f6656s.getSize());
        if (this.f6656s.isOpenMeasurementEnabled()) {
            this.f6656s.getAdEventTracker().a((View) this.f6652o);
        }
    }

    public /* synthetic */ void r() {
        if (this.f6652o != null && this.f6658u != null) {
            a();
        }
        F();
    }

    public /* synthetic */ void s() {
        if (this.f6658u != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6645f.a("AppLovinAdView", "Detaching expanded ad: " + this.f6658u.b());
            }
            this.f6659v = this.f6658u;
            this.f6658u = null;
            a(this.f6649j);
        }
    }

    public /* synthetic */ void t() {
        com.applovin.impl.sdk.ad.a b8;
        f fVar = this.f6659v;
        if (fVar == null && this.f6658u == null) {
            return;
        }
        if (fVar != null) {
            b8 = fVar.b();
            this.f6659v.dismiss();
            this.f6659v = null;
        } else {
            b8 = this.f6658u.b();
            this.f6658u.dismiss();
            this.f6658u = null;
        }
        bc.a(this.f6639D, b8, (AppLovinAdView) this.b);
    }

    public /* synthetic */ void u() {
        g().loadUrl("chrome://crash");
    }

    public void a(InterfaceC0698g0 interfaceC0698g0) {
        this.f6641F = interfaceC0698g0;
    }

    public AppLovinAdViewEventListener e() {
        return this.f6639D;
    }

    public com.applovin.impl.adview.b g() {
        return this.f6652o;
    }

    public com.applovin.impl.sdk.ad.b i() {
        return this.f6656s;
    }

    public C2744m j() {
        return this.l;
    }

    public AppLovinAdView k() {
        return (AppLovinAdView) this.b;
    }

    public com.applovin.impl.sdk.k l() {
        return this.f6643c;
    }

    public AppLovinAdSize m() {
        return this.f6649j;
    }

    public String n() {
        return this.f6650k;
    }

    private void d() {
        a(new o(this, 0));
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6637B = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f6638C = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f6639D = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6640E = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f6643c = kVar;
            this.f6644d = kVar.i();
            this.f6645f = kVar.L();
            this.f6646g = AppLovinCommunicator.getInstance(context);
            this.f6649j = appLovinAdSize;
            this.f6650k = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f6642a = context;
            this.b = appLovinAdView;
            this.m = new com.applovin.impl.adview.c(this, kVar);
            this.f6655r = new c();
            this.f6654q = new d();
            this.f6651n = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new o(this, 3));
    }

    public /* synthetic */ void b(WebView webView) {
        this.f6656s.getAdEventTracker().c(webView);
        k kVar = this.f6653p;
        if (kVar != null && kVar.a()) {
            ig adEventTracker = this.f6656s.getAdEventTracker();
            k kVar2 = this.f6653p;
            adEventTracker.b(webView, Collections.singletonList(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f6656s.getAdEventTracker().a((View) webView);
        }
        this.f6656s.getAdEventTracker().h();
        this.f6656s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            if (((Boolean) this.f6643c.a(oj.f9593G1)).booleanValue()) {
                this.f6652o = (com.applovin.impl.adview.b) f().a(new qb.a() { // from class: com.applovin.impl.adview.q
                    @Override // com.applovin.impl.qb.a, com.applovin.impl.wh.a
                    public final Object a() {
                        b o3;
                        o3 = a.this.o();
                        return o3;
                    }
                });
            } else {
                this.f6652o = new com.applovin.impl.adview.b(this.f6643c, this.f6642a);
            }
            this.f6652o.a(this.m);
            this.f6652o.setBackgroundColor(0);
            this.f6652o.setWillNotCacheDrawing(false);
            this.b.setBackgroundColor(0);
            this.b.addView(this.f6652o);
            b(this.f6652o, appLovinAdSize);
            if (!this.f6662y) {
                a(this.f6655r);
            }
            a(new o(this, 5));
            this.f6662y = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f6643c.B().a("AppLovinAdView", "initAdWebView", th);
            this.f6661x.set(true);
        }
    }

    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.f6658u == null && (this.f6656s instanceof com.applovin.impl.sdk.ad.a) && this.f6652o != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f6656s;
            Context context = this.f6642a;
            Activity a6 = context instanceof Activity ? (Activity) context : ar.a(this.f6652o, this.f6643c);
            if (a6 != null && !a6.isFinishing()) {
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f6652o);
                }
                f fVar = new f(aVar, this.f6652o, a6, this.f6643c);
                this.f6658u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.p
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        a.this.a(dialogInterface);
                    }
                });
                this.f6658u.show();
                bc.c(this.f6639D, this.f6656s, (AppLovinAdView) this.b);
                if (this.f6656s.isOpenMeasurementEnabled()) {
                    this.f6656s.getAdEventTracker().a((View) this.f6658u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.t.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri j7 = aVar.j();
            if (j7 != null) {
                this.f6644d.trackAndLaunchClick(aVar, k(), this, j7, motionEvent, this.f6636A, null);
            }
            this.f6652o.a("javascript:al_onFailedExpand();");
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
        if (appLovinAdSize == null && (appLovinAdSize = AbstractC0688e0.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (AbstractC0688e0.b(attributeSet)) {
                v();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f6663z) {
                c(appLovinAd);
            } else {
                this.f6660w.set(appLovinAd);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f6645f.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new A4.d(9, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f6645f.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f6648i.put(str, obj);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            zp.b(appLovinAd, this.f6643c);
            if (this.f6662y) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) zp.a(appLovinAd, this.f6643c);
                if (bVar == null) {
                    com.applovin.impl.sdk.t.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    bc.a(this.f6638C, "Unable to retrieve the loaded ad");
                    return;
                }
                if (bVar == this.f6656s) {
                    com.applovin.impl.sdk.t.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f6643c.a(oj.f9710Y1)).booleanValue()) {
                        if (this.f6638C instanceof lb) {
                            bc.a(this.f6638C, "Attempting to show ad again");
                            return;
                        }
                        throw new IllegalStateException("Attempting to show ad again");
                    }
                    return;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f6645f.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                bc.b(this.f6638C, this.f6656s);
                if (this.f6656s != null && this.f6656s.isOpenMeasurementEnabled()) {
                    this.f6656s.getAdEventTracker().f();
                }
                this.f6660w.set(null);
                this.f6657t = null;
                this.f6656s = bVar;
                if (this.f6656s.A0()) {
                    this.l = this.f6643c.w().a(this);
                    this.f6643c.w().b(this.f6656s.A(), this.l);
                }
                if (!this.f6663z && zp.a(this.f6649j)) {
                    this.f6643c.i().trackImpression(bVar);
                }
                if (this.f6658u != null) {
                    c();
                }
                a(this.f6654q);
                return;
            }
            com.applovin.impl.sdk.t.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    public void b(int i9) {
        if (!this.f6663z) {
            a(this.f6655r);
        }
        a(new K.m(i9, 2, this));
    }

    public void a(WebView webView, String str) {
        if (this.f6656s == null) {
            return;
        }
        a(new u(webView, 2));
        if (!((Boolean) this.f6643c.a(oj.m6)).booleanValue() || (str != null && str.startsWith(this.f6656s.h()))) {
            try {
                if (this.f6656s != this.f6657t) {
                    this.f6657t = this.f6656s;
                    this.f6652o.setAdHtmlLoaded(true);
                    if (this.f6638C != null) {
                        this.f6643c.v().d(this.f6656s);
                        bc.a(this.f6638C, this.f6656s);
                        this.f6652o.a("javascript:al_onAdViewRendered();");
                    }
                    if ((this.f6656s instanceof com.applovin.impl.sdk.ad.a) && this.f6656s.isOpenMeasurementEnabled()) {
                        this.f6643c.l0().a(new kn(this.f6643c, "StartOMSDK", new A4.d(11, this, webView)), sm.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                com.applovin.impl.sdk.t.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.k kVar = this.f6643c;
                if (kVar != null) {
                    kVar.B().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        a(new A4.d(10, this, motionEvent));
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new o(this, 1));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (appLovinAdView != null) {
            this.f6644d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent, this.f6636A, bundle);
        } else if (com.applovin.impl.sdk.t.a()) {
            this.f6645f.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        bc.a(this.f6640E, bVar);
    }

    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f6661x.compareAndSet(true, false)) {
            a(this.f6649j);
        }
        try {
            if (this.f6637B != null) {
                this.f6637B.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.k kVar = this.f6643c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoaded", th);
            }
        }
    }

    public /* synthetic */ void a(int i9) {
        try {
            if (this.f6637B != null) {
                this.f6637B.failedToReceiveAd(i9);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.k kVar = this.f6643c;
            if (kVar != null) {
                kVar.B().a("AppLovinAdView", "notifyAdLoadFailed", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f6647h = bVar;
    }
}
