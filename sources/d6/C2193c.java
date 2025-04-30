package d6;

import O5.d;
import Z5.g;
import Z5.h;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import b6.f;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import e6.AbstractC2224b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: d6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2193c extends AbstractC2191a {

    /* renamed from: f, reason: collision with root package name */
    public WebView f19916f;

    /* renamed from: g, reason: collision with root package name */
    public Long f19917g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f19918h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19919i;

    public C2193c(String str, Map map, String str2) {
        super(str);
        this.f19917g = null;
        this.f19918h = map;
        this.f19919i = str2;
    }

    @Override // d6.AbstractC2191a
    public final void a(h hVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) dVar.f2203c);
        for (String str : unmodifiableMap.keySet()) {
            g gVar = (g) unmodifiableMap.get(str);
            gVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            AbstractC2224b.b(jSONObject2, "vendorKey", gVar.f3896a);
            AbstractC2224b.b(jSONObject2, "resourceUrl", gVar.b.toString());
            AbstractC2224b.b(jSONObject2, "verificationParameters", gVar.f3897c);
            AbstractC2224b.b(jSONObject, str, jSONObject2);
        }
        b(hVar, dVar, jSONObject);
    }

    @Override // d6.AbstractC2191a
    public final void d() {
        long convert;
        super.d();
        if (this.f19917g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f19917g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new T5.d(this), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f19916f = null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X5.a, java.lang.ref.WeakReference] */
    @Override // d6.AbstractC2191a
    public final void f() {
        WebView webView = new WebView(f.b.f5340a);
        this.f19916f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f19916f.getSettings().setAllowContentAccess(false);
        this.f19916f.getSettings().setAllowFileAccess(false);
        this.f19916f.setWebViewClient(new T5.c(this, 2));
        this.b = new WeakReference(this.f19916f);
        WebView webView2 = this.f19916f;
        if (webView2 != null) {
            String str = this.f19919i;
            if (!TextUtils.isEmpty(str)) {
                try {
                    webView2.evaluateJavascript(str, null);
                } catch (IllegalStateException unused) {
                    webView2.loadUrl("javascript: " + str);
                }
            }
        }
        Map map = this.f19918h;
        for (String str2 : map.keySet()) {
            String externalForm = ((g) map.get(str2)).b.toExternalForm();
            WebView webView3 = this.f19916f;
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
        this.f19917g = Long.valueOf(System.nanoTime());
    }
}
