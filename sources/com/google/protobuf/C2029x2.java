package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2029x2 extends AbstractC1894e implements Y2, RandomAccess, InterfaceC1955m4 {
    private static final C2029x2 EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        C2029x2 c2029x2 = new C2029x2(new float[0], 0);
        EMPTY_LIST = c2029x2;
        c2029x2.makeImmutable();
    }

    public C2029x2() {
        this(new float[10], 0);
    }

    public static C2029x2 emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        C1898e3.checkNotNull(collection);
        if (!(collection instanceof C2029x2)) {
            return super.addAll(collection);
        }
        C2029x2 c2029x2 = (C2029x2) collection;
        int i9 = c2029x2.size;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            float[] fArr = this.array;
            if (i11 > fArr.length) {
                this.array = Arrays.copyOf(fArr, i11);
            }
            System.arraycopy(c2029x2.array, 0, this.array, this.size, c2029x2.size);
            this.size = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Y2
    public void addFloat(float f9) {
        ensureIsMutable();
        int i9 = this.size;
        float[] fArr = this.array;
        if (i9 == fArr.length) {
            float[] fArr2 = new float[Q7.n0.v(i9, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i9);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        fArr3[i10] = f9;
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
        if (!(obj instanceof C2029x2)) {
            return super.equals(obj);
        }
        C2029x2 c2029x2 = (C2029x2) obj;
        if (this.size != c2029x2.size) {
            return false;
        }
        float[] fArr = c2029x2.array;
        for (int i9 = 0; i9 < this.size; i9++) {
            if (Float.floatToIntBits(this.array[i9]) != Float.floatToIntBits(fArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Y2
    public float getFloat(int i9) {
        ensureIndexInRange(i9);
        return this.array[i9];
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            i9 = (i9 * 31) + Float.floatToIntBits(this.array[i10]);
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.array[i9] == floatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i9, int i10) {
        ensureIsMutable();
        if (i10 >= i9) {
            float[] fArr = this.array;
            System.arraycopy(fArr, i10, fArr, i9, this.size - i10);
            this.size -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Y2
    public float setFloat(int i9, float f9) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        float[] fArr = this.array;
        float f10 = fArr[i9];
        fArr[i9] = f9;
        return f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C2029x2(float[] fArr, int i9) {
        this.array = fArr;
        this.size = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i9) {
        return Float.valueOf(getFloat(i9));
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3, com.google.protobuf.U2
    public Y2 mutableCopyWithCapacity(int i9) {
        if (i9 >= this.size) {
            return new C2029x2(Arrays.copyOf(this.array, i9), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Float remove(int i9) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        float[] fArr = this.array;
        float f9 = fArr[i9];
        if (i9 < this.size - 1) {
            System.arraycopy(fArr, i9 + 1, fArr, i9, (r2 - i9) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f9);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Float set(int i9, Float f9) {
        return Float.valueOf(setFloat(i9, f9.floatValue()));
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f9) {
        addFloat(f9.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public void add(int i9, Float f9) {
        addFloat(i9, f9.floatValue());
    }

    private void addFloat(int i9, float f9) {
        int i10;
        ensureIsMutable();
        if (i9 >= 0 && i9 <= (i10 = this.size)) {
            float[] fArr = this.array;
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i9, fArr, i9 + 1, i10 - i9);
            } else {
                float[] fArr2 = new float[Q7.n0.v(i10, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i9);
                System.arraycopy(this.array, i9, fArr2, i9 + 1, this.size - i9);
                this.array = fArr2;
            }
            this.array[i9] = f9;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i9));
    }
}
