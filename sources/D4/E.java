package d4;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class E extends AbstractC2186n {

    /* renamed from: g, reason: collision with root package name */
    public static final E f19825g = new E(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f19826d;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f19827f;

    public E(Object[] objArr, int i9) {
        this.f19826d = objArr;
        this.f19827f = i9;
    }

    @Override // d4.AbstractC2186n, d4.AbstractC2180h
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f19826d;
        int i9 = this.f19827f;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // d4.AbstractC2180h
    public final Object[] c() {
        return this.f19826d;
    }

    @Override // d4.AbstractC2180h
    public final int d() {
        return this.f19827f;
    }

    @Override // d4.AbstractC2180h
    public final int e() {
        return 0;
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        C2.m.g(i9, this.f19827f);
        Object obj = this.f19826d[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19827f;
    }
}
