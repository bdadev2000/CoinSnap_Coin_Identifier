package com.glority.android.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public class FixedWebView extends WebView {
    private OnOverScrolledListener onOverScrolledListener;

    /* loaded from: classes4.dex */
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
    }

    public FixedWebView(Context context, AttributeSet attributeSet) {
        super(getFixedContext(context), attributeSet);
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i) {
        super(getFixedContext(context), attributeSet, i);
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(getFixedContext(context), attributeSet, i, i2);
    }

    public FixedWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(getFixedContext(context), attributeSet, i, z);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        OnOverScrolledListener onOverScrolledListener = this.onOverScrolledListener;
        if (onOverScrolledListener != null) {
            onOverScrolledListener.onOverScrolled(i, i2, z, z2);
        }
        super.onOverScrolled(i, i2, z, z2);
    }
}
