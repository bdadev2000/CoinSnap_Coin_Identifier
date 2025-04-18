package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import d0.k;
import e0.u;
import java.util.ArrayList;
import java.util.HashMap;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public class MutableSnapshot extends Snapshot {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f14540n = new int[0];
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final l f14541f;

    /* renamed from: g, reason: collision with root package name */
    public int f14542g;

    /* renamed from: h, reason: collision with root package name */
    public MutableScatterSet f14543h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f14544i;

    /* renamed from: j, reason: collision with root package name */
    public SnapshotIdSet f14545j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f14546k;

    /* renamed from: l, reason: collision with root package name */
    public int f14547l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14548m;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public MutableSnapshot(int i2, SnapshotIdSet snapshotIdSet, l lVar, l lVar2) {
        super(i2, snapshotIdSet);
        this.e = lVar;
        this.f14541f = lVar2;
        this.f14545j = SnapshotIdSet.f14561f;
        this.f14546k = f14540n;
        this.f14547l = 1;
    }

    public void A(MutableScatterSet mutableScatterSet) {
        this.f14543h = mutableScatterSet;
    }

    public MutableSnapshot B(l lVar, l lVar2) {
        NestedMutableSnapshot nestedMutableSnapshot;
        if (!(!this.f14555c)) {
            PreconditionsKt.a("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f14548m && this.d < 0) {
            PreconditionsKt.b("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = SnapshotKt.f14571b;
        synchronized (obj) {
            int i2 = SnapshotKt.d;
            SnapshotKt.d = i2 + 1;
            SnapshotKt.f14572c = SnapshotKt.f14572c.f(i2);
            SnapshotIdSet e = e();
            r(e.f(i2));
            nestedMutableSnapshot = new NestedMutableSnapshot(i2, SnapshotKt.e(d() + 1, i2, e), SnapshotKt.l(lVar, f(), true), SnapshotKt.b(lVar2, i()), this);
        }
        if (!this.f14548m && !this.f14555c) {
            int d = d();
            synchronized (obj) {
                int i3 = SnapshotKt.d;
                SnapshotKt.d = i3 + 1;
                q(i3);
                SnapshotKt.f14572c = SnapshotKt.f14572c.f(d());
            }
            r(SnapshotKt.e(d + 1, d(), e()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void b() {
        SnapshotKt.f14572c = SnapshotKt.f14572c.c(d()).b(this.f14545j);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void c() {
        if (this.f14555c) {
            return;
        }
        super.c();
        l();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean g() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int h() {
        return this.f14542g;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public l i() {
        return this.f14541f;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void k() {
        this.f14547l++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void l() {
        int i2 = this.f14547l;
        if (!(i2 > 0)) {
            PreconditionsKt.a("no pending nested snapshots");
            throw null;
        }
        int i3 = i2 - 1;
        this.f14547l = i3;
        if (i3 != 0 || this.f14548m) {
            return;
        }
        MutableScatterSet w = w();
        if (w != null) {
            if (!(true ^ this.f14548m)) {
                PreconditionsKt.b("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d = d();
            Object[] objArr = w.f1592b;
            long[] jArr = w.f1591a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j2) < 128) {
                                for (StateRecord q2 = ((StateObject) objArr[(i4 << 3) + i6]).q(); q2 != null; q2 = q2.f14635b) {
                                    int i7 = q2.f14634a;
                                    if (i7 == d || u.A0(this.f14545j, Integer.valueOf(i7))) {
                                        q2.f14634a = 0;
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        a();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void m() {
        if (this.f14548m || this.f14555c) {
            return;
        }
        u();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void n(StateObject stateObject) {
        MutableScatterSet w = w();
        if (w == null) {
            w = ScatterSetKt.a();
            A(w);
        }
        w.d(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void o() {
        int length = this.f14546k.length;
        for (int i2 = 0; i2 < length; i2++) {
            SnapshotKt.u(this.f14546k[i2]);
        }
        int i3 = this.d;
        if (i3 >= 0) {
            SnapshotKt.u(i3);
            this.d = -1;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void s(int i2) {
        this.f14542g = i2;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot t(l lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        if (!(!this.f14555c)) {
            PreconditionsKt.a("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f14548m && this.d < 0) {
            PreconditionsKt.b("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d = d();
        z(d());
        Object obj = SnapshotKt.f14571b;
        synchronized (obj) {
            int i2 = SnapshotKt.d;
            SnapshotKt.d = i2 + 1;
            SnapshotKt.f14572c = SnapshotKt.f14572c.f(i2);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i2, SnapshotKt.e(d + 1, i2, e()), SnapshotKt.l(lVar, f(), true), this);
        }
        if (!this.f14548m && !this.f14555c) {
            int d2 = d();
            synchronized (obj) {
                int i3 = SnapshotKt.d;
                SnapshotKt.d = i3 + 1;
                q(i3);
                SnapshotKt.f14572c = SnapshotKt.f14572c.f(d());
            }
            r(SnapshotKt.e(d2 + 1, d(), e()));
        }
        return nestedReadonlySnapshot;
    }

    public final void u() {
        z(d());
        if (this.f14548m || this.f14555c) {
            return;
        }
        int d = d();
        synchronized (SnapshotKt.f14571b) {
            int i2 = SnapshotKt.d;
            SnapshotKt.d = i2 + 1;
            q(i2);
            SnapshotKt.f14572c = SnapshotKt.f14572c.f(d());
        }
        r(SnapshotKt.e(d + 1, d(), e()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0 A[LOOP:1: B:31:0x00be->B:32:0x00c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult v() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.v():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public MutableScatterSet w() {
        return this.f14543h;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public l f() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.runtime.snapshots.SnapshotApplyResult, java.lang.Object] */
    public final SnapshotApplyResult y(int i2, HashMap hashMap, SnapshotIdSet snapshotIdSet) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        StateRecord s2;
        StateRecord r2;
        SnapshotIdSet e = e().f(d()).e(this.f14545j);
        MutableScatterSet w = w();
        p0.a.p(w);
        Object[] objArr3 = w.f1592b;
        long[] jArr3 = w.f1591a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList4 = null;
            arrayList3 = null;
            while (true) {
                long j2 = jArr3[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j2 & 255) < 128) {
                            StateObject stateObject = (StateObject) objArr3[(i4 << 3) + i7];
                            StateRecord q2 = stateObject.q();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            StateRecord s3 = SnapshotKt.s(q2, i2, snapshotIdSet);
                            if (s3 == null || (s2 = SnapshotKt.s(q2, d(), e)) == null) {
                                snapshotIdSet3 = e;
                            } else {
                                snapshotIdSet3 = e;
                                if (s2.f14634a != 1 && !p0.a.g(s3, s2)) {
                                    StateRecord s4 = SnapshotKt.s(q2, d(), e());
                                    if (s4 == null) {
                                        SnapshotKt.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (r2 = (StateRecord) hashMap.get(s3)) == null) {
                                        r2 = stateObject.r(s2, s3, s4);
                                    }
                                    if (r2 == null) {
                                        return new Object();
                                    }
                                    if (!p0.a.g(r2, s4)) {
                                        if (p0.a.g(r2, s3)) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(new k(stateObject, s3.b()));
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(stateObject);
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(!p0.a.g(r2, s2) ? new k(stateObject, r2) : new k(stateObject, s2.b()));
                                        }
                                    }
                                }
                            }
                            i3 = 8;
                        } else {
                            snapshotIdSet3 = e;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i5;
                        }
                        j2 >>= i3;
                        i7++;
                        i5 = i3;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        e = snapshotIdSet3;
                    }
                    snapshotIdSet2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    snapshotIdSet2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 == length) {
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    break;
                }
                i4++;
                objArr3 = objArr;
                jArr3 = jArr;
                e = snapshotIdSet2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        arrayList4 = arrayList2;
        if (arrayList4 != null) {
            u();
            int size = arrayList4.size();
            for (int i8 = 0; i8 < size; i8++) {
                k kVar = (k) arrayList4.get(i8);
                StateObject stateObject2 = (StateObject) kVar.f30134a;
                StateRecord stateRecord = (StateRecord) kVar.f30135b;
                stateRecord.f14634a = d();
                synchronized (SnapshotKt.f14571b) {
                    stateRecord.f14635b = stateObject2.q();
                    stateObject2.p(stateRecord);
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i9 = 0; i9 < size2; i9++) {
                w.k((StateObject) arrayList3.get(i9));
            }
            ArrayList arrayList5 = this.f14544i;
            if (arrayList5 != null) {
                arrayList3 = u.P0(arrayList3, arrayList5);
            }
            this.f14544i = arrayList3;
        }
        return SnapshotApplyResult.Success.f14556a;
    }

    public final void z(int i2) {
        synchronized (SnapshotKt.f14571b) {
            this.f14545j = this.f14545j.f(i2);
        }
    }
}
