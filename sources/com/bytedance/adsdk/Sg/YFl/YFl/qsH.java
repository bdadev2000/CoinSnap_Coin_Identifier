package com.bytedance.adsdk.Sg.YFl.YFl;

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
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class qsH implements YFl.InterfaceC0054YFl, eT, wN {
    private final com.bytedance.adsdk.Sg.tN.tN.YFl AlY;
    private final Path DSW;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> EH;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> GA;
    private final RectF NjR;
    private final String Sg;
    private final com.bytedance.adsdk.Sg.NjR Wwa;
    float YFl;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY, com.bytedance.adsdk.Sg.tN.Sg.AlY> YoT;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> aIu;
    private final com.bytedance.adsdk.Sg.tN.Sg.DSW eT;
    private com.bytedance.adsdk.Sg.YFl.Sg.lG lG;

    /* renamed from: nc, reason: collision with root package name */
    private final List<GA> f10178nc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> pDU;
    private final int qO;
    private final Paint qsH;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> rkt;
    private final boolean tN;
    private com.bytedance.adsdk.Sg.YFl.Sg.tN wXo;
    private final LongSparseArray<LinearGradient> wN = new LongSparseArray<>();

    /* renamed from: vc, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f10179vc = new LongSparseArray<>();

    public qsH(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.wN wNVar) {
        Path path = new Path();
        this.DSW = path;
        this.qsH = new com.bytedance.adsdk.Sg.YFl.YFl(1);
        this.NjR = new RectF();
        this.f10178nc = new ArrayList();
        this.YFl = 0.0f;
        this.AlY = yFl;
        this.Sg = wNVar.YFl();
        this.tN = wNVar.qsH();
        this.Wwa = njR;
        this.eT = wNVar.Sg();
        path.setFillType(wNVar.tN());
        this.qO = (int) (dsw.wN() / 32.0f);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY, com.bytedance.adsdk.Sg.tN.Sg.AlY> YFl = wNVar.AlY().YFl();
        this.YoT = YFl;
        YFl.YFl(this);
        yFl.YFl(YFl);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> YFl2 = wNVar.wN().YFl();
        this.GA = YFl2;
        YFl2.YFl(this);
        yFl.YFl(YFl2);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl3 = wNVar.vc().YFl();
        this.pDU = YFl3;
        YFl3.YFl(this);
        yFl.YFl(YFl3);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl4 = wNVar.DSW().YFl();
        this.EH = YFl4;
        YFl4.YFl(this);
        yFl.YFl(YFl4);
        if (yFl.nc() != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl5 = yFl.nc().YFl().YFl();
            this.aIu = YFl5;
            YFl5.YFl(this);
            yFl.YFl(this.aIu);
        }
        if (yFl.eT() != null) {
            this.wXo = new com.bytedance.adsdk.Sg.YFl.Sg.tN(this, yFl, yFl.eT());
        }
    }

    private int AlY() {
        int i10;
        int round = Math.round(this.pDU.qsH() * this.qO);
        int round2 = Math.round(this.EH.qsH() * this.qO);
        int round3 = Math.round(this.YoT.qsH() * this.qO);
        if (round != 0) {
            i10 = round * 527;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }

    private LinearGradient Sg() {
        long AlY = AlY();
        LinearGradient linearGradient = this.wN.get(AlY);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF DSW = this.pDU.DSW();
        PointF DSW2 = this.EH.DSW();
        com.bytedance.adsdk.Sg.tN.Sg.AlY DSW3 = this.YoT.DSW();
        LinearGradient linearGradient2 = new LinearGradient(DSW.x, DSW.y, DSW2.x, DSW2.y, YFl(DSW3.Sg()), DSW3.YFl(), Shader.TileMode.CLAMP);
        this.wN.put(AlY, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient tN() {
        long AlY = AlY();
        RadialGradient radialGradient = this.f10179vc.get(AlY);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF DSW = this.pDU.DSW();
        PointF DSW2 = this.EH.DSW();
        com.bytedance.adsdk.Sg.tN.Sg.AlY DSW3 = this.YoT.DSW();
        int[] YFl = YFl(DSW3.Sg());
        float[] YFl2 = DSW3.YFl();
        float f10 = DSW.x;
        float f11 = DSW.y;
        float hypot = (float) Math.hypot(DSW2.x - f10, DSW2.y - f11);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, hypot, YFl, YFl2, Shader.TileMode.CLAMP);
        this.f10179vc.put(AlY, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        this.Wwa.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            tN tNVar = list2.get(i10);
            if (tNVar instanceof GA) {
                this.f10178nc.add((GA) tNVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        Shader tN;
        if (this.tN) {
            return;
        }
        com.bytedance.adsdk.Sg.wN.YFl("GradientFillContent#draw");
        this.DSW.reset();
        for (int i11 = 0; i11 < this.f10178nc.size(); i11++) {
            this.DSW.addPath(this.f10178nc.get(i11).AlY(), matrix);
        }
        this.DSW.computeBounds(this.NjR, false);
        if (this.eT == com.bytedance.adsdk.Sg.tN.Sg.DSW.LINEAR) {
            tN = Sg();
        } else {
            tN = tN();
        }
        tN.setLocalMatrix(matrix);
        this.qsH.setShader(tN);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> yFl = this.rkt;
        if (yFl != null) {
            this.qsH.setColorFilter(yFl.DSW());
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> yFl2 = this.aIu;
        if (yFl2 != null) {
            float floatValue = yFl2.DSW().floatValue();
            if (floatValue == 0.0f) {
                this.qsH.setMaskFilter(null);
            } else if (floatValue != this.YFl) {
                this.qsH.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.YFl = floatValue;
        }
        com.bytedance.adsdk.Sg.YFl.Sg.tN tNVar = this.wXo;
        if (tNVar != null) {
            tNVar.YFl(this.qsH);
        }
        this.qsH.setAlpha(com.bytedance.adsdk.Sg.vc.wN.YFl((int) ((((i10 / 255.0f) * this.GA.DSW().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.DSW, this.qsH);
        com.bytedance.adsdk.Sg.wN.Sg("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        this.DSW.reset();
        for (int i10 = 0; i10 < this.f10178nc.size(); i10++) {
            this.DSW.addPath(this.f10178nc.get(i10).AlY(), matrix);
        }
        this.DSW.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] YFl(int[] iArr) {
        if (this.lG == null) {
            return iArr;
        }
        throw null;
    }
}
