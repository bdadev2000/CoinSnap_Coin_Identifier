package com.bytedance.sdk.component.adexpress.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class ShadowImageView extends ImageView {
    private RectF lMd;
    private Paint zp;

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.lMd;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.zp);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.lMd.right != getMeasuredWidth() || this.lMd.bottom != getMeasuredHeight()) {
            this.lMd.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
