package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import p0.a;

/* loaded from: classes4.dex */
public final class BrushPainter extends Painter {

    /* renamed from: a, reason: collision with root package name */
    public float f15274a;

    /* renamed from: b, reason: collision with root package name */
    public ColorFilter f15275b;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f2) {
        this.f15274a = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f15275b = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrushPainter)) {
            return false;
        }
        ((BrushPainter) obj).getClass();
        return a.g(null, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo2getIntrinsicSizeNHjbRc() {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        DrawScope.a1(drawScope, null, 0L, 0L, this.f15274a, null, this.f15275b, 86);
    }

    public final String toString() {
        return "BrushPainter(brush=null)";
    }
}
