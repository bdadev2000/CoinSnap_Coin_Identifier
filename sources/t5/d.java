package T5;

import android.webkit.WebView;
import d6.C2193c;

/* loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final WebView f3025c;

    public d(e eVar) {
        this.f3025c = eVar.f3026g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f3025c.destroy();
                return;
            default:
                this.f3025c.destroy();
                return;
        }
    }

    public d(C2193c c2193c) {
        this.f3025c = c2193c.f19916f;
    }
}
