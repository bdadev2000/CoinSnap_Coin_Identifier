package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class oi extends ib {

    /* renamed from: i, reason: collision with root package name */
    static final oi f25884i = new oi(new Object[0], 0, null, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f25885c;
    final transient Object[] d;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f25886f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f25887g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f25888h;

    public oi(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f25885c = objArr;
        this.d = objArr2;
        this.f25886f = i3;
        this.f25887g = i2;
        this.f25888h = i4;
    }

    @Override // com.applovin.impl.cb
    public int a(Object[] objArr, int i2) {
        System.arraycopy(this.f25885c, 0, objArr, i2, this.f25888h);
        return i2 + this.f25888h;
    }

    @Override // com.applovin.impl.cb
    public Object[] b() {
        return this.f25885c;
    }

    @Override // com.applovin.impl.cb
    public int c() {
        return this.f25888h;
    }

    @Override // com.applovin.impl.cb, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.d;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = ka.a(obj);
        while (true) {
            int i2 = a2 & this.f25886f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i2 + 1;
        }
    }

    @Override // com.applovin.impl.cb
    public int d() {
        return 0;
    }

    @Override // com.applovin.impl.cb
    public boolean e() {
        return false;
    }

    @Override // com.applovin.impl.ib
    public eb f() {
        return eb.b(this.f25885c, this.f25888h);
    }

    @Override // com.applovin.impl.ib
    public boolean g() {
        return true;
    }

    @Override // com.applovin.impl.ib, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f25887g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public pp iterator() {
        return a().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f25888h;
    }
}
