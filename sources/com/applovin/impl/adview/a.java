package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.k;
import com.applovin.impl.ca;
import com.applovin.impl.e0;
import com.applovin.impl.ea;
import com.applovin.impl.g0;
import com.applovin.impl.gc;
import com.applovin.impl.jn;
import com.applovin.impl.la;
import com.applovin.impl.mg;
import com.applovin.impl.og;
import com.applovin.impl.pi;
import com.applovin.impl.qb;
import com.applovin.impl.qc;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.t6;
import com.applovin.impl.tm;
import com.applovin.impl.tr;
import com.applovin.impl.vb;
import com.applovin.impl.yp;
import com.applovin.impl.zq;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber {
    private static final AtomicReference H = new AtomicReference();
    private volatile AppLovinAdLoadListener C;
    private volatile AppLovinAdDisplayListener D;
    private volatile AppLovinAdViewEventListener E;
    private volatile AppLovinAdClickListener F;

    /* renamed from: a */
    private Context f22743a;

    /* renamed from: b */
    private ViewGroup f22744b;

    /* renamed from: c */
    private com.applovin.impl.sdk.j f22745c;
    private AppLovinAdServiceImpl d;

    /* renamed from: f */
    private com.applovin.impl.sdk.n f22746f;

    /* renamed from: g */
    private AppLovinCommunicator f22747g;

    /* renamed from: h */
    private b f22748h;

    /* renamed from: j */
    private AppLovinAdSize f22750j;

    /* renamed from: k */
    private String f22751k;

    /* renamed from: l */
    private CustomTabsSession f22752l;

    /* renamed from: m */
    private com.applovin.impl.adview.c f22753m;

    /* renamed from: n */
    private e f22754n;

    /* renamed from: o */
    private com.applovin.impl.adview.b f22755o;

    /* renamed from: p */
    private WebView f22756p;

    /* renamed from: q */
    private k f22757q;

    /* renamed from: r */
    private Runnable f22758r;

    /* renamed from: s */
    private Runnable f22759s;

    /* renamed from: i */
    private final Map f22749i = Collections.synchronizedMap(new HashMap());

    /* renamed from: t */
    private volatile com.applovin.impl.sdk.ad.b f22760t = null;

    /* renamed from: u */
    private volatile AppLovinAd f22761u = null;

    /* renamed from: v */
    private f f22762v = null;
    private f w = null;
    private final AtomicReference x = new AtomicReference();

    /* renamed from: y */
    private final AtomicBoolean f22763y = new AtomicBoolean();

    /* renamed from: z */
    private volatile boolean f22764z = false;
    private volatile boolean A = false;
    private volatile boolean B = false;
    private volatile g0 G = null;

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
            if (a.this.f22755o != null) {
                a.this.f22755o.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0073a c0073a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a */
        /* loaded from: classes.dex */
        public class C0074a implements k.a {
            public C0074a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f22755o.addView(a.this.f22757q, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                com.applovin.impl.sdk.n unused = a.this.f22746f;
                if (com.applovin.impl.sdk.n.a()) {
                    a.this.f22746f.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f22760t != null) {
                if (a.this.f22755o == null) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f22760t.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    gc.a(a.this.E, a.this.f22760t, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                a.this.w();
                com.applovin.impl.sdk.n unused = a.this.f22746f;
                if (com.applovin.impl.sdk.n.a()) {
                    a.this.f22746f.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f22760t.getAdIdNumber() + "...");
                }
                a.b(a.this.f22755o, a.this.f22760t.getSize());
                if (a.this.f22757q != null) {
                    zq.c(a.this.f22757q);
                    a.this.f22757q = null;
                }
                ea eaVar = new ea(a.this.f22749i, a.this.f22745c);
                if (eaVar.c()) {
                    a.this.f22757q = new k(eaVar, a.this.f22743a);
                    a.this.f22757q.a(new C0074a());
                }
                a.this.f22755o.setAdHtmlLoaded(false);
                a.this.f22755o.a(a.this.f22760t);
                if (a.this.f22760t.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.A) {
                    return;
                }
                a.this.f22760t.setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, C0073a c0073a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final a f22768a;

        public e(a aVar, com.applovin.impl.sdk.j jVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (jVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f22768a = aVar;
        }

        private a a() {
            return this.f22768a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a a2 = a();
            if (a2 != null) {
                a2.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.n.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            a a2 = a();
            if (a2 != null) {
                a2.b(i2);
            }
        }
    }

    private void G() {
        com.applovin.impl.adview.b bVar;
        if (this.f22746f != null && com.applovin.impl.sdk.n.a() && com.applovin.impl.sdk.n.a()) {
            this.f22746f.a("AppLovinAdView", "Destroying...");
        }
        if (!((Boolean) this.f22745c.a(sj.I1)).booleanValue() || (bVar = this.f22755o) == null) {
            tr.d(this.f22755o);
        } else {
            tr.a(bVar);
            f().a(this.f22755o, new androidx.compose.animation.core.a(7));
        }
        this.f22755o = null;
        tr.d(this.f22756p);
        this.f22756p = null;
        this.f22752l = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.E = null;
        this.A = true;
    }

    public void w() {
        com.applovin.impl.sdk.ad.b bVar = this.f22760t;
        qc qcVar = new qc();
        qcVar.a().a(bVar).a(k());
        if (!yp.a(bVar.getSize())) {
            qcVar.a().a("Fullscreen Ad Properties").b(bVar);
        }
        qcVar.a(this.f22745c);
        qcVar.a();
        if (com.applovin.impl.sdk.n.a()) {
            this.f22746f.a("AppLovinAdView", qcVar.toString());
        }
    }

    private void y() {
        if (this.f22760t.V0()) {
            int a2 = this.f22745c.n().a();
            if (com.applovin.impl.sdk.f.a(a2)) {
                this.f22755o.a("javascript:al_muteSwitchOn();");
            } else if (a2 == 2) {
                this.f22755o.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f22746f.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f22748h;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        if (e0.a(this.f22755o)) {
            this.f22745c.D().c(ca.f23254r);
        }
    }

    public void C() {
        if (this.f22764z) {
            gc.b(this.D, this.f22760t);
            if (this.f22760t != null && this.f22760t.isOpenMeasurementEnabled() && yp.a(this.f22760t.getSize())) {
                this.f22760t.getAdEventTracker().f();
            }
            if (this.f22755o == null || this.f22762v == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f22746f.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                }
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f22746f.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            }
        }
    }

    public void D() {
        this.B = true;
    }

    public void E() {
        this.B = false;
    }

    public void F() {
        if (!this.f22764z || this.A) {
            return;
        }
        this.A = true;
    }

    public void H() {
        if (this.f22764z) {
            AppLovinAd appLovinAd = (AppLovinAd) this.x.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.A = false;
        }
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.E = appLovinAdViewEventListener;
    }

    public com.applovin.impl.adview.b g() {
        return this.f22755o;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    public g0 h() {
        return this.G;
    }

    public com.applovin.impl.sdk.ad.b i() {
        return this.f22760t;
    }

    public CustomTabsSession j() {
        return this.f22752l;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new o(this, 3));
        }
    }

    public void v() {
        if (this.f22745c == null || this.f22754n == null || this.f22743a == null || !this.f22764z) {
            com.applovin.impl.sdk.n.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.d.loadNextAd(this.f22751k, this.f22750j, this.f22754n);
        }
    }

    public void x() {
        if ((this.f22743a instanceof t6) && this.f22760t != null && this.f22760t.R() == b.EnumC0097b.DISMISS) {
            ((t6) this.f22743a).dismiss();
        }
    }

    public void z() {
        if (this.f22762v != null || this.w != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f22746f.a("AppLovinAdView", "Ad: " + this.f22760t + " closed.");
        }
        a(this.f22759s);
        gc.b(this.D, this.f22760t);
        this.f22760t = null;
    }

    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int applyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int i2 = -1;
        if (label.equals(appLovinAdSize2.getLabel())) {
            applyDimension = -1;
        } else if (appLovinAdSize.getWidth() == -1) {
            applyDimension = displayMetrics.widthPixels;
        } else {
            applyDimension = (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
            if (appLovinAdSize.getHeight() == -1) {
                i2 = displayMetrics.heightPixels;
            } else {
                i2 = (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = i2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new o(this, 0));
    }

    public /* synthetic */ com.applovin.impl.adview.b o() {
        return new com.applovin.impl.adview.b(this.f22745c, this.f22743a.getApplicationContext());
    }

    public /* synthetic */ void p() {
        AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f22755o, RemoteSettings.FORWARD_SLASH_STRING, "<html></html>", "text/html", null, "");
    }

    public /* synthetic */ void q() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f22744b == null || (bVar = this.f22755o) == null || bVar.getParent() != null) {
            return;
        }
        this.f22744b.addView(this.f22755o);
        b(this.f22755o, this.f22760t.getSize());
        if (this.f22760t.isOpenMeasurementEnabled()) {
            this.f22760t.getAdEventTracker().a((View) this.f22755o);
        }
    }

    public /* synthetic */ void r() {
        if (this.f22755o != null && this.f22762v != null) {
            a();
        }
        G();
    }

    public /* synthetic */ void s() {
        if (this.f22762v != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22746f.a("AppLovinAdView", "Detaching expanded ad: " + this.f22762v.b());
            }
            this.w = this.f22762v;
            this.f22762v = null;
            a(this.f22750j);
        }
    }

    public /* synthetic */ void t() {
        com.applovin.impl.sdk.ad.a b2;
        f fVar = this.w;
        if (fVar == null && this.f22762v == null) {
            return;
        }
        if (fVar != null) {
            b2 = fVar.b();
            this.w.dismiss();
            this.w = null;
        } else {
            b2 = this.f22762v.b();
            this.f22762v.dismiss();
            this.f22762v = null;
        }
        gc.a(this.E, b2, (AppLovinAdView) this.f22744b);
    }

    public /* synthetic */ void u() {
        AppLovinNetworkBridge.webviewLoadUrl(g(), "chrome://crash");
    }

    public void a(b bVar) {
        this.f22748h = bVar;
    }

    public AppLovinAdViewEventListener e() {
        return this.E;
    }

    public AppLovinAdView k() {
        return (AppLovinAdView) this.f22744b;
    }

    public com.applovin.impl.sdk.j l() {
        return this.f22745c;
    }

    public AppLovinAdSize m() {
        return this.f22750j;
    }

    public String n() {
        return this.f22751k;
    }

    private void d() {
        a(new o(this, 4));
    }

    public static vb f() {
        AtomicReference atomicReference = H;
        Object obj = atomicReference.get();
        if (obj == null) {
            synchronized (atomicReference) {
                try {
                    obj = atomicReference.get();
                    if (obj == null) {
                        obj = new vb.d();
                        atomicReference.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == atomicReference) {
            obj = null;
        }
        return (vb) obj;
    }

    public void a(g0 g0Var) {
        this.G = g0Var;
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.F = appLovinAdClickListener;
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.D = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.C = appLovinAdLoadListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.j jVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f22745c = jVar;
            this.d = jVar.i();
            this.f22746f = jVar.J();
            this.f22747g = AppLovinCommunicator.getInstance(context);
            this.f22750j = appLovinAdSize;
            this.f22751k = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f22743a = context;
            this.f22744b = appLovinAdView;
            this.f22753m = new com.applovin.impl.adview.c(this, jVar);
            this.f22759s = new c();
            this.f22758r = new d();
            this.f22754n = new e(this, jVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void b() {
        a(new o(this, 2));
    }

    public /* synthetic */ void b(WebView webView) {
        this.f22760t.getAdEventTracker().c(webView);
        k kVar = this.f22757q;
        if (kVar != null && kVar.a()) {
            mg adEventTracker = this.f22760t.getAdEventTracker();
            k kVar2 = this.f22757q;
            adEventTracker.b(webView, Collections.singletonList(new og(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f22760t.getAdEventTracker().a((View) webView);
        }
        this.f22760t.getAdEventTracker().h();
        this.f22760t.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            if (((Boolean) this.f22745c.a(sj.I1)).booleanValue()) {
                this.f22755o = (com.applovin.impl.adview.b) f().a(new vb.a() { // from class: com.applovin.impl.adview.q
                    @Override // com.applovin.impl.vb.a
                    public final Object a() {
                        b o2;
                        o2 = a.this.o();
                        return o2;
                    }
                });
            } else {
                this.f22755o = new com.applovin.impl.adview.b(this.f22745c, this.f22743a);
            }
            this.f22755o.a(this.f22753m);
            this.f22755o.setBackgroundColor(0);
            this.f22755o.setWillNotCacheDrawing(false);
            this.f22744b.setBackgroundColor(0);
            this.f22744b.addView(this.f22755o);
            b(this.f22755o, appLovinAdSize);
            if (!this.f22764z) {
                a(this.f22759s);
            }
            a(new o(this, 5));
            this.f22764z = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f22745c.E().a("AppLovinAdView", "initAdWebView", th);
            this.f22763y.set(true);
        }
    }

    public /* synthetic */ void b(MotionEvent motionEvent) {
        if (this.f22762v == null && (this.f22760t instanceof com.applovin.impl.sdk.ad.a) && this.f22755o != null) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f22760t;
            Context context = this.f22743a;
            Activity a2 = context instanceof Activity ? (Activity) context : zq.a(this.f22755o, this.f22745c);
            if (a2 != null && !a2.isFinishing()) {
                ViewGroup viewGroup = this.f22744b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f22755o);
                }
                f fVar = new f(aVar, this.f22755o, a2, this.f22745c);
                this.f22762v = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.p
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        a.this.a(dialogInterface);
                    }
                });
                this.f22762v.show();
                gc.c(this.E, this.f22760t, (AppLovinAdView) this.f22744b);
                if (this.f22760t.isOpenMeasurementEnabled()) {
                    this.f22760t.getAdEventTracker().a((View) this.f22762v.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri i2 = aVar.i();
            if (i2 != null) {
                this.d.trackAndLaunchClick(aVar, k(), this, i2, motionEvent, this.B, null);
            }
            this.f22755o.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
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
            if (!this.A) {
                c(appLovinAd);
            } else {
                this.x.set(appLovinAd);
                if (com.applovin.impl.sdk.n.a()) {
                    this.f22746f.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new androidx.core.content.res.a(8, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f22746f.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f22749i.put(str, obj);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            yp.b(appLovinAd, this.f22745c);
            if (this.f22764z) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) yp.a(appLovinAd, this.f22745c);
                if (bVar == null) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    gc.a(this.D, "Unable to retrieve the loaded ad");
                    return;
                }
                if (bVar == this.f22760t) {
                    com.applovin.impl.sdk.n.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f22745c.a(sj.a2)).booleanValue()) {
                        if (this.D instanceof qb) {
                            gc.a(this.D, "Attempting to show ad again");
                            return;
                        }
                        throw new IllegalStateException("Attempting to show ad again");
                    }
                    return;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f22746f.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                gc.b(this.D, this.f22760t);
                if (this.f22760t != null && this.f22760t.isOpenMeasurementEnabled()) {
                    this.f22760t.getAdEventTracker().f();
                }
                this.x.set(null);
                this.f22761u = null;
                this.f22760t = bVar;
                if (this.f22760t.B0()) {
                    this.f22752l = this.f22745c.x().a(this);
                    this.f22745c.x().b(this.f22760t.z(), this.f22752l);
                }
                if (!this.A && yp.a(this.f22750j)) {
                    this.f22745c.i().trackImpression(bVar);
                }
                if (this.f22762v != null) {
                    c();
                }
                a(this.f22758r);
                return;
            }
            com.applovin.impl.sdk.n.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    public void b(int i2) {
        if (!this.A) {
            a(this.f22759s);
        }
        a(new androidx.core.content.res.b(i2, 1, this));
    }

    public void b(Uri uri) {
        if (this.f22760t != null && this.f22760t.D0() && this.f22756p == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f22745c.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f22745c.J().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f22743a);
            this.f22756p = webView;
            webView.setWebViewClient(new pi());
            this.f22756p.getSettings().setJavaScriptEnabled(true);
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this.f22756p, (String) this.f22745c.a(sj.M6), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void a(WebView webView, String str) {
        if (this.f22760t == null) {
            return;
        }
        a(new v(webView, 2));
        if (!((Boolean) this.f22745c.a(sj.q6)).booleanValue() || (str != null && str.startsWith(this.f22760t.g()))) {
            try {
                if (this.f22760t != this.f22761u) {
                    this.f22761u = this.f22760t;
                    y();
                    this.f22755o.setAdHtmlLoaded(true);
                    if (this.D != null) {
                        this.f22745c.w().d(this.f22760t);
                        this.f22745c.E().a(la.f25013k, this.f22760t);
                        gc.a(this.D, this.f22760t);
                        this.f22755o.a("javascript:al_onAdViewRendered();");
                    }
                    if ((this.f22760t instanceof com.applovin.impl.sdk.ad.a) && this.f22760t.isOpenMeasurementEnabled()) {
                        this.f22745c.j0().a(new jn(this.f22745c, "StartOMSDK", new androidx.core.content.res.a(9, this, webView)), tm.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.j jVar = this.f22745c;
                if (jVar != null) {
                    jVar.E().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        a(new androidx.core.content.res.a(10, this, motionEvent));
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new o(this, 1));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (appLovinAdView != null) {
            this.d.trackAndLaunchClick(bVar, appLovinAdView, this, uri, motionEvent, this.B, bundle);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f22746f.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        gc.a(this.F, bVar);
    }

    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f22763y.compareAndSet(true, false)) {
            a(this.f22750j);
        }
        try {
            if (this.C != null) {
                this.C.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.j jVar = this.f22745c;
            if (jVar != null) {
                jVar.E().a("AppLovinAdView", "notifyAdLoaded", th);
            }
        }
    }

    public /* synthetic */ void a(int i2) {
        try {
            if (this.C != null) {
                this.C.failedToReceiveAd(i2);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.j jVar = this.f22745c;
            if (jVar != null) {
                jVar.E().a("AppLovinAdView", "notifyAdLoadFailed", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(Uri uri) {
        if (this.f22760t == null || !this.f22760t.D0()) {
            return;
        }
        if (this.f22756p == null) {
            this.f22745c.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f22745c.J().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f22745c.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f22745c.J().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new androidx.room.e(this, 1, queryParameter2, queryParameter));
    }

    public /* synthetic */ void a(String str, String str2) {
        String A;
        if (StringUtils.isValidString(str)) {
            A = androidx.compose.foundation.text.input.a.m("gtag('event', '", str2, "', ", str, ");");
        } else {
            A = androidx.compose.foundation.text.input.a.A("gtag('event', '", str2, "')");
        }
        tr.a(this.f22756p, A);
    }
}
