package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class g1 extends e implements x3, RandomAccess, n6 {
    private static final g1 EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        g1 g1Var = new g1(new double[0], 0);
        EMPTY_LIST = g1Var;
        g1Var.makeImmutable();
    }

    public g1() {
        this(new double[10], 0);
    }

    public static g1 emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        f4.checkNotNull(collection);
        if (!(collection instanceof g1)) {
            return super.addAll(collection);
        }
        g1 g1Var = (g1) collection;
        int i10 = g1Var.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.array;
            if (i12 > dArr.length) {
                this.array = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(g1Var.array, 0, this.array, this.size, g1Var.size);
            this.size = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.x3
    public void addDouble(double d10) {
        ensureIsMutable();
        int i10 = this.size;
        double[] dArr = this.array;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[a4.j.z(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        dArr3[i11] = d10;
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
        if (!(obj instanceof g1)) {
            return super.equals(obj);
        }
        g1 g1Var = (g1) obj;
        if (this.size != g1Var.size) {
            return false;
        }
        double[] dArr = g1Var.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (Double.doubleToLongBits(this.array[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.x3
    public double getDouble(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.size; i11++) {
            i10 = (i10 * 31) + f4.hashLong(Double.doubleToLongBits(this.array[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 >= i10) {
            double[] dArr = this.array;
            System.arraycopy(dArr, i11, dArr, i10, this.size - i11);
            this.size -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.x3
    public double setDouble(int i10, double d10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        double[] dArr = this.array;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private g1(double[] dArr, int i10) {
        this.array = dArr;
        this.size = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4, com.google.protobuf.d4
    public x3 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new g1(Arrays.copyOf(this.array, i10), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Double remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        double[] dArr = this.array;
        double d10 = dArr[i10];
        if (i10 < this.size - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Double d10) {
        addDouble(i10, d10.doubleValue());
    }

    private void addDouble(int i10, double d10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            double[] dArr = this.array;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[a4.j.z(i11, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.array, i10, dArr2, i10 + 1, this.size - i10);
                this.array = dArr2;
            }
            this.array[i10] = d10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
