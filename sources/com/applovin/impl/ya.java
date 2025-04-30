package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class ya extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f12366a = new Object[0];

    /* loaded from: classes.dex */
    public static abstract class b {
        public static int a(int i9, int i10) {
            if (i10 >= 0) {
                int i11 = i9 + (i9 >> 1) + 1;
                if (i11 < i10) {
                    i11 = Integer.highestOneBit(i10 - 1) << 1;
                }
                if (i11 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i11;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    public abstract int a(Object[] objArr, int i9);

    public ab a() {
        return isEmpty() ? ab.h() : ab.a(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object[] b() {
        return null;
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract qp iterator();

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
        return toArray(f12366a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] b8 = b();
            if (b8 != null) {
                return jh.a(b8, d(), c(), objArr);
            }
            objArr = cg.b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    /* loaded from: classes.dex */
    public static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f12367a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        boolean f12368c;

        public a(int i9) {
            n3.a(i9, "initialCapacity");
            this.f12367a = new Object[i9];
            this.b = 0;
        }

        public a a(Object obj) {
            Preconditions.checkNotNull(obj);
            a(this.b + 1);
            Object[] objArr = this.f12367a;
            int i9 = this.b;
            this.b = i9 + 1;
            objArr[i9] = obj;
            return this;
        }

        private void a(int i9) {
            Object[] objArr = this.f12367a;
            if (objArr.length < i9) {
                this.f12367a = Arrays.copyOf(objArr, b.a(objArr.length, i9));
                this.f12368c = false;
            } else if (this.f12368c) {
                this.f12367a = (Object[]) objArr.clone();
                this.f12368c = false;
            }
        }
    }
}
