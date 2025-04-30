package e8;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class f0 implements c8.g, InterfaceC2236k {

    /* renamed from: a, reason: collision with root package name */
    public final c8.g f20163a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f20164c;

    public f0(c8.g gVar) {
        G7.j.e(gVar, "original");
        this.f20163a = gVar;
        this.b = gVar.a() + '?';
        this.f20164c = W.b(gVar);
    }

    @Override // c8.g
    public final String a() {
        return this.b;
    }

    @Override // e8.InterfaceC2236k
    public final Set b() {
        return this.f20164c;
    }

    @Override // c8.g
    public final boolean c() {
        return true;
    }

    @Override // c8.g
    public final int d(String str) {
        G7.j.e(str, "name");
        return this.f20163a.d(str);
    }

    @Override // c8.g
    public final List e() {
        return this.f20163a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        if (G7.j.a(this.f20163a, ((f0) obj).f20163a)) {
            return true;
        }
        return false;
    }

    @Override // c8.g
    public final int f() {
        return this.f20163a.f();
    }

    @Override // c8.g
    public final String g(int i9) {
        return this.f20163a.g(i9);
    }

    @Override // c8.g
    public final com.bumptech.glide.c getKind() {
        return this.f20163a.getKind();
    }

    @Override // c8.g
    public final boolean h() {
        return this.f20163a.h();
    }

    public final int hashCode() {
        return this.f20163a.hashCode() * 31;
    }

    @Override // c8.g
    public final List i(int i9) {
        return this.f20163a.i(i9);
    }

    @Override // c8.g
    public final c8.g j(int i9) {
        return this.f20163a.j(i9);
    }

    @Override // c8.g
    public final boolean k(int i9) {
        return this.f20163a.k(i9);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20163a);
        sb.append('?');
        return sb.toString();
    }
}
