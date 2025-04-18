package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class r4 extends e implements s4, RandomAccess {
    public static final s4 EMPTY;
    private static final r4 EMPTY_LIST;
    private final List<Object> list;

    static {
        r4 r4Var = new r4();
        EMPTY_LIST = r4Var;
        r4Var.makeImmutable();
        EMPTY = r4Var;
    }

    public r4() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return f4.toByteArray((String) obj);
        }
        return ((h0) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 asByteString(Object obj) {
        if (obj instanceof h0) {
            return (h0) obj;
        }
        if (obj instanceof String) {
            return h0.copyFromUtf8((String) obj);
        }
        return h0.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h0) {
            return ((h0) obj).toStringUtf8();
        }
        return f4.toStringUtf8((byte[]) obj);
    }

    public static r4 emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i10, h0 h0Var) {
        ensureIsMutable();
        return this.list.set(i10, h0Var);
    }

    @Override // com.google.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.s4
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.s4
    public boolean addAllByteString(Collection<? extends h0> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.s4
    public List<byte[]> asByteArrayList() {
        return new p4(this);
    }

    @Override // com.google.protobuf.s4, com.google.protobuf.r6
    public List<h0> asByteStringList() {
        return new q4(this);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.s4
    public byte[] getByteArray(int i10) {
        Object obj = this.list.get(i10);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i10, asByteArray);
        }
        return asByteArray;
    }

    @Override // com.google.protobuf.s4
    public h0 getByteString(int i10) {
        Object obj = this.list.get(i10);
        h0 asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i10, asByteString);
        }
        return asByteString;
    }

    @Override // com.google.protobuf.s4
    public Object getRaw(int i10) {
        return this.list.get(i10);
    }

    @Override // com.google.protobuf.s4
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // com.google.protobuf.s4
    public s4 getUnmodifiableView() {
        if (isModifiable()) {
            return new x8(this);
        }
        return this;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.s4
    public void mergeFrom(s4 s4Var) {
        ensureIsMutable();
        for (Object obj : s4Var.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    public r4(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof s4) {
            collection = ((s4) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        Object obj = this.list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            String stringUtf8 = h0Var.toStringUtf8();
            if (h0Var.isValidUtf8()) {
                this.list.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = f4.toStringUtf8(bArr);
        if (f4.isValidUtf8(bArr)) {
            this.list.set(i10, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // com.google.protobuf.e, com.google.protobuf.e4, com.google.protobuf.d4
    public r4 mutableCopyWithCapacity(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.list);
            return new r4((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public String set(int i10, String str) {
        ensureIsMutable();
        return asString(this.list.set(i10, str));
    }

    public r4(s4 s4Var) {
        this.list = new ArrayList(s4Var.size());
        addAll(s4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i10, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i10, bArr);
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, String str) {
        ensureIsMutable();
        this.list.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.e, java.util.AbstractList, java.util.List
    public String remove(int i10) {
        ensureIsMutable();
        Object remove = this.list.remove(i10);
        ((AbstractList) this).modCount++;
        return asString(remove);
    }

    @Override // com.google.protobuf.s4
    public void set(int i10, h0 h0Var) {
        setAndReturn(i10, h0Var);
    }

    public r4(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i10, h0 h0Var) {
        ensureIsMutable();
        this.list.add(i10, h0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.s4
    public void set(int i10, byte[] bArr) {
        setAndReturn(i10, bArr);
    }

    private r4(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i10, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i10, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.s4
    public void add(h0 h0Var) {
        ensureIsMutable();
        this.list.add(h0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.s4
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
