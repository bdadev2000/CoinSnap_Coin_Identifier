package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class QR implements zp.InterfaceC0063zp, Bj, COT {
    private final com.bytedance.adsdk.lottie.ku Bj;
    private final String COT;
    private final boolean HWF;
    private final Paint KS;
    private final List<tG> QR;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> YW;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> dT;
    private final com.bytedance.adsdk.lottie.KS.KS.zp jU;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> ku;
    private final Path lMd;
    private com.bytedance.adsdk.lottie.zp.lMd.KS tG;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> vDp;
    float zp;

    public QR(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.dQp dqp) {
        Path path = new Path();
        this.lMd = path;
        this.KS = new com.bytedance.adsdk.lottie.zp.zp(1);
        this.QR = new ArrayList();
        this.jU = zpVar;
        this.COT = dqp.zp();
        this.HWF = dqp.COT();
        this.Bj = kuVar;
        if (zpVar.HWF() != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp = zpVar.HWF().zp().zp();
            this.vDp = zp;
            zp.zp(this);
            zpVar.zp(this.vDp);
        }
        if (zpVar.QR() != null) {
            this.tG = new com.bytedance.adsdk.lottie.zp.lMd.KS(this, zpVar, zpVar.QR());
        }
        if (dqp.lMd() != null && dqp.KS() != null) {
            path.setFillType(dqp.jU());
            com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zp2 = dqp.lMd().zp();
            this.ku = zp2;
            zp2.zp(this);
            zpVar.zp(zp2);
            com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zp3 = dqp.KS().zp();
            this.YW = zp3;
            zp3.zp(this);
            zpVar.zp(zp3);
            return;
        }
        this.ku = null;
        this.YW = null;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        this.Bj.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        for (int i9 = 0; i9 < list2.size(); i9++) {
            KS ks = list2.get(i9);
            if (ks instanceof tG) {
                this.QR.add((tG) ks);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(Canvas canvas, Matrix matrix, int i9) {
        if (this.HWF) {
            return;
        }
        com.bytedance.adsdk.lottie.COT.zp("FillContent#draw");
        this.KS.setColor((com.bytedance.adsdk.lottie.HWF.COT.zp((int) ((((i9 / 255.0f) * this.YW.QR().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.lottie.zp.lMd.lMd) this.ku).YW() & ViewCompat.MEASURED_SIZE_MASK));
        com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> zpVar = this.dT;
        if (zpVar != null) {
            this.KS.setColorFilter(zpVar.QR());
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zpVar2 = this.vDp;
        if (zpVar2 != null) {
            float floatValue = zpVar2.QR().floatValue();
            if (floatValue == 0.0f) {
                this.KS.setMaskFilter(null);
            } else if (floatValue != this.zp) {
                this.KS.setMaskFilter(this.jU.lMd(floatValue));
            }
            this.zp = floatValue;
        }
        com.bytedance.adsdk.lottie.zp.lMd.KS ks = this.tG;
        if (ks != null) {
            ks.zp(this.KS);
        }
        this.lMd.reset();
        for (int i10 = 0; i10 < this.QR.size(); i10++) {
            this.lMd.addPath(this.QR.get(i10).jU(), matrix);
        }
        canvas.drawPath(this.lMd, this.KS);
        com.bytedance.adsdk.lottie.COT.lMd("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        this.lMd.reset();
        for (int i9 = 0; i9 < this.QR.size(); i9++) {
            this.lMd.addPath(this.QR.get(i9).jU(), matrix);
        }
        this.lMd.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
