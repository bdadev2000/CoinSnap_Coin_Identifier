package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class v3 extends e implements c4, RandomAccess, n6 {
    private static final v3 EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        v3 v3Var = new v3(new int[0], 0);
        EMPTY_LIST = v3Var;
        v3Var.makeImmutable();
    }

    public v3() {
        this(new int[10], 0);
    }

    public static v3 emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        f4.checkNotNull(collection);
        if (!(collection instanceof v3)) {
            return super.addAll(collection);
        }
        v3 v3Var = (v3) collection;
        int i10 = v3Var.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.array;
            if (i12 > iArr.length) {
                this.array = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(v3Var.array, 0, this.array, this.size, v3Var.size);
            this.size = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.c4
    public void addInt(int i10) {
        ensureIsMutable();
        int i11 = this.size;
        int[] iArr = this.array;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a4.j.z(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        iArr3[i12] = i10;
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
        if (!(obj instanceof v3)) {
            return super.equals(obj);
        }
        v3 v3Var = (v3) obj;
        if (this.size != v3Var.size) {
            return false;
        }
        int[] iArr = v3Var.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (this.array[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c4
    public int getInt(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.size; i11++) {
            i10 = (i10 * 31) + this.array[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 >= i10) {
            int[] iArr = this.array;
            System.arraycopy(iArr, i11, iArr, i10, this.size - i11);
            this.size -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.c4
    public int setInt(int i10, int i11) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        int[] iArr = this.array;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private v3(int[] iArr, int i10) {
        this.array = iArr;
        this.size = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4, com.google.protobuf.d4
    public c4 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new v3(Arrays.copyOf(this.array, i10), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Integer remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        int[] iArr = this.array;
        int i11 = iArr[i10];
        if (i10 < this.size - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Integer num) {
        addInt(i10, num.intValue());
    }

    private void addInt(int i10, int i11) {
        int i12;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i12 = this.size)) {
            int[] iArr = this.array;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
            } else {
                int[] iArr2 = new int[a4.j.z(i12, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.array, i10, iArr2, i10 + 1, this.size - i10);
                this.array = iArr2;
            }
            this.array[i10] = i11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
