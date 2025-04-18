package com.applovin.sdk;

import a4.j;
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

/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";
    private final AtomicBoolean a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private String f9598b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f9599c;

    /* renamed from: d, reason: collision with root package name */
    private EventListener f9600d;

    /* loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    /* loaded from: classes.dex */
    public class a extends x {
        final /* synthetic */ k a;

        public a(k kVar) {
            this.a = kVar;
        }

        @Override // com.applovin.impl.sdk.x, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (AppLovinWebViewActivity.this.f9599c == webView) {
                AppLovinWebViewActivity.this.f9599c.destroy();
                AppLovinWebViewActivity.this.f9599c = null;
                AppLovinWebViewActivity appLovinWebViewActivity = AppLovinWebViewActivity.this;
                final k kVar = this.a;
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
            this.a.L();
            if (t.a()) {
                j.v("Handling url load: ", str, this.a.L(), "AppLovinWebViewActivity");
            }
            if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f9600d != null) {
                if (path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    if (queryParameterNames.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = (String) queryParameterNames.toArray()[0];
                    }
                    if (StringUtils.isValidString(str2)) {
                        String queryParameter = parse.getQueryParameter(str2);
                        this.a.L();
                        if (t.a()) {
                            this.a.L().a("AppLovinWebViewActivity", eb.j.l("Parsed WebView event parameter name: ", str2, " and value: ", queryParameter));
                        }
                        AppLovinWebViewActivity.this.f9600d.onReceivedEvent(queryParameter);
                        return true;
                    }
                    this.a.L();
                    if (t.a()) {
                        this.a.L().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
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
            if (((Boolean) kVar.a(oj.O5)).booleanValue() && AppLovinWebViewActivity.this.a.compareAndSet(false, true)) {
                AppLovinWebViewActivity.this.a(kVar);
                if (StringUtils.isValidString(AppLovinWebViewActivity.this.f9598b)) {
                    AppLovinWebViewActivity.this.f9599c.loadUrl(AppLovinWebViewActivity.this.f9598b);
                    return;
                }
                return;
            }
            AppLovinWebViewActivity.this.finish();
        }
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f9600d = eventListener;
        this.f9598b = str;
        this.a.set(false);
        WebView webView = this.f9599c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f9600d;
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
            this.f9598b = stringExtra2;
        }
        if (StringUtils.isValidString(this.f9598b)) {
            this.f9599c.loadUrl(this.f9598b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k kVar) {
        WebView b3 = zp.b(this, "WebView Activity");
        this.f9599c = b3;
        if (b3 == null) {
            finish();
            return;
        }
        setContentView(b3);
        WebSettings settings = this.f9599c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f9599c.setVerticalScrollBarEnabled(true);
        this.f9599c.setHorizontalScrollBarEnabled(true);
        this.f9599c.setScrollBarStyle(33554432);
        this.f9599c.setWebViewClient(new a(kVar));
    }
}
