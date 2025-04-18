package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class qsH {
    private final List<YFl<Integer, Integer>> Sg;
    private final List<YFl<com.bytedance.adsdk.Sg.tN.Sg.pDU, Path>> YFl;
    private final List<com.bytedance.adsdk.Sg.tN.Sg.qsH> tN;

    public qsH(List<com.bytedance.adsdk.Sg.tN.Sg.qsH> list) {
        this.tN = list;
        this.YFl = new ArrayList(list.size());
        this.Sg = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.YFl.add(list.get(i10).Sg().YFl());
            this.Sg.add(list.get(i10).tN().YFl());
        }
    }

    public List<YFl<com.bytedance.adsdk.Sg.tN.Sg.pDU, Path>> Sg() {
        return this.YFl;
    }

    public List<com.bytedance.adsdk.Sg.tN.Sg.qsH> YFl() {
        return this.tN;
    }

    public List<YFl<Integer, Integer>> tN() {
        return this.Sg;
    }
}
