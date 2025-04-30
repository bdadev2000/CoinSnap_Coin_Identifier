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
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final B3.d f13838a = new B3.d(this, 2);
    public final Paint b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f13839c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f13840d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f13841e;

    /* renamed from: f, reason: collision with root package name */
    public c f13842f;

    public d() {
        Paint paint = new Paint();
        this.b = paint;
        this.f13839c = new Rect();
        this.f13840d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        c cVar;
        ValueAnimator valueAnimator = this.f13841e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (cVar = this.f13842f) != null && cVar.f13832o && getCallback() != null) {
            this.f13841e.start();
        }
    }

    public final void b() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (cVar = this.f13842f) != null) {
            int i9 = cVar.f13826g;
            if (i9 <= 0) {
                i9 = Math.round(cVar.f13828i * width);
            }
            c cVar2 = this.f13842f;
            int i10 = cVar2.f13827h;
            if (i10 <= 0) {
                i10 = Math.round(cVar2.f13829j * height);
            }
            c cVar3 = this.f13842f;
            boolean z8 = true;
            if (cVar3.f13825f != 1) {
                int i11 = cVar3.f13822c;
                if (i11 != 1 && i11 != 3) {
                    z8 = false;
                }
                if (z8) {
                    i9 = 0;
                }
                if (!z8) {
                    i10 = 0;
                }
                c cVar4 = this.f13842f;
                radialGradient = new LinearGradient(0.0f, 0.0f, i9, i10, cVar4.b, cVar4.f13821a, Shader.TileMode.CLAMP);
            } else {
                float f9 = i10 / 2.0f;
                float max = (float) (Math.max(i9, i10) / Math.sqrt(2.0d));
                c cVar5 = this.f13842f;
                radialGradient = new RadialGradient(i9 / 2.0f, f9, max, cVar5.b, cVar5.f13821a, Shader.TileMode.CLAMP);
            }
            this.b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f9;
        float a6;
        float a9;
        if (this.f13842f != null) {
            Paint paint = this.b;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.f13842f.m));
                Rect rect = this.f13839c;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.f13841e;
                float f10 = 0.0f;
                if (valueAnimator != null) {
                    f9 = valueAnimator.getAnimatedFraction();
                } else {
                    f9 = 0.0f;
                }
                int i9 = this.f13842f.f13822c;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            float f11 = -height;
                            a9 = AbstractC2914a.a(height, f11, f9, f11);
                        } else {
                            a6 = AbstractC2914a.a(-width, width, f9, width);
                        }
                    } else {
                        a9 = AbstractC2914a.a(-height, height, f9, height);
                    }
                    f10 = a9;
                    a6 = 0.0f;
                } else {
                    float f12 = -width;
                    a6 = AbstractC2914a.a(width, f12, f9, f12);
                }
                Matrix matrix = this.f13840d;
                matrix.reset();
                matrix.setRotate(this.f13842f.m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f10, a6);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        c cVar = this.f13842f;
        if (cVar != null && (cVar.f13831n || cVar.f13833p)) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13839c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
