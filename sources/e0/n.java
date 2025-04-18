package e0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class n extends i {
    public static final Object[] d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f30210a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f30211b;

    /* renamed from: c, reason: collision with root package name */
    public int f30212c;

    public n(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = d;
        } else if (i2 > 0) {
            objArr = new Object[i2];
        } else {
            throw new IllegalArgumentException(android.support.v4.media.d.i("Illegal Capacity: ", i2));
        }
        this.f30211b = objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        p0.a.s(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        e(collection.size() + b());
        d(k(b() + this.f30210a), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        e(this.f30212c + 1);
        int i2 = this.f30210a;
        if (i2 == 0) {
            Object[] objArr = this.f30211b;
            p0.a.s(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f30210a = i3;
        this.f30211b[i3] = obj;
        this.f30212c++;
    }

    public final void addLast(Object obj) {
        e(b() + 1);
        this.f30211b[k(b() + this.f30210a)] = obj;
        this.f30212c = b() + 1;
    }

    @Override // e0.i
    public final int b() {
        return this.f30212c;
    }

    @Override // e0.i
    public final Object c(int i2) {
        b bVar = f.Companion;
        int i3 = this.f30212c;
        bVar.getClass();
        b.a(i2, i3);
        if (i2 == b1.f0.p(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int k2 = k(this.f30210a + i2);
        Object[] objArr = this.f30211b;
        Object obj = objArr[k2];
        if (i2 < (this.f30212c >> 1)) {
            int i4 = this.f30210a;
            if (k2 >= i4) {
                q.P(i4 + 1, i4, objArr, k2, objArr);
            } else {
                q.P(1, 0, objArr, k2, objArr);
                Object[] objArr2 = this.f30211b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f30210a;
                q.P(i5 + 1, i5, objArr2, objArr2.length - 1, objArr2);
            }
            Object[] objArr3 = this.f30211b;
            int i6 = this.f30210a;
            objArr3[i6] = null;
            this.f30210a = g(i6);
        } else {
            int k3 = k(b1.f0.p(this) + this.f30210a);
            if (k2 <= k3) {
                Object[] objArr4 = this.f30211b;
                q.P(k2, k2 + 1, objArr4, k3 + 1, objArr4);
            } else {
                Object[] objArr5 = this.f30211b;
                q.P(k2, k2 + 1, objArr5, objArr5.length, objArr5);
                Object[] objArr6 = this.f30211b;
                objArr6[objArr6.length - 1] = objArr6[0];
                q.P(0, 1, objArr6, k3 + 1, objArr6);
            }
            this.f30211b[k3] = null;
        }
        this.f30212c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int k2 = k(this.f30212c + this.f30210a);
        int i2 = this.f30210a;
        if (i2 < k2) {
            q.W(i2, k2, this.f30211b);
        } else if (!isEmpty()) {
            Object[] objArr = this.f30211b;
            q.W(this.f30210a, objArr.length, objArr);
            q.W(0, k2, this.f30211b);
        }
        this.f30210a = 0;
        this.f30212c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f30211b.length;
        while (i2 < length && it.hasNext()) {
            this.f30211b[i2] = it.next();
            i2++;
        }
        int i3 = this.f30210a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f30211b[i4] = it.next();
        }
        this.f30212c = collection.size() + b();
    }

    public final void e(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f30211b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f30211b = new Object[i2];
            return;
        }
        b bVar = f.Companion;
        int length = objArr.length;
        bVar.getClass();
        Object[] objArr2 = new Object[b.d(length, i2)];
        Object[] objArr3 = this.f30211b;
        q.P(0, this.f30210a, objArr3, objArr3.length, objArr2);
        Object[] objArr4 = this.f30211b;
        int length2 = objArr4.length;
        int i3 = this.f30210a;
        q.P(length2 - i3, 0, objArr4, i3, objArr2);
        this.f30210a = 0;
        this.f30211b = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.f30211b[this.f30210a];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f30211b[this.f30210a];
    }

    public final int g(int i2) {
        p0.a.s(this.f30211b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        b bVar = f.Companion;
        int i3 = this.f30212c;
        bVar.getClass();
        b.a(i2, i3);
        return this.f30211b[k(this.f30210a + i2)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int k2 = k(b() + this.f30210a);
        int i3 = this.f30210a;
        if (i3 < k2) {
            while (i3 < k2) {
                if (p0.a.g(obj, this.f30211b[i3])) {
                    i2 = this.f30210a;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < k2) {
            return -1;
        }
        int length = this.f30211b.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < k2; i4++) {
                    if (p0.a.g(obj, this.f30211b[i4])) {
                        i3 = i4 + this.f30211b.length;
                        i2 = this.f30210a;
                    }
                }
                return -1;
            }
            if (p0.a.g(obj, this.f30211b[i3])) {
                i2 = this.f30210a;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.f30211b[k(b1.f0.p(this) + this.f30210a)];
    }

    public final int k(int i2) {
        Object[] objArr = this.f30211b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f30211b[k(b1.f0.p(this) + this.f30210a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int k2 = k(this.f30212c + this.f30210a);
        int i3 = this.f30210a;
        if (i3 < k2) {
            length = k2 - 1;
            if (i3 <= length) {
                while (!p0.a.g(obj, this.f30211b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f30210a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > k2) {
            int i4 = k2 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f30211b;
                    p0.a.s(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f30210a;
                    if (i5 <= length) {
                        while (!p0.a.g(obj, this.f30211b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f30210a;
                    }
                } else {
                    if (p0.a.g(obj, this.f30211b[i4])) {
                        length = i4 + this.f30211b.length;
                        i2 = this.f30210a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int k2;
        p0.a.s(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f30211b.length != 0) {
            int k3 = k(this.f30212c + this.f30210a);
            int i2 = this.f30210a;
            if (i2 < k3) {
                k2 = i2;
                while (i2 < k3) {
                    Object obj = this.f30211b[i2];
                    if (!collection.contains(obj)) {
                        this.f30211b[k2] = obj;
                        k2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                q.W(k2, k3, this.f30211b);
            } else {
                int length = this.f30211b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f30211b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (!collection.contains(obj2)) {
                        this.f30211b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                k2 = k(i3);
                for (int i4 = 0; i4 < k3; i4++) {
                    Object[] objArr2 = this.f30211b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (!collection.contains(obj3)) {
                        this.f30211b[k2] = obj3;
                        k2 = g(k2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = k2 - this.f30210a;
                if (i5 < 0) {
                    i5 += this.f30211b.length;
                }
                this.f30212c = i5;
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f30211b;
        int i2 = this.f30210a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f30210a = g(i2);
        this.f30212c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int k2 = k(b1.f0.p(this) + this.f30210a);
        Object[] objArr = this.f30211b;
        Object obj = objArr[k2];
        objArr[k2] = null;
        this.f30212c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int k2;
        p0.a.s(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f30211b.length != 0) {
            int k3 = k(this.f30212c + this.f30210a);
            int i2 = this.f30210a;
            if (i2 < k3) {
                k2 = i2;
                while (i2 < k3) {
                    Object obj = this.f30211b[i2];
                    if (collection.contains(obj)) {
                        this.f30211b[k2] = obj;
                        k2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                q.W(k2, k3, this.f30211b);
            } else {
                int length = this.f30211b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f30211b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f30211b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                k2 = k(i3);
                for (int i4 = 0; i4 < k3; i4++) {
                    Object[] objArr2 = this.f30211b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f30211b[k2] = obj3;
                        k2 = g(k2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = k2 - this.f30210a;
                if (i5 < 0) {
                    i5 += this.f30211b.length;
                }
                this.f30212c = i5;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        b bVar = f.Companion;
        int i3 = this.f30212c;
        bVar.getClass();
        b.a(i2, i3);
        int k2 = k(this.f30210a + i2);
        Object[] objArr = this.f30211b;
        Object obj2 = objArr[k2];
        objArr[k2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        b bVar = f.Companion;
        int i4 = this.f30212c;
        bVar.getClass();
        b.b(i2, i4);
        int i5 = this.f30212c;
        if (i2 == i5) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        e(i5 + 1);
        int k2 = k(this.f30210a + i2);
        int i6 = this.f30212c;
        if (i2 < ((i6 + 1) >> 1)) {
            if (k2 == 0) {
                Object[] objArr = this.f30211b;
                p0.a.s(objArr, "<this>");
                k2 = objArr.length;
            }
            int i7 = k2 - 1;
            int i8 = this.f30210a;
            if (i8 == 0) {
                Object[] objArr2 = this.f30211b;
                p0.a.s(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i8 - 1;
            }
            int i9 = this.f30210a;
            if (i7 >= i9) {
                Object[] objArr3 = this.f30211b;
                objArr3[i3] = objArr3[i9];
                q.P(i9, i9 + 1, objArr3, i7 + 1, objArr3);
            } else {
                Object[] objArr4 = this.f30211b;
                q.P(i9 - 1, i9, objArr4, objArr4.length, objArr4);
                Object[] objArr5 = this.f30211b;
                objArr5[objArr5.length - 1] = objArr5[0];
                q.P(0, 1, objArr5, i7 + 1, objArr5);
            }
            this.f30211b[i7] = obj;
            this.f30210a = i3;
        } else {
            int k3 = k(i6 + this.f30210a);
            if (k2 < k3) {
                Object[] objArr6 = this.f30211b;
                q.P(k2 + 1, k2, objArr6, k3, objArr6);
            } else {
                Object[] objArr7 = this.f30211b;
                q.P(1, 0, objArr7, k3, objArr7);
                Object[] objArr8 = this.f30211b;
                objArr8[0] = objArr8[objArr8.length - 1];
                q.P(k2 + 1, k2, objArr8, objArr8.length - 1, objArr8);
            }
            this.f30211b[k2] = obj;
        }
        this.f30212c++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        p0.a.s(objArr, "array");
        int length = objArr.length;
        int i2 = this.f30212c;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            p0.a.q(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int k2 = k(this.f30212c + this.f30210a);
        int i3 = this.f30210a;
        if (i3 < k2) {
            q.T(this.f30211b, objArr, i3, k2, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f30211b;
            q.P(0, this.f30210a, objArr2, objArr2.length, objArr);
            Object[] objArr3 = this.f30211b;
            q.P(objArr3.length - this.f30210a, 0, objArr3, k2, objArr);
        }
        int i4 = this.f30212c;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        p0.a.s(collection, "elements");
        b bVar = f.Companion;
        int i3 = this.f30212c;
        bVar.getClass();
        b.b(i2, i3);
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = this.f30212c;
        if (i2 == i4) {
            return addAll(collection);
        }
        e(collection.size() + i4);
        int k2 = k(this.f30212c + this.f30210a);
        int k3 = k(this.f30210a + i2);
        int size = collection.size();
        if (i2 < ((this.f30212c + 1) >> 1)) {
            int i5 = this.f30210a;
            int i6 = i5 - size;
            if (k3 < i5) {
                Object[] objArr = this.f30211b;
                q.P(i6, i5, objArr, objArr.length, objArr);
                if (size >= k3) {
                    Object[] objArr2 = this.f30211b;
                    q.P(objArr2.length - size, 0, objArr2, k3, objArr2);
                } else {
                    Object[] objArr3 = this.f30211b;
                    q.P(objArr3.length - size, 0, objArr3, size, objArr3);
                    Object[] objArr4 = this.f30211b;
                    q.P(0, size, objArr4, k3, objArr4);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f30211b;
                q.P(i6, i5, objArr5, k3, objArr5);
            } else {
                Object[] objArr6 = this.f30211b;
                i6 += objArr6.length;
                int i7 = k3 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    q.P(i6, i5, objArr6, k3, objArr6);
                } else {
                    q.P(i6, i5, objArr6, i5 + length, objArr6);
                    Object[] objArr7 = this.f30211b;
                    q.P(0, this.f30210a + length, objArr7, k3, objArr7);
                }
            }
            this.f30210a = i6;
            int i8 = k3 - size;
            if (i8 < 0) {
                i8 += this.f30211b.length;
            }
            d(i8, collection);
        } else {
            int i9 = k3 + size;
            if (k3 < k2) {
                int i10 = size + k2;
                Object[] objArr8 = this.f30211b;
                if (i10 <= objArr8.length) {
                    q.P(i9, k3, objArr8, k2, objArr8);
                } else if (i9 >= objArr8.length) {
                    q.P(i9 - objArr8.length, k3, objArr8, k2, objArr8);
                } else {
                    int length2 = k2 - (i10 - objArr8.length);
                    q.P(0, length2, objArr8, k2, objArr8);
                    Object[] objArr9 = this.f30211b;
                    q.P(i9, k3, objArr9, length2, objArr9);
                }
            } else {
                Object[] objArr10 = this.f30211b;
                q.P(size, 0, objArr10, k2, objArr10);
                Object[] objArr11 = this.f30211b;
                if (i9 >= objArr11.length) {
                    q.P(i9 - objArr11.length, k3, objArr11, objArr11.length, objArr11);
                } else {
                    q.P(0, objArr11.length - size, objArr11, objArr11.length, objArr11);
                    Object[] objArr12 = this.f30211b;
                    q.P(i9, k3, objArr12, objArr12.length - size, objArr12);
                }
            }
            d(k3, collection);
        }
        return true;
    }

    public n() {
        this.f30211b = d;
    }
}
