package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class m2 extends l2 implements SortedSet {
    public m2(SortedSet sortedSet, ra.j jVar) {
        super(sortedSet, jVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f11999b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f11999b.iterator();
        it.getClass();
        ra.j jVar = this.f12000c;
        jVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (jVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new m2(((SortedSet) this.f11999b).headSet(obj), this.f12000c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f11999b;
        while (true) {
            Object last = sortedSet.last();
            if (this.f12000c.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new m2(((SortedSet) this.f11999b).subSet(obj, obj2), this.f12000c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new m2(((SortedSet) this.f11999b).tailSet(obj), this.f12000c);
    }
}
