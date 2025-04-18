package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum o {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (compareTo(state) >= 0) {
            return true;
        }
        return false;
    }
}
