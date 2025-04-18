package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.bZ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.Sg;
import com.bytedance.sdk.openadsdk.component.reward.YFl.lG;
import com.bytedance.sdk.openadsdk.component.reward.view.qsH;
import com.bytedance.sdk.openadsdk.core.aIu;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.core.widget.Sg;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN extends vc implements bZ.YFl, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg {
    private static String AlY;
    private static String DSW;
    private static String GA;

    /* renamed from: vc, reason: collision with root package name */
    private static String f10550vc;
    private static String wN;
    private int EH;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.Sg.Sg Sg;
    private String Wwa;
    protected final bZ YFl;
    private boolean lG;
    private Bundle pDU;
    private String qO;
    private Sg.wN rkt;
    protected com.bytedance.sdk.openadsdk.component.reward.YFl.YFl tN;

    public tN(Sg sg2, Wwa wwa, int i10) {
        super(sg2, wwa, i10);
        this.YFl = new bZ(Looper.getMainLooper(), this);
        this.EH = 0;
        YFl(wwa, this.pDU);
        try {
            rkt();
        } catch (Throwable th2) {
            YoT.YFl("TTAD.EndCardScene", "onCreate: ", th2);
            UZM();
        }
    }

    private JSONObject Cfr() {
        JSONObject jSONObject = new JSONObject();
        int aIu = (int) this.tN.VOe.aIu();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.tN.Sg.aIu());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.tN.Sg.wXo());
            jSONObject.put("network", EH.tN(this.tN.BPI));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int GS = this.tN.Sg.GS();
            String str = "unKnow";
            if (GS == 2) {
                str = Sco.Sg();
            } else if (GS == 1) {
                str = Sco.tN();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.tN.Sg.JB());
            jSONObject.put("media_extra", this.qO);
            jSONObject.put("video_duration", this.tN.Sg.BPI().f23459d);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("duration", aIu);
            jSONObject.put("user_id", this.Wwa);
            jSONObject.put("trans_id", Ne.YFl().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            YoT.YFl("TTAD.EndCardScene", "", th2);
            return null;
        }
    }

    private boolean Ne() {
        if (this.tN.f10590nc.get() && this.tN.DSW) {
            return false;
        }
        if (this.qsH.YFl()) {
            return this.tN.f10590nc.get();
        }
        return true;
    }

    private void Wwa() {
        if (this.lG) {
            return;
        }
        this.lG = true;
        this.Sg.YFl(this.YoT);
        wXo();
    }

    private void rkt() {
        this.tN.mB.YFl(this.Sg);
        this.Sg.YFl(this, this.YFl);
        this.Sg.eT();
    }

    private void wXo() {
        final View nc2 = this.tN.lu.nc();
        if (nc2 != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.tN.1
                /* JADX WARN: Removed duplicated region for block: B:22:0x00e3 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 282
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.tN.AnonymousClass1.onClick(android.view.View):void");
                }
            };
            nc2.setOnClickListener(onClickListener);
            nc2.setTag(nc2.getId(), onClickListener);
        }
        this.tN.Sco.YFl(new com.bytedance.sdk.openadsdk.component.reward.top.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.tN.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void AlY(View view) {
                View view2 = nc2;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void Sg(View view) {
                com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = tN.this.Sg;
                if (sg2 != null && sg2.AlY() != null) {
                    tN.this.Sg.AlY().YFl(tN.this.tN.iY);
                }
                tN.this.tN.iY = !r3.iY;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(tN.this.tN.iY);
                sb2.append(" mLastVolume=");
                sb2.append(tN.this.tN.pq.YFl());
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = tN.this.tN;
                yFl.VOe.Sg(yFl.iY);
                if (com.bytedance.sdk.openadsdk.core.model.Ne.qO(tN.this.tN.Sg) && !tN.this.tN.f10590nc.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.Ne.DSW(tN.this.tN.Sg)) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = tN.this.tN;
                    yFl2.pq.YFl(yFl2.iY, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = tN.this.tN;
                yFl3.mn.AlY(yFl3.iY);
                Wwa wwa = tN.this.tN.Sg;
                if (wwa != null && wwa.Af() != null && tN.this.tN.Sg.Af().YFl() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = tN.this.tN;
                    if (yFl4.VOe != null) {
                        if (yFl4.iY) {
                            yFl4.Sg.Af().YFl().qsH(tN.this.tN.VOe.DSW());
                        } else {
                            yFl4.Sg.Af().YFl().NjR(tN.this.tN.VOe.DSW());
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl5 = tN.this.tN;
                yFl5.UZM.vc(yFl5.iY);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void YFl(View view) {
                tN tNVar = tN.this;
                if (tNVar.YFl(com.bytedance.sdk.openadsdk.core.model.Ne.tN(tNVar.tN.Sg), false)) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.Ne.wN(tN.this.tN.Sg)) {
                    if (com.bytedance.sdk.openadsdk.core.model.Ne.nc(tN.this.tN.Sg)) {
                        tN.this.tN.UZM.lG();
                        return;
                    }
                    View view2 = nc2;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        tN.this.UZM();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(tN.this.tN.Sg)) {
                    if (tN.this.tN.UZM.YFl()) {
                        tN.this.tN.UZM.YFl(5);
                        return;
                    } else {
                        tN.this.tN.mn.qsH();
                        return;
                    }
                }
                if (!com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(tN.this.tN.Sg) && (!rkt.YFl(tN.this.tN.Sg) || tN.this.tN.rkt.get())) {
                    tN.this.UZM();
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.Ne.qsH(tN.this.tN.Sg) && tN.this.tN.UZM.YFl()) {
                    tN.this.tN.UZM.YFl(4);
                }
                tN.this.UZM();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void tN(View view) {
                tN tNVar = tN.this;
                tNVar.tN.hQ.YFl(tNVar.Sg);
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

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void EH() {
        super.EH();
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.Ne();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void NjR() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public final void Sg(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2;
        boolean z10;
        super.Sg(activity);
        if (this.tN != null && (sg2 = this.Sg) != null) {
            sg2.lG();
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
            yFl.Bh = true;
            yFl.Ga.Sg(this.YFl);
            if (Ne()) {
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.tN;
                yFl2.Sco.YFl(yFl2.Sg.Gnp());
            }
            this.tN.lu.EH();
            this.tN.mn.Ne();
            this.tN.UZM.GA();
            if (this.Sg.Sg()) {
                this.tN.VOe.YFl(this.Sg);
                lG lGVar = this.tN.VOe;
                if (this.EH != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lGVar.YFl(false, this, z10);
            }
            this.EH++;
            qsH qsh = this.tN.YI;
            if (qsh != null) {
                qsh.DSW();
            }
            this.tN.Ga.YFl(this.YFl);
            this.Sg.qO();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YoT() {
        tN();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public String aIu() {
        return this.tN.fIu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public boolean a_() {
        return this.tN.AlY;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public String b_() {
        return this.tN.wN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void c_() {
        dXO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void eT() {
        if (this.tN.pDU.getAndSet(true) && !com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(this.tN.Sg)) {
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
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void pDU() {
        boolean z10;
        boolean z11 = true;
        boolean z12 = false;
        if ((1.0f - (this.tN.UZM.Sg() / this.tN.Sg.VJb())) * 100.0f >= com.bytedance.sdk.openadsdk.core.lG.AlY().Ga(String.valueOf(this.tN.f10591vc)).f10745vc) {
            z10 = true;
        } else {
            z10 = false;
        }
        int YFl = com.bytedance.sdk.openadsdk.core.lG.AlY().YFl(String.valueOf(this.tN.f10591vc));
        if (YFl == 0) {
            boolean wN2 = this.tN.mn.YoT().wN();
            if (this.tN.UZM.tN()) {
                wN2 = true;
            }
            if (!z10 || !wN2) {
                z11 = false;
            }
            z12 = z11;
        } else if (YFl == 1) {
            z12 = z10;
        }
        if (z12) {
            tN();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public boolean qO() {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.tN;
        return yFl != null && yFl.VOe.bZ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public final void qsH() {
        if (VOe() == null) {
            return;
        }
        this.tN.GS.YFl(this.rkt.YFl.getBoolean("isSkip", false), this.rkt.YFl.getBoolean("force", false), this.rkt.YFl.getBoolean("isFromLandingPage", false), this.Sg, this.rkt.Sg);
    }

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
        Ga();
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

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public boolean YFl(long j3, boolean z10) {
        return false;
    }

    public void tN() {
        if (VOe().NjR().getBoolean("reward_verify", false) || VOe().GA()) {
            return;
        }
        VOe().NjR().putBoolean("reward_verify", true);
        if (com.bytedance.sdk.openadsdk.core.lG.AlY().rkt(String.valueOf(this.tN.f10591vc))) {
            YFl(true, this.tN.Sg.wXo(), this.tN.Sg.aIu(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.lG.tN().YFl(Cfr(), new qO.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.tN.3
                @Override // com.bytedance.sdk.openadsdk.core.qO.Sg
                public void YFl(int i10, String str) {
                    tN.this.YFl(false, 0, "", i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.qO.Sg
                public void YFl(aIu.Sg sg2) {
                    tN.this.YFl(sg2.Sg, sg2.tN.YFl(), sg2.tN.Sg(), 0, "");
                }
            });
        }
    }

    public void wN() {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.Ga();
        this.tN.GS.Sg();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public final void YFl(Activity activity, Bundle bundle) {
        this.pDU = bundle;
        super.YFl(activity, bundle);
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
    public final View YFl() {
        return this.tN.mB;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void YFl(Activity activity, Sg.wN wNVar) {
        super.YFl(activity, wNVar);
        this.rkt = wNVar;
        Intent intent = activity.getIntent();
        this.qO = intent.getStringExtra("media_extra");
        this.Wwa = intent.getStringExtra("user_id");
        try {
            if (DSW == null) {
                DSW = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_reward_msg");
                AlY = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_msgPlayable");
                f10550vc = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_negtiveBtnBtnText");
                GA = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_postiveBtnText");
                wN = com.bytedance.sdk.component.utils.qO.YFl(this.tN.BPI, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            YoT.YFl("TTAD.EndCardScene", th2.getMessage());
        }
        Wwa();
        qsH();
    }

    private void YFl(Wwa wwa, Bundle bundle) {
        Activity bZ = bZ();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = new com.bytedance.sdk.openadsdk.component.reward.YFl.YFl(bZ, this.YFl, wwa, this, 2);
        this.tN = yFl;
        yFl.uGS = VOe().YFl();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.tN;
        yFl2.UT = this;
        yFl2.pq = VOe().lG();
        com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(this.tN, bZ.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg YFl = com.bytedance.sdk.openadsdk.component.reward.Sg.vc.YFl(this.tN);
        this.Sg = YFl;
        this.tN.Vmj = YFl;
        Objects.toString(YFl);
    }

    @Override // com.bytedance.sdk.component.utils.bZ.YFl
    public final void YFl(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.Sg;
        if (sg2 == null) {
            return;
        }
        sg2.YFl(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(boolean z10) {
        if (z10) {
            tN();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.vc
    public void YFl(vc vcVar, vc vcVar2, Sg.wN wNVar) {
        super.YFl(vcVar, vcVar2, wNVar);
        if (vcVar != null || vcVar2 == this) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.Ne.DSW(this.tN.Sg) || com.bytedance.sdk.openadsdk.aIu.YFl.YFl("ivrv_new_arch_endcard_view_add_at_first", 0) == 1) {
            VOe().YFl(YFl());
        }
        Wwa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean YFl(final boolean z10, boolean z11) {
        if (!this.tN.AlY || VOe().NjR().getBoolean("reward_verify", false) || VOe().GA()) {
            return false;
        }
        if (!z11 && VOe().NjR().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if (!com.bytedance.sdk.openadsdk.core.lG.AlY().qsH(String.valueOf(this.tN.f10591vc))) {
            if (!z11) {
                return false;
            }
            if (z10) {
                UZM();
                return true;
            }
        }
        this.tN.aIu.set(true);
        if (z10) {
            this.tN.UZM.pDU();
        }
        final com.bytedance.sdk.openadsdk.core.widget.Sg sg2 = new com.bytedance.sdk.openadsdk.core.widget.Sg(this.tN.UI);
        this.Sg.GA = sg2;
        if (z10) {
            sg2.YFl(AlY).Sg(wN).tN(f10550vc);
        } else {
            sg2.YFl(DSW).Sg(GA).tN(f10550vc);
        }
        this.Sg.GA.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.tN.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.Sg.YFl
            public void Sg() {
                sg2.dismiss();
                tN.this.VOe().NjR().putBoolean("user_has_give_up_reward", true);
                tN.this.tN.aIu.set(false);
                tN.this.tN.UZM.vc(Integer.MAX_VALUE);
                if (z10) {
                    if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(tN.this.tN.Sg)) {
                        if (tN.this.tN.UZM.YFl()) {
                            tN.this.tN.UZM.YFl(5);
                            return;
                        } else {
                            tN.this.tN.mn.qsH();
                            return;
                        }
                    }
                    tN.this.tN.dXO.vc();
                    if (tN.this.tN.UZM.YFl()) {
                        tN.this.tN.UZM.YFl(4);
                    }
                    tN.this.UZM();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Sg.YFl
            public void YFl() {
                if (z10) {
                    tN.this.tN.UZM.wN(1000);
                }
                sg2.dismiss();
                tN.this.tN.aIu.set(false);
            }
        }).show();
        return true;
    }
}
