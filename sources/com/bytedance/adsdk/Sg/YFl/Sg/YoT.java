package com.bytedance.adsdk.Sg.YFl.Sg;

import java.util.List;

/* loaded from: classes.dex */
public class YoT extends DSW<com.bytedance.adsdk.Sg.DSW.tN> {
    private final com.bytedance.adsdk.Sg.DSW.tN AlY;

    public YoT(List<com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.DSW.tN>> list) {
        super(list);
        this.AlY = new com.bytedance.adsdk.Sg.DSW.tN();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.Sg.DSW.tN YFl(com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.DSW.tN> yFl, float f10) {
        com.bytedance.adsdk.Sg.DSW.tN tNVar;
        com.bytedance.adsdk.Sg.DSW.tN tNVar2 = yFl.YFl;
        if (tNVar2 != null && (tNVar = yFl.Sg) != null) {
            com.bytedance.adsdk.Sg.DSW.tN tNVar3 = tNVar2;
            com.bytedance.adsdk.Sg.DSW.tN tNVar4 = tNVar;
            if (this.tN == null) {
                this.AlY.YFl(com.bytedance.adsdk.Sg.vc.wN.YFl(tNVar3.YFl(), tNVar4.YFl(), f10), com.bytedance.adsdk.Sg.vc.wN.YFl(tNVar3.Sg(), tNVar4.Sg(), f10));
                return this.AlY;
            }
            yFl.DSW.floatValue();
            AlY();
            qsH();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
