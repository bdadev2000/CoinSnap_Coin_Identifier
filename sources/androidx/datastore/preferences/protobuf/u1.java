package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class u1 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final ListIterator f1472b;

    public u1(w1 w1Var, int i10) {
        this.f1472b = w1Var.f1477b.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1472b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1472b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f1472b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1472b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f1472b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1472b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
