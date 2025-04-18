package com.bytedance.adsdk.Sg.tN.tN;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.Sg.tN.Sg.rkt;
import com.bytedance.adsdk.Sg.wN.nc;
import java.util.Collections;

/* loaded from: classes.dex */
public class DSW extends YFl {
    private final com.bytedance.adsdk.Sg.YFl.YFl.AlY DSW;
    private final Sg qsH;

    public DSW(com.bytedance.adsdk.Sg.NjR njR, wN wNVar, Sg sg2, com.bytedance.adsdk.Sg.DSW dsw) {
        super(njR, wNVar);
        this.qsH = sg2;
        com.bytedance.adsdk.Sg.YFl.YFl.AlY alY = new com.bytedance.adsdk.Sg.YFl.YFl.AlY(njR, this, new rkt("__container", wNVar.pDU(), false), dsw);
        this.DSW = alY;
        alY.YFl(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        super.Sg(canvas, matrix, i10);
        this.DSW.YFl(canvas, matrix, i10);
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        super.YFl(rectF, matrix, z10);
        this.DSW.YFl(rectF, this.YFl, z10);
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public nc eT() {
        nc eT = super.eT();
        if (eT != null) {
            return eT;
        }
        return this.qsH.eT();
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public com.bytedance.adsdk.Sg.tN.Sg.YFl nc() {
        com.bytedance.adsdk.Sg.tN.Sg.YFl nc2 = super.nc();
        if (nc2 != null) {
            return nc2;
        }
        return this.qsH.nc();
    }
}
