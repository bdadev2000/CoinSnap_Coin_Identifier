package com.bytedance.adsdk.Sg.YFl.Sg;

import java.util.List;

/* loaded from: classes.dex */
public class wN extends DSW<com.bytedance.adsdk.Sg.tN.Sg.AlY> {
    private final com.bytedance.adsdk.Sg.tN.Sg.AlY AlY;

    public wN(List<com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY>> list) {
        super(list);
        com.bytedance.adsdk.Sg.tN.Sg.AlY alY = list.get(0).YFl;
        int tN = alY != null ? alY.tN() : 0;
        this.AlY = new com.bytedance.adsdk.Sg.tN.Sg.AlY(new float[tN], new int[tN]);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.Sg.tN.Sg.AlY YFl(com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.AlY> yFl, float f10) {
        this.AlY.YFl(yFl.YFl, yFl.Sg, f10);
        return this.AlY;
    }
}
