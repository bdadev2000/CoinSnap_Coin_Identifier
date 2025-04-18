package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class x8 extends AbstractList implements s4, RandomAccess {
    private final s4 list;

    public x8(s4 s4Var) {
        this.list = s4Var;
    }

    @Override // com.google.protobuf.s4
    public void add(h0 h0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.s4
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.s4
    public boolean addAllByteString(Collection<? extends h0> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.s4
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.protobuf.s4, com.google.protobuf.r6
    public List<h0> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // com.google.protobuf.s4
    public byte[] getByteArray(int i10) {
        return this.list.getByteArray(i10);
    }

    @Override // com.google.protobuf.s4
    public h0 getByteString(int i10) {
        return this.list.getByteString(i10);
    }

    @Override // com.google.protobuf.s4
    public Object getRaw(int i10) {
        return this.list.getRaw(i10);
    }

    @Override // com.google.protobuf.s4
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // com.google.protobuf.s4
    public s4 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new w8(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new v8(this, i10);
    }

    @Override // com.google.protobuf.s4
    public void mergeFrom(s4 s4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.s4
    public void set(int i10, h0 h0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.protobuf.s4
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        return (String) this.list.get(i10);
    }

    @Override // com.google.protobuf.s4
    public void set(int i10, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
