package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class sg implements Set, RandomAccess {
    private final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f8027b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (!isEmpty() && comparable.compareTo(a()) <= 0) {
            this.a.add(b(comparable), comparable);
        } else {
            this.a.add(comparable);
        }
        return this.f8027b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public int b(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = a(binarySearch);
        while (binarySearch >= 0 && a == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public int c(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = a(binarySearch);
        while (binarySearch < size() && a == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.a.clear();
        this.f8027b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f8027b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f8027b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable != null && contains(comparable)) {
            return b(comparable);
        }
        return -1;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int d10 = d((Comparable) obj);
        if (d10 == -1) {
            return false;
        }
        this.a.remove(d10);
        return this.f8027b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                if (z10 || remove(obj)) {
                    z10 = true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.a.get(size);
            if (!collection.contains(comparable)) {
                this.a.remove(size);
                this.f8027b.remove(comparable);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    public Comparable b(int i10) {
        Comparable comparable = (Comparable) this.a.remove(i10);
        this.f8027b.remove(comparable);
        return comparable;
    }

    public Comparable a(int i10) {
        return (Comparable) this.a.get(i10);
    }

    public Comparable a() {
        return (Comparable) this.a.get(size() - 1);
    }

    public void a(int i10, Comparable comparable) {
        this.f8027b.remove((Comparable) this.a.get(i10));
        this.a.set(i10, comparable);
        this.f8027b.add(comparable);
    }
}
