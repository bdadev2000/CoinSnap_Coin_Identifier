package d4;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: d4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2186n extends AbstractC2180h implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final C2182j f19876c = new C2182j(E.f19825g, 0);

    public static E h(int i9, Object[] objArr) {
        if (i9 == 0) {
            return E.f19825g;
        }
        return new E(objArr, i9);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // d4.AbstractC2180h
    public int b(Object[] objArr) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
    }

    @Override // d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (z2.i.h(get(i9), list.get(i9))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && z2.i.h(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // d4.AbstractC2180h
    /* renamed from: g */
    public final O iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~(get(i10).hashCode() + (i9 * 31)));
        }
        return i9;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (obj.equals(get(i9))) {
                return i9;
            }
        }
        return -1;
    }

    @Override // d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C2182j listIterator(int i9) {
        C2.m.i(i9, size());
        if (isEmpty()) {
            return f19876c;
        }
        return new C2182j(this, i9);
    }

    public AbstractC2186n k() {
        if (size() <= 1) {
            return this;
        }
        return new C2183k(this);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2186n subList(int i9, int i10) {
        C2.m.j(i9, i10, size());
        int i11 = i10 - i9;
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return E.f19825g;
        }
        return new C2185m(this, i9, i11);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // d4.AbstractC2180h
    public Object writeReplace() {
        return new C2184l(toArray(AbstractC2180h.b));
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
