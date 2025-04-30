package com.applovin.sdk;

import Q7.n0;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f12784a = new AtomicBoolean();
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f12785c;

    /* renamed from: d, reason: collision with root package name */
    private EventListener f12786d;

    /* loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    /* loaded from: classes.dex */
    public class a extends x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f12787a;

        public a(k kVar) {
            this.f12787a = kVar;
        }

        @Override // com.applovin.impl.sdk.x, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f12785c == webView) {
                AppLovinWebViewActivity.this.f12785c.destroy();
                AppLovinWebViewActivity.this.f12785c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final k kVar = this.f12787a;
                appLovinWebViewActivity.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinWebViewActivity.a.this.a(kVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            this.f12787a.L();
            if (t.a()) {
                n0.s("Handling url load: ", str, this.f12787a.L(), "AppLovinWebViewActivity");
            }
            if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f12786d != null) {
                if (path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    if (queryParameterNames.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = (String) queryParameterNames.toArray()[0];
                    }
                    if (StringUtils.isValidString(str2)) {
                        String queryParameter = parse.getQueryParameter(str2);
                        this.f12787a.L();
                        if (t.a()) {
                            this.f12787a.L().a("AppLovinWebViewActivity", AbstractC2914a.k("Parsed WebView event parameter name: ", str2, " and value: ", queryParameter));
                        }
                        AppLovinWebViewActivity.this.f12786d.onReceivedEvent(queryParameter);
                        return true;
                    }
                    this.f12787a.L();
                    if (t.a()) {
                        this.f12787a.L().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(k kVar) {
            if (((Boolean) kVar.a(oj.f9648O5)).booleanValue() && AppLovinWebViewActivity.this.f12784a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.a(kVar);
                if (StringUtils.isValidString(AppLovinWebViewActivity.this.b)) {
                    AppLovinWebViewActivity.this.f12785c.loadUrl(AppLovinWebViewActivity.this.b);
                    return;
                }
                return;
            }
            AppLovinWebViewActivity.this.finish();
        }
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f12786d = eventListener;
        this.b = str;
        this.f12784a.set(false);
        WebView webView = this.f12785c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f12786d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            t.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).a());
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (StringUtils.isValidString(stringExtra2)) {
            this.b = stringExtra2;
        }
        if (StringUtils.isValidString(this.b)) {
            this.f12785c.loadUrl(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        WebView b = zp.b(this, "WebView Activity");
        this.f12785c = b;
        if (b == null) {
            finish();
            return;
        }
        setContentView(b);
        WebSettings settings = this.f12785c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f12785c.setVerticalScrollBarEnabled(true);
        this.f12785c.setHorizontalScrollBarEnabled(true);
        this.f12785c.setScrollBarStyle(33554432);
        this.f12785c.setWebViewClient(new a(kVar));
    }
}
