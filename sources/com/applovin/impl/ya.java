package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class ya extends AbstractCollection implements Serializable {
    private static final Object[] a = new Object[0];

    /* loaded from: classes.dex */
    public static abstract class b {
        public static int a(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    public abstract int a(Object[] objArr, int i10);

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

    int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
        return toArray(a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] b3 = b();
            if (b3 != null) {
                return jh.a(b3, d(), c(), objArr);
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
        Object[] a;

        /* renamed from: b, reason: collision with root package name */
        int f9165b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9166c;

        public a(int i10) {
            n3.a(i10, "initialCapacity");
            this.a = new Object[i10];
            this.f9165b = 0;
        }

        public a a(Object obj) {
            Preconditions.checkNotNull(obj);
            a(this.f9165b + 1);
            Object[] objArr = this.a;
            int i10 = this.f9165b;
            this.f9165b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        private void a(int i10) {
            Object[] objArr = this.a;
            if (objArr.length < i10) {
                this.a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f9166c = false;
            } else if (this.f9166c) {
                this.a = (Object[]) objArr.clone();
                this.f9166c = false;
            }
        }
    }
}
