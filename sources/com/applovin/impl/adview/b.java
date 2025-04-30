package com.applovin.impl.adview;

import Q7.n0;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.C0693f0;
import com.applovin.impl.bq;
import com.applovin.impl.eq;
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

/* loaded from: classes.dex */
public class b extends h3 {

    /* renamed from: c */
    private final com.applovin.impl.sdk.t f6685c;

    /* renamed from: d */
    private final com.applovin.impl.sdk.k f6686d;

    /* renamed from: f */
    private com.applovin.impl.sdk.ad.b f6687f;

    /* renamed from: g */
    private boolean f6688g;

    /* renamed from: h */
    private boolean f6689h;

    /* renamed from: i */
    private final List f6690i;

    /* renamed from: j */
    private final Object f6691j;

    public b(com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f6690i = new ArrayList();
        this.f6691j = new Object();
        if (kVar != null) {
            this.f6686d = kVar;
            this.f6685c = kVar.L();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (x3.k() && ((Boolean) kVar.a(oj.f9667R5)).booleanValue()) {
                setWebViewRenderProcessClient(new d(kVar).a());
            }
            setOnTouchListener(new r(0));
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.s
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean a6;
                    a6 = b.this.a(view);
                    return a6;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, bq bqVar) {
        String a6 = a(str3, str);
        if (StringUtils.isValidString(a6)) {
            if (com.applovin.impl.sdk.t.a()) {
                n0.s("Rendering webview for VAST ad with resourceContents : ", a6, this.f6685c, "AdWebView");
            }
            loadDataWithBaseURL(str2, a6, "text/html", null, "");
            return;
        }
        String a9 = a((String) kVar.a(oj.f9647O4), str);
        if (StringUtils.isValidString(a9)) {
            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled()) {
                a9 = kVar.Y().a(a9);
            }
            String str4 = a9;
            if (com.applovin.impl.sdk.t.a()) {
                n0.s("Rendering webview for VAST ad with resourceContents : ", str4, this.f6685c, "AdWebView");
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            n0.s("Rendering webview for VAST ad with resourceURL : ", str, this.f6685c, "AdWebView");
        }
        loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f6688g = true;
        this.f6689h = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f6687f;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public void scrollTo(int i9, int i10) {
    }

    public void setAdHtmlLoaded(boolean z8) {
        this.f6689h = z8;
        if (z8 && ((Boolean) this.f6686d.a(oj.m6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f6691j) {
            try {
                Iterator it = this.f6690i.iterator();
                while (it.hasNext()) {
                    ur.a(this, (String) it.next(), "AdWebView", this.f6686d);
                }
                this.f6690i.clear();
            } catch (Throwable th) {
                throw th;
            }
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
        this.f6685c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(c cVar) {
        if (((Boolean) this.f6686d.a(oj.f9587F1)).booleanValue()) {
            loadUrl("about:blank");
            clearView();
        }
        setWebViewClient(cVar != null ? cVar : new x());
        setWebChromeClient(new C0693f0(cVar != null ? cVar.c() : null, this.f6686d));
        synchronized (this.f6690i) {
            this.f6690i.clear();
        }
        onResume();
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String str;
        if (!this.f6688g) {
            this.f6687f = bVar;
            try {
                applySettings(bVar);
                if (zp.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.h(), ((com.applovin.impl.sdk.ad.a) bVar).e1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f6685c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof bq) {
                    bq bqVar = (bq) bVar;
                    eq e12 = bqVar.e1();
                    if (e12 != null) {
                        jq d2 = e12.d();
                        Uri b = d2.b();
                        if (b != null) {
                            str = b.toString();
                        } else {
                            str = "";
                        }
                        String str2 = str;
                        String a6 = d2.a();
                        String g12 = bqVar.g1();
                        if (!StringUtils.isValidString(str2) && !StringUtils.isValidString(a6)) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f6685c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (d2.c() == jq.a.STATIC) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f6685c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a9 = a((String) this.f6686d.a(oj.f9641N4), str2);
                            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled() && bqVar.x1()) {
                                a9 = this.f6686d.Y().a(a9);
                            }
                            loadDataWithBaseURL(bVar.h(), a9, "text/html", null, "");
                            return;
                        }
                        if (d2.c() == jq.a.HTML) {
                            if (StringUtils.isValidString(a6)) {
                                String a10 = a(g12, a6);
                                String str3 = StringUtils.isValidString(a10) ? a10 : a6;
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f6685c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                }
                                loadDataWithBaseURL(bVar.h(), str3, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f6685c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(str2, bVar.h(), g12, this.f6686d, bqVar);
                                return;
                            }
                            return;
                        }
                        if (d2.c() == jq.a.IFRAME) {
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f6685c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str2, bVar.h(), g12, this.f6686d, bqVar);
                                return;
                            } else {
                                if (StringUtils.isValidString(a6)) {
                                    String a11 = a(g12, a6);
                                    String str4 = StringUtils.isValidString(a11) ? a11 : a6;
                                    if (com.applovin.impl.sdk.t.a()) {
                                        this.f6685c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str4);
                                    }
                                    loadDataWithBaseURL(bVar.h(), str4, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f6685c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f6685c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.t.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.f6686d.a(oj.m6)).booleanValue()) {
            if (this.f6689h) {
                ur.a(this, str, "AdWebView", this.f6686d);
                return;
            }
            synchronized (this.f6690i) {
                this.f6690i.add(str);
            }
            return;
        }
        ur.a(this, str, "AdWebView", this.f6686d);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
