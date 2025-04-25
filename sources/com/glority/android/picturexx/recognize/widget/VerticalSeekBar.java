package com.glority.android.picturexx.recognize.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerticalSeekBar.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 12\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bJ(\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0013H\u0002J\b\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0007H\u0016J\u0012\u0010)\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\rJ\u000e\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\rJ\u000e\u0010/\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\rJ\u000e\u00100\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/VerticalSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mIsDragging", "", "mTouchDownY", "", "mScaledTouchSlop", "isInScrollingContainer", "mOnSeekBarChangListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setInScrollingContainer", "", "mTouchProgressOffset", "onSizeChanged", "w", "h", "oldw", "oldh", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "trackTouchEvent", "onStartTrackingTouch", "onStopTrackingTouch", "attemptClaimDrag", "setProgress", "progress", "setOnSeekBarChangeListener", "l", "setMaxFloat", "max", "setMinFloat", "min", "setProgressFloat", "restoreProgressFloat", "Companion", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class VerticalSeekBar extends AppCompatSeekBar {
    private static final int LINEAR_MULTIPLIER = 1000;
    private static final float POWER_VALUE = 0.33333334f;
    private boolean isInScrollingContainer;
    private boolean mIsDragging;
    private SeekBar.OnSeekBarChangeListener mOnSeekBarChangListener;
    private int mScaledTouchSlop;
    private float mTouchDownY;
    private float mTouchProgressOffset;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VerticalSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: isInScrollingContainer, reason: from getter */
    private final boolean getIsInScrollingContainer() {
        return this.isInScrollingContainer;
    }

    public final void setInScrollingContainer(boolean isInScrollingContainer) {
        this.isInScrollingContainer = isInScrollingContainer;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(h, w, oldh, oldw);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, widthMeasureSpec);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.mIsDragging) {
                    trackTouchEvent(event);
                    onStopTrackingTouch();
                    setPressed(false);
                } else {
                    onStartTrackingTouch();
                    trackTouchEvent(event);
                    onStopTrackingTouch();
                }
                onSizeChanged(getWidth(), getHeight(), 0, 0);
                invalidate();
            } else if (action == 2) {
                if (this.mIsDragging) {
                    trackTouchEvent(event);
                } else if (Math.abs(event.getY() - this.mTouchDownY) > this.mScaledTouchSlop) {
                    setPressed(true);
                    invalidate();
                    onStartTrackingTouch();
                    trackTouchEvent(event);
                    attemptClaimDrag();
                }
                onSizeChanged(getWidth(), getHeight(), 0, 0);
            }
        } else if (getIsInScrollingContainer()) {
            this.mTouchDownY = event.getY();
        } else {
            setPressed(true);
            invalidate();
            onStartTrackingTouch();
            trackTouchEvent(event);
            attemptClaimDrag();
            onSizeChanged(getWidth(), getHeight(), 0, 0);
        }
        return true;
    }

    private final void trackTouchEvent(MotionEvent event) {
        float f;
        int height = getHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i = (height - paddingTop) - paddingBottom;
        int y = (int) event.getY();
        int i2 = height - paddingBottom;
        float f2 = 0.0f;
        if (y > i2) {
            f = 0.0f;
        } else if (y < paddingTop) {
            f = 1.0f;
        } else {
            f2 = this.mTouchProgressOffset;
            f = ((i - y) + paddingTop) / i;
        }
        int max = (int) (f2 + (f * getMax()));
        setProgress(max);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangListener;
        if (onSeekBarChangeListener != null) {
            Intrinsics.checkNotNull(onSeekBarChangeListener);
            onSeekBarChangeListener.onProgressChanged(this, max, true);
        }
    }

    private final void onStartTrackingTouch() {
        this.mIsDragging = true;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangListener;
        if (onSeekBarChangeListener != null) {
            Intrinsics.checkNotNull(onSeekBarChangeListener);
            onSeekBarChangeListener.onStartTrackingTouch(this);
        }
    }

    private final void onStopTrackingTouch() {
        this.mIsDragging = false;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangListener;
        if (onSeekBarChangeListener != null) {
            Intrinsics.checkNotNull(onSeekBarChangeListener);
            onSeekBarChangeListener.onStopTrackingTouch(this);
        }
    }

    private final void attemptClaimDrag() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int progress) {
        super.setProgress(progress);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener l) {
        this.mOnSeekBarChangListener = l;
    }

    public final void setMaxFloat(float max) {
        setMax((int) (((float) Math.pow(max, POWER_VALUE)) * 1000));
    }

    public final void setMinFloat(float min) {
        setMin((int) (((float) Math.pow(min, POWER_VALUE)) * 1000));
    }

    public final void setProgressFloat(float progress) {
        setProgress((int) (((float) Math.pow(progress, POWER_VALUE)) * 1000));
    }

    public final float restoreProgressFloat(int progress) {
        return (float) Math.pow(progress / 1000, 3.0f);
    }
}
