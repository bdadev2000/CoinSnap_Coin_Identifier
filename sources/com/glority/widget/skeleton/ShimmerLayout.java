package com.glority.widget.skeleton;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public class ShimmerLayout extends FrameLayout {
    private static final byte DEFAULT_ANGLE = 20;
    private static final int DEFAULT_ANIMATION_DURATION = 1500;
    private static final byte MAX_ANGLE_VALUE = 45;
    private static final byte MAX_GRADIENT_CENTER_COLOR_WIDTH_VALUE = 1;
    private static final byte MAX_MASK_WIDTH_VALUE = 1;
    private static final byte MIN_ANGLE_VALUE = -45;
    private static final byte MIN_GRADIENT_CENTER_COLOR_WIDTH_VALUE = 0;
    private static final byte MIN_MASK_WIDTH_VALUE = 0;
    private boolean autoStart;
    private Canvas canvasForShimmerMask;
    private float gradientCenterColorWidth;
    private Paint gradientTexturePaint;
    private boolean isAnimationReversed;
    private boolean isAnimationStarted;
    private Bitmap localMaskBitmap;
    private ValueAnimator maskAnimator;
    private Bitmap maskBitmap;
    private int maskOffsetX;
    private Rect maskRect;
    private float maskWidth;
    private int shimmerAngle;
    private int shimmerAnimationDuration;
    private int shimmerColor;
    private ViewTreeObserver.OnPreDrawListener startAnimationPreDrawListener;

    private void enableForcedSoftwareLayerIfNeeded() {
    }

    public ShimmerLayout(Context context) {
        this(context, null);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ShimmerLayout, 0, 0);
        try {
            this.shimmerAngle = obtainStyledAttributes.getInteger(R.styleable.ShimmerLayout_shimmer_angle, 20);
            this.shimmerAnimationDuration = obtainStyledAttributes.getInteger(R.styleable.ShimmerLayout_shimmer_animation_duration, 1500);
            this.shimmerColor = obtainStyledAttributes.getColor(R.styleable.ShimmerLayout_shimmer_color, getColor(R.color.gl_shimmer_color));
            this.autoStart = obtainStyledAttributes.getBoolean(R.styleable.ShimmerLayout_shimmer_auto_start, false);
            this.maskWidth = obtainStyledAttributes.getFloat(R.styleable.ShimmerLayout_shimmer_mask_width, 0.5f);
            this.gradientCenterColorWidth = obtainStyledAttributes.getFloat(R.styleable.ShimmerLayout_shimmer_gradient_center_color_width, 0.1f);
            this.isAnimationReversed = obtainStyledAttributes.getBoolean(R.styleable.ShimmerLayout_shimmer_reverse_animation, false);
            obtainStyledAttributes.recycle();
            setMaskWidth(this.maskWidth);
            setGradientCenterColorWidth(this.gradientCenterColorWidth);
            setShimmerAngle(this.shimmerAngle);
            enableForcedSoftwareLayerIfNeeded();
            if (this.autoStart && getVisibility() == 0) {
                startShimmerAnimation();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        resetShimmering();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!this.isAnimationStarted || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            dispatchDrawShimmer(canvas);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            if (this.autoStart) {
                startShimmerAnimation();
                return;
            }
            return;
        }
        stopShimmerAnimation();
    }

    public void startShimmerAnimation() {
        if (this.isAnimationStarted) {
            return;
        }
        if (getWidth() == 0) {
            this.startAnimationPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.glority.widget.skeleton.ShimmerLayout.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ShimmerLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    ShimmerLayout.this.startShimmerAnimation();
                    return true;
                }
            };
            getViewTreeObserver().addOnPreDrawListener(this.startAnimationPreDrawListener);
        } else {
            getShimmerAnimation().start();
            this.isAnimationStarted = true;
        }
    }

    public void stopShimmerAnimation() {
        if (this.startAnimationPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.startAnimationPreDrawListener);
        }
        resetShimmering();
    }

    public boolean isAnimationStarted() {
        return this.isAnimationStarted;
    }

    public void setShimmerColor(int i) {
        this.shimmerColor = i;
        resetIfStarted();
    }

    public void setShimmerAnimationDuration(int i) {
        this.shimmerAnimationDuration = i;
        resetIfStarted();
    }

    public void setAnimationReversed(boolean z) {
        this.isAnimationReversed = z;
        resetIfStarted();
    }

    public void setShimmerAngle(int i) {
        if (i < -45 || 45 < i) {
            throw new IllegalArgumentException(String.format("shimmerAngle value must be between %d and %d", Byte.valueOf(MIN_ANGLE_VALUE), Byte.valueOf(MAX_ANGLE_VALUE)));
        }
        this.shimmerAngle = i;
        resetIfStarted();
    }

    public void setMaskWidth(float f) {
        if (f <= 0.0f || 1.0f < f) {
            throw new IllegalArgumentException(String.format("maskWidth value must be higher than %d and less or equal to %d", (byte) 0, (byte) 1));
        }
        this.maskWidth = f;
        resetIfStarted();
    }

    public void setGradientCenterColorWidth(float f) {
        if (f <= 0.0f || 1.0f <= f) {
            throw new IllegalArgumentException(String.format("gradientCenterColorWidth value must be higher than %d and less than %d", (byte) 0, (byte) 1));
        }
        this.gradientCenterColorWidth = f;
        resetIfStarted();
    }

    private void resetIfStarted() {
        if (this.isAnimationStarted) {
            resetShimmering();
            startShimmerAnimation();
        }
    }

    private void dispatchDrawShimmer(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap maskBitmap = getMaskBitmap();
        this.localMaskBitmap = maskBitmap;
        if (maskBitmap == null) {
            return;
        }
        if (this.canvasForShimmerMask == null) {
            this.canvasForShimmerMask = new Canvas(this.localMaskBitmap);
        }
        this.canvasForShimmerMask.drawColor(0, PorterDuff.Mode.CLEAR);
        this.canvasForShimmerMask.save();
        this.canvasForShimmerMask.translate(-this.maskOffsetX, 0.0f);
        super.dispatchDraw(this.canvasForShimmerMask);
        this.canvasForShimmerMask.restore();
        drawShimmer(canvas);
        this.localMaskBitmap = null;
    }

    private void drawShimmer(Canvas canvas) {
        createShimmerPaint();
        canvas.save();
        canvas.translate(this.maskOffsetX, 0.0f);
        canvas.drawRect(this.maskRect.left, 0.0f, this.maskRect.width(), this.maskRect.height(), this.gradientTexturePaint);
        canvas.restore();
    }

    private void resetShimmering() {
        ValueAnimator valueAnimator = this.maskAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.maskAnimator.removeAllUpdateListeners();
        }
        this.maskAnimator = null;
        this.gradientTexturePaint = null;
        this.isAnimationStarted = false;
        releaseBitMaps();
    }

    private void releaseBitMaps() {
        this.canvasForShimmerMask = null;
        Bitmap bitmap = this.maskBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.maskBitmap = null;
        }
    }

    private Bitmap getMaskBitmap() {
        if (this.maskBitmap == null) {
            this.maskBitmap = createBitmap(this.maskRect.width(), getHeight());
        }
        return this.maskBitmap;
    }

    private void createShimmerPaint() {
        if (this.gradientTexturePaint != null) {
            return;
        }
        int reduceColorAlphaValueToZero = reduceColorAlphaValueToZero(this.shimmerColor);
        float width = (getWidth() / 2) * this.maskWidth;
        float height = this.shimmerAngle >= 0 ? getHeight() : 0.0f;
        float cos = ((float) Math.cos(Math.toRadians(this.shimmerAngle))) * width;
        float sin = height + (((float) Math.sin(Math.toRadians(this.shimmerAngle))) * width);
        int i = this.shimmerColor;
        ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, height, cos, sin, new int[]{reduceColorAlphaValueToZero, i, i, reduceColorAlphaValueToZero}, getGradientColorDistribution(), Shader.TileMode.CLAMP), new BitmapShader(this.localMaskBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP), PorterDuff.Mode.DST_IN);
        Paint paint = new Paint();
        this.gradientTexturePaint = paint;
        paint.setAntiAlias(true);
        this.gradientTexturePaint.setDither(true);
        this.gradientTexturePaint.setFilterBitmap(true);
        this.gradientTexturePaint.setShader(composeShader);
    }

    private Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.maskAnimator;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        if (this.maskRect == null) {
            this.maskRect = calculateBitmapMaskRect();
        }
        int width = getWidth();
        final int i = getWidth() > this.maskRect.width() ? -width : -this.maskRect.width();
        final int width2 = this.maskRect.width();
        int i2 = width - i;
        ValueAnimator ofInt = this.isAnimationReversed ? ValueAnimator.ofInt(i2, 0) : ValueAnimator.ofInt(0, i2);
        this.maskAnimator = ofInt;
        ofInt.setDuration(this.shimmerAnimationDuration);
        this.maskAnimator.setRepeatCount(-1);
        this.maskAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.widget.skeleton.ShimmerLayout.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ShimmerLayout.this.maskOffsetX = i + ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (ShimmerLayout.this.maskOffsetX + width2 >= 0) {
                    ShimmerLayout.this.invalidate();
                }
            }
        });
        return this.maskAnimator;
    }

    private Bitmap createBitmap(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    private int getColor(int i) {
        return getContext().getColor(i);
    }

    private int reduceColorAlphaValueToZero(int i) {
        return Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
    }

    private Rect calculateBitmapMaskRect() {
        return new Rect(0, 0, calculateMaskWidth(), getHeight());
    }

    private int calculateMaskWidth() {
        return (int) ((((getWidth() / 2) * this.maskWidth) / Math.cos(Math.toRadians(Math.abs(this.shimmerAngle)))) + (getHeight() * Math.tan(Math.toRadians(Math.abs(this.shimmerAngle)))));
    }

    private float[] getGradientColorDistribution() {
        float f = this.gradientCenterColorWidth;
        return new float[]{0.0f, 0.5f - (f / 2.0f), (f / 2.0f) + 0.5f, 1.0f};
    }
}
