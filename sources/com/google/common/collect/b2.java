package com.google.common.collect;

import java.util.Map;

/* loaded from: classes3.dex */
public final class b2 extends b1 {

    /* renamed from: f, reason: collision with root package name */
    public final transient u0 f11909f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f11910g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f11911h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f11912i;

    public b2(u0 u0Var, Object[] objArr, int i10) {
        this.f11909f = u0Var;
        this.f11910g = objArr;
        this.f11912i = i10;
    }

    @Override // com.google.common.collect.k0
    public final int b(Object[] objArr, int i10) {
        return a().b(objArr, i10);
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f11909f.get(key))) {
            return false;
        }
        return true;
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return true;
    }

    @Override // com.google.common.collect.k0
    /* renamed from: g */
    public final q2 iterator() {
        return a().listIterator(0);
    }

    @Override // com.google.common.collect.b1
    public final r0 n() {
        return new a2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11912i;
    }
}
