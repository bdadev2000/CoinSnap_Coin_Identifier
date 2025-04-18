package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidPointerIcon implements PointerIcon {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.g(AndroidPointerIcon.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
