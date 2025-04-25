package com.glority.imagezoomview.imagezoom;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageViewTouch.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u0000 Q2\u00020\u0001:\u0005QRSTUB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010.\u001a\u00020\nH\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0007H\u0016J\"\u00100\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J \u00102\u001a\u00020*2\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*H\u0016J\u0010\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108J&\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020*J(\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007H\u0014J*\u0010C\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u0001082\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020*J\u0010\u0010F\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108J\u0010\u0010G\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108J\u0010\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u000208H\u0016J\u0012\u0010J\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010K\u001a\u0002012\u0006\u00103\u001a\u00020*H\u0014J\u0010\u0010L\u001a\u0002012\b\u0010M\u001a\u0004\u0018\u00010\u0011J\u000e\u0010N\u001a\u0002012\u0006\u0010%\u001a\u00020\nJ\u000e\u0010O\u001a\u0002012\u0006\u0010%\u001a\u00020\nJ\u0010\u0010P\u001a\u0002012\b\u0010M\u001a\u0004\u0018\u00010#R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u001e\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006V"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouch;", "Lcom/glority/imagezoomview/imagezoom/ImageViewTouchBase;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "doubleTapEnabled", "", "getDoubleTapEnabled", "()Z", "setDoubleTapEnabled", "(Z)V", "mDoubleTapDirection", "mDoubleTapListener", "Lcom/glority/imagezoomview/imagezoom/ImageViewTouch$OnImageViewTouchDoubleTapListener;", "mGestureDetector", "Landroid/view/GestureDetector;", "mGestureListener", "Landroid/view/GestureDetector$OnGestureListener;", "mPointerUpTime", "", "getMPointerUpTime", "()J", "setMPointerUpTime", "(J)V", "mScaleDetector", "Landroid/view/ScaleGestureDetector;", "mScaleEnabled", "mScaleListener", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "mScrollEnabled", "mSingleTapListener", "Lcom/glority/imagezoomview/imagezoom/ImageViewTouch$OnImageViewTouchSingleTapListener;", "mTouchSlop", "value", "quickScaleEnabled", "getQuickScaleEnabled", "setQuickScaleEnabled", "<set-?>", "", "scaleFactor", "getScaleFactor", "()F", "canScroll", "direction", "init", "", "onDoubleTapPost", "scale", "maxZoom", "minScale", "onDown", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "velocityY", "onLayoutChanged", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "onScroll", "distanceX", "distanceY", "onSingleTapConfirmed", "onSingleTapUp", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "onUp", "onZoomAnimationCompleted", "setDoubleTapListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setScaleEnabled", "setScrollEnabled", "setSingleTapListener", "Companion", "GestureListener", "OnImageViewTouchDoubleTapListener", "OnImageViewTouchSingleTapListener", "ScaleListener", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public class ImageViewTouch extends ImageViewTouchBase {
    public static final long MIN_FLING_DELTA_TIME = 150;
    public static final float SCROLL_DELTA_THRESHOLD = 1.0f;
    private boolean doubleTapEnabled;
    private int mDoubleTapDirection;
    private OnImageViewTouchDoubleTapListener mDoubleTapListener;
    private GestureDetector mGestureDetector;
    private GestureDetector.OnGestureListener mGestureListener;
    private long mPointerUpTime;
    private ScaleGestureDetector mScaleDetector;
    private boolean mScaleEnabled;
    private ScaleGestureDetector.OnScaleGestureListener mScaleListener;
    private boolean mScrollEnabled;
    private OnImageViewTouchSingleTapListener mSingleTapListener;
    private int mTouchSlop;
    private float scaleFactor;

    /* compiled from: ImageViewTouch.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouch$OnImageViewTouchDoubleTapListener;", "", "onDoubleTap", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public interface OnImageViewTouchDoubleTapListener {
        void onDoubleTap();
    }

    /* compiled from: ImageViewTouch.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouch$OnImageViewTouchSingleTapListener;", "", "onSingleTapConfirmed", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public interface OnImageViewTouchSingleTapListener {
        void onSingleTapConfirmed();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewTouch(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouchBase
    public void _$_clearFindViewByIdCache() {
    }

    public final boolean onSingleTapConfirmed(MotionEvent e) {
        return true;
    }

    public /* synthetic */ ImageViewTouch(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.doubleTapEnabled = true;
        this.mScaleEnabled = true;
        this.mScrollEnabled = true;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final boolean getDoubleTapEnabled() {
        return this.doubleTapEnabled;
    }

    public final void setDoubleTapEnabled(boolean z) {
        this.doubleTapEnabled = z;
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouchBase
    protected void init(Context context, AttributeSet attrs, int defStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.init(context, attrs, defStyle);
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mGestureListener = new GestureListener(this);
        this.mScaleListener = new ScaleListener(this);
        Context context2 = getContext();
        ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener = this.mScaleListener;
        if (onScaleGestureListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleListener");
            onScaleGestureListener = null;
        }
        this.mScaleDetector = new ScaleGestureDetector(context2, onScaleGestureListener);
        Context context3 = getContext();
        GestureDetector.OnGestureListener onGestureListener = this.mGestureListener;
        if (onGestureListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureListener");
            onGestureListener = null;
        }
        this.mGestureDetector = new GestureDetector(context3, onGestureListener, null, true);
        this.mDoubleTapDirection = 1;
        setQuickScaleEnabled(false);
    }

    public final boolean getQuickScaleEnabled() {
        ScaleGestureDetector scaleGestureDetector = this.mScaleDetector;
        if (scaleGestureDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
            scaleGestureDetector = null;
        }
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    public final void setQuickScaleEnabled(boolean z) {
        ScaleGestureDetector scaleGestureDetector = this.mScaleDetector;
        if (scaleGestureDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
            scaleGestureDetector = null;
        }
        scaleGestureDetector.setQuickScaleEnabled(z);
    }

    public final void setDoubleTapListener(OnImageViewTouchDoubleTapListener listener) {
        this.mDoubleTapListener = listener;
    }

    public final void setSingleTapListener(OnImageViewTouchSingleTapListener listener) {
        this.mSingleTapListener = listener;
    }

    public final void setScaleEnabled(boolean value) {
        this.mScaleEnabled = value;
    }

    public final void setScrollEnabled(boolean value) {
        this.mScrollEnabled = value;
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouchBase
    protected void onLayoutChanged(int left, int top, int right, int bottom) {
        super.onLayoutChanged(left, top, right, bottom);
        Log.v(ImageViewTouchBase.TAG, "min: " + getMinScale() + ", max: " + getMaxScale() + ", result: " + ((getMaxScale() - getMinScale()) / 2.0f));
        this.scaleFactor = ((getMaxScale() - getMinScale()) / 2.0f) + 0.5f;
    }

    public final long getMPointerUpTime() {
        return this.mPointerUpTime;
    }

    public final void setMPointerUpTime(long j) {
        this.mPointerUpTime = j;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (getBitmapChanged()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 6) {
            this.mPointerUpTime = event.getEventTime();
        }
        ScaleGestureDetector scaleGestureDetector = this.mScaleDetector;
        GestureDetector gestureDetector = null;
        if (scaleGestureDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
            scaleGestureDetector = null;
        }
        scaleGestureDetector.onTouchEvent(event);
        ScaleGestureDetector scaleGestureDetector2 = this.mScaleDetector;
        if (scaleGestureDetector2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
            scaleGestureDetector2 = null;
        }
        if (!scaleGestureDetector2.isInProgress()) {
            GestureDetector gestureDetector2 = this.mGestureDetector;
            if (gestureDetector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGestureDetector");
            } else {
                gestureDetector = gestureDetector2;
            }
            gestureDetector.onTouchEvent(event);
        }
        if (actionMasked == 1) {
            return onUp(event);
        }
        return true;
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouchBase
    protected void onZoomAnimationCompleted(float scale) {
        if (ImageViewTouchBase.INSTANCE.getDEBUG()) {
            Log.d(ImageViewTouchBase.TAG, "onZoomAnimationCompleted. scale: " + scale + ", minZoom: " + getMinScale());
        }
        if (scale < getMinScale()) {
            zoomTo(getMinScale(), 50L);
        }
    }

    public float onDoubleTapPost(float scale, float maxZoom, float minScale) {
        float f = this.scaleFactor;
        return scale + f <= maxZoom ? scale + f : minScale;
    }

    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        if (!canScroll()) {
            return false;
        }
        setMUserScaled(true);
        scrollBy(-distanceX, -distanceY);
        invalidate();
        return true;
    }

    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(e1, "e1");
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!canScroll()) {
            return false;
        }
        if (ImageViewTouchBase.INSTANCE.getDEBUG()) {
            Log.i(ImageViewTouchBase.TAG, "onFling");
        }
        if (Math.abs(velocityX) <= getMMinFlingVelocity() * 4 && Math.abs(velocityY) <= getMMinFlingVelocity() * 4) {
            return false;
        }
        if (ImageViewTouchBase.INSTANCE.getDEBUG()) {
            Log.v(ImageViewTouchBase.TAG, Intrinsics.stringPlus("velocity: ", Float.valueOf(velocityY)));
            Log.v(ImageViewTouchBase.TAG, Intrinsics.stringPlus("diff: ", Float.valueOf(e2.getY() - e1.getY())));
        }
        float min = Math.min(Math.max(2.0f, getScale1() / 2), 3.0f);
        float mMaxFlingVelocity = (velocityX / getMMaxFlingVelocity()) * getWidth() * min;
        float mMaxFlingVelocity2 = (velocityY / getMMaxFlingVelocity()) * getHeight() * min;
        setMUserScaled(true);
        scrollBy(mMaxFlingVelocity, mMaxFlingVelocity2, (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow(mMaxFlingVelocity, 2.0d) + Math.pow(mMaxFlingVelocity2, 2.0d)) / 5), 800.0d));
        postInvalidate();
        return true;
    }

    public final boolean onDown(MotionEvent e) {
        return !getBitmapChanged();
    }

    public boolean onUp(MotionEvent e) {
        if (getBitmapChanged()) {
            return false;
        }
        if (getScale1() >= getMinScale()) {
            return true;
        }
        zoomTo(getMinScale(), 50L);
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent e) {
        return !getBitmapChanged();
    }

    public boolean canScroll() {
        if (getScale1() > 1.0f) {
            return true;
        }
        return !getMViewPort().contains(getBitmapRect());
    }

    public boolean canScroll(int direction) {
        RectF bitmapRect = getBitmapRect();
        updateRect(bitmapRect, getMScrollPoint());
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        return (bitmapRect.right < ((float) rect.right) || direction >= 0) ? ((double) Math.abs(bitmapRect.left - getMScrollPoint().x)) > 1.0d : Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f;
    }

    /* compiled from: ImageViewTouch.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouch$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/glority/imagezoomview/imagezoom/ImageViewTouch;)V", "onDoubleTap", "", "e", "Landroid/view/MotionEvent;", "onDown", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onLongPress", "", "onScroll", "distanceX", "distanceY", "onSingleTapConfirmed", "onSingleTapUp", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ ImageViewTouch this$0;

        public GestureListener(ImageViewTouch this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.this$0.mSingleTapListener != null) {
                OnImageViewTouchSingleTapListener onImageViewTouchSingleTapListener = this.this$0.mSingleTapListener;
                Intrinsics.checkNotNull(onImageViewTouchSingleTapListener);
                onImageViewTouchSingleTapListener.onSingleTapConfirmed();
            }
            return this.this$0.onSingleTapConfirmed(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (ImageViewTouchBase.INSTANCE.getDEBUG()) {
                Log.i(ImageViewTouchBase.TAG, Intrinsics.stringPlus("onDoubleTap. double tap enabled? ", Boolean.valueOf(this.this$0.getDoubleTapEnabled())));
            }
            if (this.this$0.getDoubleTapEnabled()) {
                ScaleGestureDetector scaleGestureDetector = this.this$0.mScaleDetector;
                if (scaleGestureDetector == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
                    scaleGestureDetector = null;
                }
                if (scaleGestureDetector.isQuickScaleEnabled()) {
                    return true;
                }
                this.this$0.setMUserScaled(true);
                float scale1 = this.this$0.getScale1();
                ImageViewTouch imageViewTouch = this.this$0;
                this.this$0.zoomTo(Math.min(this.this$0.getMaxScale(), Math.max(imageViewTouch.onDoubleTapPost(scale1, imageViewTouch.getMaxScale(), this.this$0.getMinScale()), this.this$0.getMinScale())), e.getX(), e.getY(), this.this$0.getMDefaultAnimationDuration());
            }
            if (this.this$0.mDoubleTapListener != null) {
                OnImageViewTouchDoubleTapListener onImageViewTouchDoubleTapListener = this.this$0.mDoubleTapListener;
                Intrinsics.checkNotNull(onImageViewTouchDoubleTapListener);
                onImageViewTouchDoubleTapListener.onDoubleTap();
            }
            return super.onDoubleTap(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.this$0.isLongClickable()) {
                ScaleGestureDetector scaleGestureDetector = this.this$0.mScaleDetector;
                if (scaleGestureDetector == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
                    scaleGestureDetector = null;
                }
                if (scaleGestureDetector.isInProgress()) {
                    return;
                }
                this.this$0.setPressed(true);
                this.this$0.performLongClick();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            if (!this.this$0.mScrollEnabled || e1.getPointerCount() > 1 || e2.getPointerCount() > 1) {
                return false;
            }
            ScaleGestureDetector scaleGestureDetector = this.this$0.mScaleDetector;
            if (scaleGestureDetector == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
                scaleGestureDetector = null;
            }
            if (scaleGestureDetector.isInProgress()) {
                return false;
            }
            return this.this$0.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            Intrinsics.checkNotNullParameter(e1, "e1");
            Intrinsics.checkNotNullParameter(e2, "e2");
            if (!this.this$0.mScrollEnabled || e1.getPointerCount() > 1 || e2.getPointerCount() > 1) {
                return false;
            }
            ScaleGestureDetector scaleGestureDetector = this.this$0.mScaleDetector;
            if (scaleGestureDetector == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mScaleDetector");
                scaleGestureDetector = null;
            }
            if (!scaleGestureDetector.isInProgress() && SystemClock.uptimeMillis() - this.this$0.getMPointerUpTime() > 150) {
                return this.this$0.onFling(e1, e2, velocityX, velocityY);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return this.this$0.onSingleTapUp(e);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (ImageViewTouchBase.INSTANCE.getDEBUG()) {
                Log.i(ImageViewTouchBase.TAG, "onDown");
            }
            this.this$0.stopAllAnimations();
            return this.this$0.onDown(e);
        }
    }

    /* compiled from: ImageViewTouch.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/imagezoomview/imagezoom/ImageViewTouch$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lcom/glority/imagezoomview/imagezoom/ImageViewTouch;)V", "mScaled", "", "getMScaled", "()Z", "setMScaled", "(Z)V", "onScale", "detector", "Landroid/view/ScaleGestureDetector;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private boolean mScaled;
        final /* synthetic */ ImageViewTouch this$0;

        public ScaleListener(ImageViewTouch this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        protected final boolean getMScaled() {
            return this.mScaled;
        }

        protected final void setMScaled(boolean z) {
            this.mScaled = z;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            float currentSpan = detector.getCurrentSpan() - detector.getPreviousSpan();
            float scale1 = this.this$0.getScale1() * detector.getScaleFactor();
            if (this.this$0.mScaleEnabled) {
                boolean z = this.mScaled;
                if (z && currentSpan != 0.0f) {
                    this.this$0.setMUserScaled(true);
                    this.this$0.zoomTo(Math.min(this.this$0.getMaxScale(), Math.max(scale1, this.this$0.getMinScale() - 0.1f)), detector.getFocusX(), detector.getFocusY());
                    this.this$0.mDoubleTapDirection = 1;
                    this.this$0.invalidate();
                    return true;
                }
                if (!z) {
                    this.mScaled = true;
                }
            }
            return true;
        }
    }
}
