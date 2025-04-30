package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class TwoSemicirclesView extends View {
    private Paint COT;
    private float HWF;
    private int KS;
    private float QR;
    private final int YW;
    private Paint jU;
    private final int ku;
    private int lMd;
    private final RectF zp;

    public TwoSemicirclesView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.HWF = -90.0f;
        this.QR = 220.0f;
        this.ku = Color.parseColor("#FFFFFF");
        this.YW = Color.parseColor("#C4C4C4");
        zp();
        float f9 = this.QR;
        this.zp = new RectF(-f9, -f9, f9, f9);
    }

    private void zp() {
        Paint paint = new Paint();
        this.jU = paint;
        paint.setColor(this.ku);
        this.jU.setStyle(Paint.Style.STROKE);
        this.jU.setStrokeWidth(4.0f);
        this.jU.setAlpha(20);
        Paint paint2 = new Paint(this.jU);
        this.COT = paint2;
        paint2.setColor(this.YW);
        this.COT.setAlpha(255);
    }

    public Paint getPaintOne() {
        return this.jU;
    }

    public Paint getPaintTwo() {
        return this.COT;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.zp;
        float f9 = this.QR;
        rectF.set(-f9, -f9, f9, f9);
        canvas.translate(this.lMd / 2, this.KS / 2);
        canvas.drawArc(this.zp, this.HWF, 180.0f, false, this.jU);
        canvas.drawArc(this.zp, this.HWF + 180.0f, 180.0f, false, this.COT);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.lMd = i9;
        this.KS = i10;
    }

    public void setCurrentStartAngle(float f9) {
        this.HWF = f9;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.jU = paint;
        postInvalidate();
    }

    public void setPaintTwo(Paint paint) {
        this.COT = paint;
        postInvalidate();
    }

    public void setRadius(float f9) {
        this.QR = f9;
        postInvalidate();
    }
}
