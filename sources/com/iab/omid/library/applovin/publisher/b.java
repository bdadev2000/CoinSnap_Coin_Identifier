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

/* loaded from: classes4.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f12183g;

    /* renamed from: h, reason: collision with root package name */
    private Long f12184h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f12185i;

    /* renamed from: j, reason: collision with root package name */
    private final String f12186j;

    /* loaded from: classes4.dex */
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
    /* loaded from: classes4.dex */
    public class RunnableC0155b implements Runnable {
        private final WebView a;

        public RunnableC0155b() {
            this.a = b.this.f12183g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f12184h = null;
        this.f12185i = map;
        this.f12186j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0155b(), Math.max(4000 - (this.f12184h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f12184h.longValue(), TimeUnit.NANOSECONDS)), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f12183g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f12183g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f12183g.getSettings().setAllowContentAccess(false);
        this.f12183g.getSettings().setAllowFileAccess(false);
        this.f12183g.setWebViewClient(new a());
        a(this.f12183g);
        h.a().c(this.f12183g, this.f12186j);
        for (String str : this.f12185i.keySet()) {
            h.a().c(this.f12183g, this.f12185i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f12184h = Long.valueOf(f.b());
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
