package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final LazyStringList f19386a;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f19386a = lazyStringList;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final void D(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final LazyStringList E() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final Object F(int i2) {
        return this.f19386a.F(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.f19386a.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Iterator<String>(this) { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.2

            /* renamed from: a, reason: collision with root package name */
            public final Iterator f19388a;

            {
                this.f19388a = this.f19386a.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f19388a.hasNext();
            }

            @Override // java.util.Iterator
            public final String next() {
                return (String) this.f19388a.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new ListIterator<String>(this, i2) { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.1

            /* renamed from: a, reason: collision with root package name */
            public final ListIterator f19387a;

            {
                this.f19387a = this.f19386a.listIterator(i2);
            }

            @Override // java.util.ListIterator
            public final void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f19387a.hasNext();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f19387a.hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final Object next() {
                return (String) this.f19387a.next();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f19387a.nextIndex();
            }

            @Override // java.util.ListIterator
            public final String previous() {
                return (String) this.f19387a.previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f19387a.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public final void set(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final List s() {
        return this.f19386a.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19386a.size();
    }
}
