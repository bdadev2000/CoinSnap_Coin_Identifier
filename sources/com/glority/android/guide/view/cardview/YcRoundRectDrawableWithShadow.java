package com.glority.android.guide.view.cardview;

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
import android.util.Log;
import com.glority.android.guide.R;

/* loaded from: classes3.dex */
class YcRoundRectDrawableWithShadow extends Drawable {
    static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    static final float SHADOW_MULTIPLIER = 1.5f;
    static RoundRectHelper sRoundRectHelper;
    final RectF mCardBounds;
    float mCornerRadius;
    Paint mCornerShadowPaint;
    Path mCornerShadowPath;
    Paint mEdgeShadowPaint;
    final int mInsetShadow;
    float mMaxShadowSize;
    Paint mPaint;
    float mRawMaxShadowSize;
    float mRawShadowSize;
    private int mShadowEndColor;
    float mShadowSize;
    private int mShadowStartColor;
    private boolean mDirty = true;
    private boolean mAddPaddingForCorners = true;
    private boolean mPrintedShadowClipWarning = false;

    /* loaded from: classes3.dex */
    interface RoundRectHelper {
        void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YcRoundRectDrawableWithShadow(Resources resources, int i, float f, float f2, float f3, int i2, int i3) {
        Log.e("AAA", "RoundRectDrawableWithShadow");
        if (i2 != 0) {
            this.mShadowStartColor = i2;
        } else {
            this.mShadowStartColor = resources.getColor(R.color.yc_cardview_shadow_start_color);
        }
        if (i3 != 0) {
            this.mShadowEndColor = i3;
        } else {
            this.mShadowEndColor = resources.getColor(R.color.yc_cardview_shadow_end_color);
        }
        this.mInsetShadow = resources.getDimensionPixelSize(R.dimen.yc_cardview_compat_inset_shadow);
        Paint paint = new Paint(5);
        this.mPaint = paint;
        paint.setColor(i);
        Paint paint2 = new Paint(5);
        this.mCornerShadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.mCornerRadius = (int) (f + 0.5f);
        this.mCardBounds = new RectF();
        Paint paint3 = new Paint(this.mCornerShadowPaint);
        this.mEdgeShadowPaint = paint3;
        paint3.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private int toEven(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.mAddPaddingForCorners = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
        this.mCornerShadowPaint.setAlpha(i);
        this.mEdgeShadowPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mDirty = true;
    }

    void setShadowSize(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.mPrintedShadowClipWarning) {
                this.mPrintedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.mRawShadowSize == even && this.mRawMaxShadowSize == even2) {
            return;
        }
        this.mRawShadowSize = even;
        this.mRawMaxShadowSize = even2;
        float f3 = even * SHADOW_MULTIPLIER;
        int i = this.mInsetShadow;
        this.mShadowSize = (int) (f3 + i + 0.5f);
        this.mMaxShadowSize = even2 + i;
        this.mDirty = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        return z ? (float) ((f * SHADOW_MULTIPLIER) + ((1.0d - COS_45) * f2)) : f * SHADOW_MULTIPLIER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - COS_45) * f2)) : f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCornerRadius(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.mCornerRadius == f2) {
            return;
        }
        this.mCornerRadius = f2;
        this.mDirty = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mDirty) {
            buildComponents(getBounds());
            this.mDirty = false;
        }
        canvas.translate(0.0f, this.mRawShadowSize / 2.0f);
        drawShadow(canvas);
        canvas.translate(0.0f, (-this.mRawShadowSize) / 2.0f);
        sRoundRectHelper.drawRoundRect(canvas, this.mCardBounds, this.mCornerRadius, this.mPaint);
    }

    private void drawShadow(Canvas canvas) {
        float f = this.mCornerRadius;
        float f2 = (-f) - this.mShadowSize;
        float f3 = f + this.mInsetShadow + (this.mRawShadowSize / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.mCardBounds.width() - f4 > 0.0f;
        boolean z2 = this.mCardBounds.height() - f4 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.mCardBounds.left + f3, this.mCardBounds.top + f3);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.width() - f4, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.mCardBounds.right - f3, this.mCardBounds.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.width() - f4, (-this.mCornerRadius) + this.mShadowSize, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.mCardBounds.left + f3, this.mCardBounds.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.height() - f4, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.mCardBounds.right - f3, this.mCardBounds.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.mCardBounds.height() - f4, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save4);
    }

    private void buildShadowCorners() {
        float f = this.mCornerRadius;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.mShadowSize;
        rectF2.inset(-f2, -f2);
        Path path = this.mCornerShadowPath;
        if (path == null) {
            this.mCornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.mCornerShadowPath.moveTo(-this.mCornerRadius, 0.0f);
        this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
        this.mCornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.mCornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.mCornerShadowPath.close();
        float f3 = this.mCornerRadius;
        float f4 = f3 / (this.mShadowSize + f3);
        Paint paint = this.mCornerShadowPaint;
        float f5 = this.mCornerRadius + this.mShadowSize;
        int i = this.mShadowStartColor;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.mShadowEndColor}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.mEdgeShadowPaint;
        float f6 = this.mCornerRadius;
        float f7 = this.mShadowSize;
        float f8 = (-f6) + f7;
        float f9 = (-f6) - f7;
        int i2 = this.mShadowStartColor;
        paint2.setShader(new LinearGradient(0.0f, f8, 0.0f, f9, new int[]{i2, i2, this.mShadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.mEdgeShadowPaint.setAntiAlias(false);
    }

    private void buildComponents(Rect rect) {
        float f = this.mRawMaxShadowSize * SHADOW_MULTIPLIER;
        this.mCardBounds.set(rect.left + this.mRawMaxShadowSize, rect.top + f, rect.right - this.mRawMaxShadowSize, rect.bottom - f);
        buildShadowCorners();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getMaxShadowAndCornerPadding(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShadowSize(float f) {
        setShadowSize(f, this.mRawMaxShadowSize);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxShadowSize(float f) {
        setShadowSize(this.mRawShadowSize, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getShadowSize() {
        return this.mRawShadowSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMaxShadowSize() {
        return this.mRawMaxShadowSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMinWidth() {
        float f = this.mRawMaxShadowSize;
        return (Math.max(f, this.mCornerRadius + this.mInsetShadow + (f / 2.0f)) * 2.0f) + ((this.mRawMaxShadowSize + this.mInsetShadow) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMinHeight() {
        float f = this.mRawMaxShadowSize;
        return (Math.max(f, this.mCornerRadius + this.mInsetShadow + ((f * SHADOW_MULTIPLIER) / 2.0f)) * 2.0f) + (((this.mRawMaxShadowSize * SHADOW_MULTIPLIER) + this.mInsetShadow) * 2.0f);
    }

    public void setColor(int i) {
        this.mPaint.setColor(i);
        invalidateSelf();
    }
}
