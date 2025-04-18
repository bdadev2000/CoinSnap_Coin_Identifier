package com.bytedance.adsdk.Sg.tN.tN;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class qsH extends YFl {
    private final RectF DSW;
    private final float[] NjR;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> YoT;
    private final wN eT;

    /* renamed from: nc, reason: collision with root package name */
    private final Path f10208nc;
    private final Paint qsH;

    public qsH(com.bytedance.adsdk.Sg.NjR njR, wN wNVar) {
        super(njR, wNVar);
        this.DSW = new RectF();
        com.bytedance.adsdk.Sg.YFl.YFl yFl = new com.bytedance.adsdk.Sg.YFl.YFl();
        this.qsH = yFl;
        this.NjR = new float[8];
        this.f10208nc = new Path();
        this.eT = wNVar;
        yFl.setAlpha(0);
        yFl.setStyle(Paint.Style.FILL);
        yFl.setColor(wNVar.rkt());
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        int intValue;
        super.Sg(canvas, matrix, i10);
        int alpha = Color.alpha(this.eT.rkt());
        if (alpha == 0) {
            return;
        }
        if (this.AlY.YFl() == null) {
            intValue = 100;
        } else {
            intValue = this.AlY.YFl().DSW().intValue();
        }
        int i11 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i10 / 255.0f) * 255.0f);
        this.qsH.setAlpha(i11);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> yFl = this.YoT;
        if (yFl != null) {
            this.qsH.setColorFilter(yFl.DSW());
        }
        if (i11 > 0) {
            float[] fArr = this.NjR;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.eT.Wwa();
            float[] fArr2 = this.NjR;
            fArr2[3] = 0.0f;
            fArr2[4] = this.eT.Wwa();
            this.NjR[5] = this.eT.lG();
            float[] fArr3 = this.NjR;
            fArr3[6] = 0.0f;
            fArr3[7] = this.eT.lG();
            matrix.mapPoints(this.NjR);
            this.f10208nc.reset();
            Path path = this.f10208nc;
            float[] fArr4 = this.NjR;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f10208nc;
            float[] fArr5 = this.NjR;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f10208nc;
            float[] fArr6 = this.NjR;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f10208nc;
            float[] fArr7 = this.NjR;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f10208nc;
            float[] fArr8 = this.NjR;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f10208nc.close();
            canvas.drawPath(this.f10208nc, this.qsH);
        }
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        super.YFl(rectF, matrix, z10);
        this.DSW.set(0.0f, 0.0f, this.eT.Wwa(), this.eT.lG());
        this.YFl.mapRect(this.DSW);
        rectF.set(this.DSW);
    }
}
