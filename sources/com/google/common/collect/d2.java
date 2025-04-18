package com.google.common.collect;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d2 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f11932d;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f11933f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f11934g;

    public d2(Object[] objArr, int i10, int i11) {
        this.f11932d = objArr;
        this.f11933f = i10;
        this.f11934g = i11;
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v8.u0.g(i10, this.f11934g);
        Object obj = this.f11932d[(i10 * 2) + this.f11933f];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11934g;
    }
}
