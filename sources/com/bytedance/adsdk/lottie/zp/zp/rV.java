package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.KS.lMd.dT;
import com.bytedance.adsdk.lottie.KS.lMd.pvr;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class rV implements zp.InterfaceC0063zp, Bj, tG {
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> Bj;
    private final boolean COT;
    private final boolean HWF;
    private final com.bytedance.adsdk.lottie.ku KS;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> QR;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> YW;
    private boolean dQp;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> dT;
    private final dT.zp jU;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, PointF> ku;
    private final String lMd;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> tG;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> vDp;
    private final Path zp = new Path();
    private final lMd rV = new lMd();

    /* renamed from: com.bytedance.adsdk.lottie.zp.zp.rV$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[dT.zp.values().length];
            zp = iArr;
            try {
                iArr[dT.zp.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[dT.zp.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public rV(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.dT dTVar) {
        this.KS = kuVar;
        this.lMd = dTVar.zp();
        dT.zp lMd = dTVar.lMd();
        this.jU = lMd;
        this.COT = dTVar.dT();
        this.HWF = dTVar.Bj();
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp = dTVar.KS().zp();
        this.QR = zp;
        com.bytedance.adsdk.lottie.zp.lMd.zp<PointF, PointF> zp2 = dTVar.jU().zp();
        this.ku = zp2;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp3 = dTVar.COT().zp();
        this.YW = zp3;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp4 = dTVar.QR().zp();
        this.Bj = zp4;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp5 = dTVar.YW().zp();
        this.tG = zp5;
        dT.zp zpVar2 = dT.zp.STAR;
        if (lMd == zpVar2) {
            this.dT = dTVar.HWF().zp();
            this.vDp = dTVar.ku().zp();
        } else {
            this.dT = null;
            this.vDp = null;
        }
        zpVar.zp(zp);
        zpVar.zp(zp2);
        zpVar.zp(zp3);
        zpVar.zp(zp4);
        zpVar.zp(zp5);
        if (lMd == zpVar2) {
            zpVar.zp(this.dT);
            zpVar.zp(this.vDp);
        }
        zp.zp(this);
        zp2.zp(this);
        zp3.zp(this);
        zp4.zp(this);
        zp5.zp(this);
        if (lMd == zpVar2) {
            this.dT.zp(this);
            this.vDp.zp(this);
        }
    }

    private void COT() {
        double floatValue;
        int i9;
        double d2;
        double d9;
        double d10;
        int floor = (int) Math.floor(this.QR.QR().floatValue());
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar = this.YW;
        if (zpVar == null) {
            floatValue = 0.0d;
        } else {
            floatValue = zpVar.QR().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d11 = floor;
        float floatValue2 = this.tG.QR().floatValue() / 100.0f;
        float floatValue3 = this.Bj.QR().floatValue();
        double d12 = floatValue3;
        float cos = (float) (Math.cos(radians) * d12);
        float sin = (float) (Math.sin(radians) * d12);
        this.zp.moveTo(cos, sin);
        double d13 = (float) (6.283185307179586d / d11);
        double d14 = radians + d13;
        double ceil = Math.ceil(d11);
        int i10 = 0;
        while (i10 < ceil) {
            float cos2 = (float) (Math.cos(d14) * d12);
            double d15 = ceil;
            float sin2 = (float) (Math.sin(d14) * d12);
            if (floatValue2 != 0.0f) {
                d9 = d12;
                i9 = i10;
                d2 = d14;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d10 = d13;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f9 = floatValue3 * floatValue2 * 0.25f;
                this.zp.cubicTo(cos - (cos3 * f9), sin - (sin3 * f9), cos2 + (((float) Math.cos(atan22)) * f9), sin2 + (f9 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i9 = i10;
                d2 = d14;
                d9 = d12;
                d10 = d13;
                this.zp.lineTo(cos2, sin2);
            }
            d14 = d2 + d10;
            i10 = i9 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d15;
            d12 = d9;
            d13 = d10;
        }
        PointF QR = this.ku.QR();
        this.zp.offset(QR.x, QR.y);
        this.zp.close();
    }

    private void KS() {
        double floatValue;
        float f9;
        float f10;
        int i9;
        float f11;
        float f12;
        double d2;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        double d9;
        float f18;
        float f19;
        float f20;
        double d10;
        float f21;
        float f22;
        float f23;
        float f24;
        float floatValue2 = this.QR.QR().floatValue();
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar = this.YW;
        if (zpVar == null) {
            floatValue = 0.0d;
        } else {
            floatValue = zpVar.QR().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d11 = floatValue2;
        float f25 = (float) (6.283185307179586d / d11);
        if (this.HWF) {
            f25 *= -1.0f;
        }
        float f26 = f25 / 2.0f;
        float f27 = floatValue2 - ((int) floatValue2);
        int i10 = (f27 > 0.0f ? 1 : (f27 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            radians += (1.0f - f27) * f26;
        }
        float floatValue3 = this.Bj.QR().floatValue();
        float floatValue4 = this.dT.QR().floatValue();
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar2 = this.vDp;
        if (zpVar2 != null) {
            f9 = zpVar2.QR().floatValue() / 100.0f;
        } else {
            f9 = 0.0f;
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar3 = this.tG;
        if (zpVar3 != null) {
            f10 = zpVar3.QR().floatValue() / 100.0f;
        } else {
            f10 = 0.0f;
        }
        if (i10 != 0) {
            f14 = AbstractC2914a.a(floatValue3, floatValue4, f27, floatValue4);
            i9 = i10;
            double d12 = f14;
            float cos = (float) (Math.cos(radians) * d12);
            f13 = (float) (Math.sin(radians) * d12);
            this.zp.moveTo(cos, f13);
            d2 = radians + ((f25 * f27) / 2.0f);
            f11 = cos;
            f12 = f26;
        } else {
            i9 = i10;
            double d13 = floatValue3;
            float cos2 = (float) (Math.cos(radians) * d13);
            float sin = (float) (d13 * Math.sin(radians));
            this.zp.moveTo(cos2, sin);
            f11 = cos2;
            f12 = f26;
            d2 = radians + f12;
            f13 = sin;
            f14 = 0.0f;
        }
        double ceil = Math.ceil(d11) * 2.0d;
        int i11 = 0;
        float f28 = f12;
        float f29 = f11;
        boolean z8 = false;
        while (true) {
            double d14 = i11;
            if (d14 < ceil) {
                if (z8) {
                    f15 = floatValue3;
                } else {
                    f15 = floatValue4;
                }
                if (f14 != 0.0f && d14 == ceil - 2.0d) {
                    f16 = f25;
                    f17 = (f25 * f27) / 2.0f;
                } else {
                    f16 = f25;
                    f17 = f28;
                }
                if (f14 != 0.0f && d14 == ceil - 1.0d) {
                    d9 = d14;
                    f18 = f14;
                } else {
                    d9 = d14;
                    f18 = f14;
                    f14 = f15;
                }
                double d15 = f14;
                double d16 = ceil;
                float cos3 = (float) (Math.cos(d2) * d15);
                float sin2 = (float) (d15 * Math.sin(d2));
                if (f9 == 0.0f && f10 == 0.0f) {
                    this.zp.lineTo(cos3, sin2);
                    d10 = d2;
                    f19 = f9;
                    f20 = f10;
                } else {
                    f19 = f9;
                    double atan2 = (float) (Math.atan2(f13, f29) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f20 = f10;
                    d10 = d2;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z8) {
                        f21 = f19;
                    } else {
                        f21 = f20;
                    }
                    if (z8) {
                        f22 = f20;
                    } else {
                        f22 = f19;
                    }
                    if (z8) {
                        f23 = floatValue4;
                    } else {
                        f23 = floatValue3;
                    }
                    if (z8) {
                        f24 = floatValue3;
                    } else {
                        f24 = floatValue4;
                    }
                    float f30 = f23 * f21 * 0.47829f;
                    float f31 = cos4 * f30;
                    float f32 = f30 * sin3;
                    float f33 = f24 * f22 * 0.47829f;
                    float f34 = cos5 * f33;
                    float f35 = f33 * sin4;
                    if (i9 != 0) {
                        if (i11 == 0) {
                            f31 *= f27;
                            f32 *= f27;
                        } else if (d9 == d16 - 1.0d) {
                            f34 *= f27;
                            f35 *= f27;
                        }
                    }
                    this.zp.cubicTo(f29 - f31, f13 - f32, cos3 + f34, sin2 + f35, cos3, sin2);
                }
                d2 = d10 + f17;
                z8 = !z8;
                i11++;
                f29 = cos3;
                f13 = sin2;
                f10 = f20;
                f9 = f19;
                f14 = f18;
                f25 = f16;
                ceil = d16;
            } else {
                PointF QR = this.ku.QR();
                this.zp.offset(QR.x, QR.y);
                this.zp.close();
                return;
            }
        }
    }

    private void lMd() {
        this.dQp = false;
        this.KS.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.tG
    public Path jU() {
        if (this.dQp) {
            return this.zp;
        }
        this.zp.reset();
        if (this.COT) {
            this.dQp = true;
            return this.zp;
        }
        int i9 = AnonymousClass1.zp[this.jU.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                COT();
            }
        } else {
            KS();
        }
        this.zp.close();
        this.rV.zp(this.zp);
        this.dQp = true;
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        lMd();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            KS ks = list.get(i9);
            if (ks instanceof FP) {
                FP fp = (FP) ks;
                if (fp.lMd() == pvr.zp.SIMULTANEOUSLY) {
                    this.rV.zp(fp);
                    fp.zp(this);
                }
            }
        }
    }
}
