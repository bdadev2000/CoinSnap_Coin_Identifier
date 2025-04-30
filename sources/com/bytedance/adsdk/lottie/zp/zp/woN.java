package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.PointF;
import com.bytedance.adsdk.lottie.zp.lMd.zp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class woN implements zp.InterfaceC0063zp, pvr {
    private final com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> KS;
    private com.bytedance.adsdk.lottie.KS.lMd.rV jU;
    private final String lMd;
    private final com.bytedance.adsdk.lottie.ku zp;

    public woN(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.KS.KS.zp zpVar, com.bytedance.adsdk.lottie.KS.lMd.tG tGVar) {
        this.zp = kuVar;
        this.lMd = tGVar.zp();
        com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> zp = tGVar.lMd().zp();
        this.KS = zp;
        zpVar.zp(zp);
        zp.zp(this);
    }

    public com.bytedance.adsdk.lottie.zp.lMd.zp<Float, Float> lMd() {
        return this.KS;
    }

    @Override // com.bytedance.adsdk.lottie.zp.zp.KS
    public void zp(List<KS> list, List<KS> list2) {
    }

    private com.bytedance.adsdk.lottie.KS.lMd.rV lMd(com.bytedance.adsdk.lottie.KS.lMd.rV rVVar) {
        List<com.bytedance.adsdk.lottie.KS.zp> KS = rVVar.KS();
        boolean lMd = rVVar.lMd();
        int size = KS.size() - 1;
        int i9 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.lottie.KS.zp zpVar = KS.get(size);
            com.bytedance.adsdk.lottie.KS.zp zpVar2 = KS.get(zp(size - 1, KS.size()));
            PointF KS2 = (size != 0 || lMd) ? zpVar2.KS() : rVVar.zp();
            i9 = (((size != 0 || lMd) ? zpVar2.lMd() : KS2).equals(KS2) && zpVar.zp().equals(KS2) && !(!rVVar.lMd() && size == 0 && size == KS.size() - 1)) ? i9 + 2 : i9 + 1;
            size--;
        }
        com.bytedance.adsdk.lottie.KS.lMd.rV rVVar2 = this.jU;
        if (rVVar2 == null || rVVar2.KS().size() != i9) {
            ArrayList arrayList = new ArrayList(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                arrayList.add(new com.bytedance.adsdk.lottie.KS.zp());
            }
            this.jU = new com.bytedance.adsdk.lottie.KS.lMd.rV(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.jU.zp(lMd);
        return this.jU;
    }

    @Override // com.bytedance.adsdk.lottie.zp.lMd.zp.InterfaceC0063zp
    public void zp() {
        this.zp.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r7 == (r0.size() - 1)) goto L27;
     */
    @Override // com.bytedance.adsdk.lottie.zp.zp.pvr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.adsdk.lottie.KS.lMd.rV zp(com.bytedance.adsdk.lottie.KS.lMd.rV r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.zp.zp.woN.zp(com.bytedance.adsdk.lottie.KS.lMd.rV):com.bytedance.adsdk.lottie.KS.lMd.rV");
    }

    private static int lMd(int i9, int i10) {
        int i11 = i9 / i10;
        return ((i9 ^ i10) >= 0 || i10 * i11 == i9) ? i11 : i11 - 1;
    }

    private static int zp(int i9, int i10) {
        return i9 - (lMd(i9, i10) * i10);
    }
}
