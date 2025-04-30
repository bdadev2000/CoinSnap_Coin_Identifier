package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;

/* renamed from: com.google.protobuf.b3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1877b3 extends AbstractList {
    private final InterfaceC1870a3 converter;
    private final List<Object> fromList;

    public C1877b3(List<Object> list, InterfaceC1870a3 interfaceC1870a3) {
        this.fromList = list;
        this.converter = interfaceC1870a3;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i9) {
        return ((i5.D) this.converter).convert(this.fromList.get(i9));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.fromList.size();
    }
}
