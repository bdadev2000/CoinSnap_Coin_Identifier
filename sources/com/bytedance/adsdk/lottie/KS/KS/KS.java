package com.bytedance.adsdk.lottie.KS.KS;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.YW;

/* loaded from: classes.dex */
public class KS extends zp {
    private com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> Bj;
    private final Paint QR;
    private final Rect YW;
    private final YW dT;
    private final Rect ku;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Bitmap, Bitmap> vDp;

    public KS(com.bytedance.adsdk.lottie.ku kuVar, jU jUVar) {
        super(kuVar, jUVar);
        this.QR = new com.bytedance.adsdk.lottie.zp.zp(3);
        this.ku = new Rect();
        this.YW = new Rect();
        this.dT = kuVar.HWF(jUVar.QR());
    }

    private Bitmap ku() {
        Bitmap QR;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Bitmap, Bitmap> zpVar = this.vDp;
        if (zpVar != null && (QR = zpVar.QR()) != null) {
            return QR;
        }
        Bitmap COT = this.lMd.COT(this.KS.QR());
        if (COT != null) {
            return COT;
        }
        YW yw = this.dT;
        if (yw != null) {
            return yw.HWF();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public void lMd(Canvas canvas, Matrix matrix, int i9) {
        Bitmap ku = ku();
        if (ku != null && !ku.isRecycled() && this.dT != null) {
            float zp = com.bytedance.adsdk.lottie.HWF.HWF.zp();
            this.QR.setAlpha(i9);
            com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> zpVar = this.Bj;
            if (zpVar != null) {
                this.QR.setColorFilter(zpVar.QR());
            }
            canvas.save();
            canvas.concat(matrix);
            this.ku.set(0, 0, ku.getWidth(), ku.getHeight());
            if (this.lMd.jU()) {
                this.YW.set(0, 0, (int) (this.dT.zp() * zp), (int) (this.dT.lMd() * zp));
            } else {
                this.YW.set(0, 0, (int) (ku.getWidth() * zp), (int) (ku.getHeight() * zp));
            }
            canvas.drawBitmap(ku, this.ku, this.YW, this.QR);
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp, com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        super.zp(rectF, matrix, z8);
        if (this.dT != null) {
            float zp = com.bytedance.adsdk.lottie.HWF.HWF.zp();
            rectF.set(0.0f, 0.0f, this.dT.zp() * zp, this.dT.lMd() * zp);
            this.zp.mapRect(rectF);
        }
    }
}
