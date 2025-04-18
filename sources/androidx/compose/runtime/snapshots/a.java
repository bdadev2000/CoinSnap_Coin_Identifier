package androidx.compose.runtime.snapshots;

import d0.c;
import e0.u;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ObserverHandle {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f14652b;

    public /* synthetic */ a(r rVar, int i2) {
        this.f14651a = i2;
        this.f14652b = rVar;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        switch (this.f14651a) {
            case 0:
                p pVar = (p) this.f14652b;
                synchronized (SnapshotKt.f14571b) {
                    SnapshotKt.f14574g = u.O0(SnapshotKt.f14574g, pVar);
                }
                return;
            default:
                l lVar = (l) this.f14652b;
                synchronized (SnapshotKt.f14571b) {
                    SnapshotKt.f14575h = u.O0(SnapshotKt.f14575h, lVar);
                }
                SnapshotKt.a();
                return;
        }
    }
}
