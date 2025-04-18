package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;

/* loaded from: classes.dex */
public final class AndroidPaint implements Paint {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f14933a;

    /* renamed from: b, reason: collision with root package name */
    public int f14934b = 3;

    /* renamed from: c, reason: collision with root package name */
    public Shader f14935c;
    public ColorFilter d;
    public PathEffect e;

    public AndroidPaint(android.graphics.Paint paint) {
        this.f14933a = paint;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void A(float f2) {
        this.f14933a.setStrokeMiter(f2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final int B() {
        return this.f14933a.isFilterBitmap() ? 1 : 0;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void C(int i2) {
        this.f14933a.setStyle(i2 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void D(float f2) {
        this.f14933a.setStrokeWidth(f2);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final float a() {
        return this.f14933a.getAlpha() / 255.0f;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final long b() {
        return ColorKt.b(this.f14933a.getColor());
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void c(float f2) {
        this.f14933a.setAlpha((int) Math.rint(f2 * 255.0f));
    }

    public final int d() {
        Paint.Cap strokeCap = this.f14933a.getStrokeCap();
        int i2 = strokeCap == null ? -1 : AndroidPaint_androidKt.WhenMappings.f14936a[strokeCap.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int e() {
        Paint.Join strokeJoin = this.f14933a.getStrokeJoin();
        int i2 = strokeJoin == null ? -1 : AndroidPaint_androidKt.WhenMappings.f14937b[strokeJoin.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 2;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final ColorFilter n() {
        return this.d;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final int p() {
        return this.f14934b;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void q(int i2) {
        this.f14933a.setStrokeCap(StrokeCap.a(i2, 2) ? Paint.Cap.SQUARE : StrokeCap.a(i2, 1) ? Paint.Cap.ROUND : StrokeCap.a(i2, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void r(int i2) {
        if (BlendMode.a(this.f14934b, i2)) {
            return;
        }
        this.f14934b = i2;
        int i3 = Build.VERSION.SDK_INT;
        android.graphics.Paint paint = this.f14933a;
        if (i3 >= 29) {
            WrapperVerificationHelperMethods.f15062a.a(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.b(i2)));
        }
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void s(int i2) {
        this.f14933a.setFilterBitmap(!FilterQuality.a(i2, 0));
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void t(PathEffect pathEffect) {
        this.f14933a.setPathEffect(null);
        this.e = pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void u(int i2) {
        this.f14933a.setStrokeJoin(StrokeJoin.a(i2, 0) ? Paint.Join.MITER : StrokeJoin.a(i2, 2) ? Paint.Join.BEVEL : StrokeJoin.a(i2, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void v(long j2) {
        this.f14933a.setColor(ColorKt.j(j2));
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final android.graphics.Paint w() {
        return this.f14933a;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void x(Shader shader) {
        this.f14935c = shader;
        this.f14933a.setShader(shader);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final Shader y() {
        return this.f14935c;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public final void z(ColorFilter colorFilter) {
        this.d = colorFilter;
        this.f14933a.setColorFilter(colorFilter != null ? colorFilter.f14965a : null);
    }
}
