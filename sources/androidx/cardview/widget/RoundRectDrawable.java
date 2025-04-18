package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes2.dex */
class RoundRectDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f1366a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1367b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f1368c;
    public final Rect d;
    public float e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f1371h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f1372i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1373j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1369f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1370g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f1374k = PorterDuff.Mode.SRC_IN;

    public RoundRectDrawable(float f2, ColorStateList colorStateList) {
        this.f1366a = f2;
        Paint paint = new Paint(5);
        this.f1367b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f1371h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f1371h.getDefaultColor()));
        this.f1368c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f1368c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f1369f) {
            rect2.inset((int) Math.ceil(RoundRectDrawableWithShadow.a(this.e, this.f1366a, this.f1370g)), (int) Math.ceil(RoundRectDrawableWithShadow.b(this.e, this.f1366a, this.f1370g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f1367b;
        if (this.f1372i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f1372i);
            z2 = true;
        }
        RectF rectF = this.f1368c;
        float f2 = this.f1366a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f1366a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1373j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1371h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1371h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f1367b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1373j;
        if (colorStateList2 == null || (mode = this.f1374k) == null) {
            return z2;
        }
        this.f1372i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f1367b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1367b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f1373j = colorStateList;
        this.f1372i = a(colorStateList, this.f1374k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1374k = mode;
        this.f1372i = a(this.f1373j, mode);
        invalidateSelf();
    }
}
