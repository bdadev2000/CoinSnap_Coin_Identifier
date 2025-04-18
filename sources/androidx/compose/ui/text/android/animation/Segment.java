package androidx.compose.ui.text.android.animation;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class Segment {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Segment)) {
            return false;
        }
        ((Segment) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + d.c(0, d.c(0, d.c(0, d.c(0, Integer.hashCode(0) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "Segment(startOffset=0, endOffset=0, left=0, top=0, right=0, bottom=0)";
    }
}
