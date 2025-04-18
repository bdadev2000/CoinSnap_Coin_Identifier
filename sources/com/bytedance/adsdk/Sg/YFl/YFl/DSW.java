package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DSW implements YFl.InterfaceC0054YFl, eT, wN {
    private final com.bytedance.adsdk.Sg.tN.tN.YFl AlY;
    private final List<GA> DSW;
    private com.bytedance.adsdk.Sg.YFl.Sg.tN GA;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> NjR;
    private final Path Sg;
    float YFl;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YoT;
    private final com.bytedance.adsdk.Sg.NjR eT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> f10165nc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> qsH;
    private final Paint tN;

    /* renamed from: vc, reason: collision with root package name */
    private final boolean f10166vc;
    private final String wN;

    public DSW(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.EH eh2) {
        Path path = new Path();
        this.Sg = path;
        this.tN = new com.bytedance.adsdk.Sg.YFl.YFl(1);
        this.DSW = new ArrayList();
        this.AlY = yFl;
        this.wN = eh2.YFl();
        this.f10166vc = eh2.wN();
        this.eT = njR;
        if (yFl.nc() != null) {
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl = yFl.nc().YFl().YFl();
            this.YoT = YFl;
            YFl.YFl(this);
            yFl.YFl(this.YoT);
        }
        if (yFl.eT() != null) {
            this.GA = new com.bytedance.adsdk.Sg.YFl.Sg.tN(this, yFl, yFl.eT());
        }
        if (eh2.Sg() != null && eh2.tN() != null) {
            path.setFillType(eh2.AlY());
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> YFl2 = eh2.Sg().YFl();
            this.qsH = YFl2;
            YFl2.YFl(this);
            yFl.YFl(YFl2);
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<Integer, Integer> YFl3 = eh2.tN().YFl();
            this.NjR = YFl3;
            YFl3.YFl(this);
            yFl.YFl(YFl3);
            return;
        }
        this.qsH = null;
        this.NjR = null;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        this.eT.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            tN tNVar = list2.get(i10);
            if (tNVar instanceof GA) {
                this.DSW.add((GA) tNVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(Canvas canvas, Matrix matrix, int i10) {
        if (this.f10166vc) {
            return;
        }
        com.bytedance.adsdk.Sg.wN.YFl("FillContent#draw");
        this.tN.setColor((com.bytedance.adsdk.Sg.vc.wN.YFl((int) ((((i10 / 255.0f) * this.NjR.DSW().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.Sg.YFl.Sg.Sg) this.qsH).NjR() & ViewCompat.MEASURED_SIZE_MASK));
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> yFl = this.f10165nc;
        if (yFl != null) {
            this.tN.setColorFilter(yFl.DSW());
        }
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> yFl2 = this.YoT;
        if (yFl2 != null) {
            float floatValue = yFl2.DSW().floatValue();
            if (floatValue == 0.0f) {
                this.tN.setMaskFilter(null);
            } else if (floatValue != this.YFl) {
                this.tN.setMaskFilter(this.AlY.Sg(floatValue));
            }
            this.YFl = floatValue;
        }
        com.bytedance.adsdk.Sg.YFl.Sg.tN tNVar = this.GA;
        if (tNVar != null) {
            tNVar.YFl(this.tN);
        }
        this.Sg.reset();
        for (int i11 = 0; i11 < this.DSW.size(); i11++) {
            this.Sg.addPath(this.DSW.get(i11).AlY(), matrix);
        }
        canvas.drawPath(this.Sg, this.tN);
        com.bytedance.adsdk.Sg.wN.Sg("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        this.Sg.reset();
        for (int i10 = 0; i10 < this.DSW.size(); i10++) {
            this.Sg.addPath(this.DSW.get(i10).AlY(), matrix);
        }
        this.Sg.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
