package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public interface Canvas {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    void a(float f2, float f3);

    void b(float f2, float f3, float f4, float f5, Paint paint);

    void c(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint);

    void d(ImageBitmap imageBitmap, long j2, Paint paint);

    void e(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint);

    void f(float f2, float f3, float f4, float f5, int i2);

    void g(Path path, int i2);

    void h(float f2, float f3);

    void i();

    void k();

    void l(Rect rect, Paint paint);

    void m(long j2, long j3, Paint paint);

    void n(float f2);

    default void o(Rect rect, AndroidPaint androidPaint) {
        b(rect.f14914a, rect.f14915b, rect.f14916c, rect.d, androidPaint);
    }

    void p();

    void q();

    void r(float[] fArr);

    void s(Path path, Paint paint);

    default void t(int i2, Rect rect) {
        f(rect.f14914a, rect.f14915b, rect.f14916c, rect.d, i2);
    }

    void u(float f2, long j2, Paint paint);

    void v(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint);
}
