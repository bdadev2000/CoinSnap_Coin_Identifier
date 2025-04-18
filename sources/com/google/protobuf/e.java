package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class e extends AbstractList implements e4 {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable = true;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> collection) {
        ensureIsMutable();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        super.clear();
    }

    public void ensureIsMutable() {
        if (this.isMutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // com.google.protobuf.e4
    public boolean isModifiable() {
        return this.isMutable;
    }

    @Override // com.google.protobuf.e4
    public final void makeImmutable() {
        this.isMutable = false;
    }

    public abstract /* synthetic */ e4 mutableCopyWithCapacity(int i10);

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        ensureIsMutable();
        return super.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        ensureIsMutable();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        ensureIsMutable();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        ensureIsMutable();
        return super.set(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        ensureIsMutable();
        super.add(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        ensureIsMutable();
        return super.addAll(i10, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
