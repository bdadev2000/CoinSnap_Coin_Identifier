package com.bytedance.sdk.component.vc.YFl.YFl;

import com.bytedance.sdk.component.vc.YFl.YFl.Sg.DSW;
import com.bytedance.sdk.component.vc.YFl.qsH;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class vc implements AlY {
    private com.bytedance.sdk.component.vc.YFl.YFl.Sg.Sg AlY;
    private com.bytedance.sdk.component.vc.YFl.YFl.Sg.vc DSW;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl GA;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl NjR;
    private com.bytedance.sdk.component.vc.YFl.YFl.Sg.wN Sg;
    wN YFl = qsH.DSW().AlY();
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl YoT;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl eT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl f10462nc;
    private Queue<String> pDU;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl qsH;
    private com.bytedance.sdk.component.vc.YFl.YFl.Sg.YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.vc.YFl.YFl.Sg.tN f10463vc;
    private DSW wN;

    public vc(Queue<String> queue) {
        this.pDU = queue;
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl YoT = qsH.DSW().YoT();
            this.qsH = YoT;
            this.Sg = new com.bytedance.sdk.component.vc.YFl.YFl.Sg.wN(YoT, queue);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
            if (qsH.DSW().nc() != null) {
                this.f10462nc = qsH.DSW().nc();
            } else {
                this.f10462nc = qsH.DSW().GA();
            }
            this.AlY = new com.bytedance.sdk.component.vc.YFl.YFl.Sg.Sg(this.f10462nc, queue);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl GA = qsH.DSW().GA();
            this.NjR = GA;
            this.tN = new com.bytedance.sdk.component.vc.YFl.YFl.Sg.YFl(GA, queue);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl GA2 = qsH.DSW().GA();
            this.eT = GA2;
            this.wN = new DSW(GA2, queue);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl pDU = qsH.DSW().pDU();
            this.YoT = pDU;
            this.f10463vc = new com.bytedance.sdk.component.vc.YFl.YFl.Sg.tN(pDU, queue);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl EH = qsH.DSW().EH();
            this.GA = EH;
            this.DSW = new com.bytedance.sdk.component.vc.YFl.YFl.Sg.vc(EH, queue);
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public void YFl(int i10, long j3) {
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, int i10) {
        try {
            byte AlY = yFl.AlY();
            byte wN = yFl.wN();
            if (AlY == 0 && wN == 1 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
                this.Sg.YFl(yFl);
                return;
            }
            if (AlY == 3 && wN == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
                this.AlY.YFl(yFl);
                return;
            }
            if (AlY == 0 && wN == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
                this.tN.YFl(yFl);
                return;
            }
            if (AlY == 1 && wN == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
                this.wN.YFl(yFl);
                return;
            }
            if (AlY == 1 && wN == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
                this.f10463vc.YFl(yFl);
            } else if (AlY == 2 && wN == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc()) {
                this.DSW.YFl(yFl);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public void YFl(int i10, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl = list.get(0);
        byte wN = yFl.wN();
        byte AlY = yFl.AlY();
        if (AlY == 0 && wN == 1 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
            this.Sg.YFl(i10, list);
            return;
        }
        if (AlY == 3 && wN == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
            this.AlY.YFl(i10, list);
            return;
        }
        if (AlY == 0 && wN == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
            this.tN.YFl(i10, list);
            return;
        }
        if (AlY == 1 && wN == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
            this.wN.YFl(i10, list);
            return;
        }
        if (AlY == 1 && wN == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
            this.f10463vc.YFl(i10, list);
        } else if (AlY == 2 && wN == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc()) {
            this.DSW.YFl(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl;
        List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl2;
        List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl3;
        List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl4;
        List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl5;
        List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl6;
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl() && this.Sg.Sg(i10, i11) && (YFl6 = this.Sg.YFl(i10, i11)) != null && YFl6.size() != 0) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.Wwa(), 1);
            return YFl6;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN() && this.AlY.Sg(i10, i11) && (YFl5 = this.AlY.YFl(i10, i11)) != null && YFl5.size() != 0) {
            return YFl5;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg() && this.tN.Sg(i10, i11) && (YFl4 = this.tN.YFl(i10, i11)) != null && YFl4.size() != 0) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.qO(), 1);
            return YFl4;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN() && this.wN.Sg(i10, i11) && (YFl3 = this.wN.YFl(i10, i11)) != null && YFl3.size() != 0) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.aIu(), 1);
            return YFl3;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY() && this.f10463vc.Sg(i10, i11) && (YFl2 = this.f10463vc.YFl(i10, i11)) != null && YFl2.size() != 0) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.wXo(), 1);
            return YFl2;
        }
        if (!com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc() || !this.DSW.Sg(i10, i11) || (YFl = this.DSW.YFl(i10, i11)) == null || YFl.size() == 0) {
            return null;
        }
        return YFl;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public boolean YFl(int i10, boolean z10) {
        com.bytedance.sdk.component.vc.YFl.YFl.Sg.vc vcVar;
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl;
        com.bytedance.sdk.component.vc.YFl.YFl.Sg.tN tNVar;
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl2;
        DSW dsw;
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl3;
        com.bytedance.sdk.component.vc.YFl.YFl.Sg.YFl yFl4;
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl5;
        com.bytedance.sdk.component.vc.YFl.YFl.Sg.Sg sg2;
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl6;
        com.bytedance.sdk.component.vc.YFl.YFl.Sg.wN wNVar;
        com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl7;
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl() && (wNVar = this.Sg) != null && (yFl7 = this.qsH) != null && wNVar.Sg(i10, yFl7.YFl())) {
            return true;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN() && (sg2 = this.AlY) != null && (yFl6 = this.f10462nc) != null && sg2.Sg(i10, yFl6.YFl())) {
            return true;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg() && (yFl4 = this.tN) != null && (yFl5 = this.NjR) != null && yFl4.Sg(i10, yFl5.YFl())) {
            return true;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN() && (dsw = this.wN) != null && (yFl3 = this.eT) != null && dsw.Sg(i10, yFl3.YFl())) {
            return true;
        }
        if (!com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY() || (tNVar = this.f10463vc) == null || (yFl2 = this.YoT) == null || !tNVar.Sg(i10, yFl2.YFl())) {
            return com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc() && (vcVar = this.DSW) != null && (yFl = this.GA) != null && vcVar.Sg(i10, yFl.YFl());
        }
        return true;
    }
}
