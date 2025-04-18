package yd;

import android.os.Handler;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.appcompat.widget.j;
import com.facebook.internal.p0;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ka.e;
import org.json.JSONObject;
import vd.h;
import vd.i;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: f, reason: collision with root package name */
    public WebView f28171f;

    /* renamed from: g, reason: collision with root package name */
    public Long f28172g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f28173h;

    /* renamed from: i, reason: collision with root package name */
    public final String f28174i;

    public c(String str, Map map, String str2) {
        super(str);
        this.f28172g = null;
        this.f28173h = map;
        this.f28174i = str2;
    }

    @Override // yd.a
    public final void b(i iVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map d10 = dVar.d();
        for (String str : d10.keySet()) {
            h hVar = (h) d10.get(str);
            hVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            zd.b.b(jSONObject2, "vendorKey", hVar.a);
            zd.b.b(jSONObject2, "resourceUrl", hVar.f26508b.toString());
            zd.b.b(jSONObject2, "verificationParameters", hVar.f26509c);
            zd.b.b(jSONObject, str, jSONObject2);
        }
        c(iVar, dVar, jSONObject);
    }

    @Override // yd.a
    public final void d() {
        long convert;
        super.d();
        if (this.f28172g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f28172g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new j(this), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f28171f = null;
    }

    @Override // yd.a
    public final void f() {
        WebView webView = new WebView(j.a.f19653d.f19654b);
        this.f28171f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f28171f.getSettings().setAllowContentAccess(false);
        this.f28171f.getSettings().setAllowFileAccess(false);
        this.f28171f.setWebViewClient(new p0(this, 2));
        this.f28167b = new ce.a(this.f28171f);
        e.c(this.f28171f, this.f28174i);
        Map map = this.f28173h;
        for (String str : map.keySet()) {
            String externalForm = ((h) map.get(str)).f26508b.toExternalForm();
            WebView webView2 = this.f28171f;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                e.c(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f28172g = Long.valueOf(System.nanoTime());
    }
}
