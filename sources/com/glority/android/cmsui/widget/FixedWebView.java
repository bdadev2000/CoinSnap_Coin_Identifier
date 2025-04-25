package com.glority.android.cmsui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes14.dex */
public class FixedWebView extends WebView {
    private static final String TAG = "FixedWebView";
    private Boolean clampedX;
    private Boolean clampedY;
    private OnOverScrolledListener onOverScrolledListener;

    /* loaded from: classes14.dex */
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
    }

    public FixedWebView(Context context, AttributeSet attributeSet) {
        super(getFixedContext(context), attributeSet);
        this.clampedX = null;
        this.clampedY = null;
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i) {
        super(getFixedContext(context), attributeSet, i);
        this.clampedX = null;
        this.clampedY = null;
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(getFixedContext(context), attributeSet, i, i2);
        this.clampedX = null;
        this.clampedY = null;
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(getFixedContext(context), attributeSet, i, z);
        this.clampedX = null;
        this.clampedY = null;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        Boolean bool2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            this.clampedX = null;
            this.clampedY = null;
        } else if (action == 2 && (((bool = this.clampedX) != null && bool.booleanValue()) || ((bool2 = this.clampedY) != null && bool2.booleanValue()))) {
            z = false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        this.clampedX = Boolean.valueOf(z);
        this.clampedY = Boolean.valueOf(z2);
        OnOverScrolledListener onOverScrolledListener = this.onOverScrolledListener;
        if (onOverScrolledListener != null) {
            onOverScrolledListener.onOverScrolled(i, i2, z, z2);
        }
        super.onOverScrolled(i, i2, z, z2);
    }
}
