package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2044z3 extends AbstractC1894e implements InterfaceC1884c3, RandomAccess, InterfaceC1955m4 {
    private static final C2044z3 EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        C2044z3 c2044z3 = new C2044z3(new long[0], 0);
        EMPTY_LIST = c2044z3;
        c2044z3.makeImmutable();
    }

    public C2044z3() {
        this(new long[10], 0);
    }

    public static C2044z3 emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i9) {
        if (i9 >= 0 && i9 < this.size) {
        } else {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i9));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i9) {
        StringBuilder p2 = Q7.n0.p(i9, "Index:", ", Size:");
        p2.append(this.size);
        return p2.toString();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        C1898e3.checkNotNull(collection);
        if (!(collection instanceof C2044z3)) {
            return super.addAll(collection);
        }
        C2044z3 c2044z3 = (C2044z3) collection;
        int i9 = c2044z3.size;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            long[] jArr = this.array;
            if (i11 > jArr.length) {
                this.array = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(c2044z3.array, 0, this.array, this.size, c2044z3.size);
            this.size = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.InterfaceC1884c3
    public void addLong(long j7) {
        ensureIsMutable();
        int i9 = this.size;
        long[] jArr = this.array;
        if (i9 == jArr.length) {
            long[] jArr2 = new long[Q7.n0.v(i9, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        jArr3[i10] = j7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2044z3)) {
            return super.equals(obj);
        }
        C2044z3 c2044z3 = (C2044z3) obj;
        if (this.size != c2044z3.size) {
            return false;
        }
        long[] jArr = c2044z3.array;
        for (int i9 = 0; i9 < this.size; i9++) {
            if (this.array[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC1884c3
    public long getLong(int i9) {
        ensureIndexInRange(i9);
        return this.array[i9];
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            i9 = (i9 * 31) + C1898e3.hashLong(this.array[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.array[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i9, int i10) {
        ensureIsMutable();
        if (i10 >= i9) {
            long[] jArr = this.array;
            System.arraycopy(jArr, i10, jArr, i9, this.size - i10);
            this.size -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.InterfaceC1884c3
    public long setLong(int i9, long j7) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        long[] jArr = this.array;
        long j9 = jArr[i9];
        jArr[i9] = j7;
        return j9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C2044z3(long[] jArr, int i9) {
        this.array = jArr;
        this.size = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i9) {
        return Long.valueOf(getLong(i9));
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3, com.google.protobuf.U2
    public InterfaceC1884c3 mutableCopyWithCapacity(int i9) {
        if (i9 >= this.size) {
            return new C2044z3(Arrays.copyOf(this.array, i9), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Long remove(int i9) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        long[] jArr = this.array;
        long j7 = jArr[i9];
        if (i9 < this.size - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Long set(int i9, Long l) {
        return Long.valueOf(setLong(i9, l.longValue()));
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public void add(int i9, Long l) {
        addLong(i9, l.longValue());
    }

    private void addLong(int i9, long j7) {
        int i10;
        ensureIsMutable();
        if (i9 >= 0 && i9 <= (i10 = this.size)) {
            long[] jArr = this.array;
            if (i10 < jArr.length) {
                System.arraycopy(jArr, i9, jArr, i9 + 1, i10 - i9);
            } else {
                long[] jArr2 = new long[Q7.n0.v(i10, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i9);
                System.arraycopy(this.array, i9, jArr2, i9 + 1, this.size - i9);
                this.array = jArr2;
            }
            this.array[i9] = j7;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i9));
    }
}
