package com.bytedance.sdk.component.vc.YFl.YFl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.DSW;
import com.bytedance.sdk.component.vc.YFl.qsH;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class tN implements AlY {
    private DSW AlY;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl DSW;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl NjR;
    private com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl Sg;
    private com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.AlY YFl;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl YoT;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl eT;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl f10460nc;
    private com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl qsH;
    private com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.Sg tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.wN f10461vc;
    private com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.vc wN;

    public tN() {
        Context vc2 = qsH.DSW().vc();
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl YoT = qsH.DSW().YoT();
            this.DSW = YoT;
            this.YFl = new com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.AlY(vc2, YoT);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
            if (qsH.DSW().nc() != null) {
                this.NjR = qsH.DSW().nc();
            } else {
                this.NjR = qsH.DSW().GA();
            }
            this.tN = new com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.Sg(vc2, this.NjR);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl GA = qsH.DSW().GA();
            this.qsH = GA;
            this.Sg = new com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl(vc2, GA);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl GA2 = qsH.DSW().GA();
            this.f10460nc = GA2;
            this.AlY = new DSW(vc2, GA2);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl pDU = qsH.DSW().pDU();
            this.eT = pDU;
            this.wN = new com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.vc(vc2, pDU);
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc()) {
            com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl EH = qsH.DSW().EH();
            this.YoT = EH;
            this.f10461vc = new com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.wN(vc2, EH);
        }
    }

    public List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> Sg(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, int i10) {
        if (yFl.AlY() == 0 && yFl.wN() == 1 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
            if (this.DSW.Sg() <= i10) {
                return null;
            }
            List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl = this.YFl.YFl(this.DSW.Sg() - i10, "_id");
            if (YFl != null && YFl.size() != 0) {
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.Ga(), 1);
            }
            return YFl;
        }
        if (yFl.AlY() == 3 && yFl.wN() == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
            if (this.NjR.Sg() > i10) {
                return this.tN.YFl(this.NjR.Sg() - i10, "_id");
            }
        } else if (yFl.AlY() == 0 && yFl.wN() == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
            if (this.qsH.Sg() > i10) {
                List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl2 = this.Sg.YFl(this.qsH.Sg() - i10, "_id");
                if (YFl2 != null && YFl2.size() != 0) {
                    com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.dXO(), 1);
                }
                return YFl2;
            }
        } else if (yFl.AlY() == 1 && yFl.wN() == 2 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
            if (this.f10460nc.Sg() > i10) {
                List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl3 = this.AlY.YFl(this.f10460nc.Sg() - i10, "_id");
                if (YFl3 != null && YFl3.size() != 0) {
                    com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.Cfr(), 1);
                }
                return YFl3;
            }
        } else if (yFl.AlY() == 1 && yFl.wN() == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
            if (this.eT.Sg() > i10) {
                List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl4 = this.wN.YFl(this.eT.Sg() - i10, "_id");
                if (YFl4 != null && YFl4.size() != 0) {
                    com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.hQ(), 1);
                }
                return YFl4;
            }
        } else if (yFl.AlY() == 2 && yFl.wN() == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc() && this.YoT.Sg() > i10) {
            return this.f10461vc.YFl(this.YoT.Sg() - i10, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl, int i10) {
        if (yFl == null) {
            return;
        }
        try {
            yFl.Sg(System.currentTimeMillis());
            if (yFl.AlY() == 0 && yFl.wN() == 1) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
                    this.YFl.YFl(yFl);
                    return;
                }
                return;
            }
            if (yFl.AlY() == 3 && yFl.wN() == 2) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
                    this.tN.YFl(yFl);
                    return;
                }
                return;
            }
            if (yFl.AlY() == 0 && yFl.wN() == 2) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
                    this.Sg.YFl(yFl);
                    return;
                }
                return;
            }
            if (yFl.AlY() == 1 && yFl.wN() == 2) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
                    this.AlY.YFl(yFl);
                }
            } else if (yFl.AlY() == 1 && yFl.wN() == 3) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
                    this.wN.YFl(yFl);
                }
            } else if (yFl.AlY() == 2 && yFl.wN() == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc()) {
                this.f10461vc.YFl(yFl);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.zB(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public void YFl(int i10, List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl = list.get(0);
        if (i10 == 200 || i10 == -1) {
            com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl yFl2 = com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY;
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl2.Jc(), list.size());
            if (i10 != 200) {
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(yFl2.tQ(), list.size());
            }
            if (yFl.AlY() == 0 && yFl.wN() == 1) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
                    this.YFl.Sg(list);
                    return;
                }
                return;
            }
            if (yFl.AlY() == 3 && yFl.wN() == 2) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
                    this.tN.Sg(list);
                    return;
                }
                return;
            }
            if (yFl.AlY() == 0 && yFl.wN() == 2) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
                    this.Sg.Sg(list);
                    return;
                }
                return;
            }
            if (yFl.AlY() == 1 && yFl.wN() == 2) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
                    this.AlY.Sg(list);
                }
            } else if (yFl.AlY() == 1 && yFl.wN() == 3) {
                if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
                    this.wN.Sg(list);
                }
            } else if (yFl.AlY() == 2 && yFl.wN() == 3 && com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc()) {
                this.f10461vc.Sg(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl(int i10, int i11, List<String> list) {
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl()) {
            List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl = this.YFl.YFl("_id");
            if (YFl(YFl, list)) {
                YFl.size();
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.VOe(), 1);
                return YFl;
            }
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN()) {
            List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl2 = this.tN.YFl("_id");
            if (YFl(YFl2, list)) {
                YFl2.size();
                return YFl2;
            }
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg()) {
            List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> YFl3 = this.Sg.YFl("_id");
            if (YFl(YFl3, list)) {
                YFl3.size();
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.bZ(), 1);
                return YFl3;
            }
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN()) {
            List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> Sg = this.AlY.Sg("_id");
            if (YFl(Sg, list)) {
                Sg.size();
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.UZM(), 1);
                return Sg;
            }
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY()) {
            List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> Sg2 = this.wN.Sg("_id");
            if (YFl(Sg2, list)) {
                Sg2.size();
                com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.YI(), 1);
                return Sg2;
            }
        }
        if (!com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc()) {
            return null;
        }
        List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> Sg3 = this.f10461vc.Sg("_id");
        if (!YFl(Sg3, list)) {
            return null;
        }
        Sg3.size();
        return Sg3;
    }

    private boolean YFl(List<com.bytedance.sdk.component.vc.YFl.AlY.YFl> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.vc.YFl.AlY.YFl> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.vc.YFl.AlY.YFl next = it.next();
                    if (next != null) {
                        String tN = next.tN();
                        if (!TextUtils.isEmpty(tN) && list2.contains(tN)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public boolean YFl(int i10, boolean z10) {
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.wN wNVar;
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.vc vcVar;
        DSW dsw;
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl yFl;
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.Sg sg2;
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.AlY alY;
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.YFl() && (alY = this.YFl) != null && alY.YFl(i10)) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.pDU(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.wN() && (sg2 = this.tN) != null && sg2.YFl(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.Sg() && (yFl = this.Sg) != null && yFl.YFl(i10)) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.EH(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.vc.YFl.Sg.YFl.tN() && (dsw = this.AlY) != null && dsw.YFl(i10)) {
            com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.rkt(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.vc.YFl.Sg.YFl.AlY() || (vcVar = this.wN) == null || !vcVar.YFl(i10)) {
            return com.bytedance.sdk.component.vc.YFl.Sg.YFl.vc() && (wNVar = this.f10461vc) != null && wNVar.YFl(i10);
        }
        com.bytedance.sdk.component.vc.YFl.tN.Sg.YFl(com.bytedance.sdk.component.vc.YFl.Sg.AlY.AlY.lG(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.AlY
    public void YFl(int i10, long j3) {
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.AlY alY = this.YFl;
        if (alY != null) {
            alY.YFl(i10, j3);
        }
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.Sg sg2 = this.tN;
        if (sg2 != null) {
            sg2.YFl(i10, j3);
        }
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl yFl = this.Sg;
        if (yFl != null) {
            yFl.YFl(i10, j3);
        }
        DSW dsw = this.AlY;
        if (dsw != null) {
            dsw.YFl(i10, j3);
        }
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.vc vcVar = this.wN;
        if (vcVar != null) {
            vcVar.YFl(i10, j3);
        }
        com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.wN wNVar = this.f10461vc;
        if (wNVar != null) {
            wNVar.YFl(i10, j3);
        }
    }
}
