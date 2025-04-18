package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;

/* loaded from: classes.dex */
public class rkt {
    private final Matrix AlY;
    private YFl<?, PointF> DSW;
    private YFl<?, Float> GA;
    private YFl<Float, Float> NjR;
    private final Matrix Sg;
    private final Matrix YFl = new Matrix();
    private AlY YoT;
    private AlY eT;

    /* renamed from: nc, reason: collision with root package name */
    private YFl<Integer, Integer> f10160nc;
    private YFl<?, Float> pDU;
    private YFl<com.bytedance.adsdk.Sg.DSW.tN, com.bytedance.adsdk.Sg.DSW.tN> qsH;
    private final Matrix tN;

    /* renamed from: vc, reason: collision with root package name */
    private YFl<PointF, PointF> f10161vc;
    private final float[] wN;

    public rkt(com.bytedance.adsdk.Sg.tN.YFl.YoT yoT) {
        YFl<PointF, PointF> YFl;
        YFl<PointF, PointF> YFl2;
        YFl<com.bytedance.adsdk.Sg.DSW.tN, com.bytedance.adsdk.Sg.DSW.tN> YFl3;
        YFl<Float, Float> YFl4;
        AlY alY;
        AlY alY2;
        if (yoT.YFl() == null) {
            YFl = null;
        } else {
            YFl = yoT.YFl().YFl();
        }
        this.f10161vc = YFl;
        if (yoT.Sg() == null) {
            YFl2 = null;
        } else {
            YFl2 = yoT.Sg().YFl();
        }
        this.DSW = YFl2;
        if (yoT.tN() == null) {
            YFl3 = null;
        } else {
            YFl3 = yoT.tN().YFl();
        }
        this.qsH = YFl3;
        if (yoT.AlY() == null) {
            YFl4 = null;
        } else {
            YFl4 = yoT.AlY().YFl();
        }
        this.NjR = YFl4;
        if (yoT.qsH() == null) {
            alY = null;
        } else {
            alY = (AlY) yoT.qsH().YFl();
        }
        this.eT = alY;
        if (alY != null) {
            this.Sg = new Matrix();
            this.tN = new Matrix();
            this.AlY = new Matrix();
            this.wN = new float[9];
        } else {
            this.Sg = null;
            this.tN = null;
            this.AlY = null;
            this.wN = null;
        }
        if (yoT.NjR() == null) {
            alY2 = null;
        } else {
            alY2 = (AlY) yoT.NjR().YFl();
        }
        this.YoT = alY2;
        if (yoT.wN() != null) {
            this.f10160nc = yoT.wN().YFl();
        }
        if (yoT.vc() != null) {
            this.GA = yoT.vc().YFl();
        } else {
            this.GA = null;
        }
        if (yoT.DSW() != null) {
            this.pDU = yoT.DSW().YFl();
        } else {
            this.pDU = null;
        }
    }

    private void wN() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.wN[i10] = 0.0f;
        }
    }

    public Matrix AlY() {
        PointF DSW;
        float cos;
        float sin;
        float NjR;
        PointF DSW2;
        this.YFl.reset();
        YFl<?, PointF> yFl = this.DSW;
        if (yFl != null && (DSW2 = yFl.DSW()) != null) {
            float f10 = DSW2.x;
            if (f10 != 0.0f || DSW2.y != 0.0f) {
                this.YFl.preTranslate(f10, DSW2.y);
            }
        }
        YFl<Float, Float> yFl2 = this.NjR;
        if (yFl2 != null) {
            if (yFl2 instanceof lG) {
                NjR = yFl2.DSW().floatValue();
            } else {
                NjR = ((AlY) yFl2).NjR();
            }
            if (NjR != 0.0f) {
                this.YFl.preRotate(NjR);
            }
        }
        if (this.eT != null) {
            if (this.YoT == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r3.NjR()) + 90.0f));
            }
            if (this.YoT == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r5.NjR()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r0.NjR()));
            wN();
            float[] fArr = this.wN;
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.Sg.setValues(fArr);
            wN();
            float[] fArr2 = this.wN;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.tN.setValues(fArr2);
            wN();
            float[] fArr3 = this.wN;
            fArr3[0] = cos;
            fArr3[1] = f11;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.AlY.setValues(fArr3);
            this.tN.preConcat(this.Sg);
            this.AlY.preConcat(this.tN);
            this.YFl.preConcat(this.AlY);
        }
        YFl<com.bytedance.adsdk.Sg.DSW.tN, com.bytedance.adsdk.Sg.DSW.tN> yFl3 = this.qsH;
        if (yFl3 != null) {
            com.bytedance.adsdk.Sg.DSW.tN DSW3 = yFl3.DSW();
            if (DSW3.YFl() != 1.0f || DSW3.Sg() != 1.0f) {
                this.YFl.preScale(DSW3.YFl(), DSW3.Sg());
            }
        }
        YFl<PointF, PointF> yFl4 = this.f10161vc;
        if (yFl4 != null && (((DSW = yFl4.DSW()) != null && DSW.x != 0.0f) || DSW.y != 0.0f)) {
            this.YFl.preTranslate(-DSW.x, -DSW.y);
        }
        return this.YFl;
    }

    public YFl<?, Float> Sg() {
        return this.GA;
    }

    public void YFl(com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        yFl.YFl(this.f10160nc);
        yFl.YFl(this.GA);
        yFl.YFl(this.pDU);
        yFl.YFl(this.f10161vc);
        yFl.YFl(this.DSW);
        yFl.YFl(this.qsH);
        yFl.YFl(this.NjR);
        yFl.YFl(this.eT);
        yFl.YFl(this.YoT);
    }

    public YFl<?, Float> tN() {
        return this.pDU;
    }

    public Matrix Sg(float f10) {
        YFl<?, PointF> yFl = this.DSW;
        PointF DSW = yFl == null ? null : yFl.DSW();
        YFl<com.bytedance.adsdk.Sg.DSW.tN, com.bytedance.adsdk.Sg.DSW.tN> yFl2 = this.qsH;
        com.bytedance.adsdk.Sg.DSW.tN DSW2 = yFl2 == null ? null : yFl2.DSW();
        this.YFl.reset();
        if (DSW != null) {
            this.YFl.preTranslate(DSW.x * f10, DSW.y * f10);
        }
        if (DSW2 != null) {
            double d10 = f10;
            this.YFl.preScale((float) Math.pow(DSW2.YFl(), d10), (float) Math.pow(DSW2.Sg(), d10));
        }
        YFl<Float, Float> yFl3 = this.NjR;
        if (yFl3 != null) {
            float floatValue = yFl3.DSW().floatValue();
            YFl<PointF, PointF> yFl4 = this.f10161vc;
            PointF DSW3 = yFl4 != null ? yFl4.DSW() : null;
            this.YFl.preRotate(floatValue * f10, DSW3 == null ? 0.0f : DSW3.x, DSW3 != null ? DSW3.y : 0.0f);
        }
        return this.YFl;
    }

    public void YFl(YFl.InterfaceC0054YFl interfaceC0054YFl) {
        YFl<Integer, Integer> yFl = this.f10160nc;
        if (yFl != null) {
            yFl.YFl(interfaceC0054YFl);
        }
        YFl<?, Float> yFl2 = this.GA;
        if (yFl2 != null) {
            yFl2.YFl(interfaceC0054YFl);
        }
        YFl<?, Float> yFl3 = this.pDU;
        if (yFl3 != null) {
            yFl3.YFl(interfaceC0054YFl);
        }
        YFl<PointF, PointF> yFl4 = this.f10161vc;
        if (yFl4 != null) {
            yFl4.YFl(interfaceC0054YFl);
        }
        YFl<?, PointF> yFl5 = this.DSW;
        if (yFl5 != null) {
            yFl5.YFl(interfaceC0054YFl);
        }
        YFl<com.bytedance.adsdk.Sg.DSW.tN, com.bytedance.adsdk.Sg.DSW.tN> yFl6 = this.qsH;
        if (yFl6 != null) {
            yFl6.YFl(interfaceC0054YFl);
        }
        YFl<Float, Float> yFl7 = this.NjR;
        if (yFl7 != null) {
            yFl7.YFl(interfaceC0054YFl);
        }
        AlY alY = this.eT;
        if (alY != null) {
            alY.YFl(interfaceC0054YFl);
        }
        AlY alY2 = this.YoT;
        if (alY2 != null) {
            alY2.YFl(interfaceC0054YFl);
        }
    }

    public void YFl(float f10) {
        YFl<Integer, Integer> yFl = this.f10160nc;
        if (yFl != null) {
            yFl.YFl(f10);
        }
        YFl<?, Float> yFl2 = this.GA;
        if (yFl2 != null) {
            yFl2.YFl(f10);
        }
        YFl<?, Float> yFl3 = this.pDU;
        if (yFl3 != null) {
            yFl3.YFl(f10);
        }
        YFl<PointF, PointF> yFl4 = this.f10161vc;
        if (yFl4 != null) {
            yFl4.YFl(f10);
        }
        YFl<?, PointF> yFl5 = this.DSW;
        if (yFl5 != null) {
            yFl5.YFl(f10);
        }
        YFl<com.bytedance.adsdk.Sg.DSW.tN, com.bytedance.adsdk.Sg.DSW.tN> yFl6 = this.qsH;
        if (yFl6 != null) {
            yFl6.YFl(f10);
        }
        YFl<Float, Float> yFl7 = this.NjR;
        if (yFl7 != null) {
            yFl7.YFl(f10);
        }
        AlY alY = this.eT;
        if (alY != null) {
            alY.YFl(f10);
        }
        AlY alY2 = this.YoT;
        if (alY2 != null) {
            alY2.YFl(f10);
        }
    }

    public YFl<?, Integer> YFl() {
        return this.f10160nc;
    }
}
