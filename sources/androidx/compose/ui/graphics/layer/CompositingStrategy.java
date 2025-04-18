package androidx.compose.ui.graphics.layer;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class CompositingStrategy {

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CompositingStrategy)) {
            return false;
        }
        ((CompositingStrategy) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "CompositingStrategy(value=0)";
    }
}
