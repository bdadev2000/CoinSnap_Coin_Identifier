package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2025w5 extends AbstractList implements InterfaceC1988r3, RandomAccess {
    private final InterfaceC1988r3 list;

    public C2025w5(InterfaceC1988r3 interfaceC1988r3) {
        this.list = interfaceC1988r3;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void add(H h6) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public boolean addAllByteString(Collection<? extends H> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.protobuf.InterfaceC1988r3, com.google.protobuf.InterfaceC1983q4
    public List<H> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public byte[] getByteArray(int i9) {
        return this.list.getByteArray(i9);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public H getByteString(int i9) {
        return this.list.getByteString(i9);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public Object getRaw(int i9) {
        return this.list.getRaw(i9);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public InterfaceC1988r3 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C2018v5(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i9) {
        return new C2011u5(this, i9);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void mergeFrom(InterfaceC1988r3 interfaceC1988r3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void set(int i9, H h6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i9) {
        return (String) this.list.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void set(int i9, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
