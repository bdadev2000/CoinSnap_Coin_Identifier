package com.glority.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;

/* loaded from: classes6.dex */
public class ScrollableEditText extends AppCompatEditText {
    public ScrollableEditText(Context context) {
        super(context);
        init();
    }

    public ScrollableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ScrollableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setOverScrollMode(0);
        setScrollBarStyle(16777216);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (hasFocus() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 8) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
