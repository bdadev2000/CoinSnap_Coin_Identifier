package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1991s extends AbstractC1894e implements T2, RandomAccess, InterfaceC1955m4 {
    private static final C1991s EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        C1991s c1991s = new C1991s(new boolean[0], 0);
        EMPTY_LIST = c1991s;
        c1991s.makeImmutable();
    }

    public C1991s() {
        this(new boolean[10], 0);
    }

    public static C1991s emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        C1898e3.checkNotNull(collection);
        if (!(collection instanceof C1991s)) {
            return super.addAll(collection);
        }
        C1991s c1991s = (C1991s) collection;
        int i9 = c1991s.size;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            boolean[] zArr = this.array;
            if (i11 > zArr.length) {
                this.array = Arrays.copyOf(zArr, i11);
            }
            System.arraycopy(c1991s.array, 0, this.array, this.size, c1991s.size);
            this.size = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.T2
    public void addBoolean(boolean z8) {
        ensureIsMutable();
        int i9 = this.size;
        boolean[] zArr = this.array;
        if (i9 == zArr.length) {
            boolean[] zArr2 = new boolean[Q7.n0.v(i9, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i9);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        zArr3[i10] = z8;
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
        if (!(obj instanceof C1991s)) {
            return super.equals(obj);
        }
        C1991s c1991s = (C1991s) obj;
        if (this.size != c1991s.size) {
            return false;
        }
        boolean[] zArr = c1991s.array;
        for (int i9 = 0; i9 < this.size; i9++) {
            if (this.array[i9] != zArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.T2
    public boolean getBoolean(int i9) {
        ensureIndexInRange(i9);
        return this.array[i9];
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            i9 = (i9 * 31) + C1898e3.hashBoolean(this.array[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.array[i9] == booleanValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i9, int i10) {
        ensureIsMutable();
        if (i10 >= i9) {
            boolean[] zArr = this.array;
            System.arraycopy(zArr, i10, zArr, i9, this.size - i10);
            this.size -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.T2
    public boolean setBoolean(int i9, boolean z8) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        boolean[] zArr = this.array;
        boolean z9 = zArr[i9];
        zArr[i9] = z8;
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C1991s(boolean[] zArr, int i9) {
        this.array = zArr;
        this.size = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i9) {
        return Boolean.valueOf(getBoolean(i9));
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3, com.google.protobuf.U2
    public T2 mutableCopyWithCapacity(int i9) {
        if (i9 >= this.size) {
            return new C1991s(Arrays.copyOf(this.array, i9), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Boolean remove(int i9) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        boolean[] zArr = this.array;
        boolean z8 = zArr[i9];
        if (i9 < this.size - 1) {
            System.arraycopy(zArr, i9 + 1, zArr, i9, (r2 - i9) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Boolean set(int i9, Boolean bool) {
        return Boolean.valueOf(setBoolean(i9, bool.booleanValue()));
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public void add(int i9, Boolean bool) {
        addBoolean(i9, bool.booleanValue());
    }

    private void addBoolean(int i9, boolean z8) {
        int i10;
        ensureIsMutable();
        if (i9 >= 0 && i9 <= (i10 = this.size)) {
            boolean[] zArr = this.array;
            if (i10 < zArr.length) {
                System.arraycopy(zArr, i9, zArr, i9 + 1, i10 - i9);
            } else {
                boolean[] zArr2 = new boolean[Q7.n0.v(i10, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i9);
                System.arraycopy(this.array, i9, zArr2, i9 + 1, this.size - i9);
                this.array = zArr2;
            }
            this.array[i9] = z8;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i9));
    }
}
