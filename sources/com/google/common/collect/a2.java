package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a2 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f11902d;

    public a2(b2 b2Var) {
        this.f11902d = b2Var;
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b2 b2Var = this.f11902d;
        v8.u0.g(i10, b2Var.f11912i);
        int i11 = i10 * 2;
        int i12 = b2Var.f11911h;
        Object[] objArr = b2Var.f11910g;
        Object obj = objArr[i12 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11902d.f11912i;
    }
}
