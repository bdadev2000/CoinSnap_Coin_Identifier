package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.KS.lMd.pvr;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class vwr implements zp.InterfaceC0063zp, tG {
    private final com.bytedance.adsdk.lottie.zp.lMd.tG COT;
    private boolean HWF;
    private final boolean KS;
    private final com.bytedance.adsdk.lottie.ku jU;
    private final String lMd;
    private final Path zp = new Path();
    private final lMd QR = new lMd();

    public vwr(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.woN won) {
        this.lMd = won.zp();
        this.KS = won.KS();
        this.jU = kuVar;
        com.bytedance.adsdk.lottie.zp.lMd.tG zp = won.lMd().zp();
        this.COT = zp;
        zpVar.zp(zp);
        zp.zp(this);
    }

    private void lMd() {
        this.HWF = false;
        this.jU.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.tG
    public Path jU() {
        if (this.HWF) {
            return this.zp;
        }
        this.zp.reset();
        if (this.KS) {
            this.HWF = true;
            return this.zp;
        }
        Path QR = this.COT.QR();
        if (QR == null) {
            return this.zp;
        }
        this.zp.set(QR);
        this.zp.setFillType(Path.FillType.EVEN_ODD);
        this.QR.zp(this.zp);
        this.HWF = true;
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        lMd();
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < list.size(); i9++) {
            KS ks = list.get(i9);
            if (ks instanceof FP) {
                FP fp = (FP) ks;
                if (fp.lMd() == pvr.zp.SIMULTANEOUSLY) {
                    this.QR.zp(fp);
                    fp.zp(this);
                }
            }
            if (ks instanceof pvr) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((pvr) ks);
            }
        }
        this.COT.zp((List<pvr>) arrayList);
    }
}
