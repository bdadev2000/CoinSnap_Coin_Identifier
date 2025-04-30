package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class cz extends zp {
    private final String COT;
    private final boolean HWF;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> QR;
    private final com.bytedance.adsdk.lottie.KS.KS.zp jU;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> ku;

    public cz(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.vwr vwrVar) {
        super(kuVar, zpVar, vwrVar.QR().zp(), vwrVar.ku().zp(), vwrVar.YW(), vwrVar.KS(), vwrVar.jU(), vwrVar.COT(), vwrVar.HWF());
        this.jU = zpVar;
        this.COT = vwrVar.zp();
        this.HWF = vwrVar.dT();
        com.bytedance.adsdk.lottie.zp.lMd.zp<Integer, Integer> zp = vwrVar.lMd().zp();
        this.QR = zp;
        zp.zp(this);
        zpVar.zp(zp);
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.zp, com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(Canvas canvas, Matrix matrix, int i9) {
        if (this.HWF) {
            return;
        }
        this.lMd.setColor(((com.bytedance.adsdk.lottie.zp.lMd.lMd) this.QR).YW());
        com.bytedance.adsdk.lottie.zp.lMd.zp<ColorFilter, ColorFilter> zpVar = this.ku;
        if (zpVar != null) {
            this.lMd.setColorFilter(zpVar.QR());
        }
        super.zp(canvas, matrix, i9);
    }
}
