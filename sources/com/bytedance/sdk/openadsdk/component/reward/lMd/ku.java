package com.bytedance.sdk.openadsdk.component.reward.lMd;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.lMd.lMd;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class ku extends lMd {
    private FullInteractionStyleView dQp;

    public ku(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        super(zpVar);
    }

    private boolean YhE() {
        return woN.COT(this.lMd);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean COT() {
        return YhE();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public boolean HWF() {
        return YhE();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void QR() {
        this.HWF.jU(8);
        this.HWF.KS(8);
        if (this.lMd.cz() == 2) {
            this.ku.zp(false);
            this.ku.KS(false);
            this.ku.jU(false);
            this.HWF.HWF(8);
            return;
        }
        this.ku.zp(this.lMd.bQm());
        this.ku.KS(YhE());
        this.ku.jU(YhE());
        if (YhE()) {
            this.HWF.HWF(8);
        } else {
            this.ku.HWF();
            this.HWF.HWF(0);
        }
    }

    public FrameLayout cW() {
        FullInteractionStyleView fullInteractionStyleView = this.dQp;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public lMd.zp jU() {
        return new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.lMd.ku.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd.zp
            public void zp(boolean z8) {
                if (ku.this.dQp != null) {
                    ku.this.dQp.setIsMute(z8);
                }
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.lMd.lMd
    public void zp(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.zp.oB, this.Bj);
        this.dQp = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.vDp);
        FullInteractionStyleView fullInteractionStyleView2 = this.dQp;
        woN won = this.lMd;
        com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar = this.zp;
        fullInteractionStyleView2.zp(won, zpVar.Bj, zpVar.dT, this.KS, this.jU);
        frameLayout.addView(this.dQp.getInteractionStyleRootView());
    }

    public static boolean zp(woN won) {
        return (won.uOT() || won.CZ() == 100.0f) ? false : true;
    }
}
