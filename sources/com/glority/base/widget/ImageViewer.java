package com.glority.base.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ImageViewer extends AppCompatImageView {
    private final GestureDetector gestureDetector;
    private Boolean isTouchEventIntercepted;
    private float lastX;
    private float lastY;
    boolean mAnimating;
    ValueAnimator mAnimator;
    int mBeginBottom;
    int mBeginLeft;
    int mBeginRight;
    float mBeginScale;
    int mBeginTop;
    int mDrawHeight;
    Matrix mDrawMatrix;
    float mDrawScale;
    int mDrawWidth;
    Drawable mDrawable;
    boolean mHorizontalMoving;
    List<ImageViewerListener> mImageViewerListeners;
    InertiaExecutor mInertiaExecutor;
    int mLeft;
    boolean mScaled;
    boolean mScaling;
    int mTop;
    VelocityTracker mVelocityTracker;
    boolean mVerticalMoving;
    private View.OnClickListener onClickListener;
    private OnLongPressedListener onLongPressedListener;
    private final ScaleGestureDetector scaleGestureDetector;

    /* loaded from: classes6.dex */
    public static class ImageViewerListener {
        public void onLongPressed(MotionEvent motionEvent) {
        }

        public void onScaleChanged(float f) {
        }

        public void onSingleTapUpConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: classes6.dex */
    public interface OnLongPressedListener {
        void onLongPressed(MotionEvent motionEvent);
    }

    public ImageViewer(Context context) {
        super(context, null);
        this.scaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.glority.base.widget.ImageViewer.1
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                if (ImageViewer.this.mAnimator != null) {
                    ImageViewer.this.mAnimator.cancel();
                }
                ImageViewer imageViewer = ImageViewer.this;
                imageViewer.mBeginScale = imageViewer.mDrawScale;
                ImageViewer imageViewer2 = ImageViewer.this;
                imageViewer2.mBeginLeft = imageViewer2.mLeft;
                ImageViewer imageViewer3 = ImageViewer.this;
                imageViewer3.mBeginTop = imageViewer3.mTop;
                ImageViewer imageViewer4 = ImageViewer.this;
                imageViewer4.mBeginRight = (imageViewer4.getWidth() - ImageViewer.this.mDrawWidth) - ImageViewer.this.mLeft;
                ImageViewer imageViewer5 = ImageViewer.this;
                imageViewer5.mBeginBottom = (imageViewer5.getHeight() - ImageViewer.this.mDrawHeight) - ImageViewer.this.mTop;
                ImageViewer.this.mScaling = true;
                ImageViewer.this.getParent().requestDisallowInterceptTouchEvent(true);
                ImageViewer.this.isTouchEventIntercepted = true;
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                ImageViewer imageViewer = ImageViewer.this;
                imageViewer.gotoDrawState(imageViewer.mBeginScale * scaleFactor);
                return false;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                super.onScaleEnd(scaleGestureDetector);
                ImageViewer.this.mScaled = true;
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.glority.base.widget.ImageViewer.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                ImageViewer.this.mScaled = false;
                return super.onDown(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (ImageViewer.this.mAnimating || ImageViewer.this.mHorizontalMoving || ImageViewer.this.mVerticalMoving || ImageViewer.this.mScaling) {
                    return false;
                }
                if (ImageViewer.this.mImageViewerListeners.isEmpty()) {
                    return true;
                }
                Iterator<ImageViewerListener> it = ImageViewer.this.mImageViewerListeners.iterator();
                while (it.hasNext()) {
                    it.next().onSingleTapUpConfirmed(motionEvent);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                ImageViewer imageViewer = ImageViewer.this;
                imageViewer.mBeginScale = imageViewer.mDrawScale;
                ImageViewer imageViewer2 = ImageViewer.this;
                imageViewer2.mBeginLeft = imageViewer2.mLeft;
                ImageViewer imageViewer3 = ImageViewer.this;
                imageViewer3.mBeginTop = imageViewer3.mTop;
                ImageViewer imageViewer4 = ImageViewer.this;
                imageViewer4.mBeginRight = (imageViewer4.getWidth() - ImageViewer.this.mDrawWidth) - ImageViewer.this.mLeft;
                ImageViewer imageViewer5 = ImageViewer.this;
                imageViewer5.mBeginBottom = (imageViewer5.getHeight() - ImageViewer.this.mDrawHeight) - ImageViewer.this.mTop;
                float largeDrawState = ImageViewer.this.largeDrawState();
                ImageViewer imageViewer6 = ImageViewer.this;
                if (imageViewer6.mDrawScale >= largeDrawState) {
                    largeDrawState = ImageViewer.this.defaultDrawState();
                }
                imageViewer6.animateToDrawState(largeDrawState);
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!ImageViewer.this.mScaled) {
                    if (ImageViewer.this.mLeft <= 0) {
                        ImageViewer.this.mLeft = (int) (r3.mLeft - f);
                        if (ImageViewer.this.mLeft > 0) {
                            ImageViewer.this.mLeft = 0;
                        } else if (ImageViewer.this.mLeft < ImageViewer.this.getWidth() - ImageViewer.this.mDrawWidth) {
                            ImageViewer imageViewer = ImageViewer.this;
                            imageViewer.mLeft = imageViewer.getWidth() - ImageViewer.this.mDrawWidth;
                        } else {
                            ImageViewer.this.mHorizontalMoving = true;
                        }
                    }
                    if (ImageViewer.this.mTop <= 0) {
                        ImageViewer.this.mTop = (int) (r3.mTop - f2);
                        if (ImageViewer.this.mTop > 0) {
                            ImageViewer.this.mTop = 0;
                        } else if (ImageViewer.this.mTop < ImageViewer.this.getHeight() - ImageViewer.this.mDrawHeight) {
                            ImageViewer imageViewer2 = ImageViewer.this;
                            imageViewer2.mTop = imageViewer2.getHeight() - ImageViewer.this.mDrawHeight;
                        } else {
                            ImageViewer.this.mVerticalMoving = true;
                        }
                    }
                    ImageViewer.this.updateDrawMatrix();
                    return false;
                }
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                if (ImageViewer.this.mImageViewerListeners.isEmpty()) {
                    return;
                }
                Iterator<ImageViewerListener> it = ImageViewer.this.mImageViewerListeners.iterator();
                while (it.hasNext()) {
                    it.next().onLongPressed(motionEvent);
                }
            }
        });
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mInertiaExecutor = new InertiaExecutor(getContext());
        this.mImageViewerListeners = new ArrayList();
        this.mDrawMatrix = new Matrix();
        this.isTouchEventIntercepted = null;
        this.onLongPressedListener = null;
    }

    public ImageViewer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageViewer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.glority.base.widget.ImageViewer.1
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                if (ImageViewer.this.mAnimator != null) {
                    ImageViewer.this.mAnimator.cancel();
                }
                ImageViewer imageViewer = ImageViewer.this;
                imageViewer.mBeginScale = imageViewer.mDrawScale;
                ImageViewer imageViewer2 = ImageViewer.this;
                imageViewer2.mBeginLeft = imageViewer2.mLeft;
                ImageViewer imageViewer3 = ImageViewer.this;
                imageViewer3.mBeginTop = imageViewer3.mTop;
                ImageViewer imageViewer4 = ImageViewer.this;
                imageViewer4.mBeginRight = (imageViewer4.getWidth() - ImageViewer.this.mDrawWidth) - ImageViewer.this.mLeft;
                ImageViewer imageViewer5 = ImageViewer.this;
                imageViewer5.mBeginBottom = (imageViewer5.getHeight() - ImageViewer.this.mDrawHeight) - ImageViewer.this.mTop;
                ImageViewer.this.mScaling = true;
                ImageViewer.this.getParent().requestDisallowInterceptTouchEvent(true);
                ImageViewer.this.isTouchEventIntercepted = true;
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                ImageViewer imageViewer = ImageViewer.this;
                imageViewer.gotoDrawState(imageViewer.mBeginScale * scaleFactor);
                return false;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                super.onScaleEnd(scaleGestureDetector);
                ImageViewer.this.mScaled = true;
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.glority.base.widget.ImageViewer.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                ImageViewer.this.mScaled = false;
                return super.onDown(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (ImageViewer.this.mAnimating || ImageViewer.this.mHorizontalMoving || ImageViewer.this.mVerticalMoving || ImageViewer.this.mScaling) {
                    return false;
                }
                if (ImageViewer.this.mImageViewerListeners.isEmpty()) {
                    return true;
                }
                Iterator<ImageViewerListener> it = ImageViewer.this.mImageViewerListeners.iterator();
                while (it.hasNext()) {
                    it.next().onSingleTapUpConfirmed(motionEvent);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                ImageViewer imageViewer = ImageViewer.this;
                imageViewer.mBeginScale = imageViewer.mDrawScale;
                ImageViewer imageViewer2 = ImageViewer.this;
                imageViewer2.mBeginLeft = imageViewer2.mLeft;
                ImageViewer imageViewer3 = ImageViewer.this;
                imageViewer3.mBeginTop = imageViewer3.mTop;
                ImageViewer imageViewer4 = ImageViewer.this;
                imageViewer4.mBeginRight = (imageViewer4.getWidth() - ImageViewer.this.mDrawWidth) - ImageViewer.this.mLeft;
                ImageViewer imageViewer5 = ImageViewer.this;
                imageViewer5.mBeginBottom = (imageViewer5.getHeight() - ImageViewer.this.mDrawHeight) - ImageViewer.this.mTop;
                float largeDrawState = ImageViewer.this.largeDrawState();
                ImageViewer imageViewer6 = ImageViewer.this;
                if (imageViewer6.mDrawScale >= largeDrawState) {
                    largeDrawState = ImageViewer.this.defaultDrawState();
                }
                imageViewer6.animateToDrawState(largeDrawState);
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!ImageViewer.this.mScaled) {
                    if (ImageViewer.this.mLeft <= 0) {
                        ImageViewer.this.mLeft = (int) (r3.mLeft - f);
                        if (ImageViewer.this.mLeft > 0) {
                            ImageViewer.this.mLeft = 0;
                        } else if (ImageViewer.this.mLeft < ImageViewer.this.getWidth() - ImageViewer.this.mDrawWidth) {
                            ImageViewer imageViewer = ImageViewer.this;
                            imageViewer.mLeft = imageViewer.getWidth() - ImageViewer.this.mDrawWidth;
                        } else {
                            ImageViewer.this.mHorizontalMoving = true;
                        }
                    }
                    if (ImageViewer.this.mTop <= 0) {
                        ImageViewer.this.mTop = (int) (r3.mTop - f2);
                        if (ImageViewer.this.mTop > 0) {
                            ImageViewer.this.mTop = 0;
                        } else if (ImageViewer.this.mTop < ImageViewer.this.getHeight() - ImageViewer.this.mDrawHeight) {
                            ImageViewer imageViewer2 = ImageViewer.this;
                            imageViewer2.mTop = imageViewer2.getHeight() - ImageViewer.this.mDrawHeight;
                        } else {
                            ImageViewer.this.mVerticalMoving = true;
                        }
                    }
                    ImageViewer.this.updateDrawMatrix();
                    return false;
                }
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                if (ImageViewer.this.mImageViewerListeners.isEmpty()) {
                    return;
                }
                Iterator<ImageViewerListener> it = ImageViewer.this.mImageViewerListeners.iterator();
                while (it.hasNext()) {
                    it.next().onLongPressed(motionEvent);
                }
            }
        });
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mInertiaExecutor = new InertiaExecutor(getContext());
        this.mImageViewerListeners = new ArrayList();
        this.mDrawMatrix = new Matrix();
        this.isTouchEventIntercepted = null;
        this.onLongPressedListener = null;
        addListener(new ImageViewerListener() { // from class: com.glority.base.widget.ImageViewer.3
            @Override // com.glority.base.widget.ImageViewer.ImageViewerListener
            public void onSingleTapUpConfirmed(MotionEvent motionEvent) {
                super.onSingleTapUpConfirmed(motionEvent);
                if (ImageViewer.this.onClickListener != null) {
                    ImageViewer.this.onClickListener.onClick(ImageViewer.this);
                }
            }

            @Override // com.glority.base.widget.ImageViewer.ImageViewerListener
            public void onLongPressed(MotionEvent motionEvent) {
                super.onLongPressed(motionEvent);
                if (ImageViewer.this.onLongPressedListener != null) {
                    ImageViewer.this.onLongPressedListener.onLongPressed(motionEvent);
                }
            }
        });
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = this.mDrawable;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || this.mDrawable.getIntrinsicHeight() == 0) {
            return;
        }
        if (!isEnabled()) {
            super.onDraw(canvas);
            return;
        }
        if (this.mDrawMatrix == null) {
            this.mDrawable.draw(canvas);
            return;
        }
        canvas.save();
        canvas.concat(this.mDrawMatrix);
        this.mDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.mDrawable = drawable;
        if (!isEnabled() || this.mDrawable == null) {
            return;
        }
        resetDrawState();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            if (this.mScaling) {
                this.mScaling = false;
                if (this.mLeft > 0 && this.mTop > 0) {
                    animateToResetDrawState();
                } else if (drawState(this.mDrawWidth, this.mDrawHeight) > maxDrawState()) {
                    animateToMaxDrawState();
                }
            } else if (this.mHorizontalMoving || this.mVerticalMoving) {
                this.mVelocityTracker.computeCurrentVelocity(1000);
                if (this.mHorizontalMoving) {
                    this.mHorizontalMoving = false;
                    i = (int) this.mVelocityTracker.getXVelocity();
                } else {
                    i = 0;
                }
                if (this.mVerticalMoving) {
                    this.mVerticalMoving = false;
                    i2 = (int) this.mVelocityTracker.getYVelocity();
                } else {
                    i2 = 0;
                }
                animateInertiaMove(i, i2);
            }
            this.mVelocityTracker.clear();
        }
        boolean onTouchEvent = this.scaleGestureDetector.onTouchEvent(motionEvent);
        if (!this.mScaling) {
            onTouchEvent = this.gestureDetector.onTouchEvent(motionEvent) || onTouchEvent;
        }
        return super.onTouchEvent(motionEvent) || onTouchEvent;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1 && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.isTouchEventIntercepted = null;
        } else if (motionEvent.getPointerCount() <= 1 && motionEvent.getAction() == 2 && this.isTouchEventIntercepted == null) {
            int x = (int) (motionEvent.getX() - this.lastX);
            int y = (int) (motionEvent.getY() - this.lastY);
            if (Math.abs(x) > Math.abs(y)) {
                if (canHorizontalScroll(x)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.isTouchEventIntercepted = true;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.isTouchEventIntercepted = false;
                }
            } else if (canVerticalScroll(y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.isTouchEventIntercepted = true;
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.isTouchEventIntercepted = false;
            }
        }
        this.lastX = motionEvent.getX();
        this.lastY = motionEvent.getY();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        resetDrawState();
    }

    public float defaultDrawState() {
        return drawState((getWidth() - getPaddingStart()) - getPaddingEnd(), (getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    public float defaultFillDrawState() {
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (this.mDrawable == null || getWidth() <= 0 || getHeight() <= 0) {
            return -1.0f;
        }
        return Math.max(width / this.mDrawable.getIntrinsicWidth(), height / this.mDrawable.getIntrinsicHeight());
    }

    public float overflowDrawState() {
        return defaultDrawState() * 5.0f;
    }

    public float maxDrawState() {
        return defaultDrawState() * 3.0f;
    }

    public float largeDrawState() {
        return defaultDrawState() * 2.0f;
    }

    public float minDrawState() {
        return defaultDrawState() * 0.5f;
    }

    public float drawState(int i, int i2) {
        if (this.mDrawable == null || getWidth() <= 0 || getHeight() <= 0) {
            return -1.0f;
        }
        return Math.min(i / this.mDrawable.getIntrinsicWidth(), i2 / this.mDrawable.getIntrinsicHeight());
    }

    public void animateToResetDrawState() {
        animateToDrawState(defaultDrawState());
    }

    public void animateToDrawState(float f) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mDrawScale, f);
        this.mAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.base.widget.ImageViewer.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ImageViewer.this.gotoDrawState(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.mAnimator.addListener(new Animator.AnimatorListener() { // from class: com.glority.base.widget.ImageViewer.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ImageViewer.this.mAnimating = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ImageViewer.this.mAnimating = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ImageViewer.this.mAnimating = false;
            }
        });
        this.mAnimator.setDuration(300L);
        this.mAnimator.start();
    }

    public void resetDrawState() {
        gotoDrawState(defaultDrawState());
    }

    public void animateToMaxDrawState() {
        animateToDrawState(maxDrawState());
    }

    public void gotoDrawState(float f) {
        if (isEnabled() && f >= 0.0f) {
            float minDrawState = minDrawState();
            float overflowDrawState = overflowDrawState();
            if (f < minDrawState) {
                this.mDrawScale = minDrawState;
            } else if (f > overflowDrawState) {
                this.mDrawScale = overflowDrawState;
            } else {
                this.mDrawScale = f;
            }
            if (this.mDrawable != null) {
                this.mDrawWidth = (int) ((r0.getIntrinsicWidth() * this.mDrawScale) + 0.5f);
                this.mDrawHeight = (int) ((this.mDrawable.getIntrinsicHeight() * this.mDrawScale) + 0.5f);
                if (this.mDrawWidth <= getWidth()) {
                    this.mLeft = (getWidth() - this.mDrawWidth) / 2;
                } else if (this.mBeginLeft == 0 && this.mBeginRight == 0) {
                    this.mLeft = (getWidth() - this.mDrawWidth) / 2;
                } else {
                    int width = getWidth() - this.mDrawWidth;
                    int i = this.mBeginLeft;
                    this.mLeft = (width * i) / (i + this.mBeginRight);
                }
                if (this.mDrawHeight <= getHeight()) {
                    this.mTop = (getHeight() - this.mDrawHeight) / 2;
                } else if (this.mBeginTop == 0 && this.mBeginBottom == 0) {
                    this.mTop = (getHeight() - this.mDrawHeight) / 2;
                } else {
                    int height = getHeight() - this.mDrawHeight;
                    int i2 = this.mBeginTop;
                    this.mTop = (height * i2) / (i2 + this.mBeginBottom);
                }
                updateDrawMatrix();
            }
            if (this.mImageViewerListeners.isEmpty()) {
                return;
            }
            Iterator<ImageViewerListener> it = this.mImageViewerListeners.iterator();
            while (it.hasNext()) {
                it.next().onScaleChanged(f);
            }
        }
    }

    void updateDrawMatrix() {
        Matrix matrix = this.mDrawMatrix;
        float f = this.mDrawScale;
        matrix.setScale(f, f);
        this.mDrawMatrix.postTranslate(this.mLeft, this.mTop);
        postInvalidate();
    }

    public void addListener(ImageViewerListener imageViewerListener) {
        this.mImageViewerListeners.add(imageViewerListener);
    }

    public void removeListener(ImageViewerListener imageViewerListener) {
        this.mImageViewerListeners.remove(imageViewerListener);
    }

    public void setOnLongPressedListener(OnLongPressedListener onLongPressedListener) {
        this.onLongPressedListener = onLongPressedListener;
    }

    public boolean canHorizontalScroll(int i) {
        if (i < 0) {
            if (this.mLeft > getWidth() - this.mDrawWidth) {
                return true;
            }
        } else if (this.mLeft < 0) {
            return true;
        }
        return false;
    }

    private boolean canVerticalScroll(int i) {
        if (i < 0) {
            if (this.mTop > getHeight() - this.mDrawHeight) {
                return true;
            }
        } else if (this.mTop < 0) {
            return true;
        }
        return false;
    }

    public void move(int i, int i2) {
        if (this.mScaled) {
            return;
        }
        int i3 = this.mLeft;
        if (i3 <= 0) {
            int i4 = i3 - i;
            this.mLeft = i4;
            if (i4 > 0) {
                this.mLeft = 0;
            } else if (i4 < getWidth() - this.mDrawWidth) {
                this.mLeft = getWidth() - this.mDrawWidth;
            }
        }
        int i5 = this.mTop;
        if (i5 <= 0) {
            int i6 = i5 - i2;
            this.mTop = i6;
            if (i6 > 0) {
                this.mTop = 0;
            } else if (i6 < getHeight() - this.mDrawHeight) {
                this.mTop = getHeight() - this.mDrawHeight;
            }
        }
        updateDrawMatrix();
    }

    public void animateInertiaMove(int i, int i2) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mInertiaExecutor.execute(i, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            resetDrawState();
        }
    }

    public Bitmap getCroppedBitmap() {
        if (this.mDrawable == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(Math.min(getWidth(), this.mDrawWidth), Math.min(getHeight(), this.mDrawHeight), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        float f = this.mDrawScale;
        matrix.setScale(f, f);
        matrix.postTranslate(Math.min(this.mLeft, 0), Math.min(this.mTop, 0));
        canvas.concat(matrix);
        this.mDrawable.draw(canvas);
        return createBitmap;
    }

    public int getDrawLeft() {
        return this.mLeft;
    }

    public int getDrawTop() {
        return this.mTop;
    }

    public int getDrawWidth() {
        return this.mDrawWidth;
    }

    public int getDrawHeight() {
        return this.mDrawHeight;
    }

    public float getDrawScale() {
        return this.mDrawScale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class InertiaExecutor implements Runnable {
        int lastX;
        int lastY;
        OverScroller overScroller;
        final Interpolator quinticInterpolator;

        InertiaExecutor(Context context) {
            Interpolator interpolator = new Interpolator() { // from class: com.glority.base.widget.ImageViewer.InertiaExecutor.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    float f2 = f - 1.0f;
                    return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                }
            };
            this.quinticInterpolator = interpolator;
            this.overScroller = new OverScroller(context, interpolator);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.overScroller.computeScrollOffset()) {
                int currX = this.overScroller.getCurrX();
                int currY = this.overScroller.getCurrY();
                int i = this.lastX - currX;
                int i2 = this.lastY - currY;
                this.lastX = currX;
                this.lastY = currY;
                ImageViewer.this.move(i, i2);
                ViewCompat.postOnAnimation(ImageViewer.this, this);
            }
        }

        void execute(int i, int i2) {
            this.lastY = 0;
            this.lastX = 0;
            this.overScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            ViewCompat.postOnAnimation(ImageViewer.this, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
