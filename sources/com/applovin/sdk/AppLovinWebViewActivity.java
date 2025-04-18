package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.adview.t;
import com.applovin.impl.pi;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.yp;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f28499a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private String f28500b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f28501c;
    private EventListener d;

    /* loaded from: classes2.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    /* loaded from: classes2.dex */
    public class a extends pi {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f28502a;

        public a(j jVar) {
            this.f28502a = jVar;
        }

        @Override // com.applovin.impl.pi, android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(g.f30048a, view, url);
        }

        @Override // com.applovin.impl.pi, android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            CreativeInfoManager.onWebViewPageFinished(g.f30048a, view, url);
        }

        @Override // com.applovin.impl.pi, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f28501c == webView) {
                AppLovinWebViewActivity.this.f28501c.destroy();
                AppLovinWebViewActivity.this.f28501c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final j jVar = this.f28502a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinWebViewActivity.a.this.a(jVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        public boolean safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05(WebView p02, String p12) {
            Uri parse = Uri.parse(p12);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            this.f28502a.J();
            if (n.a()) {
                t.v("Handling url load: ", p12, this.f28502a.J(), "AppLovinWebViewActivity");
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) || AppLovinWebViewActivity.this.d == null) {
                return super.shouldOverrideUrlLoading(p02, p12);
            }
            if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            String str = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
            if (!StringUtils.isValidString(str)) {
                this.f28502a.J();
                if (!n.a()) {
                    return true;
                }
                this.f28502a.J().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            String p13 = parse.getQueryParameter(str);
            this.f28502a.J();
            if (n.a()) {
                this.f28502a.J().a("AppLovinWebViewActivity", androidx.compose.foundation.text.input.a.l("Parsed WebView event parameter name: ", str, " and value: ", p13));
            }
            AppLovinWebViewActivity.this.d.onReceivedEvent(p13);
            return true;
        }

        @Override // com.applovin.impl.pi, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(g.f30048a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // com.applovin.impl.pi, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(g.f30048a, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/sdk/AppLovinWebViewActivity$a;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05 = safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(g.f30048a, webView, str, safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05);
            return safedk_AppLovinWebViewActivity$a_shouldOverrideUrlLoading_3b7a72572afa404b133fbd6043a20e05;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(j jVar) {
            if (((Boolean) jVar.a(sj.T5)).booleanValue() && AppLovinWebViewActivity.this.f28499a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.a(jVar);
                if (StringUtils.isValidString(AppLovinWebViewActivity.this.f28500b)) {
                    AppLovinNetworkBridge.webviewLoadUrl(AppLovinWebViewActivity.this.f28501c, AppLovinWebViewActivity.this.f28500b);
                    return;
                }
                return;
            }
            AppLovinWebViewActivity.this.finish();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.d = eventListener;
        this.f28500b = str;
        this.f28499a.set(false);
        WebView webView = this.f28501c;
        if (webView != null) {
            AppLovinNetworkBridge.webviewLoadUrl(webView, str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            n.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).a());
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra2)) {
            this.f28500b = stringExtra2;
        }
        if (StringUtils.isValidString(this.f28500b)) {
            this.f28501c.loadUrl(this.f28500b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar) {
        WebView b2 = yp.b(this, "WebView Activity");
        this.f28501c = b2;
        if (b2 == null) {
            finish();
            return;
        }
        setContentView(b2);
        WebSettings settings = this.f28501c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f28501c.setVerticalScrollBarEnabled(true);
        this.f28501c.setHorizontalScrollBarEnabled(true);
        this.f28501c.setScrollBarStyle(33554432);
        this.f28501c.setWebViewClient(new a(jVar));
    }
}
