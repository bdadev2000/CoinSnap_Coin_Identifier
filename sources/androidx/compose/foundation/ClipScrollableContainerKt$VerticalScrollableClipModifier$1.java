package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public final class ClipScrollableContainerKt$VerticalScrollableClipModifier$1 implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        float F0 = density.F0(ClipScrollableContainerKt.f2657a);
        return new Outline.Rectangle(new Rect(-F0, 0.0f, Size.d(j2) + F0, Size.b(j2)));
    }
}
