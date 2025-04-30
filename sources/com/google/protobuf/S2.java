package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class S2 extends AbstractC1894e implements Z2, RandomAccess, InterfaceC1955m4 {
    private static final S2 EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        S2 s22 = new S2(new int[0], 0);
        EMPTY_LIST = s22;
        s22.makeImmutable();
    }

    public S2() {
        this(new int[10], 0);
    }

    public static S2 emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        C1898e3.checkNotNull(collection);
        if (!(collection instanceof S2)) {
            return super.addAll(collection);
        }
        S2 s22 = (S2) collection;
        int i9 = s22.size;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            int[] iArr = this.array;
            if (i11 > iArr.length) {
                this.array = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(s22.array, 0, this.array, this.size, s22.size);
            this.size = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Z2
    public void addInt(int i9) {
        ensureIsMutable();
        int i10 = this.size;
        int[] iArr = this.array;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[Q7.n0.v(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        iArr3[i11] = i9;
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
        if (!(obj instanceof S2)) {
            return super.equals(obj);
        }
        S2 s22 = (S2) obj;
        if (this.size != s22.size) {
            return false;
        }
        int[] iArr = s22.array;
        for (int i9 = 0; i9 < this.size; i9++) {
            if (this.array[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Z2
    public int getInt(int i9) {
        ensureIndexInRange(i9);
        return this.array[i9];
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            i9 = (i9 * 31) + this.array[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.array[i9] == intValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i9, int i10) {
        ensureIsMutable();
        if (i10 >= i9) {
            int[] iArr = this.array;
            System.arraycopy(iArr, i10, iArr, i9, this.size - i10);
            this.size -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Z2
    public int setInt(int i9, int i10) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        int[] iArr = this.array;
        int i11 = iArr[i9];
        iArr[i9] = i10;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private S2(int[] iArr, int i9) {
        this.array = iArr;
        this.size = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i9) {
        return Integer.valueOf(getInt(i9));
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3, com.google.protobuf.U2
    public Z2 mutableCopyWithCapacity(int i9) {
        if (i9 >= this.size) {
            return new S2(Arrays.copyOf(this.array, i9), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Integer remove(int i9) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        int[] iArr = this.array;
        int i10 = iArr[i9];
        if (i9 < this.size - 1) {
            System.arraycopy(iArr, i9 + 1, iArr, i9, (r2 - i9) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Integer set(int i9, Integer num) {
        return Integer.valueOf(setInt(i9, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public void add(int i9, Integer num) {
        addInt(i9, num.intValue());
    }

    private void addInt(int i9, int i10) {
        int i11;
        ensureIsMutable();
        if (i9 >= 0 && i9 <= (i11 = this.size)) {
            int[] iArr = this.array;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i9, iArr, i9 + 1, i11 - i9);
            } else {
                int[] iArr2 = new int[Q7.n0.v(i11, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i9);
                System.arraycopy(this.array, i9, iArr2, i9 + 1, this.size - i9);
                this.array = iArr2;
            }
            this.array[i9] = i10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i9));
    }
}
