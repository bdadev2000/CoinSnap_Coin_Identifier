package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes2.dex */
public final class AndroidPath implements Path {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f14938a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f14939b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f14940c;
    public android.graphics.Matrix d;

    public AndroidPath(android.graphics.Path path) {
        this.f14938a = path;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean a() {
        return this.f14938a.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final Rect b() {
        if (this.f14939b == null) {
            this.f14939b = new RectF();
        }
        RectF rectF = this.f14939b;
        p0.a.p(rectF);
        this.f14938a.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void c(float f2, float f3) {
        this.f14938a.rMoveTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.f14938a.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void d(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f14938a.rCubicTo(f2, f3, f4, f5, f6, f7);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void e(float f2, float f3, float f4, float f5) {
        this.f14938a.quadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void f(float f2, float f3, float f4, float f5) {
        this.f14938a.rQuadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void g(int i2) {
        this.f14938a.setFillType(i2 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void h(float f2, float f3, float f4, float f5) {
        this.f14938a.quadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void i(Rect rect, Path.Direction direction) {
        Path.Direction direction2;
        if (!Float.isNaN(rect.f14914a)) {
            float f2 = rect.f14915b;
            if (!Float.isNaN(f2)) {
                float f3 = rect.f14916c;
                if (!Float.isNaN(f3)) {
                    float f4 = rect.d;
                    if (!Float.isNaN(f4)) {
                        if (this.f14939b == null) {
                            this.f14939b = new RectF();
                        }
                        RectF rectF = this.f14939b;
                        p0.a.p(rectF);
                        rectF.set(rect.f14914a, f2, f3, f4);
                        RectF rectF2 = this.f14939b;
                        p0.a.p(rectF2);
                        int ordinal = direction.ordinal();
                        if (ordinal == 0) {
                            direction2 = Path.Direction.CCW;
                        } else {
                            if (ordinal != 1) {
                                throw new RuntimeException();
                            }
                            direction2 = Path.Direction.CW;
                        }
                        this.f14938a.addRect(rectF2, direction2);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean isEmpty() {
        return this.f14938a.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void j() {
        this.f14938a.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void k(long j2) {
        android.graphics.Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new android.graphics.Matrix();
        } else {
            p0.a.p(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.d;
        p0.a.p(matrix2);
        matrix2.setTranslate(Offset.g(j2), Offset.h(j2));
        android.graphics.Matrix matrix3 = this.d;
        p0.a.p(matrix3);
        this.f14938a.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void l(float f2, float f3, float f4, float f5) {
        this.f14938a.rQuadTo(f2, f3, f4, f5);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final int m() {
        return this.f14938a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void n(float f2, float f3) {
        this.f14938a.moveTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void o(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f14938a.cubicTo(f2, f3, f4, f5, f6, f7);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean q(Path path, Path path2, int i2) {
        Path.Op op = PathOperation.a(i2, 0) ? Path.Op.DIFFERENCE : PathOperation.a(i2, 1) ? Path.Op.INTERSECT : PathOperation.a(i2, 4) ? Path.Op.REVERSE_DIFFERENCE : PathOperation.a(i2, 2) ? Path.Op.UNION : Path.Op.XOR;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((AndroidPath) path).f14938a;
        if (path2 instanceof AndroidPath) {
            return this.f14938a.op(path3, ((AndroidPath) path2).f14938a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void r(float f2, float f3) {
        this.f14938a.rLineTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.f14938a.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void t(Path path, long j2) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f14938a.addPath(((AndroidPath) path).f14938a, Offset.g(j2), Offset.h(j2));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void u(float f2, float f3) {
        this.f14938a.lineTo(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void v(RoundRect roundRect, Path.Direction direction) {
        Path.Direction direction2;
        if (this.f14939b == null) {
            this.f14939b = new RectF();
        }
        RectF rectF = this.f14939b;
        p0.a.p(rectF);
        rectF.set(roundRect.f14917a, roundRect.f14918b, roundRect.f14919c, roundRect.d);
        if (this.f14940c == null) {
            this.f14940c = new float[8];
        }
        float[] fArr = this.f14940c;
        p0.a.p(fArr);
        long j2 = roundRect.e;
        fArr[0] = CornerRadius.b(j2);
        fArr[1] = CornerRadius.c(j2);
        long j3 = roundRect.f14920f;
        fArr[2] = CornerRadius.b(j3);
        fArr[3] = CornerRadius.c(j3);
        long j4 = roundRect.f14921g;
        fArr[4] = CornerRadius.b(j4);
        fArr[5] = CornerRadius.c(j4);
        long j5 = roundRect.f14922h;
        fArr[6] = CornerRadius.b(j5);
        fArr[7] = CornerRadius.c(j5);
        RectF rectF2 = this.f14939b;
        p0.a.p(rectF2);
        float[] fArr2 = this.f14940c;
        p0.a.p(fArr2);
        int ordinal = direction.ordinal();
        if (ordinal == 0) {
            direction2 = Path.Direction.CCW;
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            direction2 = Path.Direction.CW;
        }
        this.f14938a.addRoundRect(rectF2, fArr2, direction2);
    }
}
