package com.glority.widget.wheelpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.glority.widget.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlWheelPickerLayout.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0015R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/widget/wheelpicker/GlWheelPickerLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bg", "Landroid/graphics/drawable/Drawable;", "bgHeight", "", "bgPaint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/Rect;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlWheelPickerLayout extends LinearLayout {
    private final Drawable bg;
    private final int bgHeight;
    private final Paint bgPaint;
    private final Rect rect;

    public GlWheelPickerLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlWheelPickerLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.wheelpicker.GlWheelPickerLayout.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlWheelPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgPaint = new Paint(69);
        this.bg = ActivityCompat.getDrawable(context, R.drawable.gl_gray_bg_conner8);
        this.rect = new Rect();
        setOrientation(0);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GlWheelPickerLayout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…able.GlWheelPickerLayout)");
        this.bgHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.GlWheelPickerLayout_wheel_selected_bg_height, context.getResources().getDimensionPixelOffset(R.dimen.x72));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.bg != null) {
            getDrawingRect(this.rect);
            canvas.drawBitmap(DrawableKt.toBitmap$default(this.bg, this.rect.width(), this.bgHeight, null, 4, null), new Rect(0, 0, this.rect.width(), this.bgHeight), new Rect(0, this.rect.centerY() - (this.bgHeight / 2), this.rect.width(), this.rect.centerY() + (this.bgHeight / 2)), this.bgPaint);
        }
        super.onDraw(canvas);
    }
}
