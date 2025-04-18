package com.bytedance.adsdk.Sg.tN.Sg;

import java.util.Arrays;
import vd.e;

/* loaded from: classes.dex */
public class AlY {
    private final int[] Sg;
    private final float[] YFl;

    public AlY(float[] fArr, int[] iArr) {
        this.YFl = fArr;
        this.Sg = iArr;
    }

    public int[] Sg() {
        return this.Sg;
    }

    public float[] YFl() {
        return this.YFl;
    }

    public int tN() {
        return this.Sg.length;
    }

    public void YFl(AlY alY, AlY alY2, float f10) {
        if (alY.Sg.length == alY2.Sg.length) {
            for (int i10 = 0; i10 < alY.Sg.length; i10++) {
                this.YFl[i10] = com.bytedance.adsdk.Sg.vc.wN.YFl(alY.YFl[i10], alY2.YFl[i10], f10);
                this.Sg[i10] = com.bytedance.adsdk.Sg.vc.Sg.YFl(f10, alY.Sg[i10], alY2.Sg[i10]);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb2.append(alY.Sg.length);
        sb2.append(" vs ");
        throw new IllegalArgumentException(e.g(sb2, alY2.Sg.length, ")"));
    }

    public AlY YFl(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = YFl(fArr[i10]);
        }
        return new AlY(fArr, iArr);
    }

    private int YFl(float f10) {
        int binarySearch = Arrays.binarySearch(this.YFl, f10);
        if (binarySearch >= 0) {
            return this.Sg[binarySearch];
        }
        int i10 = -(binarySearch + 1);
        if (i10 == 0) {
            return this.Sg[0];
        }
        int[] iArr = this.Sg;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.YFl;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.Sg.vc.Sg.YFl((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
