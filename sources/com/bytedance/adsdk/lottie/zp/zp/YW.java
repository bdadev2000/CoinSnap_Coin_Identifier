package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* loaded from: classes.dex */
public class YW extends zp {
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<com.bytedance.adsdk.lottie.KS.lMd.jU, com.bytedance.adsdk.lottie.KS.lMd.jU> Bj;
    private final boolean COT;
    private final LongSparseArray<LinearGradient> HWF;
    private final LongSparseArray<RadialGradient> QR;
    private final com.bytedance.adsdk.lottie.KS.lMd.QR YW;
    private final int dT;
    private final String jU;
    private final RectF ku;
    private com.bytedance.adsdk.lottie.zp.lMd.woN rV;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> tG;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> vDp;

    public YW(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.HWF hwf) {
        super(kuVar, zpVar, hwf.ku().zp(), hwf.YW().zp(), hwf.vDp(), hwf.jU(), hwf.QR(), hwf.dT(), hwf.Bj());
        this.HWF = new LongSparseArray<>();
        this.QR = new LongSparseArray<>();
        this.ku = new RectF();
        this.jU = hwf.zp();
        this.YW = hwf.lMd();
        this.COT = hwf.tG();
        this.dT = (int) (kuVar.ot().COT() / 32.0f);
        com.bytedance.adsdk.lottie.zp.lMd.zp<com.bytedance.adsdk.lottie.KS.lMd.jU, com.bytedance.adsdk.lottie.KS.lMd.jU> zp = hwf.KS().zp();
        this.Bj = zp;
        zp.zp(this);
        zpVar.zp(zp);
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp2 = hwf.COT().zp();
        this.vDp = zp2;
        zp2.zp(this);
        zpVar.zp(zp2);
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp3 = hwf.HWF().zp();
        this.tG = zp3;
        zp3.zp(this);
        zpVar.zp(zp3);
    }

    private RadialGradient KS() {
        long jU = jU();
        RadialGradient radialGradient = this.QR.get(jU);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF QR = this.vDp.QR();
        PointF QR2 = this.tG.QR();
        com.bytedance.adsdk.lottie.KS.lMd.jU QR3 = this.Bj.QR();
        int[] zp = zp(QR3.lMd());
        float[] zp2 = QR3.zp();
        RadialGradient radialGradient2 = new RadialGradient(QR.x, QR.y, (float) Math.hypot(QR2.x - r7, QR2.y - r8), zp, zp2, Shader.TileMode.CLAMP);
        this.QR.put(jU, radialGradient2);
        return radialGradient2;
    }

    private int jU() {
        int i9;
        int round = Math.round(this.vDp.ku() * this.dT);
        int round2 = Math.round(this.tG.ku() * this.dT);
        int round3 = Math.round(this.Bj.ku() * this.dT);
        if (round != 0) {
            i9 = round * 527;
        } else {
            i9 = 17;
        }
        if (round2 != 0) {
            i9 = i9 * 31 * round2;
        }
        if (round3 != 0) {
            return i9 * 31 * round3;
        }
        return i9;
    }

    private LinearGradient lMd() {
        long jU = jU();
        LinearGradient linearGradient = this.HWF.get(jU);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF QR = this.vDp.QR();
        PointF QR2 = this.tG.QR();
        com.bytedance.adsdk.lottie.KS.lMd.jU QR3 = this.Bj.QR();
        LinearGradient linearGradient2 = new LinearGradient(QR.x, QR.y, QR2.x, QR2.y, zp(QR3.lMd()), QR3.zp(), Shader.TileMode.CLAMP);
        this.HWF.put(jU, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.zp, com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(Canvas canvas, Matrix matrix, int i9) {
        Shader KS;
        if (this.COT) {
            return;
        }
        zp(this.ku, matrix, false);
        if (this.YW == com.bytedance.adsdk.lottie.KS.lMd.QR.LINEAR) {
            KS = lMd();
        } else {
            KS = KS();
        }
        KS.setLocalMatrix(matrix);
        this.lMd.setShader(KS);
        super.zp(canvas, matrix, i9);
    }

    private int[] zp(int[] iArr) {
        if (this.rV == null) {
            return iArr;
        }
        throw null;
    }
}
