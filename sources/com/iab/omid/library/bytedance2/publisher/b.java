package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: f, reason: collision with root package name */
    private WebView f12276f;

    /* renamed from: g, reason: collision with root package name */
    private Long f12277g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f12278h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12279i;

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        private final WebView a;

        public a() {
            this.a = b.this.f12276f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f12278h = map;
        this.f12279i = str;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.f12277g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f12277g.longValue(), TimeUnit.NANOSECONDS)), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f12276f = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.bytedance2.internal.f.b().a());
        this.f12276f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f12276f.getSettings().setAllowContentAccess(false);
        this.f12276f.getSettings().setAllowFileAccess(false);
        a(this.f12276f);
        g.a().c(this.f12276f, this.f12279i);
        for (String str : this.f12278h.keySet()) {
            g.a().a(this.f12276f, this.f12278h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f12277g = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
