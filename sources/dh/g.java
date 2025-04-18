package dh;

import a4.y;
import android.webkit.WebView;
import androidx.emoji2.text.t;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements i {
    public static final e Companion = new e(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private vd.b adSession;
    private final boolean enabled;
    private boolean started;

    public /* synthetic */ g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    @Override // dh.i
    public void onPageFinished(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.started && this.adSession == null) {
            vd.d dVar = vd.d.DEFINED_BY_JAVASCRIPT;
            vd.f fVar = vd.f.DEFINED_BY_JAVASCRIPT;
            vd.g gVar = vd.g.JAVASCRIPT;
            t b3 = t.b(dVar, fVar, gVar, gVar);
            com.bumptech.glide.e.d("Vungle", "Name is null or empty");
            com.bumptech.glide.e.d("7.3.2", "Version is null or empty");
            y yVar = new y("Vungle", "7.3.2", 6);
            com.bumptech.glide.e.c(webView, "WebView is null");
            vd.i a = vd.b.a(b3, new android.support.v4.media.d(yVar, webView, null, null, vd.c.HTML));
            this.adSession = a;
            a.c(webView);
            vd.b bVar = this.adSession;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public final void start() {
        if (this.enabled && com.facebook.appevents.g.f10941f.b()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j3;
        vd.b bVar;
        if (this.started && (bVar = this.adSession) != null) {
            if (bVar != null) {
                bVar.b();
            }
            j3 = DESTROY_DELAY_MS;
        } else {
            j3 = 0;
        }
        this.started = false;
        this.adSession = null;
        return j3;
    }

    private g(boolean z10) {
        this.enabled = z10;
    }
}
