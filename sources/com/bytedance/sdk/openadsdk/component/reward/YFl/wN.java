package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.hQ;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN {
    private final com.bytedance.sdk.openadsdk.component.reward.view.vc Sg;
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl YFl;
    private YFl tN;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2, int i10);

        void rkt();
    }

    public wN(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.YFl = yFl;
        this.Sg = new com.bytedance.sdk.openadsdk.component.reward.view.vc(yFl);
    }

    private void NjR() {
        if (Ne.qO(this.YFl.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            if (yFl.iY) {
                yFl.Sco.Sg(true);
                this.YFl.pq.YFl(true);
            }
        }
    }

    private int qsH() {
        int xg2 = this.YFl.Sg.xg();
        if (xg2 <= 5000 && xg2 >= 0) {
            if (xg2 < 1000) {
                xg2 += 1000;
            }
            int YFl2 = com.bytedance.sdk.openadsdk.core.lG.AlY().YFl(this.YFl.Sg.kU());
            if (YFl2 <= 5000 && YFl2 >= 0) {
                if (YFl2 < 1000) {
                    YFl2 += 1000;
                }
                return Math.min(xg2, YFl2);
            }
        }
        return -1;
    }

    public void AlY() {
        YFl(true);
    }

    public boolean DSW() {
        return this.Sg.vc();
    }

    public void Sg() {
        this.Sg.tN();
    }

    public void YFl() {
        this.Sg.YFl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.model.Ne.NjR(r5.YFl.Sg) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean tN(com.bytedance.sdk.openadsdk.component.reward.Sg.Sg r6) {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            int r1 = r5.qsH()
            r0.qsH = r1
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            int r1 = r0.qsH
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            boolean r0 = r0.wN()
            r1 = 0
            if (r0 != 0) goto L91
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            int r2 = r0.qsH
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L4f
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.Ne.qsH(r0)
            if (r0 == 0) goto L33
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa r0 = r0.mn
            boolean r0 = r0.Wwa()
            if (r0 == 0) goto L33
            r6.bZ()
            goto L75
        L33:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.Ne.nc(r0)
            if (r0 == 0) goto L4b
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa r0 = r0.mn
            boolean r0 = r0.Wwa()
            if (r0 == 0) goto L4b
            r6.bZ()
            goto L75
        L4b:
            r6.EH()
            goto L73
        L4f:
            if (r2 < 0) goto L75
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.wXo
            r6.set(r1)
            android.os.Message r6 = android.os.Message.obtain()
            r0 = 700(0x2bc, float:9.81E-43)
            r6.what = r0
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            int r2 = r0.qsH
            r6.arg1 = r2
            com.bytedance.sdk.component.utils.bZ r0 = r0.zG
            r0.sendMessage(r6)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r6 = r5.YFl
            com.bytedance.sdk.openadsdk.core.model.Wwa r6 = r6.Sg
            boolean r6 = com.bytedance.sdk.openadsdk.core.model.Ne.NjR(r6)
            if (r6 != 0) goto L75
        L73:
            r6 = r4
            goto L76
        L75:
            r6 = r1
        L76:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r5.YFl
            com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa r0 = r0.mn
            boolean r0 = r0.YI()
            if (r0 == 0) goto L81
            goto L82
        L81:
            r1 = r6
        L82:
            if (r1 == 0) goto L90
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r6 = r5.YFl
            com.bytedance.sdk.openadsdk.utils.eT r0 = r6.Bn
            if (r0 == 0) goto L90
            int r6 = r6.qsH
            long r1 = (long) r6
            r0.YFl(r1)
        L90:
            return r4
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.YFl.wN.tN(com.bytedance.sdk.openadsdk.component.reward.Sg.Sg):boolean");
    }

    public YFl vc() {
        return this.tN;
    }

    public boolean wN() {
        com.bytedance.sdk.openadsdk.component.reward.view.vc vcVar = this.Sg;
        if (vcVar != null) {
            return vcVar.wN();
        }
        return false;
    }

    public void Sg(com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        com.bytedance.sdk.openadsdk.utils.eT eTVar;
        int IXB = this.YFl.Sg.IXB();
        boolean z10 = true;
        if (Ne.Wwa(this.YFl.Sg)) {
            IXB = (this.YFl.Sg.VJb() + 1) * 1000;
        }
        if (IXB != -1) {
            if (IXB >= 0) {
                this.YFl.Sco.AlY(false);
                if (Ne.qsH(this.YFl.Sg)) {
                    if (Ne.VOe(this.YFl.Sg) && this.YFl.UZM.DSW()) {
                        this.YFl.zG.sendEmptyMessageDelayed(600, IXB);
                    } else {
                        this.YFl.zG.sendEmptyMessageDelayed(1, IXB);
                    }
                } else {
                    this.YFl.zG.sendEmptyMessageDelayed(600, IXB);
                }
            }
            z10 = false;
        } else if (Ne.qsH(this.YFl.Sg)) {
            if (Ne.VOe(this.YFl.Sg) && this.YFl.UZM.DSW()) {
                sg2.EH();
            } else {
                sg2.bZ();
            }
            z10 = false;
        } else {
            sg2.EH();
        }
        if (!z10 || (eTVar = this.YFl.Bn) == null) {
            return;
        }
        eTVar.YFl(IXB);
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.Sg.wN wNVar) {
        this.Sg.YFl(wNVar);
    }

    public void YFl(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2, int i10) {
        int i11;
        if (this.YFl != null) {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("videoForceBreak", this.YFl.Sg);
        }
        Objects.toString(sg2);
        if (this.YFl.UI.isFinishing() || sg2 == null) {
            return;
        }
        this.YFl.lu.YoT();
        if (z11) {
            this.YFl.EH.set(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        boolean z13 = false;
        if (yFl.in && !yFl.rkt.get() && !com.bytedance.sdk.openadsdk.core.model.rkt.qsH(this.YFl.Sg) && (!com.bytedance.sdk.openadsdk.core.model.rkt.Sg(this.YFl.Sg) || !this.YFl.EH.get() || !this.YFl.lG.get())) {
            if (com.bytedance.sdk.openadsdk.core.model.rkt.Sg(this.YFl.Sg) && z12) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.model.rkt.Sg(this.YFl.Sg) || com.bytedance.sdk.openadsdk.core.model.rkt.tN(this.YFl.Sg) || com.bytedance.sdk.openadsdk.core.model.rkt.AlY(this.YFl.Sg)) {
                this.YFl.Sco.tN(false);
                sg2.EH();
                return;
            }
        }
        if (this.YFl.UI.isDestroyed() || this.YFl.UI.isFinishing()) {
            return;
        }
        if (this.YFl.Sg.Pj()) {
            com.bytedance.sdk.openadsdk.component.reward.view.qsH qsh = this.YFl.YI;
            com.bytedance.sdk.openadsdk.core.qsH.tN brandBannerController = (qsh == null || qsh.YFl() == null) ? null : qsh.YFl().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.Sg();
            }
            this.YFl.UI.finish();
            return;
        }
        YFl yFl2 = this.tN;
        if (yFl2 != null) {
            yFl2.YFl(z10, z11, z12, sg2, i10);
            return;
        }
        this.YFl.VOe.GA();
        this.YFl.mn.dXO();
        this.YFl.eT.set(false);
        this.YFl.YoT.set(false);
        this.YFl.hQ.YFl();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
        pDU pdu = yFl3.Sco;
        if (!yFl3.DSW && yFl3.Sg.Gnp()) {
            z13 = true;
        }
        pdu.YFl(z13);
        if (this.YFl.f10590nc.getAndSet(true)) {
            return;
        }
        if (Ne.Sg(this.YFl.Sg)) {
            HashMap hashMap = new HashMap();
            if (this.YFl.mn.lu()) {
                i11 = 1;
            } else {
                i11 = !this.YFl.mn.qO() ? -1 : 2;
            }
            hashMap.put("webview_state", Integer.valueOf(i11));
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = this.YFl;
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(yFl4.Sg, yFl4.wN, z10, z11, z12, yFl4.UI.isFinishing(), i10, hashMap);
        }
        if (this.YFl.Sg.YFl() && Ne.DSW(this.YFl.Sg) && z10) {
            this.YFl.Sco.AlY(true);
        }
        if (Ne.DSW(this.YFl.Sg)) {
            this.YFl.Sco.tN(true);
        }
        NjR();
        if (Ne.wN(this.YFl.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl5 = this.YFl;
            if (yFl5.iY) {
                yFl5.Sco.tN(true);
            }
            this.YFl.lu.tN();
            com.bytedance.sdk.openadsdk.component.reward.view.qsH qsh2 = this.YFl.YI;
            if (qsh2 != null) {
                qsh2.vc();
            }
            this.YFl.UZM.Wwa();
            return;
        }
        YFl(z10, sg2);
    }

    public void tN() {
        this.Sg.AlY();
    }

    public void YFl(boolean z10, com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        EH eh2;
        if (Ne.Wwa(this.YFl.Sg)) {
            return;
        }
        this.YFl.Wwa.set(z10);
        sg2.pDU();
        boolean z11 = false;
        if (this.YFl.Sg.yn()) {
            this.YFl.Sco.AlY(false);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            yFl.Sco.AlY(Ne.Wwa(yFl.Sg));
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
        yFl2.Sco.tN(Ne.DSW(yFl2.Sg));
        if (this.YFl.Sg.YFl() && Ne.DSW(this.YFl.Sg) && z10) {
            this.YFl.Sco.AlY(true);
        }
        this.YFl.mn.Cfr();
        com.bytedance.sdk.openadsdk.core.model.rkt rktVar = this.YFl.lu.EH;
        if (rktVar != null) {
            rktVar.AlY();
        }
        this.YFl.lu.tN();
        com.bytedance.sdk.openadsdk.component.reward.view.qsH qsh = this.YFl.YI;
        if (qsh != null) {
            qsh.vc();
        }
        qsH qsh2 = this.YFl.UZM;
        if (qsh2 != null) {
            qsh2.DSW(qsH.Sg);
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(yFl3.BPI, yFl3.Sg))) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = this.YFl;
            com.bytedance.sdk.openadsdk.utils.qO.YFl(yFl4.UI, Ne.GA(yFl4.Sg), this.YFl.Sg, Sg.YFl.tN);
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.YFl.Sg) && (eh2 = this.YFl.zB) != null) {
            eh2.vc();
        }
        if (!com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(this.YFl.Sg) && (com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.YFl.Sg) || !this.YFl.mn.UI())) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl5 = this.YFl;
            if (com.bytedance.sdk.openadsdk.core.model.Wwa.YFl(yFl5.Sg, yFl5.mn.Wwa(), this.YFl.mn.zG(), this.YFl.zB.YoT(), this.YFl.mn.hQ()) || Ne.DSW(this.YFl.Sg)) {
                if (!com.bytedance.sdk.openadsdk.core.model.Wwa.AlY(this.YFl.Sg) && !Ne.DSW(this.YFl.Sg) && !com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.YFl.Sg)) {
                    this.YFl.mn.YFl(true, 0, (String) null);
                }
                if (Ne.DSW(this.YFl.Sg)) {
                    if (Ne.VOe(this.YFl.Sg) && !this.YFl.mn.lu()) {
                        if (!this.YFl.mn.Wwa()) {
                            if (this.YFl.UZM.AlY() != null) {
                                this.YFl.UZM.AlY().YFl(2);
                            }
                            this.YFl.UZM.wN();
                        } else {
                            if (this.YFl.UZM.AlY() != null) {
                                this.YFl.UZM.AlY().YFl(-1);
                            }
                            this.YFl.UZM.vc();
                            this.YFl.Sco.AlY(false);
                            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl6 = this.YFl;
                            yFl6.UZM.YFl(yFl6.dXO.wN());
                        }
                        z11 = true;
                    } else {
                        if (this.YFl.mn.lu() && this.YFl.UZM.AlY() != null) {
                            this.YFl.UZM.AlY().YFl(1);
                        }
                        Sg(sg2);
                    }
                } else {
                    tN(sg2);
                }
                if (z11) {
                    return;
                }
                YFl(sg2);
                return;
            }
        }
        AlY();
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        this.YFl.mn.YFl(0.0f);
        this.YFl.lu.YFl(0.0f);
        if (!com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.YFl.Sg)) {
            this.YFl.zB.YFl(8);
            this.YFl.mn.Sg(0);
            this.YFl.mn.ZU();
        } else {
            this.YFl.mn.Sg(8);
            this.YFl.zB.YFl(0);
            this.YFl.zB.DSW();
        }
        if (this.YFl.DSW) {
            GS.YFl((View) sg2.pDU, 0);
            this.YFl.lu.wN(8);
        }
        this.YFl.lu.tN(8);
        this.YFl.lu.DSW();
        if (com.bytedance.sdk.openadsdk.core.model.Wwa.tN(this.YFl.Sg)) {
            this.YFl.zG.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        this.YFl.zG.sendEmptyMessageDelayed(500, 100L);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        yFl.mn.YFl(yFl.iY, true);
        this.YFl.mn.tN(true);
        this.YFl.mn.Sg(true);
        hQ YoT = this.YFl.mn.YoT();
        if (YoT != null) {
            YoT.YFl("prerender_page_show", (JSONObject) null);
        }
    }

    public void YFl(boolean z10) {
        if (!com.bytedance.sdk.openadsdk.core.model.Wwa.AlY(this.YFl.Sg)) {
            this.YFl.mn.YFl(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.YFl.mn.pq();
        this.YFl.mn.Sg(8);
        this.YFl.zB.YFl(8);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        if (yFl.DSW) {
            GS.YFl((View) yFl.Vmj.pDU, 8);
            this.YFl.lu.wN(0);
        }
        this.YFl.lu.tN(8);
        if (this.YFl.Sg.yn()) {
            if (!this.Sg.YFl(this.YFl.VOe)) {
                this.YFl.UI.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.vc vcVar = this.YFl.UT;
            if (vcVar != null) {
                this.Sg.YFl(vcVar.VOe().vc());
            }
            this.Sg.Sg();
        }
        this.YFl.lu.DSW();
        if (z10) {
            tN(this.YFl.Vmj);
        }
        this.YFl.Sco.tN(false);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
        yFl2.dXO.YFl(yFl2.Sg.TMt());
    }

    public void YFl(YFl yFl) {
        this.tN = yFl;
    }
}
