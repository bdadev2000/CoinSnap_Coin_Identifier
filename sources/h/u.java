package h;

import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import n0.i2;
import n0.r2;

/* loaded from: classes.dex */
public final class u implements n0.z, k.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f18665b;

    public /* synthetic */ u(g0 g0Var) {
        this.f18665b = g0Var;
    }

    @Override // k.b0
    public final void b(k.o oVar, boolean z10) {
        boolean z11;
        int i10;
        f0 f0Var;
        k.o k10 = oVar.k();
        int i11 = 0;
        if (k10 != oVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            oVar = k10;
        }
        g0 g0Var = this.f18665b;
        f0[] f0VarArr = g0Var.N;
        if (f0VarArr != null) {
            i10 = f0VarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                f0Var = f0VarArr[i11];
                if (f0Var != null && f0Var.f18558h == oVar) {
                    break;
                } else {
                    i11++;
                }
            } else {
                f0Var = null;
                break;
            }
        }
        if (f0Var != null) {
            if (z11) {
                g0Var.r(f0Var.a, f0Var, k10);
                g0Var.t(f0Var, true);
            } else {
                g0Var.t(f0Var, z10);
            }
        }
    }

    @Override // k.b0
    public final boolean i(k.o oVar) {
        Window.Callback B;
        if (oVar == oVar.k()) {
            g0 g0Var = this.f18665b;
            if (g0Var.H && (B = g0Var.B()) != null && !g0Var.S) {
                B.onMenuOpened(108, oVar);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // n0.z
    public final r2 t(View view, r2 r2Var) {
        int e2 = r2Var.e();
        int K = this.f18665b.K(r2Var, null);
        if (e2 != K) {
            int c10 = r2Var.c();
            int d10 = r2Var.d();
            int b3 = r2Var.b();
            kc.c cVar = new kc.c(r2Var);
            ((i2) cVar.f20640c).g(g0.f.b(c10, K, d10, b3));
            r2Var = cVar.n();
        }
        return ViewCompat.onApplyWindowInsets(view, r2Var);
    }
}
