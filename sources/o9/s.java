package o9;

import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class s implements r {
    public final WindowManager a;

    public s(WindowManager windowManager) {
        this.a = windowManager;
    }

    @Override // o9.r
    public final void a() {
    }

    @Override // o9.r
    public final void b(androidx.core.app.h hVar) {
        hVar.g(this.a.getDefaultDisplay());
    }
}
