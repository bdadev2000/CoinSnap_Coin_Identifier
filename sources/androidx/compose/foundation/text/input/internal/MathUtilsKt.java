package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes3.dex */
public final class MathUtilsKt {
    public static final float a(long j2, Rect rect) {
        if (SelectionManagerKt.a(j2, rect)) {
            return 0.0f;
        }
        float f2 = Offset.f(Offset.j(rect.g(), j2));
        if (f2 >= Float.MAX_VALUE) {
            f2 = Float.MAX_VALUE;
        }
        float f3 = rect.f14915b;
        float f4 = rect.f14916c;
        float f5 = Offset.f(Offset.j(OffsetKt.a(f4, f3), j2));
        if (f5 < f2) {
            f2 = f5;
        }
        float f6 = rect.f14914a;
        float f7 = rect.d;
        float f8 = Offset.f(Offset.j(OffsetKt.a(f6, f7), j2));
        if (f8 < f2) {
            f2 = f8;
        }
        float f9 = Offset.f(Offset.j(OffsetKt.a(f4, f7), j2));
        return f9 < f2 ? f9 : f2;
    }
}
