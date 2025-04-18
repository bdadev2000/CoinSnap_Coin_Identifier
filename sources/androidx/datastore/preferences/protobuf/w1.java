package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class w1 extends AbstractList implements m0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final m0 f1477b;

    public w1(m0 m0Var) {
        this.f1477b = m0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f1477b.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final Object getRaw(int i10) {
        return this.f1477b.getRaw(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final List getUnderlyingElements() {
        return this.f1477b.getUnderlyingElements();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final m0 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new v1(this);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void k(k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new u1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1477b.size();
    }
}
