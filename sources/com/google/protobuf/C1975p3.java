package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1975p3 extends AbstractList implements RandomAccess {
    private final C1982q3 list;

    public C1975p3(C1982q3 c1982q3) {
        this.list = c1982q3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i9, H h6) {
        this.list.add(i9, h6);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public H get(int i9) {
        return this.list.getByteString(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    public H remove(int i9) {
        H asByteString;
        String remove = this.list.remove(i9);
        ((AbstractList) this).modCount++;
        asByteString = C1982q3.asByteString(remove);
        return asByteString;
    }

    @Override // java.util.AbstractList, java.util.List
    public H set(int i9, H h6) {
        Object andReturn;
        H asByteString;
        andReturn = this.list.setAndReturn(i9, h6);
        ((AbstractList) this).modCount++;
        asByteString = C1982q3.asByteString(andReturn);
        return asByteString;
    }
}
