package x;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Collection {
    public final /* synthetic */ C2913a b;

    public k(C2913a c2913a) {
        this.b = c2913a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.b.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.b.f(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.b.d() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2913a c2913a = this.b;
        int f9 = c2913a.f(obj);
        if (f9 >= 0) {
            c2913a.h(f9);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2913a c2913a = this.b;
        int d2 = c2913a.d();
        int i9 = 0;
        boolean z8 = false;
        while (i9 < d2) {
            if (collection.contains(c2913a.b(i9, 1))) {
                c2913a.h(i9);
                i9--;
                d2--;
                z8 = true;
            }
            i9++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2913a c2913a = this.b;
        int d2 = c2913a.d();
        int i9 = 0;
        boolean z8 = false;
        while (i9 < d2) {
            if (!collection.contains(c2913a.b(i9, 1))) {
                c2913a.h(i9);
                i9--;
                d2--;
                z8 = true;
            }
            i9++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.b.l(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2913a c2913a = this.b;
        int d2 = c2913a.d();
        Object[] objArr = new Object[d2];
        for (int i9 = 0; i9 < d2; i9++) {
            objArr[i9] = c2913a.b(i9, 1);
        }
        return objArr;
    }
}
