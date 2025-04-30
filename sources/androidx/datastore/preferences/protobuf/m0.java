package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m0 extends AbstractList implements D, RandomAccess {
    public final D b;

    public m0(D d2) {
        this.b = d2;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void a(C0432g c0432g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return (String) this.b.get(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final Object getRaw(int i9) {
        return this.b.getRaw(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List getUnderlyingElements() {
        return this.b.getUnderlyingElements();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final D getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new l0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new k0(this, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
