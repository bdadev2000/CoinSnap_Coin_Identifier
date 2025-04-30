package com.bytedance.adsdk.lottie.KS.zp;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class KS extends rV<com.bytedance.adsdk.lottie.KS.lMd.jU, com.bytedance.adsdk.lottie.KS.lMd.jU> {
    public KS(List<com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.jU>> list) {
        super(zp(list));
    }

    private static List<com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.jU>> zp(List<com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.jU>> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            list.set(i9, zp(list.get(i9)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.rV, com.bytedance.adsdk.lottie.KS.zp.tG
    public /* bridge */ /* synthetic */ List KS() {
        return super.KS();
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.rV, com.bytedance.adsdk.lottie.KS.zp.tG
    public /* bridge */ /* synthetic */ boolean lMd() {
        return super.lMd();
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.rV
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.jU> zp(com.bytedance.adsdk.lottie.QR.zp<com.bytedance.adsdk.lottie.KS.lMd.jU> zpVar) {
        com.bytedance.adsdk.lottie.KS.lMd.jU jUVar = zpVar.zp;
        com.bytedance.adsdk.lottie.KS.lMd.jU jUVar2 = zpVar.lMd;
        if (jUVar == null || jUVar2 == null || jUVar.zp().length == jUVar2.zp().length) {
            return zpVar;
        }
        float[] zp = zp(jUVar.zp(), jUVar2.zp());
        return zpVar.zp(jUVar.zp(zp), jUVar2.zp(zp));
    }

    public static float[] zp(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f9 = Float.NaN;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            float f10 = fArr3[i10];
            if (f10 != f9) {
                fArr3[i9] = f10;
                i9++;
                f9 = fArr3[i10];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i9);
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public com.bytedance.adsdk.lottie.zp.lMd.zp<com.bytedance.adsdk.lottie.KS.lMd.jU, com.bytedance.adsdk.lottie.KS.lMd.jU> zp() {
        return new com.bytedance.adsdk.lottie.zp.lMd.COT(this.zp);
    }
}
