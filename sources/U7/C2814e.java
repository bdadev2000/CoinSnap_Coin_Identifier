package u7;

import Q7.n0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: u7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2814e extends AbstractList implements List, H7.b {

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f23447f = new Object[0];
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f23448c = f23447f;

    /* renamed from: d, reason: collision with root package name */
    public int f23449d;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        int i11;
        int i12 = this.f23449d;
        if (i9 < 0 || i9 > i12) {
            throw new IndexOutOfBoundsException(n0.e(i9, i12, "index: ", ", size: "));
        }
        if (i9 == i12) {
            addLast(obj);
            return;
        }
        if (i9 == 0) {
            h();
            c(this.f23449d + 1);
            int i13 = this.b;
            if (i13 == 0) {
                Object[] objArr = this.f23448c;
                G7.j.e(objArr, "<this>");
                i13 = objArr.length;
            }
            int i14 = i13 - 1;
            this.b = i14;
            this.f23448c[i14] = obj;
            this.f23449d++;
            return;
        }
        h();
        c(this.f23449d + 1);
        int g9 = g(this.b + i9);
        int i15 = this.f23449d;
        if (i9 < ((i15 + 1) >> 1)) {
            if (g9 == 0) {
                Object[] objArr2 = this.f23448c;
                G7.j.e(objArr2, "<this>");
                i10 = objArr2.length - 1;
            } else {
                i10 = g9 - 1;
            }
            int i16 = this.b;
            if (i16 == 0) {
                Object[] objArr3 = this.f23448c;
                G7.j.e(objArr3, "<this>");
                i11 = objArr3.length - 1;
            } else {
                i11 = i16 - 1;
            }
            int i17 = this.b;
            if (i10 >= i17) {
                Object[] objArr4 = this.f23448c;
                objArr4[i11] = objArr4[i17];
                AbstractC2815f.w(objArr4, i17, objArr4, i17 + 1, i10 + 1);
            } else {
                Object[] objArr5 = this.f23448c;
                AbstractC2815f.w(objArr5, i17 - 1, objArr5, i17, objArr5.length);
                Object[] objArr6 = this.f23448c;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC2815f.w(objArr6, 0, objArr6, 1, i10 + 1);
            }
            this.f23448c[i10] = obj;
            this.b = i11;
        } else {
            int g10 = g(this.b + i15);
            if (g9 < g10) {
                Object[] objArr7 = this.f23448c;
                AbstractC2815f.w(objArr7, g9 + 1, objArr7, g9, g10);
            } else {
                Object[] objArr8 = this.f23448c;
                AbstractC2815f.w(objArr8, 1, objArr8, 0, g10);
                Object[] objArr9 = this.f23448c;
                objArr9[0] = objArr9[objArr9.length - 1];
                AbstractC2815f.w(objArr9, g9 + 1, objArr9, g9, objArr9.length - 1);
            }
            this.f23448c[g9] = obj;
        }
        this.f23449d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        G7.j.e(collection, "elements");
        int i10 = this.f23449d;
        if (i9 >= 0 && i9 <= i10) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i9 == this.f23449d) {
                return addAll(collection);
            }
            h();
            c(collection.size() + this.f23449d);
            int g9 = g(this.b + this.f23449d);
            int g10 = g(this.b + i9);
            int size = collection.size();
            if (i9 < ((this.f23449d + 1) >> 1)) {
                int i11 = this.b;
                int i12 = i11 - size;
                if (g10 < i11) {
                    Object[] objArr = this.f23448c;
                    AbstractC2815f.w(objArr, i12, objArr, i11, objArr.length);
                    if (size >= g10) {
                        Object[] objArr2 = this.f23448c;
                        AbstractC2815f.w(objArr2, objArr2.length - size, objArr2, 0, g10);
                    } else {
                        Object[] objArr3 = this.f23448c;
                        AbstractC2815f.w(objArr3, objArr3.length - size, objArr3, 0, size);
                        Object[] objArr4 = this.f23448c;
                        AbstractC2815f.w(objArr4, 0, objArr4, size, g10);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr5 = this.f23448c;
                    AbstractC2815f.w(objArr5, i12, objArr5, i11, g10);
                } else {
                    Object[] objArr6 = this.f23448c;
                    i12 += objArr6.length;
                    int i13 = g10 - i11;
                    int length = objArr6.length - i12;
                    if (length >= i13) {
                        AbstractC2815f.w(objArr6, i12, objArr6, i11, g10);
                    } else {
                        AbstractC2815f.w(objArr6, i12, objArr6, i11, i11 + length);
                        Object[] objArr7 = this.f23448c;
                        AbstractC2815f.w(objArr7, 0, objArr7, this.b + length, g10);
                    }
                }
                this.b = i12;
                b(e(g10 - size), collection);
            } else {
                int i14 = g10 + size;
                if (g10 < g9) {
                    int i15 = size + g9;
                    Object[] objArr8 = this.f23448c;
                    if (i15 <= objArr8.length) {
                        AbstractC2815f.w(objArr8, i14, objArr8, g10, g9);
                    } else if (i14 >= objArr8.length) {
                        AbstractC2815f.w(objArr8, i14 - objArr8.length, objArr8, g10, g9);
                    } else {
                        int length2 = g9 - (i15 - objArr8.length);
                        AbstractC2815f.w(objArr8, 0, objArr8, length2, g9);
                        Object[] objArr9 = this.f23448c;
                        AbstractC2815f.w(objArr9, i14, objArr9, g10, length2);
                    }
                } else {
                    Object[] objArr10 = this.f23448c;
                    AbstractC2815f.w(objArr10, size, objArr10, 0, g9);
                    Object[] objArr11 = this.f23448c;
                    if (i14 >= objArr11.length) {
                        AbstractC2815f.w(objArr11, i14 - objArr11.length, objArr11, g10, objArr11.length);
                    } else {
                        AbstractC2815f.w(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f23448c;
                        AbstractC2815f.w(objArr12, i14, objArr12, g10, objArr12.length - size);
                    }
                }
                b(g10, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(n0.e(i9, i10, "index: ", ", size: "));
    }

    public final void addLast(Object obj) {
        h();
        c(this.f23449d + 1);
        this.f23448c[g(this.b + this.f23449d)] = obj;
        this.f23449d++;
    }

    public final void b(int i9, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f23448c.length;
        while (i9 < length && it.hasNext()) {
            this.f23448c[i9] = it.next();
            i9++;
        }
        int i10 = this.b;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f23448c[i11] = it.next();
        }
        this.f23449d = collection.size() + this.f23449d;
    }

    public final void c(int i9) {
        if (i9 >= 0) {
            Object[] objArr = this.f23448c;
            if (i9 <= objArr.length) {
                return;
            }
            if (objArr == f23447f) {
                if (i9 < 10) {
                    i9 = 10;
                }
                this.f23448c = new Object[i9];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                if (i9 > 2147483639) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            AbstractC2815f.w(objArr, 0, objArr2, this.b, objArr.length);
            Object[] objArr3 = this.f23448c;
            int length2 = objArr3.length;
            int i11 = this.b;
            AbstractC2815f.w(objArr3, length2 - i11, objArr2, 0, i11);
            this.b = 0;
            this.f23448c = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            h();
            f(this.b, g(this.b + this.f23449d));
        }
        this.b = 0;
        this.f23449d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i9) {
        G7.j.e(this.f23448c, "<this>");
        if (i9 == r0.length - 1) {
            return 0;
        }
        return i9 + 1;
    }

    public final int e(int i9) {
        if (i9 < 0) {
            return i9 + this.f23448c.length;
        }
        return i9;
    }

    public final void f(int i9, int i10) {
        if (i9 < i10) {
            AbstractC2815f.y(this.f23448c, i9, i10);
            return;
        }
        Object[] objArr = this.f23448c;
        AbstractC2815f.y(objArr, i9, objArr.length);
        AbstractC2815f.y(this.f23448c, 0, i10);
    }

    public final int g(int i9) {
        Object[] objArr = this.f23448c;
        if (i9 >= objArr.length) {
            return i9 - objArr.length;
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        int i10 = this.f23449d;
        if (i9 >= 0 && i9 < i10) {
            return this.f23448c[g(this.b + i9)];
        }
        throw new IndexOutOfBoundsException(n0.e(i9, i10, "index: ", ", size: "));
    }

    public final void h() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i9;
        int g9 = g(this.b + this.f23449d);
        int i10 = this.b;
        if (i10 < g9) {
            while (i10 < g9) {
                if (G7.j.a(obj, this.f23448c[i10])) {
                    i9 = this.b;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 >= g9) {
            int length = this.f23448c.length;
            while (true) {
                if (i10 < length) {
                    if (G7.j.a(obj, this.f23448c[i10])) {
                        i9 = this.b;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < g9; i11++) {
                        if (G7.j.a(obj, this.f23448c[i11])) {
                            i10 = i11 + this.f23448c.length;
                            i9 = this.b;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f23449d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i9;
        int g9 = g(this.b + this.f23449d);
        int i10 = this.b;
        if (i10 < g9) {
            length = g9 - 1;
            if (i10 <= length) {
                while (!G7.j.a(obj, this.f23448c[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i9 = this.b;
                return length - i9;
            }
            return -1;
        }
        if (i10 > g9) {
            int i11 = g9 - 1;
            while (true) {
                if (-1 < i11) {
                    if (G7.j.a(obj, this.f23448c[i11])) {
                        length = i11 + this.f23448c.length;
                        i9 = this.b;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f23448c;
                    G7.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.b;
                    if (i12 <= length) {
                        while (!G7.j.a(obj, this.f23448c[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i9 = this.b;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        int i10 = this.f23449d;
        if (i9 >= 0 && i9 < i10) {
            if (i9 == AbstractC2817h.A(this)) {
                return removeLast();
            }
            if (i9 == 0) {
                return removeFirst();
            }
            h();
            int g9 = g(this.b + i9);
            Object[] objArr = this.f23448c;
            Object obj = objArr[g9];
            if (i9 < (this.f23449d >> 1)) {
                int i11 = this.b;
                if (g9 >= i11) {
                    AbstractC2815f.w(objArr, i11 + 1, objArr, i11, g9);
                } else {
                    AbstractC2815f.w(objArr, 1, objArr, 0, g9);
                    Object[] objArr2 = this.f23448c;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i12 = this.b;
                    AbstractC2815f.w(objArr2, i12 + 1, objArr2, i12, objArr2.length - 1);
                }
                Object[] objArr3 = this.f23448c;
                int i13 = this.b;
                objArr3[i13] = null;
                this.b = d(i13);
            } else {
                int g10 = g(AbstractC2817h.A(this) + this.b);
                if (g9 <= g10) {
                    Object[] objArr4 = this.f23448c;
                    AbstractC2815f.w(objArr4, g9, objArr4, g9 + 1, g10 + 1);
                } else {
                    Object[] objArr5 = this.f23448c;
                    AbstractC2815f.w(objArr5, g9, objArr5, g9 + 1, objArr5.length);
                    Object[] objArr6 = this.f23448c;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    AbstractC2815f.w(objArr6, 0, objArr6, 1, g10 + 1);
                }
                this.f23448c[g10] = null;
            }
            this.f23449d--;
            return obj;
        }
        throw new IndexOutOfBoundsException(n0.e(i9, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int g9;
        G7.j.e(collection, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f23448c.length != 0) {
            int g10 = g(this.b + this.f23449d);
            int i9 = this.b;
            if (i9 < g10) {
                g9 = i9;
                while (i9 < g10) {
                    Object obj = this.f23448c[i9];
                    if (!collection.contains(obj)) {
                        this.f23448c[g9] = obj;
                        g9++;
                    } else {
                        z8 = true;
                    }
                    i9++;
                }
                AbstractC2815f.y(this.f23448c, g9, g10);
            } else {
                int length = this.f23448c.length;
                boolean z9 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f23448c;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (!collection.contains(obj2)) {
                        this.f23448c[i10] = obj2;
                        i10++;
                    } else {
                        z9 = true;
                    }
                    i9++;
                }
                g9 = g(i10);
                for (int i11 = 0; i11 < g10; i11++) {
                    Object[] objArr2 = this.f23448c;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!collection.contains(obj3)) {
                        this.f23448c[g9] = obj3;
                        g9 = d(g9);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                h();
                this.f23449d = e(g9 - this.b);
            }
        }
        return z8;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            h();
            Object[] objArr = this.f23448c;
            int i9 = this.b;
            Object obj = objArr[i9];
            objArr[i9] = null;
            this.b = d(i9);
            this.f23449d--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            h();
            int g9 = g(AbstractC2817h.A(this) + this.b);
            Object[] objArr = this.f23448c;
            Object obj = objArr[g9];
            objArr[g9] = null;
            this.f23449d--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        R2.b.j(i9, i10, this.f23449d);
        int i11 = i10 - i9;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f23449d) {
            clear();
            return;
        }
        if (i11 == 1) {
            remove(i9);
            return;
        }
        h();
        if (i9 < this.f23449d - i10) {
            int g9 = g((i9 - 1) + this.b);
            int g10 = g((i10 - 1) + this.b);
            while (i9 > 0) {
                int i12 = g9 + 1;
                int min = Math.min(i9, Math.min(i12, g10 + 1));
                Object[] objArr = this.f23448c;
                int i13 = g10 - min;
                int i14 = g9 - min;
                AbstractC2815f.w(objArr, i13 + 1, objArr, i14 + 1, i12);
                g9 = e(i14);
                g10 = e(i13);
                i9 -= min;
            }
            int g11 = g(this.b + i11);
            f(this.b, g11);
            this.b = g11;
        } else {
            int g12 = g(this.b + i10);
            int g13 = g(this.b + i9);
            int i15 = this.f23449d;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f23448c;
                i10 = Math.min(i15, Math.min(objArr2.length - g12, objArr2.length - g13));
                Object[] objArr3 = this.f23448c;
                int i16 = g12 + i10;
                AbstractC2815f.w(objArr3, g13, objArr3, g12, i16);
                g12 = g(i16);
                g13 = g(g13 + i10);
            }
            int g14 = g(this.b + this.f23449d);
            f(e(g14 - i11), g14);
        }
        this.f23449d -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int g9;
        G7.j.e(collection, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f23448c.length != 0) {
            int g10 = g(this.b + this.f23449d);
            int i9 = this.b;
            if (i9 < g10) {
                g9 = i9;
                while (i9 < g10) {
                    Object obj = this.f23448c[i9];
                    if (collection.contains(obj)) {
                        this.f23448c[g9] = obj;
                        g9++;
                    } else {
                        z8 = true;
                    }
                    i9++;
                }
                AbstractC2815f.y(this.f23448c, g9, g10);
            } else {
                int length = this.f23448c.length;
                boolean z9 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f23448c;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (collection.contains(obj2)) {
                        this.f23448c[i10] = obj2;
                        i10++;
                    } else {
                        z9 = true;
                    }
                    i9++;
                }
                g9 = g(i10);
                for (int i11 = 0; i11 < g10; i11++) {
                    Object[] objArr2 = this.f23448c;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f23448c[g9] = obj3;
                        g9 = d(g9);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                h();
                this.f23449d = e(g9 - this.b);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        int i10 = this.f23449d;
        if (i9 >= 0 && i9 < i10) {
            int g9 = g(this.b + i9);
            Object[] objArr = this.f23448c;
            Object obj2 = objArr[g9];
            objArr[g9] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(n0.e(i9, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23449d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f23449d]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        G7.j.e(objArr, "array");
        int length = objArr.length;
        int i9 = this.f23449d;
        if (length < i9) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i9);
            G7.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int g9 = g(this.b + this.f23449d);
        int i10 = this.b;
        if (i10 < g9) {
            AbstractC2815f.w(this.f23448c, 0, objArr, i10, g9);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f23448c;
            AbstractC2815f.w(objArr2, 0, objArr, this.b, objArr2.length);
            Object[] objArr3 = this.f23448c;
            AbstractC2815f.w(objArr3, objArr3.length - this.b, objArr, 0, g9);
        }
        int i11 = this.f23449d;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        G7.j.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        h();
        c(collection.size() + this.f23449d);
        b(g(this.b + this.f23449d), collection);
        return true;
    }
}
