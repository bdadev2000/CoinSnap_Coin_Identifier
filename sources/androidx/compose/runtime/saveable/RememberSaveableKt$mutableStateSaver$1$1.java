package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RememberSaveableKt$mutableStateSaver$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Saver f14490a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$1(SaverKt$Saver$1 saverKt$Saver$1) {
        super(2);
        this.f14490a = saverKt$Saver$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        MutableState mutableState = (MutableState) obj2;
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
        }
        Object a2 = this.f14490a.a(saverScope, mutableState.getValue());
        if (a2 == null) {
            return null;
        }
        SnapshotMutationPolicy f2 = ((SnapshotMutableState) mutableState).f();
        a.q(f2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
        return SnapshotStateKt.f(a2, f2);
    }
}
