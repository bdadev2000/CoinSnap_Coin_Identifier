package n0;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public class o2 {

    /* renamed from: b, reason: collision with root package name */
    public static final r2 f22338b = new kc.c(7).n().a.a().a.b().a.c();
    public final r2 a;

    public o2(@NonNull r2 r2Var) {
        this.a = r2Var;
    }

    @NonNull
    public r2 a() {
        return this.a;
    }

    @NonNull
    public r2 b() {
        return this.a;
    }

    @NonNull
    public r2 c() {
        return this.a;
    }

    public void d(@NonNull View view) {
    }

    @Nullable
    public k e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        if (n() == o2Var.n() && m() == o2Var.m() && Objects.equals(j(), o2Var.j()) && Objects.equals(h(), o2Var.h()) && Objects.equals(e(), o2Var.e())) {
            return true;
        }
        return false;
    }

    @NonNull
    public g0.f f(int i10) {
        return g0.f.f17909e;
    }

    @NonNull
    public g0.f g() {
        return j();
    }

    @NonNull
    public g0.f h() {
        return g0.f.f17909e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    @NonNull
    public g0.f i() {
        return j();
    }

    @NonNull
    public g0.f j() {
        return g0.f.f17909e;
    }

    @NonNull
    public g0.f k() {
        return j();
    }

    @NonNull
    public r2 l(int i10, int i11, int i12, int i13) {
        return f22338b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(g0.f[] fVarArr) {
    }

    public void p(@Nullable r2 r2Var) {
    }

    public void q(g0.f fVar) {
    }
}
