package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class ShadowImageView extends PAGImageView {
    private RectF lMd;
    private Paint zp;

    public ShadowImageView(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        Paint paint = new Paint();
        this.zp = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.zp.setColor(Color.parseColor("#99333333"));
        this.zp.setAntiAlias(true);
        this.zp.setStrokeWidth(0.0f);
        this.lMd = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.lMd;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.zp);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.lMd.right != getMeasuredWidth() || this.lMd.bottom != getMeasuredHeight()) {
            this.lMd.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
