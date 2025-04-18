package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ki extends eb {

    /* renamed from: i, reason: collision with root package name */
    static final ki f5711i = new ki(new Object[0], 0, null, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f5712c;

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f5713d;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f5714f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f5715g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f5716h;

    public ki(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f5712c = objArr;
        this.f5713d = objArr2;
        this.f5714f = i11;
        this.f5715g = i10;
        this.f5716h = i12;
    }

    @Override // com.applovin.impl.ya
    public int a(Object[] objArr, int i10) {
        System.arraycopy(this.f5712c, 0, objArr, i10, this.f5716h);
        return i10 + this.f5716h;
    }

    @Override // com.applovin.impl.ya
    public Object[] b() {
        return this.f5712c;
    }

    @Override // com.applovin.impl.ya
    public int c() {
        return this.f5716h;
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.f5713d;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = ia.a(obj);
        while (true) {
            int i10 = a & this.f5714f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i10 + 1;
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
        return ab.b(this.f5712c, this.f5716h);
    }

    @Override // com.applovin.impl.eb
    public boolean g() {
        return true;
    }

    @Override // com.applovin.impl.eb, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f5715g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public qp iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f5716h;
    }
}
