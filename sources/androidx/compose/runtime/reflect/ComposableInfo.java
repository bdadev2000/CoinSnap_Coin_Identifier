package androidx.compose.runtime.reflect;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ComposableInfo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ((ComposableInfo) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + d.c(0, d.c(0, Boolean.hashCode(false) * 31, 31), 31);
    }

    public final String toString() {
        return "ComposableInfo(isComposable=false, realParamsCount=0, changedParams=0, defaultParams=0)";
    }
}
