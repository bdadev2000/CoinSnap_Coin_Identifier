package com.bytedance.adsdk.Sg.YFl.YFl;

import android.graphics.Path;
import com.bytedance.adsdk.Sg.YFl.Sg.YFl;
import com.bytedance.adsdk.Sg.tN.Sg.qO;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Wwa implements YFl.InterfaceC0054YFl, GA {
    private final com.bytedance.adsdk.Sg.NjR AlY;
    private final String Sg;
    private final boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10171vc;
    private final com.bytedance.adsdk.Sg.YFl.Sg.GA wN;
    private final Path YFl = new Path();
    private final Sg DSW = new Sg();

    public Wwa(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.tN.tN.YFl yFl, com.bytedance.adsdk.Sg.tN.Sg.lG lGVar) {
        this.Sg = lGVar.YFl();
        this.tN = lGVar.tN();
        this.AlY = njR;
        com.bytedance.adsdk.Sg.YFl.Sg.GA YFl = lGVar.Sg().YFl();
        this.wN = YFl;
        yFl.YFl(YFl);
        YFl.YFl(this);
    }

    private void Sg() {
        this.f10171vc = false;
        this.AlY.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.GA
    public Path AlY() {
        if (this.f10171vc) {
            return this.YFl;
        }
        this.YFl.reset();
        if (this.tN) {
            this.f10171vc = true;
            return this.YFl;
        }
        Path DSW = this.wN.DSW();
        if (DSW == null) {
            return this.YFl;
        }
        this.YFl.set(DSW);
        this.YFl.setFillType(Path.FillType.EVEN_ODD);
        this.DSW.YFl(this.YFl);
        this.f10171vc = true;
        return this.YFl;
    }

    @Override // com.bytedance.adsdk.Sg.YFl.Sg.YFl.InterfaceC0054YFl
    public void YFl() {
        Sg();
    }

    @Override // com.bytedance.adsdk.Sg.YFl.YFl.tN
    public void YFl(List<tN> list, List<tN> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            tN tNVar = list.get(i10);
            if (tNVar instanceof wXo) {
                wXo wxo = (wXo) tNVar;
                if (wxo.Sg() == qO.YFl.SIMULTANEOUSLY) {
                    this.DSW.YFl(wxo);
                    wxo.YFl(this);
                }
            }
            if (tNVar instanceof qO) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((qO) tNVar);
            }
        }
        this.wN.YFl((List<qO>) arrayList);
    }
}
