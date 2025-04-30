package t7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: t7.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2729r implements Collection, H7.a {
    public final int[] b;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        if (!(obj instanceof C2728q)) {
            return false;
        }
        int i9 = ((C2728q) obj).b;
        int[] iArr = this.b;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (i9 == iArr[i10]) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean z8;
        G7.j.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof C2728q) {
                int i9 = ((C2728q) obj).b;
                int[] iArr = this.b;
                int length = iArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (i9 == iArr[i10]) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2729r)) {
            return false;
        }
        if (!G7.j.a(this.b, ((C2729r) obj).b)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.b);
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
        return new G7.a(this.b, 3);
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
        return G7.i.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.b) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        G7.j.e(objArr, "array");
        return G7.i.b(this, objArr);
    }
}
