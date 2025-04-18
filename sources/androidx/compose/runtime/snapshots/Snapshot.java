package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.u;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class Snapshot {

    /* renamed from: a, reason: collision with root package name */
    public SnapshotIdSet f14553a;

    /* renamed from: b, reason: collision with root package name */
    public int f14554b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14555c;
    public int d;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static Snapshot a() {
            return (Snapshot) SnapshotKt.f14570a.a();
        }

        public static boolean b() {
            return SnapshotKt.f14570a.a() != null;
        }

        public static Snapshot c(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.f14646t == ActualJvm_jvmKt.a()) {
                    transparentObserverMutableSnapshot.f14644r = null;
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.f14650i == ActualJvm_jvmKt.a()) {
                    transparentObserverSnapshot.f14649h = null;
                    return snapshot;
                }
            }
            Snapshot h2 = SnapshotKt.h(snapshot, null, false);
            h2.j();
            return h2;
        }

        public static Object d(l lVar, q0.a aVar) {
            Snapshot transparentObserverMutableSnapshot;
            if (lVar == null) {
                return aVar.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.f14570a.a();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.f14646t == ActualJvm_jvmKt.a()) {
                    l lVar2 = transparentObserverMutableSnapshot2.f14644r;
                    l lVar3 = transparentObserverMutableSnapshot2.f14645s;
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).f14644r = SnapshotKt.l(lVar, lVar2, true);
                        ((TransparentObserverMutableSnapshot) snapshot).f14645s = SnapshotKt.b(null, lVar3);
                        return aVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.f14644r = lVar2;
                        transparentObserverMutableSnapshot2.f14645s = lVar3;
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, lVar, null, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.t(lVar);
            }
            try {
                Snapshot j2 = transparentObserverMutableSnapshot.j();
                try {
                    return aVar.invoke();
                } finally {
                    Snapshot.p(j2);
                }
            } finally {
                transparentObserverMutableSnapshot.c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a e(p pVar) {
            SnapshotThreadLocal snapshotThreadLocal = SnapshotKt.f14570a;
            SnapshotKt.f(SnapshotKt$emptyLambda$1.f14580a);
            synchronized (SnapshotKt.f14571b) {
                SnapshotKt.f14574g = u.Q0(SnapshotKt.f14574g, pVar);
            }
            return new a((r) pVar, 0);
        }

        public static void f(Snapshot snapshot, Snapshot snapshot2, l lVar) {
            if (snapshot != snapshot2) {
                snapshot2.getClass();
                Snapshot.p(snapshot);
                snapshot2.c();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).f14644r = lVar;
            } else if (snapshot instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) snapshot).f14649h = lVar;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot).toString());
            }
        }

        public static void g() {
            boolean z2;
            synchronized (SnapshotKt.f14571b) {
                MutableScatterSet mutableScatterSet = ((GlobalSnapshot) SnapshotKt.f14576i.get()).f14543h;
                z2 = false;
                if (mutableScatterSet != null) {
                    if (mutableScatterSet.c()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                SnapshotKt.a();
            }
        }

        public static MutableSnapshot h(l lVar, l lVar2) {
            MutableSnapshot B;
            Snapshot k2 = SnapshotKt.k();
            MutableSnapshot mutableSnapshot = k2 instanceof MutableSnapshot ? (MutableSnapshot) k2 : null;
            if (mutableSnapshot == null || (B = mutableSnapshot.B(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return B;
        }
    }

    public Snapshot(int i2, SnapshotIdSet snapshotIdSet) {
        int i3;
        int numberOfTrailingZeros;
        this.f14553a = snapshotIdSet;
        this.f14554b = i2;
        if (i2 != 0) {
            SnapshotIdSet e = e();
            SnapshotThreadLocal snapshotThreadLocal = SnapshotKt.f14570a;
            int[] iArr = e.d;
            if (iArr != null) {
                i2 = iArr[0];
            } else {
                long j2 = e.f14563b;
                int i4 = e.f14564c;
                if (j2 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
                } else {
                    long j3 = e.f14562a;
                    if (j3 != 0) {
                        i4 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                    }
                }
                i2 = numberOfTrailingZeros + i4;
            }
            synchronized (SnapshotKt.f14571b) {
                i3 = SnapshotKt.e.a(i2);
            }
        } else {
            i3 = -1;
        }
        this.d = i3;
    }

    public static void p(Snapshot snapshot) {
        SnapshotKt.f14570a.b(snapshot);
    }

    public final void a() {
        synchronized (SnapshotKt.f14571b) {
            b();
            o();
        }
    }

    public void b() {
        SnapshotKt.f14572c = SnapshotKt.f14572c.c(d());
    }

    public void c() {
        this.f14555c = true;
        synchronized (SnapshotKt.f14571b) {
            int i2 = this.d;
            if (i2 >= 0) {
                SnapshotKt.u(i2);
                this.d = -1;
            }
        }
    }

    public int d() {
        return this.f14554b;
    }

    public SnapshotIdSet e() {
        return this.f14553a;
    }

    public abstract l f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract l i();

    public final Snapshot j() {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotKt.f14570a;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.a();
        snapshotThreadLocal.b(this);
        return snapshot;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(StateObject stateObject);

    public void o() {
        int i2 = this.d;
        if (i2 >= 0) {
            SnapshotKt.u(i2);
            this.d = -1;
        }
    }

    public void q(int i2) {
        this.f14554b = i2;
    }

    public void r(SnapshotIdSet snapshotIdSet) {
        this.f14553a = snapshotIdSet;
    }

    public void s(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract Snapshot t(l lVar);
}
