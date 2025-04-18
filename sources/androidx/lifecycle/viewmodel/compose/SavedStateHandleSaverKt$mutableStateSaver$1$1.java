package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
final class SavedStateHandleSaverKt$mutableStateSaver$1$1 extends r implements p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        MutableState mutableState = (MutableState) obj2;
        a.s((SaverScope) obj, "$this$Saver");
        a.s(mutableState, "state");
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
        }
        mutableState.getValue();
        throw null;
    }
}
