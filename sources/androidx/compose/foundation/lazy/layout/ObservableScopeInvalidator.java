package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import d0.b0;
import p0.a;

/* loaded from: classes3.dex */
public final class ObservableScopeInvalidator {
    public static MutableState a() {
        return SnapshotStateKt.f(b0.f30125a, SnapshotStateKt.h());
    }

    public static final void b(MutableState mutableState) {
        mutableState.setValue(b0.f30125a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ObservableScopeInvalidator)) {
            return false;
        }
        ((ObservableScopeInvalidator) obj).getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ObservableScopeInvalidator(state=null)";
    }
}
