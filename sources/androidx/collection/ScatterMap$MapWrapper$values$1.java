package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.e;
import r0.a;

/* loaded from: classes4.dex */
public final class ScatterMap$MapWrapper$values$1 implements Collection<Object>, a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScatterMap f1580a = null;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1580a.b(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        p0.a.s(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f1580a.b(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1580a.d();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return e.u(new ScatterMap$MapWrapper$values$1$iterator$1(this.f1580a, null));
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
    public final boolean removeIf(Predicate<? super Object> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1580a.e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        p0.a.s(objArr, "array");
        return e.D(this, objArr);
    }
}
