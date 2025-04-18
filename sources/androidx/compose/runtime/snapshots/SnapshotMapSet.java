package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.internal.e;
import r0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class SnapshotMapSet<K, V, E> implements Set<E>, f {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateMap f14586a;

    public SnapshotMapSet(SnapshotStateMap snapshotStateMap) {
        this.f14586a = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f14586a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f14586a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f14586a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return e.D(this, objArr);
    }
}
