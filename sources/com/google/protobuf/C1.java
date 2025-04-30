package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class C1 extends AbstractC1894e implements U2, RandomAccess, InterfaceC1955m4 {
    private static final C1 EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        C1 c12 = new C1(new double[0], 0);
        EMPTY_LIST = c12;
        c12.makeImmutable();
    }

    public C1() {
        this(new double[10], 0);
    }

    public static C1 emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        C1898e3.checkNotNull(collection);
        if (!(collection instanceof C1)) {
            return super.addAll(collection);
        }
        C1 c12 = (C1) collection;
        int i9 = c12.size;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            double[] dArr = this.array;
            if (i11 > dArr.length) {
                this.array = Arrays.copyOf(dArr, i11);
            }
            System.arraycopy(c12.array, 0, this.array, this.size, c12.size);
            this.size = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.U2
    public void addDouble(double d2) {
        ensureIsMutable();
        int i9 = this.size;
        double[] dArr = this.array;
        if (i9 == dArr.length) {
            double[] dArr2 = new double[Q7.n0.v(i9, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i9);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        dArr3[i10] = d2;
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
        if (!(obj instanceof C1)) {
            return super.equals(obj);
        }
        C1 c12 = (C1) obj;
        if (this.size != c12.size) {
            return false;
        }
        double[] dArr = c12.array;
        for (int i9 = 0; i9 < this.size; i9++) {
            if (Double.doubleToLongBits(this.array[i9]) != Double.doubleToLongBits(dArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.U2
    public double getDouble(int i9) {
        ensureIndexInRange(i9);
        return this.array[i9];
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            i9 = (i9 * 31) + C1898e3.hashLong(Double.doubleToLongBits(this.array[i10]));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.array[i9] == doubleValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i9, int i10) {
        ensureIsMutable();
        if (i10 >= i9) {
            double[] dArr = this.array;
            System.arraycopy(dArr, i10, dArr, i9, this.size - i10);
            this.size -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.U2
    public double setDouble(int i9, double d2) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        double[] dArr = this.array;
        double d9 = dArr[i9];
        dArr[i9] = d2;
        return d9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C1(double[] dArr, int i9) {
        this.array = dArr;
        this.size = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i9) {
        return Double.valueOf(getDouble(i9));
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3, com.google.protobuf.U2
    public U2 mutableCopyWithCapacity(int i9) {
        if (i9 >= this.size) {
            return new C1(Arrays.copyOf(this.array, i9), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Double remove(int i9) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        double[] dArr = this.array;
        double d2 = dArr[i9];
        if (i9 < this.size - 1) {
            System.arraycopy(dArr, i9 + 1, dArr, i9, (r3 - i9) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Double set(int i9, Double d2) {
        return Double.valueOf(setDouble(i9, d2.doubleValue()));
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d2) {
        addDouble(d2.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public void add(int i9, Double d2) {
        addDouble(i9, d2.doubleValue());
    }

    private void addDouble(int i9, double d2) {
        int i10;
        ensureIsMutable();
        if (i9 >= 0 && i9 <= (i10 = this.size)) {
            double[] dArr = this.array;
            if (i10 < dArr.length) {
                System.arraycopy(dArr, i9, dArr, i9 + 1, i10 - i9);
            } else {
                double[] dArr2 = new double[Q7.n0.v(i10, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i9);
                System.arraycopy(this.array, i9, dArr2, i9 + 1, this.size - i9);
                this.array = dArr2;
            }
            this.array[i9] = d2;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i9));
    }
}
