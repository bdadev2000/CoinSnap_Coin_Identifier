package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ki extends eb {

    /* renamed from: i, reason: collision with root package name */
    static final ki f8693i = new ki(new Object[0], 0, null, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f8694c;

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f8695d;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f8696f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f8697g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f8698h;

    public ki(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        this.f8694c = objArr;
        this.f8695d = objArr2;
        this.f8696f = i10;
        this.f8697g = i9;
        this.f8698h = i11;
    }

    @Override // com.applovin.impl.ya
    public int a(Object[] objArr, int i9) {
        System.arraycopy(this.f8694c, 0, objArr, i9, this.f8698h);
        return i9 + this.f8698h;
    }

    @Override // com.applovin.impl.ya
    public Object[] b() {
        return this.f8694c;
    }

    @Override // com.applovin.impl.ya
    public int c() {
        return this.f8698h;
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.f8695d;
        if (obj == null || objArr == null) {
            return false;
        }
        int a6 = ia.a(obj);
        while (true) {
            int i9 = a6 & this.f8696f;
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a6 = i9 + 1;
        }
    }

    @Override // com.applovin.impl.ya
    public int d() {
        return 0;
    }

    @Override // com.applovin.impl.ya
    public boolean e() {
        return false;
    }

    @Override // com.applovin.impl.eb
    public ab f() {
        return ab.b(this.f8694c, this.f8698h);
    }

    @Override // com.applovin.impl.eb
    public boolean g() {
        return true;
    }

    @Override // com.applovin.impl.eb, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f8697g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public qp iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f8698h;
    }
}
