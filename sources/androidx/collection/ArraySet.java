package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import e0.q;
import e0.u;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p0.a;
import r0.b;
import r0.f;

/* loaded from: classes3.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, b, f {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1398a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1399b;

    /* renamed from: c, reason: collision with root package name */
    public int f1400c;

    /* loaded from: classes3.dex */
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.f1400c);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object b(int i2) {
            return ArraySet.this.f1399b[i2];
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void c(int i2) {
            ArraySet.this.b(i2);
        }
    }

    public ArraySet(int i2) {
        this.f1398a = ContainerHelpersKt.f1617a;
        this.f1399b = ContainerHelpersKt.f1619c;
        if (i2 > 0) {
            ArraySetKt.a(this, i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int b2;
        int i3 = this.f1400c;
        if (obj == null) {
            b2 = ArraySetKt.b(this, null, 0);
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            b2 = ArraySetKt.b(this, obj, hashCode);
        }
        if (b2 >= 0) {
            return false;
        }
        int i4 = ~b2;
        int[] iArr = this.f1398a;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f1399b;
            ArraySetKt.a(this, i5);
            if (i3 != this.f1400c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1398a;
            if (!(iArr2.length == 0)) {
                q.S(iArr, iArr2, 0, iArr.length, 6);
                q.T(objArr, this.f1399b, 0, objArr.length, 6);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f1398a;
            int i6 = i4 + 1;
            q.O(i6, i4, i3, iArr3, iArr3);
            Object[] objArr2 = this.f1399b;
            q.P(i6, i4, objArr2, i3, objArr2);
        }
        int i7 = this.f1400c;
        if (i3 == i7) {
            int[] iArr4 = this.f1398a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f1399b[i4] = obj;
                this.f1400c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        a.s(collection, "elements");
        int size = collection.size() + this.f1400c;
        int i2 = this.f1400c;
        int[] iArr = this.f1398a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1399b;
            ArraySetKt.a(this, size);
            int i3 = this.f1400c;
            if (i3 > 0) {
                q.S(iArr, this.f1398a, 0, i3, 6);
                q.T(objArr, this.f1399b, 0, this.f1400c, 6);
            }
        }
        if (this.f1400c != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    public final Object b(int i2) {
        int i3 = this.f1400c;
        Object[] objArr = this.f1399b;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f1398a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    q.O(i2, i5, i3, iArr, iArr);
                    Object[] objArr2 = this.f1399b;
                    q.P(i2, i5, objArr2, i3, objArr2);
                }
                this.f1399b[i4] = null;
            } else {
                ArraySetKt.a(this, i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i2 > 0) {
                    q.S(iArr, this.f1398a, 0, i2, 6);
                    q.T(objArr, this.f1399b, 0, i2, 6);
                }
                if (i2 < i4) {
                    int i6 = i2 + 1;
                    q.O(i2, i6, i3, iArr, this.f1398a);
                    q.P(i2, i6, objArr, i3, this.f1399b);
                }
            }
            if (i3 != this.f1400c) {
                throw new ConcurrentModificationException();
            }
            this.f1400c = i4;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1400c != 0) {
            this.f1398a = ContainerHelpersKt.f1617a;
            this.f1399b = ContainerHelpersKt.f1619c;
            this.f1400c = 0;
        }
        if (this.f1400c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? ArraySetKt.b(this, null, 0) : ArraySetKt.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        a.s(collection, "elements");
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f1400c == ((Set) obj).size()) {
            try {
                int i2 = this.f1400c;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Set) obj).contains(this.f1399b[i3])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1398a;
        int i2 = this.f1400c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1400c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b2 = obj == null ? ArraySetKt.b(this, null, 0) : ArraySetKt.b(this, obj, obj.hashCode());
        if (b2 < 0) {
            return false;
        }
        b(b2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        a.s(collection, "elements");
        Iterator<E> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        a.s(collection, "elements");
        boolean z2 = false;
        for (int i2 = this.f1400c - 1; -1 < i2; i2--) {
            if (!u.A0(collection, this.f1399b[i2])) {
                b(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1400c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        a.s(objArr, "array");
        int i2 = this.f1400c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        q.P(0, 0, this.f1399b, this.f1400c, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1400c * 14);
        sb.append('{');
        int i2 = this.f1400c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1399b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public ArraySet() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return q.V(0, this.f1400c, this.f1399b);
    }
}
