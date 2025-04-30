package com.bytedance.adsdk.ugeno.component.dislike;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.adsdk.ugeno.lMd;

/* loaded from: classes.dex */
public class DislikeView extends View {
    private Paint COT;
    private Paint HWF;
    private int KS;
    private float QR;
    private int YW;
    private RectF jU;
    private Paint ku;
    private int lMd;
    private lMd zp;

    public DislikeView(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        Paint paint = new Paint();
        this.COT = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.ku = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.HWF = paint3;
        paint3.setAntiAlias(true);
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.QR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(0);
        RectF rectF = this.jU;
        float f9 = this.QR;
        canvas.drawRoundRect(rectF, f9, f9, this.HWF);
        RectF rectF2 = this.jU;
        float f10 = this.QR;
        canvas.drawRoundRect(rectF2, f10, f10, this.COT);
        int i9 = this.lMd;
        int i10 = this.KS;
        canvas.drawLine(i9 * 0.3f, i10 * 0.3f, i9 * 0.7f, i10 * 0.7f, this.ku);
        int i11 = this.lMd;
        int i12 = this.KS;
        canvas.drawLine(i11 * 0.7f, i12 * 0.3f, i11 * 0.3f, i12 * 0.7f, this.ku);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.lMd = i9;
        this.KS = i10;
        int i13 = this.YW;
        this.jU = new RectF(i13, i13, this.lMd - i13, this.KS - i13);
    }

    public void setBgColor(int i9) {
        this.HWF.setStyle(Paint.Style.FILL);
        this.HWF.setColor(i9);
    }

    public void setDislikeColor(int i9) {
        this.ku.setColor(i9);
    }

    public void setDislikeWidth(int i9) {
        this.ku.setStrokeWidth(i9);
    }

    public void setRadius(float f9) {
        this.QR = f9;
    }

    public void setStrokeColor(int i9) {
        this.COT.setStyle(Paint.Style.STROKE);
        this.COT.setColor(i9);
    }

    public void setStrokeWidth(int i9) {
        this.COT.setStrokeWidth(i9);
        this.YW = i9;
    }

    public void zp(com.bytedance.adsdk.ugeno.component.lMd lmd) {
        this.zp = lmd;
    }
}
