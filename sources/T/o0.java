package T;

import M0.C0225p;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0281l0 f2917a;
    public G0 b;

    public o0(View view, AbstractC0281l0 abstractC0281l0) {
        G0 g02;
        y0 v0Var;
        this.f2917a = abstractC0281l0;
        G0 rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                v0Var = new x0(rootWindowInsets);
            } else if (i9 >= 29) {
                v0Var = new w0(rootWindowInsets);
            } else {
                v0Var = new v0(rootWindowInsets);
            }
            g02 = v0Var.b();
        } else {
            g02 = null;
        }
        this.b = g02;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        E0 e02;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = G0.h(view, windowInsets);
            return p0.i(view, windowInsets);
        }
        G0 h6 = G0.h(view, windowInsets);
        if (this.b == null) {
            this.b = ViewCompat.getRootWindowInsets(view);
        }
        if (this.b == null) {
            this.b = h6;
            return p0.i(view, windowInsets);
        }
        AbstractC0281l0 j7 = p0.j(view);
        if (j7 != null && Objects.equals(j7.f2903a, windowInsets)) {
            return p0.i(view, windowInsets);
        }
        G0 g02 = this.b;
        int i9 = 1;
        int i10 = 0;
        while (true) {
            e02 = h6.f2863a;
            if (i9 > 256) {
                break;
            }
            if (!e02.f(i9).equals(g02.f2863a.f(i9))) {
                i10 |= i9;
            }
            i9 <<= 1;
        }
        if (i10 == 0) {
            return p0.i(view, windowInsets);
        }
        G0 g03 = this.b;
        if ((i10 & 8) != 0) {
            if (e02.f(8).f1671d > g03.f2863a.f(8).f1671d) {
                interpolator = p0.f2918e;
            } else {
                interpolator = p0.f2919f;
            }
        } else {
            interpolator = p0.f2920g;
        }
        t0 t0Var = new t0(i10, interpolator, 160L);
        t0Var.f2928a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(t0Var.f2928a.a());
        L.e f9 = e02.f(i10);
        L.e f10 = g03.f2863a.f(i10);
        int min = Math.min(f9.f1669a, f10.f1669a);
        int i11 = f9.b;
        int i12 = f10.b;
        int min2 = Math.min(i11, i12);
        int i13 = f9.f1670c;
        int i14 = f10.f1670c;
        int min3 = Math.min(i13, i14);
        int i15 = f9.f1671d;
        int i16 = i10;
        int i17 = f10.f1671d;
        E1.d dVar = new E1.d(14, L.e.b(min, min2, min3, Math.min(i15, i17)), L.e.b(Math.max(f9.f1669a, f10.f1669a), Math.max(i11, i12), Math.max(i13, i14), Math.max(i15, i17)));
        p0.f(view, t0Var, windowInsets, false);
        duration.addUpdateListener(new m0(t0Var, h6, g03, i16, view));
        duration.addListener(new C0225p(view, 2, t0Var));
        A.a(view, new n0(view, t0Var, dVar, duration));
        this.b = h6;
        return p0.i(view, windowInsets);
    }
}
