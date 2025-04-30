package e8;

import java.util.List;
import u7.C2824o;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class E implements c8.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f20118a;
    public final c8.g b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.g f20119c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20120d = 2;

    public E(String str, c8.g gVar, c8.g gVar2) {
        this.f20118a = str;
        this.b = gVar;
        this.f20119c = gVar2;
    }

    @Override // c8.g
    public final String a() {
        return this.f20118a;
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
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // c8.g
    public final List e() {
        return C2824o.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e4 = (E) obj;
        if (G7.j.a(this.f20118a, e4.f20118a) && G7.j.a(this.b, e4.b) && G7.j.a(this.f20119c, e4.f20119c)) {
            return true;
        }
        return false;
    }

    @Override // c8.g
    public final int f() {
        return this.f20120d;
    }

    @Override // c8.g
    public final String g(int i9) {
        return String.valueOf(i9);
    }

    @Override // c8.g
    public final com.bumptech.glide.c getKind() {
        return c8.l.f5455f;
    }

    @Override // c8.g
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f20119c.hashCode() + ((this.b.hashCode() + (this.f20118a.hashCode() * 31)) * 31);
    }

    @Override // c8.g
    public final List i(int i9) {
        if (i9 >= 0) {
            return C2824o.b;
        }
        throw new IllegalArgumentException(AbstractC2914a.h(Q7.n0.p(i9, "Illegal index ", ", "), this.f20118a, " expects only non-negative indices").toString());
    }

    @Override // c8.g
    public final c8.g j(int i9) {
        if (i9 >= 0) {
            int i10 = i9 % 2;
            if (i10 != 0) {
                if (i10 == 1) {
                    return this.f20119c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.b;
        }
        throw new IllegalArgumentException(AbstractC2914a.h(Q7.n0.p(i9, "Illegal index ", ", "), this.f20118a, " expects only non-negative indices").toString());
    }

    @Override // c8.g
    public final boolean k(int i9) {
        if (i9 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC2914a.h(Q7.n0.p(i9, "Illegal index ", ", "), this.f20118a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f20118a + '(' + this.b + ", " + this.f20119c + ')';
    }
}
