package com.bytedance.adsdk.lottie.KS.lMd;

import Q7.n0;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class rV {
    private boolean KS;
    private PointF lMd;
    private final List<com.bytedance.adsdk.lottie.KS.zp> zp;

    public rV(PointF pointF, boolean z8, List<com.bytedance.adsdk.lottie.KS.zp> list) {
        this.lMd = pointF;
        this.KS = z8;
        this.zp = new ArrayList(list);
    }

    public List<com.bytedance.adsdk.lottie.KS.zp> KS() {
        return this.zp;
    }

    public boolean lMd() {
        return this.KS;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.zp.size());
        sb.append("closed=");
        return n0.n(sb, this.KS, '}');
    }

    public void zp(float f9, float f10) {
        if (this.lMd == null) {
            this.lMd = new PointF();
        }
        this.lMd.set(f9, f10);
    }

    public PointF zp() {
        return this.lMd;
    }

    public rV() {
        this.zp = new ArrayList();
    }

    public void zp(boolean z8) {
        this.KS = z8;
    }

    public void zp(rV rVVar, rV rVVar2, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
        if (this.lMd == null) {
            this.lMd = new PointF();
        }
        this.KS = rVVar.lMd() || rVVar2.lMd();
        if (rVVar.KS().size() != rVVar2.KS().size()) {
            rVVar.KS().size();
            rVVar2.KS().size();
        }
        int min = Math.min(rVVar.KS().size(), rVVar2.KS().size());
        if (this.zp.size() < min) {
            for (int size = this.zp.size(); size < min; size++) {
                this.zp.add(new com.bytedance.adsdk.lottie.KS.zp());
            }
        } else if (this.zp.size() > min) {
            for (int size2 = this.zp.size() - 1; size2 >= min; size2--) {
                List<com.bytedance.adsdk.lottie.KS.zp> list = this.zp;
                list.remove(list.size() - 1);
            }
        }
        PointF zp = rVVar.zp();
        PointF zp2 = rVVar2.zp();
        zp(com.bytedance.adsdk.lottie.HWF.COT.zp(zp.x, zp2.x, f9), com.bytedance.adsdk.lottie.HWF.COT.zp(zp.y, zp2.y, f9));
        for (int size3 = this.zp.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.lottie.KS.zp zpVar = rVVar.KS().get(size3);
            com.bytedance.adsdk.lottie.KS.zp zpVar2 = rVVar2.KS().get(size3);
            PointF zp3 = zpVar.zp();
            PointF lMd = zpVar.lMd();
            PointF KS = zpVar.KS();
            PointF zp4 = zpVar2.zp();
            PointF lMd2 = zpVar2.lMd();
            PointF KS2 = zpVar2.KS();
            this.zp.get(size3).zp(com.bytedance.adsdk.lottie.HWF.COT.zp(zp3.x, zp4.x, f9), com.bytedance.adsdk.lottie.HWF.COT.zp(zp3.y, zp4.y, f9));
            this.zp.get(size3).lMd(com.bytedance.adsdk.lottie.HWF.COT.zp(lMd.x, lMd2.x, f9), com.bytedance.adsdk.lottie.HWF.COT.zp(lMd.y, lMd2.y, f9));
            this.zp.get(size3).KS(com.bytedance.adsdk.lottie.HWF.COT.zp(KS.x, KS2.x, f9), com.bytedance.adsdk.lottie.HWF.COT.zp(KS.y, KS2.y, f9));
        }
    }
}
