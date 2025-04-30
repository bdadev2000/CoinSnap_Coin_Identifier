package d4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class L extends z {

    /* renamed from: i, reason: collision with root package name */
    public static final L f19848i;

    /* renamed from: h, reason: collision with root package name */
    public final transient AbstractC2186n f19849h;

    static {
        C2182j c2182j = AbstractC2186n.f19876c;
        f19848i = new L(E.f19825g, C.b);
    }

    public L(AbstractC2186n abstractC2186n, Comparator comparator) {
        super(comparator);
        this.f19849h = abstractC2186n;
    }

    @Override // d4.AbstractC2180h
    public final int b(Object[] objArr) {
        return this.f19849h.b(objArr);
    }

    @Override // d4.AbstractC2180h
    public final Object[] c() {
        return this.f19849h.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int o3 = o(obj, true);
        AbstractC2186n abstractC2186n = this.f19849h;
        if (o3 == abstractC2186n.size()) {
            return null;
        }
        return abstractC2186n.get(o3);
    }

    @Override // d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (Collections.binarySearch(this.f19849h, obj, this.f19889f) < 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof B) {
            collection = ((B) collection).i();
        }
        Comparator comparator = this.f19889f;
        if (android.support.v4.media.session.a.t(comparator, collection) && collection.size() > 1) {
            O it = iterator();
            Iterator it2 = collection.iterator();
            C2182j c2182j = (C2182j) it;
            if (!c2182j.hasNext()) {
                return false;
            }
            Object next = it2.next();
            Object next2 = c2182j.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare < 0) {
                        if (!c2182j.hasNext()) {
                            return false;
                        }
                        next2 = c2182j.next();
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

    @Override // d4.AbstractC2180h
    public final int d() {
        return this.f19849h.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f19849h.k().listIterator(0);
    }

    @Override // d4.AbstractC2180h
    public final int e() {
        return this.f19849h.e();
    }

    @Override // d4.u, java.util.Collection, java.util.Set
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
        if (this.f19849h.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f19889f;
        if (android.support.v4.media.session.a.t(comparator, set)) {
            Iterator it = set.iterator();
            try {
                O it2 = iterator();
                do {
                    C2182j c2182j = (C2182j) it2;
                    if (!c2182j.hasNext()) {
                        return true;
                    }
                    next = c2182j.next();
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

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return this.f19849h.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f19849h.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int n2 = n(obj, true) - 1;
        if (n2 == -1) {
            return null;
        }
        return this.f19849h.get(n2);
    }

    @Override // d4.AbstractC2180h
    /* renamed from: g */
    public final O iterator() {
        return this.f19849h.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int o3 = o(obj, false);
        AbstractC2186n abstractC2186n = this.f19849h;
        if (o3 == abstractC2186n.size()) {
            return null;
        }
        return abstractC2186n.get(o3);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.f19849h.get(r0.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int n2 = n(obj, false) - 1;
        if (n2 == -1) {
            return null;
        }
        return this.f19849h.get(n2);
    }

    public final L m(int i9, int i10) {
        AbstractC2186n abstractC2186n = this.f19849h;
        if (i9 == 0 && i10 == abstractC2186n.size()) {
            return this;
        }
        Comparator comparator = this.f19889f;
        if (i9 < i10) {
            return new L(abstractC2186n.subList(i9, i10), comparator);
        }
        return z.l(comparator);
    }

    public final int n(Object obj, boolean z8) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f19849h, obj, this.f19889f);
        if (binarySearch >= 0) {
            if (z8) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int o(Object obj, boolean z8) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f19849h, obj, this.f19889f);
        if (binarySearch >= 0) {
            if (!z8) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19849h.size();
    }
}
