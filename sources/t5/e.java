package T5;

import O5.j;
import O5.k;
import R5.h;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e extends a {

    /* renamed from: g, reason: collision with root package name */
    public WebView f3026g;

    /* renamed from: h, reason: collision with root package name */
    public Long f3027h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f3028i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3029j;

    public e(String str, Map map, String str2) {
        super(str);
        this.f3027h = null;
        this.f3028i = map;
        this.f3029j = str2;
    }

    @Override // T5.a
    public final void a(k kVar, O5.d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) dVar.f2203c);
        for (String str : unmodifiableMap.keySet()) {
            j jVar = (j) unmodifiableMap.get(str);
            jVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            U5.b.b(jSONObject2, "vendorKey", jVar.f2227a);
            U5.b.b(jSONObject2, "resourceUrl", jVar.b.toString());
            U5.b.b(jSONObject2, "verificationParameters", jVar.f2228c);
            U5.b.b(jSONObject, str, jSONObject2);
        }
        b(kVar, dVar, jSONObject);
    }

    @Override // T5.a
    public final void e() {
        long convert;
        super.e();
        if (this.f3027h == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f3027h.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new d(this), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f3026g = null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X5.a, java.lang.ref.WeakReference] */
    @Override // T5.a
    public final void g() {
        WebView webView = new WebView(h.b.f2750a);
        this.f3026g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f3026g.getSettings().setAllowContentAccess(false);
        this.f3026g.getSettings().setAllowFileAccess(false);
        this.f3026g.setWebViewClient(new c(this, 0));
        this.b = new WeakReference(this.f3026g);
        WebView webView2 = this.f3026g;
        if (webView2 != null) {
            String str = this.f3029j;
            if (!TextUtils.isEmpty(str)) {
                try {
                    webView2.evaluateJavascript(str, null);
                } catch (IllegalStateException unused) {
                    webView2.loadUrl("javascript: " + str);
                }
            }
        }
        Map map = this.f3028i;
        for (String str2 : map.keySet()) {
            String externalForm = ((j) map.get(str2)).b.toExternalForm();
            WebView webView3 = this.f3026g;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    try {
                        webView3.evaluateJavascript(replace, null);
                    } catch (IllegalStateException unused2) {
                        webView3.loadUrl("javascript: " + replace);
                    }
                }
            }
        }
        this.f3027h = Long.valueOf(System.nanoTime());
    }
}
