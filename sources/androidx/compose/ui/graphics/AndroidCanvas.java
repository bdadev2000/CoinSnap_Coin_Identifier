package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;

/* loaded from: classes4.dex */
public final class AndroidCanvas implements Canvas {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Canvas f14925a = AndroidCanvas_androidKt.f14928a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f14926b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f14927c;

    @Override // androidx.compose.ui.graphics.Canvas
    public final void a(float f2, float f3) {
        this.f14925a.scale(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void b(float f2, float f3, float f4, float f5, Paint paint) {
        this.f14925a.drawRect(f2, f3, f4, f5, paint.w());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void c(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint) {
        if (this.f14926b == null) {
            this.f14926b = new Rect();
            this.f14927c = new Rect();
        }
        android.graphics.Canvas canvas = this.f14925a;
        Bitmap a2 = AndroidImageBitmap_androidKt.a(imageBitmap);
        Rect rect = this.f14926b;
        p0.a.p(rect);
        int i2 = (int) (j2 >> 32);
        rect.left = i2;
        int i3 = (int) (j2 & 4294967295L);
        rect.top = i3;
        rect.right = i2 + ((int) (j3 >> 32));
        rect.bottom = i3 + ((int) (j3 & 4294967295L));
        Rect rect2 = this.f14927c;
        p0.a.p(rect2);
        int i4 = (int) (j4 >> 32);
        rect2.left = i4;
        int i5 = (int) (j4 & 4294967295L);
        rect2.top = i5;
        rect2.right = i4 + ((int) (j5 >> 32));
        rect2.bottom = i5 + ((int) (j5 & 4294967295L));
        canvas.drawBitmap(a2, rect, rect2, paint.w());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void d(ImageBitmap imageBitmap, long j2, Paint paint) {
        this.f14925a.drawBitmap(AndroidImageBitmap_androidKt.a(imageBitmap), Offset.g(j2), Offset.h(j2), paint.w());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void e(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        this.f14925a.drawArc(f2, f3, f4, f5, f6, f7, false, paint.w());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void f(float f2, float f3, float f4, float f5, int i2) {
        this.f14925a.clipRect(f2, f3, f4, f5, i2 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void g(Path path, int i2) {
        android.graphics.Canvas canvas = this.f14925a;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).f14938a, i2 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void h(float f2, float f3) {
        this.f14925a.translate(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void i() {
        this.f14925a.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void k() {
        CanvasUtils.a(this.f14925a, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void l(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.f14925a.saveLayer(rect.f14914a, rect.f14915b, rect.f14916c, rect.d, paint.w(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void m(long j2, long j3, Paint paint) {
        this.f14925a.drawLine(Offset.g(j2), Offset.h(j2), Offset.g(j3), Offset.h(j3), paint.w());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void n(float f2) {
        this.f14925a.rotate(f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void p() {
        this.f14925a.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void q() {
        CanvasUtils.a(this.f14925a, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void r(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                if (fArr[(i2 * 4) + i3] != (i2 == i3 ? 1.0f : 0.0f)) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    AndroidMatrixConversions_androidKt.a(matrix, fArr);
                    this.f14925a.concat(matrix);
                    return;
                }
                i3++;
            }
            i2++;
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void s(Path path, Paint paint) {
        android.graphics.Canvas canvas = this.f14925a;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).f14938a, paint.w());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void u(float f2, long j2, Paint paint) {
        this.f14925a.drawCircle(Offset.g(j2), Offset.h(j2), f2, paint.w());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final void v(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        this.f14925a.drawRoundRect(f2, f3, f4, f5, f6, f7, paint.w());
    }

    public final android.graphics.Canvas w() {
        return this.f14925a;
    }

    public final void x(android.graphics.Canvas canvas) {
        this.f14925a = canvas;
    }
}
