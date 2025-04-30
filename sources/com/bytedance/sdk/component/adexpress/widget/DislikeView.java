package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class DislikeView extends View {
    private Paint COT;
    private int HWF;
    private final RectF KS;
    private Paint QR;
    private Paint jU;
    private int ku;
    private int lMd;
    private int zp;

    public DislikeView(Context context) {
        super(context);
        this.KS = new RectF();
        zp();
    }

    private void zp() {
        Paint paint = new Paint();
        this.jU = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.QR = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.COT = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.KS;
        int i9 = this.HWF;
        canvas.drawRoundRect(rectF, i9, i9, this.COT);
        RectF rectF2 = this.KS;
        int i10 = this.HWF;
        canvas.drawRoundRect(rectF2, i10, i10, this.jU);
        int i11 = this.zp;
        int i12 = this.lMd;
        canvas.drawLine(i11 * 0.3f, i12 * 0.3f, i11 * 0.7f, i12 * 0.7f, this.QR);
        int i13 = this.zp;
        int i14 = this.lMd;
        canvas.drawLine(i13 * 0.7f, i14 * 0.3f, i13 * 0.3f, i14 * 0.7f, this.QR);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.zp = i9;
        this.lMd = i10;
        RectF rectF = this.KS;
        int i13 = this.ku;
        rectF.set(i13, i13, i9 - i13, i10 - i13);
    }

    public void setBgColor(int i9) {
        this.COT.setStyle(Paint.Style.FILL);
        this.COT.setColor(i9);
    }

    public void setDislikeColor(int i9) {
        this.QR.setColor(i9);
    }

    public void setDislikeWidth(int i9) {
        this.QR.setStrokeWidth(i9);
    }

    public void setRadius(int i9) {
        this.HWF = i9;
    }

    public void setStrokeColor(int i9) {
        this.jU.setStyle(Paint.Style.STROKE);
        this.jU.setColor(i9);
    }

    public void setStrokeWidth(int i9) {
        this.jU.setStrokeWidth(i9);
        this.ku = i9;
    }
}
