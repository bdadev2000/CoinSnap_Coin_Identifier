package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class q extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f1704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f1705c;

    public q(r rVar, f0 f0Var) {
        this.f1705c = rVar;
        this.f1704b = f0Var;
    }

    @Override // androidx.fragment.app.f0
    public final View b(int i10) {
        f0 f0Var = this.f1704b;
        if (f0Var.c()) {
            return f0Var.b(i10);
        }
        return this.f1705c.onFindViewById(i10);
    }

    @Override // androidx.fragment.app.f0
    public final boolean c() {
        return this.f1704b.c() || this.f1705c.onHasView();
    }
}
