package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import e0.b0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.e;
import r0.c;

/* loaded from: classes4.dex */
final class SubList<T> implements List<T>, c {

    /* renamed from: a, reason: collision with root package name */
    public final SnapshotStateList f14636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14637b;

    /* renamed from: c, reason: collision with root package name */
    public int f14638c;
    public int d;

    public SubList(SnapshotStateList snapshotStateList, int i2, int i3) {
        this.f14636a = snapshotStateList;
        this.f14637b = i2;
        this.f14638c = snapshotStateList.c();
        this.d = i3 - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i2 = this.f14637b + this.d;
        SnapshotStateList snapshotStateList = this.f14636a;
        snapshotStateList.add(i2, obj);
        this.d++;
        this.f14638c = snapshotStateList.c();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        b();
        int i3 = i2 + this.f14637b;
        SnapshotStateList snapshotStateList = this.f14636a;
        boolean addAll = snapshotStateList.addAll(i3, collection);
        if (addAll) {
            this.d = collection.size() + this.d;
            this.f14638c = snapshotStateList.c();
        }
        return addAll;
    }

    public final void b() {
        if (this.f14636a.c() != this.f14638c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i2;
        PersistentList persistentList;
        Snapshot k2;
        boolean z2;
        if (this.d > 0) {
            b();
            SnapshotStateList snapshotStateList = this.f14636a;
            int i3 = this.f14637b;
            int i4 = this.d + i3;
            snapshotStateList.getClass();
            do {
                Object obj = SnapshotStateListKt.f14592a;
                synchronized (obj) {
                    SnapshotStateList.StateListStateRecord stateListStateRecord = snapshotStateList.f14587a;
                    p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    SnapshotStateList.StateListStateRecord stateListStateRecord2 = (SnapshotStateList.StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                    i2 = stateListStateRecord2.d;
                    persistentList = stateListStateRecord2.f14588c;
                }
                p0.a.p(persistentList);
                PersistentVectorBuilder builder = persistentList.builder();
                builder.subList(i3, i4).clear();
                PersistentList d = builder.d();
                if (p0.a.g(d, persistentList)) {
                    break;
                }
                SnapshotStateList.StateListStateRecord stateListStateRecord3 = snapshotStateList.f14587a;
                p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.f14571b) {
                    k2 = SnapshotKt.k();
                    SnapshotStateList.StateListStateRecord stateListStateRecord4 = (SnapshotStateList.StateListStateRecord) SnapshotKt.w(stateListStateRecord3, snapshotStateList, k2);
                    synchronized (obj) {
                        int i5 = stateListStateRecord4.d;
                        if (i5 == i2) {
                            stateListStateRecord4.f14588c = d;
                            stateListStateRecord4.d = i5 + 1;
                            z2 = true;
                            stateListStateRecord4.e++;
                        } else {
                            z2 = false;
                        }
                    }
                }
                SnapshotKt.n(k2, snapshotStateList);
            } while (!z2);
            this.d = 0;
            this.f14638c = this.f14636a.c();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        b();
        SnapshotStateListKt.a(i2, this.d);
        return this.f14636a.get(this.f14637b + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i2 = this.d;
        int i3 = this.f14637b;
        Iterator<T> it = p0.a.F0(i3, i2 + i3).iterator();
        while (it.hasNext()) {
            int b2 = ((b0) it).b();
            if (p0.a.g(obj, this.f14636a.get(b2))) {
                return b2 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i2 = this.d;
        int i3 = this.f14637b;
        for (int i4 = (i2 + i3) - 1; i4 >= i3; i4--) {
            if (p0.a.g(obj, this.f14636a.get(i4))) {
                return i4 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i2;
        PersistentList persistentList;
        Snapshot k2;
        boolean z2;
        b();
        SnapshotStateList snapshotStateList = this.f14636a;
        int i3 = this.f14637b;
        int i4 = this.d + i3;
        int size = snapshotStateList.size();
        do {
            Object obj = SnapshotStateListKt.f14592a;
            synchronized (obj) {
                SnapshotStateList.StateListStateRecord stateListStateRecord = snapshotStateList.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                SnapshotStateList.StateListStateRecord stateListStateRecord2 = (SnapshotStateList.StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentVectorBuilder builder = persistentList.builder();
            builder.subList(i3, i4).retainAll(collection);
            PersistentList d = builder.d();
            if (p0.a.g(d, persistentList)) {
                break;
            }
            SnapshotStateList.StateListStateRecord stateListStateRecord3 = snapshotStateList.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                SnapshotStateList.StateListStateRecord stateListStateRecord4 = (SnapshotStateList.StateListStateRecord) SnapshotKt.w(stateListStateRecord3, snapshotStateList, k2);
                synchronized (obj) {
                    int i5 = stateListStateRecord4.d;
                    if (i5 == i2) {
                        stateListStateRecord4.f14588c = d;
                        stateListStateRecord4.d = i5 + 1;
                        stateListStateRecord4.e++;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, snapshotStateList);
        } while (!z2);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f14638c = this.f14636a.c();
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        SnapshotStateListKt.a(i2, this.d);
        b();
        int i3 = i2 + this.f14637b;
        SnapshotStateList snapshotStateList = this.f14636a;
        Object obj2 = snapshotStateList.set(i3, obj);
        this.f14638c = snapshotStateList.c();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        if (!(i2 >= 0 && i2 <= i3 && i3 <= this.d)) {
            PreconditionsKt.a("fromIndex or toIndex are out of bounds");
            throw null;
        }
        b();
        int i4 = this.f14637b;
        return new SubList(this.f14636a, i2 + i4, i3 + i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        b();
        ?? obj = new Object();
        obj.f30925a = i2 - 1;
        return new SubList$listIterator$1(obj, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return e.D(this, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        b();
        int i3 = this.f14637b + i2;
        SnapshotStateList snapshotStateList = this.f14636a;
        Object remove = snapshotStateList.remove(i3);
        this.d--;
        this.f14638c = snapshotStateList.c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        b();
        int i3 = this.f14637b + i2;
        SnapshotStateList snapshotStateList = this.f14636a;
        snapshotStateList.add(i3, obj);
        this.d++;
        this.f14638c = snapshotStateList.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
