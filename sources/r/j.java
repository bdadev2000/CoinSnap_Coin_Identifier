package r;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k.d f23948b;

    public j(k.d dVar) {
        this.f23948b = dVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f23948b.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23948b.h(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f23948b.f() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f23948b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        k.d dVar = this.f23948b;
        int h10 = dVar.h(obj);
        if (h10 >= 0) {
            dVar.j(h10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        k.d dVar = this.f23948b;
        int f10 = dVar.f();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < f10) {
            if (collection.contains(dVar.d(i10, 1))) {
                dVar.j(i10);
                i10--;
                f10--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        k.d dVar = this.f23948b;
        int f10 = dVar.f();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < f10) {
            if (!collection.contains(dVar.d(i10, 1))) {
                dVar.j(i10);
                i10--;
                f10--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f23948b.f();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f23948b.r(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        k.d dVar = this.f23948b;
        int f10 = dVar.f();
        Object[] objArr = new Object[f10];
        for (int i10 = 0; i10 < f10; i10++) {
            objArr[i10] = dVar.d(i10, 1);
        }
        return objArr;
    }
}
