package com.glority.camera.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.app.NotificationCompat;
import com.glority.utils.ui.ViewUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraHorizontalSeekBar.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/camera/widgets/CameraHorizontalSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShowingTrack", "", "mTrackPaint", "Landroid/graphics/Paint;", "isTouchInThumb", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "thumbBounds", "Landroid/graphics/Rect;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "setTrackVisible", "visible", "camera_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes6.dex */
public final class CameraHorizontalSeekBar extends AppCompatSeekBar {
    private HashMap _$_findViewCache;
    private boolean isShowingTrack;
    private Paint mTrackPaint;

    public CameraHorizontalSeekBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public CameraHorizontalSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraHorizontalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FFE872"));
        paint.setStrokeWidth(ViewUtils.dp2px(1.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.mTrackPaint = paint;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CameraHorizontalSeekBar(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.camera.widgets.CameraHorizontalSeekBar.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final boolean isTouchInThumb(MotionEvent event, Rect thumbBounds) {
        float x = event.getX();
        float y = event.getY() - getPaddingTop();
        int thumbOffset = (thumbBounds.left - getThumbOffset()) + getPaddingLeft();
        return x >= ((float) thumbOffset) && x <= ((float) (thumbBounds.width() + thumbOffset)) && y >= ((float) (thumbBounds.top - getPaddingTop())) && y <= ((float) (thumbBounds.bottom + getPaddingBottom()));
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        Drawable thumb = getThumb();
        Intrinsics.checkExpressionValueIsNotNull(thumb, "thumb");
        Rect bounds = thumb.getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "thumb.bounds");
        boolean isTouchInThumb = isTouchInThumb(event, bounds);
        if (event.getAction() == 0 && !isTouchInThumb) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        Drawable thumb = getThumb();
        Intrinsics.checkExpressionValueIsNotNull(thumb, "thumb");
        int i = thumb.getBounds().left;
        Drawable thumb2 = getThumb();
        Intrinsics.checkExpressionValueIsNotNull(thumb2, "thumb");
        float width2 = (i - (thumb2.getBounds().width() / 2)) + getPaddingLeft();
        float f = 20;
        float f2 = width2 - f;
        Drawable thumb3 = getThumb();
        Intrinsics.checkExpressionValueIsNotNull(thumb3, "thumb");
        int i2 = thumb3.getBounds().left;
        Drawable thumb4 = getThumb();
        Intrinsics.checkExpressionValueIsNotNull(thumb4, "thumb");
        float width3 = i2 + (thumb4.getBounds().width() / 2) + getPaddingLeft() + f;
        float paddingTop = getPaddingTop();
        Drawable thumb5 = getThumb();
        Intrinsics.checkExpressionValueIsNotNull(thumb5, "thumb");
        float height = paddingTop + (thumb5.getBounds().height() / 2);
        if (this.isShowingTrack) {
            if (paddingLeft <= f2 && canvas != null) {
                canvas.drawLine(paddingLeft, height, f2, height, this.mTrackPaint);
            }
            if (width < width3 || canvas == null) {
                return;
            }
            canvas.drawLine(width3, height, width, height, this.mTrackPaint);
        }
    }

    public final void setTrackVisible(int visible) {
        if (visible == 0) {
            this.isShowingTrack = true;
        } else if (visible == 4 || visible == 8) {
            this.isShowingTrack = false;
        }
        invalidate();
    }
}
