package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class KVG implements zp.InterfaceC0063zp, Bj, COT, dT, tG {
    private final String COT;
    private final boolean HWF;
    private final com.bytedance.adsdk.lottie.ku KS;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> QR;
    private final com.bytedance.adsdk.lottie.zp.lMd.KVG YW;
    private jU dT;
    private final com.bytedance.adsdk.lottie.KS.KS.zp jU;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> ku;
    private final Matrix zp = new Matrix();
    private final Path lMd = new Path();

    public KVG(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.vDp vdp) {
        this.KS = kuVar;
        this.jU = zpVar;
        this.COT = vdp.zp();
        this.HWF = vdp.COT();
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp = vdp.lMd().zp();
        this.QR = zp;
        zpVar.zp(zp);
        zp.zp(this);
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp2 = vdp.KS().zp();
        this.ku = zp2;
        zpVar.zp(zp2);
        zp2.zp(this);
        com.bytedance.adsdk.lottie.zp.lMd.KVG dT = vdp.jU().dT();
        this.YW = dT;
        dT.zp(zpVar);
        dT.zp(this);
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.tG
    public Path jU() {
        Path jU = this.dT.jU();
        this.lMd.reset();
        float floatValue = this.QR.QR().floatValue();
        float floatValue2 = this.ku.QR().floatValue();
        for (int i9 = ((int) floatValue) - 1; i9 >= 0; i9--) {
            this.zp.set(this.YW.lMd(i9 + floatValue2));
            this.lMd.addPath(jU, this.zp);
        }
        return this.lMd;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.dT
    public void zp(ListIterator<KS> listIterator) {
        if (this.dT != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.dT = new jU(this.KS, this.jU, "Repeater", this.HWF, arrayList, null);
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        this.dT.zp(list, list2);
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(Canvas canvas, Matrix matrix, int i9) {
        float floatValue = this.QR.QR().floatValue();
        float floatValue2 = this.ku.QR().floatValue();
        float floatValue3 = this.YW.lMd().QR().floatValue() / 100.0f;
        float floatValue4 = this.YW.KS().QR().floatValue() / 100.0f;
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.zp.set(matrix);
            float f9 = i10;
            this.zp.preConcat(this.YW.lMd(f9 + floatValue2));
            this.dT.zp(canvas, this.zp, (int) (com.bytedance.adsdk.lottie.HWF.COT.zp(floatValue3, floatValue4, f9 / floatValue) * i9));
        }
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        this.dT.zp(rectF, matrix, z8);
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        this.KS.invalidateSelf();
    }
}
