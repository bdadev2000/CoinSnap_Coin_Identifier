package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.zp.lMd.zp;

/* loaded from: classes.dex */
public class KVG {
    private jU Bj;
    private final float[] COT;
    private zp<PointF, PointF> HWF;
    private final Matrix KS;
    private zp<?, PointF> QR;
    private zp<Float, Float> YW;
    private zp<Integer, Integer> dT;
    private final Matrix jU;
    private zp<com.bytedance.adsdk.lottie.QR.KS, com.bytedance.adsdk.lottie.QR.KS> ku;
    private final Matrix lMd;
    private zp<?, Float> rV;
    private zp<?, Float> tG;
    private jU vDp;
    private final Matrix zp = new Matrix();

    public KVG(com.bytedance.adsdk.lottie.KS.zp.vDp vdp) {
        zp<PointF, PointF> zp;
        zp<PointF, PointF> zp2;
        zp<com.bytedance.adsdk.lottie.QR.KS, com.bytedance.adsdk.lottie.QR.KS> zp3;
        zp<Float, Float> zp4;
        jU jUVar;
        jU jUVar2;
        if (vdp.zp() == null) {
            zp = null;
        } else {
            zp = vdp.zp().zp();
        }
        this.HWF = zp;
        if (vdp.lMd() == null) {
            zp2 = null;
        } else {
            zp2 = vdp.lMd().zp();
        }
        this.QR = zp2;
        if (vdp.KS() == null) {
            zp3 = null;
        } else {
            zp3 = vdp.KS().zp();
        }
        this.ku = zp3;
        if (vdp.jU() == null) {
            zp4 = null;
        } else {
            zp4 = vdp.jU().zp();
        }
        this.YW = zp4;
        if (vdp.ku() == null) {
            jUVar = null;
        } else {
            jUVar = (jU) vdp.ku().zp();
        }
        this.Bj = jUVar;
        if (jUVar != null) {
            this.lMd = new Matrix();
            this.KS = new Matrix();
            this.jU = new Matrix();
            this.COT = new float[9];
        } else {
            this.lMd = null;
            this.KS = null;
            this.jU = null;
            this.COT = null;
        }
        if (vdp.YW() == null) {
            jUVar2 = null;
        } else {
            jUVar2 = (jU) vdp.YW().zp();
        }
        this.vDp = jUVar2;
        if (vdp.COT() != null) {
            this.dT = vdp.COT().zp();
        }
        if (vdp.HWF() != null) {
            this.tG = vdp.HWF().zp();
        } else {
            this.tG = null;
        }
        if (vdp.QR() != null) {
            this.rV = vdp.QR().zp();
        } else {
            this.rV = null;
        }
    }

    private void COT() {
        for (int i9 = 0; i9 < 9; i9++) {
            this.COT[i9] = 0.0f;
        }
    }

    public zp<?, Float> KS() {
        return this.rV;
    }

    public Matrix jU() {
        PointF QR;
        float cos;
        float sin;
        float YW;
        PointF QR2;
        this.zp.reset();
        zp<?, PointF> zpVar = this.QR;
        if (zpVar != null && (QR2 = zpVar.QR()) != null) {
            float f9 = QR2.x;
            if (f9 != 0.0f || QR2.y != 0.0f) {
                this.zp.preTranslate(f9, QR2.y);
            }
        }
        zp<Float, Float> zpVar2 = this.YW;
        if (zpVar2 != null) {
            if (zpVar2 instanceof woN) {
                YW = zpVar2.QR().floatValue();
            } else {
                YW = ((jU) zpVar2).YW();
            }
            if (YW != 0.0f) {
                this.zp.preRotate(YW);
            }
        }
        if (this.Bj != null) {
            if (this.vDp == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r3.YW()) + 90.0f));
            }
            if (this.vDp == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r5.YW()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r0.YW()));
            COT();
            float[] fArr = this.COT;
            fArr[0] = cos;
            fArr[1] = sin;
            float f10 = -sin;
            fArr[3] = f10;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.lMd.setValues(fArr);
            COT();
            float[] fArr2 = this.COT;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.KS.setValues(fArr2);
            COT();
            float[] fArr3 = this.COT;
            fArr3[0] = cos;
            fArr3[1] = f10;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.jU.setValues(fArr3);
            this.KS.preConcat(this.lMd);
            this.jU.preConcat(this.KS);
            this.zp.preConcat(this.jU);
        }
        zp<com.bytedance.adsdk.lottie.QR.KS, com.bytedance.adsdk.lottie.QR.KS> zpVar3 = this.ku;
        if (zpVar3 != null) {
            com.bytedance.adsdk.lottie.QR.KS QR3 = zpVar3.QR();
            if (QR3.zp() != 1.0f || QR3.lMd() != 1.0f) {
                this.zp.preScale(QR3.zp(), QR3.lMd());
            }
        }
        zp<PointF, PointF> zpVar4 = this.HWF;
        if (zpVar4 != null && (((QR = zpVar4.QR()) != null && QR.x != 0.0f) || QR.y != 0.0f)) {
            this.zp.preTranslate(-QR.x, -QR.y);
        }
        return this.zp;
    }

    public zp<?, Float> lMd() {
        return this.tG;
    }

    public void zp(com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        zpVar.zp(this.dT);
        zpVar.zp(this.tG);
        zpVar.zp(this.rV);
        zpVar.zp(this.HWF);
        zpVar.zp(this.QR);
        zpVar.zp(this.ku);
        zpVar.zp(this.YW);
        zpVar.zp(this.Bj);
        zpVar.zp(this.vDp);
    }

    public Matrix lMd(float f9) {
        zp<?, PointF> zpVar = this.QR;
        PointF QR = zpVar == null ? null : zpVar.QR();
        zp<com.bytedance.adsdk.lottie.QR.KS, com.bytedance.adsdk.lottie.QR.KS> zpVar2 = this.ku;
        com.bytedance.adsdk.lottie.QR.KS QR2 = zpVar2 == null ? null : zpVar2.QR();
        this.zp.reset();
        if (QR != null) {
            this.zp.preTranslate(QR.x * f9, QR.y * f9);
        }
        if (QR2 != null) {
            double d2 = f9;
            this.zp.preScale((float) Math.pow(QR2.zp(), d2), (float) Math.pow(QR2.lMd(), d2));
        }
        zp<Float, Float> zpVar3 = this.YW;
        if (zpVar3 != null) {
            float floatValue = zpVar3.QR().floatValue();
            zp<PointF, PointF> zpVar4 = this.HWF;
            PointF QR3 = zpVar4 != null ? zpVar4.QR() : null;
            this.zp.preRotate(floatValue * f9, QR3 == null ? 0.0f : QR3.x, QR3 != null ? QR3.y : 0.0f);
        }
        return this.zp;
    }

    public void zp(zp.InterfaceC0063zp interfaceC0063zp) {
        zp<Integer, Integer> zpVar = this.dT;
        if (zpVar != null) {
            zpVar.zp(interfaceC0063zp);
        }
        zp<?, Float> zpVar2 = this.tG;
        if (zpVar2 != null) {
            zpVar2.zp(interfaceC0063zp);
        }
        zp<?, Float> zpVar3 = this.rV;
        if (zpVar3 != null) {
            zpVar3.zp(interfaceC0063zp);
        }
        zp<PointF, PointF> zpVar4 = this.HWF;
        if (zpVar4 != null) {
            zpVar4.zp(interfaceC0063zp);
        }
        zp<?, PointF> zpVar5 = this.QR;
        if (zpVar5 != null) {
            zpVar5.zp(interfaceC0063zp);
        }
        zp<com.bytedance.adsdk.lottie.QR.KS, com.bytedance.adsdk.lottie.QR.KS> zpVar6 = this.ku;
        if (zpVar6 != null) {
            zpVar6.zp(interfaceC0063zp);
        }
        zp<Float, Float> zpVar7 = this.YW;
        if (zpVar7 != null) {
            zpVar7.zp(interfaceC0063zp);
        }
        jU jUVar = this.Bj;
        if (jUVar != null) {
            jUVar.zp(interfaceC0063zp);
        }
        jU jUVar2 = this.vDp;
        if (jUVar2 != null) {
            jUVar2.zp(interfaceC0063zp);
        }
    }

    public void zp(float f9) {
        zp<Integer, Integer> zpVar = this.dT;
        if (zpVar != null) {
            zpVar.zp(f9);
        }
        zp<?, Float> zpVar2 = this.tG;
        if (zpVar2 != null) {
            zpVar2.zp(f9);
        }
        zp<?, Float> zpVar3 = this.rV;
        if (zpVar3 != null) {
            zpVar3.zp(f9);
        }
        zp<PointF, PointF> zpVar4 = this.HWF;
        if (zpVar4 != null) {
            zpVar4.zp(f9);
        }
        zp<?, PointF> zpVar5 = this.QR;
        if (zpVar5 != null) {
            zpVar5.zp(f9);
        }
        zp<com.bytedance.adsdk.lottie.QR.KS, com.bytedance.adsdk.lottie.QR.KS> zpVar6 = this.ku;
        if (zpVar6 != null) {
            zpVar6.zp(f9);
        }
        zp<Float, Float> zpVar7 = this.YW;
        if (zpVar7 != null) {
            zpVar7.zp(f9);
        }
        jU jUVar = this.Bj;
        if (jUVar != null) {
            jUVar.zp(f9);
        }
        jU jUVar2 = this.vDp;
        if (jUVar2 != null) {
            jUVar2.zp(f9);
        }
    }

    public zp<?, Integer> zp() {
        return this.dT;
    }
}
