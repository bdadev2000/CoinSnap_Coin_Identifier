package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class jU implements zp.InterfaceC0063zp, COT, tG {
    private com.bytedance.adsdk.lottie.zp.lMd.KVG Bj;
    private final RectF COT;
    private final String HWF;
    private final Matrix KS;
    private final boolean QR;
    private final com.bytedance.adsdk.lottie.ku YW;
    private List<tG> dT;
    private final Path jU;
    private final List<KS> ku;
    private final RectF lMd;
    private final Paint zp;

    public jU(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.KVG kvg, com.bytedance.adsdk.lottie.HWF hwf) {
        this(kuVar, zpVar, kvg.zp(), kvg.KS(), zp(kuVar, hwf, zpVar, kvg.lMd()), zp(kvg.lMd()));
    }

    private boolean COT() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.ku.size(); i10++) {
            if ((this.ku.get(i10) instanceof COT) && (i9 = i9 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<KS> zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, List<com.bytedance.adsdk.lottie.KS.lMd.KS> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i9 = 0; i9 < list.size(); i9++) {
            KS zp = list.get(i9).zp(kuVar, hwf, zpVar);
            if (zp != null) {
                arrayList.add(zp);
            }
        }
        return arrayList;
    }

    public Matrix KS() {
        com.bytedance.adsdk.lottie.zp.lMd.KVG kvg = this.Bj;
        if (kvg != null) {
            return kvg.jU();
        }
        this.KS.reset();
        return this.KS;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.tG
    public Path jU() {
        this.KS.reset();
        com.bytedance.adsdk.lottie.zp.lMd.KVG kvg = this.Bj;
        if (kvg != null) {
            this.KS.set(kvg.jU());
        }
        this.jU.reset();
        if (this.QR) {
            return this.jU;
        }
        for (int size = this.ku.size() - 1; size >= 0; size--) {
            KS ks = this.ku.get(size);
            if (ks instanceof tG) {
                this.jU.addPath(((tG) ks).jU(), this.KS);
            }
        }
        return this.jU;
    }

    public List<tG> lMd() {
        if (this.dT == null) {
            this.dT = new ArrayList();
            for (int i9 = 0; i9 < this.ku.size(); i9++) {
                KS ks = this.ku.get(i9);
                if (ks instanceof tG) {
                    this.dT.add((tG) ks);
                }
            }
        }
        return this.dT;
    }

    public jU(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, String str, boolean z8, List<KS> list, com.bytedance.adsdk.lottie.KS.zp.vDp vdp) {
        this.zp = new com.bytedance.adsdk.lottie.zp.zp();
        this.lMd = new RectF();
        this.KS = new Matrix();
        this.jU = new Path();
        this.COT = new RectF();
        this.HWF = str;
        this.YW = kuVar;
        this.QR = z8;
        this.ku = list;
        if (vdp != null) {
            com.bytedance.adsdk.lottie.zp.lMd.KVG dT = vdp.dT();
            this.Bj = dT;
            dT.zp(zpVar);
            this.Bj.zp(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            KS ks = list.get(size);
            if (ks instanceof dT) {
                arrayList.add((dT) ks);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((dT) arrayList.get(size2)).zp(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.lottie.KS.zp.vDp zp(List<com.bytedance.adsdk.lottie.KS.lMd.KS> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            com.bytedance.adsdk.lottie.KS.lMd.KS ks = list.get(i9);
            if (ks instanceof com.bytedance.adsdk.lottie.KS.zp.vDp) {
                return (com.bytedance.adsdk.lottie.KS.zp.vDp) ks;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        this.YW.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        ArrayList arrayList = new ArrayList(this.ku.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.ku.size() - 1; size >= 0; size--) {
            KS ks = this.ku.get(size);
            ks.zp(arrayList, this.ku.subList(0, size));
            arrayList.add(ks);
        }
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(Canvas canvas, Matrix matrix, int i9) {
        if (this.QR) {
            return;
        }
        this.KS.set(matrix);
        com.bytedance.adsdk.lottie.zp.lMd.KVG kvg = this.Bj;
        if (kvg != null) {
            this.KS.preConcat(kvg.jU());
            i9 = (int) (((((this.Bj.zp() == null ? 100 : this.Bj.zp().QR().intValue()) / 100.0f) * i9) / 255.0f) * 255.0f);
        }
        boolean z8 = this.YW.QR() && COT() && i9 != 255;
        if (z8) {
            this.lMd.set(0.0f, 0.0f, 0.0f, 0.0f);
            zp(this.lMd, this.KS, true);
            this.zp.setAlpha(i9);
            com.bytedance.adsdk.lottie.HWF.HWF.zp(canvas, this.lMd, this.zp);
        }
        if (z8) {
            i9 = 255;
        }
        for (int size = this.ku.size() - 1; size >= 0; size--) {
            KS ks = this.ku.get(size);
            if (ks instanceof COT) {
                ((COT) ks).zp(canvas, this.KS, i9);
            }
        }
        if (z8) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.COT
    public void zp(RectF rectF, Matrix matrix, boolean z8) {
        this.KS.set(matrix);
        com.bytedance.adsdk.lottie.zp.lMd.KVG kvg = this.Bj;
        if (kvg != null) {
            this.KS.preConcat(kvg.jU());
        }
        this.COT.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.ku.size() - 1; size >= 0; size--) {
            KS ks = this.ku.get(size);
            if (ks instanceof COT) {
                ((COT) ks).zp(this.COT, this.KS, z8);
                rectF.union(this.COT);
            }
        }
    }
}
