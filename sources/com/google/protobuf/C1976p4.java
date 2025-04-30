package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1976p4 extends AbstractC1894e implements RandomAccess {
    private static final C1976p4 EMPTY_LIST;
    private Object[] array;
    private int size;

    static {
        C1976p4 c1976p4 = new C1976p4(new Object[0], 0);
        EMPTY_LIST = c1976p4;
        c1976p4.makeImmutable();
    }

    public C1976p4() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i9) {
        return (E[]) new Object[i9];
    }

    public static <E> C1976p4 emptyList() {
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

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i9 = this.size;
        Object[] objArr = this.array;
        if (i9 == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i9) {
        ensureIndexInRange(i9);
        return this.array[i9];
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Object remove(int i9) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        Object[] objArr = this.array;
        Object obj = objArr[i9];
        if (i9 < this.size - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public Object set(int i9, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i9);
        Object[] objArr = this.array;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C1976p4(Object[] objArr, int i9) {
        this.array = objArr;
        this.size = i9;
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3, com.google.protobuf.U2
    public C1976p4 mutableCopyWithCapacity(int i9) {
        if (i9 >= this.size) {
            return new C1976p4(Arrays.copyOf(this.array, i9), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public void add(int i9, Object obj) {
        int i10;
        ensureIsMutable();
        if (i9 >= 0 && i9 <= (i10 = this.size)) {
            Object[] objArr = this.array;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i9, objArr, i9 + 1, i10 - i9);
            } else {
                Object[] createArray = createArray(Q7.n0.v(i10, 3, 2, 1));
                System.arraycopy(this.array, 0, createArray, 0, i9);
                System.arraycopy(this.array, i9, createArray, i9 + 1, this.size - i9);
                this.array = createArray;
            }
            this.array[i9] = obj;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i9));
    }
}
