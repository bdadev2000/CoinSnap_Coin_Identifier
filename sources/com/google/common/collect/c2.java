package com.google.common.collect;

/* loaded from: classes3.dex */
public final class c2 extends b1 {

    /* renamed from: f, reason: collision with root package name */
    public final transient u0 f11926f;

    /* renamed from: g, reason: collision with root package name */
    public final transient r0 f11927g;

    public c2(u0 u0Var, d2 d2Var) {
        this.f11926f = u0Var;
        this.f11927g = d2Var;
    }

    @Override // com.google.common.collect.b1, com.google.common.collect.k0
    public final r0 a() {
        return this.f11927g;
    }

    @Override // com.google.common.collect.k0
    public final int b(Object[] objArr, int i10) {
        return this.f11927g.b(objArr, i10);
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f11926f.get(obj) != null;
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return true;
    }

    @Override // com.google.common.collect.k0
    /* renamed from: g */
    public final q2 iterator() {
        return this.f11927g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((e2) this.f11926f).f11939h;
    }
}
