package com.bytedance.adsdk.Sg.tN.tN;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class vc extends YFl {
    public vc(com.bytedance.adsdk.Sg.NjR njR, wN wNVar) {
        super(njR, wNVar);
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl
    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        super.Sg(canvas, matrix, i10);
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.YFl, com.bytedance.adsdk.Sg.YFl.YFl.wN
    public void YFl(RectF rectF, Matrix matrix, boolean z10) {
        super.YFl(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
