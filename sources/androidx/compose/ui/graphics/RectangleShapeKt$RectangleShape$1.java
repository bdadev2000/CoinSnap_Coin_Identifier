package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes4.dex */
public final class RectangleShapeKt$RectangleShape$1 implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        return new Outline.Rectangle(RectKt.a(0L, j2));
    }

    public final String toString() {
        return "RectangleShape";
    }
}
