package com.bytedance.adsdk.Sg.tN.tN;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.Sg.nc;

/* loaded from: classes.dex */
public class AlY extends YFl {
    protected final nc DSW;
    private final Rect NjR;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<Bitmap, Bitmap> YoT;
    private com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> eT;

    /* renamed from: nc, reason: collision with root package name */
    private final Rect f10203nc;
    private final Paint qsH;

    public AlY(com.bytedance.adsdk.Sg.NjR njR, wN wNVar) {
        super(njR, wNVar);
        this.qsH = new com.bytedance.adsdk.Sg.YFl.YFl(3);
        this.NjR = new Rect();
        this.f10203nc = new Rect();
        this.DSW = njR.vc(wNVar.DSW());
    }

    private Bitmap YoT() {
        Bitmap DSW;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Bitmap, Bitmap> yFl = this.YoT;
        if (yFl != null && (DSW = yFl.DSW()) != null) {
            return DSW;
        }
        Bitmap wN = this.Sg.wN(this.tN.DSW());
        if (wN != null) {
            return wN;
        }
        nc ncVar = this.DSW;
        if (ncVar != null) {
            return ncVar.nc();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        super.Sg(canvas, matrix, i10);
        Bitmap YoT = YoT();
        if (YoT != null && !YoT.isRecycled() && this.DSW != null) {
            float YFl = com.bytedance.adsdk.Sg.vc.vc.YFl();
            this.qsH.setAlpha(i10);
            com.bytedance.adsdk.Sg.YFl.Sg.YFl<ColorFilter, ColorFilter> yFl = this.eT;
            if (yFl != null) {
                this.qsH.setColorFilter(yFl.DSW());
            }
            canvas.save();
            canvas.concat(matrix);
            this.NjR.set(0, 0, YoT.getWidth(), YoT.getHeight());
            if (this.Sg.AlY()) {
                this.f10203nc.set(0, 0, (int) (this.DSW.YFl() * YFl), (int) (this.DSW.Sg() * YFl));
            } else {
                this.f10203nc.set(0, 0, (int) (YoT.getWidth() * YFl), (int) (YoT.getHeight() * YFl));
            }
            canvas.drawBitmap(YoT, this.NjR, this.f10203nc, this.qsH);
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        super.YFl(rectF, matrix, z10);
        if (this.DSW != null) {
            float YFl = com.bytedance.adsdk.Sg.vc.vc.YFl();
            rectF.set(0.0f, 0.0f, this.DSW.YFl() * YFl, this.DSW.Sg() * YFl);
            this.YFl.mapRect(rectF);
        }
    }
}
