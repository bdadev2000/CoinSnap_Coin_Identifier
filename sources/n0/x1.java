package n0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x1 implements View.OnApplyWindowInsetsListener {
    public final u1 a;

    /* renamed from: b, reason: collision with root package name */
    public r2 f22369b;

    public x1(View view, u1 u1Var) {
        r2 r2Var;
        this.a = u1Var;
        r2 rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets != null) {
            r2Var = new kc.c(rootWindowInsets).n();
        } else {
            r2Var = null;
        }
        this.f22369b = r2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f22369b = r2.h(view, windowInsets);
            return y1.i(view, windowInsets);
        }
        r2 h10 = r2.h(view, windowInsets);
        if (this.f22369b == null) {
            this.f22369b = ViewCompat.getRootWindowInsets(view);
        }
        if (this.f22369b == null) {
            this.f22369b = h10;
            return y1.i(view, windowInsets);
        }
        u1 j3 = y1.j(view);
        if (j3 != null && Objects.equals(j3.a, windowInsets)) {
            return y1.i(view, windowInsets);
        }
        r2 r2Var = this.f22369b;
        int i10 = 0;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if (!h10.a(i11).equals(r2Var.a(i11))) {
                i10 |= i11;
            }
        }
        if (i10 == 0) {
            return y1.i(view, windowInsets);
        }
        r2 r2Var2 = this.f22369b;
        if ((i10 & 8) != 0) {
            if (h10.a(8).f17912d > r2Var2.a(8).f17912d) {
                interpolator = y1.f22370e;
            } else {
                interpolator = y1.f22371f;
            }
        } else {
            interpolator = y1.f22372g;
        }
        c2 c2Var = new c2(i10, interpolator, 160L);
        b2 b2Var = c2Var.a;
        b2Var.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(b2Var.a());
        g0.f a = h10.a(i10);
        g0.f a10 = r2Var2.a(i10);
        int min = Math.min(a.a, a10.a);
        int i12 = a.f17910b;
        int i13 = a10.f17910b;
        int min2 = Math.min(i12, i13);
        int i14 = a.f17911c;
        int i15 = a10.f17911c;
        int min3 = Math.min(i14, i15);
        int i16 = a.f17912d;
        int i17 = i10;
        int i18 = a10.f17912d;
        d3.g gVar = new d3.g(5, g0.f.b(min, min2, min3, Math.min(i16, i18)), g0.f.b(Math.max(a.a, a10.a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
        y1.f(view, c2Var, windowInsets, false);
        duration.addUpdateListener(new v1(c2Var, h10, r2Var2, i17, view));
        duration.addListener(new q1(1, this, c2Var, view));
        c0.a(view, new w1(this, view, c2Var, gVar, duration, 0));
        this.f22369b = h10;
        return y1.i(view, windowInsets);
    }
}
