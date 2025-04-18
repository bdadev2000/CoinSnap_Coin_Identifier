package g2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: l, reason: collision with root package name */
    public static final PorterDuff.Mode f17994l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public l f17995c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f17996d;

    /* renamed from: f, reason: collision with root package name */
    public ColorFilter f17997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17998g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17999h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f18000i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f18001j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f18002k;

    public n() {
        this.f17999h = true;
        this.f18000i = new float[9];
        this.f18001j = new Matrix();
        this.f18002k = new Rect();
        this.f17995c = new l();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            h0.a.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r10 == false) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f17995c.f17983b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f17995c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return h0.a.c(drawable);
        }
        return this.f17997f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17942b != null) {
            return new m(this.f17942b.getConstantState());
        }
        this.f17995c.a = getChangingConfigurations();
        return this.f17995c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f17995c.f17983b.f17976i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f17995c.f17983b.f17975h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f17995c.f17986e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            l lVar = this.f17995c;
            if (lVar != null) {
                k kVar = lVar.f17983b;
                if (kVar.f17981n == null) {
                    kVar.f17981n = Boolean.valueOf(kVar.f17974g.a());
                }
                if (kVar.f17981n.booleanValue() || ((colorStateList = this.f17995c.f17984c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f17998g && super.mutate() == this) {
            this.f17995c = new l(this.f17995c);
            this.f17998g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        l lVar = this.f17995c;
        ColorStateList colorStateList = lVar.f17984c;
        if (colorStateList != null && (mode = lVar.f17985d) != null) {
            this.f17996d = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        k kVar = lVar.f17983b;
        if (kVar.f17981n == null) {
            kVar.f17981n = Boolean.valueOf(kVar.f17974g.a());
        }
        if (kVar.f17981n.booleanValue()) {
            boolean b3 = lVar.f17983b.f17974g.b(iArr);
            lVar.f17992k |= b3;
            if (b3) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f17995c.f17983b.getRootAlpha() != i10) {
            this.f17995c.f17983b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f17995c.f17986e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f17997f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            com.bumptech.glide.d.B(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            h0.a.h(drawable, colorStateList);
            return;
        }
        l lVar = this.f17995c;
        if (lVar.f17984c != colorStateList) {
            lVar.f17984c = colorStateList;
            this.f17996d = a(colorStateList, lVar.f17985d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            h0.a.i(drawable, mode);
            return;
        }
        l lVar = this.f17995c;
        if (lVar.f17985d != mode) {
            lVar.f17985d = mode;
            this.f17996d = a(lVar.f17984c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public n(l lVar) {
        this.f17999h = true;
        this.f18000i = new float[9];
        this.f18001j = new Matrix();
        this.f18002k = new Rect();
        this.f17995c = lVar;
        this.f17996d = a(lVar.f17984c, lVar.f17985d);
    }
}
