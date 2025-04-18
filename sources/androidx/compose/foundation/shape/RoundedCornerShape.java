package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape b(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new CornerBasedShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final Outline d(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f4 + f5 == 0.0f) {
            return new Outline.Rectangle(RectKt.a(0L, j2));
        }
        Rect a2 = RectKt.a(0L, j2);
        LayoutDirection layoutDirection2 = LayoutDirection.f17494a;
        float f6 = layoutDirection == layoutDirection2 ? f2 : f3;
        long a3 = CornerRadiusKt.a(f6, f6);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f2;
        long a4 = CornerRadiusKt.a(f7, f7);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f5;
        long a5 = CornerRadiusKt.a(f8, f8);
        float f9 = layoutDirection == layoutDirection2 ? f5 : f4;
        return new Outline.Rounded(new RoundRect(a2.f14914a, a2.f14915b, a2.f14916c, a2.d, a3, a4, a5, CornerRadiusKt.a(f9, f9)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        if (!a.g(this.f5386a, roundedCornerShape.f5386a)) {
            return false;
        }
        if (!a.g(this.f5387b, roundedCornerShape.f5387b)) {
            return false;
        }
        if (a.g(this.f5388c, roundedCornerShape.f5388c)) {
            return a.g(this.d, roundedCornerShape.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f5388c.hashCode() + ((this.f5387b.hashCode() + (this.f5386a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f5386a + ", topEnd = " + this.f5387b + ", bottomEnd = " + this.f5388c + ", bottomStart = " + this.d + ')';
    }
}
