package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* loaded from: classes4.dex */
public final class ColorPainter extends Painter {

    /* renamed from: a, reason: collision with root package name */
    public final long f15276a;

    /* renamed from: c, reason: collision with root package name */
    public ColorFilter f15278c;

    /* renamed from: b, reason: collision with root package name */
    public float f15277b = 1.0f;
    public final long d = 9205357640488583168L;

    public ColorPainter(long j2) {
        this.f15276a = j2;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f2) {
        this.f15277b = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f15278c = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColorPainter) {
            return Color.c(this.f15276a, ((ColorPainter) obj).f15276a);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo2getIntrinsicSizeNHjbRc() {
        return this.d;
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f15276a);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        DrawScope.R0(drawScope, this.f15276a, 0L, 0L, this.f15277b, this.f15278c, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) Color.i(this.f15276a)) + ')';
    }
}
