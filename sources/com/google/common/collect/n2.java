package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class n2 extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12007b;

    public /* synthetic */ n2(int i10) {
        this.f12007b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f12007b) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f12007b) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f12007b) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f12007b) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f12007b) {
            case 0:
                collection.getClass();
                if (collection instanceof w1) {
                    collection = ((w1) collection).j();
                }
                boolean z10 = false;
                if ((collection instanceof Set) && collection.size() > size()) {
                    Iterator<E> it = iterator();
                    while (it.hasNext()) {
                        if (collection.contains(it.next())) {
                            it.remove();
                            z10 = true;
                        }
                    }
                } else {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        z10 |= remove(it2.next());
                    }
                }
                return z10;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f12007b) {
            case 0:
                collection.getClass();
                return super.retainAll(collection);
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2() {
        this(1);
        this.f12007b = 1;
    }
}
