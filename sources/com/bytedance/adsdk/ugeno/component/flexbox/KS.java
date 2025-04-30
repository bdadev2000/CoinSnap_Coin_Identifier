package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class KS {
    float Bj;
    int COT;
    int HWF;
    int KVG;
    int QR;
    int YW;
    int dQp;
    float dT;
    int ku;
    int tG;
    int vDp;
    boolean vwr;
    boolean woN;
    int zp = Integer.MAX_VALUE;
    int lMd = Integer.MAX_VALUE;
    int KS = Integer.MIN_VALUE;
    int jU = Integer.MIN_VALUE;
    List<Integer> rV = new ArrayList();

    public int lMd() {
        return this.ku - this.YW;
    }

    public int zp() {
        return this.QR;
    }

    public void zp(View view, int i9, int i10, int i11, int i12) {
        lMd lmd = (lMd) view.getLayoutParams();
        this.zp = Math.min(this.zp, (view.getLeft() - lmd.tG()) - i9);
        this.lMd = Math.min(this.lMd, (view.getTop() - lmd.rV()) - i10);
        this.KS = Math.max(this.KS, lmd.dQp() + view.getRight() + i11);
        this.jU = Math.max(this.jU, lmd.KVG() + view.getBottom() + i12);
    }
}
