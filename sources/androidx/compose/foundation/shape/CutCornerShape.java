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
public final class CutCornerShape extends CornerBasedShape {
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
        LayoutDirection layoutDirection2 = LayoutDirection.f17494a;
        float f6 = layoutDirection == layoutDirection2 ? f2 : f3;
        a2.n(0.0f, f6);
        a2.u(f6, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f2 = f3;
        }
        a2.u(Size.d(j2) - f2, 0.0f);
        a2.u(Size.d(j2), f2);
        float f7 = layoutDirection == layoutDirection2 ? f4 : f5;
        a2.u(Size.d(j2), Size.b(j2) - f7);
        a2.u(Size.d(j2) - f7, Size.b(j2));
        if (layoutDirection == layoutDirection2) {
            f4 = f5;
        }
        a2.u(f4, Size.b(j2));
        a2.u(0.0f, Size.b(j2) - f4);
        a2.close();
        return new Outline.Generic(a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        if (!a.g(this.f5386a, cutCornerShape.f5386a)) {
            return false;
        }
        if (!a.g(this.f5387b, cutCornerShape.f5387b)) {
            return false;
        }
        if (a.g(this.f5388c, cutCornerShape.f5388c)) {
            return a.g(this.d, cutCornerShape.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f5388c.hashCode() + ((this.f5387b.hashCode() + (this.f5386a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CutCornerShape(topStart = " + this.f5386a + ", topEnd = " + this.f5387b + ", bottomEnd = " + this.f5388c + ", bottomStart = " + this.d + ')';
    }
}
