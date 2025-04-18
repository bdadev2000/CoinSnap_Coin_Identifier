package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.pDU;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public class tN {
    private com.bytedance.sdk.openadsdk.common.pDU Sg;
    private final YFl YFl;
    private TTAdDislikeToast tN;

    public tN(YFl yFl) {
        this.YFl = yFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN() {
        this.tN.show(TTAdDislikeToast.getDislikeSendTip());
    }

    public void Sg() {
        TTAdDislikeToast tTAdDislikeToast = this.tN;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        if (this.YFl.UI.isFinishing()) {
            return;
        }
        if (this.YFl.YoT.get()) {
            this.tN.show(TTAdDislikeToast.getDislikeTip());
            return;
        }
        if (this.Sg == null) {
            try {
                Sg(sg2);
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th2);
            }
        }
        com.bytedance.sdk.openadsdk.common.pDU pdu = this.Sg;
        if (pdu != null) {
            pdu.YFl();
        }
    }

    private void Sg(final com.bytedance.sdk.openadsdk.component.reward.Sg.Sg sg2) {
        if (this.Sg == null) {
            YFl yFl = this.YFl;
            com.bytedance.sdk.openadsdk.common.pDU pdu = new com.bytedance.sdk.openadsdk.common.pDU(yFl.UI, yFl.Sg);
            this.Sg = pdu;
            pdu.setCallback(new pDU.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.tN.1
                @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                public void Sg(View view) {
                    tN.this.YFl.eT.set(false);
                    if (tN.this.YFl.VOe.wN) {
                        if (tN.this.YFl.YI != null) {
                            tN.this.YFl.YI.YFl(0, true);
                        }
                    } else {
                        tN.this.YFl.VOe.YFl(sg2);
                        if (tN.this.YFl.VOe.AlY()) {
                            tN.this.YFl.VOe.pDU();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                public void YFl(View view) {
                    tN.this.YFl.eT.set(true);
                    String str = "landing_page";
                    if (!com.bytedance.sdk.openadsdk.core.model.rkt.Sg(tN.this.YFl.Sg) && !com.bytedance.sdk.openadsdk.core.model.rkt.tN(tN.this.YFl.Sg) && !com.bytedance.sdk.openadsdk.core.model.rkt.AlY(tN.this.YFl.Sg)) {
                        if (!tN.this.YFl.f10590nc.get()) {
                            str = "video_player";
                        } else if (Ne.Sg(tN.this.YFl.Sg)) {
                            str = "playable";
                        } else if (!tN.this.YFl.Sg.Sco()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    tN.this.Sg.setDislikeSource(str);
                    if (tN.this.YFl.VOe.wN) {
                        if (tN.this.YFl.YI != null) {
                            tN.this.YFl.YI.YFl(8, false);
                        }
                    } else {
                        sg2.rkt();
                        if (tN.this.YFl.VOe.Sg()) {
                            tN.this.YFl.VOe.EH();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.pDU.YFl
                public void YFl(FilterWord filterWord) {
                    if (tN.this.YFl.YoT.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    tN.this.YFl.YoT.set(true);
                    tN.this.tN();
                }
            });
            ((FrameLayout) this.YFl.UI.findViewById(R.id.content)).addView(this.Sg);
        }
        if (this.tN == null) {
            this.tN = new TTAdDislikeToast(this.YFl.UI);
            ((FrameLayout) this.YFl.UI.findViewById(R.id.content)).addView(this.tN);
        }
    }

    public void YFl() {
        TTAdDislikeToast tTAdDislikeToast = this.tN;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
