package T;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class E0 {
    public static final G0 b;

    /* renamed from: a, reason: collision with root package name */
    public final G0 f2857a;

    static {
        y0 v0Var;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            v0Var = new x0();
        } else if (i9 >= 29) {
            v0Var = new w0();
        } else {
            v0Var = new v0();
        }
        b = v0Var.b().f2863a.a().f2863a.b().f2863a.c();
    }

    public E0(@NonNull G0 g02) {
        this.f2857a = g02;
    }

    @NonNull
    public G0 a() {
        return this.f2857a;
    }

    @NonNull
    public G0 b() {
        return this.f2857a;
    }

    @NonNull
    public G0 c() {
        return this.f2857a;
    }

    @Nullable
    public C0274i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (n() == e02.n() && m() == e02.m() && Objects.equals(j(), e02.j()) && Objects.equals(h(), e02.h()) && Objects.equals(e(), e02.e())) {
            return true;
        }
        return false;
    }

    @NonNull
    public L.e f(int i9) {
        return L.e.f1668e;
    }

    @NonNull
    public L.e g() {
        return j();
    }

    @NonNull
    public L.e h() {
        return L.e.f1668e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    @NonNull
    public L.e i() {
        return j();
    }

    @NonNull
    public L.e j() {
        return L.e.f1668e;
    }

    @NonNull
    public L.e k() {
        return j();
    }

    @NonNull
    public G0 l(int i9, int i10, int i11, int i12) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(@NonNull View view) {
    }

    public void o(L.e[] eVarArr) {
    }

    public void p(@Nullable G0 g02) {
    }

    public void q(L.e eVar) {
    }
}
