package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.aq;
import com.applovin.impl.dq;
import com.applovin.impl.f0;
import com.applovin.impl.iq;
import com.applovin.impl.j3;
import com.applovin.impl.pi;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tr;
import com.applovin.impl.yp;
import com.applovin.impl.z3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends j3 {

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f22785c;
    private final com.applovin.impl.sdk.j d;

    /* renamed from: f, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f22786f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22787g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22788h;

    /* renamed from: i, reason: collision with root package name */
    private final List f22789i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f22790j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, android.view.View$OnTouchListener] */
    public b(com.applovin.impl.sdk.j jVar, Context context) {
        super(context);
        this.f22789i = new ArrayList();
        this.f22790j = new Object();
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.d = jVar;
        this.f22785c = jVar.J();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (z3.k() && ((Boolean) jVar.a(sj.W5)).booleanValue()) {
            setWebViewRenderProcessClient(new d(jVar).a());
        }
        setOnTouchListener(new Object());
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.s
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean a2;
                a2 = b.this.a(view);
                return a2;
            }
        });
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.j jVar, aq aqVar) {
        String a2 = a(str3, str);
        if (StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.n.a()) {
                t.v("Rendering webview for VAST ad with resourceContents : ", a2, this.f22785c, "AdWebView");
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, a2, "text/html", null, "");
            return;
        }
        String a3 = a((String) jVar.a(sj.S4), str);
        if (StringUtils.isValidString(a3)) {
            if (aqVar.B1() && aqVar.isOpenMeasurementEnabled()) {
                a3 = jVar.W().a(a3);
            }
            String str4 = a3;
            if (com.applovin.impl.sdk.n.a()) {
                t.v("Rendering webview for VAST ad with resourceContents : ", str4, this.f22785c, "AdWebView");
            }
            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, str2, str4, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            t.v("Rendering webview for VAST ad with resourceURL : ", str, this.f22785c, "AdWebView");
        }
        AppLovinNetworkBridge.webviewLoadUrl(this, str);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f22787g = true;
        this.f22788h = false;
        super.destroy();
    }

    @Override // com.applovin.impl.j3, com.applovin.impl.adview.AppLovinWebViewBase, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f22786f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.j3, com.applovin.impl.adview.AppLovinWebViewBase, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    public void setAdHtmlLoaded(boolean z2) {
        this.f22788h = z2;
        if (z2 && ((Boolean) this.d.a(sj.q6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f22790j) {
            try {
                Iterator it = this.f22789i.iterator();
                while (it.hasNext()) {
                    tr.a(this, (String) it.next(), "AdWebView", this.d);
                }
                this.f22789i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.n.a()) {
            return true;
        }
        this.f22785c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(c cVar) {
        if (((Boolean) this.d.a(sj.H1)).booleanValue()) {
            AppLovinNetworkBridge.webviewLoadUrl(this, "about:blank");
            clearView();
        }
        setWebViewClient(cVar != null ? cVar : new pi());
        setWebChromeClient(new f0(cVar != null ? cVar.c() : null, this.d));
        synchronized (this.f22789i) {
            this.f22789i.clear();
        }
        onResume();
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.f22787g) {
            this.f22786f = bVar;
            try {
                applySettings(bVar);
                if (yp.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.g(), ((com.applovin.impl.sdk.ad.a) bVar).j1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f22785c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof aq) {
                    aq aqVar = (aq) bVar;
                    dq j12 = aqVar.j1();
                    if (j12 != null) {
                        iq d = j12.d();
                        Uri b2 = d.b();
                        String uri = b2 != null ? b2.toString() : "";
                        String a2 = d.a();
                        String l12 = aqVar.l1();
                        if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(a2)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f22785c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (d.c() == iq.a.STATIC) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f22785c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a3 = a((String) this.d.a(sj.R4), uri);
                            if (aqVar.B1() && aqVar.isOpenMeasurementEnabled() && aqVar.C1()) {
                                a3 = this.d.W().a(a3);
                            }
                            AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.g(), a3, "text/html", null, "");
                            return;
                        }
                        if (d.c() == iq.a.HTML) {
                            if (StringUtils.isValidString(a2)) {
                                String a4 = a(l12, a2);
                                String str = StringUtils.isValidString(a4) ? a4 : a2;
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f22785c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.g(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f22785c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(uri, bVar.g(), l12, this.d, aqVar);
                                return;
                            }
                            return;
                        }
                        if (d.c() == iq.a.IFRAME) {
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f22785c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(uri, bVar.g(), l12, this.d, aqVar);
                                return;
                            } else {
                                if (StringUtils.isValidString(a2)) {
                                    String a5 = a(l12, a2);
                                    String str2 = StringUtils.isValidString(a5) ? a5 : a2;
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.f22785c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                    }
                                    AppLovinNetworkBridge.webviewLoadDataWithBaseURL(this, bVar.g(), str2, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f22785c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f22785c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.n.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (!((Boolean) this.d.a(sj.q6)).booleanValue()) {
            tr.a(this, str, "AdWebView", this.d);
        } else {
            if (this.f22788h) {
                tr.a(this, str, "AdWebView", this.d);
                return;
            }
            synchronized (this.f22789i) {
                this.f22789i.add(str);
            }
        }
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
