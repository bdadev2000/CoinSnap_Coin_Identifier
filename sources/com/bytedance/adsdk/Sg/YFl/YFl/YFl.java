package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import com.bytedance.adsdk.Sg.tN.Sg.qO;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class YFl implements YFl.InterfaceC0054YFl, eT, wN {
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> EH;
    private final List<com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float>> GA;
    final Paint Sg;
    protected final com.bytedance.adsdk.Sg.tN.tN.YFl YFl;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Integer> YoT;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> eT;
    private com.bytedance.adsdk.Sg.YFl.Sg.tN lG;

    /* renamed from: nc, reason: collision with root package name */
    private final float[] f10172nc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> pDU;
    private final com.bytedance.adsdk.Sg.NjR qsH;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> rkt;
    float tN;
    private final PathMeasure AlY = new PathMeasure();
    private final Path wN = new Path();

    /* renamed from: vc, reason: collision with root package name */
    private final Path f10173vc = new Path();
    private final RectF DSW = new RectF();
    private final List<C0055YFl> NjR = new ArrayList();

    /* renamed from: com.bytedance.adsdk.Sg.YFl.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0055YFl {
        private final wXo Sg;
        private final List<GA> YFl;

        private C0055YFl(wXo wxo) {
            this.YFl = new ArrayList();
            this.Sg = wxo;
        }
    }

    public YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.Sg.tN.YFl.AlY alY, com.bytedance.adsdk.Sg.tN.YFl.Sg sg2, List<com.bytedance.adsdk.Sg.tN.YFl.Sg> list, com.bytedance.adsdk.Sg.tN.YFl.Sg sg3) {
        com.bytedance.adsdk.Sg.YFl.YFl yFl2 = new com.bytedance.adsdk.Sg.YFl.YFl(1);
        this.Sg = yFl2;
        this.tN = 0.0f;
        this.qsH = njR;
        this.YFl = yFl;
        yFl2.setStyle(Paint.Style.STROKE);
        yFl2.setStrokeCap(cap);
        yFl2.setStrokeJoin(join);
        yFl2.setStrokeMiter(f10);
        this.YoT = alY.YFl();
        this.eT = sg2.YFl();
        if (sg3 == null) {
            this.pDU = null;
        } else {
            this.pDU = sg3.YFl();
        }
        this.GA = new ArrayList(list.size());
        this.f10172nc = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.GA.add(list.get(i10).YFl());
        }
        yFl.YFl(this.YoT);
        yFl.YFl(this.eT);
        for (int i11 = 0; i11 < this.GA.size(); i11++) {
            yFl.YFl(this.GA.get(i11));
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl3 = this.pDU;
        if (yFl3 != null) {
            yFl.YFl(yFl3);
        }
        this.YoT.YFl(this);
        this.eT.YFl(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.GA.get(i12).YFl(this);
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl4 = this.pDU;
        if (yFl4 != null) {
            yFl4.YFl(this);
        }
        if (yFl.nc() != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl = yFl.nc().YFl().YFl();
            this.rkt = YFl;
            YFl.YFl(this);
            yFl.YFl(this.rkt);
        }
        if (yFl.eT() != null) {
            this.lG = new com.bytedance.adsdk.Sg.YFl.Sg.tN(this, yFl, yFl.eT());
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        this.qsH.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        wXo wxo = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            tN tNVar = list.get(size);
            if (tNVar instanceof wXo) {
                wXo wxo2 = (wXo) tNVar;
                if (wxo2.Sg() == qO.YFl.INDIVIDUALLY) {
                    wxo = wxo2;
                }
            }
        }
        if (wxo != null) {
            wxo.YFl(this);
        }
        C0055YFl c0055YFl = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            tN tNVar2 = list2.get(size2);
            if (tNVar2 instanceof wXo) {
                wXo wxo3 = (wXo) tNVar2;
                if (wxo3.Sg() == qO.YFl.INDIVIDUALLY) {
                    if (c0055YFl != null) {
                        this.NjR.add(c0055YFl);
                    }
                    c0055YFl = new C0055YFl(wxo3);
                    wxo3.YFl(this);
                }
            }
            if (tNVar2 instanceof GA) {
                if (c0055YFl == null) {
                    c0055YFl = new C0055YFl(wxo);
                }
                c0055YFl.YFl.add((GA) tNVar2);
            }
        }
        if (c0055YFl != null) {
            this.NjR.add(c0055YFl);
        }
    }

    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.Sg.wN.YFl("StrokeContent#draw");
        if (com.bytedance.adsdk.Sg.vc.vc.Sg(matrix)) {
            com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#draw");
            return;
        }
        this.Sg.setAlpha(com.bytedance.adsdk.Sg.vc.wN.YFl((int) ((((i10 / 255.0f) * ((com.bytedance.adsdk.Sg.YFl.Sg.vc) this.YoT).NjR()) / 100.0f) * 255.0f), 0, 255));
        this.Sg.setStrokeWidth(com.bytedance.adsdk.Sg.vc.vc.YFl(matrix) * ((com.bytedance.adsdk.Sg.YFl.Sg.AlY) this.eT).NjR());
        if (this.Sg.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#draw");
            return;
        }
        YFl(matrix);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> yFl = this.EH;
        if (yFl != null) {
            this.Sg.setColorFilter(yFl.DSW());
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> yFl2 = this.rkt;
        if (yFl2 != null) {
            float floatValue = yFl2.DSW().floatValue();
            if (floatValue == 0.0f) {
                this.Sg.setMaskFilter(null);
            } else if (floatValue != this.tN) {
                this.Sg.setMaskFilter(this.YFl.Sg(floatValue));
            }
            this.tN = floatValue;
        }
        com.bytedance.adsdk.Sg.YFl.Sg.tN tNVar = this.lG;
        if (tNVar != null) {
            tNVar.YFl(this.Sg);
        }
        for (int i11 = 0; i11 < this.NjR.size(); i11++) {
            C0055YFl c0055YFl = this.NjR.get(i11);
            if (c0055YFl.Sg != null) {
                YFl(canvas, c0055YFl, matrix);
            } else {
                com.bytedance.adsdk.Sg.wN.YFl("StrokeContent#buildPath");
                this.wN.reset();
                for (int size = c0055YFl.YFl.size() - 1; size >= 0; size--) {
                    this.wN.addPath(((GA) c0055YFl.YFl.get(size)).AlY(), matrix);
                }
                com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#buildPath");
                com.bytedance.adsdk.Sg.wN.YFl("StrokeContent#drawPath");
                canvas.drawPath(this.wN, this.Sg);
                com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#draw");
    }

    private void YFl(Canvas canvas, C0055YFl c0055YFl, Matrix matrix) {
        float f10;
        float f11;
        com.bytedance.adsdk.Sg.wN.YFl("StrokeContent#applyTrimPath");
        if (c0055YFl.Sg == null) {
            com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#applyTrimPath");
            return;
        }
        this.wN.reset();
        for (int size = c0055YFl.YFl.size() - 1; size >= 0; size--) {
            this.wN.addPath(((GA) c0055YFl.YFl.get(size)).AlY(), matrix);
        }
        float floatValue = c0055YFl.Sg.tN().DSW().floatValue() / 100.0f;
        float floatValue2 = c0055YFl.Sg.AlY().DSW().floatValue() / 100.0f;
        float floatValue3 = c0055YFl.Sg.wN().DSW().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.wN, this.Sg);
            com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#applyTrimPath");
            return;
        }
        this.AlY.setPath(this.wN, false);
        float length = this.AlY.getLength();
        while (this.AlY.nextContour()) {
            length += this.AlY.getLength();
        }
        float f12 = floatValue3 * length;
        float f13 = (floatValue * length) + f12;
        float min = Math.min((floatValue2 * length) + f12, (f13 + length) - 1.0f);
        float f14 = 0.0f;
        for (int size2 = c0055YFl.YFl.size() - 1; size2 >= 0; size2--) {
            this.f10173vc.set(((GA) c0055YFl.YFl.get(size2)).AlY());
            this.f10173vc.transform(matrix);
            this.AlY.setPath(this.f10173vc, false);
            float length2 = this.AlY.getLength();
            if (min > length) {
                float f15 = min - length;
                if (f15 < f14 + length2 && f14 < f15) {
                    f10 = f13 > length ? (f13 - length) / length2 : 0.0f;
                    f11 = Math.min(f15 / length2, 1.0f);
                    com.bytedance.adsdk.Sg.vc.vc.YFl(this.f10173vc, f10, f11, 0.0f);
                    canvas.drawPath(this.f10173vc, this.Sg);
                    f14 += length2;
                }
            }
            float f16 = f14 + length2;
            if (f16 >= f13 && f14 <= min) {
                if (f16 <= min && f13 < f14) {
                    canvas.drawPath(this.f10173vc, this.Sg);
                } else {
                    f10 = f13 < f14 ? 0.0f : (f13 - f14) / length2;
                    f11 = min > f16 ? 1.0f : (min - f14) / length2;
                    com.bytedance.adsdk.Sg.vc.vc.YFl(this.f10173vc, f10, f11, 0.0f);
                    canvas.drawPath(this.f10173vc, this.Sg);
                }
            }
            f14 += length2;
        }
        com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        com.bytedance.adsdk.Sg.wN.YFl("StrokeContent#getBounds");
        this.wN.reset();
        for (int i10 = 0; i10 < this.NjR.size(); i10++) {
            C0055YFl c0055YFl = this.NjR.get(i10);
            for (int i11 = 0; i11 < c0055YFl.YFl.size(); i11++) {
                this.wN.addPath(((GA) c0055YFl.YFl.get(i11)).AlY(), matrix);
            }
        }
        this.wN.computeBounds(this.DSW, false);
        float NjR = ((com.bytedance.adsdk.Sg.YFl.Sg.AlY) this.eT).NjR();
        RectF rectF2 = this.DSW;
        float f10 = NjR / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.DSW);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#getBounds");
    }

    private void YFl(Matrix matrix) {
        com.bytedance.adsdk.Sg.wN.YFl("StrokeContent#applyDashPattern");
        if (this.GA.isEmpty()) {
            com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#applyDashPattern");
            return;
        }
        float YFl = com.bytedance.adsdk.Sg.vc.vc.YFl(matrix);
        for (int i10 = 0; i10 < this.GA.size(); i10++) {
            this.f10172nc[i10] = this.GA.get(i10).DSW().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f10172nc;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f10172nc;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f10172nc;
            fArr3[i10] = fArr3[i10] * YFl;
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> yFl = this.pDU;
        this.Sg.setPathEffect(new DashPathEffect(this.f10172nc, yFl == null ? 0.0f : YFl * yFl.DSW().floatValue()));
        com.bytedance.adsdk.Sg.wN.Sg("StrokeContent#applyDashPattern");
    }
}
