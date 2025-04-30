package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1982q3 extends AbstractC1894e implements InterfaceC1988r3, RandomAccess {
    public static final InterfaceC1988r3 EMPTY;
    private static final C1982q3 EMPTY_LIST;
    private final List<Object> list;

    static {
        C1982q3 c1982q3 = new C1982q3();
        EMPTY_LIST = c1982q3;
        c1982q3.makeImmutable();
        EMPTY = c1982q3;
    }

    public C1982q3() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return C1898e3.toByteArray((String) obj);
        }
        return ((H) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static H asByteString(Object obj) {
        if (obj instanceof H) {
            return (H) obj;
        }
        if (obj instanceof String) {
            return H.copyFromUtf8((String) obj);
        }
        return H.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof H) {
            return ((H) obj).toStringUtf8();
        }
        return C1898e3.toStringUtf8((byte[]) obj);
    }

    public static C1982q3 emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i9, H h6) {
        ensureIsMutable();
        return this.list.set(i9, h6);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public boolean addAllByteString(Collection<? extends H> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public List<byte[]> asByteArrayList() {
        return new C1968o3(this);
    }

    @Override // com.google.protobuf.InterfaceC1988r3, com.google.protobuf.InterfaceC1983q4
    public List<H> asByteStringList() {
        return new C1975p3(this);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC1988r3
    public byte[] getByteArray(int i9) {
        Object obj = this.list.get(i9);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i9, asByteArray);
        }
        return asByteArray;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public H getByteString(int i9) {
        Object obj = this.list.get(i9);
        H asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i9, asByteString);
        }
        return asByteString;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public Object getRaw(int i9) {
        return this.list.get(i9);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public InterfaceC1988r3 getUnmodifiableView() {
        if (isModifiable()) {
            return new C2025w5(this);
        }
        return this;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void mergeFrom(InterfaceC1988r3 interfaceC1988r3) {
        ensureIsMutable();
        for (Object obj : interfaceC1988r3.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    public C1982q3(int i9) {
        this((ArrayList<Object>) new ArrayList(i9));
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public boolean addAll(int i9, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof InterfaceC1988r3) {
            collection = ((InterfaceC1988r3) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i9) {
        Object obj = this.list.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof H) {
            H h6 = (H) obj;
            String stringUtf8 = h6.toStringUtf8();
            if (h6.isValidUtf8()) {
                this.list.set(i9, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = C1898e3.toStringUtf8(bArr);
        if (C1898e3.isValidUtf8(bArr)) {
            this.list.set(i9, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // com.google.protobuf.AbstractC1894e, com.google.protobuf.InterfaceC1891d3, com.google.protobuf.U2
    public C1982q3 mutableCopyWithCapacity(int i9) {
        if (i9 >= size()) {
            ArrayList arrayList = new ArrayList(i9);
            arrayList.addAll(this.list);
            return new C1982q3((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public String set(int i9, String str) {
        ensureIsMutable();
        return asString(this.list.set(i9, str));
    }

    public C1982q3(InterfaceC1988r3 interfaceC1988r3) {
        this.list = new ArrayList(interfaceC1988r3.size());
        addAll(interfaceC1988r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i9, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i9, bArr);
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public void add(int i9, String str) {
        ensureIsMutable();
        this.list.add(i9, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1894e, java.util.AbstractList, java.util.List
    public String remove(int i9) {
        ensureIsMutable();
        Object remove = this.list.remove(i9);
        ((AbstractList) this).modCount++;
        return asString(remove);
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void set(int i9, H h6) {
        setAndReturn(i9, h6);
    }

    public C1982q3(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i9, H h6) {
        ensureIsMutable();
        this.list.add(i9, h6);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void set(int i9, byte[] bArr) {
        setAndReturn(i9, bArr);
    }

    private C1982q3(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i9, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i9, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void add(H h6) {
        ensureIsMutable();
        this.list.add(h6);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC1988r3
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
