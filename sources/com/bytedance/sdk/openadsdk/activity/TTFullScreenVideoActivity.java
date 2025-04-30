package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.component.reward.zp.zp;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;
import com.bytedance.sdk.openadsdk.rV.zp.COT;
import com.bytedance.sdk.openadsdk.utils.Bj;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.pvr;

/* loaded from: classes.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static lMd tG;
    private boolean rV;
    private lMd vDp;

    private void FP() {
        if (!this.ku) {
            this.ku = true;
            pvr.zp("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                zp("onAdClose");
                return;
            }
            lMd lmd = this.vDp;
            if (lmd != null) {
                lmd.lMd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cz() {
        pvr.zp("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp("onAdVideoBarClick");
            return;
        }
        lMd lmd = this.vDp;
        if (lmd != null) {
            lmd.onAdClicked();
        }
    }

    private void jU(int i9) {
        this.lMd.Rh.zp(null, new SpannableStringBuilder(String.format(cz.zp(KVG.zp(), "tt_skip_ad_time_text"), Integer.valueOf(i9))));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void KS(int i9) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean dQp() {
        return false;
    }

    public void finalize() throws Throwable {
        super.finalize();
        tG = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        zp zpVar = this.lMd;
        if (zpVar != null) {
            zpVar.ffE.lMd(zpVar.woN);
        }
        try {
            FP();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ku() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp("onAdShow");
        } else {
            lMd lmd = this.vDp;
            if (lmd != null) {
                lmd.zp();
            }
        }
        if (KVG()) {
            this.lMd.eWG.dT();
        }
    }

    public void lMd(int i9) {
        int vwr = KVG.jU().vwr(String.valueOf(this.lMd.dQp));
        if (vwr < 0) {
            vwr = 5;
        }
        if (!KVG.jU().HWF(String.valueOf(this.lMd.dQp)) || (!woN.COT(this.lMd.zp) && !this.lMd.lMd)) {
            if (i9 >= vwr) {
                zp zpVar = this.lMd;
                if (!zpVar.KVG) {
                    zpVar.zp(true);
                }
                zp();
                return;
            }
            return;
        }
        zp zpVar2 = this.lMd;
        if (!zpVar2.KVG) {
            zpVar2.zp(true);
        }
        if (i9 <= vwr) {
            jU(vwr - i9);
            this.lMd.Rh.COT(false);
        } else {
            zp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zp zpVar = this.lMd;
        if (zpVar != null && !woN.COT(zpVar.zp)) {
            com.bykv.vk.openvk.component.video.api.KS.lMd eWG = this.lMd.zp.eWG();
            if (eWG == null) {
                com.bykv.vk.openvk.component.video.api.KS.lMd lmd = new com.bykv.vk.openvk.component.video.api.KS.lMd();
                lmd.zp(10.0d);
                this.lMd.zp.zp(lmd);
            } else if (eWG.HWF() <= 0.0d) {
                eWG.zp(10.0d);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FP();
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            zp("recycleRes");
        }
        this.vDp = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        FullRewardExpressView zp;
        super.onResume();
        zp zpVar = this.lMd;
        if (zpVar != null && (zp = zpVar.eWG.zp()) != null) {
            zp.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lMd() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.lMd
                public void zp() {
                    TTFullScreenVideoActivity.this.cz();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        tG = this.vDp;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        zp zpVar = this.lMd;
        if (zpVar != null && lMd(zpVar.zp) && !zp(this.lMd.zp)) {
            if (this.rV) {
                this.rV = false;
                finish();
            } else if (this.lMd.si.cW()) {
                finish();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void pvr() {
        cz();
        this.lMd.zp.JR();
        this.lMd.zp.zp(true);
        if (woN.COT(this.lMd.zp)) {
            zp zpVar = this.lMd;
            woN won = zpVar.zp;
            KS.lMd(won, zpVar.QR, won.gKR());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void rV() {
        View dT = this.lMd.rCC.dT();
        if (dT != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r4) {
                    /*
                        r3 = this;
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.rV r4 = r4.si
                        boolean r4 = r4.yRU()
                        if (r4 == 0) goto L3a
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        java.util.concurrent.atomic.AtomicBoolean r4 = r4.FP
                        boolean r4 = r4.get()
                        if (r4 == 0) goto L3a
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.rV r4 = r4.si
                        r4.UPs()
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.view.COT r4 = r4.rCC
                        r0 = 8
                        r4.HWF(r0)
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.component.utils.RCv r4 = r4.qtv
                        r0 = 600(0x258, float:8.41E-43)
                        r1 = 5000(0x1388, double:2.4703E-320)
                        r4.sendEmptyMessageDelayed(r0, r1)
                        return
                    L3a:
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.core.model.woN r4 = r4.zp
                        boolean r4 = r4.zf()
                        if (r4 == 0) goto Lb0
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.core.model.woN r4 = r4.zp
                        boolean r4 = r4.Fm()
                        if (r4 == 0) goto L6b
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.COT r0 = r4.gH
                        if (r0 == 0) goto Lb0
                        com.bytedance.sdk.openadsdk.core.model.woN r4 = r4.zp
                        r0 = 2
                        r4.YhE(r0)
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.COT r4 = r4.gH
                        boolean r4 = r4.COT()
                        goto Lb1
                    L6b:
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.core.model.woN r4 = r4.zp
                        int r4 = r4.que()
                        if (r4 != 0) goto Lb0
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.rV r4 = r4.si
                        boolean r4 = r4.dQp()
                        if (r4 != 0) goto Lb0
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.core.model.woN r4 = r4.zp
                        r0 = 11
                        r4.YhE(r0)
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.rV r4 = r4.si
                        boolean r4 = r4.jU()
                        if (r4 == 0) goto La5
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.core.model.woN r4 = r4.zp
                        r0 = 12
                        r4.YhE(r0)
                    La5:
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this     // Catch: java.lang.Exception -> Lb0
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd     // Catch: java.lang.Exception -> Lb0
                        com.bytedance.sdk.openadsdk.component.reward.view.COT r4 = r4.rCC     // Catch: java.lang.Exception -> Lb0
                        r4.woN()     // Catch: java.lang.Exception -> Lb0
                        r4 = 1
                        goto Lb1
                    Lb0:
                        r4 = 0
                    Lb1:
                        if (r4 == 0) goto Lb4
                        return
                    Lb4:
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.rV r4 = r4.si
                        r4.ox()
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.Bj r4 = r4.DY
                        r4.YW()
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        com.bytedance.sdk.openadsdk.component.reward.zp.zp r4 = r4.lMd
                        com.bytedance.sdk.openadsdk.component.reward.zp.ku r4 = r4.oKZ
                        r4.HWF()
                        com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.this
                        r4.finish()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.AnonymousClass3.onClick(android.view.View):void");
                }
            };
            dT.setOnClickListener(onClickListener);
            dT.setTag(dT.getId(), onClickListener);
        }
        this.lMd.Rh.zp(new com.bytedance.sdk.openadsdk.component.reward.top.lMd() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lMd
            public void KS(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.lMd.Iv.zp(tTFullScreenVideoActivity.KS);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lMd
            public void lMd(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.lMd.jU = !r0.jU;
                com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = tTFullScreenVideoActivity.KS;
                if (lmd != null && lmd.jU() != null) {
                    TTFullScreenVideoActivity.this.KS.jU().zp(TTFullScreenVideoActivity.this.lMd.jU);
                }
                zp zpVar = TTFullScreenVideoActivity.this.lMd;
                zpVar.UPs.lMd(zpVar.jU);
                if (com.bytedance.sdk.openadsdk.core.model.cz.vDp(TTFullScreenVideoActivity.this.lMd.zp) && !TTFullScreenVideoActivity.this.lMd.FP.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.cz.lMd(TTFullScreenVideoActivity.this.lMd.zp)) {
                    zp zpVar2 = TTFullScreenVideoActivity.this.lMd;
                    zpVar2.aax.zp(zpVar2.jU, true);
                }
                zp zpVar3 = TTFullScreenVideoActivity.this.lMd;
                zpVar3.si.jU(zpVar3.jU);
                woN won = TTFullScreenVideoActivity.this.lMd.zp;
                if (won != null && won.xg() != null && TTFullScreenVideoActivity.this.lMd.zp.xg().zp() != null) {
                    zp zpVar4 = TTFullScreenVideoActivity.this.lMd;
                    if (zpVar4.UPs != null) {
                        if (zpVar4.jU) {
                            zpVar4.zp.xg().zp().ku(TTFullScreenVideoActivity.this.lMd.UPs.QR());
                        } else {
                            zpVar4.zp.xg().zp().YW(TTFullScreenVideoActivity.this.lMd.UPs.QR());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lMd
            public void zp(View view) {
                if (com.bytedance.sdk.openadsdk.core.model.cz.KS(TTFullScreenVideoActivity.this.lMd.zp) && (com.bytedance.sdk.openadsdk.core.model.cz.Bj(TTFullScreenVideoActivity.this.lMd.zp) || TTFullScreenVideoActivity.this.lMd.FP.get())) {
                    if (TTFullScreenVideoActivity.this.lMd.ffE.pvr()) {
                        TTFullScreenVideoActivity.this.lMd.ffE.lMd(5);
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.lMd.si.QR();
                        return;
                    }
                }
                if (!com.bytedance.sdk.openadsdk.core.model.cz.Bj(TTFullScreenVideoActivity.this.lMd.zp) && (!dQp.zp(TTFullScreenVideoActivity.this.lMd.zp) || TTFullScreenVideoActivity.this.lMd.Gzh.get())) {
                    if (TTFullScreenVideoActivity.this.lMd.zp.nz()) {
                        if (TTFullScreenVideoActivity.this.lMd.rCC.Bj() != null) {
                            TTFullScreenVideoActivity.this.lMd.zp.YhE(2);
                            TTFullScreenVideoActivity.this.lMd.rCC.woN();
                            return;
                        }
                        return;
                    }
                    zp zpVar = TTFullScreenVideoActivity.this.lMd;
                    if (!zpVar.lMd && zpVar.zp.zf() && !TTFullScreenVideoActivity.this.lMd.zp.Fm()) {
                        TTFullScreenVideoActivity.this.lMd.zp.YhE(13);
                        try {
                            TTFullScreenVideoActivity.this.lMd.rCC.woN();
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    dQp.zp zpVar2 = new dQp.zp();
                    zpVar2.zp(TTFullScreenVideoActivity.this.lMd.UPs.QR());
                    zpVar2.KS(TTFullScreenVideoActivity.this.lMd.UPs.pvr());
                    zpVar2.lMd(TTFullScreenVideoActivity.this.lMd.UPs.Bj());
                    zpVar2.KS(3);
                    zpVar2.jU(TTFullScreenVideoActivity.this.lMd.UPs.vwr());
                    com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(TTFullScreenVideoActivity.this.lMd.UPs.KS(), zpVar2, TTFullScreenVideoActivity.this.lMd.UPs.zp());
                    com.bytedance.sdk.openadsdk.core.pvr.KS(TTFullScreenVideoActivity.this.lMd.dQp);
                    TTFullScreenVideoActivity.this.lMd.UPs.zp("skip");
                    TTFullScreenVideoActivity.this.lMd.Rh.jU(false);
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    if (tTFullScreenVideoActivity.lMd.lMd) {
                        tTFullScreenVideoActivity.zp(true, 4);
                    } else {
                        tTFullScreenVideoActivity.finish();
                    }
                    woN won = TTFullScreenVideoActivity.this.lMd.zp;
                    if (won != null && won.xg() != null) {
                        zp zpVar3 = TTFullScreenVideoActivity.this.lMd;
                        if (zpVar3.UPs != null) {
                            zpVar3.zp.xg().zp().HWF(TTFullScreenVideoActivity.this.lMd.UPs.QR());
                            TTFullScreenVideoActivity.this.lMd.zp.xg().zp().COT(TTFullScreenVideoActivity.this.lMd.UPs.QR());
                        }
                    }
                    COT.zp(TTFullScreenVideoActivity.this.lMd.zp, 5);
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.cz.KS(TTFullScreenVideoActivity.this.lMd.zp) && TTFullScreenVideoActivity.this.lMd.ffE.pvr()) {
                    TTFullScreenVideoActivity.this.lMd.ffE.lMd(4);
                }
                TTFullScreenVideoActivity.this.finish();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void vwr() {
        if (this.lMd.zp.CZ() != 100.0f) {
            this.rV = true;
        }
        cz();
    }

    private void zp(final String str) {
        QUv.KS(new ku("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.zp(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.lMd.KS, str);
                } catch (Throwable th) {
                    tG.zp("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void zp(@NonNull Intent intent) {
        super.zp(intent);
        this.lMd.woN = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public void zp(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            this.vDp = com.bytedance.sdk.openadsdk.core.cz.zp().jU();
        }
        if (this.vDp != null || bundle == null) {
            return;
        }
        this.vDp = tG;
        tG = null;
    }

    public boolean zp(long j7, boolean z8) {
        QR qr = new QR();
        qr.zp(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd = this.KS;
        if (lmd != null && (lmd instanceof com.bytedance.sdk.openadsdk.component.reward.lMd.ku)) {
            this.lMd.UPs.zp(((com.bytedance.sdk.openadsdk.component.reward.lMd.ku) lmd).cW(), qr);
        } else {
            zp zpVar = this.lMd;
            zpVar.UPs.zp(zpVar.rCC.HWF(), qr);
        }
        KS.zp zpVar2 = new KS.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean zp;

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void lMd(long j9, int i9) {
                TTFullScreenVideoActivity.this.jU.removeMessages(300);
                if (TTFullScreenVideoActivity.this.lMd.UPs.lMd()) {
                    TTFullScreenVideoActivity.this.vDp();
                    return;
                }
                TTFullScreenVideoActivity.this.lMd.UPs.tG();
                tG.zp("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.lMd.lMd) {
                    tTFullScreenVideoActivity.zp(false, true, 3);
                    com.bytedance.sdk.openadsdk.component.reward.zp.tG tGVar = TTFullScreenVideoActivity.this.lMd.UPs;
                    tGVar.zp(!tGVar.Lij() ? 1 : 0, 2);
                    return;
                }
                tTFullScreenVideoActivity.finish();
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp(long j9, int i9) {
                Bj bj;
                if (this.zp) {
                    return;
                }
                this.zp = true;
                TTFullScreenVideoActivity.this.jU.removeMessages(300);
                TTFullScreenVideoActivity.this.tG();
                TTFullScreenVideoActivity.this.lMd.cW.set(true);
                if (TTFullScreenVideoActivity.this.lMd.zp.eS()) {
                    TTFullScreenVideoActivity.this.lMd.zp.YhE(1);
                    TTFullScreenVideoActivity.this.lMd.rCC.woN();
                }
                if (TTFullScreenVideoActivity.this.lMd.zp.rV() == 21 && !TTFullScreenVideoActivity.this.lMd.zp.KS()) {
                    TTFullScreenVideoActivity.this.lMd.zp.lMd(true);
                    TTFullScreenVideoActivity.this.lMd.rCC.woN();
                }
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.lMd.lMd) {
                    tTFullScreenVideoActivity.zp(false, 5);
                    if (!com.bytedance.sdk.openadsdk.core.model.dQp.lMd(TTFullScreenVideoActivity.this.lMd.zp) || (bj = TTFullScreenVideoActivity.this.lMd.fs) == null) {
                        return;
                    }
                    bj.zp(0L);
                    return;
                }
                tTFullScreenVideoActivity.finish();
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp() {
                TTFullScreenVideoActivity.this.jU.removeMessages(300);
                TTFullScreenVideoActivity.this.tG();
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.lMd.lMd) {
                    tTFullScreenVideoActivity.zp(false, true, 6);
                } else {
                    tTFullScreenVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.zp.tG tGVar = TTFullScreenVideoActivity.this.lMd.UPs;
                tGVar.zp(!tGVar.Lij() ? 1 : 0, 1 ^ (TTFullScreenVideoActivity.this.lMd.UPs.Lij() ? 1 : 0));
                TTFullScreenVideoActivity.this.lMd.UPs.tG();
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp(long j9, long j10) {
                zp zpVar3 = TTFullScreenVideoActivity.this.lMd;
                if (!zpVar3.COT && zpVar3.UPs.lMd()) {
                    TTFullScreenVideoActivity.this.lMd.UPs.dQp();
                }
                if (TTFullScreenVideoActivity.this.lMd.FP.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.jU.removeMessages(300);
                if (j9 != TTFullScreenVideoActivity.this.lMd.UPs.ku()) {
                    TTFullScreenVideoActivity.this.tG();
                }
                TTFullScreenVideoActivity.this.lMd.UPs.zp(j9, j10);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                long j11 = j9 / 1000;
                tTFullScreenVideoActivity.HWF = (int) (tTFullScreenVideoActivity.lMd.UPs.Gzh() - j11);
                int i9 = (int) j11;
                if ((TTFullScreenVideoActivity.this.lMd.YhE.get() || TTFullScreenVideoActivity.this.lMd.ot.get()) && TTFullScreenVideoActivity.this.lMd.UPs.lMd()) {
                    TTFullScreenVideoActivity.this.lMd.UPs.dQp();
                }
                TTFullScreenVideoActivity.this.lMd(i9);
                TTFullScreenVideoActivity tTFullScreenVideoActivity2 = TTFullScreenVideoActivity.this;
                int i10 = tTFullScreenVideoActivity2.HWF;
                if (i10 >= 0) {
                    tTFullScreenVideoActivity2.lMd.Rh.zp(String.valueOf(i10), null);
                }
            }
        };
        this.lMd.UPs.zp(zpVar2);
        com.bytedance.sdk.openadsdk.core.model.dQp dqp = this.lMd.rCC.dQp;
        if (dqp != null) {
            dqp.zp(zpVar2);
        }
        return this.lMd.UPs.zp(j7, z8, null, this.KS);
    }

    private boolean lMd(woN won) {
        if (won == null) {
            return false;
        }
        return KVG.jU().pvr(String.valueOf(this.lMd.dQp));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void zp() {
        if (!woN.COT(this.lMd.zp)) {
            zp zpVar = this.lMd;
            if (!zpVar.lMd) {
                zpVar.Rh.zp(null, "X");
                this.lMd.Rh.COT(true);
            }
        }
        this.lMd.Rh.zp(null, TTAdDislikeToast.getSkipText());
        this.lMd.Rh.COT(true);
    }

    private boolean zp(woN won) {
        return won == null || won.CZ() == 100.0f;
    }
}
