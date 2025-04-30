package L3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public abstract class d extends LinearLayoutCompat {

    /* renamed from: r, reason: collision with root package name */
    public Drawable f1779r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1780s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1781t;

    /* renamed from: u, reason: collision with root package name */
    public int f1782u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1783v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1784w;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1780s = new Rect();
        this.f1781t = new Rect();
        this.f1782u = 119;
        this.f1783v = true;
        this.f1784w = false;
        int[] iArr = AbstractC2861a.f23668h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f1782u = obtainStyledAttributes.getInt(1, this.f1782u);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1783v = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1779r;
        if (drawable != null) {
            if (this.f1784w) {
                this.f1784w = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z8 = this.f1783v;
                Rect rect = this.f1780s;
                if (z8) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i9 = this.f1782u;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1781t;
                Gravity.apply(i9, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f1779r;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1779r;
        if (drawable != null && drawable.isStateful()) {
            this.f1779r.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f1779r;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1782u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1779r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        this.f1784w = z8 | this.f1784w;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f1784w = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f1779r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1779r);
            }
            this.f1779r = drawable;
            this.f1784w = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1782u == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i9) {
        if (this.f1782u != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.f1782u = i9;
            if (i9 == 119 && this.f1779r != null) {
                this.f1779r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1779r) {
            return false;
        }
        return true;
    }
}
