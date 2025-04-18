package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public class l2 extends AbstractCollection implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f11999b;

    /* renamed from: c, reason: collision with root package name */
    public final ra.j f12000c;

    public l2(Set set, ra.j jVar) {
        this.f11999b = set;
        this.f12000c = jVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        v8.u0.f(this.f12000c.apply(obj));
        return this.f11999b.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            v8.u0.f(this.f12000c.apply(it.next()));
        }
        return this.f11999b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        Collection collection = this.f11999b;
        boolean z10 = collection instanceof RandomAccess;
        ra.j jVar = this.f12000c;
        if (z10 && (collection instanceof List)) {
            List list = (List) collection;
            jVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!jVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            c6.k.z(list, jVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            c6.k.z(list, jVar, i10, i11);
                            return;
                        }
                    }
                    i10++;
                }
            }
            list.subList(i10, list.size()).clear();
            return;
        }
        Iterator it = collection.iterator();
        jVar.getClass();
        while (it.hasNext()) {
            if (jVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        boolean z10;
        Collection collection = this.f11999b;
        collection.getClass();
        try {
            z10 = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return this.f12000c.apply(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return c6.c.k(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.f11999b.iterator();
        ra.j jVar = this.f12000c;
        v8.u0.j(jVar, "predicate");
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (jVar.apply(it.next())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            z10 = true;
        }
        return true ^ z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.f11999b.iterator();
        it.getClass();
        ra.j jVar = this.f12000c;
        jVar.getClass();
        return new j1(it, jVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        return contains(obj) && this.f11999b.remove(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return c6.c.r(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f11999b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f12000c.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f11999b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f12000c.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.f11999b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f12000c.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        return v8.u0.U(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        return v8.u0.U(iterator()).toArray(objArr);
    }
}
