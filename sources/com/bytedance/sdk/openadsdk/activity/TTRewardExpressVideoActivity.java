package com.bytedance.sdk.openadsdk.activity;

import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.YFl.lG;
import com.bytedance.sdk.openadsdk.component.reward.view.qsH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.YoT;
import java.util.HashMap;
import java.util.Iterator;
import l5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean Wwa() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.GA.AlY.Sg
    public boolean YFl(long j3, boolean z10) {
        DSW dsw;
        qsH qsh = this.Sg.YI;
        if (qsh != null && qsh.YFl() != null) {
            dsw = this.Sg.YI.YFl().getAdShowTime();
        } else {
            dsw = new DSW();
        }
        com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl = this.Sg;
        yFl.VOe.YFl(yFl.YI.Sg(), dsw);
        HashMap hashMap = new HashMap();
        qsH qsh2 = this.Sg.YI;
        if (qsh2 != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(qsh2.NjR()));
            JSONObject YFl = this.Sg.YI.YFl((JSONObject) null);
            if (YFl != null) {
                Iterator<String> keys = YFl.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(next, YFl.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        this.Sg.VOe.YFl(new e() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            boolean YFl;

            @Override // l5.e
            public void Sg(long j10, int i10) {
                TTRewardExpressVideoActivity.this.AlY.removeMessages(300);
                if (TTRewardExpressVideoActivity.this.Sg.VOe.Sg()) {
                    TTRewardExpressVideoActivity.this.GA();
                    return;
                }
                TTRewardExpressVideoActivity.this.qO();
                TTRewardExpressVideoActivity.this.Sg.VOe.GA();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.Sg.tN) {
                    tTRewardExpressVideoActivity.YFl(false, 3);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                TTRewardExpressVideoActivity.this.Sg.YI.YFl(true);
                lG lGVar = TTRewardExpressVideoActivity.this.Sg.VOe;
                lGVar.YFl(1 ^ (lGVar.Ga() ? 1 : 0), 2);
            }

            @Override // l5.e
            public void YFl(long j10, int i10) {
                if (this.YFl) {
                    return;
                }
                this.YFl = true;
                TTRewardExpressVideoActivity.this.AlY.removeMessages(300);
                TTRewardExpressVideoActivity.this.EH();
                TTRewardExpressVideoActivity.this.Sg.VOe.YFl(j10, j10);
                TTRewardExpressVideoActivity.this.Sg.YI.Sg(true);
                if (TTRewardExpressVideoActivity.this.Sg.Sg.rkt() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTRewardExpressVideoActivity.this.Sg;
                    if (yFl2.tN) {
                        yFl2.bZ.tN().AlY();
                        YoT.Sg();
                    }
                }
                if (TTRewardExpressVideoActivity.this.Sg.Sg.rkt() == 21 && !TTRewardExpressVideoActivity.this.Sg.Sg.AlY()) {
                    TTRewardExpressVideoActivity.this.Sg.Sg.Sg(true);
                    TTRewardExpressVideoActivity.this.Sg.lu.lG();
                }
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl3 = TTRewardExpressVideoActivity.this.Sg;
                if (yFl3.tN) {
                    if (yFl3.Sg.Xns()) {
                        if (TTRewardExpressVideoActivity.this.Sg.YI.NjR() == 1) {
                            TTRewardExpressVideoActivity.this.Sg.Sco.tN();
                        }
                    } else {
                        TTRewardExpressVideoActivity.this.YFl(false, 5);
                        if (!Wwa.wN(TTRewardExpressVideoActivity.this.Sg.Sg)) {
                            TTRewardExpressVideoActivity.this.Sg.VOe.YFl("skip", true);
                        }
                    }
                } else if (yFl3.Sg.Xns()) {
                    if (TTRewardExpressVideoActivity.this.Sg.YI.NjR() == 1) {
                        TTRewardExpressVideoActivity.this.Sg.Sco.tN();
                    }
                } else {
                    if (!Wwa.wN(TTRewardExpressVideoActivity.this.Sg.Sg)) {
                        TTRewardExpressVideoActivity.this.Sg.VOe.YFl("skip", true);
                    }
                    TTRewardExpressVideoActivity.this.finish();
                }
                ((TTRewardVideoActivity) TTRewardExpressVideoActivity.this).YoT = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.qO();
            }

            @Override // l5.e
            public void YFl() {
                TTRewardExpressVideoActivity.this.AlY.removeMessages(300);
                TTRewardExpressVideoActivity.this.EH();
                TTRewardExpressVideoActivity.this.qO();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.Sg.tN) {
                    tTRewardExpressVideoActivity.YFl(false, 6);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                lG lGVar = TTRewardExpressVideoActivity.this.Sg.VOe;
                lGVar.YFl(!lGVar.Ga() ? 1 : 0, !TTRewardExpressVideoActivity.this.Sg.VOe.Ga() ? 1 : 0);
                TTRewardExpressVideoActivity.this.Sg.VOe.GA();
            }

            @Override // l5.e
            public void YFl(long j10, long j11) {
                com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl2 = TTRewardExpressVideoActivity.this.Sg;
                if (!yFl2.Bh && yFl2.VOe.Sg()) {
                    TTRewardExpressVideoActivity.this.Sg.VOe.EH();
                }
                if (TTRewardExpressVideoActivity.this.Sg.f10590nc.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.AlY.removeMessages(300);
                if (j10 != TTRewardExpressVideoActivity.this.Sg.VOe.qsH()) {
                    TTRewardExpressVideoActivity.this.EH();
                }
                if (TTRewardExpressVideoActivity.this.Sg.VOe.Sg()) {
                    TTRewardExpressVideoActivity.this.Sg.VOe.YFl(j10, j11);
                    int nc2 = com.bytedance.sdk.openadsdk.core.lG.AlY().nc(String.valueOf(TTRewardExpressVideoActivity.this.Sg.f10591vc));
                    boolean z11 = TTRewardExpressVideoActivity.this.Sg.YI.qsH() && nc2 >= 0;
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                    long j12 = j10 / 1000;
                    tTRewardExpressVideoActivity.f10538vc = (int) (tTRewardExpressVideoActivity.Sg.VOe.dXO() - j12);
                    int i10 = (int) j12;
                    if ((TTRewardExpressVideoActivity.this.Sg.aIu.get() || TTRewardExpressVideoActivity.this.Sg.eT.get()) && TTRewardExpressVideoActivity.this.Sg.VOe.Sg()) {
                        TTRewardExpressVideoActivity.this.Sg.VOe.EH();
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity2 = TTRewardExpressVideoActivity.this;
                    int i11 = tTRewardExpressVideoActivity2.f10538vc;
                    if (i11 >= 0) {
                        tTRewardExpressVideoActivity2.Sg.Sco.YFl(String.valueOf(i11), null);
                    }
                    TTRewardExpressVideoActivity.this.Sg.lu.AlY(i10);
                    TTRewardExpressVideoActivity.this.YFl(j10, j11);
                    qsH qsh3 = TTRewardExpressVideoActivity.this.Sg.YI;
                    if (qsh3 != null && qsh3.YFl() != null) {
                        TTRewardExpressVideoActivity.this.Sg.YI.YFl().setTime(String.valueOf(TTRewardExpressVideoActivity.this.f10538vc), i10, 0, false);
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity3 = TTRewardExpressVideoActivity.this;
                    if (tTRewardExpressVideoActivity3.f10538vc > 0) {
                        if (z11 && i10 >= nc2 && tTRewardExpressVideoActivity3.Sg.Sg.rkt() != 5 && TTRewardExpressVideoActivity.this.Sg.Sg.rkt() != 33) {
                            TTRewardExpressVideoActivity.this.Sg.YFl(true);
                            TTRewardExpressVideoActivity tTRewardExpressVideoActivity4 = TTRewardExpressVideoActivity.this;
                            tTRewardExpressVideoActivity4.Sg.Sco.YFl(String.valueOf(tTRewardExpressVideoActivity4.f10538vc), TTAdDislikeToast.getSkipText());
                            TTRewardExpressVideoActivity.this.Sg.Sco.wN(true);
                            return;
                        }
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity5 = TTRewardExpressVideoActivity.this;
                        tTRewardExpressVideoActivity5.Sg.Sco.YFl(String.valueOf(tTRewardExpressVideoActivity5.f10538vc), null);
                    }
                }
            }
        });
        boolean YFl2 = this.Sg.VOe.YFl(j3, z10, hashMap, this.tN);
        if (YFl2 && !z10) {
            ((TTRewardVideoActivity) this).eT = (int) (System.currentTimeMillis() / 1000);
        }
        return YFl2;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void tN() {
    }
}
