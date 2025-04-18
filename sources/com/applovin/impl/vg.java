package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public class vg implements Set, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f27571a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f27572b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (!isEmpty() && comparable.compareTo(a()) <= 0) {
            this.f27571a.add(b(comparable), comparable);
        } else {
            this.f27571a.add(comparable);
        }
        return this.f27572b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    public int b(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f27571a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a2 = a(binarySearch);
        while (binarySearch >= 0 && a2 == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public int c(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f27571a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a2 = a(binarySearch);
        while (binarySearch < size() && a2 == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f27571a.clear();
        this.f27572b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27572b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f27572b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f27571a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f27571a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int d = d((Comparable) obj);
        if (d == -1) {
            return false;
        }
        this.f27571a.remove(d);
        return this.f27572b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        while (true) {
            for (Object obj : collection) {
                boolean z2 = z2 || remove(obj);
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f27571a.get(size);
            if (!collection.contains(comparable)) {
                this.f27571a.remove(size);
                this.f27572b.remove(comparable);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f27571a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f27571a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f27571a.toArray(objArr);
    }

    public Comparable b(int i2) {
        Comparable comparable = (Comparable) this.f27571a.remove(i2);
        this.f27572b.remove(comparable);
        return comparable;
    }

    public Comparable a(int i2) {
        return (Comparable) this.f27571a.get(i2);
    }

    public Comparable a() {
        return (Comparable) this.f27571a.get(size() - 1);
    }

    public void a(int i2, Comparable comparable) {
        this.f27572b.remove((Comparable) this.f27571a.get(i2));
        this.f27571a.set(i2, comparable);
        this.f27572b.add(comparable);
    }
}
