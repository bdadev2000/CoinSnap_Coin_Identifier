package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import com.bytedance.adsdk.Sg.tN.Sg.nc;
import com.bytedance.adsdk.Sg.tN.Sg.qO;
import java.util.List;
import vd.e;

/* loaded from: classes.dex */
public class pDU implements YFl.InterfaceC0054YFl, GA, eT {
    private final nc.YFl AlY;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> DSW;
    private boolean EH;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> GA;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> NjR;
    private final String Sg;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> YoT;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> eT;

    /* renamed from: nc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> f10176nc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, PointF> qsH;
    private final com.bytedance.adsdk.Sg.NjR tN;

    /* renamed from: vc, reason: collision with root package name */
    private final boolean f10177vc;
    private final boolean wN;
    private final Path YFl = new Path();
    private final Sg pDU = new Sg();

    /* renamed from: com.bytedance.adsdk.Sg.YFl.YFl.pDU$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[nc.YFl.values().length];
            YFl = iArr;
            try {
                iArr[nc.YFl.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[nc.YFl.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public pDU(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.nc ncVar) {
        this.tN = njR;
        this.Sg = ncVar.YFl();
        nc.YFl Sg = ncVar.Sg();
        this.AlY = Sg;
        this.wN = ncVar.nc();
        this.f10177vc = ncVar.eT();
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl = ncVar.tN().YFl();
        this.DSW = YFl;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl2 = ncVar.AlY().YFl();
        this.qsH = YFl2;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl3 = ncVar.wN().YFl();
        this.NjR = YFl3;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl4 = ncVar.DSW().YFl();
        this.eT = YFl4;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl5 = ncVar.NjR().YFl();
        this.GA = YFl5;
        nc.YFl yFl2 = nc.YFl.STAR;
        if (Sg == yFl2) {
            this.f10176nc = ncVar.vc().YFl();
            this.YoT = ncVar.qsH().YFl();
        } else {
            this.f10176nc = null;
            this.YoT = null;
        }
        yFl.YFl(YFl);
        yFl.YFl(YFl2);
        yFl.YFl(YFl3);
        yFl.YFl(YFl4);
        yFl.YFl(YFl5);
        if (Sg == yFl2) {
            yFl.YFl(this.f10176nc);
            yFl.YFl(this.YoT);
        }
        YFl.YFl(this);
        YFl2.YFl(this);
        YFl3.YFl(this);
        YFl4.YFl(this);
        YFl5.YFl(this);
        if (Sg == yFl2) {
            this.f10176nc.YFl(this);
            this.YoT.YFl(this);
        }
    }

    private void Sg() {
        this.EH = false;
        this.tN.invalidateSelf();
    }

    private void tN() {
        double floatValue;
        float f10;
        float f11;
        int i10;
        float sin;
        double d10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        double d11;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float floatValue2 = this.DSW.DSW().floatValue();
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl = this.NjR;
        if (yFl == null) {
            floatValue = 0.0d;
        } else {
            floatValue = yFl.DSW().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d12 = floatValue2;
        float f27 = (float) (6.283185307179586d / d12);
        if (this.f10177vc) {
            f27 *= -1.0f;
        }
        float f28 = f27 / 2.0f;
        float f29 = floatValue2 - ((int) floatValue2);
        float f30 = 0.0f;
        int i11 = (f29 > 0.0f ? 1 : (f29 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f29) * f28;
        }
        float floatValue3 = this.eT.DSW().floatValue();
        float floatValue4 = this.f10176nc.DSW().floatValue();
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl2 = this.YoT;
        if (yFl2 != null) {
            f10 = yFl2.DSW().floatValue() / 100.0f;
        } else {
            f10 = 0.0f;
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl3 = this.GA;
        if (yFl3 != null) {
            f30 = yFl3.DSW().floatValue() / 100.0f;
        }
        if (i11 != 0) {
            f12 = e.b(floatValue3, floatValue4, f29, floatValue4);
            double d13 = f12;
            f11 = f30;
            i10 = i11;
            f13 = (float) (Math.cos(radians) * d13);
            sin = (float) (d13 * Math.sin(radians));
            this.YFl.moveTo(f13, sin);
            d10 = radians + ((f27 * f29) / 2.0f);
        } else {
            f11 = f30;
            i10 = i11;
            double d14 = floatValue3;
            float cos = (float) (Math.cos(radians) * d14);
            sin = (float) (Math.sin(radians) * d14);
            this.YFl.moveTo(cos, sin);
            d10 = radians + f28;
            f12 = 0.0f;
            f13 = cos;
        }
        double ceil = Math.ceil(d12) * 2.0d;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            double d15 = i12;
            if (d15 < ceil) {
                if (z10) {
                    f14 = floatValue3;
                } else {
                    f14 = floatValue4;
                }
                if (f12 != 0.0f && d15 == ceil - 2.0d) {
                    f15 = f27;
                    f16 = (f27 * f29) / 2.0f;
                } else {
                    f15 = f27;
                    f16 = f28;
                }
                if (f12 != 0.0f && d15 == ceil - 1.0d) {
                    f19 = f16;
                    f17 = f28;
                    f18 = f12;
                } else {
                    f17 = f28;
                    f18 = f14;
                    f19 = f16;
                }
                double d16 = f18;
                float cos2 = (float) (Math.cos(d10) * d16);
                float sin2 = (float) (d16 * Math.sin(d10));
                if (f10 == 0.0f && f11 == 0.0f) {
                    this.YFl.lineTo(cos2, sin2);
                    d11 = d10;
                    f21 = sin2;
                    f22 = f10;
                    f20 = f12;
                } else {
                    d11 = d10;
                    double atan2 = (float) (Math.atan2(sin, f13) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f20 = f12;
                    f21 = sin2;
                    f22 = f10;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z10) {
                        f23 = f22;
                    } else {
                        f23 = f11;
                    }
                    if (z10) {
                        f24 = f11;
                    } else {
                        f24 = f22;
                    }
                    if (z10) {
                        f25 = floatValue4;
                    } else {
                        f25 = floatValue3;
                    }
                    if (z10) {
                        f26 = floatValue3;
                    } else {
                        f26 = floatValue4;
                    }
                    float f31 = f25 * f23 * 0.47829f;
                    float f32 = cos3 * f31;
                    float f33 = f31 * sin3;
                    float f34 = f26 * f24 * 0.47829f;
                    float f35 = cos4 * f34;
                    float f36 = f34 * sin4;
                    if (i10 != 0) {
                        if (i12 == 0) {
                            f32 *= f29;
                            f33 *= f29;
                        } else if (d15 == ceil - 1.0d) {
                            f35 *= f29;
                            f36 *= f29;
                        }
                    }
                    this.YFl.cubicTo(f13 - f32, sin - f33, cos2 + f35, f21 + f36, cos2, f21);
                }
                z10 = !z10;
                i12++;
                f12 = f20;
                d10 = d11 + f19;
                f13 = cos2;
                f28 = f17;
                f27 = f15;
                sin = f21;
                f10 = f22;
            } else {
                PointF DSW = this.qsH.DSW();
                this.YFl.offset(DSW.x, DSW.y);
                this.YFl.close();
                return;
            }
        }
    }

    private void wN() {
        double floatValue;
        int i10;
        double d10;
        double d11;
        double d12;
        int floor = (int) Math.floor(this.DSW.DSW().floatValue());
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl = this.NjR;
        if (yFl == null) {
            floatValue = 0.0d;
        } else {
            floatValue = yFl.DSW().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d13 = floor;
        float floatValue2 = this.GA.DSW().floatValue() / 100.0f;
        float floatValue3 = this.eT.DSW().floatValue();
        double d14 = floatValue3;
        float cos = (float) (Math.cos(radians) * d14);
        float sin = (float) (Math.sin(radians) * d14);
        this.YFl.moveTo(cos, sin);
        double d15 = (float) (6.283185307179586d / d13);
        double d16 = radians + d15;
        double ceil = Math.ceil(d13);
        int i11 = 0;
        while (i11 < ceil) {
            float cos2 = (float) (Math.cos(d16) * d14);
            double d17 = ceil;
            float sin2 = (float) (Math.sin(d16) * d14);
            if (floatValue2 != 0.0f) {
                d11 = d14;
                i10 = i11;
                d10 = d16;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d12 = d15;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f10 = floatValue3 * floatValue2 * 0.25f;
                this.YFl.cubicTo(cos - (cos3 * f10), sin - (sin3 * f10), cos2 + (((float) Math.cos(atan22)) * f10), sin2 + (f10 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i10 = i11;
                d10 = d16;
                d11 = d14;
                d12 = d15;
                this.YFl.lineTo(cos2, sin2);
            }
            d16 = d10 + d12;
            i11 = i10 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d17;
            d14 = d11;
            d15 = d12;
        }
        PointF DSW = this.qsH.DSW();
        this.YFl.offset(DSW.x, DSW.y);
        this.YFl.close();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.GA
    public Path AlY() {
        if (this.EH) {
            return this.YFl;
        }
        this.YFl.reset();
        if (this.wN) {
            this.EH = true;
            return this.YFl;
        }
        int i10 = AnonymousClass1.YFl[this.AlY.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                wN();
            }
        } else {
            tN();
        }
        this.YFl.close();
        this.pDU.YFl(this.YFl);
        this.EH = true;
        return this.YFl;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        Sg();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            tN tNVar = list.get(i10);
            if (tNVar instanceof wXo) {
                wXo wxo = (wXo) tNVar;
                if (wxo.Sg() == qO.YFl.SIMULTANEOUSLY) {
                    this.pDU.YFl(wxo);
                    wxo.YFl(this);
                }
            }
        }
    }
}
