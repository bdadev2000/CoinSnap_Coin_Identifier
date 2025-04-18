package com.google.common.collect;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class k0 extends AbstractCollection implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f11988b = new Object[0];

    public abstract r0 a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr, int i10) {
        q2 it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract q2 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f11988b);
    }

    Object writeReplace() {
        return new p0(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] c10 = c();
            if (c10 != null) {
                return Arrays.copyOfRange(c10, e(), d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
