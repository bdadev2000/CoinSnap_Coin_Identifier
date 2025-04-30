package M0;

import android.view.ViewGroup;

/* renamed from: M0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213d extends x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1867a = false;
    public final ViewGroup b;

    public C0213d(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // M0.x, M0.u
    public final void b() {
        r8.k.A(this.b, false);
    }

    @Override // M0.x, M0.u
    public final void c(w wVar) {
        if (!this.f1867a) {
            r8.k.A(this.b, false);
        }
        wVar.A(this);
    }

    @Override // M0.x, M0.u
    public final void e() {
        r8.k.A(this.b, true);
    }

    @Override // M0.x, M0.u
    public final void f(w wVar) {
        r8.k.A(this.b, false);
        this.f1867a = true;
    }
}
