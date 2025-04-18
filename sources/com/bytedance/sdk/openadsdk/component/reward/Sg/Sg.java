package com.bytedance.sdk.openadsdk.component.reward.Sg;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import com.bytedance.sdk.openadsdk.activity.Sg;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.YoT;
import com.bytedance.sdk.openadsdk.component.reward.YFl.pDU;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.nc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.eT;
import java.util.List;
import java.util.Objects;
import p5.a;

/* loaded from: classes.dex */
public abstract class Sg extends com.bytedance.sdk.openadsdk.component.reward.Sg.YFl {
    private com.bytedance.sdk.openadsdk.YoT.wN EH;
    public com.bytedance.sdk.openadsdk.core.widget.Sg GA;
    protected com.bytedance.sdk.openadsdk.core.Sg.wN YoT;
    protected String eT;
    public LinearLayout pDU;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(boolean z10);
    }

    public Sg(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        super(yFl);
    }

    public YFl AlY() {
        return null;
    }

    public abstract void DSW();

    public void EH() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        if (yFl.DSW) {
            return;
        }
        yFl.Sco.vc();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
        if (!yFl2.uGS || !(yFl2.UT instanceof com.bytedance.sdk.openadsdk.activity.YFl)) {
            yFl2.lu.wN(0);
        }
    }

    public void GA() {
    }

    public final void Ga() {
        String str;
        if (this.YFl.UI.isFinishing()) {
            return;
        }
        this.YFl.mn.EH();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        if (yFl.AlY) {
            str = "reward_endcard";
        } else {
            str = "fullscreen_endcard";
        }
        yFl.mn.YFl(this.EH, str, yFl.ZU);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
        yFl2.UZM.YFl(this.EH, yFl2.iY);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
        yFl3.mn.YFl(str, yFl3.ZU);
        this.YFl.mn.wN();
    }

    public void Ne() {
        com.bytedance.sdk.openadsdk.component.reward.view.qsH qsh = this.YFl.YI;
        if (qsh != null) {
            qsh.vc();
        }
        nc ncVar = this.YFl.lu;
        if (ncVar != null) {
            ncVar.pDU();
        }
        this.YFl.VOe.UZM();
        if (!wN()) {
            this.YFl.f10590nc.get();
        }
        this.YFl.mn.rkt();
        this.YFl.UZM.DSW(com.bytedance.sdk.openadsdk.component.reward.YFl.qsH.YFl);
        this.YFl.lu.YoT();
        this.YFl.GS.tN();
        this.YFl.Ga.Sg();
        eT eTVar = this.YFl.Bn;
        if (eTVar != null) {
            eTVar.tN();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00fb, code lost:
    
        if (r2.YFl == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View NjR() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Sg.Sg.NjR():android.view.View");
    }

    public void UZM() {
        this.YoT = this.YFl.dXO.tN();
    }

    public void VOe() {
        int qO;
        com.bytedance.sdk.openadsdk.component.reward.YFl.qsH qsh;
        pDU pdu;
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        if (yFl.AlY) {
            if (Ne.tN(yFl.Sg)) {
                qO = lG.AlY().YFl(String.valueOf(this.YFl.f10591vc), true);
            } else {
                qO = lG.AlY().nc(String.valueOf(this.YFl.f10591vc));
            }
        } else if (Ne.tN(yFl.Sg)) {
            qO = lG.AlY().YFl(String.valueOf(this.YFl.f10591vc), false);
        } else {
            qO = lG.AlY().qO(String.valueOf(this.YFl.f10591vc));
        }
        nc ncVar = this.YFl.lu;
        if (ncVar != null && ncVar.NjR()) {
            nc ncVar2 = this.YFl.lu;
            if (ncVar2 != null) {
                ncVar2.nc().performClick();
                return;
            }
            return;
        }
        if ((!this.YFl.f10590nc.get() || Ne.Wwa(this.YFl.Sg)) && qO != -1) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = this.YFl.VOe;
            if (((lGVar != null && lGVar.qsH() >= qO * 1000) || ((qsh = this.YFl.UZM) != null && qsh.AlY(qO))) && (pdu = this.YFl.Sco) != null) {
                pdu.AlY();
            }
        }
    }

    public void Wwa() {
        int i10;
        if (this.YFl.f10590nc.get()) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            if (!yFl.DSW && yFl.wXo.getAndSet(false) && ((i10 = this.YFl.qsH) >= 0 || i10 == -1)) {
                Message obtain = Message.obtain();
                obtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
                obtain.arg1 = yFl2.qsH;
                yFl2.zG.sendMessage(obtain);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
        if (yFl3.NjR > 0 && yFl3.Ne.getAndSet(false)) {
            Message obtain2 = Message.obtain();
            obtain2.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = this.YFl;
            obtain2.arg1 = yFl4.NjR;
            yFl4.zG.sendMessage(obtain2);
        }
    }

    public abstract void YFl(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.Sg.YFl
    public void YFl(com.bytedance.sdk.openadsdk.core.GA.AlY.Sg sg2, bZ bZVar) {
        super.YFl(sg2, bZVar);
        if (this.YFl.Sg.YFl()) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            if (yFl.in) {
                yFl.mn.YFl(false);
            }
        }
        if (Ne.Wwa(this.YFl.Sg)) {
            this.YFl.UZM.YoT();
        }
    }

    public void YI() {
        Wwa wwa;
        if (!vc() && ((this instanceof DSW) || (this instanceof qsH))) {
            this.YFl.dXO.Sg();
            return;
        }
        if (!this.NjR.YFl(this.wN.NjR(), false)) {
            this.f10577nc.removeMessages(300);
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            if (yFl.uGS) {
                com.bytedance.sdk.openadsdk.activity.vc vcVar = yFl.UT;
                if (vcVar instanceof com.bytedance.sdk.openadsdk.activity.YFl) {
                    ((com.bytedance.sdk.openadsdk.activity.YFl) vcVar).wXo();
                }
            }
            YFl(Sg.C0098Sg.YFl);
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = this.wN;
            lGVar.YFl(!lGVar.Ga() ? 1 : 0, 4);
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
        if (yFl2 != null && (wwa = yFl2.Sg) != null && yFl2.Bn != null && wwa.Pj()) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
            yFl3.Bn.YFl(yFl3.VOe.aIu());
        }
    }

    public void YoT() {
        LinearLayout linearLayout = (LinearLayout) this.YFl.mB.findViewById(GA.GA);
        this.pDU = linearLayout;
        GS.YFl((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        yFl.lL = new YoT(yFl.UI, yFl.Sg, "landingpage_endcard");
        this.YFl.lL.tN().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Sg.Sg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Sg.this.YFl.lu.nc().performClick();
            }
        });
        this.pDU.addView(this.YFl.lL.wN(), new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
        yFl2.mn.YFl(yFl2.lL);
    }

    public void aIu() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        if (yFl == null) {
            return;
        }
        yFl.Bh = false;
        boolean z10 = yFl.iY;
        if (!yFl.eT.get()) {
            this.YFl.VOe.nc();
        }
        rkt();
        this.YFl.mn.wXo();
        this.YFl.UZM.rkt();
        this.YFl.Ne.set(true);
        if (this.YFl.f10590nc.get()) {
            this.YFl.wXo.set(true);
        }
        eT eTVar = this.YFl.Bn;
        if (eTVar != null) {
            eTVar.Sg();
        }
        this.YFl.Sg();
    }

    public void bZ() {
        this.YFl.Sco.tN();
        this.YFl.Sco.wN(true);
    }

    public boolean dXO() {
        return true;
    }

    public void eT() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        yFl.Ga.YFl(yFl.AlY);
        this.YFl.lu.Sg();
        this.YFl.GS.YFl();
        if (!this.YFl.Sg.yn()) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
            if (yFl2.DSW && TextUtils.isEmpty(Wwa.YFl(yFl2.BPI, this.Sg))) {
                YoT();
            }
            this.YFl.mn.YFl();
            this.YFl.zB.YFl();
        }
        this.YFl.UZM.EH();
        this.YFl.Sco.YFl();
        if (Ne.DSW(this.YFl.Sg)) {
            com.bytedance.sdk.component.NjR.AlY nc2 = this.YFl.mn.nc();
            if (nc2 != null) {
                nc2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.YFl.mn.eT().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.YFl.Sco.tN(true);
            if (Ne.Wwa(this.YFl.Sg)) {
                this.YFl.lu.AlY();
                GS.YFl((View) nc2, 4);
                GS.YFl((View) this.YFl.mn.eT(), 0);
            }
        }
        if (Ne.vc(this.YFl.Sg)) {
            this.YFl.lu.AlY();
            GS.YFl((View) this.YFl.mn.nc(), 4);
        }
        if (!rkt.tN(this.YFl.Sg) && !rkt.Sg(this.YFl.Sg) && !rkt.AlY(this.YFl.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
            yFl3.lu.YFl(GS.tN(yFl3.BPI, yFl3.Jc), GS.tN(this.YFl.BPI, r4.RX));
            this.YFl.bZ.YFl();
            if (Ne.Wwa(this.YFl.Sg)) {
                this.YFl.mn.YFl(true);
                this.YFl.mn.wN();
                YFl(false, false, false, Sg.C0098Sg.tN);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = this.YFl;
                if (yFl4.zz) {
                    yFl4.lu.YFl(0);
                }
            }
        }
    }

    public void lG() {
        if (!Ne.nc(this.Sg) || this.YFl.mn.mB()) {
            Wwa();
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        if (yFl == null) {
            return;
        }
        eT eTVar = yFl.Bn;
        if (eTVar != null) {
            eTVar.YFl();
        }
        this.YFl.YFl();
    }

    public View nc() {
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw;
        if (this.Sg.Cfr() != 5) {
            dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(this.YFl.UI);
            dsw.setId(GA.ivp);
        } else {
            dsw = null;
        }
        Objects.toString(dsw);
        return dsw;
    }

    public void pDU() {
        com.bytedance.sdk.openadsdk.core.widget.Sg sg2 = this.GA;
        if (sg2 != null && sg2.isShowing()) {
            this.GA.dismiss();
        }
    }

    public void qO() {
    }

    public RFEndCardBackUpLayout qsH() {
        return new RFEndCardBackUpLayout(this.YFl.BPI);
    }

    public void rkt() {
        this.f10577nc.removeMessages(300);
    }

    public abstract boolean vc();

    public abstract boolean wN();

    public void wXo() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        if (yFl == null) {
            return;
        }
        nc ncVar = yFl.lu;
        if (ncVar != null) {
            ncVar.rkt();
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
        boolean z10 = yFl2.iY;
        yFl2.pq.YFl();
        DeviceUtils.DSW();
        this.YFl.mn.aIu();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
        if (yFl3.iY) {
            yFl3.UI.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Sg.Sg.2
                @Override // java.lang.Runnable
                public void run() {
                    if (Sg.this.YFl.pq.YFl() > 0) {
                        Sg.this.YFl.pq.YFl(false);
                    }
                }
            });
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.reward.view.DSW dsw) {
        YFl(dsw, this.YFl);
    }

    public void YFl(boolean z10, boolean z11, boolean z12, int i10) {
        this.YFl.GS.YFl(z10, z11, z12, this, i10);
    }

    public void YFl(int i10) {
        this.wN.GA();
        YFl(false, true, false, i10);
        if (this.YFl.AlY) {
            this.NjR.YFl(10000);
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.YoT.wN wNVar) {
        this.EH = wNVar;
        tN();
        if (!this.YFl.Sg.yn() && dXO()) {
            Ga();
        }
        if (dXO()) {
            this.YFl.GS.Sg();
        }
        if (rkt.tN(this.YFl.Sg) || rkt.AlY(this.YFl.Sg)) {
            this.f10577nc.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
        yFl.lu.YFl(yFl.VB == 100.0f);
        UZM();
        DSW();
    }

    public void YFl(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            bZ();
            return;
        }
        if (i10 == 300) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.YFl;
            if (yFl.uGS) {
                com.bytedance.sdk.openadsdk.activity.vc vcVar = yFl.UT;
                if (vcVar instanceof com.bytedance.sdk.openadsdk.activity.YFl) {
                    ((com.bytedance.sdk.openadsdk.activity.YFl) vcVar).wXo();
                    if (this.YFl.Sg.Af() != null || this.YFl.Sg.Af().YFl() == null) {
                        return;
                    }
                    this.YFl.Sg.Af().YFl().YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.GENERAL_LINEAR_AD_ERROR);
                    return;
                }
            }
            YFl(Sg.C0098Sg.Sg);
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = this.YFl.VOe;
            lGVar.YFl(!lGVar.Ga() ? 1 : 0, 1 ^ (this.YFl.VOe.Ga() ? 1 : 0));
            if (this.YFl.Sg.Af() != null) {
                return;
            } else {
                return;
            }
        }
        if (i10 == 400) {
            this.YFl.VOe.GA();
            YFl(false, true, false, 3);
            return;
        }
        if (i10 == 500) {
            if (!Ne.DSW(this.YFl.Sg)) {
                this.YFl.Sco.tN(false);
            }
            com.bytedance.sdk.component.NjR.AlY nc2 = this.YFl.mn.nc();
            if (nc2 != null && nc2.getWebView() != null) {
                nc2.NjR();
                nc2.getWebView().resumeTimers();
            }
            if (this.YFl.mn.nc() != null) {
                this.YFl.mn.YFl(1.0f);
                this.YFl.lu.YFl(1.0f);
            }
            if (!this.YFl.Sg.TMt() && this.YFl.VOe.Sg() && this.YFl.Wwa.get()) {
                this.YFl.VOe.GA();
                return;
            }
            return;
        }
        if (i10 == 600) {
            EH();
            return;
        }
        if (i10 == 700) {
            int i11 = message.arg1;
            if (this.YFl.wXo.get()) {
                return;
            }
            if (i11 > 0) {
                this.YFl.Sco.Sg();
                this.YFl.Sco.YFl((i11 / 1000) + "s");
                this.YFl.Sco.wN(false);
                Message obtain = Message.obtain();
                obtain.what = 700;
                obtain.arg1 = i11 - 1000;
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.YFl;
                yFl2.qsH -= 1000;
                this.f10577nc.sendMessageDelayed(obtain, 1000L);
                return;
            }
            this.f10577nc.removeMessages(700);
            if (Ne.NjR(this.Sg)) {
                if (!this.YFl.UZM.DSW() && this.YFl.mn.Wwa()) {
                    bZ();
                    return;
                } else {
                    EH();
                    return;
                }
            }
            EH();
            return;
        }
        if (i10 != 800) {
            if (i10 == 900 && !this.YFl.Ne.get()) {
                int i12 = message.arg1;
                double dXO = this.YFl.VOe.dXO();
                YFl(i12, (long) (1000.0d * dXO));
                if (i12 > 0) {
                    this.YFl.Sco.Sg();
                    this.YFl.Sco.YFl((i12 / 1000) + "s");
                    this.YFl.Sco.wN(false);
                    Message obtain2 = Message.obtain();
                    obtain2.what = 900;
                    int i13 = i12 - 1000;
                    obtain2.arg1 = i13;
                    this.YFl.NjR = i13;
                    this.f10577nc.sendMessageDelayed(obtain2, 1000L);
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.YFl;
                    if (yFl3.uGS) {
                        com.bytedance.sdk.openadsdk.activity.vc vcVar2 = yFl3.UT;
                        if (!(vcVar2 instanceof com.bytedance.sdk.openadsdk.activity.YFl) || dXO <= 0.0d) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.activity.YFl) vcVar2).YFl((float) (1.0d - ((i12 / 1000.0f) / dXO)));
                        return;
                    }
                    return;
                }
                this.f10577nc.removeMessages(900);
                EH();
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = this.YFl;
                com.bytedance.sdk.openadsdk.activity.vc vcVar3 = yFl4.UT;
                if (yFl4.uGS && (vcVar3 instanceof com.bytedance.sdk.openadsdk.activity.YFl)) {
                    vcVar3.VOe().YFl(vcVar3, new Sg.wN(5));
                    return;
                }
                return;
            }
            return;
        }
        if (!Ne.DSW(this.YFl.Sg)) {
            this.YFl.Sco.tN(false);
        }
        this.YFl.lu.YFl(1.0f);
        if (!this.YFl.Sg.TMt() && this.YFl.VOe.Sg() && this.YFl.Wwa.get()) {
            this.YFl.VOe.GA();
        }
    }

    private void YFl(long j3, long j10) {
        Activity activity = this.YFl.UI;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).YFl(j10 - j3, j10);
        }
    }

    public static void YFl(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        final com.bytedance.sdk.openadsdk.core.wN.AlY alY;
        Context context = frameLayout.getContext();
        if (yFl.in) {
            com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
            tNVar.setId(GA.f10821nc);
            frameLayout.addView(tNVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout YFl2 = YFl(context);
            String str = "";
            if (Wwa.wN(yFl.Sg)) {
                a BPI = yFl.Sg.BPI();
                if (BPI != null) {
                    str = BPI.f23461f;
                }
            } else {
                List<EH> VB = yFl.Sg.VB();
                if (VB != null && !VB.isEmpty()) {
                    str = VB.get(0).YFl();
                }
            }
            if (TextUtils.isEmpty(str)) {
                alY = null;
            } else {
                alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
                int i10 = GA.rnG;
                alY.setId(i10);
                alY.setTag(i10, str);
                alY.setScaleType(ImageView.ScaleType.CENTER_CROP);
                YFl2.addView(alY);
            }
            tNVar.addView(YFl2);
            View tNVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.tN(context);
            tNVar2.setId(GA.YoT);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(tNVar2, layoutParams);
            tNVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Sg.Sg.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View findViewById = com.bytedance.sdk.openadsdk.component.reward.YFl.YFl.this.mB.findViewById(520093757);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View findViewById2 = com.bytedance.sdk.openadsdk.component.reward.YFl.YFl.this.mB.findViewById(GA.Pj);
                    if (findViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View findViewById3 = com.bytedance.sdk.openadsdk.component.reward.YFl.YFl.this.mB.findViewById(GA.HaH);
                    if (findViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = findViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = alY;
                    if (alY2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = alY2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            alY.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
            wNVar.setId(GA.GA);
            wNVar.setOrientation(1);
            wNVar.setVisibility(8);
            frameLayout.addView(wNVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (yFl.ko) {
            View alY2 = new com.bytedance.sdk.component.NjR.AlY(context, true);
            alY2.setId(GA.pDU);
            alY2.setLayerType(2, null);
            alY2.setVisibility(4);
            frameLayout.addView(alY2, new FrameLayout.LayoutParams(-1, -1));
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(GA.EH);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (Ne.Sg(yFl.Sg)) {
                View tNVar3 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
                tNVar3.setId(GA.ynx);
                tNVar3.setVisibility(4);
                frameLayout.addView(tNVar3, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        View alY3 = new com.bytedance.sdk.component.NjR.AlY(context, true);
        alY3.setId(GA.rkt);
        alY3.setVisibility(8);
        frameLayout.addView(alY3, new FrameLayout.LayoutParams(-1, -1));
    }

    public static FrameLayout YFl(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar.setId(GA.eT);
        tNVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        tNVar.setLayoutParams(layoutParams);
        return tNVar;
    }
}
