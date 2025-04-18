package f0;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i extends e0.h {

    /* renamed from: a, reason: collision with root package name */
    public final g f30444a;

    public i(g gVar) {
        p0.a.s(gVar, "backing");
        this.f30444a = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        p0.a.s(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // e0.h
    public final int b() {
        return this.f30444a.f30437j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f30444a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f30444a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f30444a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        g gVar = this.f30444a;
        gVar.getClass();
        return new d(gVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        g gVar = this.f30444a;
        gVar.c();
        int i2 = gVar.i(obj);
        if (i2 < 0) {
            return false;
        }
        gVar.l(i2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        p0.a.s(collection, "elements");
        this.f30444a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        p0.a.s(collection, "elements");
        this.f30444a.c();
        return super.retainAll(collection);
    }
}
