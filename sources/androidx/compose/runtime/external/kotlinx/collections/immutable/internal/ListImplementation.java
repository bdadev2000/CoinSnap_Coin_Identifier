package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ListImplementation {
    public static final void a(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(d.k("index: ", i2, ", size: ", i3));
        }
    }

    public static final void b(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(d.k("index: ", i2, ", size: ", i3));
        }
    }

    public static final void c(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder u2 = d.u("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            u2.append(i4);
            throw new IndexOutOfBoundsException(u2.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(d.k("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }
}
