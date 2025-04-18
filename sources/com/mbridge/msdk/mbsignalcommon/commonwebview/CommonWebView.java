package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.click.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;
    protected ToolBar a;

    /* renamed from: b, reason: collision with root package name */
    protected ToolBar f14094b;

    /* renamed from: c, reason: collision with root package name */
    protected ProgressBar f14095c;

    /* renamed from: d, reason: collision with root package name */
    protected BaseWebView f14096d;

    /* renamed from: e, reason: collision with root package name */
    private int f14097e;

    /* renamed from: f, reason: collision with root package name */
    private int f14098f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f14099g;

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f14100h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f14101i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f14102j;

    /* renamed from: k, reason: collision with root package name */
    private View.OnClickListener f14103k;

    /* renamed from: l, reason: collision with root package name */
    private View.OnClickListener f14104l;

    /* renamed from: m, reason: collision with root package name */
    private View.OnClickListener f14105m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f14106n;

    /* renamed from: o, reason: collision with root package name */
    private Handler f14107o;

    /* renamed from: p, reason: collision with root package name */
    private int f14108p;

    /* renamed from: q, reason: collision with root package name */
    private WebViewClient f14109q;

    /* renamed from: r, reason: collision with root package name */
    private String f14110r;

    /* renamed from: s, reason: collision with root package name */
    private b f14111s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f14112t;
    private final Runnable u;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f14108p + "ms");
                if (CommonWebView.this.f14111s != null) {
                    CommonWebView.this.f14112t = false;
                    CommonWebView.this.f14111s.a(CommonWebView.this.f14110r);
                }
            }
        };
        init();
    }

    public static /* synthetic */ void k(CommonWebView commonWebView) {
        commonWebView.f14107o.removeCallbacks(commonWebView.u);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f14102j.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f14101i.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        View view;
        ToolBar toolBar;
        ToolBar toolBar2 = this.a;
        if (toolBar2 != null) {
            view = toolBar2.getItem(str);
        } else {
            view = null;
        }
        if (view == null && (toolBar = this.f14094b) != null) {
            return toolBar.getItem(str);
        }
        return view;
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f14096d;
        if (baseWebView == null) {
            return "";
        }
        return baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f14096d;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f14094b;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.a.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f14099g = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f14099g, layoutParams);
        this.f14097e = ai.a(getContext(), 40.0f);
        this.f14098f = ai.a(getContext(), 40.0f);
        this.f14101i = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f14102j = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f14096d == null) {
                this.f14096d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f14096d.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f14096d;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f14101i);
            this.f14096d.setWebChromeClient(this.f14102j);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            ad.b("CommonWebView", "webview is error", th2);
        }
        this.f14099g.addView(this.f14096d);
    }

    public void loadUrl(String str) {
        this.f14096d.loadUrl(str);
        if (this.f14109q != null) {
            a();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f14103k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f14104l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f14106n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f14105m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f14102j.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f14101i.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.a.getParent()).removeView(this.a);
        this.f14099g.addView(this.a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.a.getParent()).removeView(this.a);
        addView(this.a, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f14100h = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f14108p = i10;
        if (this.f14107o == null) {
            this.f14107o = new Handler(Looper.getMainLooper());
        }
        if (this.f14109q == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.f14112t = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.f14110r = str;
                    if (!CommonWebView.this.f14112t) {
                        CommonWebView.this.f14112t = true;
                        CommonWebView.this.a();
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i11, String str, String str2) {
                    CommonWebView.this.f14112t = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f14110r = str;
                    if (CommonWebView.this.f14112t) {
                        CommonWebView.k(CommonWebView.this);
                    }
                    CommonWebView.this.f14112t = true;
                    CommonWebView.this.a();
                    return false;
                }
            };
            this.f14109q = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    public void setPageLoadTimtoutListener(b bVar) {
        this.f14111s = bVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.a.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f14094b;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.a.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.6
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (ah.a.b(str)) {
                    ah.a.a(CommonWebView.this.getContext(), str, null);
                }
                return CommonWebView.this.a(webView, str);
            }
        });
    }

    public void useDefaultToolBar() {
        if (this.f14094b == null) {
            this.f14094b = new ToolBar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f14098f);
            layoutParams.bottomMargin = 0;
            this.f14094b.setLayoutParams(layoutParams);
            this.f14094b.setBackgroundColor(-1);
            this.f14094b.setOnItemClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseWebView baseWebView = CommonWebView.this.f14096d;
                    if (baseWebView != null) {
                        baseWebView.stopLoading();
                        String str = (String) view.getTag();
                        if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                            CommonWebView.this.f14094b.getItem(ToolBar.FORWARD).setEnabled(true);
                            if (CommonWebView.this.f14096d.canGoBack()) {
                                CommonWebView.this.f14096d.goBack();
                            }
                            CommonWebView.this.f14094b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f14096d.canGoBack());
                            if (CommonWebView.this.f14103k != null) {
                                CommonWebView.this.f14103k.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.FORWARD)) {
                            CommonWebView.this.f14094b.getItem(ToolBar.BACKWARD).setEnabled(true);
                            if (CommonWebView.this.f14096d.canGoForward()) {
                                CommonWebView.this.f14096d.goForward();
                            }
                            CommonWebView.this.f14094b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f14096d.canGoForward());
                            if (CommonWebView.this.f14104l != null) {
                                CommonWebView.this.f14104l.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.REFRESH)) {
                            CommonWebView.this.f14094b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f14096d.canGoBack());
                            CommonWebView.this.f14094b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f14096d.canGoForward());
                            CommonWebView.this.f14096d.reload();
                            if (CommonWebView.this.f14105m != null) {
                                CommonWebView.this.f14105m.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.EXITS)) {
                            if (CommonWebView.this.f14100h != null) {
                                CommonWebView.this.f14100h.onClick(view);
                            }
                        } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                            if (CommonWebView.this.f14106n != null) {
                                CommonWebView.this.f14106n.onClick(view);
                            }
                            c.c(CommonWebView.this.getContext(), CommonWebView.this.f14096d.getUrl());
                        }
                    }
                }
            });
            addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.5
                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f14094b.getItem(ToolBar.BACKWARD).setEnabled(true);
                    CommonWebView.this.f14094b.getItem(ToolBar.FORWARD).setEnabled(false);
                    return false;
                }
            });
            addView(this.f14094b);
        }
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f14095c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                ad.c("CommonWebView", "newProgress! 开始! = " + str);
                CommonWebView.this.f14095c.setVisible(true);
                CommonWebView.this.f14095c.setProgressState(5);
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i10) {
                ad.c("CommonWebView", "newProgress! = " + i10);
                if (i10 == 100) {
                    CommonWebView.this.f14095c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.f14095c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.f14095c);
        this.f14095c.initResource(true);
    }

    public void setToolBarTitle(String str) {
        this.a.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f14108p + "ms");
                if (CommonWebView.this.f14111s != null) {
                    CommonWebView.this.f14112t = false;
                    CommonWebView.this.f14111s.a(CommonWebView.this.f14110r);
                }
            }
        };
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.a != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a = 40;
        ToolBar.a.f14113b = 80;
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f14097e);
            layoutParams.addRule(10);
            this.a.setLayoutParams(layoutParams);
            this.f14099g.addView(this.a);
            return;
        }
        this.a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f14097e));
        addView(this.a, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f14108p + "ms");
                if (CommonWebView.this.f14111s != null) {
                    CommonWebView.this.f14112t = false;
                    CommonWebView.this.f14111s.a(CommonWebView.this.f14110r);
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:3:0x0005, B:7:0x000c, B:10:0x001d, B:16:0x002e, B:18:0x003a, B:43:0x009c, B:45:0x0064, B:46:0x00a3, B:48:0x00ad, B:50:0x00b3, B:52:0x00b9, B:54:0x00bf, B:20:0x003e, B:22:0x0048, B:24:0x0056, B:28:0x006b, B:30:0x0077, B:32:0x0085, B:37:0x0095), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #2 {all -> 0x009b, blocks: (B:28:0x006b, B:30:0x0077, B:32:0x0085, B:37:0x0095), top: B:27:0x006b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "http"
            java.lang.String r1 = "CommonWebView"
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lca
            if (r3 == 0) goto Lc
            return r2
        Lc:
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r5 = "https"
            r6 = 1
            if (r4 != 0) goto L2a
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r2
            goto L2b
        L2a:
            r4 = r6
        L2b:
            if (r4 == 0) goto L2e
            return r2
        L2e:
            java.lang.String r3 = r3.getScheme()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = "intent"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lca
            if (r3 == 0) goto La3
            android.content.Intent r3 = android.content.Intent.parseUri(r10, r6)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r4 = r3.getPackage()     // Catch: java.lang.Throwable -> L63
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L63
            if (r7 != 0) goto L6b
            android.content.Context r7 = r8.getContext()     // Catch: java.lang.Throwable -> L63
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L63
            android.content.Intent r4 = r7.getLaunchIntentForPackage(r4)     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L6b
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r3.setFlags(r4)     // Catch: java.lang.Throwable -> L63
            android.content.Context r4 = r8.getContext()     // Catch: java.lang.Throwable -> L63
            r4.startActivity(r3)     // Catch: java.lang.Throwable -> L63
            return r6
        L63:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lca
            com.mbridge.msdk.foundation.tools.ad.b(r1, r4)     // Catch: java.lang.Throwable -> Lca
        L6b:
            java.lang.String r4 = "browser_fallback_url"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch: java.lang.Throwable -> L9b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L9b
            if (r4 != 0) goto La3
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r4.getScheme()     // Catch: java.lang.Throwable -> L9b
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L9b
            if (r7 != 0) goto L92
            java.lang.String r4 = r4.getScheme()     // Catch: java.lang.Throwable -> L9b
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L90
            goto L92
        L90:
            r4 = r2
            goto L93
        L92:
            r4 = r6
        L93:
            if (r4 == 0) goto L99
            r9.loadUrl(r3)     // Catch: java.lang.Throwable -> L9b
            return r2
        L99:
            r10 = r3
            goto La3
        L9b:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> Lca
            com.mbridge.msdk.foundation.tools.ad.b(r1, r9)     // Catch: java.lang.Throwable -> Lca
        La3:
            android.content.Context r9 = r8.getContext()     // Catch: java.lang.Throwable -> Lca
            boolean r9 = com.mbridge.msdk.click.c.d(r9, r10)     // Catch: java.lang.Throwable -> Lca
            if (r9 == 0) goto Lb3
            java.lang.String r9 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.ad.b(r1, r9)     // Catch: java.lang.Throwable -> Lca
            return r6
        Lb3:
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lca
            if (r9 != 0) goto Lc9
            boolean r9 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> Lca
            if (r9 != 0) goto Lc5
            boolean r9 = r10.startsWith(r5)     // Catch: java.lang.Throwable -> Lca
            if (r9 == 0) goto Lc6
        Lc5:
            r2 = r6
        Lc6:
            r9 = r2 ^ 1
            return r9
        Lc9:
            return r2
        Lca:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.a(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f14107o.postDelayed(this.u, this.f14108p);
    }
}
