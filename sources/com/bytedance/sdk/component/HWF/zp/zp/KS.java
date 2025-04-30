package com.bytedance.sdk.component.HWF.zp.zp;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.bytedance.sdk.component.HWF.zp.zp.zp.zp.QR;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class KS implements jU {
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp Bj;
    private com.bytedance.sdk.component.HWF.zp.zp.zp.zp.HWF COT;
    private com.bytedance.sdk.component.HWF.zp.zp.zp.zp.COT HWF;
    private com.bytedance.sdk.component.HWF.zp.zp.zp.zp.lMd KS;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp QR;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp YW;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp dT;
    private QR jU;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp ku;
    private com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp lMd;
    private com.bytedance.sdk.component.HWF.zp.jU.lMd.zp vDp;
    private com.bytedance.sdk.component.HWF.zp.zp.zp.zp.jU zp;

    public KS() {
        Context HWF = ku.QR().HWF();
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp vDp = ku.QR().vDp();
            this.QR = vDp;
            this.zp = new com.bytedance.sdk.component.HWF.zp.zp.zp.zp.jU(HWF, vDp);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
            if (ku.QR().dT() != null) {
                this.YW = ku.QR().dT();
            } else {
                this.YW = ku.QR().tG();
            }
            this.KS = new com.bytedance.sdk.component.HWF.zp.zp.zp.zp.lMd(HWF, this.YW);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp tG = ku.QR().tG();
            this.ku = tG;
            this.lMd = new com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp(HWF, tG);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp tG2 = ku.QR().tG();
            this.dT = tG2;
            this.jU = new QR(HWF, tG2);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp rV = ku.QR().rV();
            this.Bj = rV;
            this.COT = new com.bytedance.sdk.component.HWF.zp.zp.zp.zp.HWF(HWF, rV);
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF()) {
            com.bytedance.sdk.component.HWF.zp.jU.lMd.zp dQp = ku.QR().dQp();
            this.vDp = dQp;
            this.HWF = new com.bytedance.sdk.component.HWF.zp.zp.zp.zp.COT(HWF, dQp);
        }
    }

    public List<com.bytedance.sdk.component.HWF.zp.jU.zp> lMd(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, int i9) {
        if (zpVar.jU() == 0 && zpVar.COT() == 1 && com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
            if (this.QR.lMd() <= i9) {
                return null;
            }
            List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp = this.zp.zp(this.QR.lMd() - i9, "_id");
            if (zp != null && zp.size() != 0) {
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.Gzh(), 1);
            }
            return zp;
        }
        if (zpVar.jU() == 3 && zpVar.COT() == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
            if (this.YW.lMd() > i9) {
                return this.KS.zp(this.YW.lMd() - i9, "_id");
            }
        } else if (zpVar.jU() == 0 && zpVar.COT() == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
            if (this.ku.lMd() > i9) {
                List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp2 = this.lMd.zp(this.ku.lMd() - i9, "_id");
                if (zp2 != null && zp2.size() != 0) {
                    com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.irS(), 1);
                }
                return zp2;
            }
        } else if (zpVar.jU() == 1 && zpVar.COT() == 2 && com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
            if (this.dT.lMd() > i9) {
                List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp3 = this.jU.zp(this.dT.lMd() - i9, "_id");
                if (zp3 != null && zp3.size() != 0) {
                    com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.QUv(), 1);
                }
                return zp3;
            }
        } else if (zpVar.jU() == 1 && zpVar.COT() == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
            if (this.Bj.lMd() > i9) {
                List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp4 = this.COT.zp(this.Bj.lMd() - i9, "_id");
                if (zp4 != null && zp4.size() != 0) {
                    com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.cW(), 1);
                }
                return zp4;
            }
        } else if (zpVar.jU() == 2 && zpVar.COT() == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF() && this.vDp.lMd() > i9) {
            return this.HWF.zp(this.vDp.lMd() - i9, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, int i9) {
        if (zpVar == null) {
            return;
        }
        try {
            zpVar.lMd(System.currentTimeMillis());
            if (zpVar.jU() == 0 && zpVar.COT() == 1) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
                    this.zp.zp(zpVar);
                    return;
                }
                return;
            }
            if (zpVar.jU() == 3 && zpVar.COT() == 2) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
                    this.KS.zp(zpVar);
                    return;
                }
                return;
            }
            if (zpVar.jU() == 0 && zpVar.COT() == 2) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
                    this.lMd.zp(zpVar);
                    return;
                }
                return;
            }
            if (zpVar.jU() == 1 && zpVar.COT() == 2) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
                    this.jU.zp(zpVar);
                }
            } else if (zpVar.jU() == 1 && zpVar.COT() == 3) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
                    this.COT.zp(zpVar);
                }
            } else if (zpVar.jU() == 2 && zpVar.COT() == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF()) {
                this.HWF.zp(zpVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.UPs(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public void zp(int i9, List<com.bytedance.sdk.component.HWF.zp.jU.zp> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.HWF.zp.jU.zp zpVar = list.get(0);
        if (i9 == 200 || i9 == -1) {
            com.bytedance.sdk.component.HWF.zp.lMd.zp.zp zpVar2 = com.bytedance.sdk.component.HWF.zp.lMd.jU.jU;
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar2.fgJ(), list.size());
            if (i9 != 200) {
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(zpVar2.Vjb(), list.size());
            }
            if (zpVar.jU() == 0 && zpVar.COT() == 1) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
                    this.zp.lMd(list);
                    return;
                }
                return;
            }
            if (zpVar.jU() == 3 && zpVar.COT() == 2) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
                    this.KS.lMd(list);
                    return;
                }
                return;
            }
            if (zpVar.jU() == 0 && zpVar.COT() == 2) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
                    this.lMd.lMd(list);
                    return;
                }
                return;
            }
            if (zpVar.jU() == 1 && zpVar.COT() == 2) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
                    this.jU.lMd(list);
                }
            } else if (zpVar.jU() == 1 && zpVar.COT() == 3) {
                if (com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
                    this.COT.lMd(list);
                }
            } else if (zpVar.jU() == 2 && zpVar.COT() == 3 && com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF()) {
                this.HWF.lMd(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp(int i9, int i10, List<String> list) {
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp()) {
            List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp = this.zp.zp("_id");
            if (zp(zp, list)) {
                zp.size();
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.yRU(), 1);
                return zp;
            }
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT()) {
            List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp2 = this.KS.zp("_id");
            if (zp(zp2, list)) {
                zp2.size();
                return zp2;
            }
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd()) {
            List<com.bytedance.sdk.component.HWF.zp.jU.zp> zp3 = this.lMd.zp("_id");
            if (zp(zp3, list)) {
                zp3.size();
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.ox(), 1);
                return zp3;
            }
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS()) {
            List<com.bytedance.sdk.component.HWF.zp.jU.zp> lMd = this.jU.lMd("_id");
            if (zp(lMd, list)) {
                lMd.size();
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.RCv(), 1);
                return lMd;
            }
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.jU()) {
            List<com.bytedance.sdk.component.HWF.zp.jU.zp> lMd2 = this.COT.lMd("_id");
            if (zp(lMd2, list)) {
                lMd2.size();
                com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.Lij(), 1);
                return lMd2;
            }
        }
        if (!com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF()) {
            return null;
        }
        List<com.bytedance.sdk.component.HWF.zp.jU.zp> lMd3 = this.HWF.lMd("_id");
        if (!zp(lMd3, list)) {
            return null;
        }
        lMd3.size();
        return lMd3;
    }

    private boolean zp(List<com.bytedance.sdk.component.HWF.zp.jU.zp> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.HWF.zp.jU.zp> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.HWF.zp.jU.zp next = it.next();
                    if (next != null) {
                        String KS = next.KS();
                        if (!TextUtils.isEmpty(KS) && list2.contains(KS)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public boolean zp(int i9, boolean z8) {
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.COT cot;
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.HWF hwf;
        QR qr;
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp zpVar;
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.lMd lmd;
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.jU jUVar;
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.zp() && (jUVar = this.zp) != null && jUVar.zp(i9)) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.rV(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.COT() && (lmd = this.KS) != null && lmd.zp(i9)) {
            return true;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.lMd() && (zpVar = this.lMd) != null && zpVar.zp(i9)) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.dQp(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.HWF.zp.lMd.zp.KS() && (qr = this.jU) != null && qr.zp(i9)) {
            com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.KVG(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.HWF.zp.lMd.zp.jU() || (hwf = this.COT) == null || !hwf.zp(i9)) {
            return com.bytedance.sdk.component.HWF.zp.lMd.zp.HWF() && (cot = this.HWF) != null && cot.zp(i9);
        }
        com.bytedance.sdk.component.HWF.zp.KS.lMd.zp(com.bytedance.sdk.component.HWF.zp.lMd.jU.jU.woN(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.jU
    public void zp(int i9, long j7) {
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.jU jUVar = this.zp;
        if (jUVar != null) {
            jUVar.zp(i9, j7);
        }
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.lMd lmd = this.KS;
        if (lmd != null) {
            lmd.zp(i9, j7);
        }
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp zpVar = this.lMd;
        if (zpVar != null) {
            zpVar.zp(i9, j7);
        }
        QR qr = this.jU;
        if (qr != null) {
            qr.zp(i9, j7);
        }
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.HWF hwf = this.COT;
        if (hwf != null) {
            hwf.zp(i9, j7);
        }
        com.bytedance.sdk.component.HWF.zp.zp.zp.zp.COT cot = this.HWF;
        if (cot != null) {
            cot.zp(i9, j7);
        }
    }
}
