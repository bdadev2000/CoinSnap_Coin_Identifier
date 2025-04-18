package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
final class SavedStateHandleSaverKt$mutableStateSaver$1$2 extends r implements l {
    @Override // q0.l
    public final Object invoke(Object obj) {
        MutableState mutableState = (MutableState) obj;
        a.s(mutableState, "it");
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (mutableState.getValue() != null) {
            a.p(mutableState.getValue());
            throw null;
        }
        SnapshotMutationPolicy f2 = ((SnapshotMutableState) mutableState).f();
        a.q(f2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5?>");
        return SnapshotStateKt.f(null, f2);
    }
}
