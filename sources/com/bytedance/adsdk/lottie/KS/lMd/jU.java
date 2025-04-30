package com.bytedance.adsdk.lottie.KS.lMd;

import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class jU {
    private final int[] lMd;
    private final float[] zp;

    public jU(float[] fArr, int[] iArr) {
        this.zp = fArr;
        this.lMd = iArr;
    }

    public int KS() {
        return this.lMd.length;
    }

    public int[] lMd() {
        return this.lMd;
    }

    public float[] zp() {
        return this.zp;
    }

    public void zp(jU jUVar, jU jUVar2, float f9) {
        if (jUVar.lMd.length == jUVar2.lMd.length) {
            for (int i9 = 0; i9 < jUVar.lMd.length; i9++) {
                this.zp[i9] = com.bytedance.adsdk.lottie.HWF.COT.zp(jUVar.zp[i9], jUVar2.zp[i9], f9);
                this.lMd[i9] = com.bytedance.adsdk.lottie.HWF.lMd.zp(f9, jUVar.lMd[i9], jUVar2.lMd[i9]);
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(jUVar.lMd.length);
        sb.append(" vs ");
        throw new IllegalArgumentException(AbstractC2914a.g(sb, jUVar2.lMd.length, ")"));
    }

    public jU zp(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i9 = 0; i9 < fArr.length; i9++) {
            iArr[i9] = zp(fArr[i9]);
        }
        return new jU(fArr, iArr);
    }

    private int zp(float f9) {
        int binarySearch = Arrays.binarySearch(this.zp, f9);
        if (binarySearch >= 0) {
            return this.lMd[binarySearch];
        }
        int i9 = -(binarySearch + 1);
        if (i9 == 0) {
            return this.lMd[0];
        }
        int[] iArr = this.lMd;
        if (i9 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.zp;
        int i10 = i9 - 1;
        float f10 = fArr[i10];
        return com.bytedance.adsdk.lottie.HWF.lMd.zp((f9 - f10) / (fArr[i9] - f10), iArr[i10], iArr[i9]);
    }
}
