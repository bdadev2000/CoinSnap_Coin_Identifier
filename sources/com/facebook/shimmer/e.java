package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class e extends Drawable {
    public final d a = new d(this, 0);

    /* renamed from: b, reason: collision with root package name */
    public final Paint f11390b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f11391c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f11392d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f11393e;

    /* renamed from: f, reason: collision with root package name */
    public c f11394f;

    public e() {
        Paint paint = new Paint();
        this.f11390b = paint;
        this.f11391c = new Rect();
        this.f11392d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        c cVar;
        ValueAnimator valueAnimator = this.f11393e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (cVar = this.f11394f) != null && cVar.f11383o && getCallback() != null) {
            this.f11393e.start();
        }
    }

    public final void b() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (cVar = this.f11394f) != null) {
            int i10 = cVar.f11375g;
            if (i10 <= 0) {
                i10 = Math.round(cVar.f11377i * width);
            }
            c cVar2 = this.f11394f;
            int i11 = cVar2.f11376h;
            if (i11 <= 0) {
                i11 = Math.round(cVar2.f11378j * height);
            }
            c cVar3 = this.f11394f;
            boolean z10 = true;
            if (cVar3.f11374f != 1) {
                int i12 = cVar3.f11371c;
                if (i12 != 1 && i12 != 3) {
                    z10 = false;
                }
                if (z10) {
                    i10 = 0;
                }
                if (!z10) {
                    i11 = 0;
                }
                c cVar4 = this.f11394f;
                radialGradient = new LinearGradient(0.0f, 0.0f, i10, i11, cVar4.f11370b, cVar4.a, Shader.TileMode.CLAMP);
            } else {
                float f10 = i11 / 2.0f;
                float max = (float) (Math.max(i10, i11) / Math.sqrt(2.0d));
                c cVar5 = this.f11394f;
                radialGradient = new RadialGradient(i10 / 2.0f, f10, max, cVar5.f11370b, cVar5.a, Shader.TileMode.CLAMP);
            }
            this.f11390b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float b3;
        float b10;
        if (this.f11394f != null) {
            Paint paint = this.f11390b;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.f11394f.f11381m));
                Rect rect = this.f11391c;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.f11393e;
                float f11 = 0.0f;
                if (valueAnimator != null) {
                    f10 = valueAnimator.getAnimatedFraction();
                } else {
                    f10 = 0.0f;
                }
                int i10 = this.f11394f.f11371c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            float f12 = -height;
                            b10 = vd.e.b(height, f12, f10, f12);
                        } else {
                            b3 = vd.e.b(-width, width, f10, width);
                        }
                    } else {
                        b10 = vd.e.b(-height, height, f10, height);
                    }
                    f11 = b10;
                    b3 = 0.0f;
                } else {
                    float f13 = -width;
                    b3 = vd.e.b(width, f13, f10, f13);
                }
                Matrix matrix = this.f11392d;
                matrix.reset();
                matrix.setRotate(this.f11394f.f11381m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f11, b3);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        c cVar = this.f11394f;
        return (cVar == null || !(cVar.f11382n || cVar.f11384p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11391c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
