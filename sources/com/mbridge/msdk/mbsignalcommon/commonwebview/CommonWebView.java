package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
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
import com.adjust.sdk.Constants;
import com.mbridge.msdk.click.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* renamed from: a, reason: collision with root package name */
    protected ToolBar f16610a;
    protected ToolBar b;

    /* renamed from: c, reason: collision with root package name */
    protected ProgressBar f16611c;

    /* renamed from: d, reason: collision with root package name */
    protected BaseWebView f16612d;

    /* renamed from: e, reason: collision with root package name */
    private int f16613e;

    /* renamed from: f, reason: collision with root package name */
    private int f16614f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f16615g;

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f16616h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f16617i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f16618j;

    /* renamed from: k, reason: collision with root package name */
    private View.OnClickListener f16619k;
    private View.OnClickListener l;
    private View.OnClickListener m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f16620n;

    /* renamed from: o, reason: collision with root package name */
    private Handler f16621o;

    /* renamed from: p, reason: collision with root package name */
    private int f16622p;

    /* renamed from: q, reason: collision with root package name */
    private WebViewClient f16623q;

    /* renamed from: r, reason: collision with root package name */
    private String f16624r;

    /* renamed from: s, reason: collision with root package name */
    private b f16625s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16626t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f16627u;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(String str);
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f16627u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f16622p + "ms");
                if (CommonWebView.this.f16625s != null) {
                    CommonWebView.this.f16626t = false;
                    CommonWebView.this.f16625s.a(CommonWebView.this.f16624r);
                }
            }
        };
        init();
    }

    public static /* synthetic */ void k(CommonWebView commonWebView) {
        commonWebView.f16621o.removeCallbacks(commonWebView.f16627u);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f16618j.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f16617i.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        View view;
        ToolBar toolBar;
        ToolBar toolBar2 = this.f16610a;
        if (toolBar2 != null) {
            view = toolBar2.getItem(str);
        } else {
            view = null;
        }
        if (view == null && (toolBar = this.b) != null) {
            return toolBar.getItem(str);
        }
        return view;
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f16612d;
        if (baseWebView == null) {
            return "";
        }
        return baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f16612d;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f16610a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.b;
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
        this.f16610a.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f16615g = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f16615g, layoutParams);
        this.f16613e = ai.a(getContext(), 40.0f);
        this.f16614f = ai.a(getContext(), 40.0f);
        this.f16617i = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f16618j = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f16612d == null) {
                this.f16612d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f16612d.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f16612d;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f16617i);
            this.f16612d.setWebChromeClient(this.f16618j);
            addWebViewClient(bVar);
        } catch (Throwable th) {
            ad.b("CommonWebView", "webview is error", th);
        }
        this.f16615g.addView(this.f16612d);
    }

    public void loadUrl(String str) {
        this.f16612d.loadUrl(str);
        if (this.f16623q != null) {
            a();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f16619k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f16620n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f16618j.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f16617i.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f16610a.getParent()).removeView(this.f16610a);
        this.f16615g.addView(this.f16610a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f16610a.getParent()).removeView(this.f16610a);
        addView(this.f16610a, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f16616h = onClickListener;
    }

    public void setPageLoadTimtout(int i9) {
        this.f16622p = i9;
        if (this.f16621o == null) {
            this.f16621o = new Handler(Looper.getMainLooper());
        }
        if (this.f16623q == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.f16626t = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.f16624r = str;
                    if (!CommonWebView.this.f16626t) {
                        CommonWebView.this.f16626t = true;
                        CommonWebView.this.a();
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i10, String str, String str2) {
                    CommonWebView.this.f16626t = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f16624r = str;
                    if (CommonWebView.this.f16626t) {
                        CommonWebView.k(CommonWebView.this);
                    }
                    CommonWebView.this.f16626t = true;
                    CommonWebView.this.a();
                    return false;
                }
            };
            this.f16623q = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    public void setPageLoadTimtoutListener(b bVar) {
        this.f16625s = bVar;
    }

    public void setToolBarTitle(String str, int i9) {
        this.f16610a.setTitle(str, i9);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f16610a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.b;
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
        this.f16610a.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z8) {
        a(arrayList, z8);
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
        if (this.b == null) {
            this.b = new ToolBar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f16614f);
            layoutParams.bottomMargin = 0;
            this.b.setLayoutParams(layoutParams);
            this.b.setBackgroundColor(-1);
            this.b.setOnItemClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseWebView baseWebView = CommonWebView.this.f16612d;
                    if (baseWebView != null) {
                        baseWebView.stopLoading();
                        String str = (String) view.getTag();
                        if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                            CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(true);
                            if (CommonWebView.this.f16612d.canGoBack()) {
                                CommonWebView.this.f16612d.goBack();
                            }
                            CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f16612d.canGoBack());
                            if (CommonWebView.this.f16619k != null) {
                                CommonWebView.this.f16619k.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.FORWARD)) {
                            CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(true);
                            if (CommonWebView.this.f16612d.canGoForward()) {
                                CommonWebView.this.f16612d.goForward();
                            }
                            CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f16612d.canGoForward());
                            if (CommonWebView.this.l != null) {
                                CommonWebView.this.l.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.REFRESH)) {
                            CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f16612d.canGoBack());
                            CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f16612d.canGoForward());
                            CommonWebView.this.f16612d.reload();
                            if (CommonWebView.this.m != null) {
                                CommonWebView.this.m.onClick(view);
                                return;
                            }
                            return;
                        }
                        if (TextUtils.equals(str, ToolBar.EXITS)) {
                            if (CommonWebView.this.f16616h != null) {
                                CommonWebView.this.f16616h.onClick(view);
                            }
                        } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                            if (CommonWebView.this.f16620n != null) {
                                CommonWebView.this.f16620n.onClick(view);
                            }
                            c.c(CommonWebView.this.getContext(), CommonWebView.this.f16612d.getUrl());
                        }
                    }
                }
            });
            addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.5
                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.b.getItem(ToolBar.BACKWARD).setEnabled(true);
                    CommonWebView.this.b.getItem(ToolBar.FORWARD).setEnabled(false);
                    return false;
                }
            });
            addView(this.b);
        }
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f16611c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                ad.c("CommonWebView", "newProgress! 开始! = " + str);
                CommonWebView.this.f16611c.setVisible(true);
                CommonWebView.this.f16611c.setProgressState(5);
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i9) {
                ad.c("CommonWebView", "newProgress! = " + i9);
                if (i9 == 100) {
                    CommonWebView.this.f16611c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.f16611c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.f16611c);
        this.f16611c.initResource(true);
    }

    public void setToolBarTitle(String str) {
        this.f16610a.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16627u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f16622p + "ms");
                if (CommonWebView.this.f16625s != null) {
                    CommonWebView.this.f16626t = false;
                    CommonWebView.this.f16625s.a(CommonWebView.this.f16624r);
                }
            }
        };
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z8) {
        if (this.f16610a != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.f16637a = 40;
        ToolBar.a.b = 80;
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f16610a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z8) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f16613e);
            layoutParams.addRule(10);
            this.f16610a.setLayoutParams(layoutParams);
            this.f16615g.addView(this.f16610a);
            return;
        }
        this.f16610a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f16613e));
        addView(this.f16610a, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f16627u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                ad.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f16622p + "ms");
                if (CommonWebView.this.f16625s != null) {
                    CommonWebView.this.f16626t = false;
                    CommonWebView.this.f16625s.a(CommonWebView.this.f16624r);
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals(Constants.SCHEME)) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            getContext().startActivity(parseUri);
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b("CommonWebView", th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals(Constants.SCHEME)) {
                                str = stringExtra;
                            }
                            webView.loadUrl(stringExtra);
                            return false;
                        }
                    } catch (Throwable th2) {
                        ad.b("CommonWebView", th2.getMessage());
                    }
                }
                if (c.d(getContext(), str)) {
                    ad.b("CommonWebView", "openDeepLink");
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith("http") || str.startsWith(Constants.SCHEME));
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b("CommonWebView", th3.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f16621o.postDelayed(this.f16627u, this.f16622p);
    }
}
