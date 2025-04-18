package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g2 extends i1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g2 f11960j;

    /* renamed from: i, reason: collision with root package name */
    public final transient r0 f11961i;

    static {
        n0 n0Var = r0.f12026c;
        f11960j = new g2(z1.f12062g, x1.f12053b);
    }

    public g2(r0 r0Var, Comparator comparator) {
        super(comparator);
        this.f11961i = r0Var;
    }

    @Override // com.google.common.collect.b1, com.google.common.collect.k0
    public final r0 a() {
        return this.f11961i;
    }

    @Override // com.google.common.collect.k0
    public final int b(Object[] objArr, int i10) {
        return this.f11961i.b(objArr, i10);
    }

    @Override // com.google.common.collect.k0
    public final Object[] c() {
        return this.f11961i.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int w10 = w(obj, true);
        if (w10 == size()) {
            return null;
        }
        return this.f11961i.get(w10);
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f11961i, obj, this.f11974f) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof w1) {
            collection = ((w1) collection).j();
        }
        Comparator comparator = this.f11974f;
        if (a6.k.A(collection, comparator) && collection.size() > 1) {
            q2 it = iterator();
            Iterator it2 = collection.iterator();
            a aVar = (a) it;
            if (!aVar.hasNext()) {
                return false;
            }
            Object next = it2.next();
            Object next2 = aVar.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare < 0) {
                        if (!aVar.hasNext()) {
                            return false;
                        }
                        next2 = aVar.next();
                    } else if (compare == 0) {
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else if (compare > 0) {
                        break;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    @Override // com.google.common.collect.k0
    public final int d() {
        return this.f11961i.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f11961i.r().listIterator(0);
    }

    @Override // com.google.common.collect.k0
    public final int e() {
        return this.f11961i.e();
    }

    @Override // com.google.common.collect.b1, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f11974f;
        if (a6.k.A(set, comparator)) {
            Iterator it = set.iterator();
            try {
                q2 it2 = iterator();
                do {
                    a aVar = (a) it2;
                    if (!aVar.hasNext()) {
                        return true;
                    }
                    next = aVar.next();
                    next2 = it.next();
                    if (next2 == null) {
                        break;
                    }
                } while (comparator.compare(next, next2) == 0);
                return false;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return this.f11961i.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f11961i.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int v10 = v(obj, true) - 1;
        if (v10 == -1) {
            return null;
        }
        return this.f11961i.get(v10);
    }

    @Override // com.google.common.collect.k0
    /* renamed from: g */
    public final q2 iterator() {
        return this.f11961i.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int w10 = w(obj, false);
        if (w10 == size()) {
            return null;
        }
        return this.f11961i.get(w10);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.f11961i.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int v10 = v(obj, false) - 1;
        if (v10 == -1) {
            return null;
        }
        return this.f11961i.get(v10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11961i.size();
    }

    @Override // com.google.common.collect.i1
    public final g2 t(Object obj, boolean z10) {
        return u(w(obj, z10), size());
    }

    public final g2 u(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        Comparator comparator = this.f11974f;
        if (i10 < i11) {
            return new g2(this.f11961i.subList(i10, i11), comparator);
        }
        return i1.r(comparator);
    }

    public final int v(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f11961i, obj, this.f11974f);
        if (binarySearch >= 0) {
            if (z10) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int w(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f11961i, obj, this.f11974f);
        if (binarySearch >= 0) {
            if (!z10) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }
}
