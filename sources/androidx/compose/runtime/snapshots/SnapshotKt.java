package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import com.google.android.gms.common.api.Api;
import e0.q;
import e0.w;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final class SnapshotKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SnapshotThreadLocal f14570a = new SnapshotThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14571b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static SnapshotIdSet f14572c;
    public static int d;
    public static final SnapshotDoubleIndexHeap e;

    /* renamed from: f, reason: collision with root package name */
    public static final SnapshotWeakSet f14573f;

    /* renamed from: g, reason: collision with root package name */
    public static List f14574g;

    /* renamed from: h, reason: collision with root package name */
    public static List f14575h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f14576i;

    /* renamed from: j, reason: collision with root package name */
    public static final Snapshot f14577j;

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicInt f14578k;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.atomic.AtomicInteger, androidx.compose.runtime.AtomicInt] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.snapshots.SnapshotDoubleIndexHeap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.runtime.snapshots.SnapshotWeakSet, java.lang.Object] */
    static {
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.f14561f;
        f14572c = snapshotIdSet;
        d = 2;
        ?? obj = new Object();
        obj.f14559b = new int[16];
        obj.f14560c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        obj.d = iArr;
        e = obj;
        ?? obj2 = new Object();
        obj2.f14621b = new int[16];
        obj2.f14622c = new WeakReference[16];
        f14573f = obj2;
        w wVar = w.f30218a;
        f14574g = wVar;
        f14575h = wVar;
        int i4 = d;
        d = i4 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i4, snapshotIdSet);
        f14572c = f14572c.f(globalSnapshot.f14554b);
        AtomicReference atomicReference = new AtomicReference(globalSnapshot);
        f14576i = atomicReference;
        f14577j = (Snapshot) atomicReference.get();
        f14578k = new AtomicInteger(0);
    }

    public static final void a() {
        f(SnapshotKt$advanceGlobalSnapshot$3.f14579a);
    }

    public static final l b(l lVar, l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new SnapshotKt$mergedWriteObserver$1(lVar, lVar2);
    }

    public static final HashMap c(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        int i3;
        SnapshotIdSet snapshotIdSet3;
        MutableScatterSet w = mutableSnapshot2.w();
        int d2 = mutableSnapshot.d();
        if (w != null) {
            SnapshotIdSet e2 = mutableSnapshot2.e().f(mutableSnapshot2.d()).e(mutableSnapshot2.f14545j);
            Object[] objArr = w.f1592b;
            long[] jArr3 = w.f1591a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i4 = 0;
            HashMap hashMap = null;
            loop0: while (true) {
                long j2 = jArr3[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j2) < 128) {
                            StateObject stateObject = (StateObject) objArr[(i4 << 3) + i7];
                            StateRecord q2 = stateObject.q();
                            StateRecord s2 = s(q2, d2, snapshotIdSet);
                            if (s2 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                StateRecord s3 = s(q2, d2, e2);
                                if (s3 != null && !p0.a.g(s2, s3)) {
                                    i3 = d2;
                                    snapshotIdSet3 = e2;
                                    StateRecord s4 = s(q2, mutableSnapshot2.d(), mutableSnapshot2.e());
                                    if (s4 == null) {
                                        r();
                                        throw null;
                                    }
                                    StateRecord r2 = stateObject.r(s3, s2, s4);
                                    if (r2 == null) {
                                        break loop0;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s2, r2);
                                    hashMap = hashMap;
                                }
                            }
                            i3 = d2;
                            snapshotIdSet3 = e2;
                        } else {
                            jArr2 = jArr3;
                            i3 = d2;
                            snapshotIdSet3 = e2;
                        }
                        j2 >>= 8;
                        i7++;
                        i5 = 8;
                        jArr3 = jArr2;
                        d2 = i3;
                        e2 = snapshotIdSet3;
                    }
                    jArr = jArr3;
                    i2 = d2;
                    snapshotIdSet2 = e2;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    i2 = d2;
                    snapshotIdSet2 = e2;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr3 = jArr;
                d2 = i2;
                e2 = snapshotIdSet2;
            }
            return hashMap;
        }
        return null;
    }

    public static final void d(Snapshot snapshot) {
        int i2;
        if (f14572c.d(snapshot.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(snapshot.d());
        sb.append(", disposed=");
        sb.append(snapshot.f14555c);
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.f14548m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f14571b) {
            SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = e;
            i2 = snapshotDoubleIndexHeap.f14558a > 0 ? snapshotDoubleIndexHeap.f14559b[0] : -1;
        }
        sb.append(i2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final SnapshotIdSet e(int i2, int i3, SnapshotIdSet snapshotIdSet) {
        while (i2 < i3) {
            snapshotIdSet = snapshotIdSet.f(i2);
            i2++;
        }
        return snapshotIdSet;
    }

    public static final Object f(l lVar) {
        Object obj;
        MutableScatterSet mutableScatterSet;
        Object v2;
        Snapshot snapshot = f14577j;
        p0.a.q(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f14571b) {
            try {
                obj = f14576i.get();
                mutableScatterSet = ((GlobalSnapshot) obj).f14543h;
                if (mutableScatterSet != null) {
                    f14578k.addAndGet(1);
                }
                v2 = v((Snapshot) obj, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mutableScatterSet != null) {
            try {
                List list = f14574g;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((p) list.get(i2)).invoke(new ScatterSetWrapper(mutableScatterSet), obj);
                }
            } finally {
                f14578k.addAndGet(-1);
            }
        }
        synchronized (f14571b) {
            g();
            if (mutableScatterSet != null) {
                Object[] objArr = mutableScatterSet.f1592b;
                long[] jArr = mutableScatterSet.f1591a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((StateObject) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return v2;
    }

    public static final void g() {
        SnapshotWeakSet snapshotWeakSet = f14573f;
        int i2 = snapshotWeakSet.f14620a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            WeakReference weakReference = snapshotWeakSet.f14622c[i3];
            if ((weakReference != null ? weakReference.get() : null) != null && !(!p((StateObject) r5))) {
                if (i4 != i3) {
                    snapshotWeakSet.f14622c[i4] = weakReference;
                    int[] iArr = snapshotWeakSet.f14621b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            snapshotWeakSet.f14622c[i5] = null;
            snapshotWeakSet.f14621b[i5] = 0;
        }
        if (i4 != i2) {
            snapshotWeakSet.f14620a = i4;
        }
    }

    public static final Snapshot h(Snapshot snapshot, l lVar, boolean z2) {
        boolean z3 = snapshot instanceof MutableSnapshot;
        if (z3 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z3 ? (MutableSnapshot) snapshot : null, lVar, null, false, z2);
        }
        return new TransparentObserverSnapshot(snapshot, lVar, z2);
    }

    public static final StateRecord i(StateRecord stateRecord) {
        StateRecord s2;
        Snapshot k2 = k();
        StateRecord s3 = s(stateRecord, k2.d(), k2.e());
        if (s3 != null) {
            return s3;
        }
        synchronized (f14571b) {
            Snapshot k3 = k();
            s2 = s(stateRecord, k3.d(), k3.e());
        }
        if (s2 != null) {
            return s2;
        }
        r();
        throw null;
    }

    public static final StateRecord j(StateRecord stateRecord, Snapshot snapshot) {
        StateRecord s2 = s(stateRecord, snapshot.d(), snapshot.e());
        if (s2 != null) {
            return s2;
        }
        r();
        throw null;
    }

    public static final Snapshot k() {
        Snapshot snapshot = (Snapshot) f14570a.a();
        return snapshot == null ? (Snapshot) f14576i.get() : snapshot;
    }

    public static final l l(l lVar, l lVar2, boolean z2) {
        if (!z2) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new SnapshotKt$mergedReadObserver$1(lVar, lVar2);
    }

    public static final StateRecord m(StateRecord stateRecord, StateObject stateObject) {
        StateRecord q2 = stateObject.q();
        int i2 = d;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = e;
        if (snapshotDoubleIndexHeap.f14558a > 0) {
            i2 = snapshotDoubleIndexHeap.f14559b[0];
        }
        int i3 = i2 - 1;
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.f14561f;
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        while (true) {
            if (q2 != null) {
                int i4 = q2.f14634a;
                if (i4 == 0) {
                    break;
                }
                if (i4 != 0 && i4 <= i3 && !snapshotIdSet.d(i4)) {
                    if (stateRecord3 == null) {
                        stateRecord3 = q2;
                    } else if (q2.f14634a >= stateRecord3.f14634a) {
                        stateRecord2 = stateRecord3;
                    }
                }
                q2 = q2.f14635b;
            } else {
                break;
            }
        }
        stateRecord2 = q2;
        if (stateRecord2 != null) {
            stateRecord2.f14634a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return stateRecord2;
        }
        StateRecord b2 = stateRecord.b();
        b2.f14634a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        b2.f14635b = stateObject.q();
        stateObject.p(b2);
        return b2;
    }

    public static final void n(Snapshot snapshot, StateObject stateObject) {
        snapshot.s(snapshot.h() + 1);
        l i2 = snapshot.i();
        if (i2 != null) {
            i2.invoke(stateObject);
        }
    }

    public static final StateRecord o(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot, StateRecord stateRecord2) {
        StateRecord m2;
        if (snapshot.g()) {
            snapshot.n(stateObject);
        }
        int d2 = snapshot.d();
        if (stateRecord2.f14634a == d2) {
            return stateRecord2;
        }
        synchronized (f14571b) {
            m2 = m(stateRecord, stateObject);
        }
        m2.f14634a = d2;
        if (stateRecord2.f14634a != 1) {
            snapshot.n(stateObject);
        }
        return m2;
    }

    public static final boolean p(StateObject stateObject) {
        StateRecord stateRecord;
        int i2 = d;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = e;
        if (snapshotDoubleIndexHeap.f14558a > 0) {
            i2 = snapshotDoubleIndexHeap.f14559b[0];
        }
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i3 = 0;
        for (StateRecord q2 = stateObject.q(); q2 != null; q2 = q2.f14635b) {
            int i4 = q2.f14634a;
            if (i4 != 0) {
                if (i4 >= i2) {
                    i3++;
                } else if (stateRecord2 == null) {
                    i3++;
                    stateRecord2 = q2;
                } else {
                    if (i4 < stateRecord2.f14634a) {
                        stateRecord = stateRecord2;
                        stateRecord2 = q2;
                    } else {
                        stateRecord = q2;
                    }
                    if (stateRecord3 == null) {
                        stateRecord3 = stateObject.q();
                        StateRecord stateRecord4 = stateRecord3;
                        while (true) {
                            if (stateRecord3 == null) {
                                stateRecord3 = stateRecord4;
                                break;
                            }
                            int i5 = stateRecord3.f14634a;
                            if (i5 >= i2) {
                                break;
                            }
                            if (stateRecord4.f14634a < i5) {
                                stateRecord4 = stateRecord3;
                            }
                            stateRecord3 = stateRecord3.f14635b;
                        }
                    }
                    stateRecord2.f14634a = 0;
                    stateRecord2.a(stateRecord3);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i3 > 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(StateObject stateObject) {
        if (p(stateObject)) {
            SnapshotWeakSet snapshotWeakSet = f14573f;
            int i2 = snapshotWeakSet.f14620a;
            int identityHashCode = System.identityHashCode(stateObject);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = snapshotWeakSet.f14620a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = snapshotWeakSet.f14621b[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        WeakReference weakReference = snapshotWeakSet.f14622c[i6];
                        if (stateObject == (weakReference != null ? weakReference.get() : null)) {
                            i3 = i6;
                        } else {
                            int i8 = i6 - 1;
                            while (-1 < i8 && snapshotWeakSet.f14621b[i8] == identityHashCode) {
                                WeakReference weakReference2 = snapshotWeakSet.f14622c[i8];
                                if ((weakReference2 != null ? weakReference2.get() : null) == stateObject) {
                                    break;
                                } else {
                                    i8--;
                                }
                            }
                            int i9 = snapshotWeakSet.f14620a;
                            i8 = i6 + 1;
                            while (true) {
                                if (i8 >= i9) {
                                    i8 = -(snapshotWeakSet.f14620a + 1);
                                    break;
                                } else {
                                    if (snapshotWeakSet.f14621b[i8] != identityHashCode) {
                                        i8 = -(i8 + 1);
                                        break;
                                    }
                                    WeakReference weakReference3 = snapshotWeakSet.f14622c[i8];
                                    if ((weakReference3 != null ? weakReference3.get() : null) == stateObject) {
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                            i3 = i8;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            WeakReference[] weakReferenceArr = snapshotWeakSet.f14622c;
            int length = weakReferenceArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                WeakReference[] weakReferenceArr2 = new WeakReference[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                q.P(i12, i10, weakReferenceArr, i2, weakReferenceArr2);
                q.T(snapshotWeakSet.f14622c, weakReferenceArr2, 0, i10, 6);
                q.O(i12, i10, i2, snapshotWeakSet.f14621b, iArr);
                q.S(snapshotWeakSet.f14621b, iArr, 0, i10, 6);
                snapshotWeakSet.f14622c = weakReferenceArr2;
                snapshotWeakSet.f14621b = iArr;
            } else {
                int i13 = i10 + 1;
                q.P(i13, i10, weakReferenceArr, i2, weakReferenceArr);
                int[] iArr2 = snapshotWeakSet.f14621b;
                q.O(i13, i10, i2, iArr2, iArr2);
            }
            snapshotWeakSet.f14622c[i10] = new java.lang.ref.WeakReference(stateObject);
            snapshotWeakSet.f14621b[i10] = identityHashCode;
            snapshotWeakSet.f14620a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final StateRecord s(StateRecord stateRecord, int i2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            int i3 = stateRecord.f14634a;
            if (i3 != 0 && i3 <= i2 && !snapshotIdSet.d(i3) && (stateRecord2 == null || stateRecord2.f14634a < stateRecord.f14634a)) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.f14635b;
        }
        if (stateRecord2 != null) {
            return stateRecord2;
        }
        return null;
    }

    public static final StateRecord t(StateRecord stateRecord, StateObject stateObject) {
        StateRecord s2;
        Snapshot k2 = k();
        l f2 = k2.f();
        if (f2 != null) {
            f2.invoke(stateObject);
        }
        StateRecord s3 = s(stateRecord, k2.d(), k2.e());
        if (s3 != null) {
            return s3;
        }
        synchronized (f14571b) {
            Snapshot k3 = k();
            StateRecord q2 = stateObject.q();
            p0.a.q(q2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s2 = s(q2, k3.d(), k3.e());
            if (s2 == null) {
                r();
                throw null;
            }
        }
        return s2;
    }

    public static final void u(int i2) {
        int i3;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = e;
        int i4 = snapshotDoubleIndexHeap.d[i2];
        snapshotDoubleIndexHeap.b(i4, snapshotDoubleIndexHeap.f14558a - 1);
        snapshotDoubleIndexHeap.f14558a--;
        int[] iArr = snapshotDoubleIndexHeap.f14559b;
        int i5 = iArr[i4];
        int i6 = i4;
        while (i6 > 0) {
            int i7 = ((i6 + 1) >> 1) - 1;
            if (iArr[i7] <= i5) {
                break;
            }
            snapshotDoubleIndexHeap.b(i7, i6);
            i6 = i7;
        }
        int[] iArr2 = snapshotDoubleIndexHeap.f14559b;
        int i8 = snapshotDoubleIndexHeap.f14558a >> 1;
        while (i4 < i8) {
            int i9 = (i4 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < snapshotDoubleIndexHeap.f14558a && (i3 = iArr2[i9]) < iArr2[i10]) {
                if (i3 >= iArr2[i4]) {
                    break;
                }
                snapshotDoubleIndexHeap.b(i9, i4);
                i4 = i9;
            } else {
                if (iArr2[i10] >= iArr2[i4]) {
                    break;
                }
                snapshotDoubleIndexHeap.b(i10, i4);
                i4 = i10;
            }
        }
        snapshotDoubleIndexHeap.d[i2] = snapshotDoubleIndexHeap.e;
        snapshotDoubleIndexHeap.e = i2;
    }

    public static final Object v(Snapshot snapshot, l lVar) {
        Object invoke = lVar.invoke(f14572c.c(snapshot.d()));
        synchronized (f14571b) {
            int i2 = d;
            d = i2 + 1;
            SnapshotIdSet c2 = f14572c.c(snapshot.d());
            f14572c = c2;
            f14576i.set(new GlobalSnapshot(i2, c2));
            snapshot.c();
            f14572c = f14572c.f(i2);
        }
        return invoke;
    }

    public static final StateRecord w(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord s2;
        if (snapshot.g()) {
            snapshot.n(stateObject);
        }
        int d2 = snapshot.d();
        StateRecord s3 = s(stateRecord, d2, snapshot.e());
        if (s3 == null) {
            r();
            throw null;
        }
        if (s3.f14634a == snapshot.d()) {
            return s3;
        }
        synchronized (f14571b) {
            s2 = s(stateObject.q(), d2, snapshot.e());
            if (s2 == null) {
                r();
                throw null;
            }
            if (s2.f14634a != d2) {
                StateRecord m2 = m(s2, stateObject);
                m2.a(s2);
                m2.f14634a = snapshot.d();
                s2 = m2;
            }
        }
        if (s3.f14634a != 1) {
            snapshot.n(stateObject);
        }
        return s2;
    }
}
