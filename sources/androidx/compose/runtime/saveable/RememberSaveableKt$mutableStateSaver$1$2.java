package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RememberSaveableKt$mutableStateSaver$1$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Saver f14491a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$2(SaverKt$Saver$1 saverKt$Saver$1) {
        super(1);
        this.f14491a = saverKt$Saver$1;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Object obj2;
        MutableState mutableState = (MutableState) obj;
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (mutableState.getValue() != null) {
            Object value = mutableState.getValue();
            a.p(value);
            obj2 = this.f14491a.b(value);
        } else {
            obj2 = null;
        }
        SnapshotMutationPolicy f2 = ((SnapshotMutableState) mutableState).f();
        a.q(f2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
        return SnapshotStateKt.f(obj2, f2);
    }
}
