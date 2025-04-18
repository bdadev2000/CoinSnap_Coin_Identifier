package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class cb extends AbstractCollection implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f23260a = new Object[0];

    /* loaded from: classes.dex */
    public static abstract class b {
        public static int a(int i2, int i3) {
            if (i3 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i4 = i2 + (i2 >> 1) + 1;
            if (i4 < i3) {
                i4 = Integer.highestOneBit(i3 - 1) << 1;
            }
            return i4 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i4;
        }
    }

    public abstract int a(Object[] objArr, int i2);

    public eb a() {
        return isEmpty() ? eb.h() : eb.a(toArray());
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

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract pp iterator();

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
        return toArray(f23260a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] b2 = b();
            if (b2 != null) {
                return mh.a(b2, d(), c(), objArr);
            }
            objArr = gg.b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    /* loaded from: classes.dex */
    public static abstract class a extends b {

        /* renamed from: a, reason: collision with root package name */
        Object[] f23261a;

        /* renamed from: b, reason: collision with root package name */
        int f23262b;

        /* renamed from: c, reason: collision with root package name */
        boolean f23263c;

        public a(int i2) {
            p3.a(i2, "initialCapacity");
            this.f23261a = new Object[i2];
            this.f23262b = 0;
        }

        public a a(Object obj) {
            Preconditions.checkNotNull(obj);
            a(this.f23262b + 1);
            Object[] objArr = this.f23261a;
            int i2 = this.f23262b;
            this.f23262b = i2 + 1;
            objArr[i2] = obj;
            return this;
        }

        private void a(int i2) {
            Object[] objArr = this.f23261a;
            if (objArr.length < i2) {
                this.f23261a = Arrays.copyOf(objArr, b.a(objArr.length, i2));
                this.f23263c = false;
            } else if (this.f23263c) {
                this.f23261a = (Object[]) objArr.clone();
                this.f23263c = false;
            }
        }
    }
}
