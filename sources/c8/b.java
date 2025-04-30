package c8;

import java.util.List;

/* loaded from: classes3.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f5427a;
    public final M7.b b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5428c;

    public b(h hVar, M7.b bVar) {
        G7.j.e(bVar, "kClass");
        this.f5427a = hVar;
        this.b = bVar;
        this.f5428c = hVar.f5439a + '<' + ((G7.e) bVar).b() + '>';
    }

    @Override // c8.g
    public final String a() {
        return this.f5428c;
    }

    @Override // c8.g
    public final boolean c() {
        return this.f5427a.c();
    }

    @Override // c8.g
    public final int d(String str) {
        G7.j.e(str, "name");
        return this.f5427a.d(str);
    }

    @Override // c8.g
    public final List e() {
        return this.f5427a.e();
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar == null || !G7.j.a(this.f5427a, bVar.f5427a) || !G7.j.a(bVar.b, this.b)) {
            return false;
        }
        return true;
    }

    @Override // c8.g
    public final int f() {
        return this.f5427a.f();
    }

    @Override // c8.g
    public final String g(int i9) {
        return this.f5427a.g(i9);
    }

    @Override // c8.g
    public final com.bumptech.glide.c getKind() {
        return this.f5427a.getKind();
    }

    @Override // c8.g
    public final boolean h() {
        return this.f5427a.h();
    }

    public final int hashCode() {
        return this.f5428c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // c8.g
    public final List i(int i9) {
        return this.f5427a.i(i9);
    }

    @Override // c8.g
    public final g j(int i9) {
        return this.f5427a.j(i9);
    }

    @Override // c8.g
    public final boolean k(int i9) {
        return this.f5427a.k(i9);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.f5427a + ')';
    }
}
