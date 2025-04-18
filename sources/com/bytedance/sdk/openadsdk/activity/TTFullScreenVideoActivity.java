package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.YFl.qsH;
import com.bytedance.sdk.openadsdk.core.VOe;
import com.bytedance.sdk.openadsdk.core.bZ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.rkt;
import com.bytedance.sdk.openadsdk.utils.aIu;
import com.bytedance.sdk.openadsdk.utils.eT;
import com.bytedance.sdk.openadsdk.utils.mn;
import l5.e;
import p5.a;

/* loaded from: classes.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.YFl.tN.Sg YoT;
    private boolean GA;
    private com.bytedance.sdk.openadsdk.YFl.tN.Sg eT;

    private void AlY(int i10) {
        this.Sg.Sco.YFl(null, String.format(qO.YFl(lG.YFl(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    private boolean Sg(Wwa wwa) {
        if (wwa == null) {
            return false;
        }
        return lG.AlY().aIu(String.valueOf(this.Sg.f10591vc));
    }

    private void aIu() {
        if (!this.qsH) {
            this.qsH = true;
            aIu.YFl("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                YFl("onAdClose");
                return;
            }
            com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2 = this.eT;
            if (sg2 != null) {
                sg2.Sg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qO() {
        aIu.YFl("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2 = this.eT;
        if (sg2 != null) {
            sg2.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void c_() {
        if (this.Sg.Sg.qjy() != 100.0f) {
            this.GA = true;
        }
        qO();
    }

    public void finalize() throws Throwable {
        super.finalize();
        YoT = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.Sg != null) {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("videoForceBreak", this.Sg.Sg);
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            yFl.UZM.YFl(yFl.Hjb);
        }
        try {
            aIu();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean lG() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl != null && !Wwa.wN(yFl.Sg)) {
            a BPI = this.Sg.Sg.BPI();
            if (BPI == null) {
                a aVar = new a();
                aVar.f23459d = 10.0d;
                this.Sg.Sg.YFl(aVar);
            } else if (BPI.f23459d <= 0.0d) {
                BPI.f23459d = 10.0d;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        aIu();
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("recycleRes");
        }
        this.eT = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.view.Sg YFl;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl != null && (YFl = yFl.YI.YFl()) != null) {
            YFl.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vc() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.vc
                public void YFl() {
                    TTFullScreenVideoActivity.this.qO();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        YoT = this.eT;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        if (yFl != null && Sg(yFl.Sg) && !YFl(this.Sg.Sg)) {
            if (this.GA) {
                this.GA = false;
                finish();
            } else if (this.Sg.mn.zB()) {
                finish();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void pDU() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void rkt() {
        final View nc2 = this.Sg.lu.nc();
        if (nc2 != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:24:0x00ee A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 272
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.AnonymousClass3.onClick(android.view.View):void");
                }
            };
            nc2.setOnClickListener(onClickListener);
            nc2.setTag(nc2.getId(), onClickListener);
        }
        this.Sg.Sco.YFl(new com.bytedance.sdk.openadsdk.component.reward.top.Sg() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void AlY(View view) {
                View view2 = nc2;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void Sg(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.Sg.iY = !r0.iY;
                com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = tTFullScreenVideoActivity.tN;
                if (sg2 != null && sg2.AlY() != null) {
                    TTFullScreenVideoActivity.this.tN.AlY().YFl(TTFullScreenVideoActivity.this.Sg.iY);
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = TTFullScreenVideoActivity.this.Sg;
                yFl.VOe.Sg(yFl.iY);
                if (Ne.qO(TTFullScreenVideoActivity.this.Sg.Sg) && !TTFullScreenVideoActivity.this.Sg.f10590nc.get()) {
                    return;
                }
                if (Ne.DSW(TTFullScreenVideoActivity.this.Sg.Sg)) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTFullScreenVideoActivity.this.Sg;
                    yFl2.pq.YFl(yFl2.iY, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = TTFullScreenVideoActivity.this.Sg;
                yFl3.mn.AlY(yFl3.iY);
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl4 = TTFullScreenVideoActivity.this.Sg;
                yFl4.UZM.vc(yFl4.iY);
                Wwa wwa = TTFullScreenVideoActivity.this.Sg.Sg;
                if (wwa != null && wwa.Af() != null && TTFullScreenVideoActivity.this.Sg.Sg.Af().YFl() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl5 = TTFullScreenVideoActivity.this.Sg;
                    if (yFl5.VOe != null) {
                        if (yFl5.iY) {
                            yFl5.Sg.Af().YFl().qsH(TTFullScreenVideoActivity.this.Sg.VOe.DSW());
                        } else {
                            yFl5.Sg.Af().YFl().NjR(TTFullScreenVideoActivity.this.Sg.VOe.DSW());
                        }
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void YFl(View view) {
                if (!Ne.vc(TTFullScreenVideoActivity.this.Sg.Sg) && (!Ne.wN(TTFullScreenVideoActivity.this.Sg.Sg) || !TTFullScreenVideoActivity.this.Sg.UZM.qsH(qsH.Sg))) {
                    if (Ne.qsH(TTFullScreenVideoActivity.this.Sg.Sg) && (Ne.Wwa(TTFullScreenVideoActivity.this.Sg.Sg) || TTFullScreenVideoActivity.this.Sg.f10590nc.get())) {
                        if (TTFullScreenVideoActivity.this.Sg.UZM.YFl()) {
                            TTFullScreenVideoActivity.this.Sg.UZM.YFl(5);
                            return;
                        } else {
                            TTFullScreenVideoActivity.this.Sg.mn.qsH();
                            return;
                        }
                    }
                    if (!Ne.Wwa(TTFullScreenVideoActivity.this.Sg.Sg) && (!rkt.YFl(TTFullScreenVideoActivity.this.Sg.Sg) || TTFullScreenVideoActivity.this.Sg.rkt.get())) {
                        if (TTFullScreenVideoActivity.this.Sg.Sg.fcp()) {
                            if (TTFullScreenVideoActivity.this.Sg.lu.eT() != null) {
                                TTFullScreenVideoActivity.this.Sg.Sg.zB(2);
                                TTFullScreenVideoActivity.this.Sg.lu.lG();
                                return;
                            }
                            return;
                        }
                        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = TTFullScreenVideoActivity.this.Sg;
                        if (!yFl.tN && yFl.Sg.pE() && !TTFullScreenVideoActivity.this.Sg.Sg.yn()) {
                            TTFullScreenVideoActivity.this.Sg.Sg.zB(13);
                            try {
                                TTFullScreenVideoActivity.this.Sg.lu.lG();
                                return;
                            } catch (Exception unused) {
                            }
                        }
                        EH.YFl yFl2 = new EH.YFl();
                        yFl2.YFl(TTFullScreenVideoActivity.this.Sg.VOe.DSW());
                        yFl2.tN(TTFullScreenVideoActivity.this.Sg.VOe.qO());
                        yFl2.Sg(TTFullScreenVideoActivity.this.Sg.VOe.eT());
                        yFl2.tN(3);
                        yFl2.AlY(TTFullScreenVideoActivity.this.Sg.VOe.Wwa());
                        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(TTFullScreenVideoActivity.this.Sg.VOe.tN(), yFl2, TTFullScreenVideoActivity.this.Sg.VOe.YFl());
                        VOe.tN(TTFullScreenVideoActivity.this.Sg.f10591vc);
                        TTFullScreenVideoActivity.this.Sg.VOe.YFl("skip", false);
                        TTFullScreenVideoActivity.this.Sg.Sco.AlY(false);
                        TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                        if (tTFullScreenVideoActivity.Sg.tN) {
                            tTFullScreenVideoActivity.YFl(true, 4);
                        } else {
                            tTFullScreenVideoActivity.finish();
                        }
                        Wwa wwa = TTFullScreenVideoActivity.this.Sg.Sg;
                        if (wwa != null && wwa.Af() != null) {
                            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = TTFullScreenVideoActivity.this.Sg;
                            if (yFl3.VOe != null) {
                                yFl3.Sg.Af().YFl().vc(TTFullScreenVideoActivity.this.Sg.VOe.DSW());
                                TTFullScreenVideoActivity.this.Sg.Sg.Af().YFl().wN(TTFullScreenVideoActivity.this.Sg.VOe.DSW());
                            }
                        }
                        com.bytedance.sdk.openadsdk.VOe.YFl.wN.YFl(TTFullScreenVideoActivity.this.Sg.Sg, 5);
                        return;
                    }
                    if (!Ne.qsH(TTFullScreenVideoActivity.this.Sg.Sg) && TTFullScreenVideoActivity.this.Sg.UZM.YFl()) {
                        TTFullScreenVideoActivity.this.Sg.UZM.YFl(4);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (Ne.nc(TTFullScreenVideoActivity.this.Sg.Sg)) {
                    TTFullScreenVideoActivity.this.Sg.UZM.lG();
                    return;
                }
                View view2 = nc2;
                if (view2 != null) {
                    view2.performClick();
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.Sg
            public void tN(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.Sg.hQ.YFl(tTFullScreenVideoActivity.tN);
            }
        });
    }

    public void tN(int i10) {
        int qO = lG.AlY().qO(String.valueOf(this.Sg.f10591vc));
        if (lG.AlY().vc(String.valueOf(this.Sg.f10591vc)) && (Wwa.wN(this.Sg.Sg) || this.Sg.tN)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            if (!yFl.f10589ib) {
                yFl.YFl(true);
            }
            if (i10 <= qO) {
                AlY(qO - i10);
                this.Sg.Sco.wN(false);
                return;
            } else {
                YFl();
                return;
            }
        }
        if (i10 >= qO) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = this.Sg;
            if (!yFl2.f10589ib) {
                yFl2.YFl(true);
            }
            YFl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void wN() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2 = this.eT;
            if (sg2 != null) {
                sg2.YFl();
            }
        }
        if (Wwa()) {
            this.Sg.YI.nc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void AlY() {
        qO();
        this.Sg.Sg.OPr();
        this.Sg.Sg.YFl(true);
        if (Wwa.wN(this.Sg.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            Wwa wwa = yFl.Sg;
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, yFl.wN, wwa.iyg());
        }
    }

    private void YFl(final String str) {
        mn.tN(new com.bytedance.sdk.component.qsH.qsH("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.Sg(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.Sg.fIu, str);
                } catch (Throwable th2) {
                    YoT.YFl("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void YFl(@NonNull Intent intent) {
        super.YFl(intent);
        this.Sg.Hjb = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public void YFl(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            this.eT = bZ.YFl().AlY();
        }
        if (this.eT != null || bundle == null) {
            return;
        }
        this.eT = YoT;
        YoT = null;
    }

    public boolean YFl(long j3, boolean z10) {
        DSW dsw = new DSW();
        dsw.YFl(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2 = this.tN;
        if (sg2 != null && (sg2 instanceof com.bytedance.sdk.openadsdk.component.reward.Sg.qsH)) {
            this.Sg.VOe.YFl(((com.bytedance.sdk.openadsdk.component.reward.Sg.qsH) sg2).Cfr(), dsw);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            yFl.VOe.YFl(yFl.lu.vc(), dsw);
        }
        e eVar = new e() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean YFl;

            @Override // l5.e
            public void Sg(long j10, int i10) {
                TTFullScreenVideoActivity.this.AlY.removeMessages(300);
                if (TTFullScreenVideoActivity.this.Sg.VOe.Sg()) {
                    TTFullScreenVideoActivity.this.GA();
                    return;
                }
                TTFullScreenVideoActivity.this.Sg.VOe.GA();
                YoT.YFl("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.Sg.tN) {
                    tTFullScreenVideoActivity.YFl(false, true, 3);
                    com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = TTFullScreenVideoActivity.this.Sg.VOe;
                    lGVar.YFl(!lGVar.Ga() ? 1 : 0, 2);
                    return;
                }
                tTFullScreenVideoActivity.finish();
            }

            @Override // l5.e
            public void YFl(long j10, int i10) {
                eT eTVar;
                if (this.YFl) {
                    return;
                }
                this.YFl = true;
                TTFullScreenVideoActivity.this.AlY.removeMessages(300);
                TTFullScreenVideoActivity.this.EH();
                TTFullScreenVideoActivity.this.Sg.VOe.YFl(j10, j10);
                TTFullScreenVideoActivity.this.Sg.qO.set(true);
                if (TTFullScreenVideoActivity.this.Sg.Sg.rkt() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTFullScreenVideoActivity.this.Sg;
                    if (yFl2.tN) {
                        yFl2.bZ.tN().AlY();
                        com.bytedance.sdk.openadsdk.utils.YoT.Sg();
                    }
                }
                if (TTFullScreenVideoActivity.this.Sg.Sg.QGo()) {
                    TTFullScreenVideoActivity.this.Sg.Sg.zB(1);
                    TTFullScreenVideoActivity.this.Sg.lu.lG();
                }
                if (TTFullScreenVideoActivity.this.Sg.Sg.rkt() == 21 && !TTFullScreenVideoActivity.this.Sg.Sg.AlY()) {
                    TTFullScreenVideoActivity.this.Sg.Sg.Sg(true);
                    TTFullScreenVideoActivity.this.Sg.lu.lG();
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = TTFullScreenVideoActivity.this.Sg;
                if (yFl3.tN) {
                    if (yFl3.Sg.Xns()) {
                        TTFullScreenVideoActivity.this.Sg.Sco.tN();
                        return;
                    }
                    TTFullScreenVideoActivity.this.YFl(false, 5);
                    if (rkt.Sg(TTFullScreenVideoActivity.this.Sg.Sg) && (eTVar = TTFullScreenVideoActivity.this.Sg.Bn) != null) {
                        eTVar.YFl(0L);
                    }
                    if (Wwa.wN(TTFullScreenVideoActivity.this.Sg.Sg)) {
                        return;
                    }
                    TTFullScreenVideoActivity.this.Sg.VOe.YFl("skip", true);
                    return;
                }
                if (yFl3.Sg.Xns()) {
                    TTFullScreenVideoActivity.this.Sg.Sco.tN();
                    return;
                }
                if (!Wwa.wN(TTFullScreenVideoActivity.this.Sg.Sg)) {
                    TTFullScreenVideoActivity.this.Sg.VOe.YFl("skip", true);
                }
                TTFullScreenVideoActivity.this.finish();
            }

            @Override // l5.e
            public void YFl() {
                TTFullScreenVideoActivity.this.AlY.removeMessages(300);
                TTFullScreenVideoActivity.this.EH();
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.Sg.tN) {
                    tTFullScreenVideoActivity.YFl(false, true, 6);
                } else {
                    tTFullScreenVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.lG lGVar = TTFullScreenVideoActivity.this.Sg.VOe;
                lGVar.YFl(!lGVar.Ga() ? 1 : 0, 1 ^ (TTFullScreenVideoActivity.this.Sg.VOe.Ga() ? 1 : 0));
                TTFullScreenVideoActivity.this.Sg.VOe.GA();
            }

            @Override // l5.e
            public void YFl(long j10, long j11) {
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTFullScreenVideoActivity.this.Sg;
                if (!yFl2.Bh && yFl2.VOe.Sg()) {
                    TTFullScreenVideoActivity.this.Sg.VOe.EH();
                }
                if (TTFullScreenVideoActivity.this.Sg.f10590nc.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.AlY.removeMessages(300);
                if (j10 != TTFullScreenVideoActivity.this.Sg.VOe.qsH()) {
                    TTFullScreenVideoActivity.this.EH();
                }
                TTFullScreenVideoActivity.this.Sg.VOe.YFl(j10, j11);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                long j12 = j10 / 1000;
                tTFullScreenVideoActivity.f10538vc = (int) (tTFullScreenVideoActivity.Sg.VOe.dXO() - j12);
                int i10 = (int) j12;
                if ((TTFullScreenVideoActivity.this.Sg.aIu.get() || TTFullScreenVideoActivity.this.Sg.eT.get()) && TTFullScreenVideoActivity.this.Sg.VOe.Sg()) {
                    TTFullScreenVideoActivity.this.Sg.VOe.EH();
                }
                TTFullScreenVideoActivity.this.tN(i10);
                TTFullScreenVideoActivity tTFullScreenVideoActivity2 = TTFullScreenVideoActivity.this;
                int i11 = tTFullScreenVideoActivity2.f10538vc;
                if (i11 >= 0) {
                    tTFullScreenVideoActivity2.Sg.Sco.YFl(String.valueOf(i11), null);
                }
            }
        };
        this.Sg.VOe.YFl(eVar);
        rkt rktVar = this.Sg.lu.EH;
        if (rktVar != null) {
            rktVar.YFl(eVar);
        }
        return this.Sg.VOe.YFl(j3, z10, null, this.tN);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void YFl() {
        if (!Wwa.wN(this.Sg.Sg)) {
            com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
            if (!yFl.tN) {
                yFl.Sco.YFl(null, "X");
                this.Sg.Sco.wN(true);
            }
        }
        this.Sg.Sco.YFl(null, TTAdDislikeToast.getSkipText());
        this.Sg.Sco.wN(true);
    }

    private boolean YFl(Wwa wwa) {
        return wwa == null || wwa.qjy() == 100.0f;
    }
}
