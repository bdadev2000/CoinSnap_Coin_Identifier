package pd;

import android.os.Handler;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.appcompat.widget.j;
import com.facebook.internal.p0;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kd.h;
import kd.i;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public WebView f23599g;

    /* renamed from: h, reason: collision with root package name */
    public Long f23600h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f23601i;

    /* renamed from: j, reason: collision with root package name */
    public final String f23602j;

    public c(String str, Map map, String str2) {
        super(str);
        this.f23600h = null;
        this.f23601i = map;
        this.f23602j = str2;
    }

    @Override // pd.a
    public final void c(i iVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map d10 = dVar.d();
        for (String str : d10.keySet()) {
            h hVar = (h) d10.get(str);
            hVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            qd.c.b(jSONObject2, "vendorKey", hVar.a);
            qd.c.b(jSONObject2, "resourceUrl", hVar.f20667b.toString());
            qd.c.b(jSONObject2, "verificationParameters", hVar.f20668c);
            qd.c.b(jSONObject, str, jSONObject2);
        }
        d(iVar, dVar, jSONObject);
    }

    @Override // pd.a
    public final void e() {
        long convert;
        super.e();
        if (this.f23600h == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f23600h.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new j(this), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f23599g = null;
    }

    @Override // pd.a
    public final void g() {
        WebView webView = new WebView(j.a.f19652c.f19654b);
        this.f23599g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f23599g.getSettings().setAllowContentAccess(false);
        this.f23599g.getSettings().setAllowFileAccess(false);
        this.f23599g.setWebViewClient(new p0(this, 1));
        this.f23594b = new ce.a(this.f23599g);
        b6.b.c(this.f23599g, this.f23602j);
        Map map = this.f23601i;
        for (String str : map.keySet()) {
            String externalForm = ((h) map.get(str)).f20667b.toExternalForm();
            WebView webView2 = this.f23599g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                b6.b.c(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f23600h = Long.valueOf(System.nanoTime());
    }
}
