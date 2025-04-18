package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class a5 extends e implements d4, RandomAccess, n6 {
    private static final a5 EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        a5 a5Var = new a5(new long[0], 0);
        EMPTY_LIST = a5Var;
        a5Var.makeImmutable();
    }

    public a5() {
        this(new long[10], 0);
    }

    public static a5 emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i10) {
        if (i10 >= 0 && i10 < this.size) {
        } else {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i10) {
        StringBuilder m10 = a4.j.m("Index:", i10, ", Size:");
        m10.append(this.size);
        return m10.toString();
    }

    @Override // com.google.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        f4.checkNotNull(collection);
        if (!(collection instanceof a5)) {
            return super.addAll(collection);
        }
        a5 a5Var = (a5) collection;
        int i10 = a5Var.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.array;
            if (i12 > jArr.length) {
                this.array = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(a5Var.array, 0, this.array, this.size, a5Var.size);
            this.size = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.d4
    public void addLong(long j3) {
        ensureIsMutable();
        int i10 = this.size;
        long[] jArr = this.array;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[a4.j.z(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        jArr3[i11] = j3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return super.equals(obj);
        }
        a5 a5Var = (a5) obj;
        if (this.size != a5Var.size) {
            return false;
        }
        long[] jArr = a5Var.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (this.array[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.d4
    public long getLong(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.size; i11++) {
            i10 = (i10 * 31) + f4.hashLong(this.array[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 >= i10) {
            long[] jArr = this.array;
            System.arraycopy(jArr, i11, jArr, i10, this.size - i11);
            this.size -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.d4
    public long setLong(int i10, long j3) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        long[] jArr = this.array;
        long j10 = jArr[i10];
        jArr[i10] = j3;
        return j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private a5(long[] jArr, int i10) {
        this.array = jArr;
        this.size = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4, com.google.protobuf.d4
    public d4 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new a5(Arrays.copyOf(this.array, i10), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Long remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        long[] jArr = this.array;
        long j3 = jArr[i10];
        if (i10 < this.size - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j3);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Long set(int i10, Long l10) {
        return Long.valueOf(setLong(i10, l10.longValue()));
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l10) {
        addLong(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Long l10) {
        addLong(i10, l10.longValue());
    }

    private void addLong(int i10, long j3) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            long[] jArr = this.array;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[a4.j.z(i11, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.array, i10, jArr2, i10 + 1, this.size - i10);
                this.array = jArr2;
            }
            this.array[i10] = j3;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
