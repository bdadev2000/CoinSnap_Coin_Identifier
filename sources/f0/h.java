package f0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h extends e0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30442a;

    /* renamed from: b, reason: collision with root package name */
    public final g f30443b;

    public h(g gVar, int i2) {
        this.f30442a = i2;
        if (i2 != 1) {
            p0.a.s(gVar, "backing");
            this.f30443b = gVar;
        } else {
            p0.a.s(gVar, "backing");
            this.f30443b = gVar;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f30442a) {
            case 0:
                p0.a.s((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f30442a) {
            case 0:
                p0.a.s(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                p0.a.s(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // e0.k
    public final int b() {
        int i2 = this.f30442a;
        g gVar = this.f30443b;
        switch (i2) {
            case 0:
                return gVar.f30437j;
            default:
                return gVar.f30437j;
        }
    }

    public final boolean c(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        p0.a.s(entry, "element");
        return this.f30443b.e(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f30442a;
        g gVar = this.f30443b;
        switch (i2) {
            case 0:
                gVar.clear();
                return;
            default:
                gVar.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f30442a) {
            case 0:
                return c(obj);
            default:
                return this.f30443b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.f30442a) {
            case 0:
                p0.a.s(collection, "elements");
                return this.f30443b.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    public final boolean d(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        p0.a.s(entry, "element");
        g gVar = this.f30443b;
        gVar.getClass();
        gVar.c();
        int g2 = gVar.g(entry.getKey());
        if (g2 < 0) {
            return false;
        }
        Object[] objArr = gVar.f30431b;
        p0.a.p(objArr);
        if (!p0.a.g(objArr[g2], entry.getValue())) {
            return false;
        }
        gVar.l(g2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i2 = this.f30442a;
        g gVar = this.f30443b;
        switch (i2) {
            case 0:
                return gVar.isEmpty();
            default:
                return gVar.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i2 = this.f30442a;
        g gVar = this.f30443b;
        switch (i2) {
            case 0:
                gVar.getClass();
                return new d(gVar, 0);
            default:
                gVar.getClass();
                return new d(gVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f30442a) {
            case 0:
                return d(obj);
            default:
                g gVar = this.f30443b;
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
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i2 = this.f30442a;
        g gVar = this.f30443b;
        switch (i2) {
            case 0:
                p0.a.s(collection, "elements");
                gVar.c();
                return super.removeAll(collection);
            default:
                p0.a.s(collection, "elements");
                gVar.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i2 = this.f30442a;
        g gVar = this.f30443b;
        switch (i2) {
            case 0:
                p0.a.s(collection, "elements");
                gVar.c();
                return super.retainAll(collection);
            default:
                p0.a.s(collection, "elements");
                gVar.c();
                return super.retainAll(collection);
        }
    }
}
