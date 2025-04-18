package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class s extends e implements w3, RandomAccess, n6 {
    private static final s EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        s sVar = new s(new boolean[0], 0);
        EMPTY_LIST = sVar;
        sVar.makeImmutable();
    }

    public s() {
        this(new boolean[10], 0);
    }

    public static s emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        f4.checkNotNull(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int i10 = sVar.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.array;
            if (i12 > zArr.length) {
                this.array = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(sVar.array, 0, this.array, this.size, sVar.size);
            this.size = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.w3
    public void addBoolean(boolean z10) {
        ensureIsMutable();
        int i10 = this.size;
        boolean[] zArr = this.array;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a4.j.z(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        zArr3[i11] = z10;
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
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.size != sVar.size) {
            return false;
        }
        boolean[] zArr = sVar.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (this.array[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.w3
    public boolean getBoolean(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.size; i11++) {
            i10 = (i10 * 31) + f4.hashBoolean(this.array[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 >= i10) {
            boolean[] zArr = this.array;
            System.arraycopy(zArr, i11, zArr, i10, this.size - i11);
            this.size -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.w3
    public boolean setBoolean(int i10, boolean z10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        boolean[] zArr = this.array;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private s(boolean[] zArr, int i10) {
        this.array = zArr;
        this.size = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4, com.google.protobuf.d4
    public w3 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new s(Arrays.copyOf(this.array, i10), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Boolean remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        boolean[] zArr = this.array;
        boolean z10 = zArr[i10];
        if (i10 < this.size - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Boolean bool) {
        addBoolean(i10, bool.booleanValue());
    }

    private void addBoolean(int i10, boolean z10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            boolean[] zArr = this.array;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[a4.j.z(i11, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.array, i10, zArr2, i10 + 1, this.size - i10);
                this.array = zArr2;
            }
            this.array[i10] = z10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
