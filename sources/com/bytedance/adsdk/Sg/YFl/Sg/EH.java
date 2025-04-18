package com.bytedance.adsdk.Sg.YFl.Sg;

import java.util.List;

/* loaded from: classes.dex */
public class EH extends DSW<com.bytedance.adsdk.Sg.tN.Sg> {
    public EH(List<com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.Sg.tN.Sg YFl(com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg> yFl, float f10) {
        com.bytedance.adsdk.Sg.tN.Sg sg2;
        if (this.tN != null) {
            Float f11 = yFl.DSW;
            if (f11 != null) {
                f11.floatValue();
            }
            wN();
            qsH();
            throw null;
        }
        if (f10 == 1.0f && (sg2 = yFl.Sg) != null) {
            return sg2;
        }
        return yFl.YFl;
    }
}
