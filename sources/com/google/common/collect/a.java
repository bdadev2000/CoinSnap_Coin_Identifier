package com.google.common.collect;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class a extends q2 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f11896b;

    /* renamed from: c, reason: collision with root package name */
    public int f11897c;

    public a(int i10, int i11) {
        v8.u0.k(i11, i10);
        this.f11896b = i10;
        this.f11897c = i11;
    }

    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public abstract Object b(int i10);

    public final void c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11897c < this.f11896b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11897c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f11897c;
            this.f11897c = i10 + 1;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11897c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f11897c - 1;
            this.f11897c = i10;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11897c - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }
}
