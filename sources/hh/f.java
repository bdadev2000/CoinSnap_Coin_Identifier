package hh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.util.g0;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends RelativeLayout {
    public static final b Companion = new b(null);
    private static final String TAG = "MRAIDAdWidget";
    private a closeDelegate;
    private d onViewTouchListener;
    private e orientationDelegate;
    private WebView webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) throws InstantiationException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = g0.INSTANCE.getWebView(context);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        if (webView != null) {
            webView.setTag("VungleWebView");
        }
        addView(webView, layoutParams);
        bindListeners();
        prepare();
    }

    private final void applyDefault(WebView webView) {
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        WebView webView;
        d dVar = this.onViewTouchListener;
        if (dVar != null && (webView = this.webView) != null) {
            webView.setOnTouchListener(new na.h(dVar, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindListeners$lambda-1$lambda-0, reason: not valid java name */
    public static final boolean m139bindListeners$lambda1$lambda0(d it, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return ((com.vungle.ads.internal.ui.g) it).onTouch(motionEvent);
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(2, null);
            webView.setBackgroundColor(0);
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        a aVar = this.closeDelegate;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void destroyWebView(long j3) {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setWebChromeClient(null);
            removeAllViews();
            if (j3 <= 0) {
                new c(webView).run();
            } else {
                new o().schedule(new c(webView), j3);
            }
        }
    }

    public final a getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final d getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final e getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final void linkWebView(WebViewClient vngWebViewClient) {
        Intrinsics.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            applyDefault(webView);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView != null && (layoutParams = webView.getLayoutParams()) != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }

    public final void setCloseDelegate(a closeDelegate) {
        Intrinsics.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(a aVar) {
        this.closeDelegate = aVar;
    }

    public final void setOnViewTouchListener(d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOnViewTouchListener$vungle_ads_release(d dVar) {
        this.onViewTouchListener = dVar;
    }

    public final void setOrientation(int i10) {
        e eVar = this.orientationDelegate;
        if (eVar != null) {
            ((com.vungle.ads.internal.ui.h) eVar).setOrientation(i10);
        }
    }

    public final void setOrientationDelegate(e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void setOrientationDelegate$vungle_ads_release(e eVar) {
        this.orientationDelegate = eVar;
    }

    public final void showWebsite(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        v.Companion.d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
            webView.loadUrl(url);
        }
    }
}
