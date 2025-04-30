package u7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2813d implements Collection, H7.a {
    public final Object[] b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23446c;

    public C2813d(Object[] objArr, boolean z8) {
        G7.j.e(objArr, "values");
        this.b = objArr;
        this.f23446c = z8;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.b;
        G7.j.e(objArr, "<this>");
        if (AbstractC2815f.A(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        G7.j.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            Object[] objArr = this.b;
            G7.j.e(objArr, "<this>");
            if (AbstractC2815f.A(objArr, obj) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.b.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return G7.j.h(this.b);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.b;
        G7.j.e(objArr, "<this>");
        if (this.f23446c && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        G7.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        G7.j.e(objArr, "array");
        return G7.i.b(this, objArr);
    }
}
