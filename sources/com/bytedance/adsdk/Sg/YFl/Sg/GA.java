package com.bytedance.adsdk.Sg.YFl.Sg;

import android.graphics.Path;
import com.bytedance.adsdk.Sg.YFl.YFl.qO;
import java.util.List;

/* loaded from: classes.dex */
public class GA extends YFl<com.bytedance.adsdk.Sg.tN.Sg.pDU, Path> {
    private final com.bytedance.adsdk.Sg.tN.Sg.pDU AlY;

    /* renamed from: vc, reason: collision with root package name */
    private List<qO> f10155vc;
    private final Path wN;

    public GA(List<com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.pDU>> list) {
        super(list);
        this.AlY = new com.bytedance.adsdk.Sg.tN.Sg.pDU();
        this.wN = new Path();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl
    /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
    public Path YFl(com.bytedance.adsdk.Sg.DSW.YFl<com.bytedance.adsdk.Sg.tN.Sg.pDU> yFl, float f10) {
        this.AlY.YFl(yFl.YFl, yFl.Sg, f10);
        com.bytedance.adsdk.Sg.tN.Sg.pDU pdu = this.AlY;
        List<qO> list = this.f10155vc;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                pdu = this.f10155vc.get(size).YFl(pdu);
            }
        }
        com.bytedance.adsdk.Sg.vc.wN.YFl(pdu, this.wN);
        return this.wN;
    }

    public void YFl(List<qO> list) {
        this.f10155vc = list;
    }
}
