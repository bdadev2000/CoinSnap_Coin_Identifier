package com.bytedance.sdk.component.adexpress.vc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class NjR extends View {
    private Paint AlY;
    private Paint DSW;
    private int Sg;
    private int YFl;
    private int qsH;
    private final RectF tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10410vc;
    private Paint wN;

    public NjR(Context context) {
        super(context);
        this.tN = new RectF();
        YFl();
    }

    private void YFl() {
        Paint paint = new Paint();
        this.AlY = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.DSW = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.wN = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.tN;
        int i10 = this.f10410vc;
        canvas.drawRoundRect(rectF, i10, i10, this.wN);
        RectF rectF2 = this.tN;
        int i11 = this.f10410vc;
        canvas.drawRoundRect(rectF2, i11, i11, this.AlY);
        int i12 = this.YFl;
        int i13 = this.Sg;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.DSW);
        int i14 = this.YFl;
        int i15 = this.Sg;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.DSW);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.YFl = i10;
        this.Sg = i11;
        RectF rectF = this.tN;
        int i14 = this.qsH;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.wN.setStyle(Paint.Style.FILL);
        this.wN.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.DSW.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.DSW.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.f10410vc = i10;
    }

    public void setStrokeColor(int i10) {
        this.AlY.setStyle(Paint.Style.STROKE);
        this.AlY.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.AlY.setStrokeWidth(i10);
        this.qsH = i10;
    }
}
