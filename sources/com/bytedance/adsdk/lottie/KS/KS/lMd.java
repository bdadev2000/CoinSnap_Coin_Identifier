package com.bytedance.adsdk.lottie.KS.KS;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.KS.KS.jU;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class lMd extends zp {
    private final Paint Bj;
    private com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> QR;
    private final RectF YW;
    private final RectF dT;
    private final List<zp> ku;
    private boolean vDp;

    /* renamed from: com.bytedance.adsdk.lottie.KS.KS.lMd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[jU.lMd.values().length];
            zp = iArr;
            try {
                iArr[jU.lMd.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[jU.lMd.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public lMd(com.bytedance.adsdk.lottie.ku kuVar, jU jUVar, List<jU> list, com.bytedance.adsdk.lottie.HWF hwf) {
        super(kuVar, jUVar);
        int i9;
        zp zpVar;
        jU.lMd vDp;
        int i10;
        this.ku = new ArrayList();
        this.YW = new RectF();
        this.dT = new RectF();
        this.Bj = new Paint();
        this.vDp = true;
        com.bytedance.adsdk.lottie.KS.zp.lMd FP = jUVar.FP();
        if (FP != null) {
            com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp = FP.zp();
            this.QR = zp;
            zp(zp);
            this.QR.zp(this);
        } else {
            this.QR = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(hwf.YW().size());
        int size = list.size() - 1;
        zp zpVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            jU jUVar2 = list.get(size);
            zp zp2 = zp.zp(this, jUVar2, kuVar, hwf);
            if (zp2 != null) {
                longSparseArray.put(zp2.lMd().COT(), zp2);
                if (zpVar2 != null) {
                    zpVar2.zp(zp2);
                    zpVar2 = null;
                } else {
                    this.ku.add(0, zp2);
                    if (jUVar2 != null && (vDp = jUVar2.vDp()) != null && ((i10 = AnonymousClass1.zp[vDp.ordinal()]) == 1 || i10 == 2)) {
                        zpVar2 = zp2;
                    }
                }
            }
            size--;
        }
        for (i9 = 0; i9 < longSparseArray.size(); i9++) {
            zp zpVar3 = (zp) longSparseArray.get(longSparseArray.keyAt(i9));
            if (zpVar3 != null && (zpVar = (zp) longSparseArray.get(zpVar3.lMd().tG())) != null) {
                zpVar3.lMd(zpVar);
            }
        }
    }

    public void lMd(boolean z8) {
        this.vDp = z8;
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public void zp(boolean z8) {
        super.zp(z8);
        Iterator<zp> it = this.ku.iterator();
        while (it.hasNext()) {
            it.next().zp(z8);
        }
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public void lMd(Canvas canvas, Matrix matrix, int i9) {
        com.bytedance.adsdk.lottie.COT.zp("CompositionLayer#draw");
        this.dT.set(0.0f, 0.0f, this.KS.ku(), this.KS.YW());
        matrix.mapRect(this.dT);
        boolean z8 = this.lMd.QR() && this.ku.size() > 1 && i9 != 255;
        if (z8) {
            this.Bj.setAlpha(i9);
            com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.dT, this.Bj);
        } else {
            canvas.save();
        }
        if (z8) {
            i9 = 255;
        }
        for (int size = this.ku.size() - 1; size >= 0; size--) {
            if (((this.vDp || !"__container".equals(this.KS.HWF())) && !this.dT.isEmpty()) ? canvas.clipRect(this.dT) : true) {
                this.ku.get(size).zp(canvas, matrix, i9);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.lottie.COT.lMd("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp, com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        super.zp(rectF, matrix, z8);
        for (int size = this.ku.size() - 1; size >= 0; size--) {
            this.YW.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.ku.get(size).zp(this.YW, this.zp, true);
            rectF.union(this.YW);
        }
    }

    @Override // com.bytedance.adsdk.lottie.KS.KS.zp
    public void zp(@FloatRange(from = 0.0d, to = 1.0d) float f9) {
        super.zp(f9);
        if (this.QR != null) {
            f9 = ((this.KS.zp().ku() * this.QR.QR().floatValue()) - this.KS.zp().HWF()) / (this.lMd.ot().tG() + 0.01f);
        }
        if (this.QR == null) {
            f9 -= this.KS.KS();
        }
        if (this.KS.lMd() != 0.0f && !"__container".equals(this.KS.HWF())) {
            f9 /= this.KS.lMd();
        }
        for (int size = this.ku.size() - 1; size >= 0; size--) {
            this.ku.get(size).zp(f9);
        }
    }
}
