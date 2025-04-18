package com.bytedance.adsdk.Sg.tN.YFl;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class tN extends pDU<com.bytedance.adsdk.Sg.tN.Sg.AlY, com.bytedance.adsdk.Sg.tN.Sg.AlY> {
    public tN(List<com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY>> list) {
        super(YFl(list));
    }

    private static List<com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY>> YFl(List<com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, YFl(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.pDU, com.bytedance.adsdk.Sg.tN.YFl.GA
    public /* bridge */ /* synthetic */ boolean Sg() {
        return super.Sg();
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.pDU, com.bytedance.adsdk.Sg.tN.YFl.GA
    public /* bridge */ /* synthetic */ List tN() {
        return super.tN();
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.pDU
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY> YFl(com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY> yFl) {
        com.bytedance.adsdk.Sg.tN.Sg.AlY alY = yFl.YFl;
        com.bytedance.adsdk.Sg.tN.Sg.AlY alY2 = yFl.Sg;
        if (alY == null || alY2 == null || alY.YFl().length == alY2.YFl().length) {
            return yFl;
        }
        float[] YFl = YFl(alY.YFl(), alY2.YFl());
        return yFl.YFl(alY.YFl(YFl), alY2.YFl(YFl));
    }

    public static float[] YFl(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public com.bytedance.adsdk.Sg.YFl.Sg.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY, com.bytedance.adsdk.Sg.tN.Sg.AlY> YFl() {
        return new com.bytedance.adsdk.Sg.YFl.Sg.wN(this.YFl);
    }
}
