package androidx.compose.ui.unit;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class DpRect {

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        ((DpRect) obj).getClass();
        return Dp.a(0.0f, 0.0f) && Dp.a(0.0f, 0.0f) && Dp.a(0.0f, 0.0f) && Dp.a(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + d.b(0.0f, d.b(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        return "DpRect(left=" + ((Object) Dp.b(0.0f)) + ", top=" + ((Object) Dp.b(0.0f)) + ", right=" + ((Object) Dp.b(0.0f)) + ", bottom=" + ((Object) Dp.b(0.0f)) + ')';
    }
}
