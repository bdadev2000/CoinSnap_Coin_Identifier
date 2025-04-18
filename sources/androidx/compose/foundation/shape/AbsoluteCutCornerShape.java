package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape b(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new CornerBasedShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final Outline d(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f5 + f4 == 0.0f) {
            return new Outline.Rectangle(RectKt.a(0L, j2));
        }
        AndroidPath a2 = AndroidPath_androidKt.a();
        a2.n(0.0f, f2);
        a2.u(f2, 0.0f);
        a2.u(Size.d(j2) - f3, 0.0f);
        a2.u(Size.d(j2), f3);
        a2.u(Size.d(j2), Size.b(j2) - f4);
        a2.u(Size.d(j2) - f4, Size.b(j2));
        a2.u(f5, Size.b(j2));
        a2.u(0.0f, Size.b(j2) - f5);
        a2.close();
        return new Outline.Generic(a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        if (!a.g(this.f5386a, absoluteCutCornerShape.f5386a)) {
            return false;
        }
        if (!a.g(this.f5387b, absoluteCutCornerShape.f5387b)) {
            return false;
        }
        if (a.g(this.f5388c, absoluteCutCornerShape.f5388c)) {
            return a.g(this.d, absoluteCutCornerShape.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f5388c.hashCode() + ((this.f5387b.hashCode() + (this.f5386a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + this.f5386a + ", topRight = " + this.f5387b + ", bottomRight = " + this.f5388c + ", bottomLeft = " + this.d + ')';
    }
}
