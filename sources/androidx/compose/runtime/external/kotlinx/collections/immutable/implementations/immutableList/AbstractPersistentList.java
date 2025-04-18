package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class AbstractPersistentList<E> extends f implements PersistentList<E> {
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList addAll(Collection collection) {
        PersistentVectorBuilder builder = builder();
        builder.addAll(collection);
        return builder.d();
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // e0.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // e0.f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList remove(Object obj) {
        int indexOf = indexOf(obj);
        return indexOf != -1 ? n(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList removeAll(Collection collection) {
        return o(new AbstractPersistentList$removeAll$1(collection));
    }

    @Override // e0.f, java.util.List
    public final List subList(int i2, int i3) {
        return super.subList(i2, i3);
    }
}
