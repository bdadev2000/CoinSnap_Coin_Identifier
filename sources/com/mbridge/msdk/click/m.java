package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static long f14849a = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final String f14850d = "m";
    boolean b;

    /* renamed from: c, reason: collision with root package name */
    boolean f14851c;

    /* renamed from: e, reason: collision with root package name */
    private int f14852e;

    /* renamed from: f, reason: collision with root package name */
    private int f14853f;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.c.g f14855h;

    /* renamed from: i, reason: collision with root package name */
    private a f14856i;

    /* renamed from: j, reason: collision with root package name */
    private String f14857j;

    /* renamed from: k, reason: collision with root package name */
    private String f14858k;
    private WebView l;
    private boolean m;

    /* renamed from: n, reason: collision with root package name */
    private String f14859n;

    /* renamed from: o, reason: collision with root package name */
    private int f14860o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14862q;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14861p = false;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f14863r = new Runnable() { // from class: com.mbridge.msdk.click.m.4
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f14861p = true;
            m.this.f14860o = 1;
            m.m(m.this);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f14864s = new Runnable() { // from class: com.mbridge.msdk.click.m.5
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f14861p = true;
            m.this.f14860o = 2;
            m.m(m.this);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Handler f14854g = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public interface a {
        void a(int i9, String str, String str2, String str3);

        void a(String str, boolean z8, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public m() {
        this.f14852e = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
        this.f14853f = 3000;
        com.mbridge.msdk.c.g f9 = L.f(com.mbridge.msdk.c.h.a());
        this.f14855h = f9;
        if (f9 == null) {
            com.mbridge.msdk.c.h.a();
            this.f14855h = com.mbridge.msdk.c.i.a();
        }
        this.m = this.f14855h.aG();
        this.f14852e = (int) this.f14855h.ao();
        this.f14853f = (int) this.f14855h.ao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f14854g.removeCallbacks(this.f14864s);
    }

    public static /* synthetic */ void e(m mVar) {
        mVar.c();
        mVar.f14854g.postDelayed(mVar.f14864s, mVar.f14852e);
    }

    public static /* synthetic */ void l(m mVar) {
        mVar.d();
        mVar.f14854g.postDelayed(mVar.f14863r, mVar.f14853f);
    }

    public static /* synthetic */ void m(m mVar) {
        synchronized (f14850d) {
            try {
                try {
                    mVar.b();
                    mVar.l.destroy();
                    a aVar = mVar.f14856i;
                    if (aVar != null) {
                        aVar.a(mVar.f14857j, mVar.f14861p, mVar.f14859n);
                    }
                } catch (Exception e4) {
                    ad.b(f14850d, e4.getMessage());
                } catch (Throwable th) {
                    ad.b(f14850d, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(m mVar) {
        synchronized (f14850d) {
            try {
                try {
                    try {
                        mVar.b();
                        a aVar = mVar.f14856i;
                        if (aVar != null) {
                            aVar.a(mVar.f14857j, mVar.f14861p, mVar.f14859n);
                        }
                    } catch (Exception e4) {
                        ad.b(f14850d, e4.getMessage());
                    }
                } catch (Throwable th) {
                    ad.b(f14850d, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f14854g.removeCallbacks(this.f14863r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        d();
        c();
    }

    public final void a(String str, String str2, Context context, String str3, String str4, a aVar) {
        if (aVar != null) {
            this.f14858k = str4;
            this.f14857j = str3;
            this.f14856i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public final void a(String str, String str2, Context context, String str3, a aVar) {
        if (aVar != null) {
            this.f14857j = str3;
            this.f14856i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f14857j);
        } else {
            this.f14854g.post(new Runnable() { // from class: com.mbridge.msdk.click.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = m.this;
                    mVar.a(str, str2, context, mVar.f14857j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f14858k)) {
                this.l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f14853f = 2000;
                this.f14852e = 2000;
                ad.c(f14850d, this.f14858k);
                this.l.loadDataWithBaseURL(str3, this.f14858k, "*/*", "utf-8", str3);
                return;
            }
            if (this.m) {
                HashMap hashMap = new HashMap();
                if (this.l.getUrl() != null) {
                    hashMap.put("Referer", this.l.getUrl());
                }
                this.l.loadUrl(str3, hashMap);
                return;
            }
            this.l.loadUrl(str3);
        } catch (Throwable th) {
            try {
                a aVar = this.f14856i;
                if (aVar != null) {
                    aVar.a(0, this.f14857j, th.getMessage(), this.f14859n);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private void a(final Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.l.getSettings().setCacheMode(2);
        this.l.getSettings().setLoadsImagesAutomatically(false);
        this.l.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.click.m.2
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (m.this.f14862q) {
                        m.this.f14860o = 0;
                        m.c(m.this);
                        return;
                    }
                    m.this.f14851c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        m.this.b = true;
                    }
                    synchronized (m.f14850d) {
                        try {
                            m.this.f14857j = str3;
                            if (m.this.f14856i != null && m.this.f14856i.a(str3)) {
                                m.this.f14862q = true;
                                m.c(m.this);
                            } else {
                                m.e(m.this);
                            }
                        } finally {
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i9, String str3, String str4) {
                synchronized (m.f14850d) {
                    m.this.f14862q = true;
                    m.this.b();
                    m.c(m.this);
                }
                if (m.this.f14856i != null) {
                    m.this.f14856i.a(i9, webView2.getUrl(), str3, m.this.f14859n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        new com.mbridge.msdk.foundation.same.report.h(context);
                        try {
                            com.mbridge.msdk.foundation.same.report.d.c.a().d("click_type=" + URLEncoder.encode("1", "utf-8") + "&cid=" + URLEncoder.encode(str, "utf-8") + "&unit_id=" + URLEncoder.encode(str2, "utf-8") + "&key=" + URLEncoder.encode("2000027", "utf-8") + "&http_url=" + URLEncoder.encode(webView2.getUrl(), "utf-8"));
                        } catch (Exception e4) {
                            ad.b(com.mbridge.msdk.foundation.same.report.h.f15943a, e4.getMessage());
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    synchronized (m.f14850d) {
                        m.this.f14862q = true;
                        m.this.b();
                        m.c(m.this);
                    }
                    if (m.this.f14856i != null) {
                        m.this.f14856i.a(-1, webView2.getUrl(), "WebView render process crash.", m.this.f14859n);
                    }
                    if (webView2 != null) {
                        webView2.destroy();
                    }
                    return true;
                } catch (Throwable th) {
                    ad.b(m.f14850d, th.getMessage());
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (m.f14850d) {
                    try {
                        m mVar = m.this;
                        mVar.f14851c = true;
                        mVar.d();
                        if (m.this.f14862q) {
                            m.this.c();
                            m.c(m.this);
                            return true;
                        }
                        m.this.f14857j = str3;
                        if (m.this.f14856i != null && m.this.f14856i.b(str3)) {
                            m.this.f14862q = true;
                            m.this.c();
                            m.c(m.this);
                            return true;
                        }
                        if (m.this.m) {
                            HashMap hashMap = new HashMap();
                            if (m.this.l.getUrl() != null) {
                                hashMap.put("Referer", m.this.l.getUrl());
                            }
                            m.this.l.loadUrl(str3, hashMap);
                        } else {
                            m.this.l.loadUrl(str3);
                        }
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        this.l.setWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.click.m.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i9) {
                if (i9 == 100) {
                    try {
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!m.this.f14862q) {
                            m mVar = m.this;
                            if (!mVar.f14851c) {
                                m.l(mVar);
                            }
                        }
                        if (m.this.f14856i != null) {
                            m.this.f14856i.c(webView2.getUrl());
                        }
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            }
        });
    }
}
