package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import java.util.List;
import q0.l;
import r0.c;

/* loaded from: classes4.dex */
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* loaded from: classes4.dex */
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, c {
    }

    @Override // java.util.List
    PersistentList add(int i2, Object obj);

    @Override // java.util.List, java.util.Collection
    PersistentList add(Object obj);

    @Override // java.util.List, java.util.Collection
    PersistentList addAll(Collection collection);

    PersistentVectorBuilder builder();

    PersistentList n(int i2);

    PersistentList o(l lVar);

    @Override // java.util.List, java.util.Collection
    PersistentList remove(Object obj);

    @Override // java.util.List, java.util.Collection
    PersistentList removeAll(Collection collection);

    @Override // java.util.List
    PersistentList set(int i2, Object obj);
}
