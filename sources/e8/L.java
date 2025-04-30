package e8;

import java.util.List;
import u7.C2824o;

/* loaded from: classes3.dex */
public abstract class L implements c8.g {

    /* renamed from: a, reason: collision with root package name */
    public final c8.g f20128a;
    public final int b = 1;

    public L(c8.g gVar) {
        this.f20128a = gVar;
    }

    @Override // c8.g
    public final boolean c() {
        return false;
    }

    @Override // c8.g
    public final int d(String str) {
        G7.j.e(str, "name");
        Integer v6 = O7.n.v(str);
        if (v6 != null) {
            return v6.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // c8.g
    public final List e() {
        return C2824o.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l = (L) obj;
        if (G7.j.a(this.f20128a, l.f20128a) && G7.j.a(a(), l.a())) {
            return true;
        }
        return false;
    }

    @Override // c8.g
    public final int f() {
        return this.b;
    }

    @Override // c8.g
    public final String g(int i9) {
        return String.valueOf(i9);
    }

    @Override // c8.g
    public final com.bumptech.glide.c getKind() {
        return c8.l.f5454e;
    }

    @Override // c8.g
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + (this.f20128a.hashCode() * 31);
    }

    @Override // c8.g
    public final List i(int i9) {
        if (i9 >= 0) {
            return C2824o.b;
        }
        StringBuilder p2 = Q7.n0.p(i9, "Illegal index ", ", ");
        p2.append(a());
        p2.append(" expects only non-negative indices");
        throw new IllegalArgumentException(p2.toString().toString());
    }

    @Override // c8.g
    public final c8.g j(int i9) {
        if (i9 >= 0) {
            return this.f20128a;
        }
        StringBuilder p2 = Q7.n0.p(i9, "Illegal index ", ", ");
        p2.append(a());
        p2.append(" expects only non-negative indices");
        throw new IllegalArgumentException(p2.toString().toString());
    }

    @Override // c8.g
    public final boolean k(int i9) {
        if (i9 >= 0) {
            return false;
        }
        StringBuilder p2 = Q7.n0.p(i9, "Illegal index ", ", ");
        p2.append(a());
        p2.append(" expects only non-negative indices");
        throw new IllegalArgumentException(p2.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f20128a + ')';
    }
}
