package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f14064a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(MutableScatterSet mutableScatterSet) {
        super(1);
        this.f14064a = mutableScatterSet;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (obj instanceof StateObjectImpl) {
            ((StateObjectImpl) obj).v(4);
        }
        this.f14064a.d(obj);
        return b0.f30125a;
    }
}
