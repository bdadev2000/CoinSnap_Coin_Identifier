package f0;

import e0.q;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class c extends e0.i implements RandomAccess, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final c f30417h;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f30418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30419b;

    /* renamed from: c, reason: collision with root package name */
    public int f30420c;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final c f30421f;

    /* renamed from: g, reason: collision with root package name */
    public final c f30422g;

    static {
        c cVar = new c(0);
        cVar.d = true;
        f30417h = cVar;
    }

    public c(Object[] objArr, int i2, int i3, boolean z2, c cVar, c cVar2) {
        this.f30418a = objArr;
        this.f30419b = i2;
        this.f30420c = i3;
        this.d = z2;
        this.f30421f = cVar;
        this.f30422g = cVar2;
        if (cVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
        }
    }

    private final Object writeReplace() {
        c cVar;
        if (this.d || ((cVar = this.f30422g) != null && cVar.d)) {
            return new j(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        g();
        f(this.f30419b + this.f30420c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        p0.a.s(collection, "elements");
        j();
        g();
        int size = collection.size();
        e(this.f30419b + this.f30420c, collection, size);
        return size > 0;
    }

    @Override // e0.i
    public final int b() {
        g();
        return this.f30420c;
    }

    @Override // e0.i
    public final Object c(int i2) {
        j();
        g();
        e0.b bVar = e0.f.Companion;
        int i3 = this.f30420c;
        bVar.getClass();
        e0.b.a(i2, i3);
        return l(this.f30419b + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        g();
        m(this.f30419b, this.f30420c);
    }

    public final void e(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        c cVar = this.f30421f;
        if (cVar != null) {
            cVar.e(i2, collection, i3);
            this.f30418a = cVar.f30418a;
            this.f30420c += i3;
        } else {
            k(i2, i3);
            Iterator it = collection.iterator();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f30418a[i2 + i4] = it.next();
            }
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f30418a;
            int i2 = this.f30420c;
            if (i2 != list.size()) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                if (!p0.a.g(objArr[this.f30419b + i3], list.get(i3))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f30421f;
        if (cVar == null) {
            k(i2, 1);
            this.f30418a[i2] = obj;
        } else {
            cVar.f(i2, obj);
            this.f30418a = cVar.f30418a;
            this.f30420c++;
        }
    }

    public final void g() {
        c cVar = this.f30422g;
        if (cVar != null && ((AbstractList) cVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        g();
        e0.b bVar = e0.f.Companion;
        int i3 = this.f30420c;
        bVar.getClass();
        e0.b.a(i2, i3);
        return this.f30418a[this.f30419b + i2];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f30418a;
        int i2 = this.f30420c;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.f30419b + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i2 = 0; i2 < this.f30420c; i2++) {
            if (p0.a.g(this.f30418a[this.f30419b + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f30420c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        c cVar;
        if (this.d || ((cVar = this.f30422g) != null && cVar.d)) {
            throw new UnsupportedOperationException();
        }
    }

    public final void k(int i2, int i3) {
        int i4 = this.f30420c + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f30418a;
        if (i4 > objArr.length) {
            e0.b bVar = e0.f.Companion;
            int length = objArr.length;
            bVar.getClass();
            int d = e0.b.d(length, i4);
            Object[] objArr2 = this.f30418a;
            p0.a.s(objArr2, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr2, d);
            p0.a.r(copyOf, "copyOf(...)");
            this.f30418a = copyOf;
        }
        Object[] objArr3 = this.f30418a;
        q.P(i2 + i3, i2, objArr3, this.f30419b + this.f30420c, objArr3);
        this.f30420c += i3;
    }

    public final Object l(int i2) {
        ((AbstractList) this).modCount++;
        c cVar = this.f30421f;
        if (cVar != null) {
            this.f30420c--;
            return cVar.l(i2);
        }
        Object[] objArr = this.f30418a;
        Object obj = objArr[i2];
        int i3 = this.f30420c;
        int i4 = this.f30419b;
        q.P(i2, i2 + 1, objArr, i3 + i4, objArr);
        Object[] objArr2 = this.f30418a;
        int i5 = (i4 + this.f30420c) - 1;
        p0.a.s(objArr2, "<this>");
        objArr2[i5] = null;
        this.f30420c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i2 = this.f30420c - 1; i2 >= 0; i2--) {
            if (p0.a.g(this.f30418a[this.f30419b + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.f30421f;
        if (cVar != null) {
            cVar.m(i2, i3);
        } else {
            Object[] objArr = this.f30418a;
            q.P(i2, i2 + i3, objArr, this.f30420c, objArr);
            Object[] objArr2 = this.f30418a;
            int i4 = this.f30420c;
            kotlin.jvm.internal.q.k(i4 - i3, i4, objArr2);
        }
        this.f30420c -= i3;
    }

    public final int p(int i2, int i3, Collection collection, boolean z2) {
        int i4;
        c cVar = this.f30421f;
        if (cVar != null) {
            i4 = cVar.p(i2, i3, collection, z2);
        } else {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                int i7 = i2 + i5;
                if (collection.contains(this.f30418a[i7]) == z2) {
                    Object[] objArr = this.f30418a;
                    i5++;
                    objArr[i6 + i2] = objArr[i7];
                    i6++;
                } else {
                    i5++;
                }
            }
            int i8 = i3 - i6;
            Object[] objArr2 = this.f30418a;
            q.P(i2 + i6, i3 + i2, objArr2, this.f30420c, objArr2);
            Object[] objArr3 = this.f30418a;
            int i9 = this.f30420c;
            kotlin.jvm.internal.q.k(i9 - i8, i9, objArr3);
            i4 = i8;
        }
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f30420c -= i4;
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        p0.a.s(collection, "elements");
        j();
        g();
        return p(this.f30419b, this.f30420c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        p0.a.s(collection, "elements");
        j();
        g();
        return p(this.f30419b, this.f30420c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        j();
        g();
        e0.b bVar = e0.f.Companion;
        int i3 = this.f30420c;
        bVar.getClass();
        e0.b.a(i2, i3);
        Object[] objArr = this.f30418a;
        int i4 = this.f30419b + i2;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        e0.b bVar = e0.f.Companion;
        int i4 = this.f30420c;
        bVar.getClass();
        e0.b.c(i2, i3, i4);
        Object[] objArr = this.f30418a;
        int i5 = this.f30419b + i2;
        int i6 = i3 - i2;
        boolean z2 = this.d;
        c cVar = this.f30422g;
        return new c(objArr, i5, i6, z2, this, cVar == null ? this : cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        p0.a.s(objArr, "destination");
        g();
        int length = objArr.length;
        int i2 = this.f30420c;
        int i3 = this.f30419b;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f30418a, i3, i2 + i3, objArr.getClass());
            p0.a.r(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        q.P(0, i3, this.f30418a, i2 + i3, objArr);
        int i4 = this.f30420c;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        Object[] objArr = this.f30418a;
        int i2 = this.f30420c;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f30419b + i3];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        p0.a.r(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        g();
        e0.b bVar = e0.f.Companion;
        int i3 = this.f30420c;
        bVar.getClass();
        e0.b.b(i2, i3);
        return new b(this, i2);
    }

    public c() {
        this(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int i2) {
        this(new Object[i2], 0, 0, false, null, null);
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        j();
        g();
        e0.b bVar = e0.f.Companion;
        int i3 = this.f30420c;
        bVar.getClass();
        e0.b.b(i2, i3);
        f(this.f30419b + i2, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        p0.a.s(collection, "elements");
        j();
        g();
        e0.b bVar = e0.f.Companion;
        int i3 = this.f30420c;
        bVar.getClass();
        e0.b.b(i2, i3);
        int size = collection.size();
        e(this.f30419b + i2, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f30418a;
        int i2 = this.f30420c;
        int i3 = this.f30419b;
        return q.V(i3, i2 + i3, objArr);
    }
}
