package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.RCv;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.lMd;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vwr;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT {
    private final com.bytedance.sdk.openadsdk.component.reward.view.lMd lMd;
    private final zp zp;

    public COT(zp zpVar) {
        this.zp = zpVar;
        this.lMd = new com.bytedance.sdk.openadsdk.component.reward.view.lMd(zpVar);
    }

    private int HWF() {
        int VuU = this.zp.zp.VuU();
        if (VuU <= 5000 && VuU >= 0) {
            if (VuU < 1000) {
                VuU += 1000;
            }
            int zp = KVG.jU().zp(this.zp.zp.FGx());
            if (zp <= 5000 && zp >= 0) {
                if (zp < 1000) {
                    zp += 1000;
                }
                return Math.min(VuU, zp);
            }
        }
        return -1;
    }

    private void QR() {
        if (cz.vDp(this.zp.zp)) {
            zp zpVar = this.zp;
            if (zpVar.jU) {
                zpVar.Rh.lMd(true);
                this.zp.aax.zp(true);
            }
        }
    }

    public boolean COT() {
        com.bytedance.sdk.openadsdk.component.reward.view.lMd lmd = this.lMd;
        if (lmd != null) {
            return lmd.COT();
        }
        return false;
    }

    public void KS() {
        this.lMd.jU();
    }

    public void jU() {
        zp(true);
    }

    public void lMd() {
        this.lMd.KS();
    }

    public void zp() {
        this.lMd.zp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.model.cz.KS(r5.zp.zp) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean lMd(com.bytedance.sdk.openadsdk.component.reward.lMd.lMd r6) {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r5.zp
            int r1 = r5.HWF()
            r0.cz = r1
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r5.zp
            int r1 = r0.cz
            com.bytedance.sdk.openadsdk.core.model.woN r0 = r0.zp
            boolean r0 = r0.jU()
            r1 = 0
            if (r0 != 0) goto L79
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r5.zp
            int r2 = r0.cz
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L38
            com.bytedance.sdk.openadsdk.core.model.woN r0 = r0.zp
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.cz.KS(r0)
            if (r0 == 0) goto L33
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r5.zp
            com.bytedance.sdk.openadsdk.component.reward.zp.rV r0 = r0.si
            boolean r0 = r0.KVG()
            if (r0 == 0) goto L33
            r6.RCv()
            goto L5d
        L33:
            r6.KVG()
        L36:
            r6 = r4
            goto L5e
        L38:
            if (r2 < 0) goto L5d
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.WNy
            r6.set(r1)
            android.os.Message r6 = android.os.Message.obtain()
            r0 = 700(0x2bc, float:9.81E-43)
            r6.what = r0
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r5.zp
            int r2 = r0.cz
            r6.arg1 = r2
            com.bytedance.sdk.component.utils.RCv r0 = r0.qtv
            r0.sendMessage(r6)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r6 = r5.zp
            com.bytedance.sdk.openadsdk.core.model.woN r6 = r6.zp
            boolean r6 = com.bytedance.sdk.openadsdk.core.model.cz.KS(r6)
            if (r6 != 0) goto L5d
            goto L36
        L5d:
            r6 = r1
        L5e:
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r5.zp
            com.bytedance.sdk.openadsdk.component.reward.zp.rV r0 = r0.si
            boolean r0 = r0.yRU()
            if (r0 == 0) goto L69
            goto L6a
        L69:
            r1 = r6
        L6a:
            if (r1 == 0) goto L78
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r6 = r5.zp
            com.bytedance.sdk.openadsdk.utils.Bj r0 = r6.fs
            if (r0 == 0) goto L78
            int r6 = r6.cz
            long r1 = (long) r6
            r0.zp(r1)
        L78:
            return r4
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.zp.COT.lMd(com.bytedance.sdk.openadsdk.component.reward.lMd.lMd):boolean");
    }

    public void zp(com.bytedance.sdk.openadsdk.core.lMd.COT cot) {
        this.lMd.zp(cot);
    }

    public void zp(boolean z8, boolean z9, boolean z10, com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd, int i9) {
        Bj bj;
        dT dTVar;
        Objects.toString(lmd);
        if (this.zp.oB.isFinishing() || lmd == null) {
            return;
        }
        this.zp.rCC.vDp();
        if (z9) {
            this.zp.Lij.set(true);
        }
        if (!this.zp.Gzh.get() && !com.bytedance.sdk.openadsdk.core.model.dQp.ku(this.zp.zp) && (!com.bytedance.sdk.openadsdk.core.model.dQp.lMd(this.zp.zp) || !this.zp.Lij.get() || !this.zp.irS.get())) {
            if (com.bytedance.sdk.openadsdk.core.model.dQp.lMd(this.zp.zp) && z10) {
                return;
            }
            if ((com.bytedance.sdk.openadsdk.core.model.dQp.lMd(this.zp.zp) || com.bytedance.sdk.openadsdk.core.model.dQp.KS(this.zp.zp) || com.bytedance.sdk.openadsdk.core.model.dQp.jU(this.zp.zp)) && (dTVar = this.zp.Rh) != null) {
                dTVar.KS(false);
                lmd.KVG();
                return;
            }
        }
        if (this.zp.oB.isDestroyed() || this.zp.oB.isFinishing()) {
            return;
        }
        if (this.zp.zp.slc()) {
            this.zp.oB.finish();
            return;
        }
        this.zp.UPs.tG();
        this.zp.si.RCv();
        this.zp.ot.set(false);
        this.zp.yRU.set(false);
        this.zp.Iv.zp();
        zp zpVar = this.zp;
        zpVar.Rh.zp(!zpVar.pvr && zpVar.zp.bQm());
        if (this.zp.FP.getAndSet(true)) {
            return;
        }
        if (cz.lMd(this.zp.zp)) {
            zp zpVar2 = this.zp;
            com.bytedance.sdk.openadsdk.lMd.KS.zp(zpVar2.zp, zpVar2.QR, z8, z9, z10, zpVar2.oB.isFinishing(), i9);
        }
        if (this.zp.oB.KVG() && cz.lMd(this.zp.zp) && z8) {
            this.zp.Rh.jU(true);
        }
        if (cz.lMd(this.zp.zp)) {
            this.zp.Rh.KS(true);
        }
        QR();
        if (cz.Bj(this.zp.zp)) {
            return;
        }
        this.zp.QUv.set(z8);
        lmd.dQp();
        if (this.zp.zp.Fm()) {
            this.zp.Rh.jU(false);
        } else {
            zp zpVar3 = this.zp;
            zpVar3.Rh.jU(cz.Bj(zpVar3.zp));
        }
        zp zpVar4 = this.zp;
        zpVar4.Rh.KS(cz.lMd(zpVar4.zp));
        if (this.zp.oB.KVG() && cz.lMd(this.zp.zp) && z8) {
            this.zp.Rh.jU(true);
        }
        this.zp.si.Lij();
        com.bytedance.sdk.openadsdk.core.model.dQp dqp = this.zp.rCC.dQp;
        if (dqp != null) {
            dqp.jU();
        }
        this.zp.rCC.KS();
        com.bytedance.sdk.openadsdk.component.reward.view.KS ks = this.zp.eWG;
        if (ks != null) {
            ks.HWF();
        }
        zp zpVar5 = this.zp;
        if (!TextUtils.isEmpty(woN.zp(zpVar5.fgJ, zpVar5.zp))) {
            zp zpVar6 = this.zp;
            vwr.zp(zpVar6.oB, cz.HWF(zpVar6.zp), this.zp.zp, lMd.zp.KS);
            return;
        }
        if (woN.KS(this.zp.zp) && (bj = this.zp.DY) != null) {
            bj.COT();
        }
        if (!woN.zp(this.zp.zp) && (woN.KS(this.zp.zp) || !this.zp.si.eWG())) {
            zp zpVar7 = this.zp;
            if (woN.zp(zpVar7.zp, zpVar7.si.KVG(), this.zp.ffE.jU(), this.zp.DY.dT(), this.zp.si.Gzh()) || cz.lMd(this.zp.zp)) {
                if (!woN.jU(this.zp.zp) && !cz.lMd(this.zp.zp) && !woN.KS(this.zp.zp)) {
                    this.zp.si.zp(true, 0, (String) null);
                }
                this.zp.si.zp(0.0f);
                this.zp.rCC.zp(0.0f);
                if (!woN.KS(this.zp.zp)) {
                    this.zp.DY.zp(8);
                    this.zp.si.lMd(0);
                    this.zp.si.Pxi();
                } else {
                    this.zp.si.lMd(8);
                    this.zp.DY.zp(0);
                    this.zp.DY.HWF();
                }
                if (this.zp.pvr) {
                    WNy.zp((View) lmd.rV, 0);
                    this.zp.rCC.HWF(8);
                }
                if (cz.lMd(this.zp.zp)) {
                    if (cz.KVG(this.zp.zp) && !this.zp.si.fRl()) {
                        if (!this.zp.si.KVG()) {
                            this.zp.ffE.ku();
                        } else {
                            this.zp.ffE.YW();
                            this.zp.Rh.jU(false);
                            zp zpVar8 = this.zp;
                            zpVar8.ffE.zp(zpVar8.oKZ.COT());
                        }
                    } else {
                        zp(lmd);
                    }
                } else {
                    lMd(lmd);
                }
                this.zp.rCC.jU(8);
                this.zp.rCC.QR();
                if (woN.KS(this.zp.zp)) {
                    this.zp.qtv.sendEmptyMessageDelayed(800, 100L);
                    return;
                }
                this.zp.qtv.sendEmptyMessageDelayed(500, 100L);
                zp zpVar9 = this.zp;
                zpVar9.si.zp(zpVar9.jU, true);
                this.zp.si.KS(true);
                this.zp.si.lMd(true);
                RCv dT = this.zp.si.dT();
                if (dT != null) {
                    dT.zp("prerender_page_show", (JSONObject) null);
                    return;
                }
                return;
            }
        }
        jU();
    }

    public void zp(com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd) {
        int eyb = this.zp.zp.eyb();
        if (cz.Bj(this.zp.zp)) {
            eyb = (this.zp.zp.iOI() + 1) * 1000;
        }
        if (eyb == -1) {
            if (cz.KS(this.zp.zp)) {
                if (cz.KVG(this.zp.zp) && this.zp.ffE.woN()) {
                    lmd.KVG();
                    return;
                } else {
                    lmd.RCv();
                    return;
                }
            }
            lmd.KVG();
        } else {
            if (eyb < 0) {
                return;
            }
            this.zp.Rh.jU(false);
            if (cz.KS(this.zp.zp)) {
                if (cz.KVG(this.zp.zp) && this.zp.ffE.woN()) {
                    this.zp.qtv.sendEmptyMessageDelayed(600, eyb);
                } else {
                    this.zp.qtv.sendEmptyMessageDelayed(1, eyb);
                    return;
                }
            } else {
                this.zp.qtv.sendEmptyMessageDelayed(600, eyb);
            }
        }
        com.bytedance.sdk.openadsdk.utils.Bj bj = this.zp.fs;
        if (bj != null) {
            bj.zp(eyb);
        }
    }

    public void zp(boolean z8) {
        if (!woN.jU(this.zp.zp)) {
            this.zp.si.zp(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.zp.si.irS();
        this.zp.si.lMd(8);
        this.zp.DY.zp(8);
        zp zpVar = this.zp;
        if (zpVar.pvr) {
            WNy.zp((View) zpVar.Vjb.rV, 8);
            this.zp.rCC.HWF(0);
        }
        this.zp.rCC.jU(8);
        if (this.zp.zp.Fm()) {
            if (!this.lMd.zp(this.zp.UPs)) {
                this.zp.oB.finish();
            }
        } else {
            this.lMd.lMd();
        }
        this.zp.rCC.QR();
        if (z8) {
            lMd(this.zp.Vjb);
        }
        this.zp.Rh.KS(false);
        zp zpVar2 = this.zp;
        zpVar2.oKZ.zp(zpVar2.oB.dQp());
    }
}
