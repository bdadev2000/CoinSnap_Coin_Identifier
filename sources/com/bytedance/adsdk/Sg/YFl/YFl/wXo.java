package com.bytedance.adsdk.Sg.YFl.YFl;

import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import com.bytedance.adsdk.Sg.tN.Sg.qO;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class wXo implements YFl.InterfaceC0054YFl, tN {
    private final qO.YFl AlY;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> DSW;
    private final boolean Sg;
    private final String YFl;
    private final List<YFl.InterfaceC0054YFl> tN = new ArrayList();

    /* renamed from: vc, reason: collision with root package name */
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> f10183vc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> wN;

    public wXo(com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.qO qOVar) {
        this.YFl = qOVar.YFl();
        this.Sg = qOVar.vc();
        this.AlY = qOVar.Sg();
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl = qOVar.AlY().YFl();
        this.wN = YFl;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl2 = qOVar.tN().YFl();
        this.f10183vc = YFl2;
        com.bytedance.adsdk.Sg.YFl.Sg.YFl<Float, Float> YFl3 = qOVar.wN().YFl();
        this.DSW = YFl3;
        yFl.YFl(YFl);
        yFl.YFl(YFl2);
        yFl.YFl(YFl3);
        YFl.YFl(this);
        YFl2.YFl(this);
        YFl3.YFl(this);
    }

    public com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> AlY() {
        return this.f10183vc;
    }

    public qO.YFl Sg() {
        return this.AlY;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
    }

    public com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> tN() {
        return this.wN;
    }

    public boolean vc() {
        return this.Sg;
    }

    public com.bytedance.adsdk.Sg.YFl.Sg.YFl<?, Float> wN() {
        return this.DSW;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        for (int i10 = 0; i10 < this.tN.size(); i10++) {
            this.tN.get(i10).YFl();
        }
    }

    public void YFl(YFl.InterfaceC0054YFl interfaceC0054YFl) {
        this.tN.add(interfaceC0054YFl);
    }
}
