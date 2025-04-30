package w;

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

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2859a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f23647a;
    public final Paint b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f23648c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23649d;

    /* renamed from: e, reason: collision with root package name */
    public float f23650e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f23653h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f23654i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f23655j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23651f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23652g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f23656k = PorterDuff.Mode.SRC_IN;

    public C2859a(ColorStateList colorStateList, float f9) {
        this.f23647a = f9;
        Paint paint = new Paint(5);
        this.b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f23653h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f23653h.getDefaultColor()));
        this.f23648c = new RectF();
        this.f23649d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f23648c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f23649d;
        rect2.set(rect);
        if (this.f23651f) {
            rect2.inset((int) Math.ceil(b.a(this.f23650e, this.f23647a, this.f23652g)), (int) Math.ceil(b.b(this.f23650e, this.f23647a, this.f23652g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        Paint paint = this.b;
        if (this.f23654i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f23654i);
            z8 = true;
        } else {
            z8 = false;
        }
        RectF rectF = this.f23648c;
        float f9 = this.f23647a;
        canvas.drawRoundRect(rectF, f9, f9, paint);
        if (z8) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f23649d, this.f23647a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f23655j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f23653h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z8;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f23653h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.b;
        if (colorForState != paint.getColor()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f23655j;
        if (colorStateList2 != null && (mode = this.f23656k) != null) {
            this.f23654i = a(colorStateList2, mode);
            return true;
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.b.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f23655j = colorStateList;
        this.f23654i = a(colorStateList, this.f23656k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f23656k = mode;
        this.f23654i = a(this.f23655j, mode);
        invalidateSelf();
    }
}
