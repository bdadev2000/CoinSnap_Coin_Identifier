package com.bytedance.adsdk.lottie.zp.zp;

import com.bytedance.adsdk.lottie.KS.lMd.pvr;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FP implements zp.InterfaceC0063zp, KS {
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> COT;
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> HWF;
    private final List<zp.InterfaceC0063zp> KS = new ArrayList();
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> QR;
    private final pvr.zp jU;
    private final boolean lMd;
    private final String zp;

    public FP(com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.pvr pvrVar) {
        this.zp = pvrVar.zp();
        this.lMd = pvrVar.HWF();
        this.jU = pvrVar.lMd();
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp = pvrVar.jU().zp();
        this.COT = zp;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp2 = pvrVar.KS().zp();
        this.HWF = zp2;
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp3 = pvrVar.COT().zp();
        this.QR = zp3;
        zpVar.zp(zp);
        zpVar.zp(zp2);
        zpVar.zp(zp3);
        zp.zp(this);
        zp2.zp(this);
        zp3.zp(this);
    }

    public com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> COT() {
        return this.QR;
    }

    public boolean HWF() {
        return this.lMd;
    }

    public com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> KS() {
        return this.COT;
    }

    public com.bytedance.adsdk.lottie.zp.lMd.zp<?, Float> jU() {
        return this.HWF;
    }

    public pvr.zp lMd() {
        return this.jU;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        for (int i9 = 0; i9 < this.KS.size(); i9++) {
            this.KS.get(i9).zp();
        }
    }

    public void zp(zp.InterfaceC0063zp interfaceC0063zp) {
        this.KS.add(interfaceC0063zp);
    }
}
