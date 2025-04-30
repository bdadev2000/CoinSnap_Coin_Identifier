package x;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i implements Set {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2913a f24077c;

    public /* synthetic */ i(C2913a c2913a, int i9) {
        this.b = i9;
        this.f24077c = c2913a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                C2913a c2913a = this.f24077c;
                int d2 = c2913a.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    c2913a.g(entry.getKey(), entry.getValue());
                }
                if (d2 != c2913a.d()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.b) {
            case 0:
                this.f24077c.a();
                return;
            default:
                this.f24077c.a();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C2913a c2913a = this.f24077c;
                int e4 = c2913a.e(key);
                if (e4 < 0) {
                    return false;
                }
                Object b = c2913a.b(e4, 1);
                Object value = entry.getValue();
                if (b != value && (b == null || !b.equals(value))) {
                    return false;
                }
                return true;
            default:
                if (this.f24077c.e(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Map c9 = this.f24077c.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c9.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.b) {
            case 0:
                return C2913a.j(this, obj);
            default:
                return C2913a.j(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        switch (this.b) {
            case 0:
                C2913a c2913a = this.f24077c;
                int i9 = 0;
                for (int d2 = c2913a.d() - 1; d2 >= 0; d2--) {
                    Object b = c2913a.b(d2, 0);
                    Object b8 = c2913a.b(d2, 1);
                    if (b == null) {
                        hashCode = 0;
                    } else {
                        hashCode = b.hashCode();
                    }
                    if (b8 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = b8.hashCode();
                    }
                    i9 += hashCode ^ hashCode2;
                }
                return i9;
            default:
                C2913a c2913a2 = this.f24077c;
                int i10 = 0;
                for (int d9 = c2913a2.d() - 1; d9 >= 0; d9--) {
                    Object b9 = c2913a2.b(d9, 0);
                    if (b9 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = b9.hashCode();
                    }
                    i10 += hashCode3;
                }
                return i10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.b) {
            case 0:
                if (this.f24077c.d() == 0) {
                    return true;
                }
                return false;
            default:
                if (this.f24077c.d() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                return new j(this.f24077c);
            default:
                return new h(this.f24077c, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C2913a c2913a = this.f24077c;
                int e4 = c2913a.e(obj);
                if (e4 >= 0) {
                    c2913a.h(e4);
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c9 = this.f24077c.c();
                int size = c9.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c9.remove(it.next());
                }
                if (size != c9.size()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return C2913a.k(this.f24077c.c(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.b) {
            case 0:
                return this.f24077c.d();
            default:
                return this.f24077c.d();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f24077c.l(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C2913a c2913a = this.f24077c;
                int d2 = c2913a.d();
                Object[] objArr = new Object[d2];
                for (int i9 = 0; i9 < d2; i9++) {
                    objArr[i9] = c2913a.b(i9, 0);
                }
                return objArr;
        }
    }
}
