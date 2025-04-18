package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.EH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.aIu;
import com.bytedance.sdk.openadsdk.core.bZ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.core.widget.Sg;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.aIu;
import com.bytedance.sdk.openadsdk.utils.eT;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String EH;
    private static String Wwa;
    private static String lG;
    private static String pDU;
    private static String rkt;
    private static com.bytedance.sdk.openadsdk.YFl.wN.YFl wXo;
    protected com.bytedance.sdk.openadsdk.YFl.wN.YFl GA;
    private final AtomicBoolean Ne = new AtomicBoolean(false);
    private int VOe = -1;
    protected int YoT;
    private String aIu;
    private boolean bZ;
    protected int eT;
    private String qO;

    private JSONObject Ne() {
        JSONObject jSONObject = new JSONObject();
        int aIu = (int) this.Sg.VOe.aIu();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.Sg.Sg.aIu());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.Sg.Sg.wXo());
            jSONObject.put("network", EH.tN(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int GS = this.Sg.Sg.GS();
            String str = "unKnow";
            if (GS == 2) {
                str = Sco.Sg();
            } else if (GS == 1) {
                str = Sco.tN();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.Sg.Sg.JB());
            jSONObject.put("media_extra", this.qO);
            jSONObject.put("video_duration", this.Sg.Sg.BPI().f23459d);
            jSONObject.put("play_start_ts", this.eT);
            jSONObject.put("play_end_ts", this.YoT);
            jSONObject.put("duration", aIu);
            jSONObject.put("user_id", this.aIu);
            jSONObject.put("trans_id", Ne.YFl().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            YoT.YFl("TTAD.RVA", "", th2);
            return null;
        }
    }

    private void VOe() {
        if (!this.qsH) {
            this.qsH = true;
            aIu.YFl("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                YFl("onAdClose");
                return;
            }
            com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = this.GA;
            if (yFl != null) {
                yFl.Sg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0076, code lost:
    
        if (r3.Sg.rkt.get() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void aIu() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH$YFl r0 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH$YFl
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.DSW()
            r0.YFl(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.qO()
            r0.tN(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.eT()
            r0.Sg(r1)
            r1 = 3
            r0.tN(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            int r1 = r1.Wwa()
            r0.AlY(r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            n5.a r1 = r1.tN()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r2 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r2 = r2.VOe
            com.bytedance.sdk.openadsdk.AlY.DSW r2 = r2.YFl()
            com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.Sg
            int r0 = r0.f10591vc
            com.bytedance.sdk.openadsdk.core.VOe.tN(r0)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r0 = r0.VOe
            java.lang.String r1 = "skip"
            r2 = 0
            r0.YFl(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.Sg
            boolean r0 = r0.tN
            if (r0 == 0) goto L78
            r0 = 1
            r1 = 4
            r3.YFl(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.Sg
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.rkt.YFl(r0)
            if (r0 == 0) goto L7b
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.Sg
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.rkt
            boolean r0 = r0.get()
            if (r0 != 0) goto L7b
        L78:
            r3.finish()
        L7b:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.Sg
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            com.bytedance.sdk.openadsdk.core.YoT.YFl r0 = r0.Af()
            if (r0 == 0) goto L97
            com.bytedance.sdk.openadsdk.core.YoT.AlY r0 = r0.YFl()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r3.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            long r1 = r1.DSW()
            r0.vc(r1)
            r0.wN(r1)
        L97:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r0 = r3.Sg
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r0.Sg
            r1 = 5
            com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.aIu():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wXo() {
        aIu.YFl("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = this.GA;
        if (yFl != null) {
            yFl.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void AlY() {
        wXo();
        this.Sg.Sg.OPr();
        this.Sg.Sg.YFl(true);
        if (Wwa.wN(this.Sg.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            Wwa wwa = yFl.Sg;
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, yFl.wN, wwa.iyg());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YoT() {
        qO();
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void c_() {
        wXo();
    }

    public void finalize() throws Throwable {
        super.finalize();
        wXo = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.Sg != null) {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("videoForceBreak", this.Sg.Sg);
        }
        VOe();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean lG() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl;
        super.onCreate(bundle);
        try {
            if (pDU == null) {
                pDU = qO.YFl(this, "tt_reward_msg");
                EH = qO.YFl(this, "tt_msgPlayable");
                rkt = qO.YFl(this, "tt_negtiveBtnBtnText");
                lG = qO.YFl(this, "tt_postiveBtnText");
                Wwa = qO.YFl(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            YoT.YFl("TTAD.RVA", th2.getMessage());
        }
        if (bundle != null && (yFl = this.Sg) != null && yFl.Sg.Ef()) {
            this.Ne.set(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        VOe();
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("recycleRes");
        }
        this.GA = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.view.Sg YFl;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl != null && (YFl = yFl.YI.YFl()) != null) {
            YFl.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vc() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.vc
                public void YFl() {
                    TTRewardVideoActivity.this.wXo();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl;
        if (bundle == null) {
            bundle = new Bundle();
        }
        wXo = this.GA;
        if (this.Ne.get() && (yFl = this.Sg) != null) {
            yFl.Sg.on();
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (((1.0d - (r8.f10538vc / r8.Sg.VOe.dXO())) * 100.0d) >= r0) goto L8;
     */
    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void pDU() {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.core.settings.vc r0 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.Sg
            int r1 = r1.f10591vc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.settings.Sg r0 = r0.Ga(r1)
            int r0 = r0.f10745vc
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.Sg
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r1.Sg
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.Ne.qO(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L39
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.lG r1 = r1.VOe
            double r4 = r1.dXO()
            int r1 = r8.f10538vc
            double r6 = (double) r1
            double r6 = r6 / r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            double r0 = (double) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L36
            goto L37
        L36:
            r2 = r3
        L37:
            r3 = r2
            goto L8a
        L39:
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.Sg
            com.bytedance.sdk.openadsdk.core.model.Wwa r1 = r1.Sg
            int r1 = r1.VJb()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r4 = r8.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.qsH r4 = r4.UZM
            float r4 = r4.Sg()
            float r1 = (float) r1
            float r4 = r4 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r4
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L58
            r0 = r2
            goto L59
        L58:
            r0 = r3
        L59:
            com.bytedance.sdk.openadsdk.core.settings.vc r1 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r4 = r8.Sg
            int r4 = r4.f10591vc
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.YFl(r4)
            if (r1 != 0) goto L87
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r1 = r8.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.Wwa r1 = r1.mn
            com.bytedance.sdk.openadsdk.core.hQ r1 = r1.YoT()
            boolean r1 = r1.wN()
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl r4 = r8.Sg
            com.bytedance.sdk.openadsdk.component.reward.YFl.qsH r4 = r4.UZM
            boolean r4 = r4.tN()
            if (r4 == 0) goto L82
            r1 = r2
        L82:
            if (r0 == 0) goto L36
            if (r1 == 0) goto L36
            goto L37
        L87:
            if (r1 != r2) goto L8a
            r3 = r0
        L8a:
            if (r3 == 0) goto L8f
            r8.qO()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.pDU():void");
    }

    public void qO() {
        if (this.Ne.get()) {
            return;
        }
        this.Ne.set(true);
        if (lG.AlY().rkt(String.valueOf(this.Sg.f10591vc))) {
            YFl(true, this.Sg.Sg.wXo(), this.Sg.Sg.aIu(), 0, "");
        } else {
            lG.tN().YFl(Ne(), new qO.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.qO.Sg
                public void YFl(int i10, String str) {
                    TTRewardVideoActivity.this.YFl(false, 0, "", i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.qO.Sg
                public void YFl(aIu.Sg sg2) {
                    boolean z10 = sg2.Sg;
                    TTRewardVideoActivity.this.YFl(sg2.Sg, sg2.tN.YFl(), sg2.tN.Sg(), 0, "");
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void rkt() {
        final View nc2 = this.Sg.lu.nc();
        if (nc2 != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:24:0x00ef A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 291
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.AnonymousClass3.onClick(android.view.View):void");
                }
            };
            nc2.setOnClickListener(onClickListener);
            nc2.setTag(nc2.getId(), onClickListener);
        }
        this.Sg.Sco.YFl(new com.bytedance.sdk.openadsdk.component.reward.top.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void AlY(View view) {
                View view2 = nc2;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void Sg(View view) {
                com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = TTRewardVideoActivity.this.tN;
                if (sg2 != null && sg2.AlY() != null) {
                    TTRewardVideoActivity.this.tN.AlY().YFl(TTRewardVideoActivity.this.Sg.iY);
                }
                TTRewardVideoActivity.this.Sg.iY = !r3.iY;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(TTRewardVideoActivity.this.Sg.iY);
                sb2.append(" mLastVolume=");
                sb2.append(TTRewardVideoActivity.this.Sg.pq.YFl());
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = TTRewardVideoActivity.this.Sg;
                yFl.VOe.Sg(yFl.iY);
                if (com.bytedance.sdk.openadsdk.core.model.Ne.qO(TTRewardVideoActivity.this.Sg.Sg) && !TTRewardVideoActivity.this.Sg.f10590nc.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.Ne.DSW(TTRewardVideoActivity.this.Sg.Sg)) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTRewardVideoActivity.this.Sg;
                    yFl2.pq.YFl(yFl2.iY, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = TTRewardVideoActivity.this.Sg;
                yFl3.mn.AlY(yFl3.iY);
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = TTRewardVideoActivity.this.Sg;
                yFl4.UZM.vc(yFl4.iY);
                Wwa wwa = TTRewardVideoActivity.this.Sg.Sg;
                if (wwa != null && wwa.Af() != null && TTRewardVideoActivity.this.Sg.Sg.Af().YFl() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl5 = TTRewardVideoActivity.this.Sg;
                    if (yFl5.VOe != null) {
                        if (yFl5.iY) {
                            yFl5.Sg.Af().YFl().qsH(TTRewardVideoActivity.this.Sg.VOe.DSW());
                        } else {
                            yFl5.Sg.Af().YFl().NjR(TTRewardVideoActivity.this.Sg.VOe.DSW());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void YFl(View view) {
                if (TTRewardVideoActivity.this.Sg.Sg.fcp()) {
                    if (TTRewardVideoActivity.this.Sg.lu.eT() != null) {
                        TTRewardVideoActivity.this.Sg.Sg.zB(2);
                        TTRewardVideoActivity.this.Sg.lu.lG();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = TTRewardVideoActivity.this.Sg;
                if (!yFl.tN && yFl.Sg.pE() && !TTRewardVideoActivity.this.Sg.Sg.yn()) {
                    TTRewardVideoActivity.this.Sg.Sg.zB(13);
                    try {
                        TTRewardVideoActivity.this.Sg.lu.lG();
                        return;
                    } catch (Exception unused) {
                    }
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.YFl(com.bytedance.sdk.openadsdk.core.model.Ne.tN(tTRewardVideoActivity.Sg.Sg), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void tN(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.Sg.hQ.YFl(tTRewardVideoActivity.tN);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void wN() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = this.GA;
            if (yFl != null) {
                yFl.YFl();
            }
        }
        if (Wwa()) {
            this.Sg.YI.nc();
        }
    }

    public void YFl(String str) {
        YFl(str, false, 0, "", 0, "");
    }

    private void YFl(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        mn.tN(new qsH("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.Sg(0).executeRewardVideoCallback(TTRewardVideoActivity.this.Sg.fIu, str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    YoT.YFl("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            this.GA = bZ.YFl().tN();
        }
        if (this.GA != null || bundle == null) {
            return;
        }
        this.GA = wXo;
        wXo = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void YFl() {
        this.Sg.Sco.YFl(null, TTAdDislikeToast.getSkipText());
        this.Sg.Sco.wN(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final boolean z10, boolean z11) {
        if (!z11 && this.bZ && this.Sg.f10590nc.get()) {
            if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(this.Sg.Sg)) {
                this.Sg.mn.qsH();
                return;
            } else if (com.bytedance.sdk.openadsdk.core.model.Ne.nc(this.Sg.Sg)) {
                this.Sg.UZM.lG();
                return;
            }
        }
        if (!lG.AlY().qsH(String.valueOf(this.Sg.f10591vc))) {
            if (!z11 && this.Sg.f10590nc.get()) {
                if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(this.Sg.Sg)) {
                    this.Sg.mn.qsH();
                    return;
                } else if (com.bytedance.sdk.openadsdk.core.model.Ne.nc(this.Sg.Sg)) {
                    this.Sg.UZM.lG();
                    return;
                }
            }
            if (z10) {
                finish();
                return;
            } else {
                aIu();
                return;
            }
        }
        if (this.Ne.get()) {
            if (this.Sg.f10590nc.get()) {
                if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(this.Sg.Sg)) {
                    this.Sg.mn.qsH();
                    return;
                } else if (com.bytedance.sdk.openadsdk.core.model.Ne.nc(this.Sg.Sg)) {
                    this.Sg.UZM.lG();
                    return;
                }
            }
            if (z10) {
                finish();
                return;
            } else {
                aIu();
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(this.Sg.Sg) && this.Sg.mn.eT().getVisibility() == 0) {
            this.Sg.mn.qsH();
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.Ne.nc(this.Sg.Sg) && this.Sg.mn.nc().getVisibility() == 0) {
            this.Sg.UZM.lG();
            return;
        }
        this.Sg.aIu.set(true);
        this.Sg.VOe.EH();
        if (z10) {
            this.Sg.UZM.pDU();
        }
        final com.bytedance.sdk.openadsdk.core.widget.Sg sg2 = new com.bytedance.sdk.openadsdk.core.widget.Sg(this);
        this.tN.GA = sg2;
        if (z10) {
            sg2.YFl(EH).Sg(Wwa).tN(rkt);
        } else {
            sg2.YFl(pDU).Sg(lG).tN(rkt);
        }
        this.tN.GA.YFl(new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.Sg.YFl
            public void Sg() {
                sg2.dismiss();
                TTRewardVideoActivity.this.bZ = true;
                TTRewardVideoActivity.this.Sg.aIu.set(false);
                TTRewardVideoActivity.this.Sg.UZM.vc(Integer.MAX_VALUE);
                if (z10) {
                    if (com.bytedance.sdk.openadsdk.core.model.Ne.Wwa(TTRewardVideoActivity.this.Sg.Sg)) {
                        if (com.bytedance.sdk.openadsdk.core.model.Ne.qsH(TTRewardVideoActivity.this.Sg.Sg)) {
                            if (TTRewardVideoActivity.this.Sg.UZM.YFl()) {
                                TTRewardVideoActivity.this.Sg.UZM.YFl(5);
                                return;
                            } else {
                                TTRewardVideoActivity.this.Sg.mn.qsH();
                                return;
                            }
                        }
                        TTRewardVideoActivity.this.Sg.dXO.vc();
                        if (TTRewardVideoActivity.this.Sg.UZM.YFl()) {
                            TTRewardVideoActivity.this.Sg.UZM.YFl(4);
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.Ne.vc(TTRewardVideoActivity.this.Sg.Sg)) {
                        if (com.bytedance.sdk.openadsdk.core.model.Ne.nc(TTRewardVideoActivity.this.Sg.Sg)) {
                            TTRewardVideoActivity.this.Sg.UZM.lG();
                            return;
                        } else {
                            TTRewardVideoActivity.this.Sg.dXO.vc();
                            TTRewardVideoActivity.this.finish();
                            return;
                        }
                    }
                }
                TTRewardVideoActivity.this.aIu();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Sg.YFl
            public void YFl() {
                TTRewardVideoActivity.this.Sg.VOe.pDU();
                if (z10) {
                    TTRewardVideoActivity.this.Sg.UZM.wN(1000);
                }
                sg2.dismiss();
                TTRewardVideoActivity.this.Sg.aIu.set(false);
            }
        }).show();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void YFl(@NonNull Intent intent) {
        super.YFl(intent);
        this.qO = intent.getStringExtra("media_extra");
        this.aIu = intent.getStringExtra("user_id");
    }

    public boolean YFl(long j3, boolean z10) {
        DSW dsw = new DSW();
        dsw.YFl(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        yFl.VOe.YFl(yFl.lu.vc(), dsw);
        e eVar = new e() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            boolean YFl;

            @Override // l5.e
            public void Sg(long j10, int i10) {
                TTRewardVideoActivity.this.AlY.removeMessages(300);
                if (TTRewardVideoActivity.this.Sg.VOe.Sg()) {
                    TTRewardVideoActivity.this.GA();
                    return;
                }
                TTRewardVideoActivity.this.Sg.VOe.GA();
                TTRewardVideoActivity.this.qO();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.Sg.tN) {
                    tTRewardVideoActivity.YFl(false, true, 3);
                } else {
                    tTRewardVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = TTRewardVideoActivity.this.Sg.VOe;
                lGVar.YFl(!lGVar.Ga() ? 1 : 0, 2);
            }

            @Override // l5.e
            public void YFl(long j10, int i10) {
                eT eTVar;
                if (this.YFl) {
                    return;
                }
                this.YFl = true;
                TTRewardVideoActivity.this.AlY.removeMessages(300);
                TTRewardVideoActivity.this.EH();
                TTRewardVideoActivity.this.qO();
                TTRewardVideoActivity.this.Sg.VOe.YFl(j10, j10);
                TTRewardVideoActivity.this.Sg.qO.set(true);
                if (TTRewardVideoActivity.this.Sg.Sg.rkt() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTRewardVideoActivity.this.Sg;
                    if (yFl2.tN) {
                        yFl2.bZ.tN().AlY();
                        com.bytedance.sdk.openadsdk.utils.YoT.Sg();
                    }
                }
                if (TTRewardVideoActivity.this.Sg.Sg.QGo()) {
                    TTRewardVideoActivity.this.Sg.Sg.zB(1);
                    TTRewardVideoActivity.this.Sg.lu.lG();
                }
                if (TTRewardVideoActivity.this.Sg.Sg.rkt() == 21 && !TTRewardVideoActivity.this.Sg.Sg.AlY()) {
                    TTRewardVideoActivity.this.Sg.Sg.Sg(true);
                    TTRewardVideoActivity.this.Sg.lu.lG();
                }
                TTRewardVideoActivity.this.YoT = (int) (System.currentTimeMillis() / 1000);
                if (!rkt.tN(TTRewardVideoActivity.this.Sg.Sg) && !rkt.Sg(TTRewardVideoActivity.this.Sg.Sg) && !rkt.AlY(TTRewardVideoActivity.this.Sg.Sg)) {
                    if (rkt.YFl(TTRewardVideoActivity.this.Sg.Sg) && !TTRewardVideoActivity.this.Sg.rkt.get()) {
                        TTRewardVideoActivity.this.Sg.YFl(true);
                        TTRewardVideoActivity.this.Sg.Sco.wN(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = TTRewardVideoActivity.this.Sg;
                    if (yFl3.tN) {
                        if (yFl3.Sg.Xns()) {
                            TTRewardVideoActivity.this.Sg.Sco.tN();
                            return;
                        }
                        TTRewardVideoActivity.this.YFl(false, 5);
                        if (Wwa.wN(TTRewardVideoActivity.this.Sg.Sg)) {
                            return;
                        }
                        TTRewardVideoActivity.this.Sg.VOe.YFl("skip", true);
                        return;
                    }
                    if (yFl3.Sg.Xns()) {
                        TTRewardVideoActivity.this.Sg.Sco.tN();
                        return;
                    }
                    if (!Wwa.wN(TTRewardVideoActivity.this.Sg.Sg)) {
                        TTRewardVideoActivity.this.Sg.VOe.YFl("skip", true);
                    }
                    TTRewardVideoActivity.this.finish();
                    return;
                }
                TTRewardVideoActivity.this.YFl(false, 5);
                if (!rkt.Sg(TTRewardVideoActivity.this.Sg.Sg) || (eTVar = TTRewardVideoActivity.this.Sg.Bn) == null) {
                    return;
                }
                eTVar.YFl(0L);
            }

            @Override // l5.e
            public void YFl() {
                TTRewardVideoActivity.this.AlY.removeMessages(300);
                TTRewardVideoActivity.this.EH();
                TTRewardVideoActivity.this.qO();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.Sg.tN) {
                    tTRewardVideoActivity.YFl(false, true, 6);
                } else {
                    tTRewardVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = TTRewardVideoActivity.this.Sg.VOe;
                lGVar.YFl(!lGVar.Ga() ? 1 : 0, 1 ^ (TTRewardVideoActivity.this.Sg.VOe.Ga() ? 1 : 0));
                TTRewardVideoActivity.this.Sg.VOe.GA();
            }

            @Override // l5.e
            public void YFl(long j10, long j11) {
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTRewardVideoActivity.this.Sg;
                if (!yFl2.Bh && yFl2.VOe.Sg()) {
                    TTRewardVideoActivity.this.Sg.VOe.EH();
                }
                if (TTRewardVideoActivity.this.Sg.f10590nc.get()) {
                    return;
                }
                TTRewardVideoActivity.this.AlY.removeMessages(300);
                if (j10 != TTRewardVideoActivity.this.Sg.VOe.qsH()) {
                    TTRewardVideoActivity.this.EH();
                }
                TTRewardVideoActivity.this.Sg.VOe.YFl(j10, j11);
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                long j12 = j10 / 1000;
                double d10 = j12;
                tTRewardVideoActivity.f10538vc = (int) (tTRewardVideoActivity.Sg.VOe.dXO() - d10);
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                int i10 = tTRewardVideoActivity2.f10538vc;
                if (i10 >= 0) {
                    tTRewardVideoActivity2.Sg.Sco.YFl(String.valueOf(i10), null);
                }
                TTRewardVideoActivity tTRewardVideoActivity3 = TTRewardVideoActivity.this;
                tTRewardVideoActivity3.f10538vc = (int) (tTRewardVideoActivity3.Sg.VOe.dXO() - d10);
                int i11 = (int) j12;
                int nc2 = lG.AlY().nc(String.valueOf(TTRewardVideoActivity.this.Sg.f10591vc));
                boolean z11 = nc2 >= 0;
                if ((TTRewardVideoActivity.this.Sg.aIu.get() || TTRewardVideoActivity.this.Sg.eT.get()) && TTRewardVideoActivity.this.Sg.VOe.Sg()) {
                    TTRewardVideoActivity.this.Sg.VOe.EH();
                }
                TTRewardVideoActivity.this.Sg.lu.AlY(i11);
                TTRewardVideoActivity.this.YFl(j10, j11);
                TTRewardVideoActivity tTRewardVideoActivity4 = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity4.f10538vc > 0) {
                    tTRewardVideoActivity4.Sg.Sco.AlY(true);
                    if (z11 && i11 >= nc2) {
                        TTRewardVideoActivity.this.Sg.YFl(true);
                        TTRewardVideoActivity tTRewardVideoActivity5 = TTRewardVideoActivity.this;
                        tTRewardVideoActivity5.Sg.Sco.YFl(String.valueOf(tTRewardVideoActivity5.f10538vc), TTAdDislikeToast.getSkipText());
                        TTRewardVideoActivity.this.Sg.Sco.wN(true);
                        return;
                    }
                    TTRewardVideoActivity tTRewardVideoActivity6 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity6.Sg.Sco.YFl(String.valueOf(tTRewardVideoActivity6.f10538vc), null);
                }
            }
        };
        this.Sg.VOe.YFl(eVar);
        rkt rktVar = this.Sg.lu.EH;
        if (rktVar != null) {
            rktVar.YFl(eVar);
        }
        boolean YFl = this.Sg.VOe.YFl(j3, z10, null, this.tN);
        if (YFl && !z10) {
            this.eT = (int) (System.currentTimeMillis() / 1000);
        }
        return YFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final boolean z10, final int i10, final String str, final int i11, final String str2) {
        com.bytedance.sdk.openadsdk.utils.aIu.YFl("BVA", "invoke callback onRewardVerify: " + z10 + ", " + i10 + ", " + str + ", " + i11 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onRewardVerify", z10, i10, str, i11, str2);
        } else {
            this.AlY.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl = TTRewardVideoActivity.this.GA;
                    if (yFl != null) {
                        yFl.YFl(z10, i10, str, i11, str2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(int i10) {
        if (i10 == 10000) {
            qO();
        }
    }

    public void YFl(long j3, long j10) {
        long j11 = (this.Sg.dGX * 1000) + j3;
        if (this.VOe == -1) {
            this.VOe = lG.AlY().Ga(String.valueOf(this.Sg.f10591vc)).f10745vc;
        }
        if (j10 <= 0) {
            return;
        }
        if (j10 >= 30000 && j11 >= 27000) {
            qO();
        } else if (((float) (j11 * 100)) / ((float) j10) >= this.VOe) {
            qO();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(boolean z10) {
        if (z10) {
            qO();
            return;
        }
        if ((1.0d - (this.f10538vc / this.Sg.VOe.dXO())) * 100.0d >= lG.AlY().Ga(String.valueOf(this.Sg.f10591vc)).f10745vc) {
            qO();
        }
    }
}
