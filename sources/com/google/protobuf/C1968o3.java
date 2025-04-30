package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1968o3 extends AbstractList implements RandomAccess {
    private final C1982q3 list;

    public C1968o3(C1982q3 c1982q3) {
        this.list = c1982q3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i9, byte[] bArr) {
        this.list.add(i9, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] get(int i9) {
        return this.list.getByteArray(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] remove(int i9) {
        byte[] asByteArray;
        String remove = this.list.remove(i9);
        ((AbstractList) this).modCount++;
        asByteArray = C1982q3.asByteArray(remove);
        return asByteArray;
    }

    @Override // java.util.AbstractList, java.util.List
    public byte[] set(int i9, byte[] bArr) {
        Object andReturn;
        byte[] asByteArray;
        andReturn = this.list.setAndReturn(i9, bArr);
        ((AbstractList) this).modCount++;
        asByteArray = C1982q3.asByteArray(andReturn);
        return asByteArray;
    }
}
