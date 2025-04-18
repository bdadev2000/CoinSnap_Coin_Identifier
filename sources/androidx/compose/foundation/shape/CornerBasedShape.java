package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class CornerBasedShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public final CornerSize f5386a;

    /* renamed from: b, reason: collision with root package name */
    public final CornerSize f5387b;

    /* renamed from: c, reason: collision with root package name */
    public final CornerSize f5388c;
    public final CornerSize d;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.f5386a = cornerSize;
        this.f5387b = cornerSize2;
        this.f5388c = cornerSize3;
        this.d = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape c(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i2) {
        if ((i2 & 1) != 0) {
            cornerSize = cornerBasedShape.f5386a;
        }
        if ((i2 & 2) != 0) {
            cornerSize2 = cornerBasedShape.f5387b;
        }
        if ((i2 & 4) != 0) {
            cornerSize3 = cornerBasedShape.f5388c;
        }
        if ((i2 & 8) != 0) {
            cornerSize4 = cornerBasedShape.d;
        }
        return cornerBasedShape.b(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        float a2 = this.f5386a.a(j2, density);
        float a3 = this.f5387b.a(j2, density);
        float a4 = this.f5388c.a(j2, density);
        float a5 = this.d.a(j2, density);
        float c2 = Size.c(j2);
        float f2 = a2 + a5;
        if (f2 > c2) {
            float f3 = c2 / f2;
            a2 *= f3;
            a5 *= f3;
        }
        float f4 = a5;
        float f5 = a3 + a4;
        if (f5 > c2) {
            float f6 = c2 / f5;
            a3 *= f6;
            a4 *= f6;
        }
        if (a2 >= 0.0f && a3 >= 0.0f && a4 >= 0.0f && f4 >= 0.0f) {
            return d(j2, a2, a3, a4, f4, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a2 + ", topEnd = " + a3 + ", bottomEnd = " + a4 + ", bottomStart = " + f4 + ")!").toString());
    }

    public abstract CornerBasedShape b(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    public abstract Outline d(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection);
}
