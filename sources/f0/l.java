package f0;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class l extends e0.k implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final l f30448b;

    /* renamed from: a, reason: collision with root package name */
    public final g f30449a;

    static {
        g gVar = g.f30429o;
        f30448b = new l(g.f30429o);
    }

    public l(g gVar) {
        p0.a.s(gVar, "backing");
        this.f30449a = gVar;
    }

    private final Object writeReplace() {
        if (this.f30449a.f30441n) {
            return new j(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f30449a.b(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        p0.a.s(collection, "elements");
        this.f30449a.c();
        return super.addAll(collection);
    }

    @Override // e0.k
    public final int b() {
        return this.f30449a.f30437j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f30449a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30449a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f30449a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f30449a;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f30449a;
        gVar.c();
        int g2 = gVar.g(obj);
        if (g2 >= 0) {
            gVar.l(g2);
            if (g2 >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        p0.a.s(collection, "elements");
        this.f30449a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        p0.a.s(collection, "elements");
        this.f30449a.c();
        return super.retainAll(collection);
    }

    public l() {
        this(new g());
    }
}
