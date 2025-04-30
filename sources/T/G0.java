package T;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G0 {
    public static final G0 b;

    /* renamed from: a, reason: collision with root package name */
    public final E0 f2863a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = D0.f2856q;
        } else {
            b = E0.b;
        }
    }

    public G0(WindowInsets windowInsets) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            this.f2863a = new D0(this, windowInsets);
            return;
        }
        if (i9 >= 29) {
            this.f2863a = new C0(this, windowInsets);
        } else if (i9 >= 28) {
            this.f2863a = new B0(this, windowInsets);
        } else {
            this.f2863a = new A0(this, windowInsets);
        }
    }

    public static L.e e(L.e eVar, int i9, int i10, int i11, int i12) {
        int max = Math.max(0, eVar.f1669a - i9);
        int max2 = Math.max(0, eVar.b - i10);
        int max3 = Math.max(0, eVar.f1670c - i11);
        int max4 = Math.max(0, eVar.f1671d - i12);
        if (max == i9 && max2 == i10 && max3 == i11 && max4 == i12) {
            return eVar;
        }
        return L.e.b(max, max2, max3, max4);
    }

    public static G0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        G0 g02 = new G0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            G0 rootWindowInsets = ViewCompat.getRootWindowInsets(view);
            E0 e02 = g02.f2863a;
            e02.p(rootWindowInsets);
            e02.d(view.getRootView());
        }
        return g02;
    }

    public final int a() {
        return this.f2863a.j().f1671d;
    }

    public final int b() {
        return this.f2863a.j().f1669a;
    }

    public final int c() {
        return this.f2863a.j().f1670c;
    }

    public final int d() {
        return this.f2863a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        return Objects.equals(this.f2863a, ((G0) obj).f2863a);
    }

    public final G0 f(int i9, int i10, int i11, int i12) {
        y0 v0Var;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            v0Var = new x0(this);
        } else if (i13 >= 29) {
            v0Var = new w0(this);
        } else {
            v0Var = new v0(this);
        }
        v0Var.g(L.e.b(i9, i10, i11, i12));
        return v0Var.b();
    }

    public final WindowInsets g() {
        E0 e02 = this.f2863a;
        if (e02 instanceof z0) {
            return ((z0) e02).f2948c;
        }
        return null;
    }

    public final int hashCode() {
        E0 e02 = this.f2863a;
        if (e02 == null) {
            return 0;
        }
        return e02.hashCode();
    }

    public G0() {
        this.f2863a = new E0(this);
    }
}
