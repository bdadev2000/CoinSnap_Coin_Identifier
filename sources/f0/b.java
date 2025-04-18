package f0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class b implements ListIterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f30414a;

    /* renamed from: b, reason: collision with root package name */
    public int f30415b;

    /* renamed from: c, reason: collision with root package name */
    public int f30416c;
    public int d;

    public b(c cVar, int i2) {
        int i3;
        p0.a.s(cVar, "list");
        this.f30414a = cVar;
        this.f30415b = i2;
        this.f30416c = -1;
        i3 = ((AbstractList) cVar).modCount;
        this.d = i3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        b();
        int i3 = this.f30415b;
        this.f30415b = i3 + 1;
        c cVar = this.f30414a;
        cVar.add(i3, obj);
        this.f30416c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.d = i2;
    }

    public final void b() {
        int i2;
        i2 = ((AbstractList) this.f30414a).modCount;
        if (i2 != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f30415b < this.f30414a.f30420c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30415b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        int i2 = this.f30415b;
        c cVar = this.f30414a;
        if (i2 >= cVar.f30420c) {
            throw new NoSuchElementException();
        }
        this.f30415b = i2 + 1;
        this.f30416c = i2;
        return cVar.f30418a[cVar.f30419b + i2];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30415b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        int i2 = this.f30415b;
        if (i2 <= 0) {
            throw new NoSuchElementException();
        }
        int i3 = i2 - 1;
        this.f30415b = i3;
        this.f30416c = i3;
        c cVar = this.f30414a;
        return cVar.f30418a[cVar.f30419b + i3];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30415b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2;
        b();
        int i3 = this.f30416c;
        if (i3 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        c cVar = this.f30414a;
        cVar.c(i3);
        this.f30415b = this.f30416c;
        this.f30416c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.d = i2;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i2 = this.f30416c;
        if (i2 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f30414a.set(i2, obj);
    }
}
