package com.bytedance.sdk.component.HWF.zp.zp;

import com.bytedance.sdk.component.HWF.zp.ku;
import com.bytedance.sdk.component.HWF.zp.zp.lMd.QR;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class HWF implements jU {
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp Bj;
    private QR COT;
    private com.bytedance.sdk.component.HWF.zp.zp.lMd.KS HWF;
    private com.bytedance.sdk.component.HWF.zp.zp.lMd.zp KS;
    private com.bytedance.sdk.component.HWF.zp.zp.lMd.HWF QR;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp YW;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp dT;
    private com.bytedance.sdk.component.HWF.zp.zp.lMd.lMd jU;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp ku;
    private com.bytedance.sdk.component.HWF.zp.zp.lMd.COT lMd;
    private Queue<String> rV;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp tG;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp vDp;
    COT zp = ku.QR().jU();

    public HWF(Queue<String> queue) {
        this.rV = queue;
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp vDp = ku.QR().vDp();
            this.ku = vDp;
            this.lMd = new com.bytedance.sdk.component.HWF.zp.zp.lMd.COT(vDp, queue);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
            if (ku.QR().dT() != null) {
                this.dT = ku.QR().dT();
            } else {
                this.dT = ku.QR().tG();
            }
            this.jU = new com.bytedance.sdk.component.HWF.zp.zp.lMd.lMd(this.dT, queue);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp tG = ku.QR().tG();
            this.YW = tG;
            this.KS = new com.bytedance.sdk.component.HWF.zp.zp.lMd.zp(tG, queue);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp tG2 = ku.QR().tG();
            this.Bj = tG2;
            this.COT = new QR(tG2, queue);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp rV = ku.QR().rV();
            this.vDp = rV;
            this.HWF = new com.bytedance.sdk.component.HWF.zp.zp.lMd.KS(rV, queue);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp dQp = ku.QR().dQp();
            this.tG = dQp;
            this.QR = new com.bytedance.sdk.component.HWF.zp.zp.lMd.HWF(dQp, queue);
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public void zp(int i9, long j7) {
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, int i9) {
        try {
            byte jU = zpVar.jU();
            byte COT = zpVar.COT();
            if (jU == 0 && COT == 1 && com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
                this.lMd.zp(zpVar);
                return;
            }
            if (jU == 3 && COT == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
                this.jU.zp(zpVar);
                return;
            }
            if (jU == 0 && COT == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
                this.KS.zp(zpVar);
                return;
            }
            if (jU == 1 && COT == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
                this.COT.zp(zpVar);
                return;
            }
            if (jU == 1 && COT == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
                this.HWF.zp(zpVar);
            } else if (jU == 2 && COT == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF()) {
                this.QR.zp(zpVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public void zp(int i9, List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.HWF.zp.jU.zp zpVar = list.get(0);
        byte COT = zpVar.COT();
        byte jU = zpVar.jU();
        if (jU == 0 && COT == 1 && com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
            this.lMd.zp(i9, list);
            return;
        }
        if (jU == 3 && COT == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
            this.jU.zp(i9, list);
            return;
        }
        if (jU == 0 && COT == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
            this.KS.zp(i9, list);
            return;
        }
        if (jU == 1 && COT == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
            this.COT.zp(i9, list);
            return;
        }
        if (jU == 1 && COT == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
            this.HWF.zp(i9, list);
        } else if (jU == 2 && COT == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF()) {
            this.QR.zp(i9, list);
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp(int i9, int i10, List<String> list) {
        List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp;
        List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp2;
        List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp3;
        List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp4;
        List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp5;
        List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp6;
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp() && this.lMd.lMd(i9, i10) && (zp6 = this.lMd.zp(i9, i10)) != null && zp6.size() != 0) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.vwr(), 1);
            return zp6;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT() && this.jU.lMd(i9, i10) && (zp5 = this.jU.zp(i9, i10)) != null && zp5.size() != 0) {
            return zp5;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd() && this.KS.lMd(i9, i10) && (zp4 = this.KS.zp(i9, i10)) != null && zp4.size() != 0) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.pvr(), 1);
            return zp4;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS() && this.COT.lMd(i9, i10) && (zp3 = this.COT.zp(i9, i10)) != null && zp3.size() != 0) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.cz(), 1);
            return zp3;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.jU() && this.HWF.lMd(i9, i10) && (zp2 = this.HWF.zp(i9, i10)) != null && zp2.size() != 0) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.FP(), 1);
            return zp2;
        }
        if (!com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF() || !this.QR.lMd(i9, i10) || (zp = this.QR.zp(i9, i10)) == null || zp.size() == 0) {
            return null;
        }
        return zp;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public boolean zp(int i9, boolean z8) {
        com.bytedance.sdk.component.HWF.zp.zp.lMd.HWF hwf;
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar;
        com.bytedance.sdk.component.HWF.zp.zp.lMd.KS ks;
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar2;
        QR qr;
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar3;
        com.bytedance.sdk.component.HWF.zp.zp.lMd.zp zpVar4;
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar5;
        com.bytedance.sdk.component.HWF.zp.zp.lMd.lMd lmd;
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar6;
        com.bytedance.sdk.component.HWF.zp.zp.lMd.COT cot;
        com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar7;
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp() && (cot = this.lMd) != null && (zpVar7 = this.ku) != null && cot.lMd(i9, zpVar7.zp())) {
            return true;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT() && (lmd = this.jU) != null && (zpVar6 = this.dT) != null && lmd.lMd(i9, zpVar6.zp())) {
            return true;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd() && (zpVar4 = this.KS) != null && (zpVar5 = this.YW) != null && zpVar4.lMd(i9, zpVar5.zp())) {
            return true;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS() && (qr = this.COT) != null && (zpVar3 = this.Bj) != null && qr.lMd(i9, zpVar3.zp())) {
            return true;
        }
        if (!com.bytedance.sdk.component.HWF.zp.lMd.zp.jU() || (ks = this.HWF) == null || (zpVar2 = this.vDp) == null || !ks.lMd(i9, zpVar2.zp())) {
            return com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF() && (hwf = this.QR) != null && (zpVar = this.tG) != null && hwf.lMd(i9, zpVar.zp());
        }
        return true;
    }
}
