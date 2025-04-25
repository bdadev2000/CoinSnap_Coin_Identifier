package com.glority.base.widget.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public class FixedWebView extends WebView {
    private static final String TAG = "FixedWebView";
    private Boolean clampedX;
    private Boolean clampedY;
    private Boolean isHorizontalScroll;
    private int lastX;
    private int lastY;
    private OnOverScrolledListener onOverScrolledListener;

    /* loaded from: classes6.dex */
    public interface OnOverScrolledListener {
        void onOverScrolled(int i, int i2, boolean z, boolean z2);
    }

    private static Context getFixedContext(Context context) {
        return context;
    }

    public void setOnOverScrolledListener(OnOverScrolledListener onOverScrolledListener) {
        this.onOverScrolledListener = onOverScrolledListener;
    }

    public FixedWebView(Context context) {
        super(getFixedContext(context));
        this.clampedX = null;
        this.clampedY = null;
        this.lastX = -1;
        this.lastY = -1;
        this.isHorizontalScroll = null;
    }

    public FixedWebView(Context context, AttributeSet attributeSet) {
        super(getFixedContext(context), attributeSet);
        this.clampedX = null;
        this.clampedY = null;
        this.lastX = -1;
        this.lastY = -1;
        this.isHorizontalScroll = null;
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i) {
        super(getFixedContext(context), attributeSet, i);
        this.clampedX = null;
        this.clampedY = null;
        this.lastX = -1;
        this.lastY = -1;
        this.isHorizontalScroll = null;
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(getFixedContext(context), attributeSet, i, i2);
        this.clampedX = null;
        this.clampedY = null;
        this.lastX = -1;
        this.lastY = -1;
        this.isHorizontalScroll = null;
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(getFixedContext(context), attributeSet, i, z);
        this.clampedX = null;
        this.clampedY = null;
        this.lastX = -1;
        this.lastY = -1;
        this.isHorizontalScroll = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.clampedX = null;
            this.isHorizontalScroll = null;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (action == 2) {
            int abs = Math.abs(rawX - this.lastX);
            int abs2 = Math.abs(rawY - this.lastY);
            if (this.isHorizontalScroll == null) {
                this.isHorizontalScroll = Boolean.valueOf(abs >= abs2);
            }
            Log.d(TAG, "dealtX >= dealtY: " + (abs >= abs2) + ", isHorizontalScroll: " + this.isHorizontalScroll + ", clampedX: " + this.clampedX);
            if (getParent() != null) {
                ViewParent parent = getParent();
                if (this.isHorizontalScroll.booleanValue() && ((bool = this.clampedX) == null || !bool.booleanValue())) {
                    z = true;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            }
            this.lastX = rawX;
            this.lastY = rawY;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Log.d(TAG, "onOverScrolled: scrollX: " + i + ", scrollY: " + i2 + ", clampedX: " + z + ", clampedY: " + z2);
        this.clampedX = Boolean.valueOf(z);
        this.clampedY = Boolean.valueOf(z2);
        OnOverScrolledListener onOverScrolledListener = this.onOverScrolledListener;
        if (onOverScrolledListener != null) {
            onOverScrolledListener.onOverScrolled(i, i2, z, z2);
        }
        super.onOverScrolled(i, i2, z, z2);
    }
}
