package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawScope extends Density {

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static void H0(DrawScope drawScope, long j2, long j3, long j4, long j5, DrawStyle drawStyle, int i2) {
        long j6 = (i2 & 2) != 0 ? 0L : j3;
        drawScope.I0(j2, j6, (i2 & 4) != 0 ? s1(drawScope.b(), j6) : j4, (i2 & 8) != 0 ? CornerRadius.f14908a : j5, (i2 & 16) != 0 ? Fill.f15146a : drawStyle, (i2 & 32) != 0 ? 1.0f : 0.0f, null, (i2 & 128) != 0 ? 3 : 0);
    }

    static /* synthetic */ void N(DrawScope drawScope, Path path, long j2, float f2, Stroke stroke, int i2) {
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        DrawStyle drawStyle = stroke;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.f15146a;
        }
        drawScope.c1(path, j2, f3, drawStyle, null, (i2 & 32) != 0 ? 3 : 0);
    }

    static void N0(DrawScope drawScope, GraphicsLayer graphicsLayer, l lVar) {
        long b2 = drawScope.b();
        drawScope.c0(graphicsLayer, (((int) Size.d(b2)) << 32) | (((int) Size.b(b2)) & 4294967295L), lVar);
    }

    static /* synthetic */ void R0(DrawScope drawScope, long j2, long j3, long j4, float f2, ColorFilter colorFilter, int i2) {
        long j5 = (i2 & 2) != 0 ? 0L : j3;
        drawScope.d1(j2, j5, (i2 & 4) != 0 ? s1(drawScope.b(), j5) : j4, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.f15146a : null, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void W(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i4) {
        long j6 = (i4 & 2) != 0 ? 0L : j2;
        long a2 = (i4 & 4) != 0 ? IntSizeKt.a(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3;
        drawScope.I1(imageBitmap, j6, a2, (i4 & 8) != 0 ? 0L : j4, (i4 & 16) != 0 ? a2 : j5, (i4 & 32) != 0 ? 1.0f : f2, (i4 & 64) != 0 ? Fill.f15146a : drawStyle, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? 3 : i2, (i4 & 512) != 0 ? 1 : i3);
    }

    static /* synthetic */ void Y(DrawScope drawScope, Path path, Brush brush, float f2, Stroke stroke, int i2) {
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        DrawStyle drawStyle = stroke;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.f15146a;
        }
        drawScope.v0(path, brush, f3, drawStyle, null, (i2 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void a1(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        drawScope.Z0(brush, j4, (i2 & 4) != 0 ? s1(drawScope.b(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.f15146a : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? 3 : 0);
    }

    static void l0(DrawScope drawScope, Brush brush, long j2, long j3, long j4, Stroke stroke, int i2) {
        long j5 = (i2 & 2) != 0 ? 0L : j2;
        drawScope.u1(brush, j5, (i2 & 4) != 0 ? s1(drawScope.b(), j5) : j3, (i2 & 8) != 0 ? CornerRadius.f14908a : j4, (i2 & 16) != 0 ? 1.0f : 0.0f, (i2 & 32) != 0 ? Fill.f15146a : stroke, null, (i2 & 128) != 0 ? 3 : 0);
    }

    static long s1(long j2, long j3) {
        return SizeKt.a(Size.d(j2) - Offset.g(j3), Size.b(j2) - Offset.h(j3));
    }

    static /* synthetic */ void t1(DrawScope drawScope, long j2, float f2, float f3, long j3, long j4, float f4, DrawStyle drawStyle, int i2) {
        long j5 = (i2 & 16) != 0 ? 0L : j3;
        drawScope.B0(j2, f2, f3, j5, (i2 & 32) != 0 ? s1(drawScope.b(), j5) : j4, (i2 & 64) != 0 ? 1.0f : f4, (i2 & 128) != 0 ? Fill.f15146a : drawStyle, null, (i2 & 512) != 0 ? 3 : 0);
    }

    CanvasDrawScope$drawContext$1 A1();

    void B0(long j2, float f2, float f3, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void B1(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);

    default long F1() {
        return SizeKt.b(A1().b());
    }

    void I0(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2);

    default void I1(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        W(this, imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, 0, 512);
    }

    void U0(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void Z0(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    default long b() {
        return A1().b();
    }

    void b1(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);

    default void c0(GraphicsLayer graphicsLayer, long j2, l lVar) {
        graphicsLayer.e(this, getLayoutDirection(), j2, new DrawScope$record$1(this, lVar));
    }

    void c1(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void d1(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    LayoutDirection getLayoutDirection();

    void j1(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void u1(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void v0(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);
}
