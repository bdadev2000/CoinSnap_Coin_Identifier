package n1;

import java.util.Set;

/* loaded from: classes3.dex */
public final class d1 implements l1.f, i {

    /* renamed from: a, reason: collision with root package name */
    public final l1.f f31062a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31063b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f31064c;

    public d1(l1.f fVar) {
        p0.a.s(fVar, "original");
        this.f31062a = fVar;
        this.f31063b = fVar.g() + '?';
        this.f31064c = v0.a(fVar);
    }

    @Override // n1.i
    public final Set a() {
        return this.f31064c;
    }

    @Override // l1.f
    public final boolean b() {
        return true;
    }

    @Override // l1.f
    public final l1.l c() {
        return this.f31062a.c();
    }

    @Override // l1.f
    public final int d() {
        return this.f31062a.d();
    }

    @Override // l1.f
    public final String e(int i2) {
        return this.f31062a.e(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1) {
            return p0.a.g(this.f31062a, ((d1) obj).f31062a);
        }
        return false;
    }

    @Override // l1.f
    public final l1.f f(int i2) {
        return this.f31062a.f(i2);
    }

    @Override // l1.f
    public final String g() {
        return this.f31063b;
    }

    @Override // l1.f
    public final boolean h(int i2) {
        return this.f31062a.h(i2);
    }

    public final int hashCode() {
        return this.f31062a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31062a);
        sb.append('?');
        return sb.toString();
    }
}
