package com.bytedance.adsdk.lottie.KS.KS;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class QR extends zp {
    private final jU Bj;
    private final RectF QR;
    private final float[] YW;
    private final Path dT;
    private final Paint ku;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> vDp;

    public QR(com.bytedance.adsdk.lottie.ku kuVar, jU jUVar) {
        super(kuVar, jUVar);
        this.QR = new RectF();
        com.bytedance.adsdk.lottie.zp.zp zpVar = new com.bytedance.adsdk.lottie.zp.zp();
        this.ku = zpVar;
        this.YW = new float[8];
        this.dT = new Path();
        this.Bj = jUVar;
        zpVar.setAlpha(0);
        zpVar.setStyle(Paint.Style.FILL);
        zpVar.setColor(jUVar.KVG());
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public void lMd(Canvas canvas, Matrix matrix, int i9) {
        int intValue;
        int alpha = Color.alpha(this.Bj.KVG());
        if (alpha == 0) {
            return;
        }
        if (this.jU.zp() == null) {
            intValue = 100;
        } else {
            intValue = this.jU.zp().QR().intValue();
        }
        int i10 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i9 / 255.0f) * 255.0f);
        this.ku.setAlpha(i10);
        com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> zpVar = this.vDp;
        if (zpVar != null) {
            this.ku.setColorFilter(zpVar.QR());
        }
        if (i10 > 0) {
            float[] fArr = this.YW;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.Bj.vwr();
            float[] fArr2 = this.YW;
            fArr2[3] = 0.0f;
            fArr2[4] = this.Bj.vwr();
            this.YW[5] = this.Bj.woN();
            float[] fArr3 = this.YW;
            fArr3[6] = 0.0f;
            fArr3[7] = this.Bj.woN();
            matrix.mapPoints(this.YW);
            this.dT.reset();
            Path path = this.dT;
            float[] fArr4 = this.YW;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.dT;
            float[] fArr5 = this.YW;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.dT;
            float[] fArr6 = this.YW;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.dT;
            float[] fArr7 = this.YW;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.dT;
            float[] fArr8 = this.YW;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.dT.close();
            canvas.drawPath(this.dT, this.ku);
        }
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp, com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        super.zp(rectF, matrix, z8);
        this.QR.set(0.0f, 0.0f, this.Bj.vwr(), this.Bj.woN());
        this.zp.mapRect(this.QR);
        rectF.set(this.QR);
    }
}
