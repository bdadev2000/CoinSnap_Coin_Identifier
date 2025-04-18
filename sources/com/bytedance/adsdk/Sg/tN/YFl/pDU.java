package com.bytedance.adsdk.Sg.tN.YFl;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class pDU<V, O> implements GA<V, O> {
    final List<com.bytedance.adsdk.Sg.DSW.YFl<V>> YFl;

    public pDU(List<com.bytedance.adsdk.Sg.DSW.YFl<V>> list) {
        this.YFl = list;
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public boolean Sg() {
        return this.YFl.isEmpty() || (this.YFl.size() == 1 && this.YFl.get(0).wN());
    }

    @Override // com.bytedance.adsdk.Sg.tN.YFl.GA
    public List<com.bytedance.adsdk.Sg.DSW.YFl<V>> tN() {
        return this.YFl;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.YFl.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.YFl.toArray()));
        }
        return sb2.toString();
    }
}
