package com.bytedance.adsdk.lottie.zp.lMd;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ku {
    private final List<com.bytedance.adsdk.lottie.KS.lMd.ku> KS;
    private final List<zp<Integer, Integer>> lMd;
    private final List<zp<com.bytedance.adsdk.lottie.KS.lMd.rV, Path>> zp;

    public ku(List<com.bytedance.adsdk.lottie.KS.lMd.ku> list) {
        this.KS = list;
        this.zp = new ArrayList(list.size());
        this.lMd = new ArrayList(list.size());
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.zp.add(list.get(i9).lMd().zp());
            this.lMd.add(list.get(i9).KS().zp());
        }
    }

    public List<zp<Integer, Integer>> KS() {
        return this.lMd;
    }

    public List<zp<com.bytedance.adsdk.lottie.KS.lMd.rV, Path>> lMd() {
        return this.zp;
    }

    public List<com.bytedance.adsdk.lottie.KS.lMd.ku> zp() {
        return this.KS;
    }
}
