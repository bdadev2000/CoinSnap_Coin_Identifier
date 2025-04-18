package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class r0 extends k0 implements List, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f12026c = new n0(0, z1.f12062g);

    public static z1 h(int i10, Object[] objArr) {
        if (i10 == 0) {
            return z1.f12062g;
        }
        return new z1(objArr, i10);
    }

    public static r0 i(Collection collection) {
        if (collection instanceof k0) {
            r0 a = ((k0) collection).a();
            if (a.f()) {
                Object[] array = a.toArray();
                return h(array.length, array);
            }
            return a;
        }
        Object[] array2 = collection.toArray();
        v8.u0.h(array2.length, array2);
        return h(array2.length, array2);
    }

    public static z1 l(Object[] objArr) {
        if (objArr.length == 0) {
            return z1.f12062g;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        v8.u0.h(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static z1 n(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        v8.u0.h(5, objArr);
        return h(5, objArr);
    }

    public static z1 o(Object obj) {
        Object[] objArr = {obj};
        v8.u0.h(1, objArr);
        return h(1, objArr);
    }

    public static z1 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        v8.u0.h(2, objArr);
        return h(2, objArr);
    }

    public static z1 q(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        v8.u0.h(3, objArr);
        return h(3, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.k0
    public final r0 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k0
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
                    for (int i10 = 0; i10 < size; i10++) {
                        if (v8.u0.t(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && v8.u0.t(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // com.google.common.collect.k0
    /* renamed from: g */
    public final q2 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
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
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final n0 listIterator(int i10) {
        v8.u0.k(i10, size());
        if (isEmpty()) {
            return f12026c;
        }
        return new n0(i10, this);
    }

    public r0 r() {
        return size() <= 1 ? this : new o0(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public r0 subList(int i10, int i11) {
        v8.u0.l(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return z1.f12062g;
        }
        return new q0(this, i10, i12);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k0
    public Object writeReplace() {
        return new p0(toArray());
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
