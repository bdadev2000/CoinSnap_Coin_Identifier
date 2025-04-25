package com.glority.base.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.glority.imagezoomview.imagezoom.ImageViewTouch;

/* loaded from: classes6.dex */
public class NPImageViewTouch extends ImageViewTouch {
    public NPImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouchBase
    public void onViewPortChanged(float f, float f2, float f3, float f4) {
        super.onViewPortChanged(0.0f, f2, f3 - f, f4);
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouch
    public boolean canScroll(int i) {
        RectF bitmapRect = getBitmapRect();
        updateRect(bitmapRect, getMScrollPoint());
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.left < rect.left || bitmapRect.right > rect.right) {
            return (bitmapRect.right < ((float) rect.right) || i >= 0) ? (bitmapRect.left > 0.0f || i <= 0) ? ((double) Math.abs(bitmapRect.left - getMScrollPoint().x)) > 1.0d : Math.abs(bitmapRect.left - ((float) rect.left)) > 1.0f : Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f;
        }
        return false;
    }
}
