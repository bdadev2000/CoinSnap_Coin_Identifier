package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.KVG;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.apiImpl.jU.zp;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.vwr;
import com.bytedance.sdk.openadsdk.core.widget.zp;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.multipro.lMd;
import com.bytedance.sdk.openadsdk.utils.Bj;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.pvr;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String KVG;
    private static String dQp;
    private static zp ot;
    private static String pvr;
    private static String vwr;
    private static String woN;
    private String FP;
    private boolean RCv;
    private String cz;
    protected zp rV;
    protected int tG;
    protected int vDp;
    private final AtomicBoolean yRU = new AtomicBoolean(false);
    private int ox = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0075, code lost:
    
        if (r3.lMd.Gzh.get() == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void FP() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp$zp r0 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp$zp
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r1 = r1.UPs
            long r1 = r1.QR()
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r1 = r1.UPs
            long r1 = r1.pvr()
            r0.KS(r1)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r1 = r1.UPs
            long r1 = r1.Bj()
            r0.lMd(r1)
            r1 = 3
            r0.KS(r1)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r1 = r1.UPs
            int r1 = r1.vwr()
            r0.jU(r1)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r1 = r1.UPs
            com.bykv.vk.openvk.component.video.api.lMd.zp r1 = r1.KS()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r2 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r2 = r2.UPs
            com.bytedance.sdk.openadsdk.lMd.QR r2 = r2.zp()
            com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r3.lMd
            int r0 = r0.dQp
            com.bytedance.sdk.openadsdk.core.pvr.KS(r0)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r0 = r0.UPs
            java.lang.String r1 = "skip"
            r0.zp(r1)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r3.lMd
            boolean r0 = r0.lMd
            if (r0 == 0) goto L77
            r0 = 1
            r1 = 4
            r3.zp(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r3.lMd
            com.bytedance.sdk.openadsdk.core.model.woN r0 = r0.zp
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dQp.zp(r0)
            if (r0 == 0) goto L7a
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r3.lMd
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.Gzh
            boolean r0 = r0.get()
            if (r0 != 0) goto L7a
        L77:
            r3.finish()
        L7a:
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r3.lMd
            com.bytedance.sdk.openadsdk.core.model.woN r0 = r0.zp
            com.bytedance.sdk.openadsdk.core.QR.zp r0 = r0.xg()
            if (r0 == 0) goto L96
            com.bytedance.sdk.openadsdk.core.QR.jU r0 = r0.zp()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r3.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r1 = r1.UPs
            long r1 = r1.QR()
            r0.HWF(r1)
            r0.COT(r1)
        L96:
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r0 = r3.lMd
            com.bytedance.sdk.openadsdk.core.model.woN r0 = r0.zp
            r1 = 5
            com.bytedance.sdk.openadsdk.rV.zp.COT.zp(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.FP():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ot() {
        pvr.zp("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (lMd.KS()) {
            zp("onAdVideoBarClick");
            return;
        }
        zp zpVar = this.rV;
        if (zpVar != null) {
            zpVar.onAdClicked();
        }
    }

    private void ox() {
        if (!this.ku) {
            this.ku = true;
            pvr.zp("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
            if (lMd.KS()) {
                zp("onAdClose");
                return;
            }
            zp zpVar = this.rV;
            if (zpVar != null) {
                zpVar.lMd();
            }
        }
    }

    private JSONObject yRU() {
        JSONObject jSONObject = new JSONObject();
        int cz = (int) this.lMd.UPs.cz();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.lMd.zp.vwr());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.lMd.zp.pvr());
            jSONObject.put("network", KVG.KS(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int UPs = this.lMd.zp.UPs();
            String str = "unKnow";
            if (UPs == 2) {
                str = YhE.lMd();
            } else if (UPs == 1) {
                str = YhE.KS();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.lMd.zp.WLq());
            jSONObject.put("media_extra", this.cz);
            jSONObject.put("video_duration", this.lMd.zp.eWG().HWF());
            jSONObject.put("play_start_ts", this.vDp);
            jSONObject.put("play_end_ts", this.tG);
            jSONObject.put("duration", cz);
            jSONObject.put("user_id", this.FP);
            jSONObject.put("trans_id", FP.zp().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            tG.zp("TTAD.RVA", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void KS(int i9) {
        if (i9 == 10000) {
            cz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.KS.KS
    public void YW() {
        cz();
    }

    public void cz() {
        if (this.yRU.get()) {
            return;
        }
        this.yRU.set(true);
        if (com.bytedance.sdk.openadsdk.core.KVG.jU().dQp(String.valueOf(this.lMd.dQp))) {
            zp(true, this.lMd.zp.pvr(), this.lMd.zp.vwr(), 0, "");
        } else {
            com.bytedance.sdk.openadsdk.core.KVG.KS().zp(yRU(), new woN.lMd() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.woN.lMd
                public void zp(int i9, String str) {
                    TTRewardVideoActivity.this.zp(false, 0, "", i9, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.woN.lMd
                public void zp(vwr.lMd lmd) {
                    boolean z8 = lmd.lMd;
                    TTRewardVideoActivity.this.zp(lmd.lMd, lmd.KS.zp(), lmd.KS.lMd(), 0, "");
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean dQp() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (((1.0d - (r8.HWF / r8.lMd.UPs.Gzh())) * 100.0d) >= r0) goto L8;
     */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dT() {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.core.settings.COT r0 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r8.lMd
            int r1 = r1.dQp
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.settings.zp r0 = r0.Gzh(r1)
            int r0 = r0.HWF
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r8.lMd
            com.bytedance.sdk.openadsdk.core.model.woN r1 = r1.zp
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.cz.vDp(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L39
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r8.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.tG r1 = r1.UPs
            double r4 = r1.Gzh()
            int r1 = r8.HWF
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
            goto L8b
        L39:
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r8.lMd
            com.bytedance.sdk.openadsdk.core.model.woN r1 = r1.zp
            int r1 = r1.iOI()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r8.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.QR r4 = r4.ffE
            int r4 = r4.vDp()
            float r4 = (float) r4
            float r1 = (float) r1
            float r4 = r4 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r4
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L59
            r0 = r2
            goto L5a
        L59:
            r0 = r3
        L5a:
            com.bytedance.sdk.openadsdk.core.settings.COT r1 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r8.lMd
            int r4 = r4.dQp
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.zp(r4)
            if (r1 != 0) goto L88
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r1 = r8.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.rV r1 = r1.si
            com.bytedance.sdk.openadsdk.core.RCv r1 = r1.dT()
            boolean r1 = r1.COT()
            com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r8.lMd
            com.bytedance.sdk.openadsdk.component.reward.zp.QR r4 = r4.ffE
            boolean r4 = r4.vwr()
            if (r4 == 0) goto L83
            r1 = r2
        L83:
            if (r0 == 0) goto L36
            if (r1 == 0) goto L36
            goto L37
        L88:
            if (r1 != r2) goto L8b
            r3 = r0
        L8b:
            if (r3 == 0) goto L90
            r8.cz()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.dT():void");
    }

    public void finalize() throws Throwable {
        super.finalize();
        ot = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        ox();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ku() {
        if (lMd.KS()) {
            zp("onAdShow");
        } else {
            zp zpVar = this.rV;
            if (zpVar != null) {
                zpVar.zp();
            }
        }
        if (KVG()) {
            this.lMd.eWG.dT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar;
        super.onCreate(bundle);
        try {
            if (dQp == null) {
                dQp = cz.zp(this, "tt_reward_msg");
                KVG = cz.zp(this, "tt_msgPlayable");
                woN = cz.zp(this, "tt_negtiveBtnBtnText");
                vwr = cz.zp(this, "tt_postiveBtnText");
                pvr = cz.zp(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            tG.zp("TTAD.RVA", th.getMessage());
        }
        if (bundle != null && (zpVar = this.lMd) != null && zpVar.zp.Ngi()) {
            this.yRU.set(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ox();
        if (lMd.KS()) {
            zp("recycleRes");
        }
        this.rV = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        FullRewardExpressView zp;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.lMd;
        if (zpVar != null && (zp = zpVar.eWG.zp()) != null) {
            zp.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lMd() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.lMd
                public void zp() {
                    TTRewardVideoActivity.this.ot();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        ot = this.rV;
        if (this.yRU.get() && (zpVar = this.lMd) != null) {
            zpVar.zp.gG();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void pvr() {
        ot();
        this.lMd.zp.JR();
        this.lMd.zp.zp(true);
        if (com.bytedance.sdk.openadsdk.core.model.woN.COT(this.lMd.zp)) {
            com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.lMd;
            com.bytedance.sdk.openadsdk.core.model.woN won = zpVar.zp;
            KS.lMd(won, zpVar.QR, won.gKR());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void rV() {
        View dT = this.lMd.rCC.dT();
        if (dT != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:16:0x00b4 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:17:0x00b5  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r4) {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.AnonymousClass3.onClick(android.view.View):void");
                }
            };
            dT.setOnClickListener(onClickListener);
            dT.setTag(dT.getId(), onClickListener);
        }
        this.lMd.Rh.zp(new com.bytedance.sdk.openadsdk.component.reward.top.lMd() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lMd
            public void KS(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.lMd.Iv.zp(tTRewardVideoActivity.KS);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lMd
            public void lMd(View view) {
                com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = TTRewardVideoActivity.this.KS;
                if (lmd != null && lmd.jU() != null) {
                    TTRewardVideoActivity.this.KS.jU().zp(TTRewardVideoActivity.this.lMd.jU);
                }
                TTRewardVideoActivity.this.lMd.jU = !r3.jU;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(TTRewardVideoActivity.this.lMd.jU);
                sb.append(" mLastVolume=");
                sb.append(TTRewardVideoActivity.this.lMd.aax.zp());
                com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = TTRewardVideoActivity.this.lMd;
                zpVar.UPs.lMd(zpVar.jU);
                if (com.bytedance.sdk.openadsdk.core.model.cz.vDp(TTRewardVideoActivity.this.lMd.zp) && !TTRewardVideoActivity.this.lMd.FP.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.cz.lMd(TTRewardVideoActivity.this.lMd.zp)) {
                    com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar2 = TTRewardVideoActivity.this.lMd;
                    zpVar2.aax.zp(zpVar2.jU, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar3 = TTRewardVideoActivity.this.lMd;
                zpVar3.si.jU(zpVar3.jU);
                com.bytedance.sdk.openadsdk.core.model.woN won = TTRewardVideoActivity.this.lMd.zp;
                if (won != null && won.xg() != null && TTRewardVideoActivity.this.lMd.zp.xg().zp() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar4 = TTRewardVideoActivity.this.lMd;
                    if (zpVar4.UPs != null) {
                        if (zpVar4.jU) {
                            zpVar4.zp.xg().zp().ku(TTRewardVideoActivity.this.lMd.UPs.QR());
                        } else {
                            zpVar4.zp.xg().zp().YW(TTRewardVideoActivity.this.lMd.UPs.QR());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lMd
            public void zp(View view) {
                if (TTRewardVideoActivity.this.lMd.zp.nz()) {
                    if (TTRewardVideoActivity.this.lMd.rCC.Bj() != null) {
                        TTRewardVideoActivity.this.lMd.zp.YhE(2);
                        TTRewardVideoActivity.this.lMd.rCC.woN();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = TTRewardVideoActivity.this.lMd;
                if (!zpVar.lMd && zpVar.zp.zf() && !TTRewardVideoActivity.this.lMd.zp.Fm()) {
                    TTRewardVideoActivity.this.lMd.zp.YhE(13);
                    try {
                        TTRewardVideoActivity.this.lMd.rCC.woN();
                        return;
                    } catch (Exception unused) {
                    }
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.zp(com.bytedance.sdk.openadsdk.core.model.cz.Bj(tTRewardVideoActivity.lMd.zp), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void vwr() {
        ot();
    }

    public void zp(String str) {
        zp(str, false, 0, "", 0, "");
    }

    private void zp(final String str, final boolean z8, final int i9, final String str2, final int i10, final String str3) {
        QUv.KS(new ku("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.zp(0).executeRewardVideoCallback(TTRewardVideoActivity.this.lMd.KS, str, z8, i9, str2, i10, str3);
                } catch (Throwable th) {
                    tG.zp("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void zp(Bundle bundle) {
        if (!lMd.KS()) {
            this.rV = com.bytedance.sdk.openadsdk.core.cz.zp().KS();
        }
        if (this.rV != null || bundle == null) {
            return;
        }
        this.rV = ot;
        ot = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void zp() {
        this.lMd.Rh.zp(null, TTAdDislikeToast.getSkipText());
        this.lMd.Rh.COT(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final boolean z8, boolean z9) {
        if (!z9 && this.RCv && com.bytedance.sdk.openadsdk.core.model.cz.KS(this.lMd.zp)) {
            this.lMd.si.QR();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.KVG.jU().ku(String.valueOf(this.lMd.dQp))) {
            if (!z9 && this.lMd.FP.get() && com.bytedance.sdk.openadsdk.core.model.cz.KS(this.lMd.zp)) {
                this.lMd.si.QR();
                return;
            } else if (z8) {
                finish();
                return;
            } else {
                FP();
                return;
            }
        }
        if (this.yRU.get()) {
            if (com.bytedance.sdk.openadsdk.core.model.cz.KS(this.lMd.zp)) {
                this.lMd.si.QR();
                return;
            } else if (z8) {
                finish();
                return;
            } else {
                FP();
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.cz.KS(this.lMd.zp) && this.lMd.si.YW().getVisibility() == 0) {
            this.lMd.si.QR();
            return;
        }
        this.lMd.YhE.set(true);
        this.lMd.UPs.dQp();
        if (z8) {
            this.lMd.ffE.dQp();
        }
        final com.bytedance.sdk.openadsdk.core.widget.zp zpVar = new com.bytedance.sdk.openadsdk.core.widget.zp(this);
        this.KS.tG = zpVar;
        if (z8) {
            zpVar.zp(KVG).lMd(pvr).KS(woN);
        } else {
            zpVar.zp(dQp).lMd(vwr).KS(woN);
        }
        this.KS.tG.zp(new zp.InterfaceC0120zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.InterfaceC0120zp
            public void lMd() {
                zpVar.dismiss();
                TTRewardVideoActivity.this.RCv = true;
                TTRewardVideoActivity.this.lMd.YhE.set(false);
                TTRewardVideoActivity.this.lMd.ffE.HWF(Integer.MAX_VALUE);
                if (!z8) {
                    TTRewardVideoActivity.this.FP();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.cz.KS(TTRewardVideoActivity.this.lMd.zp)) {
                    if (TTRewardVideoActivity.this.lMd.ffE.pvr()) {
                        TTRewardVideoActivity.this.lMd.ffE.lMd(5);
                        return;
                    } else {
                        TTRewardVideoActivity.this.lMd.si.QR();
                        return;
                    }
                }
                TTRewardVideoActivity.this.lMd.oKZ.HWF();
                if (TTRewardVideoActivity.this.lMd.ffE.pvr()) {
                    TTRewardVideoActivity.this.lMd.ffE.lMd(4);
                }
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.zp.InterfaceC0120zp
            public void zp() {
                TTRewardVideoActivity.this.lMd.UPs.rV();
                if (z8) {
                    TTRewardVideoActivity.this.lMd.ffE.zp(1000L);
                }
                zpVar.dismiss();
                TTRewardVideoActivity.this.lMd.YhE.set(false);
            }
        }).show();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void zp(@NonNull Intent intent) {
        super.zp(intent);
        this.cz = intent.getStringExtra("media_extra");
        this.FP = intent.getStringExtra("user_id");
    }

    public boolean zp(long j7, boolean z8) {
        QR qr = new QR();
        qr.zp(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.lMd;
        zpVar.UPs.zp(zpVar.rCC.HWF(), qr);
        KS.zp zpVar2 = new KS.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            boolean zp;

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void lMd(long j9, int i9) {
                TTRewardVideoActivity.this.jU.removeMessages(300);
                if (TTRewardVideoActivity.this.lMd.UPs.lMd()) {
                    TTRewardVideoActivity.this.vDp();
                    return;
                }
                TTRewardVideoActivity.this.lMd.UPs.tG();
                TTRewardVideoActivity.this.cz();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.lMd.lMd) {
                    tTRewardVideoActivity.zp(false, true, 3);
                } else {
                    tTRewardVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.zp.tG tGVar = TTRewardVideoActivity.this.lMd.UPs;
                tGVar.zp(!tGVar.Lij() ? 1 : 0, 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp(long j9, int i9) {
                Bj bj;
                if (this.zp) {
                    return;
                }
                this.zp = true;
                TTRewardVideoActivity.this.jU.removeMessages(300);
                TTRewardVideoActivity.this.tG();
                TTRewardVideoActivity.this.cz();
                TTRewardVideoActivity.this.lMd.cW.set(true);
                if (TTRewardVideoActivity.this.lMd.zp.eS()) {
                    TTRewardVideoActivity.this.lMd.zp.YhE(1);
                    TTRewardVideoActivity.this.lMd.rCC.woN();
                }
                if (TTRewardVideoActivity.this.lMd.zp.rV() == 21 && !TTRewardVideoActivity.this.lMd.zp.KS()) {
                    TTRewardVideoActivity.this.lMd.zp.lMd(true);
                    TTRewardVideoActivity.this.lMd.rCC.woN();
                }
                TTRewardVideoActivity.this.tG = (int) (System.currentTimeMillis() / 1000);
                if (!dQp.KS(TTRewardVideoActivity.this.lMd.zp) && !dQp.lMd(TTRewardVideoActivity.this.lMd.zp) && !dQp.jU(TTRewardVideoActivity.this.lMd.zp)) {
                    if (dQp.zp(TTRewardVideoActivity.this.lMd.zp) && !TTRewardVideoActivity.this.lMd.Gzh.get()) {
                        TTRewardVideoActivity.this.lMd.zp(true);
                        TTRewardVideoActivity.this.lMd.Rh.COT(true);
                        return;
                    }
                    TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                    if (tTRewardVideoActivity.lMd.lMd) {
                        tTRewardVideoActivity.zp(false, 5);
                        return;
                    } else {
                        tTRewardVideoActivity.finish();
                        return;
                    }
                }
                TTRewardVideoActivity.this.zp(false, 5);
                if (!dQp.lMd(TTRewardVideoActivity.this.lMd.zp) || (bj = TTRewardVideoActivity.this.lMd.fs) == null) {
                    return;
                }
                bj.zp(0L);
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp() {
                TTRewardVideoActivity.this.jU.removeMessages(300);
                TTRewardVideoActivity.this.tG();
                TTRewardVideoActivity.this.cz();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.lMd.lMd) {
                    tTRewardVideoActivity.zp(false, true, 6);
                } else {
                    tTRewardVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.zp.tG tGVar = TTRewardVideoActivity.this.lMd.UPs;
                tGVar.zp(!tGVar.Lij() ? 1 : 0, 1 ^ (TTRewardVideoActivity.this.lMd.UPs.Lij() ? 1 : 0));
                TTRewardVideoActivity.this.lMd.UPs.tG();
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp(long j9, long j10) {
                com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar3 = TTRewardVideoActivity.this.lMd;
                if (!zpVar3.COT && zpVar3.UPs.lMd()) {
                    TTRewardVideoActivity.this.lMd.UPs.dQp();
                }
                if (TTRewardVideoActivity.this.lMd.FP.get()) {
                    return;
                }
                TTRewardVideoActivity.this.jU.removeMessages(300);
                if (j9 != TTRewardVideoActivity.this.lMd.UPs.ku()) {
                    TTRewardVideoActivity.this.tG();
                }
                TTRewardVideoActivity.this.lMd.UPs.zp(j9, j10);
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                long j11 = j9 / 1000;
                double d2 = j11;
                tTRewardVideoActivity.HWF = (int) (tTRewardVideoActivity.lMd.UPs.Gzh() - d2);
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                int i9 = tTRewardVideoActivity2.HWF;
                if (i9 >= 0) {
                    tTRewardVideoActivity2.lMd.Rh.zp(String.valueOf(i9), null);
                }
                TTRewardVideoActivity tTRewardVideoActivity3 = TTRewardVideoActivity.this;
                tTRewardVideoActivity3.HWF = (int) (tTRewardVideoActivity3.lMd.UPs.Gzh() - d2);
                int i10 = (int) j11;
                int dT = com.bytedance.sdk.openadsdk.core.KVG.jU().dT(String.valueOf(TTRewardVideoActivity.this.lMd.dQp));
                boolean z9 = dT >= 0;
                if ((TTRewardVideoActivity.this.lMd.YhE.get() || TTRewardVideoActivity.this.lMd.ot.get()) && TTRewardVideoActivity.this.lMd.UPs.lMd()) {
                    TTRewardVideoActivity.this.lMd.UPs.dQp();
                }
                TTRewardVideoActivity.this.lMd.rCC.COT(i10);
                TTRewardVideoActivity.this.zp(j9, j10);
                TTRewardVideoActivity tTRewardVideoActivity4 = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity4.HWF > 0) {
                    tTRewardVideoActivity4.lMd.Rh.jU(true);
                    if (z9 && i10 >= dT) {
                        TTRewardVideoActivity.this.lMd.zp(true);
                        TTRewardVideoActivity tTRewardVideoActivity5 = TTRewardVideoActivity.this;
                        tTRewardVideoActivity5.lMd.Rh.zp(String.valueOf(tTRewardVideoActivity5.HWF), TTAdDislikeToast.getSkipText());
                        TTRewardVideoActivity.this.lMd.Rh.COT(true);
                        return;
                    }
                    TTRewardVideoActivity tTRewardVideoActivity6 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity6.lMd.Rh.zp(String.valueOf(tTRewardVideoActivity6.HWF), null);
                }
            }
        };
        this.lMd.UPs.zp(zpVar2);
        dQp dqp = this.lMd.rCC.dQp;
        if (dqp != null) {
            dqp.zp(zpVar2);
        }
        boolean zp = this.lMd.UPs.zp(j7, z8, null, this.KS);
        if (zp && !z8) {
            this.vDp = (int) (System.currentTimeMillis() / 1000);
        }
        return zp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final boolean z8, final int i9, final String str, final int i10, final String str2) {
        pvr.zp("BVA", "invoke callback onRewardVerify: " + z8 + ", " + i9 + ", " + str + ", " + i10 + ", " + str2 + "; " + this);
        if (lMd.KS()) {
            zp("onRewardVerify", z8, i9, str, i10, str2);
        } else {
            this.jU.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.apiImpl.jU.zp zpVar = TTRewardVideoActivity.this.rV;
                    if (zpVar != null) {
                        zpVar.zp(z8, i9, str, i10, str2);
                    }
                }
            });
        }
    }

    public void zp(long j7, long j9) {
        long j10 = (this.lMd.ku * 1000) + j7;
        if (this.ox == -1) {
            this.ox = com.bytedance.sdk.openadsdk.core.KVG.jU().Gzh(String.valueOf(this.lMd.dQp)).HWF;
        }
        if (j9 <= 0) {
            return;
        }
        if (j9 >= 30000 && j10 >= 27000) {
            cz();
        } else if (((float) (j10 * 100)) / ((float) j9) >= this.ox) {
            cz();
        }
    }
}
