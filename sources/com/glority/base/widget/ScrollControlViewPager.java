package com.glority.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes6.dex */
public class ScrollControlViewPager extends ViewPager {
    private boolean noScroll;

    public ScrollControlViewPager(Context context) {
        super(context);
        this.noScroll = false;
    }

    public ScrollControlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.noScroll = false;
    }

    public void setNoScroll(boolean z) {
        this.noScroll = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.noScroll) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.noScroll) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
