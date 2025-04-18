package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class GlobalSnapshot$takeNestedSnapshot$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f14539a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedSnapshot$1(l lVar) {
        super(1);
        this.f14539a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        SnapshotIdSet snapshotIdSet = (SnapshotIdSet) obj;
        synchronized (SnapshotKt.f14571b) {
            i2 = SnapshotKt.d;
            SnapshotKt.d = i2 + 1;
        }
        return new ReadonlySnapshot(i2, snapshotIdSet, this.f14539a);
    }
}
