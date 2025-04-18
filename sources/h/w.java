package h;

import android.view.MenuItem;
import androidx.core.view.ViewCompat;
import n0.r1;

/* loaded from: classes.dex */
public final class w implements j.b {

    /* renamed from: b, reason: collision with root package name */
    public final j.b f18675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f18676c;

    public w(g0 g0Var, s2.h hVar) {
        this.f18676c = g0Var;
        this.f18675b = hVar;
    }

    @Override // j.b
    public final void a(j.c cVar) {
        this.f18675b.a(cVar);
        g0 g0Var = this.f18676c;
        if (g0Var.f18592y != null) {
            g0Var.f18582n.getDecorView().removeCallbacks(g0Var.f18593z);
        }
        if (g0Var.f18591x != null) {
            r1 r1Var = g0Var.A;
            if (r1Var != null) {
                r1Var.b();
            }
            r1 animate = ViewCompat.animate(g0Var.f18591x);
            animate.a(0.0f);
            g0Var.A = animate;
            animate.d(new v(this, 2));
        }
        n nVar = g0Var.f18584p;
        if (nVar != null) {
            nVar.b();
        }
        g0Var.f18590w = null;
        ViewCompat.requestApplyInsets(g0Var.C);
        g0Var.J();
    }

    @Override // j.b
    public final boolean b(j.c cVar, MenuItem menuItem) {
        return this.f18675b.b(cVar, menuItem);
    }

    @Override // j.b
    public final boolean d(j.c cVar, k.o oVar) {
        return this.f18675b.d(cVar, oVar);
    }

    @Override // j.b
    public final boolean g(j.c cVar, k.o oVar) {
        ViewCompat.requestApplyInsets(this.f18676c.C);
        return this.f18675b.g(cVar, oVar);
    }
}
