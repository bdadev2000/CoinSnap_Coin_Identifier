package e8;

import java.util.List;
import u7.C2824o;

/* loaded from: classes3.dex */
public final class c0 implements c8.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f20157a;
    public final c8.f b;

    public c0(String str, c8.f fVar) {
        G7.j.e(fVar, "kind");
        this.f20157a = str;
        this.b = fVar;
    }

    @Override // c8.g
    public final String a() {
        return this.f20157a;
    }

    @Override // c8.g
    public final boolean c() {
        return false;
    }

    @Override // c8.g
    public final int d(String str) {
        G7.j.e(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // c8.g
    public final List e() {
        return C2824o.b;
    }

    @Override // c8.g
    public final int f() {
        return 0;
    }

    @Override // c8.g
    public final String g(int i9) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // c8.g
    public final com.bumptech.glide.c getKind() {
        return this.b;
    }

    @Override // c8.g
    public final boolean h() {
        return false;
    }

    @Override // c8.g
    public final List i(int i9) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // c8.g
    public final c8.g j(int i9) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // c8.g
    public final boolean k(int i9) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return com.applovin.impl.L.k(new StringBuilder("PrimitiveDescriptor("), this.f20157a, ')');
    }
}
