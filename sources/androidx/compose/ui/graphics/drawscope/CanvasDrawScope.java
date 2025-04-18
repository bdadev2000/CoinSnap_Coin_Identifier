package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import p0.a;

/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {

    /* renamed from: a, reason: collision with root package name */
    public final DrawParams f15133a;

    /* renamed from: b, reason: collision with root package name */
    public final CanvasDrawScope$drawContext$1 f15134b;

    /* renamed from: c, reason: collision with root package name */
    public AndroidPaint f15135c;
    public AndroidPaint d;

    /* loaded from: classes.dex */
    public static final class DrawParams {

        /* renamed from: a, reason: collision with root package name */
        public Density f15136a;

        /* renamed from: b, reason: collision with root package name */
        public LayoutDirection f15137b;

        /* renamed from: c, reason: collision with root package name */
        public Canvas f15138c;
        public long d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return a.g(this.f15136a, drawParams.f15136a) && this.f15137b == drawParams.f15137b && a.g(this.f15138c, drawParams.f15138c) && Size.a(this.d, drawParams.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.f15138c.hashCode() + ((this.f15137b.hashCode() + (this.f15136a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.f15136a + ", layoutDirection=" + this.f15137b + ", canvas=" + this.f15138c + ", size=" + ((Object) Size.f(this.d)) + ')';
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.graphics.Canvas, java.lang.Object] */
    public CanvasDrawScope() {
        Density density = DrawContextKt.f15143a;
        LayoutDirection layoutDirection = LayoutDirection.f17494a;
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.f15136a = density;
        obj2.f15137b = layoutDirection;
        obj2.f15138c = obj;
        obj2.d = 0L;
        this.f15133a = obj2;
        this.f15134b = new CanvasDrawScope$drawContext$1(this);
    }

    public static Paint m(CanvasDrawScope canvasDrawScope, long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        Paint v2 = canvasDrawScope.v(drawStyle);
        if (f2 != 1.0f) {
            j2 = Color.b(j2, Color.d(j2) * f2);
        }
        AndroidPaint androidPaint = (AndroidPaint) v2;
        if (!Color.c(androidPaint.b(), j2)) {
            androidPaint.v(j2);
        }
        if (androidPaint.f14935c != null) {
            androidPaint.x(null);
        }
        if (!a.g(androidPaint.d, colorFilter)) {
            androidPaint.z(colorFilter);
        }
        if (!BlendMode.a(androidPaint.f14934b, i2)) {
            androidPaint.r(i2);
        }
        if (!FilterQuality.a(androidPaint.f14933a.isFilterBitmap() ? 1 : 0, 1)) {
            androidPaint.s(1);
        }
        return v2;
    }

    public static Paint q(CanvasDrawScope canvasDrawScope, long j2, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        Paint s2 = canvasDrawScope.s();
        if (f3 != 1.0f) {
            j2 = Color.b(j2, Color.d(j2) * f3);
        }
        AndroidPaint androidPaint = (AndroidPaint) s2;
        if (!Color.c(androidPaint.b(), j2)) {
            androidPaint.v(j2);
        }
        if (androidPaint.f14935c != null) {
            androidPaint.x(null);
        }
        if (!a.g(androidPaint.d, colorFilter)) {
            androidPaint.z(colorFilter);
        }
        if (!BlendMode.a(androidPaint.f14934b, i3)) {
            androidPaint.r(i3);
        }
        if (androidPaint.f14933a.getStrokeWidth() != f2) {
            androidPaint.D(f2);
        }
        if (androidPaint.f14933a.getStrokeMiter() != 4.0f) {
            androidPaint.A(4.0f);
        }
        if (!StrokeCap.a(androidPaint.d(), i2)) {
            androidPaint.q(i2);
        }
        if (!StrokeJoin.a(androidPaint.e(), 0)) {
            androidPaint.u(0);
        }
        if (!a.g(androidPaint.e, pathEffect)) {
            androidPaint.t(pathEffect);
        }
        if (!FilterQuality.a(androidPaint.f14933a.isFilterBitmap() ? 1 : 0, 1)) {
            androidPaint.s(1);
        }
        return s2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final CanvasDrawScope$drawContext$1 A1() {
        return this.f15134b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void B0(long j2, float f2, float f3, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.e(Offset.g(j3), Offset.h(j3), Size.d(j4) + Offset.g(j3), Size.b(j4) + Offset.h(j3), f2, f3, m(this, j2, drawStyle, f4, colorFilter, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void B1(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        Canvas canvas = this.f15133a.f15138c;
        Paint s2 = s();
        if (brush != null) {
            brush.a(f3, b(), s2);
        } else {
            AndroidPaint androidPaint = (AndroidPaint) s2;
            if (androidPaint.a() != f3) {
                androidPaint.c(f3);
            }
        }
        AndroidPaint androidPaint2 = (AndroidPaint) s2;
        if (!a.g(androidPaint2.d, colorFilter)) {
            androidPaint2.z(colorFilter);
        }
        if (!BlendMode.a(androidPaint2.f14934b, i3)) {
            androidPaint2.r(i3);
        }
        if (androidPaint2.f14933a.getStrokeWidth() != f2) {
            androidPaint2.D(f2);
        }
        if (androidPaint2.f14933a.getStrokeMiter() != 4.0f) {
            androidPaint2.A(4.0f);
        }
        if (!StrokeCap.a(androidPaint2.d(), i2)) {
            androidPaint2.q(i2);
        }
        if (!StrokeJoin.a(androidPaint2.e(), 0)) {
            androidPaint2.u(0);
        }
        if (!a.g(androidPaint2.e, pathEffect)) {
            androidPaint2.t(pathEffect);
        }
        if (!FilterQuality.a(androidPaint2.f14933a.isFilterBitmap() ? 1 : 0, 1)) {
            androidPaint2.s(1);
        }
        canvas.m(j2, j3, s2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void I0(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.v(Offset.g(j3), Offset.h(j3), Size.d(j4) + Offset.g(j3), Size.b(j4) + Offset.h(j3), CornerRadius.b(j5), CornerRadius.c(j5), m(this, j2, drawStyle, f2, colorFilter, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void I1(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        this.f15133a.f15138c.c(imageBitmap, j2, j3, j4, j5, n(null, drawStyle, f2, colorFilter, i2, i3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void U0(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.d(imageBitmap, j2, n(null, drawStyle, f2, colorFilter, i2, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void Z0(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.b(Offset.g(j2), Offset.h(j2), Size.d(j3) + Offset.g(j2), Size.b(j3) + Offset.h(j2), n(brush, drawStyle, f2, colorFilter, i2, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void b1(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.f15133a.f15138c.m(j3, j4, q(this, j2, f2, i2, pathEffect, f3, colorFilter, i3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void c1(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.s(path, m(this, j2, drawStyle, f2, colorFilter, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void d1(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.b(Offset.g(j3), Offset.h(j3), Size.d(j4) + Offset.g(j3), Size.b(j4) + Offset.h(j3), m(this, j2, drawStyle, f2, colorFilter, i2));
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f15133a.f15136a.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.f15133a.f15137b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void j1(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.u(f2, j3, m(this, j2, drawStyle, f3, colorFilter, i2));
    }

    public final Paint n(Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint v2 = v(drawStyle);
        if (brush != null) {
            brush.a(f2, b(), v2);
        } else {
            if (v2.y() != null) {
                v2.x(null);
            }
            long b2 = v2.b();
            int i4 = Color.f14963j;
            long j2 = Color.f14957b;
            if (!Color.c(b2, j2)) {
                v2.v(j2);
            }
            if (v2.a() != f2) {
                v2.c(f2);
            }
        }
        if (!a.g(v2.n(), colorFilter)) {
            v2.z(colorFilter);
        }
        if (!BlendMode.a(v2.p(), i2)) {
            v2.r(i2);
        }
        if (!FilterQuality.a(v2.B(), i3)) {
            v2.s(i3);
        }
        return v2;
    }

    public final Paint s() {
        AndroidPaint androidPaint = this.d;
        if (androidPaint != null) {
            return androidPaint;
        }
        AndroidPaint a2 = AndroidPaint_androidKt.a();
        a2.C(1);
        this.d = a2;
        return a2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void u1(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.v(Offset.g(j2), Offset.h(j2), Size.d(j3) + Offset.g(j2), Size.b(j3) + Offset.h(j2), CornerRadius.b(j4), CornerRadius.c(j4), n(brush, drawStyle, f2, colorFilter, i2, 1));
    }

    public final Paint v(DrawStyle drawStyle) {
        if (a.g(drawStyle, Fill.f15146a)) {
            AndroidPaint androidPaint = this.f15135c;
            if (androidPaint != null) {
                return androidPaint;
            }
            AndroidPaint a2 = AndroidPaint_androidKt.a();
            a2.C(0);
            this.f15135c = a2;
            return a2;
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new RuntimeException();
        }
        Paint s2 = s();
        AndroidPaint androidPaint2 = (AndroidPaint) s2;
        float strokeWidth = androidPaint2.f14933a.getStrokeWidth();
        Stroke stroke = (Stroke) drawStyle;
        float f2 = stroke.f15147a;
        if (strokeWidth != f2) {
            androidPaint2.D(f2);
        }
        int d = androidPaint2.d();
        int i2 = stroke.f15149c;
        if (!StrokeCap.a(d, i2)) {
            androidPaint2.q(i2);
        }
        float strokeMiter = androidPaint2.f14933a.getStrokeMiter();
        float f3 = stroke.f15148b;
        if (strokeMiter != f3) {
            androidPaint2.A(f3);
        }
        int e = androidPaint2.e();
        int i3 = stroke.d;
        if (!StrokeJoin.a(e, i3)) {
            androidPaint2.u(i3);
        }
        PathEffect pathEffect = androidPaint2.e;
        PathEffect pathEffect2 = stroke.e;
        if (!a.g(pathEffect, pathEffect2)) {
            androidPaint2.t(pathEffect2);
        }
        return s2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void v0(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15133a.f15138c.s(path, n(brush, drawStyle, f2, colorFilter, i2, 1));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f15133a.f15136a.x1();
    }
}
