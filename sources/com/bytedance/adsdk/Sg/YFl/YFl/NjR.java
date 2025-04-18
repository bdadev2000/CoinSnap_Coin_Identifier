package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* loaded from: classes.dex */
public class NjR extends YFl {
    private final String AlY;
    private final LongSparseArray<RadialGradient> DSW;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> GA;
    private final com.bytedance.adsdk.Sg.tN.Sg.DSW NjR;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YoT;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY, com.bytedance.adsdk.Sg.tN.Sg.AlY> eT;

    /* renamed from: nc, reason: collision with root package name */
    private final int f10169nc;
    private com.bytedance.adsdk.Sg.YFl.Sg.lG pDU;
    private final RectF qsH;

    /* renamed from: vc, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f10170vc;
    private final boolean wN;

    public NjR(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.vc vcVar) {
        super(njR, yFl, vcVar.qsH().YFl(), vcVar.NjR().YFl(), vcVar.YoT(), vcVar.AlY(), vcVar.DSW(), vcVar.nc(), vcVar.eT());
        this.f10170vc = new LongSparseArray<>();
        this.DSW = new LongSparseArray<>();
        this.qsH = new RectF();
        this.AlY = vcVar.YFl();
        this.NjR = vcVar.Sg();
        this.wN = vcVar.GA();
        this.f10169nc = (int) (njR.bZ().wN() / 32.0f);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY, com.bytedance.adsdk.Sg.tN.Sg.AlY> YFl = vcVar.tN().YFl();
        this.eT = YFl;
        YFl.YFl(this);
        yFl.YFl(YFl);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl2 = vcVar.wN().YFl();
        this.YoT = YFl2;
        YFl2.YFl(this);
        yFl.YFl(YFl2);
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<PointF, PointF> YFl3 = vcVar.vc().YFl();
        this.GA = YFl3;
        YFl3.YFl(this);
        yFl.YFl(YFl3);
    }

    private int AlY() {
        int i10;
        int round = Math.round(this.YoT.qsH() * this.f10169nc);
        int round2 = Math.round(this.GA.qsH() * this.f10169nc);
        int round3 = Math.round(this.eT.qsH() * this.f10169nc);
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
        LinearGradient linearGradient = this.f10170vc.get(AlY);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF DSW = this.YoT.DSW();
        PointF DSW2 = this.GA.DSW();
        com.bytedance.adsdk.Sg.tN.Sg.AlY DSW3 = this.eT.DSW();
        LinearGradient linearGradient2 = new LinearGradient(DSW.x, DSW.y, DSW2.x, DSW2.y, YFl(DSW3.Sg()), DSW3.YFl(), Shader.TileMode.CLAMP);
        this.f10170vc.put(AlY, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient tN() {
        long AlY = AlY();
        RadialGradient radialGradient = this.DSW.get(AlY);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF DSW = this.YoT.DSW();
        PointF DSW2 = this.GA.DSW();
        com.bytedance.adsdk.Sg.tN.Sg.AlY DSW3 = this.eT.DSW();
        int[] YFl = YFl(DSW3.Sg());
        float[] YFl2 = DSW3.YFl();
        RadialGradient radialGradient2 = new RadialGradient(DSW.x, DSW.y, (float) Math.hypot(DSW2.x - r7, DSW2.y - r8), YFl, YFl2, Shader.TileMode.CLAMP);
        this.DSW.put(AlY, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        Shader tN;
        if (this.wN) {
            return;
        }
        YFl(this.qsH, matrix, false);
        if (this.NjR == com.bytedance.adsdk.Sg.tN.Sg.DSW.LINEAR) {
            tN = Sg();
        } else {
            tN = tN();
        }
        tN.setLocalMatrix(matrix);
        this.Sg.setShader(tN);
        super.YFl(canvas, matrix, i10);
    }

    private int[] YFl(int[] iArr) {
        if (this.pDU == null) {
            return iArr;
        }
        throw null;
    }
}
