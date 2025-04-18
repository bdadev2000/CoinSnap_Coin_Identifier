package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;

/* loaded from: classes4.dex */
public final class OutlineKt {
    public static void a(DrawScope drawScope, Outline outline, long j2) {
        Path path;
        Fill fill = Fill.f15146a;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).f15001a;
            drawScope.d1(j2, OffsetKt.a(rect.f14914a, rect.f14915b), SizeKt.a(rect.h(), rect.e()), 1.0f, fill, null, 3);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.f15003b;
            if (path == null) {
                RoundRect roundRect = rounded.f15002a;
                float b2 = CornerRadius.b(roundRect.f14922h);
                drawScope.I0(j2, OffsetKt.a(roundRect.f14917a, roundRect.f14918b), SizeKt.a(roundRect.b(), roundRect.a()), CornerRadiusKt.a(b2, b2), fill, 1.0f, null, 3);
                return;
            }
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new RuntimeException();
            }
            path = ((Outline.Generic) outline).f15000a;
        }
        drawScope.c1(path, j2, 1.0f, fill, null, 3);
    }
}
