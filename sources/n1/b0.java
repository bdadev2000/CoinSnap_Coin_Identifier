package n1;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b0 extends x0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f31055l;

    public b0(String str, c0 c0Var) {
        super(str, c0Var, 1);
        this.f31055l = true;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            l1.f fVar = (l1.f) obj;
            if (p0.a.g(this.f31150a, fVar.g())) {
                b0 b0Var = (b0) obj;
                if (b0Var.f31055l && Arrays.equals((l1.f[]) this.f31157j.getValue(), (l1.f[]) b0Var.f31157j.getValue())) {
                    int d = fVar.d();
                    int i3 = this.f31152c;
                    if (i3 == d) {
                        for (0; i2 < i3; i2 + 1) {
                            i2 = (p0.a.g(f(i2).g(), fVar.f(i2).g()) && p0.a.g(f(i2).c(), fVar.f(i2).c())) ? i2 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // n1.x0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
