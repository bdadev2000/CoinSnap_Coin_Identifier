package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.cooldev.gba.emulator.gameboy.R;

/* loaded from: classes2.dex */
class RoundRectDrawableWithShadow extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    public static final double f1375q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    public final int f1376a;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1378c;
    public final Paint d;
    public final RectF e;

    /* renamed from: f, reason: collision with root package name */
    public float f1379f;

    /* renamed from: g, reason: collision with root package name */
    public Path f1380g;

    /* renamed from: h, reason: collision with root package name */
    public float f1381h;

    /* renamed from: i, reason: collision with root package name */
    public float f1382i;

    /* renamed from: j, reason: collision with root package name */
    public float f1383j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1384k;

    /* renamed from: m, reason: collision with root package name */
    public final int f1386m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1387n;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1385l = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1388o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1389p = false;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1377b = new Paint(5);

    /* loaded from: classes2.dex */
    public interface RoundRectHelper {
    }

    public RoundRectDrawableWithShadow(Resources resources, ColorStateList colorStateList, float f2, float f3, float f4) {
        this.f1386m = resources.getColor(R.color.cardview_shadow_start_color);
        this.f1387n = resources.getColor(R.color.cardview_shadow_end_color);
        this.f1376a = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f1384k = colorStateList;
        this.f1377b.setColor(colorStateList.getColorForState(getState(), this.f1384k.getDefaultColor()));
        Paint paint = new Paint(5);
        this.f1378c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1379f = (int) (f2 + 0.5f);
        this.e = new RectF();
        Paint paint2 = new Paint(paint);
        this.d = paint2;
        paint2.setAntiAlias(false);
        c(f3, f4);
    }

    public static float a(float f2, float f3, boolean z2) {
        if (!z2) {
            return f2;
        }
        return (float) (((1.0d - f1375q) * f3) + f2);
    }

    public static float b(float f2, float f3, boolean z2) {
        if (!z2) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f1375q) * f3) + (f2 * 1.5f));
    }

    public final void c(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
        int i2 = (int) (f2 + 0.5f);
        if (i2 % 2 == 1) {
            i2--;
        }
        float f4 = i2;
        int i3 = (int) (f3 + 0.5f);
        if (i3 % 2 == 1) {
            i3--;
        }
        float f5 = i3;
        if (f4 > f5) {
            if (!this.f1389p) {
                this.f1389p = true;
            }
            f4 = f5;
        }
        if (this.f1383j == f4 && this.f1381h == f5) {
            return;
        }
        this.f1383j = f4;
        this.f1381h = f5;
        this.f1382i = (int) ((f4 * 1.5f) + this.f1376a + 0.5f);
        this.f1385l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        int i2;
        boolean z3 = this.f1385l;
        Paint paint = this.d;
        Paint paint2 = this.f1378c;
        RectF rectF = this.e;
        if (z3) {
            Rect bounds = getBounds();
            float f2 = this.f1381h;
            float f3 = 1.5f * f2;
            rectF.set(bounds.left + f2, bounds.top + f3, bounds.right - f2, bounds.bottom - f3);
            float f4 = this.f1379f;
            float f5 = -f4;
            RectF rectF2 = new RectF(f5, f5, f4, f4);
            RectF rectF3 = new RectF(rectF2);
            float f6 = -this.f1382i;
            rectF3.inset(f6, f6);
            Path path = this.f1380g;
            if (path == null) {
                this.f1380g = new Path();
            } else {
                path.reset();
            }
            this.f1380g.setFillType(Path.FillType.EVEN_ODD);
            this.f1380g.moveTo(-this.f1379f, 0.0f);
            this.f1380g.rLineTo(-this.f1382i, 0.0f);
            this.f1380g.arcTo(rectF3, 180.0f, 90.0f, false);
            this.f1380g.arcTo(rectF2, 270.0f, -90.0f, false);
            this.f1380g.close();
            float f7 = this.f1379f;
            float f8 = f7 / (this.f1382i + f7);
            float f9 = this.f1379f + this.f1382i;
            int i3 = this.f1386m;
            int i4 = this.f1387n;
            z2 = true;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{i3, i3, i4}, new float[]{0.0f, f8, 1.0f}, tileMode));
            float f10 = -this.f1379f;
            float f11 = this.f1382i;
            paint.setShader(new LinearGradient(0.0f, f10 + f11, 0.0f, f10 - f11, new int[]{i3, i3, i4}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
            paint.setAntiAlias(false);
            this.f1385l = false;
        } else {
            z2 = true;
        }
        canvas.translate(0.0f, this.f1383j / 2.0f);
        float f12 = this.f1379f;
        float f13 = (-f12) - this.f1382i;
        float f14 = (this.f1383j / 2.0f) + f12 + this.f1376a;
        float f15 = f14 * 2.0f;
        boolean z4 = rectF.width() - f15 > 0.0f ? z2 : false;
        if (rectF.height() - f15 <= 0.0f) {
            z2 = false;
        }
        int save = canvas.save();
        canvas.translate(rectF.left + f14, rectF.top + f14);
        canvas.drawPath(this.f1380g, paint2);
        if (z4) {
            i2 = save;
            canvas.drawRect(0.0f, f13, rectF.width() - f15, -this.f1379f, paint);
        } else {
            i2 = save;
        }
        canvas.restoreToCount(i2);
        int save2 = canvas.save();
        canvas.translate(rectF.right - f14, rectF.bottom - f14);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1380g, paint2);
        if (z4) {
            canvas.drawRect(0.0f, f13, rectF.width() - f15, (-this.f1379f) + this.f1382i, paint);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(rectF.left + f14, rectF.bottom - f14);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1380g, paint2);
        if (z2) {
            canvas.drawRect(0.0f, f13, rectF.height() - f15, -this.f1379f, paint);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(rectF.right - f14, rectF.top + f14);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1380g, paint2);
        if (z2) {
            canvas.drawRect(0.0f, f13, rectF.height() - f15, -this.f1379f, paint);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1383j) / 2.0f);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(b(this.f1381h, this.f1379f, this.f1388o));
        int ceil2 = (int) Math.ceil(a(this.f1381h, this.f1379f, this.f1388o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1384k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1385l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1384k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f1377b;
        if (paint.getColor() == colorForState) {
            return false;
        }
        paint.setColor(colorForState);
        this.f1385l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f1377b.setAlpha(i2);
        this.f1378c.setAlpha(i2);
        this.d.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1377b.setColorFilter(colorFilter);
    }
}
