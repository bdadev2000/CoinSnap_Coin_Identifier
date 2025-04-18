package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ValueElement {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ((ValueElement) obj).getClass();
        return p0.a.g(null, null) && p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ValueElement(name=null, value=null)";
    }
}
