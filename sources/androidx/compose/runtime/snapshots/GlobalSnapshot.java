package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GlobalSnapshot(int r6, androidx.compose.runtime.snapshots.SnapshotIdSet r7) {
        /*
            r5 = this;
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.f14571b
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f14575h     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "<this>"
            p0.a.s(r1, r2)     // Catch: java.lang.Throwable -> L23
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L23
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L18
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L23
            goto L19
        L18:
            r2 = r4
        L19:
            q0.l r2 = (q0.l) r2     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L25
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r2 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch: java.lang.Throwable -> L23
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r6 = move-exception
            goto L2a
        L25:
            monitor-exit(r0)
            r5.<init>(r6, r7, r4, r2)
            return
        L2a:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableSnapshot B(l lVar, l lVar2) {
        return (MutableSnapshot) ((Snapshot) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new GlobalSnapshot$takeNestedMutableSnapshot$1(lVar, lVar2))));
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        synchronized (SnapshotKt.f14571b) {
            int i2 = this.d;
            if (i2 >= 0) {
                SnapshotKt.u(i2);
                this.d = -1;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void k() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void m() {
        SnapshotKt.a();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot t(l lVar) {
        return (Snapshot) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new GlobalSnapshot$takeNestedSnapshot$1(lVar)));
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotApplyResult v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
