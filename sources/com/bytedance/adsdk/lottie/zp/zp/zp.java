package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.KS.lMd.pvr;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zp implements zp.InterfaceC0063zp, Bj, COT {
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> Bj;
    float KS;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> KVG;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> dQp;
    private final float[] dT;
    private final com.bytedance.adsdk.lottie.ku ku;
    final Paint lMd;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> rV;
    private final List<com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float>> tG;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Integer> vDp;
    private com.bytedance.adsdk.lottie.zp.lMd.KS woN;
    protected final com.bytedance.adsdk.lottie.KS.KS.zp zp;
    private final PathMeasure jU = new PathMeasure();
    private final Path COT = new Path();
    private final Path HWF = new Path();
    private final RectF QR = new RectF();
    private final List<C0064zp> YW = new ArrayList();

    /* renamed from: com.bytedance.adsdk.lottie.zp.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0064zp {
        private final FP lMd;
        private final List<tG> zp;

        private C0064zp(FP fp) {
            this.zp = new ArrayList();
            this.lMd = fp;
        }
    }

    public zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, Paint.Cap cap, Paint.Join join, float f9, com.bytedance.adsdk.lottie.KS.zp.jU jUVar, com.bytedance.adsdk.lottie.KS.zp.lMd lmd, List<com.bytedance.adsdk.lottie.KS.zp.lMd> list, com.bytedance.adsdk.lottie.KS.zp.lMd lmd2) {
        com.bytedance.adsdk.lottie.zp.zp zpVar2 = new com.bytedance.adsdk.lottie.zp.zp(1);
        this.lMd = zpVar2;
        this.KS = 0.0f;
        this.ku = kuVar;
        this.zp = zpVar;
        zpVar2.setStyle(Paint.Style.STROKE);
        zpVar2.setStrokeCap(cap);
        zpVar2.setStrokeJoin(join);
        zpVar2.setStrokeMiter(f9);
        this.vDp = jUVar.zp();
        this.Bj = lmd.zp();
        if (lmd2 == null) {
            this.rV = null;
        } else {
            this.rV = lmd2.zp();
        }
        this.tG = new ArrayList(list.size());
        this.dT = new float[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.tG.add(list.get(i9).zp());
        }
        zpVar.zp(this.vDp);
        zpVar.zp(this.Bj);
        for (int i10 = 0; i10 < this.tG.size(); i10++) {
            zpVar.zp(this.tG.get(i10));
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar3 = this.rV;
        if (zpVar3 != null) {
            zpVar.zp(zpVar3);
        }
        this.vDp.zp(this);
        this.Bj.zp(this);
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.tG.get(i11).zp(this);
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar4 = this.rV;
        if (zpVar4 != null) {
            zpVar4.zp(this);
        }
        if (zpVar.HWF() != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp = zpVar.HWF().zp().zp();
            this.KVG = zp;
            zp.zp(this);
            zpVar.zp(this.KVG);
        }
        if (zpVar.QR() != null) {
            this.woN = new com.bytedance.adsdk.lottie.zp.lMd.KS(this, zpVar, zpVar.QR());
        }
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        this.ku.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        FP fp = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            KS ks = list.get(size);
            if (ks instanceof FP) {
                FP fp2 = (FP) ks;
                if (fp2.lMd() == pvr.zp.INDIVIDUALLY) {
                    fp = fp2;
                }
            }
        }
        if (fp != null) {
            fp.zp(this);
        }
        C0064zp c0064zp = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            KS ks2 = list2.get(size2);
            if (ks2 instanceof FP) {
                FP fp3 = (FP) ks2;
                if (fp3.lMd() == pvr.zp.INDIVIDUALLY) {
                    if (c0064zp != null) {
                        this.YW.add(c0064zp);
                    }
                    c0064zp = new C0064zp(fp3);
                    fp3.zp(this);
                }
            }
            if (ks2 instanceof tG) {
                if (c0064zp == null) {
                    c0064zp = new C0064zp(fp);
                }
                c0064zp.zp.add((tG) ks2);
            }
        }
        if (c0064zp != null) {
            this.YW.add(c0064zp);
        }
    }

    public void zp(Canvas canvas, Matrix matrix, int i9) {
        com.bytedance.adsdk.lottie.COT.zp("StrokeContent#draw");
        if (com.bytedance.adsdk.lottie.HWF.HWF.lMd(matrix)) {
            com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#draw");
            return;
        }
        this.lMd.setAlpha(com.bytedance.adsdk.lottie.HWF.COT.zp((int) ((((i9 / 255.0f) * ((com.bytedance.adsdk.lottie.zp.lMd.HWF) this.vDp).YW()) / 100.0f) * 255.0f), 0, 255));
        this.lMd.setStrokeWidth(com.bytedance.adsdk.lottie.HWF.HWF.zp(matrix) * ((com.bytedance.adsdk.lottie.zp.lMd.jU) this.Bj).YW());
        if (this.lMd.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#draw");
            return;
        }
        zp(matrix);
        com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> zpVar = this.dQp;
        if (zpVar != null) {
            this.lMd.setColorFilter(zpVar.QR());
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zpVar2 = this.KVG;
        if (zpVar2 != null) {
            float floatValue = zpVar2.QR().floatValue();
            if (floatValue == 0.0f) {
                this.lMd.setMaskFilter(null);
            } else if (floatValue != this.KS) {
                this.lMd.setMaskFilter(this.zp.lMd(floatValue));
            }
            this.KS = floatValue;
        }
        com.bytedance.adsdk.lottie.zp.lMd.KS ks = this.woN;
        if (ks != null) {
            ks.zp(this.lMd);
        }
        for (int i10 = 0; i10 < this.YW.size(); i10++) {
            C0064zp c0064zp = this.YW.get(i10);
            if (c0064zp.lMd != null) {
                zp(canvas, c0064zp, matrix);
            } else {
                com.bytedance.adsdk.lottie.COT.zp("StrokeContent#buildPath");
                this.COT.reset();
                for (int size = c0064zp.zp.size() - 1; size >= 0; size--) {
                    this.COT.addPath(((tG) c0064zp.zp.get(size)).jU(), matrix);
                }
                com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#buildPath");
                com.bytedance.adsdk.lottie.COT.zp("StrokeContent#drawPath");
                canvas.drawPath(this.COT, this.lMd);
                com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#draw");
    }

    private void zp(Canvas canvas, C0064zp c0064zp, Matrix matrix) {
        float f9;
        float f10;
        com.bytedance.adsdk.lottie.COT.zp("StrokeContent#applyTrimPath");
        if (c0064zp.lMd == null) {
            com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#applyTrimPath");
            return;
        }
        this.COT.reset();
        for (int size = c0064zp.zp.size() - 1; size >= 0; size--) {
            this.COT.addPath(((tG) c0064zp.zp.get(size)).jU(), matrix);
        }
        float floatValue = c0064zp.lMd.KS().QR().floatValue() / 100.0f;
        float floatValue2 = c0064zp.lMd.jU().QR().floatValue() / 100.0f;
        float floatValue3 = c0064zp.lMd.COT().QR().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.COT, this.lMd);
            com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#applyTrimPath");
            return;
        }
        this.jU.setPath(this.COT, false);
        float length = this.jU.getLength();
        while (this.jU.nextContour()) {
            length += this.jU.getLength();
        }
        float f11 = floatValue3 * length;
        float f12 = (floatValue * length) + f11;
        float min = Math.min((floatValue2 * length) + f11, (f12 + length) - 1.0f);
        float f13 = 0.0f;
        for (int size2 = c0064zp.zp.size() - 1; size2 >= 0; size2--) {
            this.HWF.set(((tG) c0064zp.zp.get(size2)).jU());
            this.HWF.transform(matrix);
            this.jU.setPath(this.HWF, false);
            float length2 = this.jU.getLength();
            if (min > length) {
                float f14 = min - length;
                if (f14 < f13 + length2 && f13 < f14) {
                    f9 = f12 > length ? (f12 - length) / length2 : 0.0f;
                    f10 = Math.min(f14 / length2, 1.0f);
                    com.bytedance.adsdk.lottie.HWF.HWF.zp(this.HWF, f9, f10, 0.0f);
                    canvas.drawPath(this.HWF, this.lMd);
                    f13 += length2;
                }
            }
            float f15 = f13 + length2;
            if (f15 >= f12 && f13 <= min) {
                if (f15 <= min && f12 < f13) {
                    canvas.drawPath(this.HWF, this.lMd);
                } else {
                    f9 = f12 < f13 ? 0.0f : (f12 - f13) / length2;
                    f10 = min > f15 ? 1.0f : (min - f13) / length2;
                    com.bytedance.adsdk.lottie.HWF.HWF.zp(this.HWF, f9, f10, 0.0f);
                    canvas.drawPath(this.HWF, this.lMd);
                }
            }
            f13 += length2;
        }
        com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        com.bytedance.adsdk.lottie.COT.zp("StrokeContent#getBounds");
        this.COT.reset();
        for (int i9 = 0; i9 < this.YW.size(); i9++) {
            C0064zp c0064zp = this.YW.get(i9);
            for (int i10 = 0; i10 < c0064zp.zp.size(); i10++) {
                this.COT.addPath(((tG) c0064zp.zp.get(i10)).jU(), matrix);
            }
        }
        this.COT.computeBounds(this.QR, false);
        float YW = ((com.bytedance.adsdk.lottie.zp.lMd.jU) this.Bj).YW();
        RectF rectF2 = this.QR;
        float f9 = YW / 2.0f;
        rectF2.set(rectF2.left - f9, rectF2.top - f9, rectF2.right + f9, rectF2.bottom + f9);
        rectF.set(this.QR);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#getBounds");
    }

    private void zp(Matrix matrix) {
        com.bytedance.adsdk.lottie.COT.zp("StrokeContent#applyDashPattern");
        if (this.tG.isEmpty()) {
            com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#applyDashPattern");
            return;
        }
        float zp = com.bytedance.adsdk.lottie.HWF.HWF.zp(matrix);
        for (int i9 = 0; i9 < this.tG.size(); i9++) {
            this.dT[i9] = this.tG.get(i9).QR().floatValue();
            if (i9 % 2 == 0) {
                float[] fArr = this.dT;
                if (fArr[i9] < 1.0f) {
                    fArr[i9] = 1.0f;
                }
            } else {
                float[] fArr2 = this.dT;
                if (fArr2[i9] < 0.1f) {
                    fArr2[i9] = 0.1f;
                }
            }
            float[] fArr3 = this.dT;
            fArr3[i9] = fArr3[i9] * zp;
        }
        com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> zpVar = this.rV;
        this.lMd.setPathEffect(new DashPathEffect(this.dT, zpVar == null ? 0.0f : zp * zpVar.QR().floatValue()));
        com.bytedance.adsdk.lottie.COT.lMd("StrokeContent#applyDashPattern");
    }
}
