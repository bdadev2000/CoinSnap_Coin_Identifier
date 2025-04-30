package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f14446g;

    /* renamed from: h, reason: collision with root package name */
    private Long f14447h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f14448i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14449j;

    /* loaded from: classes3.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.applovin.publisher.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0143b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f14451a;

        public RunnableC0143b() {
            this.f14451a = b.this.f14446g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14451a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f14447h = null;
        this.f14448i = map;
        this.f14449j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0143b(), Math.max(4000 - (this.f14447h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f14447h.longValue(), TimeUnit.NANOSECONDS)), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f14446g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f14446g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f14446g.getSettings().setAllowContentAccess(false);
        this.f14446g.getSettings().setAllowFileAccess(false);
        this.f14446g.setWebViewClient(new a());
        a(this.f14446g);
        h.a().c(this.f14446g, this.f14449j);
        for (String str : this.f14448i.keySet()) {
            h.a().c(this.f14446g, this.f14448i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f14447h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
