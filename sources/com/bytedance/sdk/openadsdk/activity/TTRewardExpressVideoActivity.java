package com.bytedance.sdk.openadsdk.activity;

import com.bykv.vk.openvk.component.video.api.jU.KS;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.KS;
import com.bytedance.sdk.openadsdk.component.reward.zp.tG;
import com.bytedance.sdk.openadsdk.component.reward.zp.zp;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.lMd.QR;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void HWF() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean KVG() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean woN() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.video.KS.lMd
    public boolean zp(long j7, boolean z8) {
        QR qr;
        KS ks = this.lMd.eWG;
        if (ks != null && ks.zp() != null) {
            qr = this.lMd.eWG.zp().getAdShowTime();
        } else {
            qr = new QR();
        }
        zp zpVar = this.lMd;
        zpVar.UPs.zp(zpVar.eWG.lMd(), qr);
        HashMap hashMap = new HashMap();
        KS ks2 = this.lMd.eWG;
        if (ks2 != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(ks2.YW()));
            JSONObject zp = this.lMd.eWG.zp((JSONObject) null);
            if (zp != null) {
                Iterator<String> keys = zp.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(next, zp.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        this.lMd.UPs.zp(new KS.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            boolean zp;

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void lMd(long j9, int i9) {
                TTRewardExpressVideoActivity.this.jU.removeMessages(300);
                if (TTRewardExpressVideoActivity.this.lMd.UPs.lMd()) {
                    TTRewardExpressVideoActivity.this.vDp();
                    return;
                }
                TTRewardExpressVideoActivity.this.cz();
                TTRewardExpressVideoActivity.this.lMd.UPs.tG();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.lMd.lMd) {
                    tTRewardExpressVideoActivity.zp(false, 3);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                TTRewardExpressVideoActivity.this.lMd.eWG.zp(true);
                tG tGVar = TTRewardExpressVideoActivity.this.lMd.UPs;
                tGVar.zp(1 ^ (tGVar.Lij() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp(long j9, int i9) {
                if (this.zp) {
                    return;
                }
                this.zp = true;
                TTRewardExpressVideoActivity.this.jU.removeMessages(300);
                TTRewardExpressVideoActivity.this.tG();
                TTRewardExpressVideoActivity.this.lMd.eWG.lMd(true);
                if (TTRewardExpressVideoActivity.this.lMd.zp.rV() == 21 && !TTRewardExpressVideoActivity.this.lMd.zp.KS()) {
                    TTRewardExpressVideoActivity.this.lMd.zp.lMd(true);
                    TTRewardExpressVideoActivity.this.lMd.rCC.woN();
                }
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.lMd.lMd) {
                    tTRewardExpressVideoActivity.zp(false, 5);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                ((TTRewardVideoActivity) TTRewardExpressVideoActivity.this).tG = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.cz();
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp() {
                TTRewardExpressVideoActivity.this.jU.removeMessages(300);
                TTRewardExpressVideoActivity.this.tG();
                TTRewardExpressVideoActivity.this.cz();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.lMd.lMd) {
                    tTRewardExpressVideoActivity.zp(false, 6);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                tG tGVar = TTRewardExpressVideoActivity.this.lMd.UPs;
                tGVar.zp(!tGVar.Lij() ? 1 : 0, !TTRewardExpressVideoActivity.this.lMd.UPs.Lij() ? 1 : 0);
                TTRewardExpressVideoActivity.this.lMd.UPs.tG();
            }

            @Override // com.bykv.vk.openvk.component.video.api.jU.KS.zp
            public void zp(long j9, long j10) {
                zp zpVar2 = TTRewardExpressVideoActivity.this.lMd;
                if (!zpVar2.COT && zpVar2.UPs.lMd()) {
                    TTRewardExpressVideoActivity.this.lMd.UPs.dQp();
                }
                if (TTRewardExpressVideoActivity.this.lMd.FP.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.jU.removeMessages(300);
                if (j9 != TTRewardExpressVideoActivity.this.lMd.UPs.ku()) {
                    TTRewardExpressVideoActivity.this.tG();
                }
                if (TTRewardExpressVideoActivity.this.lMd.UPs.lMd()) {
                    TTRewardExpressVideoActivity.this.lMd.UPs.zp(j9, j10);
                    int dT = KVG.jU().dT(String.valueOf(TTRewardExpressVideoActivity.this.lMd.dQp));
                    boolean z9 = TTRewardExpressVideoActivity.this.lMd.eWG.ku() && dT != -1 && dT >= 0;
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                    long j11 = j9 / 1000;
                    tTRewardExpressVideoActivity.HWF = (int) (tTRewardExpressVideoActivity.lMd.UPs.Gzh() - j11);
                    int i9 = (int) j11;
                    if ((TTRewardExpressVideoActivity.this.lMd.YhE.get() || TTRewardExpressVideoActivity.this.lMd.ot.get()) && TTRewardExpressVideoActivity.this.lMd.UPs.lMd()) {
                        TTRewardExpressVideoActivity.this.lMd.UPs.dQp();
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity2 = TTRewardExpressVideoActivity.this;
                    int i10 = tTRewardExpressVideoActivity2.HWF;
                    if (i10 >= 0) {
                        tTRewardExpressVideoActivity2.lMd.Rh.zp(String.valueOf(i10), null);
                    }
                    TTRewardExpressVideoActivity.this.lMd.rCC.COT(i9);
                    TTRewardExpressVideoActivity.this.zp(j9, j10);
                    com.bytedance.sdk.openadsdk.component.reward.view.KS ks3 = TTRewardExpressVideoActivity.this.lMd.eWG;
                    if (ks3 != null && ks3.zp() != null) {
                        TTRewardExpressVideoActivity.this.lMd.eWG.zp().zp(String.valueOf(TTRewardExpressVideoActivity.this.HWF), i9, 0, false);
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity3 = TTRewardExpressVideoActivity.this;
                    if (tTRewardExpressVideoActivity3.HWF > 0) {
                        if (z9 && i9 >= dT && tTRewardExpressVideoActivity3.lMd.zp.rV() != 5 && TTRewardExpressVideoActivity.this.lMd.zp.rV() != 33) {
                            TTRewardExpressVideoActivity.this.lMd.zp(true);
                            TTRewardExpressVideoActivity tTRewardExpressVideoActivity4 = TTRewardExpressVideoActivity.this;
                            tTRewardExpressVideoActivity4.lMd.Rh.zp(String.valueOf(tTRewardExpressVideoActivity4.HWF), TTAdDislikeToast.getSkipText());
                            TTRewardExpressVideoActivity.this.lMd.Rh.COT(true);
                            return;
                        }
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity5 = TTRewardExpressVideoActivity.this;
                        tTRewardExpressVideoActivity5.lMd.Rh.zp(String.valueOf(tTRewardExpressVideoActivity5.HWF), null);
                    }
                }
            }
        });
        boolean zp2 = this.lMd.UPs.zp(j7, z8, hashMap, this.KS);
        if (zp2 && !z8) {
            ((TTRewardVideoActivity) this).vDp = (int) (System.currentTimeMillis() / 1000);
        }
        return zp2;
    }
}
