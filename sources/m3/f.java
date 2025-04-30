package M3;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes2.dex */
public final class f implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1994a;
    public final /* synthetic */ g b;

    public f(g gVar, b bVar) {
        this.b = gVar;
        this.f1994a = bVar;
    }

    public final void onBackCancelled() {
        if (this.b.f1993a != null) {
            this.f1994a.d();
        }
    }

    public final void onBackInvoked() {
        this.f1994a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.f1993a != null) {
            this.f1994a.c(new f.b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.f1993a != null) {
            this.f1994a.a(new f.b(backEvent));
        }
    }
}
