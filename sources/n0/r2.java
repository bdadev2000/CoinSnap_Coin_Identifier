package n0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: b, reason: collision with root package name */
    public static final r2 f22348b;
    public final o2 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f22348b = n2.f22331q;
        } else {
            f22348b = o2.f22338b;
        }
    }

    public r2(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.a = new n2(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.a = new m2(this, windowInsets);
        } else if (i10 >= 28) {
            this.a = new l2(this, windowInsets);
        } else {
            this.a = new k2(this, windowInsets);
        }
    }

    public static g0.f f(g0.f fVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, fVar.a - i10);
        int max2 = Math.max(0, fVar.f17910b - i11);
        int max3 = Math.max(0, fVar.f17911c - i12);
        int max4 = Math.max(0, fVar.f17912d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return fVar;
        }
        return g0.f.b(max, max2, max3, max4);
    }

    public static r2 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        r2 r2Var = new r2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            r2 rootWindowInsets = ViewCompat.getRootWindowInsets(view);
            o2 o2Var = r2Var.a;
            o2Var.p(rootWindowInsets);
            o2Var.d(view.getRootView());
        }
        return r2Var;
    }

    public final g0.f a(int i10) {
        return this.a.f(i10);
    }

    public final int b() {
        return this.a.j().f17912d;
    }

    public final int c() {
        return this.a.j().a;
    }

    public final int d() {
        return this.a.j().f17911c;
    }

    public final int e() {
        return this.a.j().f17910b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        return Objects.equals(this.a, ((r2) obj).a);
    }

    public final WindowInsets g() {
        o2 o2Var = this.a;
        if (o2Var instanceof j2) {
            return ((j2) o2Var).f22297c;
        }
        return null;
    }

    public final int hashCode() {
        o2 o2Var = this.a;
        if (o2Var == null) {
            return 0;
        }
        return o2Var.hashCode();
    }

    public r2() {
        this.a = new o2(this);
    }
}
