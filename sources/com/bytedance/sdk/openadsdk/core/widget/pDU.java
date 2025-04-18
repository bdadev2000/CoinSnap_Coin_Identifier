package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class pDU extends com.bytedance.sdk.openadsdk.core.wN.AlY {
    private RectF Sg;
    private Paint YFl;

    public pDU(Context context) {
        super(context);
        YFl();
    }

    private void YFl() {
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.YFl.setColor(Color.parseColor("#99333333"));
        this.YFl.setAntiAlias(true);
        this.YFl.setStrokeWidth(0.0f);
        this.Sg = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.Sg;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.YFl);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wN.AlY, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.Sg.right != getMeasuredWidth() || this.Sg.bottom != getMeasuredHeight()) {
            this.Sg.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
