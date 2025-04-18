package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class b3 extends e implements b4, RandomAccess, n6 {
    private static final b3 EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        b3 b3Var = new b3(new float[0], 0);
        EMPTY_LIST = b3Var;
        b3Var.makeImmutable();
    }

    public b3() {
        this(new float[10], 0);
    }

    public static b3 emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        f4.checkNotNull(collection);
        if (!(collection instanceof b3)) {
            return super.addAll(collection);
        }
        b3 b3Var = (b3) collection;
        int i10 = b3Var.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.array;
            if (i12 > fArr.length) {
                this.array = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(b3Var.array, 0, this.array, this.size, b3Var.size);
            this.size = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.b4
    public void addFloat(float f10) {
        ensureIsMutable();
        int i10 = this.size;
        float[] fArr = this.array;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a4.j.z(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        fArr3[i11] = f10;
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
        if (!(obj instanceof b3)) {
            return super.equals(obj);
        }
        b3 b3Var = (b3) obj;
        if (this.size != b3Var.size) {
            return false;
        }
        float[] fArr = b3Var.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (Float.floatToIntBits(this.array[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.b4
    public float getFloat(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.size; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.array[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 >= i10) {
            float[] fArr = this.array;
            System.arraycopy(fArr, i11, fArr, i10, this.size - i11);
            this.size -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.b4
    public float setFloat(int i10, float f10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        float[] fArr = this.array;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private b3(float[] fArr, int i10) {
        this.array = fArr;
        this.size = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4, com.google.protobuf.d4
    public b4 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new b3(Arrays.copyOf(this.array, i10), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Float remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        float[] fArr = this.array;
        float f10 = fArr[i10];
        if (i10 < this.size - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
        return true;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Float f10) {
        addFloat(i10, f10.floatValue());
    }

    private void addFloat(int i10, float f10) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            float[] fArr = this.array;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[a4.j.z(i11, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.array, i10, fArr2, i10 + 1, this.size - i10);
                this.array = fArr2;
            }
            this.array[i10] = f10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
