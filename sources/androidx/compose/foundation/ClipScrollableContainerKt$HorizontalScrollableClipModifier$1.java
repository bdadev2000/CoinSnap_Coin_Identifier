package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public final class ClipScrollableContainerKt$HorizontalScrollableClipModifier$1 implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        float F0 = density.F0(ClipScrollableContainerKt.f2657a);
        return new Outline.Rectangle(new Rect(0.0f, -F0, Size.d(j2), Size.b(j2) + F0));
    }
}
