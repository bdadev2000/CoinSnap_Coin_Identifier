package com.google.common.collect;

/* loaded from: classes3.dex */
public final class f2 extends b1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object[] f11946k;

    /* renamed from: l, reason: collision with root package name */
    public static final f2 f11947l;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f11948f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f11949g;

    /* renamed from: h, reason: collision with root package name */
    public final transient Object[] f11950h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f11951i;

    /* renamed from: j, reason: collision with root package name */
    public final transient int f11952j;

    static {
        Object[] objArr = new Object[0];
        f11946k = objArr;
        f11947l = new f2(objArr, 0, objArr, 0, 0);
    }

    public f2(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f11948f = objArr;
        this.f11949g = i10;
        this.f11950h = objArr2;
        this.f11951i = i11;
        this.f11952j = i12;
    }

    @Override // com.google.common.collect.k0
    public final int b(Object[] objArr, int i10) {
        Object[] objArr2 = this.f11948f;
        int i11 = this.f11952j;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.common.collect.k0
    public final Object[] c() {
        return this.f11948f;
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f11950h;
            if (objArr.length != 0) {
                int L = a6.k.L(obj);
                while (true) {
                    int i10 = L & this.f11951i;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    L = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.k0
    public final int d() {
        return this.f11952j;
    }

    @Override // com.google.common.collect.k0
    public final int e() {
        return 0;
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return false;
    }

    @Override // com.google.common.collect.k0
    /* renamed from: g */
    public final q2 iterator() {
        return a().listIterator(0);
    }

    @Override // com.google.common.collect.b1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11949g;
    }

    @Override // com.google.common.collect.b1
    public final r0 n() {
        return r0.h(this.f11952j, this.f11948f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11952j;
    }
}
