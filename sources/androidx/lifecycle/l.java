package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {
    public static n a(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return n.ON_PAUSE;
            }
            return n.ON_STOP;
        }
        return n.ON_DESTROY;
    }

    public static n b(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return n.ON_RESUME;
            }
            return n.ON_START;
        }
        return n.ON_CREATE;
    }

    public static n c(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return n.ON_RESUME;
            }
            return n.ON_START;
        }
        return n.ON_CREATE;
    }
}
