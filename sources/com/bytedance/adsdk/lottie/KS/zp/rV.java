package com.bytedance.adsdk.lottie.KS.zp;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class rV<V, O> implements tG<V, O> {
    final List<com.bytedance.adsdk.lottie.QR.zp<V>> zp;

    public rV(List<com.bytedance.adsdk.lottie.QR.zp<V>> list) {
        this.zp = list;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public List<com.bytedance.adsdk.lottie.QR.zp<V>> KS() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.zp.tG
    public boolean lMd() {
        if (this.zp.isEmpty() || (this.zp.size() == 1 && this.zp.get(0).COT())) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.zp.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.zp.toArray()));
        }
        return sb.toString();
    }
}
