package n1;

import java.util.List;

/* loaded from: classes3.dex */
public final class f0 implements x0.o {

    /* renamed from: a, reason: collision with root package name */
    public final x0.o f31071a;

    public f0(x0.o oVar) {
        p0.a.s(oVar, "origin");
        this.f31071a = oVar;
    }

    public final List a() {
        return ((f0) this.f31071a).a();
    }

    public final x0.d b() {
        return ((f0) this.f31071a).b();
    }

    public final boolean c() {
        return ((f0) this.f31071a).c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        if (!p0.a.g(this.f31071a, f0Var != null ? f0Var.f31071a : null)) {
            return false;
        }
        x0.d b2 = b();
        if (b2 instanceof x0.c) {
            x0.o oVar = obj instanceof x0.o ? (x0.o) obj : null;
            x0.d b3 = oVar != null ? ((f0) oVar).b() : null;
            if (b3 != null && (b3 instanceof x0.c)) {
                return p0.a.g(p0.a.i0((x0.c) b2), p0.a.i0((x0.c) b3));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31071a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f31071a;
    }
}
