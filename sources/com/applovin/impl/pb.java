package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class pb {

    /* loaded from: classes.dex */
    public static class a extends AbstractList implements RandomAccess, Serializable {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        final int f6931b;

        /* renamed from: c, reason: collision with root package name */
        final int f6932c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        public int[] a() {
            return Arrays.copyOfRange(this.a, this.f6931b, this.f6932c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && pb.c(this.a, ((Integer) obj).intValue(), this.f6931b, this.f6932c) != -1;
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
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.a[this.f6931b + i10] != aVar.a[aVar.f6931b + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Integer.valueOf(this.a[this.f6931b + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f6931b; i11 < this.f6932c; i11++) {
                i10 = (i10 * 31) + pb.a(this.a[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int c10;
            if ((obj instanceof Integer) && (c10 = pb.c(this.a, ((Integer) obj).intValue(), this.f6931b, this.f6932c)) >= 0) {
                return c10 - this.f6931b;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int d10;
            if ((obj instanceof Integer) && (d10 = pb.d(this.a, ((Integer) obj).intValue(), this.f6931b, this.f6932c)) >= 0) {
                return d10 - this.f6931b;
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i10, Integer num) {
            Preconditions.checkElementIndex(i10, size());
            int[] iArr = this.a;
            int i11 = this.f6931b + i10;
            int i12 = iArr[i11];
            iArr[i11] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6932c - this.f6931b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.a;
            int i12 = this.f6931b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.a[this.f6931b]);
            int i10 = this.f6931b;
            while (true) {
                i10++;
                if (i10 < this.f6932c) {
                    sb2.append(", ");
                    sb2.append(this.a[i10]);
                } else {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
            }
        }

        public a(int[] iArr, int i10, int i11) {
            this.a = iArr;
            this.f6931b = i10;
            this.f6932c = i11;
        }
    }

    public static int a(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int a(long j3) {
        int i10 = (int) j3;
        Preconditions.checkArgument(((long) i10) == j3, "Out of range: %s", j3);
        return i10;
    }

    public static int[] a(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) Preconditions.checkNotNull(array[i10])).intValue();
        }
        return iArr;
    }
}
