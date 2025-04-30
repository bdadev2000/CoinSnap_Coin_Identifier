package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ku implements zp.InterfaceC0063zp, Bj, COT {
    private final com.bytedance.adsdk.lottie.KS.lMd.QR Bj;
    private com.bytedance.adsdk.lottie.zp.lMd.KS FP;
    private final boolean KS;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> KVG;
    private final Path QR;
    private final RectF YW;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> cz;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> dQp;
    private final List<tG> dT;
    private final com.bytedance.adsdk.lottie.KS.KS.zp jU;
    private final Paint ku;
    private final String lMd;
    private final int pvr;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> rV;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> tG;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<com.bytedance.adsdk.lottie.KS.lMd.jU, com.bytedance.adsdk.lottie.KS.lMd.jU> vDp;
    private final com.bytedance.adsdk.lottie.ku vwr;
    private com.bytedance.adsdk.lottie.zp.lMd.woN woN;
    float zp;
    private final LongSparseArray<LinearGradient> COT = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> HWF = new LongSparseArray<>();

    public ku(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.COT cot) {
        Path path = new Path();
        this.QR = path;
        this.ku = new com.bytedance.adsdk.lottie.zp.zp(1);
        this.YW = new RectF();
        this.dT = new ArrayList();
        this.zp = 0.0f;
        this.jU = zpVar;
        this.lMd = cot.zp();
        this.KS = cot.ku();
        this.vwr = kuVar;
        this.Bj = cot.lMd();
        path.setFillType(cot.KS());
        this.pvr = (int) (hwf.COT() / 32.0f);
        com.bytedance.adsdk.lottie.zp.lMd.zp<com.bytedance.adsdk.lottie.KS.lMd.jU, com.bytedance.adsdk.lottie.KS.lMd.jU> zp = cot.jU().zp();
        this.vDp = zp;
        zp.zp(this);
        zpVar.zp(zp);
        com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zp2 = cot.COT().zp();
        this.tG = zp2;
        zp2.zp(this);
        zpVar.zp(zp2);
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp3 = cot.HWF().zp();
        this.rV = zp3;
        zp3.zp(this);
        zpVar.zp(zp3);
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp4 = cot.QR().zp();
        this.dQp = zp4;
        zp4.zp(this);
        zpVar.zp(zp4);
        if (zpVar.HWF() != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp5 = zpVar.HWF().zp().zp();
            this.cz = zp5;
            zp5.zp(this);
            zpVar.zp(this.cz);
        }
        if (zpVar.QR() != null) {
            this.FP = new com.bytedance.adsdk.lottie.zp.lMd.KS(this, zpVar, zpVar.QR());
        }
    }

    private RadialGradient KS() {
        long jU = jU();
        RadialGradient radialGradient = this.HWF.get(jU);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF QR = this.rV.QR();
        PointF QR2 = this.dQp.QR();
        com.bytedance.adsdk.lottie.KS.lMd.jU QR3 = this.vDp.QR();
        int[] zp = zp(QR3.lMd());
        float[] zp2 = QR3.zp();
        float f9 = QR.x;
        float f10 = QR.y;
        float hypot = (float) Math.hypot(QR2.x - f9, QR2.y - f10);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f9, f10, hypot, zp, zp2, Shader.TileMode.CLAMP);
        this.HWF.put(jU, radialGradient2);
        return radialGradient2;
    }

    private int jU() {
        int i9;
        int round = Math.round(this.rV.ku() * this.pvr);
        int round2 = Math.round(this.dQp.ku() * this.pvr);
        int round3 = Math.round(this.vDp.ku() * this.pvr);
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
        LinearGradient linearGradient = this.COT.get(jU);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF QR = this.rV.QR();
        PointF QR2 = this.dQp.QR();
        com.bytedance.adsdk.lottie.KS.lMd.jU QR3 = this.vDp.QR();
        LinearGradient linearGradient2 = new LinearGradient(QR.x, QR.y, QR2.x, QR2.y, zp(QR3.lMd()), QR3.zp(), Shader.TileMode.CLAMP);
        this.COT.put(jU, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        this.vwr.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        for (int i9 = 0; i9 < list2.size(); i9++) {
            KS ks = list2.get(i9);
            if (ks instanceof tG) {
                this.dT.add((tG) ks);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(Canvas canvas, Matrix matrix, int i9) {
        Shader KS;
        if (this.KS) {
            return;
        }
        com.bytedance.adsdk.lottie.COT.zp("GradientFillContent#draw");
        this.QR.reset();
        for (int i10 = 0; i10 < this.dT.size(); i10++) {
            this.QR.addPath(this.dT.get(i10).jU(), matrix);
        }
        this.QR.computeBounds(this.YW, false);
        if (this.Bj == com.bytedance.adsdk.lottie.KS.lMd.QR.LINEAR) {
            KS = lMd();
        } else {
            KS = KS();
        }
        KS.setLocalMatrix(matrix);
        this.ku.setShader(KS);
        com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> zpVar = this.KVG;
        if (zpVar != null) {
            this.ku.setColorFilter(zpVar.QR());
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zpVar2 = this.cz;
        if (zpVar2 != null) {
            float floatValue = zpVar2.QR().floatValue();
            if (floatValue == 0.0f) {
                this.ku.setMaskFilter(null);
            } else if (floatValue != this.zp) {
                this.ku.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.zp = floatValue;
        }
        com.bytedance.adsdk.lottie.zp.lMd.KS ks = this.FP;
        if (ks != null) {
            ks.zp(this.ku);
        }
        this.ku.setAlpha(com.bytedance.adsdk.lottie.HWF.COT.zp((int) ((((i9 / 255.0f) * this.tG.QR().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.QR, this.ku);
        com.bytedance.adsdk.lottie.COT.lMd("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        this.QR.reset();
        for (int i9 = 0; i9 < this.dT.size(); i9++) {
            this.QR.addPath(this.dT.get(i9).jU(), matrix);
        }
        this.QR.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] zp(int[] iArr) {
        if (this.woN == null) {
            return iArr;
        }
        throw null;
    }
}
