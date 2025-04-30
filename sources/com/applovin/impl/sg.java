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

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f11191a = new ArrayList();
    private final HashSet b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (!isEmpty() && comparable.compareTo(a()) <= 0) {
            this.f11191a.add(b(comparable), comparable);
        } else {
            this.f11191a.add(comparable);
        }
        return this.b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z8 = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z8) {
                    z8 = true;
                }
            }
            return z8;
        }
    }

    public int b(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f11191a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a6 = a(binarySearch);
        while (binarySearch >= 0 && a6 == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public int c(Comparable comparable) {
        int binarySearch = Collections.binarySearch(this.f11191a, comparable);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a6 = a(binarySearch);
        while (binarySearch < size() && a6 == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f11191a.clear();
        this.b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable != null && contains(comparable)) {
            return b(comparable);
        }
        return -1;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f11191a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f11191a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int d2 = d((Comparable) obj);
        if (d2 == -1) {
            return false;
        }
        this.f11191a.remove(d2);
        return this.b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        while (true) {
            boolean z8 = false;
            for (Object obj : collection) {
                if (z8 || remove(obj)) {
                    z8 = true;
                }
            }
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z8 = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f11191a.get(size);
            if (!collection.contains(comparable)) {
                this.f11191a.remove(size);
                this.b.remove(comparable);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f11191a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f11191a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f11191a.toArray(objArr);
    }

    public Comparable b(int i9) {
        Comparable comparable = (Comparable) this.f11191a.remove(i9);
        this.b.remove(comparable);
        return comparable;
    }

    public Comparable a(int i9) {
        return (Comparable) this.f11191a.get(i9);
    }

    public Comparable a() {
        return (Comparable) this.f11191a.get(size() - 1);
    }

    public void a(int i9, Comparable comparable) {
        this.b.remove((Comparable) this.f11191a.get(i9));
        this.f11191a.set(i9, comparable);
        this.b.add(comparable);
    }
}
