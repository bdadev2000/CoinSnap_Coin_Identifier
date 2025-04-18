package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SnapshotKt$takeNewSnapshot$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f14585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$takeNewSnapshot$1(l lVar) {
        super(1);
        this.f14585a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Snapshot snapshot = (Snapshot) this.f14585a.invoke((SnapshotIdSet) obj);
        synchronized (SnapshotKt.f14571b) {
            SnapshotKt.f14572c = SnapshotKt.f14572c.f(snapshot.d());
        }
        return snapshot;
    }
}
