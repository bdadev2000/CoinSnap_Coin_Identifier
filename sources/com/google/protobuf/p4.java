package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class p4 extends AbstractList implements RandomAccess {
    private final r4 list;

    public p4(r4 r4Var) {
        this.list = r4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, byte[] bArr) {
        this.list.add(i10, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] get(int i10) {
        return this.list.getByteArray(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] remove(int i10) {
        byte[] asByteArray;
        String remove = this.list.remove(i10);
        ((AbstractList) this).modCount++;
        asByteArray = r4.asByteArray(remove);
        return asByteArray;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] set(int i10, byte[] bArr) {
        Object andReturn;
        byte[] asByteArray;
        andReturn = this.list.setAndReturn(i10, bArr);
        ((AbstractList) this).modCount++;
        asByteArray = r4.asByteArray(andReturn);
        return asByteArray;
    }
}
