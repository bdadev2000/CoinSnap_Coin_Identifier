package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    public static final long a(long j2, Rect rect) {
        float g2 = Offset.g(j2);
        float f2 = rect.f14914a;
        if (g2 >= f2) {
            float g3 = Offset.g(j2);
            f2 = rect.f14916c;
            if (g3 <= f2) {
                f2 = Offset.g(j2);
            }
        }
        float h2 = Offset.h(j2);
        float f3 = rect.f14915b;
        if (h2 >= f3) {
            float h3 = Offset.h(j2);
            f3 = rect.d;
            if (h3 <= f3) {
                f3 = Offset.h(j2);
            }
        }
        return OffsetKt.a(f2, f3);
    }

    public static final long b(TextLayoutState textLayoutState, long j2) {
        Offset offset;
        LayoutCoordinates d = textLayoutState.d();
        if (d == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) textLayoutState.f6647f.getValue();
        if (layoutCoordinates != null) {
            offset = new Offset((d.B() && layoutCoordinates.B()) ? d.v(layoutCoordinates, j2) : j2);
        } else {
            offset = null;
        }
        return offset != null ? offset.f14913a : j2;
    }
}
