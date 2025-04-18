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
/* loaded from: classes3.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
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
        return new Outline.Rounded(new RoundRect(a2.f14914a, a2.f14915b, a2.f14916c, a2.d, CornerRadiusKt.a(f2, f2), CornerRadiusKt.a(f3, f3), CornerRadiusKt.a(f4, f4), CornerRadiusKt.a(f5, f5)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        if (!a.g(this.f5386a, absoluteRoundedCornerShape.f5386a)) {
            return false;
        }
        if (!a.g(this.f5387b, absoluteRoundedCornerShape.f5387b)) {
            return false;
        }
        if (a.g(this.f5388c, absoluteRoundedCornerShape.f5388c)) {
            return a.g(this.d, absoluteRoundedCornerShape.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f5388c.hashCode() + ((this.f5387b.hashCode() + (this.f5386a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.f5386a + ", topRight = " + this.f5387b + ", bottomRight = " + this.f5388c + ", bottomLeft = " + this.d + ')';
    }
}
