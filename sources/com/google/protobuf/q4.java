package com.google.protobuf;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class q4 extends AbstractList implements RandomAccess {
    private final r4 list;

    public q4(r4 r4Var) {
        this.list = r4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, h0 h0Var) {
        this.list.add(i10, h0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public h0 get(int i10) {
        return this.list.getByteString(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public h0 remove(int i10) {
        h0 asByteString;
        String remove = this.list.remove(i10);
        ((AbstractList) this).modCount++;
        asByteString = r4.asByteString(remove);
        return asByteString;
    }

    @Override // java.util.AbstractList, java.util.List
    public h0 set(int i10, h0 h0Var) {
        Object andReturn;
        h0 asByteString;
        andReturn = this.list.setAndReturn(i10, h0Var);
        ((AbstractList) this).modCount++;
        asByteString = r4.asByteString(andReturn);
        return asByteString;
    }
}
