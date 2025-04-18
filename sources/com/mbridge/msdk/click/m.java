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
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class m {
    public static long a = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final String f12558d = "m";

    /* renamed from: b, reason: collision with root package name */
    boolean f12559b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12560c;

    /* renamed from: e, reason: collision with root package name */
    private int f12561e;

    /* renamed from: f, reason: collision with root package name */
    private int f12562f;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.c.g f12564h;

    /* renamed from: i, reason: collision with root package name */
    private a f12565i;

    /* renamed from: j, reason: collision with root package name */
    private String f12566j;

    /* renamed from: k, reason: collision with root package name */
    private String f12567k;

    /* renamed from: l, reason: collision with root package name */
    private WebView f12568l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12569m;

    /* renamed from: n, reason: collision with root package name */
    private String f12570n;

    /* renamed from: o, reason: collision with root package name */
    private int f12571o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12573q;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12572p = false;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f12574r = new Runnable() { // from class: com.mbridge.msdk.click.m.4
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f12572p = true;
            m.this.f12571o = 1;
            m.m(m.this);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f12575s = new Runnable() { // from class: com.mbridge.msdk.click.m.5
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f12572p = true;
            m.this.f12571o = 2;
            m.m(m.this);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Handler f12563g = new Handler(Looper.getMainLooper());

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public m() {
        this.f12561e = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
        this.f12562f = 3000;
        com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        this.f12564h = d10;
        if (d10 == null) {
            com.mbridge.msdk.c.h.a();
            this.f12564h = com.mbridge.msdk.c.i.a();
        }
        this.f12569m = this.f12564h.aG();
        this.f12561e = (int) this.f12564h.ao();
        this.f12562f = (int) this.f12564h.ao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f12563g.removeCallbacks(this.f12575s);
    }

    public static /* synthetic */ void e(m mVar) {
        mVar.c();
        mVar.f12563g.postDelayed(mVar.f12575s, mVar.f12561e);
    }

    public static /* synthetic */ void l(m mVar) {
        mVar.d();
        mVar.f12563g.postDelayed(mVar.f12574r, mVar.f12562f);
    }

    public static /* synthetic */ void m(m mVar) {
        synchronized (f12558d) {
            try {
                try {
                    mVar.b();
                    mVar.f12568l.destroy();
                    a aVar = mVar.f12565i;
                    if (aVar != null) {
                        aVar.a(mVar.f12566j, mVar.f12572p, mVar.f12570n);
                    }
                } catch (Exception e2) {
                    ad.b(f12558d, e2.getMessage());
                }
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(m mVar) {
        synchronized (f12558d) {
            try {
                mVar.b();
                a aVar = mVar.f12565i;
                if (aVar != null) {
                    aVar.a(mVar.f12566j, mVar.f12572p, mVar.f12570n);
                }
            } catch (Exception e2) {
                ad.b(f12558d, e2.getMessage());
            } catch (Throwable th2) {
                ad.b(f12558d, th2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f12563g.removeCallbacks(this.f12574r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        d();
        c();
    }

    public final void a(String str, String str2, Context context, String str3, String str4, a aVar) {
        if (aVar != null) {
            this.f12567k = str4;
            this.f12566j = str3;
            this.f12565i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public final void a(String str, String str2, Context context, String str3, a aVar) {
        if (aVar != null) {
            this.f12566j = str3;
            this.f12565i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f12566j);
        } else {
            this.f12563g.post(new Runnable() { // from class: com.mbridge.msdk.click.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = m.this;
                    mVar.a(str, str2, context, mVar.f12566j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f12567k)) {
                this.f12568l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f12562f = 2000;
                this.f12561e = 2000;
                ad.c(f12558d, this.f12567k);
                this.f12568l.loadDataWithBaseURL(str3, this.f12567k, "*/*", "utf-8", str3);
                return;
            }
            if (this.f12569m) {
                HashMap hashMap = new HashMap();
                if (this.f12568l.getUrl() != null) {
                    hashMap.put("Referer", this.f12568l.getUrl());
                }
                this.f12568l.loadUrl(str3, hashMap);
                return;
            }
            this.f12568l.loadUrl(str3);
        } catch (Throwable th2) {
            try {
                a aVar = this.f12565i;
                if (aVar != null) {
                    aVar.a(0, this.f12566j, th2.getMessage(), this.f12570n);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void a(final Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f12568l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f12568l.getSettings().setCacheMode(2);
        this.f12568l.getSettings().setLoadsImagesAutomatically(false);
        this.f12568l.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.click.m.2
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (m.this.f12573q) {
                        m.this.f12571o = 0;
                        m.c(m.this);
                        return;
                    }
                    m.this.f12560c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        m.this.f12559b = true;
                    }
                    synchronized (m.f12558d) {
                        m.this.f12566j = str3;
                        if (m.this.f12565i != null && m.this.f12565i.a(str3)) {
                            m.this.f12573q = true;
                            m.c(m.this);
                        } else {
                            m.e(m.this);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i10, String str3, String str4) {
                synchronized (m.f12558d) {
                    m.this.f12573q = true;
                    m.this.b();
                    m.c(m.this);
                }
                if (m.this.f12565i != null) {
                    m.this.f12565i.a(i10, webView2.getUrl(), str3, m.this.f12570n);
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
                        } catch (Exception e2) {
                            ad.b(com.mbridge.msdk.foundation.same.report.h.a, e2.getMessage());
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    synchronized (m.f12558d) {
                        m.this.f12573q = true;
                        m.this.b();
                        m.c(m.this);
                    }
                    if (m.this.f12565i != null) {
                        m.this.f12565i.a(-1, webView2.getUrl(), "WebView render process crash.", m.this.f12570n);
                    }
                    if (webView2 != null) {
                        webView2.destroy();
                    }
                    return true;
                } catch (Throwable th2) {
                    ad.b(m.f12558d, th2.getMessage());
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (m.f12558d) {
                    m mVar = m.this;
                    mVar.f12560c = true;
                    mVar.d();
                    if (!m.this.f12573q) {
                        m.this.f12566j = str3;
                        if (m.this.f12565i != null && m.this.f12565i.b(str3)) {
                            m.this.f12573q = true;
                            m.this.c();
                            m.c(m.this);
                            return true;
                        }
                        if (m.this.f12569m) {
                            HashMap hashMap = new HashMap();
                            if (m.this.f12568l.getUrl() != null) {
                                hashMap.put("Referer", m.this.f12568l.getUrl());
                            }
                            m.this.f12568l.loadUrl(str3, hashMap);
                        } else {
                            m.this.f12568l.loadUrl(str3);
                        }
                        return true;
                    }
                    m.this.c();
                    m.c(m.this);
                    return true;
                }
            }
        });
        this.f12568l.setWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.click.m.3
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
            public final void onProgressChanged(WebView webView2, int i10) {
                if (i10 == 100) {
                    try {
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!m.this.f12573q) {
                            m mVar = m.this;
                            if (!mVar.f12560c) {
                                m.l(mVar);
                            }
                        }
                        if (m.this.f12565i != null) {
                            m.this.f12565i.c(webView2.getUrl());
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }
}
