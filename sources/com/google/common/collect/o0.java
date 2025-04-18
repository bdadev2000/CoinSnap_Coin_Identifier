package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class o0 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient r0 f12013d;

    public o0(r0 r0Var) {
        this.f12013d = r0Var;
    }

    @Override // com.google.common.collect.r0, com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12013d.contains(obj);
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return this.f12013d.f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v8.u0.g(i10, size());
        return this.f12013d.get((size() - 1) - i10);
    }

    @Override // com.google.common.collect.r0, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f12013d.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (size() - 1) - lastIndexOf;
    }

    @Override // com.google.common.collect.r0, com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.r0, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f12013d.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (size() - 1) - indexOf;
    }

    @Override // com.google.common.collect.r0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.r0
    public final r0 r() {
        return this.f12013d;
    }

    @Override // com.google.common.collect.r0, java.util.List
    /* renamed from: s */
    public final r0 subList(int i10, int i11) {
        v8.u0.l(i10, i11, size());
        return this.f12013d.subList(size() - i11, size() - i10).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12013d.size();
    }

    @Override // com.google.common.collect.r0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
