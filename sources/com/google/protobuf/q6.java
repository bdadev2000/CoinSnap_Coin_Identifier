package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class q6 extends e implements RandomAccess {
    private static final q6 EMPTY_LIST;
    private Object[] array;
    private int size;

    static {
        q6 q6Var = new q6(new Object[0], 0);
        EMPTY_LIST = q6Var;
        q6Var.makeImmutable();
    }

    public q6() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> q6 emptyList() {
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

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i10 = this.size;
        Object[] objArr = this.array;
        if (i10 == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        Object[] objArr = this.array;
        Object obj = objArr[i10];
        if (i10 < this.size - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        Object[] objArr = this.array;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private q6(Object[] objArr, int i10) {
        this.array = objArr;
        this.size = i10;
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4, com.google.protobuf.d4
    public q6 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.size) {
            return new q6(Arrays.copyOf(this.array, i10), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.size)) {
            Object[] objArr = this.array;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] createArray = createArray(a4.j.z(i11, 3, 2, 1));
                System.arraycopy(this.array, 0, createArray, 0, i10);
                System.arraycopy(this.array, i10, createArray, i10 + 1, this.size - i10);
                this.array = createArray;
            }
            this.array[i10] = obj;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
    }
}
