package q;

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

/* loaded from: classes.dex */
public final class a extends Drawable {
    public float a;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f23649c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23650d;

    /* renamed from: e, reason: collision with root package name */
    public float f23651e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f23654h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f23655i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f23656j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23652f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23653g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f23657k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f23648b = new Paint(5);

    public a(float f10, ColorStateList colorStateList) {
        this.a = f10;
        b(colorStateList);
        this.f23649c = new RectF();
        this.f23650d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f23654h = colorStateList;
        this.f23648b.setColor(colorStateList.getColorForState(getState(), this.f23654h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f23649c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f23650d;
        rect2.set(rect);
        if (this.f23652f) {
            float a = b.a(this.f23651e, this.a, this.f23653g);
            float f10 = this.f23651e;
            float f11 = this.a;
            if (this.f23653g) {
                f10 = (float) (((1.0d - b.a) * f11) + f10);
            }
            rect2.inset((int) Math.ceil(f10), (int) Math.ceil(a));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f23648b;
        if (this.f23655i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f23655i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.f23649c;
        float f10 = this.a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f23650d, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f23656j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f23654h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f23654h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f23648b;
        if (colorForState != paint.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f23656j;
        if (colorStateList2 != null && (mode = this.f23657k) != null) {
            this.f23655i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f23648b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23648b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f23656j = colorStateList;
        this.f23655i = a(colorStateList, this.f23657k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f23657k = mode;
        this.f23655i = a(this.f23656j, mode);
        invalidateSelf();
    }
}
