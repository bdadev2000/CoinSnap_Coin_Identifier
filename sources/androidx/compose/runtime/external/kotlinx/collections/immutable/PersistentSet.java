package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Set;
import r0.f;

/* loaded from: classes2.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    /* loaded from: classes2.dex */
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, f {
    }

    @Override // java.util.Set, java.util.Collection
    PersistentSet add(Object obj);

    @Override // java.util.Set, java.util.Collection
    PersistentSet remove(Object obj);
}
