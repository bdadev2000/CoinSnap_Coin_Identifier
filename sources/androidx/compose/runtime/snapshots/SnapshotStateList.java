package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.e;
import q0.l;
import r0.c;

@Stable
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, c {

    /* renamed from: a, reason: collision with root package name */
    public StateListStateRecord f14587a;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class StateListStateRecord<T> extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public PersistentList f14588c;
        public int d;
        public int e;

        public StateListStateRecord(PersistentList persistentList) {
            this.f14588c = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            synchronized (SnapshotStateListKt.f14592a) {
                p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f14588c = ((StateListStateRecord) stateRecord).f14588c;
                this.d = ((StateListStateRecord) stateRecord).d;
                this.e = ((StateListStateRecord) stateRecord).e;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateListStateRecord(this.f14588c);
        }
    }

    public SnapshotStateList() {
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.f14187b;
        StateListStateRecord stateListStateRecord = new StateListStateRecord(smallPersistentVector);
        if (Snapshot.Companion.b()) {
            StateListStateRecord stateListStateRecord2 = new StateListStateRecord(smallPersistentVector);
            stateListStateRecord2.f14634a = 1;
            stateListStateRecord.f14635b = stateListStateRecord2;
        }
        this.f14587a = stateListStateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i2;
        PersistentList persistentList;
        boolean z2;
        Snapshot k2;
        do {
            Object obj2 = SnapshotStateListKt.f14592a;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentList add = persistentList.add(obj);
            z2 = false;
            if (p0.a.g(add, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj2) {
                    int i3 = stateListStateRecord4.d;
                    if (i3 == i2) {
                        stateListStateRecord4.f14588c = add;
                        stateListStateRecord4.e++;
                        stateListStateRecord4.d = i3 + 1;
                        z2 = true;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        return d(new SnapshotStateList$addAll$1(i2, collection));
    }

    public final StateListStateRecord b() {
        StateListStateRecord stateListStateRecord = this.f14587a;
        p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.t(stateListStateRecord, this);
    }

    public final int c() {
        StateListStateRecord stateListStateRecord = this.f14587a;
        p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.i(stateListStateRecord)).e;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Snapshot k2;
        StateListStateRecord stateListStateRecord = this.f14587a;
        p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (SnapshotKt.f14571b) {
            k2 = SnapshotKt.k();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord, this, k2);
            synchronized (SnapshotStateListKt.f14592a) {
                stateListStateRecord2.f14588c = SmallPersistentVector.f14187b;
                stateListStateRecord2.d++;
                stateListStateRecord2.e++;
            }
        }
        SnapshotKt.n(k2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return b().f14588c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return b().f14588c.containsAll(collection);
    }

    public final boolean d(l lVar) {
        int i2;
        PersistentList persistentList;
        Object invoke;
        Snapshot k2;
        boolean z2;
        do {
            Object obj = SnapshotStateListKt.f14592a;
            synchronized (obj) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentVectorBuilder builder = persistentList.builder();
            invoke = lVar.invoke(builder);
            PersistentList d = builder.d();
            if (p0.a.g(d, persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj) {
                    int i3 = stateListStateRecord4.d;
                    if (i3 == i2) {
                        stateListStateRecord4.f14588c = d;
                        stateListStateRecord4.d = i3 + 1;
                        z2 = true;
                        stateListStateRecord4.e++;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return ((Boolean) invoke).booleanValue();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return b().f14588c.get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return b().f14588c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return b().f14588c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return b().f14588c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        stateRecord.f14635b = this.f14587a;
        this.f14587a = (StateListStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.f14587a;
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        int i3;
        PersistentList persistentList;
        Snapshot k2;
        boolean z2;
        Object obj = get(i2);
        do {
            Object obj2 = SnapshotStateListKt.f14592a;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i3 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentList n2 = persistentList.n(i2);
            if (p0.a.g(n2, persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj2) {
                    int i4 = stateListStateRecord4.d;
                    if (i4 == i3) {
                        stateListStateRecord4.f14588c = n2;
                        z2 = true;
                        stateListStateRecord4.e++;
                        stateListStateRecord4.d = i4 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2;
        PersistentList persistentList;
        boolean z2;
        Snapshot k2;
        do {
            Object obj = SnapshotStateListKt.f14592a;
            synchronized (obj) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentList removeAll = persistentList.removeAll(collection);
            z2 = false;
            if (p0.a.g(removeAll, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj) {
                    int i3 = stateListStateRecord4.d;
                    if (i3 == i2) {
                        stateListStateRecord4.f14588c = removeAll;
                        stateListStateRecord4.e++;
                        stateListStateRecord4.d = i3 + 1;
                        z2 = true;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return d(new SnapshotStateList$retainAll$1(collection));
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        int i3;
        PersistentList persistentList;
        Snapshot k2;
        boolean z2;
        Object obj2 = get(i2);
        do {
            Object obj3 = SnapshotStateListKt.f14592a;
            synchronized (obj3) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i3 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentList persistentList2 = persistentList.set(i2, obj);
            if (p0.a.g(persistentList2, persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj3) {
                    int i4 = stateListStateRecord4.d;
                    if (i4 == i3) {
                        stateListStateRecord4.f14588c = persistentList2;
                        stateListStateRecord4.d = i4 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return b().f14588c.size();
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3 && i3 <= size()) {
            return new SubList(this, i2, i3);
        }
        PreconditionsKt.a("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return e.C(this);
    }

    public final String toString() {
        StateListStateRecord stateListStateRecord = this.f14587a;
        p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.i(stateListStateRecord)).f14588c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i2;
        PersistentList persistentList;
        boolean z2;
        Snapshot k2;
        do {
            Object obj = SnapshotStateListKt.f14592a;
            synchronized (obj) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentList addAll = persistentList.addAll(collection);
            z2 = false;
            if (p0.a.g(addAll, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj) {
                    int i3 = stateListStateRecord4.d;
                    if (i3 == i2) {
                        stateListStateRecord4.f14588c = addAll;
                        stateListStateRecord4.e++;
                        stateListStateRecord4.d = i3 + 1;
                        z2 = true;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new StateListIterator(this, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return e.D(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        PersistentList persistentList;
        Snapshot k2;
        boolean z2;
        do {
            Object obj2 = SnapshotStateListKt.f14592a;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i3 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentList add = persistentList.add(i2, obj);
            if (p0.a.g(add, persistentList)) {
                return;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj2) {
                    int i4 = stateListStateRecord4.d;
                    if (i4 == i3) {
                        stateListStateRecord4.f14588c = add;
                        z2 = true;
                        stateListStateRecord4.e++;
                        stateListStateRecord4.d = i4 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i2;
        PersistentList persistentList;
        boolean z2;
        Snapshot k2;
        do {
            Object obj2 = SnapshotStateListKt.f14592a;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord = this.f14587a;
                p0.a.q(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.f14588c;
            }
            p0.a.p(persistentList);
            PersistentList remove = persistentList.remove(obj);
            z2 = false;
            if (p0.a.g(remove, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.f14587a;
            p0.a.q(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, k2);
                synchronized (obj2) {
                    int i3 = stateListStateRecord4.d;
                    if (i3 == i2) {
                        stateListStateRecord4.f14588c = remove;
                        stateListStateRecord4.e++;
                        stateListStateRecord4.d = i3 + 1;
                        z2 = true;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return true;
    }
}
