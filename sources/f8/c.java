package f8;

import com.applovin.sdk.AppLovinEventTypes;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import u7.AbstractC2816g;

/* loaded from: classes3.dex */
public final class c extends j implements List, H7.a {
    public final List b;

    public c(List list) {
        G7.j.e(list, AppLovinEventTypes.USER_VIEWED_CONTENT);
        this.b = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        G7.j.e(jVar, "element");
        return this.b.contains(jVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        G7.j.e(collection, "elements");
        return this.b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return G7.j.a(this.b, obj);
    }

    @Override // java.util.List
    public final Object get(int i9) {
        return (j) this.b.get(i9);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j jVar = (j) obj;
        G7.j.e(jVar, "element");
        return this.b.indexOf(jVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j jVar = (j) obj;
        G7.j.e(jVar, "element");
        return this.b.lastIndexOf(jVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.b.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i9, int i10) {
        return this.b.subList(i9, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return G7.i.a(this);
    }

    public final String toString() {
        return AbstractC2816g.O(this.b, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        return this.b.listIterator(i9);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        G7.j.e(objArr, "array");
        return G7.i.b(this, objArr);
    }
}
