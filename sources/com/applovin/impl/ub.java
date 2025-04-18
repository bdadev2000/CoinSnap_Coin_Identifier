package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class ub {

    /* loaded from: classes2.dex */
    public static class a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final int[] f27309a;

        /* renamed from: b, reason: collision with root package name */
        final int f27310b;

        /* renamed from: c, reason: collision with root package name */
        final int f27311c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        public int[] a() {
            return Arrays.copyOfRange(this.f27309a, this.f27310b, this.f27311c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && ub.c(this.f27309a, ((Integer) obj).intValue(), this.f27310b, this.f27311c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f27309a[this.f27310b + i2] != aVar.f27309a[aVar.f27310b + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i2) {
            Preconditions.checkElementIndex(i2, size());
            return Integer.valueOf(this.f27309a[this.f27310b + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f27310b; i3 < this.f27311c; i3++) {
                i2 = (i2 * 31) + ub.a(this.f27309a[i3]);
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int c2;
            if (!(obj instanceof Integer) || (c2 = ub.c(this.f27309a, ((Integer) obj).intValue(), this.f27310b, this.f27311c)) < 0) {
                return -1;
            }
            return c2 - this.f27310b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int d;
            if (!(obj instanceof Integer) || (d = ub.d(this.f27309a, ((Integer) obj).intValue(), this.f27310b, this.f27311c)) < 0) {
                return -1;
            }
            return d - this.f27310b;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i2, Integer num) {
            Preconditions.checkElementIndex(i2, size());
            int[] iArr = this.f27309a;
            int i3 = this.f27310b + i2;
            int i4 = iArr[i3];
            iArr[i3] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f27311c - this.f27310b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i2, int i3) {
            Preconditions.checkPositionIndexes(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            int[] iArr = this.f27309a;
            int i4 = this.f27310b;
            return new a(iArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f27309a[this.f27310b]);
            int i2 = this.f27310b;
            while (true) {
                i2++;
                if (i2 >= this.f27311c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f27309a[i2]);
            }
        }

        public a(int[] iArr, int i2, int i3) {
            this.f27309a = iArr;
            this.f27310b = i2;
            this.f27311c = i3;
        }
    }

    public static int a(int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int[] iArr, int i2, int i3, int i4) {
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            if (iArr[i5] == i2) {
                return i5;
            }
        }
        return -1;
    }

    public static int a(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int a(long j2) {
        int i2 = (int) j2;
        Preconditions.checkArgument(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((Number) Preconditions.checkNotNull(array[i2])).intValue();
        }
        return iArr;
    }
}
