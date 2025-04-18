package ea;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes3.dex */
public abstract class d extends LinearLayoutCompat {

    /* renamed from: r, reason: collision with root package name */
    public Drawable f17235r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f17236s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f17237t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f17238v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17239w;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f17236s = new Rect();
        this.f17237t = new Rect();
        this.u = 119;
        this.f17238v = true;
        this.f17239w = false;
        TypedArray s5 = com.bumptech.glide.d.s(context, attributeSet, r9.a.f24026h, 0, 0, new int[0]);
        this.u = s5.getInt(1, this.u);
        Drawable drawable = s5.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f17238v = s5.getBoolean(2, true);
        s5.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17235r;
        if (drawable != null) {
            if (this.f17239w) {
                this.f17239w = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f17238v;
                Rect rect = this.f17236s;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.u;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f17237t;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f17235r;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17235r;
        if (drawable != null && drawable.isStateful()) {
            this.f17235r.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f17235r;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17235r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f17239w = z10 | this.f17239w;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f17239w = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17235r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f17235r);
            }
            this.f17235r = drawable;
            this.f17239w = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.u == 119) {
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
    public void setForegroundGravity(int i10) {
        if (this.u != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.u = i10;
            if (i10 == 119 && this.f17235r != null) {
                this.f17235r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17235r;
    }
}
