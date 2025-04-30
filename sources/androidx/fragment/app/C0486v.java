package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486v extends N {
    public final /* synthetic */ N b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0487w f4795c;

    public C0486v(DialogInterfaceOnCancelListenerC0487w dialogInterfaceOnCancelListenerC0487w, N n2) {
        this.f4795c = dialogInterfaceOnCancelListenerC0487w;
        this.b = n2;
    }

    @Override // androidx.fragment.app.N
    public final View b(int i9) {
        N n2 = this.b;
        if (n2.c()) {
            return n2.b(i9);
        }
        return this.f4795c.onFindViewById(i9);
    }

    @Override // androidx.fragment.app.N
    public final boolean c() {
        if (!this.b.c() && !this.f4795c.onHasView()) {
            return false;
        }
        return true;
    }
}
