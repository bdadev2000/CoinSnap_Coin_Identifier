package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.bq;
import com.applovin.impl.eq;
import com.applovin.impl.f0;
import com.applovin.impl.h3;
import com.applovin.impl.jq;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.ur;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class b extends h3 {

    /* renamed from: c */
    private final com.applovin.impl.sdk.t f3689c;

    /* renamed from: d */
    private final com.applovin.impl.sdk.k f3690d;

    /* renamed from: f */
    private com.applovin.impl.sdk.ad.b f3691f;

    /* renamed from: g */
    private boolean f3692g;

    /* renamed from: h */
    private boolean f3693h;

    /* renamed from: i */
    private final List f3694i;

    /* renamed from: j */
    private final Object f3695j;

    public b(com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f3694i = new ArrayList();
        this.f3695j = new Object();
        if (kVar != null) {
            this.f3690d = kVar;
            this.f3689c = kVar.L();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (x3.k() && ((Boolean) kVar.a(oj.R5)).booleanValue()) {
                setWebViewRenderProcessClient(new d(kVar).a());
            }
            setOnTouchListener(new r(0));
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.s
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean a;
                    a = b.this.a(view);
                    return a;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, bq bqVar) {
        String a = a(str3, str);
        if (StringUtils.isValidString(a)) {
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Rendering webview for VAST ad with resourceContents : ", a, this.f3689c, "AdWebView");
            }
            loadDataWithBaseURL(str2, a, "text/html", null, "");
            return;
        }
        String a10 = a((String) kVar.a(oj.O4), str);
        if (StringUtils.isValidString(a10)) {
            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled()) {
                a10 = kVar.Y().a(a10);
            }
            String str4 = a10;
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Rendering webview for VAST ad with resourceContents : ", str4, this.f3689c, "AdWebView");
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.v("Rendering webview for VAST ad with resourceURL : ", str, this.f3689c, "AdWebView");
        }
        loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f3692g = true;
        this.f3693h = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f3691f;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f3693h = z10;
        if (z10 && ((Boolean) this.f3690d.a(oj.f6710m6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f3695j) {
            Iterator it = this.f3694i.iterator();
            while (it.hasNext()) {
                ur.a(this, (String) it.next(), "AdWebView", this.f3690d);
            }
            this.f3694i.clear();
        }
    }

    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.t.a()) {
            return true;
        }
        this.f3689c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(c cVar) {
        if (((Boolean) this.f3690d.a(oj.F1)).booleanValue()) {
            loadUrl("about:blank");
            clearView();
        }
        setWebViewClient(cVar != null ? cVar : new x());
        setWebChromeClient(new f0(cVar != null ? cVar.c() : null, this.f3690d));
        synchronized (this.f3694i) {
            this.f3694i.clear();
        }
        onResume();
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.f3692g) {
            this.f3691f = bVar;
            try {
                applySettings(bVar);
                if (zp.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.h(), ((com.applovin.impl.sdk.ad.a) bVar).e1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f3689c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof bq) {
                    bq bqVar = (bq) bVar;
                    eq e12 = bqVar.e1();
                    if (e12 != null) {
                        jq d10 = e12.d();
                        Uri b3 = d10.b();
                        String uri = b3 != null ? b3.toString() : "";
                        String a = d10.a();
                        String g12 = bqVar.g1();
                        if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(a)) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f3689c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (d10.c() == jq.a.STATIC) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f3689c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a10 = a((String) this.f3690d.a(oj.N4), uri);
                            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled() && bqVar.x1()) {
                                a10 = this.f3690d.Y().a(a10);
                            }
                            loadDataWithBaseURL(bVar.h(), a10, "text/html", null, "");
                            return;
                        }
                        if (d10.c() == jq.a.HTML) {
                            if (StringUtils.isValidString(a)) {
                                String a11 = a(g12, a);
                                String str = StringUtils.isValidString(a11) ? a11 : a;
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f3689c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.h(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f3689c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(uri, bVar.h(), g12, this.f3690d, bqVar);
                                return;
                            }
                            return;
                        }
                        if (d10.c() == jq.a.IFRAME) {
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f3689c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(uri, bVar.h(), g12, this.f3690d, bqVar);
                                return;
                            } else {
                                if (StringUtils.isValidString(a)) {
                                    String a12 = a(g12, a);
                                    String str2 = StringUtils.isValidString(a12) ? a12 : a;
                                    if (com.applovin.impl.sdk.t.a()) {
                                        this.f3689c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                    }
                                    loadDataWithBaseURL(bVar.h(), str2, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f3689c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f3689c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : AbstractJsonLexerKt.NULL) + ") - " + th2);
            }
        }
        com.applovin.impl.sdk.t.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.f3690d.a(oj.f6710m6)).booleanValue()) {
            if (this.f3693h) {
                ur.a(this, str, "AdWebView", this.f3690d);
                return;
            }
            synchronized (this.f3694i) {
                this.f3694i.add(str);
            }
            return;
        }
        ur.a(this, str, "AdWebView", this.f3690d);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
