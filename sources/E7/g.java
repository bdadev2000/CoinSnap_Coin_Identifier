package e7;

import G7.j;
import J1.p;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g implements i {
    public static final e Companion = new e(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private Z5.b adSession;
    private final boolean enabled;
    private boolean started;

    public /* synthetic */ g(boolean z8, G7.f fVar) {
        this(z8);
    }

    @Override // e7.i
    public void onPageFinished(WebView webView) {
        j.e(webView, "webView");
        if (this.started && this.adSession == null) {
            Z5.d dVar = Z5.d.DEFINED_BY_JAVASCRIPT;
            Z5.e eVar = Z5.e.DEFINED_BY_JAVASCRIPT;
            Z5.f fVar = Z5.f.JAVASCRIPT;
            O5.c c9 = O5.c.c(dVar, eVar, fVar, fVar);
            if (!TextUtils.isEmpty("Vungle")) {
                if (!TextUtils.isEmpty("7.3.2")) {
                    Z5.h a6 = Z5.b.a(c9, new O5.d(new p(2), webView, null, null, Z5.c.HTML));
                    this.adSession = a6;
                    a6.c(webView);
                    Z5.b bVar = this.adSession;
                    if (bVar != null) {
                        bVar.d();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Version is null or empty");
            }
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    public final void start() {
        if (this.enabled && Y5.a.f3816a.f1512a) {
            this.started = true;
        }
    }

    public final long stop() {
        long j7;
        Z5.b bVar;
        if (this.started && (bVar = this.adSession) != null) {
            if (bVar != null) {
                bVar.b();
            }
            j7 = DESTROY_DELAY_MS;
        } else {
            j7 = 0;
        }
        this.started = false;
        this.adSession = null;
        return j7;
    }

    private g(boolean z8) {
        this.enabled = z8;
    }
}
