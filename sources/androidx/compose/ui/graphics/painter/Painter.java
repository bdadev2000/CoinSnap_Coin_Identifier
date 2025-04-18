package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public abstract class Painter {

    @Nullable
    private ColorFilter colorFilter;

    @Nullable
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;

    @NotNull
    private LayoutDirection layoutDirection = LayoutDirection.f17494a;

    @NotNull
    private final l drawLambda = new Painter$drawLambda$1(this);

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m3drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j2, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 4) != 0) {
            colorFilter = null;
        }
        painter.m4drawx_KDEd0(drawScope, j2, f3, colorFilter);
    }

    public boolean applyAlpha(float f2) {
        return false;
    }

    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m4drawx_KDEd0(@NotNull DrawScope drawScope, long j2, float f2, @Nullable ColorFilter colorFilter) {
        if (this.alpha != f2) {
            if (!applyAlpha(f2)) {
                if (f2 == 1.0f) {
                    Paint paint = this.layerPaint;
                    if (paint != null) {
                        paint.c(f2);
                    }
                    this.useLayer = false;
                } else {
                    Paint paint2 = this.layerPaint;
                    if (paint2 == null) {
                        paint2 = AndroidPaint_androidKt.a();
                        this.layerPaint = paint2;
                    }
                    paint2.c(f2);
                    this.useLayer = true;
                }
            }
            this.alpha = f2;
        }
        if (!a.g(this.colorFilter, colorFilter)) {
            if (!applyColorFilter(colorFilter)) {
                if (colorFilter == null) {
                    Paint paint3 = this.layerPaint;
                    if (paint3 != null) {
                        paint3.z(null);
                    }
                    this.useLayer = false;
                } else {
                    Paint paint4 = this.layerPaint;
                    if (paint4 == null) {
                        paint4 = AndroidPaint_androidKt.a();
                        this.layerPaint = paint4;
                    }
                    paint4.z(colorFilter);
                    this.useLayer = true;
                }
            }
            this.colorFilter = colorFilter;
        }
        LayoutDirection layoutDirection = drawScope.getLayoutDirection();
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
        float d = Size.d(drawScope.b()) - Size.d(j2);
        float b2 = Size.b(drawScope.b()) - Size.b(j2);
        drawScope.A1().f15139a.c(0.0f, 0.0f, d, b2);
        if (f2 > 0.0f) {
            try {
                if (Size.d(j2) > 0.0f && Size.b(j2) > 0.0f) {
                    if (this.useLayer) {
                        Rect a2 = RectKt.a(0L, SizeKt.a(Size.d(j2), Size.b(j2)));
                        Canvas a3 = drawScope.A1().a();
                        Paint paint5 = this.layerPaint;
                        if (paint5 == null) {
                            paint5 = AndroidPaint_androidKt.a();
                            this.layerPaint = paint5;
                        }
                        try {
                            a3.l(a2, paint5);
                            onDraw(drawScope);
                            a3.i();
                        } catch (Throwable th) {
                            a3.i();
                            throw th;
                        }
                    } else {
                        onDraw(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.A1().f15139a.c(-0.0f, -0.0f, -d, -b2);
                throw th2;
            }
        }
        drawScope.A1().f15139a.c(-0.0f, -0.0f, -d, -b2);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo2getIntrinsicSizeNHjbRc();

    public abstract void onDraw(DrawScope drawScope);
}
