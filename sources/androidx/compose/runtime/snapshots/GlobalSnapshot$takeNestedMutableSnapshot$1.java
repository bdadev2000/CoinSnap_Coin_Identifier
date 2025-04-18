package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f14537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f14538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(l lVar, l lVar2) {
        super(1);
        this.f14537a = lVar;
        this.f14538b = lVar2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        SnapshotIdSet snapshotIdSet = (SnapshotIdSet) obj;
        synchronized (SnapshotKt.f14571b) {
            i2 = SnapshotKt.d;
            SnapshotKt.d = i2 + 1;
        }
        return new MutableSnapshot(i2, snapshotIdSet, this.f14537a, this.f14538b);
    }
}
