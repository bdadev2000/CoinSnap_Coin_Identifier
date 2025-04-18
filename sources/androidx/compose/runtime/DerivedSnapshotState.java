package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f13784b;

    /* renamed from: c, reason: collision with root package name */
    public final SnapshotMutationPolicy f13785c;
    public ResultRecord d = new ResultRecord();

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f13786h = new Object();

        /* renamed from: c, reason: collision with root package name */
        public int f13787c;
        public int d;
        public ObjectIntMap e;

        /* renamed from: f, reason: collision with root package name */
        public Object f13788f;

        /* renamed from: g, reason: collision with root package name */
        public int f13789g;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public ResultRecord() {
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f1548a;
            p0.a.q(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.e = mutableObjectIntMap;
            this.f13788f = f13786h;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            this.e = resultRecord.e;
            this.f13788f = resultRecord.f13788f;
            this.f13789g = resultRecord.f13789g;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new ResultRecord();
        }

        public final boolean c(DerivedState derivedState, Snapshot snapshot) {
            boolean z2;
            boolean z3;
            Object obj = SnapshotKt.f14571b;
            synchronized (obj) {
                z2 = true;
                if (this.f13787c == snapshot.d()) {
                    if (this.d == snapshot.h()) {
                        z3 = false;
                    }
                }
                z3 = true;
            }
            if (this.f13788f == f13786h || (z3 && this.f13789g != d(derivedState, snapshot))) {
                z2 = false;
            }
            if (z2 && z3) {
                synchronized (obj) {
                    this.f13787c = snapshot.d();
                    this.d = snapshot.h();
                }
            }
            return z2;
        }

        public final int d(DerivedState derivedState, Snapshot snapshot) {
            ObjectIntMap objectIntMap;
            int i2;
            int i3;
            int i4;
            int i5;
            StateRecord j2;
            synchronized (SnapshotKt.f14571b) {
                objectIntMap = this.e;
            }
            char c2 = 7;
            if (objectIntMap.e == 0) {
                return 7;
            }
            MutableVector c3 = SnapshotStateKt.c();
            int i6 = c3.f14144c;
            int i7 = 1;
            if (i6 > 0) {
                Object[] objArr = c3.f14142a;
                int i8 = 0;
                do {
                    ((DerivedStateObserver) objArr[i8]).start();
                    i8++;
                } while (i8 < i6);
            }
            try {
                Object[] objArr2 = objectIntMap.f1546b;
                int[] iArr = objectIntMap.f1547c;
                long[] jArr = objectIntMap.f1545a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 7;
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr[i10];
                        if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j3 & 255) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    StateObject stateObject = (StateObject) objArr2[i14];
                                    if (iArr[i14] == i7) {
                                        if (stateObject instanceof DerivedSnapshotState) {
                                            DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) stateObject;
                                            i2 = 0;
                                            try {
                                                j2 = derivedSnapshotState.w((ResultRecord) SnapshotKt.j(derivedSnapshotState.d, snapshot), snapshot, false, derivedSnapshotState.f13784b);
                                            } catch (Throwable th) {
                                                th = th;
                                                int i15 = c3.f14144c;
                                                if (i15 > 0) {
                                                    Object[] objArr3 = c3.f14142a;
                                                    int i16 = i2;
                                                    do {
                                                        ((DerivedStateObserver) objArr3[i16]).a();
                                                        i16++;
                                                    } while (i16 < i15);
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i2 = 0;
                                            j2 = SnapshotKt.j(stateObject.q(), snapshot);
                                        }
                                        i9 = (((i9 * 31) + System.identityHashCode(j2)) * 31) + j2.f14634a;
                                    }
                                    i5 = 8;
                                } else {
                                    i5 = i11;
                                }
                                j3 >>= i5;
                                i13++;
                                i11 = i5;
                                i7 = 1;
                            }
                            i3 = 0;
                            if (i12 != i11) {
                                break;
                            }
                        } else {
                            i3 = 0;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        c2 = 7;
                        i7 = 1;
                    }
                    i4 = i9;
                } else {
                    i3 = 0;
                    i4 = 7;
                }
                int i17 = c3.f14144c;
                if (i17 <= 0) {
                    return i4;
                }
                Object[] objArr4 = c3.f14142a;
                int i18 = i3;
                do {
                    ((DerivedStateObserver) objArr4[i18]).a();
                    i18++;
                } while (i18 < i17);
                return i4;
            } catch (Throwable th2) {
                th = th2;
                i2 = 0;
            }
        }
    }

    public DerivedSnapshotState(SnapshotMutationPolicy snapshotMutationPolicy, q0.a aVar) {
        this.f13784b = aVar;
        this.f13785c = snapshotMutationPolicy;
    }

    @Override // androidx.compose.runtime.DerivedState
    public final SnapshotMutationPolicy f() {
        return this.f13785c;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        l f2 = SnapshotKt.k().f();
        if (f2 != null) {
            f2.invoke(this);
        }
        Snapshot k2 = SnapshotKt.k();
        return w((ResultRecord) SnapshotKt.j(this.d, k2), k2, true, this.f13784b).f13788f;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.d = (ResultRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.d;
    }

    @Override // androidx.compose.runtime.DerivedState
    public final ResultRecord s() {
        Snapshot k2 = SnapshotKt.k();
        return w((ResultRecord) SnapshotKt.j(this.d, k2), k2, false, this.f13784b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.i(this.d);
        sb.append(resultRecord.c(this, SnapshotKt.k()) ? String.valueOf(resultRecord.f13788f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public final ResultRecord w(ResultRecord resultRecord, Snapshot snapshot, boolean z2, q0.a aVar) {
        int i2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i3;
        ResultRecord resultRecord2 = resultRecord;
        if (resultRecord2.c(this, snapshot)) {
            if (z2) {
                MutableVector c2 = SnapshotStateKt.c();
                int i4 = c2.f14144c;
                if (i4 > 0) {
                    Object[] objArr = c2.f14142a;
                    int i5 = 0;
                    do {
                        ((DerivedStateObserver) objArr[i5]).start();
                        i5++;
                    } while (i5 < i4);
                }
                try {
                    ObjectIntMap objectIntMap = resultRecord2.e;
                    SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.f14032a;
                    IntRef intRef = (IntRef) snapshotThreadLocal.a();
                    if (intRef == null) {
                        intRef = new IntRef(0);
                        snapshotThreadLocal.b(intRef);
                    }
                    int i6 = intRef.f14483a;
                    Object[] objArr2 = objectIntMap.f1546b;
                    int[] iArr = objectIntMap.f1547c;
                    long[] jArr = objectIntMap.f1545a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr[i7];
                            long[] jArr2 = jArr;
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((j2 & 255) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        StateObject stateObject = (StateObject) objArr2[i11];
                                        intRef.f14483a = i6 + iArr[i11];
                                        l f2 = snapshot.f();
                                        if (f2 != null) {
                                            f2.invoke(stateObject);
                                        }
                                        i3 = 8;
                                    } else {
                                        i3 = i8;
                                    }
                                    j2 >>= i3;
                                    i10++;
                                    i8 = i3;
                                }
                                if (i9 != i8) {
                                    break;
                                }
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            jArr = jArr2;
                        }
                    }
                    intRef.f14483a = i6;
                    int i12 = c2.f14144c;
                    if (i12 > 0) {
                        Object[] objArr3 = c2.f14142a;
                        int i13 = 0;
                        do {
                            ((DerivedStateObserver) objArr3[i13]).a();
                            i13++;
                        } while (i13 < i12);
                    }
                } catch (Throwable th) {
                    int i14 = c2.f14144c;
                    if (i14 > 0) {
                        Object[] objArr4 = c2.f14142a;
                        int i15 = 0;
                        do {
                            ((DerivedStateObserver) objArr4[i15]).a();
                            i15++;
                        } while (i15 < i14);
                    }
                    throw th;
                }
            }
            return resultRecord2;
        }
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap();
        SnapshotThreadLocal snapshotThreadLocal2 = SnapshotStateKt__DerivedStateKt.f14032a;
        IntRef intRef2 = (IntRef) snapshotThreadLocal2.a();
        if (intRef2 == null) {
            i2 = 0;
            intRef2 = new IntRef(0);
            snapshotThreadLocal2.b(intRef2);
        } else {
            i2 = 0;
        }
        int i16 = intRef2.f14483a;
        MutableVector c3 = SnapshotStateKt.c();
        int i17 = c3.f14144c;
        if (i17 > 0) {
            Object[] objArr5 = c3.f14142a;
            int i18 = i2;
            while (true) {
                ((DerivedStateObserver) objArr5[i18]).start();
                int i19 = i18 + 1;
                if (i19 >= i17) {
                    break;
                }
                i18 = i19;
            }
        }
        try {
            intRef2.f14483a = i16 + 1;
            Object d = Snapshot.Companion.d(new DerivedSnapshotState$currentRecord$result$1$1$result$1(this, intRef2, mutableObjectIntMap, i16), aVar);
            intRef2.f14483a = i16;
            int i20 = c3.f14144c;
            if (i20 > 0) {
                Object[] objArr6 = c3.f14142a;
                do {
                    ((DerivedStateObserver) objArr6[i2]).a();
                    i2++;
                } while (i2 < i20);
            }
            Object obj = SnapshotKt.f14571b;
            synchronized (obj) {
                try {
                    Snapshot k2 = SnapshotKt.k();
                    Object obj2 = resultRecord2.f13788f;
                    if (obj2 == ResultRecord.f13786h || (snapshotMutationPolicy = this.f13785c) == null || !snapshotMutationPolicy.a(d, obj2)) {
                        ResultRecord resultRecord3 = this.d;
                        synchronized (obj) {
                            StateRecord m2 = SnapshotKt.m(resultRecord3, this);
                            m2.a(resultRecord3);
                            m2.f14634a = k2.d();
                            resultRecord2 = (ResultRecord) m2;
                            resultRecord2.e = mutableObjectIntMap;
                            resultRecord2.f13789g = resultRecord2.d(this, k2);
                            resultRecord2.f13788f = d;
                        }
                        return resultRecord2;
                    }
                    resultRecord2.e = mutableObjectIntMap;
                    resultRecord2.f13789g = resultRecord2.d(this, k2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.f14032a.a();
            if (intRef3 != null && intRef3.f14483a == 0) {
                SnapshotKt.k().m();
                synchronized (obj) {
                    Snapshot k3 = SnapshotKt.k();
                    resultRecord2.f13787c = k3.d();
                    resultRecord2.d = k3.h();
                }
            }
            return resultRecord2;
        } catch (Throwable th3) {
            int i21 = c3.f14144c;
            if (i21 > 0) {
                Object[] objArr7 = c3.f14142a;
                do {
                    ((DerivedStateObserver) objArr7[i2]).a();
                    i2++;
                } while (i2 < i21);
            }
            throw th3;
        }
    }
}
