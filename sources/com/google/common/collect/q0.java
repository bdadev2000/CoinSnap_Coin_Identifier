package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class q0 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f12018d;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f12019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f12020g;

    public q0(r0 r0Var, int i10, int i11) {
        this.f12020g = r0Var;
        this.f12018d = i10;
        this.f12019f = i11;
    }

    @Override // com.google.common.collect.k0
    public final Object[] c() {
        return this.f12020g.c();
    }

    @Override // com.google.common.collect.k0
    public final int d() {
        return this.f12020g.e() + this.f12018d + this.f12019f;
    }

    @Override // com.google.common.collect.k0
    public final int e() {
        return this.f12020g.e() + this.f12018d;
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v8.u0.g(i10, this.f12019f);
        return this.f12020g.get(i10 + this.f12018d);
    }

    @Override // com.google.common.collect.r0, com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.r0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.r0, java.util.List
    /* renamed from: s */
    public final r0 subList(int i10, int i11) {
        v8.u0.l(i10, i11, this.f12019f);
        int i12 = this.f12018d;
        return this.f12020g.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12019f;
    }

    @Override // com.google.common.collect.r0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
