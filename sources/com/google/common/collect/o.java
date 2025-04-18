package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class o extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final Object f12008b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f12009c;

    /* renamed from: d, reason: collision with root package name */
    public final o f12010d;

    /* renamed from: f, reason: collision with root package name */
    public final Collection f12011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f12012g;

    public o(r rVar, Object obj, Collection collection, o oVar) {
        Collection collection2;
        this.f12012g = rVar;
        this.f12008b = obj;
        this.f12009c = collection;
        this.f12010d = oVar;
        if (oVar == null) {
            collection2 = null;
        } else {
            collection2 = oVar.f12009c;
        }
        this.f12011f = collection2;
    }

    public final void a() {
        o oVar = this.f12010d;
        if (oVar != null) {
            oVar.a();
        } else {
            this.f12012g.f12024f.put(this.f12008b, this.f12009c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.f12009c.isEmpty();
        boolean add = this.f12009c.add(obj);
        if (add) {
            this.f12012g.f12025g++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f12009c.addAll(collection);
        if (addAll) {
            this.f12012g.f12025g += this.f12009c.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        o oVar = this.f12010d;
        if (oVar != null) {
            oVar.b();
            if (oVar.f12009c != this.f12011f) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f12009c.isEmpty() && (collection = (Collection) this.f12012g.f12024f.get(this.f12008b)) != null) {
            this.f12009c = collection;
        }
    }

    public final void c() {
        o oVar = this.f12010d;
        if (oVar != null) {
            oVar.c();
        } else if (this.f12009c.isEmpty()) {
            this.f12012g.f12024f.remove(this.f12008b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f12009c.clear();
        this.f12012g.f12025g -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.f12009c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.f12009c.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f12009c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.f12009c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new f(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.f12009c.remove(obj);
        if (remove) {
            r rVar = this.f12012g;
            rVar.f12025g--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f12009c.removeAll(collection);
        if (removeAll) {
            this.f12012g.f12025g += this.f12009c.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f12009c.retainAll(collection);
        if (retainAll) {
            this.f12012g.f12025g += this.f12009c.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.f12009c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f12009c.toString();
    }
}
