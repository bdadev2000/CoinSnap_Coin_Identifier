package com.glority.widget.imagepager;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.glority.android.xx.constants.LogEvents;
import com.glority.imagezoomview.imagezoom.ImageViewTouch;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlImageViewTouch.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/widget/imagepager/GlImageViewTouch;", "Lcom/glority/imagezoomview/imagezoom/ImageViewTouch;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "startX", "", "startY", "canScroll", "", "direction", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onDoubleTapPost", "scale", "maxZoom", "minScale", "onUp", "e", "onViewPortChanged", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlImageViewTouch extends ImageViewTouch {
    private float startX;
    private float startY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouchBase
    public void onViewPortChanged(float left, float top, float right, float bottom) {
        super.onViewPortChanged(0.0f, top, right - left, bottom);
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouch
    public boolean canScroll(int direction) {
        RectF bitmapRect = getBitmapRect();
        updateRect(bitmapRect, getMScrollPoint());
        getGlobalVisibleRect(new Rect());
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.left >= r1.left && bitmapRect.right <= r1.right) {
            return false;
        }
        if (bitmapRect.right < r1.right || direction >= 0) {
            if (bitmapRect.left > 0 || direction <= 0) {
                if (Math.abs(bitmapRect.left - getMScrollPoint().x) <= 1.0d) {
                    return false;
                }
            } else if (Math.abs(bitmapRect.left - r1.left) <= 1.0f) {
                return false;
            }
        } else if (Math.abs(bitmapRect.right - r1.right) <= 1.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.getAction()
            r1 = 1
            if (r0 == 0) goto L7b
            if (r0 == r1) goto L72
            r2 = 2
            if (r0 == r2) goto L16
            r1 = 3
            if (r0 == r1) goto L72
            goto L8e
        L16:
            float r0 = r6.getX()
            float r2 = r6.getY()
            float r3 = r5.startX
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            float r4 = r5.startY
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r4 = r6.getPointerCount()
            if (r4 <= r1) goto L3b
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L8e
        L3b:
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L8e
            float r1 = r5.startX
            float r1 = r0 - r1
            int r1 = (int) r1
            boolean r1 = r5.canScroll(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "dispatchTouchEvent: "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = " dis "
            java.lang.StringBuilder r2 = r2.append(r3)
            float r3 = r5.startX
            float r0 = r0 - r3
            int r0 = (int) r0
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ImageViewTouchBase"
            android.util.Log.e(r2, r0)
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L8e
        L72:
            android.view.ViewParent r0 = r5.getParent()
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L8e
        L7b:
            float r0 = r6.getX()
            r5.startX = r0
            float r0 = r6.getY()
            r5.startY = r0
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L8e:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.imagepager.GlImageViewTouch.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouch
    public boolean onUp(MotionEvent e) {
        if (getBitmapChanged()) {
            return false;
        }
        if (getScale1() < getMinScale()) {
            zoomTo(1.0f, 50L);
        }
        return true;
    }

    @Override // com.glority.imagezoomview.imagezoom.ImageViewTouch
    public float onDoubleTapPost(float scale, float maxZoom, float minScale) {
        if (getScaleFactor() + scale <= maxZoom) {
            return scale + getScaleFactor();
        }
        return 1.0f;
    }
}
