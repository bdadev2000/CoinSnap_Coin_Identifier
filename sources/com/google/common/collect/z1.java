package com.google.common.collect;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class z1 extends r0 {

    /* renamed from: g, reason: collision with root package name */
    public static final z1 f12062g = new z1(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f12063d;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f12064f;

    public z1(Object[] objArr, int i10) {
        this.f12063d = objArr;
        this.f12064f = i10;
    }

    @Override // com.google.common.collect.r0, com.google.common.collect.k0
    public final int b(Object[] objArr, int i10) {
        Object[] objArr2 = this.f12063d;
        int i11 = this.f12064f;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.common.collect.k0
    public final Object[] c() {
        return this.f12063d;
    }

    @Override // com.google.common.collect.k0
    public final int d() {
        return this.f12064f;
    }

    @Override // com.google.common.collect.k0
    public final int e() {
        return 0;
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v8.u0.g(i10, this.f12064f);
        Object obj = this.f12063d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12064f;
    }
}
