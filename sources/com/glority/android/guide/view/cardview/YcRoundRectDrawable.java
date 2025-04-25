package com.glority.android.guide.view.cardview;

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
import android.util.Log;

/* loaded from: classes3.dex */
class YcRoundRectDrawable extends Drawable {
    private final RectF mBoundsF;
    private final Rect mBoundsI;
    private float mPadding;
    private final Paint mPaint;
    private float mRadius;
    private ColorStateList mTint;
    private PorterDuffColorFilter mTintFilter;
    private boolean mInsetForPadding = false;
    private boolean mInsetForRadius = true;
    private PorterDuff.Mode mTintMode = PorterDuff.Mode.SRC_IN;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public YcRoundRectDrawable(int i, float f) {
        Log.e("AAA", "RoundRectDrawable");
        this.mRadius = f;
        Paint paint = new Paint(5);
        this.mPaint = paint;
        paint.setColor(i);
        this.mBoundsF = new RectF();
        this.mBoundsI = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPadding(float f, boolean z, boolean z2) {
        if (f == this.mPadding && this.mInsetForPadding == z && this.mInsetForRadius == z2) {
            return;
        }
        this.mPadding = f;
        this.mInsetForPadding = z;
        this.mInsetForRadius = z2;
        updateBounds(null);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getPadding() {
        return this.mPadding;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.mPaint;
        if (this.mTintFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.mTintFilter);
            z = true;
        }
        RectF rectF = this.mBoundsF;
        float f = this.mRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    private void updateBounds(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.mBoundsF.set(rect.left, rect.top, rect.right, rect.bottom);
        this.mBoundsI.set(rect);
        if (this.mInsetForPadding) {
            this.mBoundsI.inset((int) Math.ceil(YcRoundRectDrawableWithShadow.calculateHorizontalPadding(this.mPadding, this.mRadius, this.mInsetForRadius)), (int) Math.ceil(YcRoundRectDrawableWithShadow.calculateVerticalPadding(this.mPadding, this.mRadius, this.mInsetForRadius)));
            this.mBoundsF.set(this.mBoundsI);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updateBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.mBoundsI, this.mRadius);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRadius(float f) {
        if (f == this.mRadius) {
            return;
        }
        this.mRadius = f;
        updateBounds(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public float getRadius() {
        return this.mRadius;
    }

    public void setColor(int i) {
        this.mPaint.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.mTint = colorStateList;
        this.mTintFilter = createTintFilter(colorStateList, this.mTintMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        this.mTintFilter = createTintFilter(this.mTint, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.mTint;
        if (colorStateList == null || (mode = this.mTintMode) == null) {
            return false;
        }
        this.mTintFilter = createTintFilter(colorStateList, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.mTint;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    private PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
