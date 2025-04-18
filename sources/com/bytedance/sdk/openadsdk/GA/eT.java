package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
public class eT extends View {
    private float Sg;
    private final Paint YFl;
    private float tN;

    public eT(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.tN;
        if (f10 > 0.0f) {
            float f11 = this.Sg;
            canvas.drawLine(0.0f, f11, f10, f11, this.YFl);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i11;
        this.Sg = (1.0f * f10) / 2.0f;
        this.YFl.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.tN = getWidth() * f10;
        invalidate();
    }
}
