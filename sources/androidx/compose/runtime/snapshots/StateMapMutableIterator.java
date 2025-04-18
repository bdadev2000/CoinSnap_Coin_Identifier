package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class StateMapMutableIterator<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateMap f14629a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f14630b;

    /* renamed from: c, reason: collision with root package name */
    public int f14631c;
    public Map.Entry d;

    /* renamed from: f, reason: collision with root package name */
    public Map.Entry f14632f;

    public StateMapMutableIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        this.f14629a = snapshotStateMap;
        this.f14630b = it;
        this.f14631c = snapshotStateMap.b().d;
        b();
    }

    public final void b() {
        this.d = this.f14632f;
        Iterator it = this.f14630b;
        this.f14632f = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.f14632f != null;
    }

    public final void remove() {
        SnapshotStateMap snapshotStateMap = this.f14629a;
        if (snapshotStateMap.b().d != this.f14631c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        snapshotStateMap.remove(entry.getKey());
        this.d = null;
        this.f14631c = snapshotStateMap.b().d;
    }
}
