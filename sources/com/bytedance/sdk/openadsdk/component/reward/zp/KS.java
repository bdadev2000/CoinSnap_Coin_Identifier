package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;

/* loaded from: classes.dex */
public class KS {
    private TTAdDislikeToast KS;
    private TTAdDislikeDialog lMd;
    private final zp zp;

    public KS(zp zpVar) {
        this.zp = zpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        this.KS.zp(TTAdDislikeToast.getDislikeSendTip());
    }

    public void lMd() {
        TTAdDislikeToast tTAdDislikeToast = this.KS;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.KS();
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd) {
        if (this.zp.oB.isFinishing()) {
            return;
        }
        if (this.zp.yRU.get()) {
            this.KS.zp(TTAdDislikeToast.getDislikeTip());
            return;
        }
        if (this.lMd == null) {
            try {
                lMd(lmd);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.lMd;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.zp();
        }
    }

    private void lMd(final com.bytedance.sdk.openadsdk.component.reward.lMd.lMd lmd) {
        if (this.lMd == null) {
            zp zpVar = this.zp;
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(zpVar.oB, zpVar.zp);
            this.lMd = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.zp.KS.1
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                public void lMd(View view) {
                    KS.this.zp.ot.set(false);
                    if (KS.this.zp.UPs.COT) {
                        if (KS.this.zp.eWG != null) {
                            KS.this.zp.eWG.zp(0, true);
                        }
                    } else {
                        KS.this.zp.UPs.zp(lmd);
                        if (KS.this.zp.UPs.jU()) {
                            KS.this.zp.UPs.rV();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                public void zp(View view) {
                    KS.this.zp.ot.set(true);
                    if (KS.this.zp.UPs.COT) {
                        if (KS.this.zp.eWG != null) {
                            KS.this.zp.eWG.zp(8, false);
                        }
                    } else {
                        lmd.woN();
                        if (KS.this.zp.UPs.lMd()) {
                            KS.this.zp.UPs.dQp();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.zp
                public void zp(int i9, FilterWord filterWord) {
                    if (KS.this.zp.yRU.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    KS.this.zp.yRU.set(true);
                    KS.this.KS();
                }
            });
            ((FrameLayout) this.zp.oB.findViewById(R.id.content)).addView(this.lMd);
        }
        if (this.KS == null) {
            this.KS = new TTAdDislikeToast(this.zp.oB);
            ((FrameLayout) this.zp.oB.findViewById(R.id.content)).addView(this.KS);
        }
    }

    public void zp() {
        TTAdDislikeToast tTAdDislikeToast = this.KS;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.lMd();
        }
    }
}
