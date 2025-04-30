package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class pb {

    /* loaded from: classes.dex */
    public static class a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final int[] f10001a;
        final int b;

        /* renamed from: c, reason: collision with root package name */
        final int f10002c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        public int[] a() {
            return Arrays.copyOfRange(this.f10001a, this.b, this.f10002c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if ((obj instanceof Integer) && pb.c(this.f10001a, ((Integer) obj).intValue(), this.b, this.f10002c) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i9 = 0; i9 < size; i9++) {
                    if (this.f10001a[this.b + i9] != aVar.f10001a[aVar.b + i9]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i9) {
            Preconditions.checkElementIndex(i9, size());
            return Integer.valueOf(this.f10001a[this.b + i9]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i9 = 1;
            for (int i10 = this.b; i10 < this.f10002c; i10++) {
                i9 = (i9 * 31) + pb.a(this.f10001a[i10]);
            }
            return i9;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int c9;
            if ((obj instanceof Integer) && (c9 = pb.c(this.f10001a, ((Integer) obj).intValue(), this.b, this.f10002c)) >= 0) {
                return c9 - this.b;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int d2;
            if ((obj instanceof Integer) && (d2 = pb.d(this.f10001a, ((Integer) obj).intValue(), this.b, this.f10002c)) >= 0) {
                return d2 - this.b;
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i9, Integer num) {
            Preconditions.checkElementIndex(i9, size());
            int[] iArr = this.f10001a;
            int i10 = this.b + i9;
            int i11 = iArr[i10];
            iArr[i10] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10002c - this.b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i9, int i10) {
            Preconditions.checkPositionIndexes(i9, i10, size());
            if (i9 == i10) {
                return Collections.emptyList();
            }
            int[] iArr = this.f10001a;
            int i11 = this.b;
            return new a(iArr, i9 + i11, i11 + i10);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f10001a[this.b]);
            int i9 = this.b;
            while (true) {
                i9++;
                if (i9 < this.f10002c) {
                    sb.append(", ");
                    sb.append(this.f10001a[i9]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        public a(int[] iArr, int i9, int i10) {
            this.f10001a = iArr;
            this.b = i9;
            this.f10002c = i10;
        }
    }

    public static int a(int i9) {
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int[] iArr, int i9, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int[] iArr, int i9, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (iArr[i12] == i9) {
                return i12;
            }
        }
        return -1;
    }

    public static int a(int i9, int i10) {
        if (i9 < i10) {
            return -1;
        }
        return i9 > i10 ? 1 : 0;
    }

    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int a(long j7) {
        int i9 = (int) j7;
        Preconditions.checkArgument(((long) i9) == j7, "Out of range: %s", j7);
        return i9;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = ((Number) Preconditions.checkNotNull(array[i9])).intValue();
        }
        return iArr;
    }
}
