package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.Sg;
import com.bytedance.sdk.openadsdk.component.reward.YFl.lG;
import com.bytedance.sdk.openadsdk.component.reward.YFl.wN;
import com.bytedance.sdk.openadsdk.component.reward.view.qsH;
import com.bytedance.sdk.openadsdk.core.GA.AlY.YFl;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.aIu;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.l;
import p5.c;
import r5.a;

/* loaded from: classes.dex */
public abstract class YFl extends vc implements bZ.YFl, wN.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg {
    protected int AlY;
    private Bundle DSW;
    private boolean EH;
    private int GA;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.Sg.Sg Sg;
    protected final bZ YFl;
    private boolean pDU;
    protected com.bytedance.sdk.openadsdk.component.reward.YFl.YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10549vc;
    private final AtomicBoolean wN;

    public YFl(Sg sg2, Wwa wwa, int i10) {
        super(sg2, wwa, i10);
        this.YFl = new bZ(Looper.getMainLooper(), this);
        this.wN = new AtomicBoolean(false);
        this.f10549vc = 1;
        this.GA = 0;
        this.pDU = false;
    }

    private void Cfr() {
        this.Sg.YFl(this.YoT);
        this.AlY = (int) this.tN.VOe.dXO();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        if (yFl.uGS) {
            YFl(yFl.dXO.wN());
            YFl(this.tN.dXO.AlY());
        }
        tN();
        mn();
        if (this.tN.Sg.Af() != null && this.tN.Sg.Af().YFl() != null) {
            this.tN.Sg.Af().YFl().YFl(0L);
        }
    }

    private void Ne() {
        this.tN.mB.YFl(this.Sg);
        this.Sg.YFl(this, this.YFl);
        this.Sg.eT();
    }

    private boolean hQ() {
        if (this.tN.f10590nc.get() && this.tN.DSW) {
            return false;
        }
        if (this.qsH.YFl()) {
            return this.tN.f10590nc.get();
        }
        return true;
    }

    private void mn() {
        if (!this.qsH.YFl()) {
            if (Ne.Wwa(this.tN.Sg)) {
                YFl(false, Sg.C0098Sg.tN);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
            if (sg2 != null) {
                sg2.YFl(this.tN.lu.vc());
                this.Sg.YI();
            }
        }
    }

    private void pq() {
        if (!this.qsH.YFl() || this.pDU) {
            return;
        }
        this.pDU = true;
        YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                YFl yFl = YFl.this;
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = yFl.tN;
                com.bytedance.sdk.openadsdk.component.reward.YFl.vc vcVar = yFl2.Cfr;
                float[] YFl = yFl2.Ga.YFl(yFl.f10549vc);
                YFl yFl3 = YFl.this;
                vcVar.YFl(YFl, yFl3, yFl3.Sg);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void AlY() {
        dXO();
        this.tN.Sg.OPr();
        this.tN.Sg.YFl(true);
        if (Wwa.wN(this.tN.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
            Wwa wwa = yFl.Sg;
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, yFl.wN, wwa.iyg());
        }
    }

    public abstract void DSW();

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void EH() {
        super.EH();
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.Ne();
    }

    public final void GA() {
        this.YFl.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void NjR() {
        this.tN.VOe.Cfr();
    }

    public abstract void Sg();

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public final void Sg(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2;
        super.Sg(activity);
        if (this.tN == null || (sg2 = this.Sg) == null) {
            return;
        }
        sg2.lG();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        yFl.Bh = true;
        yFl.Ga.Sg(this.YFl);
        if (hQ()) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.tN;
            yFl2.Sco.YFl(yFl2.Sg.Gnp());
        }
        this.tN.lu.EH();
        this.tN.mn.Ne();
        this.tN.UZM.GA();
        if (this.Sg.Sg()) {
            this.tN.VOe.YFl(this.Sg);
            this.tN.VOe.YFl(false, this, this.GA != 0);
        }
        this.GA++;
        pq();
        qsH qsh = this.tN.YI;
        if (qsh != null) {
            qsh.DSW();
        }
        this.tN.Ga.YFl(this.YFl);
        this.Sg.qO();
    }

    public void Wwa() {
        com.bytedance.sdk.openadsdk.core.GA.YFl.Sg YFl = Wwa.YFl(((l) CacheDirFactory.getICacheDir(this.qsH.dBO())).d(), this.qsH);
        YFl.YFl("material_meta", this.qsH);
        YFl.YFl("ad_slot", this.qsH.pq());
        com.bytedance.sdk.openadsdk.core.GA.wN.YFl.YFl(YFl, new a() { // from class: com.bytedance.sdk.openadsdk.activity.YFl.3
            @Override // r5.b
            public void YFl(c cVar, int i10) {
            }

            @Override // r5.b
            public void YFl(c cVar, int i10, String str) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(int i10) {
    }

    public abstract void YFl(Bundle bundle);

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YoT() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public String aIu() {
        return this.tN.fIu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void eT() {
        if (this.tN.pDU.getAndSet(true) && !Ne.tN(this.tN.Sg)) {
            return;
        }
        this.tN.dXO.YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void lG() {
        super.lG();
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 != null) {
            sg2.VOe();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final View nc() {
        return this.tN.VOe.hQ();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void pDU() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public boolean qO() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        return yFl != null && yFl.VOe.bZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void qsH() {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.GA();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.wN.YFl
    public void rkt() {
        tN wN;
        Sg VOe = VOe();
        if (VOe != null && (wN = VOe.wN()) != null) {
            wN.wN();
        }
    }

    public abstract void tN();

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void tN(Activity activity) {
        super.tN(activity);
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.wXo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void vc() {
        if (!this.wN.compareAndSet(false, true)) {
            return;
        }
        aIu.YFl("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
        DSW();
    }

    public final void wN() {
        Message message = new Message();
        message.what = 400;
        if (this.qsH.TMt()) {
            YFl(10000);
        }
        this.YFl.sendMessageDelayed(message, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public void wXo() {
        VOe().YFl(this, Sg(Sg.C0098Sg.Sg));
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public final void YFl(Activity activity, Bundle bundle) {
        this.DSW = bundle;
        super.YFl(activity, bundle);
        YFl(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public final void AlY(Activity activity) {
        super.AlY(activity);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        if (yFl == null) {
            return;
        }
        yFl.mn.mn();
        com.bytedance.sdk.openadsdk.utils.tN.YFl(activity, this.tN.Sg);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public final void wN(Activity activity) {
        super.wN(activity);
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.aIu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public final View YFl() {
        return this.tN.mB;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void YFl(Activity activity, Sg.wN wNVar) {
        super.YFl(activity, wNVar);
        this.f10549vc = this.qsH.SVa();
        YFl(this.qsH, this.DSW);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        if (yFl.uGS && this.NjR > 0) {
            yFl.iY = wNVar.tN;
        }
        try {
            Ne();
            Cfr();
        } catch (Throwable th2) {
            YoT.YFl("TTAD.AdScene", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.pDU.tN.Sg();
            UZM();
        }
    }

    private void YFl(Wwa wwa, Bundle bundle) {
        Activity bZ = bZ();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = new com.bytedance.sdk.openadsdk.component.reward.YFl.YFl(bZ, this.YFl, wwa, this, 1);
        this.tN = yFl;
        yFl.uGS = VOe().YFl();
        this.tN.ZLB = VOe().DSW();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.tN;
        yFl2.UT = this;
        yFl2.pq = VOe().lG();
        Intent intent = bZ.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(this.tN, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(intent, this.tN);
            wwa.YFl(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.tN.f10589ib) {
            Sg();
        }
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg YFl = com.bytedance.sdk.openadsdk.component.reward.Sg.vc.YFl(this.tN);
        this.Sg = YFl;
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = this.tN;
        yFl3.Vmj = YFl;
        yFl3.GS.YFl(this);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = this.tN;
        if (yFl4.uGS) {
            yFl4.VOe.YFl(new YFl.InterfaceC0113YFl() { // from class: com.bytedance.sdk.openadsdk.activity.YFl.1
                @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.YFl.InterfaceC0113YFl
                public void YFl(int i10) {
                    Sg VOe = YFl.this.VOe();
                    if (VOe == null) {
                        return;
                    }
                    VOe.YFl(i10);
                }
            });
            VOe().DSW().setShowSound(Wwa.wN(wwa));
        }
        com.bytedance.sdk.openadsdk.utils.YoT.YFl(this.tN);
        Objects.toString(this.Sg);
    }

    public Sg.wN Sg(int i10) {
        Sg.wN wNVar = new Sg.wN(i10);
        wNVar.tN = this.tN.iY;
        return wNVar;
    }

    private void YFl(com.bytedance.sdk.openadsdk.core.Sg.Sg sg2) {
        if (sg2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_order", Integer.valueOf(this.NjR + 1));
            sg2.YFl(hashMap);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void YFl(Activity activity) {
        super.YFl(activity);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        if (yFl == null) {
            return;
        }
        yFl.Ga.YFl();
    }

    public final void YFl(boolean z10, int i10) {
        YFl(z10, false, i10);
    }

    public final void YFl(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        yFl.GS.YFl(z10, z11, false, yFl.Vmj, i10);
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public final void YFl(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.YFl(message);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.YFl.wN.YFl
    public void YFl(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2, int i10) {
        YFl(z10, z11, z12, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void YFl(vc vcVar, vc vcVar2, Sg.wN wNVar) {
        super.YFl(vcVar, vcVar2, wNVar);
        if (vcVar == this && (vcVar2 instanceof tN)) {
            int i10 = wNVar.Sg;
            if (i10 == 3) {
                lG lGVar = this.tN.VOe;
                lGVar.YFl(!lGVar.Ga() ? 1 : 0, 2);
            } else if (i10 == 6) {
                lG lGVar2 = this.tN.VOe;
                lGVar2.YFl(!lGVar2.Ga() ? 1 : 0, !this.tN.VOe.Ga() ? 1 : 0);
            } else if (i10 == 5 && !Wwa.wN(this.tN.Sg) && wNVar.AlY) {
                this.tN.VOe.YFl("skip", true);
            }
            this.tN.Sco.YFl(false);
            this.tN.Sco.AlY(false);
        }
        if (vcVar2.NjR != 0 || this.NjR == 0) {
            return;
        }
        this.qsH.NjR("0");
        Map<String, Object> AfY = this.qsH.AfY();
        if (AfY != null) {
            AfY.put(BidResponsed.KEY_PRICE, "0");
        }
    }

    public void YFl(float f10) {
        Sg VOe = VOe();
        if (VOe == null) {
            return;
        }
        VOe.YFl(f10);
        if (this.EH || f10 < this.qsH.ENV() / 100.0f) {
            return;
        }
        this.EH = true;
        vc qsH = VOe.qsH();
        if (qsH instanceof YFl) {
            ((YFl) qsH).Wwa();
        }
    }
}
